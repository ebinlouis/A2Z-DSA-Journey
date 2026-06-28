import java.util.Scanner;

class GCD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("GCD undefined");
            sc.close();
            return;
        }

        while (a > 0 && b > 0){
            if ( a > b) 
                a = a % b;
            else if (b > a) 
                b = b % a;
            else break;

        }
        if ( a == 0 ) System.out.println(b);
        else System.out.println(a);
        sc.close();
    }
}