import java.util.Scanner;

class PrintNameNTimes{
    void printName(int n){
        if (n == 0) return;
        System.out.println("Ebin");
        printName(n - 1);
    }

    void printOneToN(int n){
        if (n == 0) return;
        printOneToN(n - 1);
        System.out.println(n);
    }

    void printNtoOne(int n){
        if (n == 0) return;
        System.out.println(n);
        printNtoOne(n - 1);
    }

    int sumOfOneToN(int n){
        if (n == 0) return 0;
        return n + sumOfOneToN(n - 1);
    }

    int factorialOfN(int n){
        if (n == 0) return 1;
        return n * factorialOfN(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        PrintNameNTimes p = new PrintNameNTimes();
        System.out.println(p.factorialOfN(n));
        sc.close();
    }
}