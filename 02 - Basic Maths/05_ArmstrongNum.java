import java.util.Scanner;

class ArmstrongNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int tmp = n;
        while (tmp > 0){
            int ld = tmp % 10;
            sum = sum + (ld * ld * ld);
            tmp = tmp / 10;
        }
        if (n == sum)System.out.println("Number is armstrong number");
        else System.out.println("Number is not armstrong number");
        sc.close();
    }
}