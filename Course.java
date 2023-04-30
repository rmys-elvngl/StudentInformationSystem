package main;

public class Course {
    String name;
    String code;
    String prefix;
    double note;
    Teacher teacher;
    double verbalPercentage; // sözlü notunun ortalamaya etkisi yüzdesi

    public Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.verbalPercentage = verbalPercentage;
    }

    public void addTeacher(Teacher teacher) {
        if (this.teacher == null) {
            this.teacher = teacher;
            System.out.println("Öğretmen eklendi: " + teacher.name);
        } else {
            System.out.println("Bu dersin zaten bir öğretmeni var.");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin öğretmeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine atanmış öğretmen yok.");
        }
    }
}

