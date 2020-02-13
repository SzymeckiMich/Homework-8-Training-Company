import org.w3c.dom.ls.LSOutput;

public class Group {
    private String name;
    private Trainer trainer;
    private Student[] students;

    public Group(String name, Trainer trainer, Student[] students) {
        this.name = name;
        this.trainer = trainer;
        this.students = students;
    }

    public void showInfo() {
        System.out.println("Group name: " + this.name + "\n" +
                "Trainer name: " + trainer.getFirstName() + " " + trainer.getLastName() + "\n" +
                "Number of students: " + students.length);
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getFirstName() + " " + students[i].getLastName());
        }
        System.out.println(" ");
    }
}
