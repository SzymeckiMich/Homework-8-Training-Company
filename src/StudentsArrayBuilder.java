import java.util.Scanner;

public class StudentsArrayBuilder {
    public static Student[] studentsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int howMuch = scanner.nextInt();
        Student[] students = new Student[howMuch];
        for (int i = 0; i < howMuch; i++) {
            students[i] = studentBuilder(i);
        }
        return students;
    }

    public static Student studentBuilder(int which) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name of " + (which + 1) + " student");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name of " + (which + 1) + " student");
        String lastName = scanner.nextLine();

        return new Student(firstName, lastName);

    }
}