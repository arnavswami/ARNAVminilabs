package com.arnav.minilabs;

public class Student {

    String name; //Name of the student

    public Student(){
        name = "Student NO NAME";
    }
    public Student(String n) {
        name = n;
    }

    public Boolean registerforclass(String className)
    {

        System.out.println("Registering " + name + " for " + className);
        return Boolean.TRUE;

    }
    public Boolean getParentApproval() {

        return Boolean.TRUE;
    }
    public static void main(String[] args) {
        Student Arnav = new HSStudent("Arnav", 12);
        Student S2 = new HSStudent();
        Student S3 = new Student();
        Student Shiven = new MSStudent("Shiven", 6);
        Student Papa = new Student("Papa");
        Student Humans = new Student("Humans");
        Arnav.registerforclass("Calculus");
        Shiven.registerforclass("Algebra");
        Papa.registerforclass("CS");
        Humans.registerforclass("Playtime");
        S2.registerforclass("ENGLISH");
    }

}



