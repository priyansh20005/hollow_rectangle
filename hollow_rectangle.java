 import java.util.* ;

 public class hollow_rectangle{

    public static void createHollowRectangle(int rows , int columns){

        for (int i = 1 ;i <= rows ; i++){
            for (int j = 1 ; j <= columns ; j++){
                if (i == 1 || i == rows || j== 1 || j == columns){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

/////////////////////////////////// other way//////////
        // for (int i = 1 ;i<= rows ;i++ ){

        //     if( i == 1 || i == rows){
        //         for(int j = 1 ; j<= columns ;j++){
        //             System.out.print("# ");
        //         }
        //    }else{
        //         for(int j = 1 ; j<= rows ;j++){
        //             if (j ==1 || j == columns){
        //                 System.out.print("# ");
        //           }else{
        //             System.out.print("  ");
        //                  }
        //                                         }
        //            }
        //     System.out.println("");

        // }

    }

    public static void main(String args[]){
        int i , j ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows :");
        i = sc.nextInt();
        System.out.print("enter the no of columns :");
        j = sc.nextInt();

        createHollowRectangle(i , j);


        System.err.println("");


    }
 }