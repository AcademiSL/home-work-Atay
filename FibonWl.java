import java.util.*; 
 // 9 фиббоначи с использованием while
 public class FibonWl {
   public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ahead = 0;
        int back = 1;
        int count ;
        //  здесь у нас 2 потому что меньше он не может 
        int a = 2;
        while ( a <= num ){
             
           count = ahead + back ;
            System.out.print(" "+ count);
            ahead = back;
            back = count;
            a++;
           
        }

   }

}