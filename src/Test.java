public class Test {
    public static void main(String[] args) {
        GroupBuilder builder = new GroupBuilder();

        Group grupa1 = builder.groupBuilder();
        Group grupa2 = builder.groupBuilder();

        grupa1.showInfo();
        grupa2.showInfo();
    }
}
