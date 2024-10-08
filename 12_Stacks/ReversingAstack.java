import java.util.*;

public class ReversingAstack{
    //pushAtbottom code
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //removing 
        int top = s.pop();
        pushAtbottom(s, data);//calling for next level
        s.push(top);
    }

    //reversing a Stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reverseStack(s);//1,2,3
        printStack(s);
    }
    
}
