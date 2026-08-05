
public class T10_PrimeSum {
	    public static void main(String[] args) {
	        int f=0,sum=0;
	        for(int i=2;i<=100;i++){
	        for(int j=2;j<=i/2;j++){
	            if(i%j==0){
	                f=1;
	                break;
	            }
	        }
	        if(f==0){
	            System.err.println(i+ "");
	            sum+=i;

	        }
	        System.err.println("\nsum of prime numbers btw 2 to 100 is"+sum);
	    }
	    
	}
	

}
