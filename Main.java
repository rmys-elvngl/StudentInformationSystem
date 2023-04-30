package main;
public class Main {
    public static void main(String[] args) {

        // Teacher objects
        Teacher t1 = new Teacher("Albert Einstein", "101", "Physics");
        Teacher t2 = new Teacher("Marie Curie", "202", "Chemistry");
        Teacher t3 = new Teacher("Ada Lovelace", "303", "Computer Science");

        // Course objects
        Course c1 = new Course("Physics", "PHY101", "PHY", t1);
        Course c2 = new Course("Chemistry", "CHM101", "CHM", t2);
        Course c3 = new Course("Introduction to Programming", "CS101", "CS", t3);

        // Student objects
        Student s1 = new Student("Alice", "1", new Course[]{c1, c2, c3});
        Student s2 = new Student("Bob", "2", new Course[]{c1, c2, c3});

        // Add exam notes for students
        s1.addBulkExamNotes(new int[][]{{70, 80, 90}, {80, 90, 100}, {100, 90, 80}});
        s2.addBulkExamNotes(new int[][]{{90, 70, 80}, {60, 80, 70}, {80, 70, 90}});

        // Add verbal exam notes for courses
        c1.setVerbalNotePercentage(0.2);
        c2.setVerbalNotePercentage(0.1);
        c3.setVerbalNotePercentage(0.3);
        c1.addVerbalNoteForStudent(s1, 85);
        c1.addVerbalNoteForStudent(s2, 90);
        c2.addVerbalNoteForStudent(s1, 75);
        c2.addVerbalNoteForStudent(s2, 60);
        c3.addVerbalNoteForStudent(s1, 95);
        c3.addVerbalNoteForStudent(s2, 70);

        // Print exam notes and averages for students
        s1.printExamNotes();
        s1.printAverages();
        s2.printExamNotes();
        s2.printAverages();
    }
}
