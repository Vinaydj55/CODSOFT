import java.util.Scanner;
import java.io.IOException;

public class StudentGcard
{
    public static void main(String arg[]) throws IOException
    {
        
        Scanner sc = new Scanner(System.in);
        String name;
        double num1,num2,num3,num4,num5;
        double percentage,sum;

        System.out.println("Enter Your name:");
        name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter the English subject Marks:");
        num1 = Double.parseDouble(sc.next());
        System.out.println(num1);
      
        System.out.println("Enter the subject Marks:");
        num2 = Double.parseDouble(sc.next());
        System.out.println(num2);

        System.out.println("Enter the Maths subject Marks:");
        num3 = Double.parseDouble(sc.next());
        System.out.println(num3);

        System.out.println("Enter the Science subject marks:");
        num4 = Double.parseDouble(sc.next());
        System.out.println(num4);

        System.out.println("Enter the Social subject marks:");
        num5 = Double.parseDouble(sc.next());
        System.out.println(num5);

        sum= (num1+num2+num3+num4+num5);
        percentage = (sum/5);

        System.out.println(sum);

        if(num1 > 40 && num2> 40 && num3 > 40 && num4 > 40 && num5 > 40 )

        {

          if (percentage > 90)
          System.out.println("You got 'O' grade");

          else if(percentage >=80)
          System.out.println("You got 'A+' grade");

          else if(percentage >=70)
          System.out.println("You got 'A' grade");

          else if(percentage >=60)
          System.out.println("You got 'B+' grade");

          else if(percentage >=50)
          System.out.println("You got 'B' grade");

          else if(percentage >=40)
          System.out.println("You 'Pass' in exam");

          else if(percentage <40)
          System.out.println("You 'Fail' in exam");

        }
        else
        {
            System.out.println("You Fail in exam's");
        }
       sc.close(); 
    }
}
