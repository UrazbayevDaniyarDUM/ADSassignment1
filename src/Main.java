import java.util.Scanner;

public class Main {

    // Task 1: Print digits
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2: Sum recursively
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    // Task 3: Prime check
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4: Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Task 5: Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6: Power
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7: Reverse output
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }

    // Task 8: Check digits in string
    public static boolean onlyDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return onlyDigits(s, index + 1);
    }

    // Task 9: Count characters
    public static int countChars(String s) {
        if (s.isEmpty()) return 0;
        return 1 + countChars(s.substring(1));
    }

    // Task 10: GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Helper to fill array recursively
    public static void fillArray(int[] arr, int index, Scanner sc) {
        if (index == arr.length) return;
        arr[index] = sc.nextInt();
        fillArray(arr, index + 1, sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Пример ввода, как в задании
        // Task 1
        int num = sc.nextInt();
        printDigits(num);

        // Task 2
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillArray(arr, 0, sc);
        double avg = (double) sum(arr, n) / n;
        System.out.println(avg);

        // Task 3
        int p = sc.nextInt();
        System.out.println(isPrime(p, 2) ? "Prime" : "Composite");

        // Task 4
        int f = sc.nextInt();
        System.out.println(factorial(f));

        // Task 5
        int fib = sc.nextInt();
        System.out.println(fibonacci(fib));

        // Task 6
        int a = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(a, pow));

        // Task 7
        int k = sc.nextInt();
        reversePrint(k, sc);
        System.out.println();

        // Task 8
        String s = sc.next();
        System.out.println(onlyDigits(s, 0) ? "Yes" : "No");

        // Task 9
        String str = sc.next();
        System.out.println(countChars(str));

        // Task 10
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }
}