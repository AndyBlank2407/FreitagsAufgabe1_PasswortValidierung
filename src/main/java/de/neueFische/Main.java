package de.neueFische;


import de.neueFische.model.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(passwordValid("12345678"));

//Aufgabe mit Getter und Setter (Objektorientierung, 10.07.23)

        Student studX = new Student();


        studX.setName("Johnny Knoxville");
        studX.setAnzahlDerStudSemester(3);
        studX.setMatrikelNo(23454545);
        studX.setStudiengang("Angewandte Informatik");



        Student studY = new Student("Josef Zimmermann", "Umwelttechnik", 34353, 5);

        System.out.println(studX);//in der Prinln-Methode ist definiert, dass sie "toString" aufruft...
        // darum ruft "println" die überschriebene "toString-Methode" automatisch auf.

    }



//Ende der Aufgabe mit Getter und Setter (Objektorientierung, 10.07.23)


    public static boolean passwLength(String password) {

        if (password.length() < 8) {
            System.out.println("Passwort ist genug lang (über 8 Stellen).");
            return false;

        }

        System.out.println("Passwort ist genug lang (über 8 Stellen.");
        return true;
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

    public static boolean passwordValid(String password) {
        String sample = password;
        if(passwLength(password) == true && passwContainsNumbers(password) == true &&
                checkIfPasswContUpperAndLowerCase(password) == true && goodPassWord(password) && true){
            System.out.println("Passwort gespeichert");
            return true;
        }



        System.out.println("Passwort nicht valide");
        return false;

    }
}
