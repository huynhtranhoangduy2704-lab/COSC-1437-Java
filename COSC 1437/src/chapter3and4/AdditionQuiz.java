/*
Addition Quiz 
Duy Huynh
Feb 8 2026
JDK 25
*/
import java.util.Scanner;
public class AdditionQuiz 
{        
    public static void main(String[] args) 
    {        
        Scanner input = new Scanner(System.in);
        boolean passed = false;

        while (!passed) 
        {    
            int numQuestions = -1;
           
            while (numQuestions < 0) 
            {
                System.out.print("How many questions would you like to solve? ");
                numQuestions = input.nextInt();
            }
            int correct = 0;
        
            for (int i = 0; i < numQuestions; i++) 
            {    
                int a = (int)(Math.random() * 50) + 1;
                int b = (int)(Math.random() * 50) + 1;

                System.out.print(a + " + " + b + " = ? ");
                int answer = input.nextInt();

                if (answer == a + b) 
                    {
                    System.out.println("Correct");
                    correct++; }
                 else {
                    System.out.println("Incorrect"); }
                
            }

            double percentage = ((double) correct / numQuestions) * 100;
            System.out.printf("You got %d out of %d correct which is %.1f%%.\n", correct, numQuestions, percentage);

            if (percentage >= 70) {
                System.out.println("You passed. Congratulations!");
                passed = true; }
             else {
                System.out.println("You did not pass. Please try again.\n");
            }
        }
    }   
}
