import java.util.* ;

public class solidRhombus{

            //              * * * * *
            //            * * * * *
            //          * * * * *
            //        * * * * *
            //      * * * * *
 
    public static void createSolidRhombus(int n ){

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {    //spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= n ; j++) {     // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // hollow rhombus
    public static void createHollowRhombus(int n){

//                      * * * * * * *
//                     *           *
//                   *           *
//                 *           *
//                *           *
//              *           *
//             * * * * * * *

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {    //spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= n ; j++) {     // stars
                if(i == 1 || i == n || j == 1 || j == n)
                     System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
               
            System.out.println();
        }

    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of rhombus : ");
        int n = sc.nextInt();
        createSolidRhombus(n);
        createHollowRhombus(n);
    }
}