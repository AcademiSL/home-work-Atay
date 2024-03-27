import java.util.Scanner;
  // 5  пример где (к + 1)+ (к + 2)....( к + s )
  //  и это всё делить на к * к 
class DoWl{
    /**
     * @param args
     */
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int a = 1;
        int result;
        
        int botnum = k * k;

        int topnum=0;
        do {  
            topnum += (k+a);
            a++;
            
                          
    
        } while ( a<= s );
        result = topnum / botnum ;
        System.out.println(result);
        
    }
}