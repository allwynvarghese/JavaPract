package Programs;

class ComplexNumber{
     int image, real;

    public ComplexNumber(int real, int image){
        this.real = real;
        this.image = image;
    }

    public void showNumbers(){
        System.out.println(real + " + " + image + "i");
    }
}

public class AddComplexNumbers {

    public static ComplexNumber addComplexNumbers(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber cn = new ComplexNumber(0,0);
        cn.real = c1.real + c2.real;
        cn.image = c1.image + c2.image;
        return cn;
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4,5);
        ComplexNumber c2 = new ComplexNumber(10, 5);
        c1.showNumbers();
        c2.showNumbers();
        ComplexNumber res = addComplexNumbers(c1,c2);
        res.showNumbers();
    }
}
