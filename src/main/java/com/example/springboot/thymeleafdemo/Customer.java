package com.example.springboot.thymeleafdemo;

import com.example.springboot.thymeleafdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

  private String firstName;

  @NotNull(message = "is required")
  @Size(min = 1, message = "is required")
  private String lastName;

  @NotNull(message = "is required")
  @Min(value = 0, message = "must be greater than or equal to zero")
  @Max(value = 10, message = "must be less than or equal to 10")
  private Integer freePasses;

  @NotNull(message = "is required")
  @Pattern(regexp = "^[0-9]{4,5}", message = "must be 4 or 5 digits")
  private String postalCode;

  @CourseCode
  private String courseCode;

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Integer getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(Integer freePasses) {
    this.freePasses = freePasses;
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
}
