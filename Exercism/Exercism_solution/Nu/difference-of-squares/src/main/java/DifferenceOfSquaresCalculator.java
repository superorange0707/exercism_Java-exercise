class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 0 ; i<=input; i++){
            sum = sum + i;
        }
        int square_sum = sum * sum;
        return square_sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 0; i<= input; i++){
            sum =sum + (i*i);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        int sum1 = computeSquareOfSumTo(input);
        int sum2 = computeSumOfSquaresTo(input);
        int difference = sum1 - sum2;
        return difference;
    }

}
