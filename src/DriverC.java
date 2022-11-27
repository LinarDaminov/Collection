public class DriverC<T extends Transport> extends Driver<Truck> {
    public DriverC(String driversName, String driversLicense, int experience, Truck truck) {

        super(driversName, driversLicense, experience, truck);
    }
}
