package org.packt.dissect.mvc.model.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.util.Date;

public class EmployeeForm {
    @Size(min = 2, max = 30)
    private String firstName;

    @Size(min = 2, max = 30)
    private String lastName;

    @NotNull
    @Size(min = 5, max = 100)
    private String position;

    // additional information
    @NotNull
    @Min(0) @Max(100)
    private Integer age;

    @NotNull
    @Past
    private Date birthday;

    @NotEmpty
    @Email(message =  "Must be email formatted.")
    private String email;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
