package Cor_4;

import java.util.*;

public class ISPRIME {

    public static boolean isPrime(int nr) {
        int nr_div = 0;
        for (int i = 1; i <= nr / 2; i++) {
            if (nr % i == 0)
                nr_div++;
        }
        if (nr_div == 2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(isPrime(n));
        scan.close();
    }
}