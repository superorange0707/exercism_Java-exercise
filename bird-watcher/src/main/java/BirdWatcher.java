
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int [] array = {0,2,5,3,7,8,4};
        return array;
    }

    public int getToday() {
        int length = birdsPerDay.length;
        if (length == 0){
            return 0;
        }
        else{
            return birdsPerDay[length-1];
        }

    }

    public void incrementTodaysCount() {
        int length = birdsPerDay.length;
        birdsPerDay[length-1] = birdsPerDay[length-1]+1;
    }

    public boolean hasDayWithoutBirds() {
        for (int count:birdsPerDay){
            if (count == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int length = birdsPerDay.length;
        if (numberOfDays <= length){
            for (int i = 0 ; i<numberOfDays; i++){
                sum = sum + birdsPerDay[i];
            }
            return sum;
        }
        else{
            for (int i = 0 ; i<length; i++){
                sum = sum + birdsPerDay[i];
            }
            return sum;
        }
    }

    public int getBusyDays() {
        int count = 0;
        int length = birdsPerDay.length;
        for(int i = 0; i < length; i++){
            if (birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
