import java.util.*;

public class CashRegistry {
    private final static Random RANDOM = new Random();
    private final List<Queue<String>> registries;


    public CashRegistry(List<Queue<String>> registries) {
        this.registries = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            this.registries.add(new LinkedList<>());
            
        }
    }

    public void addPerson(String name) {
        if (allRegistriesFull()) {
            System.out.println("Зовем Галю");
        } else {
            Queue<String> minQueue = selectMinQueue();
            minQueue.add(name);
        }
    }
    private Queue<String> selectMinQueue() {
        int min = Integer.MAX_VALUE;
        Queue<String> target = null;
        for (Queue<String> queue : registries) {
            if (queue.size() < min) {
                min = queue.size();
                target = queue;
            }
        }
        return target;
    }
    private boolean allRegistriesFull() {
        for (Queue<String> queue : registries) {
            if (queue.size() < 5) {
                return false;
            }
        }
        return true;
    }

}
