package pl.bestapp.dao;

import java.util.List;
import pl.bestapp.dto.User;

public interface UserDao extends BaseDao<User> {
  List<User> findByFirstName(String firstName);
}
