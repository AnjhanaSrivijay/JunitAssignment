package com.example.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestValidator {

    String validEmail1 = "test@test.com";
    String validEmail2 = "test@test.co.se";
    String inValidEmail = "test¤test_sdfco.se";

    String validPh1 = "0759494944";
    String validPh2 = "000000000";
    String invalidPh = "93940djd0";

    String phNumberStartWithout0 = "759494944";

    String phNumberLessThan6 = "01234";


    @Test
    void testIsEmailValid1() {
        Assertions.assertTrue(Validator.isEmailValid(validEmail1));
      
    }
    
    @Test
    void testIsEmailValid2() {
        Assertions.assertTrue(Validator.isEmailValid(validEmail2));
    }

    @Test
    void testInValidEmail() {
        Assertions.assertFalse(Validator.isEmailValid(inValidEmail));
    }

    @Test
    void testIsPhoneNumber1() {
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh1));
    }
    @Test
    void testIsPhoneNumber2() {
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh2));
    }

    @Test
    void testInValidPhoneNumber() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(invalidPh));
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
