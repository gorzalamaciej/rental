package pl.bestapp.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bestapp.service.UserService;
import pl.bestapp.types.request.UserRequest;
import pl.bestapp.types.response.UserResponse;

@Controller
@RequestMapping(value = "/user")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping("/getByFirstName")
  public
  @ResponseBody
  List<UserResponse> getByFirstName(@RequestBody UserRequest request) {
    logger.info("Request: {}", request);
    return userService.findByFirstName(request.getFirstName());
  }


}
