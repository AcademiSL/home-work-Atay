/* 7 пользователь вводит 12  цифр в массив 
затем программа делит все числа на 2
если остатаок четное число то цифра введенная пользователем не выходит в ответе 
если же нечетное то выводит.
 */

import java.util.Scanner;
public class Atai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // создание массива чисто из цифр
        int[][] numbers = new int[3][4];

        // заполнение массива цифрами пользователя
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                // то что будет на экране 
                System.out.print("строка " + (i + 1) + ", столб " + (j + 1) + ": ");
                //присвоение
                numbers[i][j] = scanner.nextInt();
            }
        }

        // деление заданных чисел на 2 и вывод нечетных
        System.out.println("нечетные числа:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //смотрим на число в массиве и делим его на 2 и получаем остаток и сравниваем его с 1 
                if (numbers[i][j] % 2 == 1) {
                    // если он равен 1 то число выводится
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}
