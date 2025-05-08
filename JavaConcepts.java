import java.util.Scanner;

public class JavaConcepts {
    public static void main(String[] args) {
        //Part1
        int age = 29;
        double height = 67.71;
        char initial = 'A';
        boolean isStudent = false;
        System.out.println(age);
        System.out.println(height);
        System.out.println(initial);
        System.out.println(isStudent);

        //Part2
        int counter = 10;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        for (int i = 10; i <= 15; i++){
            counter = i;
            System.out.println(counter);
        }

        while (counter >= 10){
            System.out.println(counter);
            counter--;
        }

        //Part3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.next();
        System.out.println("Enter your last name: ");
        String lastName = sc.next();

        String fullName = firstName + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();
        int countFirstChar = 0;

        for (int i = 0; i < fullName.length(); i++){
            if (fullNameUpper.charAt(i) == fullNameUpper.charAt(0)){
                countFirstChar++;
            }
        }

        System.out.println(fullName + " " + fullNameUpper + " " + countFirstChar);

        //Part4
        int testScore1 = 10;
        int testScore2 = 55;
        int testScore3 = 95;
        int averageScore = (testScore1 + testScore2 + testScore3)/3;

        if (averageScore >= 90 && averageScore <= 100){
            System.out.println("Excellent");
        } else if (averageScore >= 70 && averageScore <= 89){
            System.out.println("Good");
        } else if (averageScore >= 50 && averageScore <= 69){
            System.out.println("Average");
        } else if (averageScore < 50){
            System.out.println("Poor");
        }

        //Part5
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+,-,*,/,%): ");
        String operation = sc.next();
        double result = 0.0;

        switch (operation){
            case "+":
                result = num1 + num2;
                System.out.println("The addition's result is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The substraction's result is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The multiplication's result is: " + result);
                break;
            case "/":
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("The division's result is: " + result);
                } else {
                    System.out.println("Division by zero is not possible");
                }
                break;
            case "%":
                if(num2 != 0){
                    result = num1 % num2;
                    System.out.println("The modulus' result is: " + result);
                } else {
                    System.out.println("Division by zero is not possible");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("Would you like to increment/decrement the result by 1? (Y/N): ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("Y")){
            System.out.println("Enter the option (INC/DEC): ");
            String option = sc.next().toUpperCase();
            switch (option){
                case "INC":
                    result++;
                    System.out.println("The new result is: " + result);
                    break;
                case "DEC":
                    result--;
                    System.out.println("The new result is: " + result);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
