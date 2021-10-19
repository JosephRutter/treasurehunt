import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       String [][] treasureMap = new String [5][5];
        int
       for(int i = 0 ; i < 5;i++){
           for (int j = 0; j < 5 ; j++){
               treasureMap[i][j] = "[ ]";
               System.out.print(treasureMap[i][j]);
           }
           System.out.println(" ");
       }
    }
}
