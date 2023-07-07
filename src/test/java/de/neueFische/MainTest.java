package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void passwLengthChecked_With7Chars(){
        //given
        String password = "kkkkkkk";
        String solution = "Passwort nicht sicher. Passwort muss mindestens 8 Stellen haben!";

        //when
        String actual = Main.passwLength(password);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void passwLengthChecked_With8Chars(){
        //given
        String password = "kkkkkkkk";
        String solution ="Passwort ist genug lang (über 8 Stellen.";

        //when
        String actual = Main.passwLength(password);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void passwContNumbersChecked_WithNumbersAndLowerCase(){
        //given
        String password = "k6k";
        boolean solution = true;

        //when
        boolean actual = Main.passwContainsNumbers(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void passwContNumbersChecked_WithNumbersAndUpperCase(){
        //given
        String password = "K6K";
        boolean solution = true;

        //when
        boolean actual = Main.passwContainsNumbers(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void passwContNumbersChecked_WithNoNumbersAndLowerCase(){
        //given
        String password = "kkk";
        boolean solution = false;

        //when
        boolean actual = Main.passwContainsNumbers(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void passwContNumbersChecked_WithNoNumbersAndUpperCase(){
        //given
        String password = "KKK";
        boolean solution = false;

        //when
        boolean actual = Main.passwContainsNumbers(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithUpperCaseAndNoNumbers(){
        //given
        String password = "JUNITTESTING";
        boolean solution = false;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithUpperCaseAndNumbers(){
        //given
        String password = "JUNITTESTI123NG";
        boolean solution = false;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithLowerCaseAndNoNumbers(){
        //given
        String password = "junittesting";
        boolean solution = false;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithLowerCaseAndNumbers(){
        //given
        String password = "junittest123ing";
        boolean solution = false;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithUpperAndLowerCaseAndNoNumbers(){
        //given
        String password = "JUNITTestING";
        boolean solution = true;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void checkIfPwContUpperAndLowerCaseChecked_WithUpperAndLowerCaseNoNumbers(){
        //given
        String password = "JUNITTest123ING";
        boolean solution = true;

        //when
        boolean actual = Main.checkIfPasswContUpperAndLowerCase(password);

        //then
        assertEquals(solution, actual);
    }






}