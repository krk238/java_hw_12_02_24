package binary.hw;

public class Student {
    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        name = name;
        age = age;
        grade = grade;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student Kamil = new Student("Kamil", 26, 'A');
        System.out.println(Kamil.grade);
    }
}