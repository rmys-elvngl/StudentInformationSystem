package main;

public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    public void isPass() {
        if (this.average > 55) {
            System.out.println("Sınıfı geçti.");
        } else {
            System.out.println("Sınıfta kaldı.");
        }
    }

    public void calcAverage() {
        this.average = (course1.note * (1 - course1.verbalPercentage) + course1.verbalPercentage * 100) / 3.0 +
                        (course2.note * (1 - course2.verbalPercentage) + course2.verbalPercentage * 100) / 3.0 +
                        (course3.note * (1 - course3.verbalPercentage) + course3.verbalPercentage * 100) / 3.0;
        System.out.println(this.name + " adlı öğrencinin not ortalaması: " + this.average);
        isPass();
    }

    public void printNote() {
        System.out.println("====================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(this.course1.name + " Notu : " + this.course1.note);
        System.out.println(this.course2.name + " Notu : " + this.course2.note);
       
}}