package pl.bestapp.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.bestapp.dao.BaseDao;
import pl.bestapp.dto.BaseDto;

public class BaseDaoImpl<T extends BaseDto> implements BaseDao<T> {

  private final Class<T> dtoClass;

  @Autowired
  private SessionFactory sessionFactory;

  protected BaseDaoImpl(Class<T> dtoClass) {
    this.dtoClass = dtoClass;
  }

  public Session getCurrentSession() {
    return sessionFactory.getCurrentSession();
  }

  @Transactional
  public Criteria createCriteria() {
    return getCurrentSession().createCriteria(dtoClass);
  }

  @Transactional
  public T saveOrUpdate(T dto) {
    getCurrentSession().saveOrUpdate(dto);
    return dto;
  }

  @Transactional
  @SuppressWarnings("unchecked")
  public void deleteAll() {
    List<BaseDto> dtoList = createCriteria().list();

    for (BaseDto dto : dtoList) {
      getCurrentSession().delete(dto);
    }
  }

  @Transactional
  public void delete(T dto) {
    getCurrentSession().delete(dto);
  }

  @Transactional
  @SuppressWarnings("unchecked")
  public List<T> findAll() {
    return createCriteria().list();
  }

  @Transactional
  public void flush() {
    getCurrentSession().flush();
  }
}

