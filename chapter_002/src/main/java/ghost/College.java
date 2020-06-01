package ghost;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = (Student) freshman;
        Object object = (Object) student;
    }
}
