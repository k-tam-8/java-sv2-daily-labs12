package day02;

public class MathAlgorithms {
    public int findDiv(int numberOne, int numberTwo) {
        for (int i = numberOne; i > 0; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
