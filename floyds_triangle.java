import java.util.*;

public class floyds_triangle{

    public static void createFloydsTriangle(int n){
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j <= i){
                    System.out.print(count++ + " ");
                    
                    // System.out.print(count + " ");
                    // count++;
                }

            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no of rows : ");
        int n = sc.nextInt();
        createFloydsTriangle(n);
    }

}