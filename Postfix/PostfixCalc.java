package Postfix;

import java.util.Stack;

public class PostfixCalc
{
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> operandStack=new Stack<>();

        // Scan all characters one by one
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
        String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}