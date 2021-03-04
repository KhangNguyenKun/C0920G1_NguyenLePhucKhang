package com.example.demo.model;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.lang.annotation.Annotation;
import java.lang.annotation.Target;


@Component
@Entity
public class User implements Validator, Annotation {


    @Id
    private String firstName;
    private String lastName;

    @NumberFormat
    private String phoneNumber;
    @Min(18)
    private String age;
    @Email
    @NotEmpty
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, String age, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user=(User) target;
        if (user.phoneNumber.length()<9 || user.phoneNumber.length()>11){
            errors.rejectValue("phoneNumber","sizePhoneNumber.combined");
        }
        if(!user.phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber","startPhoneNumber.combined");
        }
        if (!user.phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber","PhoneNumber.combined");
        }
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
