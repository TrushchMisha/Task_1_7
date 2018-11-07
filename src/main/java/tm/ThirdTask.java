package tm;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = in.nextInt();

        int counter = 1;
        for(int i = 1; i<=n; i++){
            counter *= i;
        }
        System.out.println(counter);
    }

}
