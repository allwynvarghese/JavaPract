package LambdaExpression;

interface AddLambda{
    int add(int a, int b);
}

public class LambdaParameters {

    public static void main(String[] args) {
        int num1=5, num2=10;
        AddLambda al = (a,b) ->a+b;
        System.out.println(al.add(num1,num2));
    }


}
