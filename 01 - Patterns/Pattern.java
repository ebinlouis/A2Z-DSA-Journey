class Pattern{
    void print1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print2(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print3(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    void print4(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    void print5(int n){
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print6(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
    void print7(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            
            for (int j = 0;j < n - i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void print8(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * n - (2 * i + 1); j++){
                System.out.print("*");
            }
            
            for (int j = 0;j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void print9(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * n - (2 * i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print10(int n){
        for (int i = 1; i < 2 * n; i++){
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print11(int n){
        int start;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0) 
                start = 0; 
            else start = 1;
            for (int j = 1; j <= i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    void print12(int n){
        int space = 2 * (n - 1);
        for (int i = 0; i < n; i++){
            // number
            for (int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            // space

            for (int j = 0; j < space; j++){
                System.out.print(" ");
            }            

            // number
            for (int j = i + 1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();

            space -= 2;
        }
    }
    void print13(int n){
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    void print14(int n){
        for (int i = 0; i <n; i++){
            for (char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void print15(int n){
        for (int i = 0; i < n; i++){
            for (char ch = 'A'; ch < 'A' + (n - i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void print16(int n){
        for (int i = 0; i < n; i++){
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void print17(int n){
        for (int i = 0; i < n; i++){
            // spaces
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            // star
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print(ch);
                if (j < breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    void print18(int n){
        for (int i = 0; i < n; i++){
            char ch = (char)('E' - i);
            for (int j = 0; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    void print19(int n){
        for (int i = 0; i < n; i++){
            //stars
            for (int j = 0; j < (n - i); j++){
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (n - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++){
            // stars
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            // space
            for (int j = 0; j < 2 * (n - i - 1); j++){
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print20(int n){
        for(int i = 0; i < 2 * n - 1; i++){
            int space = 2 * (n - i - 1);
            int star = i + 1;
            if (i >= n){
                star = ( 2 * n ) - i - 1;
                space = 2 * (i - n + 1);
            }
            // star
            for (int j = 0; j < star; j++){
                System.out.print("*");
            }
            // space
            for (int j = 0; j < space; j++){
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print21(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void print22(int n){
        for (int i = 0; i < 2 * n - 1; i++){
            for (int j = 0; j < i; j++){
            }
        }
    }
    public static void main(String args[]){
        Pattern p = new Pattern();
        p.print21(5);
    }
}