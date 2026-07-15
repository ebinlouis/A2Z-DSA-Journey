import java.util.ArrayList;
import java.util.Scanner;

class PrintDivision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        for (int i = 1; i * i<= n; i++){
            if (n % i == 0){
                small.add(i);
                if (n / i != i)
                    large.add(n / i);
            }
        }
        for (int item: small){
            System.out.print(item + " ");
        }

        for (int i = large.size() - 1; i >= 0; i--){
            System.out.print(large.get(i) + " ");
        }
        sc.close();
    }
}