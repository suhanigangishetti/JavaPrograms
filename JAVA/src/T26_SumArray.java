import java.util.Scanner;

public class T26_SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array");
        int s=sc.nextInt();
        int sum=0;        
        int arr[]=new int[s];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]:");
            arr[i]=sc.nextInt();

        }
        for(int c:arr){
            System.out.println(c+" ");
            sum+=c;

        }
        System.out.println("\n5sum of arry elements: "+sum);
    }
}

