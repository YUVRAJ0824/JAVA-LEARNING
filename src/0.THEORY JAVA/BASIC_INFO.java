import java.util.Scanner; // import brings Scanner into this file; java.util is its package.

// java.lang is imported automatically, so we can use System without importing it.
public class BASIC_INFO { // public means other code can access it; class starts a class; name must match the file.

    // public: Java can access this method; static: run it without making an object;
    // void: it returns no value; main: the program's starting method.
    // String[] args: an array of text values that can be passed when starting the program.
    // The braces { } hold the code that runs in main.
    public static void main(String[] args) {

        // System is a built-in class. The dot (.) accesses a member inside that class.
        // out is System's standard output stream. println is a method on out.
        // The parentheses hold the value passed to println; quotes make a String literal.
        // println prints the text, then moves output to the next line. ; ends this statement.
        System.out.println("Hello, World!");

        // print is like println, but it does not move to a new line after printing.
        System.out.print("What is your name? ");

        // Scanner is the type; scanner is this variable's name.
        // new creates a Scanner object; System.in is the standard input stream (keyboard input).
        Scanner scanner = new Scanner(System.in);

        // nextLine() reads the full line the user types; = stores that text in name.
        String name = scanner.nextLine();

        // + joins text together. This prints a greeting using the value stored in name.
        System.out.println("Hello, " + name + "!");

    // printf formats values: %s is text and %n starts a new line.
    System.out.printf("Welcome, %s!%n", name);

        // close() releases the Scanner and its input resource when this program is done.
        scanner.close();
    }
}