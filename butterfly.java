import java.util.* ;


//                       *             *
//                       * *         * *
//                       * * *     * * *
//                       * * * * * * * *
//                       * * * * * * * *
//                       * * *     * * *
//                       * *         * *
//                       *             *

public class butterfly{
    public static void createButterfly(int n ){
                  
        // box ->1
        for( int i = 1; i <= n/2; i++ ){
            for(int j = 1 ; j<= n/2 ;j++){
                if ( j<= i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                
                // box -> 2
            }for(int j= n/2 +1 ;j <= n ;j++){
                if ( j <= n-i)
                    System.out.print("  "); 
                else 
                    System.out.print("* ");

            }
            System.out.println();
        }

        for(int i = n/2 +1 ; i <= n ;i++){

            for(int j = 1 ; j<= n/2 ;j++){
                if(j <= n -i +1 )
                    System.out.print("* ");
                else 
                    System.out.print("  ");

            }for(int j= n/2 +1 ;j <= n ;j++){
                if( j >= i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                
            }


            System.out.println();
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the even no greater than 6. : ");
        int n = sc.nextInt();


        createButterfly(n);
    }
}