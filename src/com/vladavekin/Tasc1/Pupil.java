package com.vladavekin.Tasc1;

public class Pupil {

    private String Student1;
    private String Student2;
    private String Student3;
    private String Student4;

    public Pupil(final String student1,
                 final String student2) {
        Student1 = student1;
        Student2 = student2;
    }

    public Pupil(final String student1,
                 final String student2,
                 final String student3) {
        Student1 = student1;
        Student2 = student2;
        Student3 = student3;
    }

    public Pupil(final String student1,
                 final String student2,
                 final String student3,
                 final String student4) {
        Student1 = student1;
        Student2 = student2;
        Student3 = student3;
        Student4 = student4;
    }

    static void Study(final String student,
                      final String Study) {

        System.out.println(student + " учиться " + Study);

    }

    static void Read(final String student,
                     final String read) {

        System.out.println(student + " читает " + read);

    }

    static void Write(final String student,
                      final String write) {

        System.out.println(student + " пишит " + write);

    }

    static void Relax(final String student,
                      final String relax) {

        System.out.println(student + " одихает " + relax);

    }

    public String getStudent1() {
        return Student1;
    }

    public void setStudent1(String student1) {
        Student1 = student1;
    }

    public String getStudent2() {
        return Student2;
    }

    public void setStudent2(String student2) {
        Student2 = student2;
    }

    public String getStudent3() {
        return Student3;
    }

    public void setStudent3(String student3) {
        Student3 = student3;
    }

    public String getStudent4() {
        return Student4;
    }

    public void setStudent4(String student4) {
        Student4 = student4;
    }
}
