import java.util.* ;


public class _0_1_triangle {

    public static void create0_1Triangle(int n ){

        for( int i = 1; i <= n; i++ ){
            for (int j = 1 ; j<= i ; j++){
                if ((i+j)% 2 == 0){  // even
                    System.out.print("1 ");
                }else{                  // 0dd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no of rows : ");
        int n = sc.nextInt();
        create0_1Triangle(n);
    }
}