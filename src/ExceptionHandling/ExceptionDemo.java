package ExceptionHandling;

class NegativeDimensionException extends Exception{

    @Override
    public String toString() {
        return getClass().getName() + " : Dimensions cannot be negative.";
    }
}

public class ExceptionDemo {

    public static int area(int l, int b) throws NegativeDimensionException {

        if(l<0 || b<0) throw new NegativeDimensionException();
        return l*b;
    }

    public static void meth1(int a, int b) throws NegativeDimensionException {

        System.out.println("Area: "+area(a,b));
    }

    public static void meth2(int a, int b) throws NegativeDimensionException {
        meth1(a, b);
    }

    public static void main(String[] args){
        int a = -10, b = 5;

       try{
           meth2(a,b);
       }catch (NegativeDimensionException e){
           System.out.println(e);
       }finally {
           System.out.println("The End");
       }
    }
}
