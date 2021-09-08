import java.util.Scanner;




public class ParenthesisBalance {
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

    static boolean CheckParenthesis(String exp) {
        //Validations for balanced parenthesis
        if(exp==null || exp.length()%2!=0) // if string is null , length of string is odd
        {
            return false;
        }
        else{
            char[] ch = exp.toCharArray();
            for(char c : ch){
                if(!(c=='(' || c==')' || c=='{' || c=='}' || c=='[' || c==']')){
                    return false;
                }
            }
        }

        while(exp.contains("()") || exp.contains("{}") || exp.contains("[]")){
            exp = exp.replaceAll("\\(\\)","").
                    replaceAll("\\{\\}","").
                    replaceAll("\\[\\]","");
        }
        return (exp.length()==0);
    }
}
