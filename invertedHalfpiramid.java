import java.util.* ;

public class invertedHalfpiramid{
    public static void  createInvertedHalfPiramid(int row , int column) {

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {
                if (j <= column - i){
                    System.out.print("  ");
                }else {
                    System.out.print("# ");
                }

            }
            System.out.println();
        }
        
    }


    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

         System.out.print("enter the no of rows : ");
        int row = sc.nextInt();  
        System.out.print("enter the no of columns : ");
        int column = sc.nextInt();  

        createInvertedHalfPiramid(row, column);



    }
}