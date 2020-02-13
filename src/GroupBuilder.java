import java.util.Scanner;

public class GroupBuilder {
    public Group buildGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter group name");
        String nameOfGroup = scanner.nextLine();
        Trainer trainer = Trainer.buildTrainer();

        Student[] studentsArray = StudentsArrayBuilder.studentsArray();

        return new Group(nameOfGroup, trainer, studentsArray);


    }
}
