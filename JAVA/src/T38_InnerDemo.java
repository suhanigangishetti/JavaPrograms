class Outer{
    int m=100;//static int
    class Inner{//static class Inner
        void doStuff(){
            System.out.println("m="+m);
        }
    }

}
public class T38_InnerDemo{
    public static void main(String[] args) {
        Outer.Inner innerObj=new Outer().new Inner();
        innerObj.doStuff();
    }
}
