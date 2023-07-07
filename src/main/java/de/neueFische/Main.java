package de.neueFische;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(goodPassWord("0000000011"));
    }


    public static String passwLength(String password) {

        if (password.length() < 8) {
            return "Passwort nicht sicher. Passwort muss mindestens 8 Stellen haben!";
        }

        return "Passwort ist genug lang (über 8 Stellen.";
    }

    public static boolean passwContainsNumbers(String password) {

        if (password.matches("[a-zA-Z]+")) {
            return false;
        }
        return true;
    }

/*    public static boolean passwOnlyUpperCase(String password){
        if(password.matches("[0-9]+")){
            System.out.println("Nur Zahlen, daher kann nicht auf Upper-Case geprüft werden!");
            return false;
        }

        if(password.matches("[A-Z0-9]+")){
            return true;
        }
        return false;
    }
*/


 /*   public static String checkIfPasswContUpper_LowerCase(String password){
        boolean upperCase = false;
        boolean lowerCase = false;

        char[] charsOfPassw = password.toCharArray();
        for(char element : charsOfPassw){
            if(Character.isDigit(element)){
                continue;
            }
            if(Character.isUpperCase(element)){
                upperCase = true;
            }
            else if (Character.isLowerCase(element)) {
                lowerCase = true;
            }
        }
        if(upperCase && lowerCase){
            return "Groß- und Kleinbuchstaben enthalten!";
        }
        else if(upperCase){
            return "Nur Großbuchstaben enthalten!";
        }
        else if(lowerCase){
            return "Nur Kleinbuchstaben enthalten!";
        }
        return "Keine Buchstaben enthalten";
    }

  */

    public static boolean checkIfPasswContUpperAndLowerCase(String password) {
        boolean upperCase = false;
        boolean lowerCase = false;
        char[] charsOfPassw = password.toCharArray();

        for (char element : charsOfPassw) {
            if (Character.isDigit(element)) {
                continue;
            }
            if (Character.isUpperCase(element)) {
                upperCase = true;
            }
            else if(Character.isLowerCase(element)){
                lowerCase = true;
            }
        }
        if (upperCase && lowerCase) {
            return true;
        }
        return false;
    }


    public static boolean goodPassWord(String password) {
        if (password.equals("Passwort") || password.equals(("passwort"))
                || password.equals("12345678") || password.equals("23456789") ||
                password.equals("00000000") || password.equals("")) {
            return false;
        }
        return true;
    }

    public static String passwordValid(String password) {
        String sample = password;


        return "Passwort gespeichert";

    }
}
