package de.neueFische.model;

import java.util.Objects;

public class Student {

    protected String name;
    protected int matrikelNo;
    protected String studiengang;
    protected int anzahlDerStudSemester;


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

    @Override
    public String toString(){
        return "{Student"+
                "Name: "+name+
                "Matrikelnummer: "+matrikelNo+
                "Studiengang: "+studiengang+
                "Anzahl der stud. Semester: "+anzahlDerStudSemester+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelNo == student.matrikelNo && anzahlDerStudSemester == student.anzahlDerStudSemester && Objects.equals(name, student.name) && Objects.equals(studiengang, student.studiengang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, matrikelNo, studiengang, anzahlDerStudSemester);
    }
}
