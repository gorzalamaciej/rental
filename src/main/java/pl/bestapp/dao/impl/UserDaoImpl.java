package pl.bestapp.dao.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pl.bestapp.dao.UserDao;
import pl.bestapp.dto.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

  public UserDaoImpl() {
    super(User.class);
  }

  @Override
  @Transactional
  @SuppressWarnings("unchecked")
  public List<User> findByFirstName(String firstName) {
    return createCriteria()
      .add(Restrictions.eq(User.COL_FIRST_NAME, firstName))
      .list();
  }
}
