package LambdaExpression;

@FunctionalInterface
interface MyLambda{
    void display();
}

//class MyClass implements MyLambda{
//
//    @Override
//    public void display() {
//        System.out.println("This is Lambda Expression");
//    }
//}

public class Intro {

    public static void main(String[] args) {
        MyLambda mc = ()->{ System.out.println("This is lambda Expression");};
        mc.display();
    }
}
