import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> serviceQueue = new LinkedList<>();

    public void addCar(Car car ) {
        serviceQueue.add(car);
    }

    public void addTruck(Truck truck) {
        serviceQueue.add(truck);

    }

    public void service() {
        Transport next = serviceQueue.poll();
        if (next != null) {
            System.out.println("Servicing" + next.getModel() + " " + next.getBrand() );
        }
    }

}
