package LambdaExpression;

interface LambdaInter{
    void display();

}

class Another{

    public void show(LambdaInter l){
        l.display();
    }
}

public class LambdaAsParam {
    public static void main(String[] args) {
        Another an = new Another();
        an.show(()-> System.out.println("Hello"));
    }
}
