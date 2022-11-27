
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "2170", 1.5, Car.bodyType.СЕДАН);
        lada.setDrivers( new DriverB<Car>("Петров Петр Петрович", "B", 10, lada));
        lada.addMechanic(new Mechanic<Transport>("Петр Петров","First"));
        lada.addSponsors(new Sponsor<Transport>("Генадий Букин", 155000));

        Car toyota = new Car("Toyota", "corolla", 1.8, Car.bodyType.КУПЕ);
        Car bmw = new Car("bmw", "x5", 2.0, Car.bodyType.МИНИВЕН);
        Car kia = new Car("kia", "rio", 1.8, Car.bodyType.СЕДАН);

        Truck daff = new Truck("Daff", "550", 3.2, Truck.LoadCapacity.N1);
        daff.setDrivers(new DriverC<Truck>("Дмитриев Дмитрий Дмитриевич", "C", 20, daff));
        daff.addMechanic(new Mechanic<>("Сидр Багамин", "РаструбМаш"));
        daff.addSponsors(new Sponsor<Transport>("Герта", 2540000));

        Truck maz = new Truck("maz", "650", 2.9, Truck.LoadCapacity.N2);
        Truck dfm = new Truck("dongFeng", "Captain", 3.0, Truck.LoadCapacity.N3);
        Truck valday = new Truck("valday", "next", 2.6, Truck.LoadCapacity.N2);

        Bus paz = new Bus("paz", "251", 2.6, Bus.Capacity.SMALL);
        paz.setDrivers(new DriverD("Иванов Иван Иванович", "D", 15, paz));
        paz.addMechanic(new Mechanic<>("Владимир Пурнин", "БельМаш"));
        paz.addSponsors(new Sponsor<>("Игорь Рублев", 5635544));

        Bus folAz = new Bus("golAz", "5291", 3.8, Bus.Capacity.MEDIUM);
        Bus liAz = new Bus("liaz", "254", 3.3, Bus.Capacity.VERY_LARGE);
        Bus nefAz = new Bus("nefAz", "657", 4.5, Bus.Capacity.LARGE);

        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(toyota);
        transports.add(lada);
        transports.add(bmw);
        transports.add(kia);
        transports.add(daff);
        transports.add(maz);
        transports.add(dfm);
        transports.add(valday);
        transports.add(paz);
        transports.add(folAz);
        transports.add(liAz);
        transports.add(nefAz);

        printInfo(lada);
        printInfo(daff);
        printInfo(paz);

        Queue<Transport> queue = new LinkedList<>();
        queue.add(lada);
        queue.add(daff);
        queue.add(toyota);
        queue.add(daff);




    }

    private static void printInfo(Transport transports)
    {
        System.out.println("Автомобиль:" + transports.getBrand() + transports.getModel());
        System.out.println("Водитель:" + transports.getDrivers() + "," +  "Механик: " + transports.getMechanics() +","+
                "Спонсор " + transports.getSponsors() );

    }

       }

