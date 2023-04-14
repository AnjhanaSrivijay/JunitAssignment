package com.example.unittest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestValidator {

    String validEmail1 = "test@test.com";
    String validEmail2 = "test@test.co.se";
    String inValidEmail = "test¤test_sdfco.se";
    String inValidEmail1 = " ";
    String inValidEmail2="justss@vljhs";
    String validPh1 = "0759494944";
    String validPh2 = "000000000";
    String invalidPh = "93940djd0";
    String invalidPh1= " ";
    String invalidPh2 = "09878654321234";
    String invalidPh3 = "06789245ej";
    String phNumberStartWithout0 = "759494944";
    String phNumberLessThan6 = "01234";
    @Test
    void testIsEmailValid() {
        Assertions.assertTrue(Validator.isEmailValid(validEmail1));
        Assertions.assertTrue(Validator.isEmailValid(validEmail2));
    }
    @Test
    void testInValidEmail() {
        Assertions.assertFalse(Validator.isEmailValid(inValidEmail));
        Assertions.assertFalse(Validator.isEmailValid(inValidEmail1));
        Assertions.assertFalse(Validator.isEmailValid(inValidEmail2));
    }
    @Test
    void testIsPhoneNumber() {
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh1));
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh2));
    }
    @Test
    void testInValidPhoneNumber() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(invalidPh));
        Assertions.assertFalse(Validator.isPhoneNumberValid(invalidPh1));
    }
    @Test
    void verifyOnlyNumbers(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(invalidPh3));
    }
    @Test
    void validatePhoneNumberMoreThan10(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(invalidPh2));
    }
    @Test
    void validateIsPhoneNumberLessThan6() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(phNumberLessThan6));
    }
    @Test
    void validatePhoneNumberStartsWithZero() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(phNumberStartWithout0));
    }
}


