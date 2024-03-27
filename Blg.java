public class Blg {
    // 8 создать куб при помощи массивов где все буквы это А и одна В по середине 
public static void main(String[] args) {

    String user[][] = new String [3][3];
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	        user [i][j]="A"+ i;
	    }
	}
	
	for (int i = 0; i < 3; i++) {
	    for(int j =  0; j < 3; j++) {
	        if (i==1&&j==1){
	            user[i][j]="B"+j;
	        }
	        System.out.print(user[i][j]+" ");
	    }
	    System.out.println();
	}





}
}
