import org.w3c.dom.ls.LSOutput;

public class Group {
    private String name;
    private Trainer trainer;
    private Student[] students;

    public Group() {
    }


    public Group(String name, Trainer trainer, Student[] students) {
        this.name = name;
        this.trainer = trainer;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void showInfo() {
        System.out.println("Group name: " + this.name + "\n" +
                "Trainer name: " + trainer.getFirstName() + " " + trainer.getLastName() + "\n" +
                "Number of students: " + students.length + "\n");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getFirstName() + " " + students[i].getLastName());
        }
    }
}
