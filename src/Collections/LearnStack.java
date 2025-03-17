package Collections;

import java.util.Stack;


public class LearnStack {
    //LIFO (last in first out)

    public static void main(String[] args){
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Cheetah");
        // animals.pop();
        System.out.println(animals.peek());

    }


}
