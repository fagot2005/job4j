package encapsulation;

import java.util.Date;

public class Student {
    private String firstName;
    private String secondName;
    private String groupNumber;
    private Date dateReceipt;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String grupNumber) {
        this.groupNumber = grupNumber;
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Date dateReceipt) {
        this.dateReceipt = dateReceipt;
    }
}
