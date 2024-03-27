

//   6 сделать при помощи массива превращение всех маленьких букв в заглавные


import java.util.Scanner;
public class Adskiii {
public static void main(String [] args){
    Scanner names = new Scanner(System.in);

    String a = names.nextLine() ;
    char []  namesChar = new char [a.length()];
    for (int i = 0; i < a.length(); i++){
        namesChar[i] = a.charAt(i);
        if (namesChar[i] >= 97  ) {
            namesChar [i] = (char) ((int) namesChar[i]-32);
        }

        System.out.print(namesChar[i] + "");
    }
}
}
