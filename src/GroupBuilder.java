import java.util.Scanner;

public class GroupBuilder {
    public Group groupBuilder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter group name");
        String nameOfGroup = scanner.nextLine();
        Trainer trainer = Trainer.trainerBuilder();

        Student[] studentsArray = StudentsArrayBuilder.studentsArray();

        return new Group(nameOfGroup, trainer, studentsArray);


    }
}
