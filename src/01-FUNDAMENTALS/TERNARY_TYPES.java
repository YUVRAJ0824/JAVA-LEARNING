public class TERNARY_TYPES {

    public static void main(String[] args) {
        // Java has one ternary (conditional) operator. These are common ways to use it.
        // It has three parts: condition ? valueIfTrue : valueIfFalse.
        // The condition must be boolean, and the two results must have compatible types.
        // It returns one value, which you can store, print, or return from a method.

        // 1. Choose text and store it in a variable.
        int age = 20;
        String ageMessage = (age >= 18) ? "Adult" : "Under 18";
        System.out.println("Text result: " + ageMessage);

        // 2. Choose between two numbers and store the result.
        int firstNumber = 12;
        int secondNumber = 9;
        int largerNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println("Larger number: " + largerNumber);

        // A numeric ternary can promote its result to a wider compatible type.
        boolean hasBonus = true;
        double bonus = hasBonus ? 10 : 2.5;
        System.out.println("Bonus: " + bonus); // Result type is double.

        // 3. Use the result directly as a method argument when it stays readable.
        int score = 76;
        System.out.println("Result: " + (score >= 50 ? "Pass" : "Fail"));

        // 4. Call a method that uses a ternary.
        Student student = new Student(score);
        System.out.println("Class method result: " + student.getResult());

        // 5. Nest ternaries for a small set of choices.
        // The first condition is checked first; the nested choice runs when it is false.
        // Parentheses make the second condition easier to spot.
        String grade = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C or below");
        System.out.println("Grade: " + grade);

        // 6. Use a ternary inside a for loop.
        for (int number = 1; number <= 5; number++) {
            String kind = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println(number + " is " + kind);
        }

        // 7. Use a ternary to choose a calculation.
        int total = 120;
        boolean hasDiscount = true;
        int discount = hasDiscount ? total * 10 / 100 : 0;
        int finalTotal = total - discount;
        System.out.println("Final total: " + finalTotal);

        // A condition already gives true or false; do not write condition ? true : false.
        boolean isPassing = score >= 50;
        System.out.println("Is passing: " + isPassing);

        // Use ternary for choosing a value; use if/else when branches need multiple statements.
        if (score >= 50) {
            System.out.println("The score passed.");
            System.out.println("Keep up the work!");
        } else {
            System.out.println("The score did not pass.");
            System.out.println("Review and try again.");
        }
    }

    private static class Student {
        private int score;

        private Student(int score) {
            this.score = score;
        }

        private String getResult() {
            return (score >= 50) ? "Pass" : "Fail";
        }
        //recap needed
    }
}