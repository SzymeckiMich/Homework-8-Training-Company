import java.util.Scanner;

public class StudentsArrayBuilder {
    public static Student[] studentsArray(int howMuch) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[howMuch];
        for (int i = 0; i < howMuch; i++) {
            students[i]=studentBuilder();
        }
        return students;
    }
    public static Student studentBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie ucznia");
        String firstName = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String lastName = scanner.nextLine();

        return new Student(firstName, lastName);

    }
}