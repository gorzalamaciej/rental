package pl.bestapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bestapp.dao.UserDao;
import pl.bestapp.service.UserService;
import pl.bestapp.types.response.UserResponse;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  @Transactional
  public List<UserResponse> findByFirstName(String firstName) {
    return userDao.findByFirstName(firstName).stream().map(UserResponse::new).collect(Collectors.toList());
  }
}
