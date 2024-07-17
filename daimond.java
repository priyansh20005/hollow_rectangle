import java.util.* ;

public class daimond {

    ////   DAIMOND ....................///////////

    public static void createDaimond(int n ){

        for (int i = 1 ;i<= n ;i++){
            for (int j = 1 ;j <= n-i ;j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= (2*i -1) ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        /////mirror part
        for (int i = n ;i >= 1 ;i--){
            for (int j = 1 ;j <= n-i ;j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= (2*i -1) ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of rhombus : ");
        int n = sc.nextInt();
       // createDaimond(n/2);
        createDaimond(n);
    }
}