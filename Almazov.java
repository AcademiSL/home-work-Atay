/* №1 сделать прямоугольный треугольник при помощи цикла  */ 
 public class Almazov {
public static void main (String[] args){
    for (int i = 0; i < 6; i++) {
        for (int a = 0; a < 6; a++) {
            if (a + i == 5 || a + i > 5 ) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }
}
