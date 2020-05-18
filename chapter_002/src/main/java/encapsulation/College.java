package encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Vitaly");
        student.setSecondName("Lashchenko");
        student.setGroupNumber("45-B");
        student.setDateReceipt(new Date());
        System.out.println(student.getFirstName() + " " + student.getSecondName()
                + ", group of " + student.getGroupNumber() + ", receipt of "
                + student.getDateReceipt());
    }
}
