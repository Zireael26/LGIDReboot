import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Interest is: " + simpleInterest());
//        primeCheckBasic(43);
//        primeCheckBetter(43);
//        allPrimesTillNumBasic(43);
//        System.out.println(reverseNumber(97543));
//        System.out.println("GCD of 24, 60 is: " + gcd(24, 60));
//        gcdRecurvise(18, 62);
//        System.out.println(nthFibBasic(10));
        fibUptoNBasic(500);
    }

    private static double simpleInterest() {
        int principal = 1000;
        double rate = 6.5;
        int time = 2;
        double simInter = principal * rate * time / 100;

        return simInter;
    }

    private static void primeCheckBasic(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime!");
                return;
            }
        }

        System.out.println("Number is prime!");
    }

    private static void primeCheckBetter(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime!");
                return;
            }
        }
        System.out.println("Number is prime!");
    }

    private static void allPrimesTillNumBasic(int num) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            int flag = 0;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                primeList.add(i);
            }

        }

        System.out.println(primeList);
    }

    private static int reverseNumber(int num) {
        int retNum = 0;
        while (num > 0) {
            retNum *= 10;
            retNum += num % 10;
            num /= 10;
        }

        return retNum;
    }

    private static int gcd(int num1, int num2) {
        int divisor = Math.min(num1, num2);
        int dividend = Math.max(num1, num2);
        int remainder = dividend % divisor;

        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }

        return divisor;
    }

    private static void gcdRecurvise(int num1, int num2) {
        int divisor = Math.min(num1, num2);
        int dividend = Math.max(num1, num2);
        int remainder = dividend % divisor;
        System.out.println(gcdRecursive(divisor, dividend, remainder));
    }

    private static int gcdRecursive(int divisor, int dividend, int remainder) {
        if (remainder == 0) {
            return divisor;
        }

        return gcdRecursive(remainder, divisor, dividend % divisor);
    }

    private static int nthFibBasic(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return nthFibBasic(n - 1) + nthFibBasic(n - 2);
    }

    private static void fibUptoNBasic(int n) {
        int a = 0;
        int b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    /*
    * End of Lecture 1
    * */


}