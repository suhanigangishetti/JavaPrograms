

public class T51_MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            int res=n1/n2;
            System.out.println("result="+res);
            
        } catch (ArithmeticException e) {
            System.err.println("divide by zero not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("require two numbers");
        }
        catch(NumberFormatException e)
        {
            System.err.println("enter only numbers");
        }
        catch(RuntimeException e)
        {
            System.err.println("runtime exception");

        }    
        catch(Exception e)
        {
            System.err.println("Exception occured");
        }
    }
    
}
