import java.util.Scanner;
public class T28_MatrixSumDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int r=sc.nextInt();
        System.out.println("enetr column size");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("arr["+i+"]["+j+"]");
                mat[i][j]=sc.nextInt();

            }
            
        }
        int sum=0;
        for (int i = 0; i < r; i++) {
            sum+=mat[i][i];
            //for (int j = 0; j < c; j++) {
             //   System.out.print(mat[i][j]+" ");
                
            //}
            System.out.println("sum :"+sum);
        }
        

    }
    
}
