package ExceptionHandling;

import java.util.Objects;
import java.util.Stack;

class StackOverflowException extends Exception{
    @Override
    public String toString() {
        return "Allwyn: StackOverFlowException";
    }
}

class StackUnderflowException extends Exception{
    @Override
    public String toString() {
        return "Allwyn: StackUnderFlowException";
    }
}


public class StackChallenge {

    int height;
    int [] sz ;
    int top = -1;

    public StackChallenge(int height){
        this.height = height;
        sz = new int[height];
    }

    public void push(int value) throws StackOverflowException {
        if(top == (height-1)) throw new StackOverflowException();
        else {
            top++;
            sz[top] = value;
        }
    }

    public void pop() throws StackUnderflowException {
        if(top < 0) throw new StackUnderflowException();
        else {
            top--;
        }
    }

    public static void main(String[] args) {

        StackChallenge sc = new StackChallenge(1);
        try{
            sc.push(2);
            sc.pop();
            sc.pop();
        }catch (StackOverflowException soe){
            System.out.println(soe);
        }catch (StackUnderflowException sue){
            System.out.println(sue);
        }
    }
}
