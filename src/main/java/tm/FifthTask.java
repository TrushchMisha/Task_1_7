package tm;

public class FifthTask {
    public static void main(String[] args){
        int counter = 0;
        for(int i=2;i<=50000;i++){
            String s = String.valueOf(i);
            if(s.indexOf('2')!=-1){
                counter++;
            }
        }
        System.out.println("Number of tables: " + counter);
    }
}
