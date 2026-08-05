import java.util.Scanner;

public class T17_SecondSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer array size");
        int s=sc.nextInt();
        int []arr=new int[s];
        int big=Integer.MIN_VALUE;
        int secondBig=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for (int i = 0; i < s; i++) {
            System.out.println("arr["+i+"]");
            arr[i]=sc.nextInt();
        }
        if(s>2){
            for(int n:arr){
                System.out.println(n);
            if(n<small){
                secondSmall=small;
                small=n;


            }
            else if(n<secondSmall&&secondSmall!=small){
                secondSmall=n;
            }
            }
        }
        else{
            System.out.println("2 element array not possible");
        }
        System.out.println("small:"+small+"second small: "+secondSmall);

    }
    
}



