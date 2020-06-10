package encapsulation;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Vitaly Lashchenko");
        license.setModel("Toyota");
        license.setCode("345-45 YH");
        license.setCriated(new Date());
        System.out.println(license.getOwner() + " have a car " + license.getModel()
                + " numder " + license.getCode());
    }
}
