import java.util.Scanner;

class CheckPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int revNum = 0;
        int temp = n;
        while (n > 0){
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        if (temp == revNum) System.out.println("Number is palindrome");
        else System.out.println("Number is not palindrome");
        sc.close();
    }
}