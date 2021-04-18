import java.util.*;

public class PostfixCalc
{

    static int CalculatePostfix(String exp)
    {
        //creating a stack name operandStack
        Stack<Integer> operandStack = new Stack<>();

        // Scaning all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            // If the scanned character is an operand push it to the stack.
            if(Character.isDigit(c))
                operandStack.push(c - '0');

            //  If the scanned character is an operator, pop two elements from stack apply the operator
            else
            {
                int OP2 = operandStack.pop();
                int OP1 = operandStack.pop();

                switch(c)
                {
                    case '+':
                        operandStack.push(OP1+OP2);
                        break;

                    case '-':
                        operandStack.push(OP1- OP2);
                        break;

                    case '/':
                        operandStack.push(OP1/OP2);
                        break;

                    case '*':
                        operandStack.push(OP1*OP2);
                        break;
                }
            }
        }
        return operandStack.pop();
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int loop =1;
        while (loop==1) {
            System.out.print("Enter the postfix equation :"); //taking imput from teh user
            String exp = sc.next();
            System.out.println("Correct Postfix Evaluation is : " + CalculatePostfix(exp));
            System.out.println("Enter 0 if you want to exit or 1 to evaluate another postfix notation : ");
            loop = sc.nextInt();
        }
    }
} 