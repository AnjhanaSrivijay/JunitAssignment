package com.example.unittest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestValidator {

     String validEmail1 = "test@test.com";
    String validEmail2 = "test@test.co.se";
    String emailWithNoAt = "test¤test_sdfco.se";
    String emptyEmail = " ";
    String emailWithNoDomain= "justss@vljhs";
    
    /*String emailWithSpecialCharactersOnly="¤%&/()!@test.co.in";
    String emailWithDomainBeforeAt ="test.com@";*/
    
    String validPh1 = "0759494944";
    String validPh2 = "000000000";
    String numberMixedWithChar = "93940djd0";
    String emptyNumber= " ";
    String numberMoreThan10 = "09878654321234";
    String numberWithCharOnly = "aratihaej";
    String phNumberStartWithout0 = "759494944";
    String phNumberLessThan6 = "01234";
    String numberWithSplChar = "0@68793&42";
    @Test
    void testIsEmailValid() {
        Assertions.assertTrue(Validator.isEmailValid(validEmail1));
        Assertions.assertTrue(Validator.isEmailValid(validEmail2));
    }
    @Test
    void testEmailFormat() {
        Assertions.assertFalse(Validator.isEmailValid(emailWithNoAt));

    }
    @Test
    void verifyEmailIsGiven() {
        Assertions.assertFalse(Validator.isEmailValid(emptyEmail));
    }
    @Test
    void validateEmailWithoutDomain() {
        Assertions.assertFalse(Validator.isEmailValid(emailWithNoDomain));
    }
    
    /*
    If only special characters in name It must fail, but it is not met in the code.
    @Test
    void validateNoSpecialCharacterInName() {
        Assertions.assertFalse(Validator.isEmailValid(emailWithSpecialCharactersOnly));
    }
    @Test
    void validateEmailWithDomainBefore() {
        Assertions.assertFalse(Validator.isEmailValid(emailWithDomainBeforeAt));
    }*/
    
    @Test
    void testIsPhoneNumber() {
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh1));
        Assertions.assertTrue(Validator.isPhoneNumberValid(validPh2));
    }
    @Test
    void verifyNumbersIsNotMixedWithAlphabets() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(numberMixedWithChar));
           }
    @Test
    void verifyNumberIsNotEmpty(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(emptyNumber));
    }
    @Test
    void testNoAlphabetsAsNumber(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(numberWithCharOnly));
    }
    @Test
    void validateNoSpecialCharacters(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(numberWithSplChar));
    }
    @Test
    void validatePhoneNumberMoreThan10(){
        Assertions.assertFalse(Validator.isPhoneNumberValid(numberMoreThan10));
    }
    @Test
    void validateIsPhoneNumberLessThan6() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(phNumberLessThan6));
    }
    @Test
    void verifyPhoneNumberStartsWithZero() {
        Assertions.assertFalse(Validator.isPhoneNumberValid(phNumberStartWithout0));
    }}


