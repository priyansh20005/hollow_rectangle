import java.util.*;

public class nu_pyramid{

    public static void createNuPyramid(int n ){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ( j <= n-i+1){
                    System.out.print(j +" ");
                }
        }
        System.out.println();
    }

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows AND columns  : ");

        int n = sc.nextInt();
        createNuPyramid(n);

    }
}