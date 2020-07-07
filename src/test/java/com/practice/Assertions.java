package com.practice;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assertions {

    @Test
    public void softAssert(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "AB", "BA"));
        Predicate<String> stringPredicate = p -> p.startsWith("A");
        list.removeIf(stringPredicate);
        System.out.println("stringPredicate = " + list);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("a", "a");
        softAssert.assertEquals(2,2);
        softAssert.assertAll();
    }
    //String phoneNumber = "(213)123-4567";
    @Test
    public static boolean isValid (String phoneNumber){
        boolean isValid = true;
        for (int i = 0; i < phoneNumber.length() - 1; i++) {
            if (phoneNumber.startsWith("(")&&phoneNumber.substring(4,5).equals(")")
                    &&phoneNumber.substring(8,9).equals("-")&&phoneNumber.length()==13){
                return true;
            }else return false;
        }
        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(213)123-4167"));
    }
}
