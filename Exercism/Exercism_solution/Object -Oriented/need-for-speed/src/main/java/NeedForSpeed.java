class NeedForSpeed {
    private int distance = 0;
    private int battery_value = 100;
    public int speed;
    public int battery;
    public NeedForSpeed(int speed, int battery){
        this.speed = speed;
        this.battery = battery;
    }

    public boolean batteryDrained() {
        if (battery_value < battery){
            return true;
        }
        else{
            return false;
        }
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery_value >= battery){
            battery_value = battery_value - battery;
            distance = distance + speed;
        }
    }

    public static NeedForSpeed nitro() {
        var nitro = new NeedForSpeed(50,4);
        return nitro;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        var race = new RaceTrack(distance);
        int times = 100/car.battery;
        int distance = times * car.speed;
        if (distance >= race.distance){
            return true;
        }
        else{
            return false;
        }
    }
}
