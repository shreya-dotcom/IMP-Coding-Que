import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Paranthesis_Deque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        if(CheckParenthesis(expression)){
            System.out.println("Balanced expression");
        }
        else{
            System.out.println("Unbalanced expression");
        }

    }

    private static boolean CheckParenthesis(String expression) {
        Deque<Character> d = new LinkedList<>();
        for(char ch :expression.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                d.addFirst(ch);
            }
            else{
                if(!d.isEmpty() && (d.peekFirst()=='{' && ch=='}')
                        || (d.peekFirst()=='(' && ch==')')
                        || (d.peekFirst()=='[' && ch==']') )
                {
                    d.removeFirst();
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
    }
