   //  №4 степень числа с использованием while
   
   
   
   import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int branch = sc.nextInt();

        int result = 1;
        int count = 0;

        while (count < branch) {
            result *=  num;
            count++;
        }

        System.out.println(result);
    }
}
