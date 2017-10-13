package pl.bestapp.service;

import java.util.List;
import pl.bestapp.types.response.UserResponse;

public interface UserService {
  List<UserResponse> findByFirstName(String firstName);
}
