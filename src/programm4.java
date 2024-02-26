import java.util.Scanner;

public class programm4 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("введите целое положительное число");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
                for(int x =0; x<i;x++){
                    int mush = i%10;
                    if(Math.pow(mush,x) == i){
                        System.out.println(i);
                    }
                }

        }
    }
}
