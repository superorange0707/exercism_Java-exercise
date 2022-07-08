public class Hamming {
    private int count = 0;
    public Hamming(String leftStrand, String rightStrand) {
        int length1 = leftStrand.length();
        int length2 = rightStrand.length();
        if (leftStrand.isEmpty() && length2 != 0){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if(rightStrand.isEmpty() && length1 != 0){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if(length1 != length2 && length1 != 0 && length2 != 0){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        else{
            for (int i = 0; i<length1; i++){
                char ch1 = leftStrand.charAt(i);
                char ch2 = rightStrand.charAt(i);
                if (ch1 != ch2){
                    count++;
                }
            }
        }
    }

    public int getHammingDistance() {
        return count;
    }
}
