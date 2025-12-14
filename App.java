//Matthew Stettnisch Assingment 3 HW
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        //Or I can do <+
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        Scanner sc = new Scanner(Scanner.sc);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
    
        int factorial = 1;
        //here's a hint
        for (int i = 0; i < num; i++){
            factorial *= i;

        }

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        //(just add i by every 2 instead of every 1 incremtation)
        int newNum = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= newNum; i += 2) {
            sum += i;
        }
        System.out.println(sum);



        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");

            run = false;
            //I can also do "break", or I can set the variable run to false, since it says it wwill always run while it's true
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("hello user, please enter a string!: ")
        String userInput = sc.nextLine();

        //hint
        String reverse = "";

        // until theres no letters left (i-- until i equals zero) reverse the users string input, and then I'll print it out below
        for (int i = userInput.length() - 1; i >= 0; i--) {

            reverse += userInput.charAt(i);
        }
        System.out.println(reverse);
    }
}

    }
}
