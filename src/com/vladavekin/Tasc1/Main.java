package com.vladavekin.Tasc1;

public class Main{

    public static void main(String[] args) {

        Pupil pupil2 = new Pupil("Vlad", "Slava");

        ClassRoom classRoom = new ClassRoom(pupil2);

        Pupil.Study(pupil2.getStudent1(), "god");
        Pupil.Study(pupil2.getStudent2(), "bad");

        Pupil.Relax(pupil2.getStudent1(), "Smog");
        Pupil.Relax(pupil2.getStudent2(), "No Smog");

        Pupil.Read(pupil2.getStudent1(), "norm");
        Pupil.Read(pupil2.getStudent2(), "god");

        Pupil.Write(pupil2.getStudent1(), "god");
        Pupil.Write(pupil2.getStudent2(), "were god");



    }

}
