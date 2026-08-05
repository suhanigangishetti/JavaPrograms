
import java.util.Scanner;

public class T24_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<arr.length;i++){
            System.err.println("arr["+i+"]:");
            arr[i]=sc.nextInt();
        }
        for(int c:arr){
            System.out.print(c+" ");
        }
    }
    
}
