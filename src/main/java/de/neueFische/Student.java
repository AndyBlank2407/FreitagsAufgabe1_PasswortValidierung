package de.neueFische;

public class Student {

    private String name;
    private int matrikelNo;
    public String studiengang;
    public int anzahlDerStudSemester;


    public Student(){

    }

    public Student(String name, int matrikelNo, String studiengang, int anzahlDerStudSemester){
        this.name = name;
        this.matrikelNo = matrikelNo;
        this.studiengang = studiengang;
        this.anzahlDerStudSemester = anzahlDerStudSemester;
    }

    public Student(String name, String studiengang, int matrikelNo, int anzahlDerStudSemester){
        this.name = name;
        this.matrikelNo = matrikelNo;
        this.studiengang = studiengang;
        this.anzahlDerStudSemester = anzahlDerStudSemester;
    }


    public String getName(){
        return name;
    }

    public String getStudiengang(){
        return studiengang;
    }

    public int getMatrikelNo(){
        return matrikelNo;
    }

    public int getAnzahlDerStudSemester(){
        return anzahlDerStudSemester;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudiengang(String studiengang){
        this.studiengang = studiengang;
    }

    public void setMatrikelNo(int matrikelNo){
        this.matrikelNo = matrikelNo;
    }

    public void setAnzahlDerStudSemester(int anzahlDerStudSemester){
        this.anzahlDerStudSemester = anzahlDerStudSemester;
    }
}
