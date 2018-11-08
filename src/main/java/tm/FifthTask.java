package tm;

public class FifthTask {
    public static void main(String[] args){
        int counter = 0;
        for(int i=0;i<=50000;i++){
            for (int j =i;j!=0;j=j/10){
                int a = j % 10;
                if (a==4){
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Number of tables: " + counter);
    }
}
