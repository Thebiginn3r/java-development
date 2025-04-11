import java.util.Scanner;

public class Testcode4class {
    public static int result = 5; {
        //now all blocks of code can access the result variable

    }
    public static void main(String[] args) {
        System.out.println("This is how you get java to print");
        // this is how you comment on one line
        /* this is how
        you comment on
        multiple lines
         */
//        highlight then right click
//        to make this whole section a
//        comment
        /**
         * this is a javadoc comment
         */
        int first_number = 10;
        //or
        int secondNumber;
        secondNumber = 10;
        boolean isfried = true;
        char firstLetter = 'c';
        double thirdNumber = 2.14;
        String myMessage = "this is a test";
        System.out.println("Now you can print out " + myMessage + " This also called string concatenation");
        final String example = "This code cannot be changed now";
        // byte limitedNumbers = -128 - 127;
        // u can also concatenate like this
        String word1 = "first";
        String word2 = "second";

        String concatenation = word1 + " " + word2;
        System.out.println(concatenation);

        double firstnum = 10; //dont use int because its not percise if there are remainders in division
        double secondnum = 3;
        double result;
        //addition
        result = firstnum + secondnum;
        System.out.println(result);

        //subtraction
        result = firstnum - secondnum;
        System.out.println(result);

        //multiplication
        result = firstnum * secondnum;
        System.out.println(result);

        //division
        result = firstnum / secondnum;
        System.out.println(result);

        //modulo aka division remainders
        result = firstnum % secondnum;
        System.out.println(result);

        int x = 5;
        int y;
        x++; // aka x = x + 1
        System.out.println(x);
        ++x;
        System.out.println(x);
        y = ++x;
        System.out.println();

        //for (int i = 0; i < ; i++) {
        //casting
        //int myInt;
        //long myLong = 99999999999999999L;

        //System.out.println(myLong);
        double value = 1234.567;
        int wholeNumber = (int) Math.round(value);
        System.out.println(wholeNumber);

        double expressionResult = 1 - 2 * Math.pow(2,2);
        System.out.println(expressionResult);

        int onenum = 5;
        int twonum = 10;

        int minnumber = Math.min(onenum, twonum);
        System.out.println(minnumber);
        // this format also works for max

        //assignment operators
        int answer = 0;

        answer = answer + 10; // answer +=10;
        answer = answer - 5; // answer -= 5;
        answer = answer * 10; // answer *= 10;
        answer = answer / 2; // answer /= 2;

        System.out.println("this prints on a new line since there is an ln at the end of print");
        System.out.print("this prints on the same line since the is no ln at the end of print");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totaldue = subtotal + tax;
        System.out.println(totaldue);
        System.out.println("Total due is: " + String.format("%.2f", totaldue));

        System.out.printf("Total due is: %.2f",totaldue);
        System.out.println();

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.779f;

        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
        System.out.println();

        Scanner castscanner = new Scanner(System.in);
        System.out.println("Please enter Your name: ");
        String name1 = castscanner.nextLine();


        System.out.println("Hello everyone I am " + name + " and I love potatoes!");
        System.out.println("Please  Enter a number: ");
        int firstNumber = castscanner.nextInt();
        System.out.println("The number is: " + firstNumber);
        System.out.println();

        Scanner dosscanner = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int numone = dosscanner.nextInt();

        System.out.println("Enter the second number: ");
        int numtwo = dosscanner.nextInt();
        dosscanner.nextLine();

        System.out.println("Which operation would you like to do next?");
        String response = dosscanner.nextLine();

        System.out.println("The first number is: " + numone + " and the second number is: " + numtwo);

        System.out.println("The operation is: " + response);



        }


    }
    //public static void testSpace() {
        //System.out.println(sum);
        // this wont work because its in a different set of curly brackets
        //numbers default to 0, booleans default to false, objects default to false
   // }
//}
