public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double sum = 0;
        if (speed >=1 && speed <=4){
            sum = speed * 221;
            return sum;
        }
        else if(speed >=5 && speed <=8){
            sum = speed *221 * 0.9;
            return sum;
        }
        else if (speed == 9){
            sum = speed * 221 * 0.8;
            return sum;
        }
        else if (speed == 10){
            sum = speed * 221 * 0.77;
            return sum;
        }
        else{
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int per_car = 0;
        per_car = (int) (productionRatePerHour(speed)/60);
        return per_car;
    }
}
