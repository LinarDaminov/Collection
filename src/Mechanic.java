import java.util.ArrayList;

public class Mechanic <T extends Transport>{
    private String firstNameAndLastName;

    private String companyName;



    public Mechanic(String firstNameAndLastName, String companyName) {
        this.firstNameAndLastName = firstNameAndLastName;
        this.companyName = companyName;
    }

    public boolean  checkTO(T t) {
        return  t.service();
    }

    public void fixCar(T t) {
        t.fix();
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Механик: " + firstNameAndLastName + ", Название компании: " + companyName;
    }
}

