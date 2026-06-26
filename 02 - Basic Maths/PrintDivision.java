import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PrintDivision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                ls.add(i);
                if (n / i == i)
                    continue;
                ls.add(n / i);
            }
        }
        Collections.sort(ls);
        for (int item: ls){
            System.out.print(item + " ");
        }
        sc.close();
    }
}