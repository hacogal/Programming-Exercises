import java.util.Scanner;

public class SimpleCalculator {
    /**
     * SimpleCalculator - hacogal
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter the operator (+,-,*,/): ");
        char op = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        double n2 = input.nextDouble();

        double result;

        switch(op)
        {
            case '+':
            result = n1+n2;
            System.out.println("Result: "+result);
            break;

            case '-':
            result = n1-n2;
            System.out.println("Result: "+result);
            break;

            case '*':
            result = n1*n2;
            System.out.println("Result: "+result);
            break;

            case '/':
            if (n1!=0) 
            {
                
                result = n1/n2;
                System.out.println("Result: "+result);
            } else 
            {
             System.out.println("Error: O is not divisible.");   
            }
            break;

            default:
            System.out.println("Error: Invalid operation.");

        }


    }
}
