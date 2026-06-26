import java.util.Scanner;

class CheckPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if ( n <= 1) {
            System.out.println("Not prime");
            sc.close();
            return;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0 ) {
                isPrime = false;
                break;
            }

        }
        if (isPrime)System.out.println("Number is prime");
        else System.out.println("Number is not prime");
        sc.close();
    }
}