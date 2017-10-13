package pl.bestapp.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public interface BaseDao<T extends Serializable> {

  Session getCurrentSession();

  Criteria createCriteria();

  T saveOrUpdate(T dto);

  void deleteAll();

  void delete(T dto);

  List<T> findAll();

  void flush();
}
