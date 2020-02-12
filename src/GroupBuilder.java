import java.util.Scanner;

public class GroupBuilder {
    public Group groupBuilder() {
        Trainer trainer = new Trainer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwę grupy");
        String nameOfGroup = scanner.nextLine();
        System.out.println("Podaj imię trenera");
        trainer.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko trenera");
        trainer.setLastName(scanner.nextLine());
        System.out.println("Podaj liczbę uczniów w grupie");
        int howMuch = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[howMuch];

        Student[] studentsArray = StudentsArrayBuilder.studentsArray(howMuch);

        return new Group(nameOfGroup, trainer, studentsArray);


    }
}
