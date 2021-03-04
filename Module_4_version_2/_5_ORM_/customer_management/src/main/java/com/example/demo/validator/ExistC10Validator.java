package com.example.demo.validator;

import com.example.demo.annotation.Apple;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ExistC10Validator implements ConstraintValidator<Apple, String> {
   public void initialize(Apple constraint) {
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      return false;
   }
}
