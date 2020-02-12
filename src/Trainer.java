import java.util.Scanner;

public class Trainer extends Person {

    public Trainer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public static Trainer trainerBuilder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter trainer's first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter trainer's last name");
        String lastName = scanner.nextLine();
        Trainer trainer = new Trainer(firstName, lastName);

        return trainer;
    }


}
