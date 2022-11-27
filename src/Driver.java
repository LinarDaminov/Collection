import java.util.ArrayList;

public  class Driver  <T extends Transport & Competing> {
    private final String driversName;
    private String driversLicense;
    private int experience;

    private final T car;


    public Driver(String driversName, String driversLicense, int experience, T car) {
        this.driversName = driversName;
        setDriversLicense(driversLicense);
        this.experience = experience;
        this.car = car;
    }

    public Driver(String driversName, T car, ArrayList<Driver> drivers) {
        this.driversName = driversName;
        this.car = car;

    }

    public String getDriversName() {
        return driversName;
    }

    public String getDriversLicense() {
        return driversLicense;
    }


    public void setDriversLicense(String driversLicense) {
        if (driversLicense==null) {
            throw new IllegalArgumentException("Не указана категория прав");
        }
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public T getCar() {
        return car;
    }

    public void startMove() {
        System.out.println(" I am starting move");
   }
    public   void stopMove() {
        System.out.println(" i am stopping move");
    }
    public  void reFull() {
        System.out.println(" I am full my car ");
    }


    @Override
    public String toString() {
        return "Водитель: "  + driversName + ", Категория прав: " + driversLicense  +
                ", опыт вождения: " + experience ;
    }
}

