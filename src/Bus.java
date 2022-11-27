public  class Bus extends Transport implements Competing {
    private final Capacity capacity;
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public enum Capacity {
        ESPECIALLY_SMALL(0,10), SMALL (10,25), MEDIUM(40,50),
        LARGE (60,80), VERY_LARGE(100,120);
        private int minPlace;
        private int maxPlace;

         Capacity(int minPlace, int maxPlace){
             this.minPlace = minPlace;
             this.maxPlace = maxPlace;
        }

        public int getMinPlace() {
            return minPlace;
        }

        public void setMinPlace(int minPlace) {
            this.minPlace = minPlace;
        }

        public int getMaxPlace() {
            return maxPlace;
        }

        public void setMaxPlace(int maxPlace) {
            this.maxPlace = maxPlace;
        }
    }
    public void checkType() {
        if (this.capacity!=null) { System.out.println("Тип авто по вместимости: " + this.capacity);
        } else {
            System.out.println("Недостаточно информации");
        }
    }




    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    @Override
    public void fix() {
        System.out.println("Машина" + getBrand() + getModel() + " починена!");
    }

    @Override
    public String pitStop() {

        return "Пит стоп";
    }
    @Override
    public double bestTime() {
        System.out.println();
        return 1.05;
    }
    @Override
    public double maxSpeed() {
        return 150;
    }

    public boolean service(){
        System.out.println("Автобус" + getBrand() + getModel() + "в диагностике не нуждается");
        return true;
    }



}
