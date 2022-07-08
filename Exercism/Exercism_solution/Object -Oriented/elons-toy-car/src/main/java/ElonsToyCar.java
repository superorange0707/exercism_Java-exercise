public class ElonsToyCar {
    public int distance = 0;
    public int battery =100;
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        String string1 = "";
        string1 = "Driven " + distance + " meters";
        return string1;
    }

    public String batteryDisplay() {
        String string1 = "";
        if (battery == 0){
            string1 = "Battery empty";
        }
        else{
            string1 = "Battery at " + battery + "%";
        }
        return string1;
    }

    public void drive() {
        if (battery > 0){
            distance = distance + 20;
            battery = battery - 1;
        }
    }
}
