import java.util.Scanner;

public class Float {



        public static void main(String[] args)
        {
           float num1,num2;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the num1");
            num1= sc.nextFloat();
            System.out.println("Enter the num2");
            num2= sc.nextFloat();

            float sum=num1+num2;
            System.out.println("the sum is"+sum);

        }

    }

