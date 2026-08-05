import java.util.Scanner;

public class T25_Arraysearch  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array");
        int s=sc.nextInt();
        int k,f=-1;       
        int arr[]=new int[s];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]:");
            arr[i]=sc.nextInt();

        }
        System.out.println("eneter element to be searched: ");
        k=sc.nextInt();

        for(int i=0;i<=arr.length;i++){
            if(k==arr[i]){
                f=1;
                break;
            }
           

        }
        if(f==1){
            System.out.println(k+" founded");
        }

        else{    
            System.out.println(k+"not founded");

        }

    }
}


