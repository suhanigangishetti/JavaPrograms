

public class T12_SumHund{
    public static void main(String[] args) {
        int n,sumeven=0,sumodd=0;
        for(int i=1;i<100;i++){
            if(i%2==0)
                sumeven+=i;
            else
                sumodd+=i;
        }
        System.err.println("sum of even: "+sumeven+ "sum of odd: "+sumodd);
    }
}
