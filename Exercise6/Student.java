package Cor_6;

public class Student {
    String name_s = "";
    int points = 0;
    int p = 0;
    int[] array_marks = new int[100];

    public Student(String name, int total_points) {
        name_s = name;
        points = total_points;

    }

    public String getName() {
        return name_s;
    }

    public void addExam(int mark) {
        array_marks[p] = mark;
        points += mark;
        p++;
    }

    public int getTotal() {
        return points;
    }

    public int getMeanMark() {
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum += array_marks[i];
        }
        return sum / p;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Marcel", 0);
        System.out.println(s1.getName());
        s1.addExam(10);
        s1.addExam(7);
        s1.addExam(9);
        s1.addExam(10);
        System.out.println(s1.getTotal());
        System.out.println(s1.getMeanMark());
    }
}