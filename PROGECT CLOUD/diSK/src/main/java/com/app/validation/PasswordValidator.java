/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.validation;

/**
 *
 * @author Root
 */
import com.app.form.PasswordForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Root
 */
@Component
public class PasswordValidator implements Validator{
     // The classes are supported by this validator.
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == PasswordForm.class;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PasswordForm passsForm = (PasswordForm) target;
    
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.passForm.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.passForm.confirmPassword");
        
        
         if (!errors.hasErrors()) {
            if (!passsForm.getConfirmPassword().equals(passsForm.getPassword())) {
              //  errors.rejectValue("confirmPassword", "Match.passForm.confirmPassword");
            }
        }
    }
    
    
}


