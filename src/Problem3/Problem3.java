package Problem3;

import java.math.BigInteger;

public class Problem3 {

    public static void generateFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.println(a);

        for (int i = 1; i < n; i++) {
            System.out.println(b);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        generateFibonacci(100);
    }
}
