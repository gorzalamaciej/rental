package pl.bestapp.types.response;

import pl.bestapp.dto.User;

public class UserResponse {
  private String firstName;
  private String lastName;

  public UserResponse() {
  }

  public UserResponse(User user) {
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
  }

  public UserResponse(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "UserResponse{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }
}
