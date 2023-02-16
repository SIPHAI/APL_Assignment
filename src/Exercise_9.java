// Financial tsunami
import java.util.Scanner;
public class Exercise_9{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        double[] currentBalances = {25, 125, 175, 75, 181};
        double[][] loans = {{0, 100.5, 0, 0, 320.5},
                {0, 0, 40, 85, 0},
                {125, 0, 0, 75, 0},
                {125, 0, 0, 0, 0},
                {0, 0, 125, 0, 0}};
        System.out.print("Enter limit : ");
        int limit = scan.nextInt();
        scan.close();
        for(int k =0; k<currentBalances.length;k++){
            //k row l collum
            int total =0;
            //Calculating total number of loans
            for(int l =0;l<currentBalances.length;l++){
                total +=loans[k][l];
            }
            //exclude the loan from lender asset when loaner becoome unsafe
            if(total + currentBalances[k] < limit){
                //m row k collum
                for (int m =0;m<currentBalances.length;m++){
                    loans[m][k] = 0;
                }
            }
        }
        //output
        System.out.println("With minimum asset of : "+limit + " Million dollars");
        System.out.print("Unsafe banks are : ");
        for (int k =0; k<currentBalances.length;k++){
            int total =0;
            //Calculating total number of loans again but in updated arr
            for (int l =0;l<currentBalances.length;l++){
                total +=loans[k][l];
            }
            //display if loan less than limit
            if (total + currentBalances[k] < limit){
                System.out.print("Bank #" + k + " , ");
            }
        }
    }
}
