public class Test {
    public static void main(String[] args) {
        GroupBuilder builder = new GroupBuilder();

        Group grupa1 = builder.buildGroup();
        Group grupa2 = builder.buildGroup();

        grupa1.showInfo();
        grupa2.showInfo();
    }
}
