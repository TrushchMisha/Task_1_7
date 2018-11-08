package tm;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = in.nextInt();

        if(n <= 0) {
            System.out.println("Error");
            return;
        }

        for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n % i == 0){
                System.out.println("Number is composite");
                return;
            }if(i==1) System.out.println("Number is prime");
        }






    }
}
