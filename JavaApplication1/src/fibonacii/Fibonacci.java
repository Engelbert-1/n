/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacii;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author win
 */
public class Fibonacci {
    private final  List<BigInteger> fibonacci;

    public Fibonacci() {
        this.fibonacci = new ArrayList();
    }
    
    /**
     * This method used to display Fibonacci number on the screen
     *
     * @param maxNumber the number max of Fibonacci number
     * @param message   the message to be printed instructing the user to input
     */
    public void displayFibonacci(long maxNumber, String message) {
        System.out.println(message);
       generateFibonacci(maxNumber);
        for (int i = 0; i < fibonacci.size(); i++) {
            if(i==fibonacci.size()-1){
                System.out.print(fibonacci.get(i)+".");
                break;
            }
            System.out.print(fibonacci.get(i)+", ");
        }
        System.out.println("");
    }

     /**
     * This method generates Fibonacci numbers using recursion.
     *
     * @param number the number of Fibonacci will be generated
     */
    public void generateFibonacci(long number) {
        // Clear the previous results
        fibonacci.clear();

        // Generate Fibonacci sequence recursively
        generateFibonacciRecursive(number, BigInteger.ZERO, BigInteger.ONE);
    }
    
    /**
     * This method is a helper method to generate Fibonacci number 
     * using recursion.
     *
     * @param number    the number of Fibonacci will be generated
     * @param current   the current number in Fibonacci sequence
     * @param previous  the previous number in Fibonacci sequence
     */
    private void generateFibonacciRecursive(long number, BigInteger current,
            BigInteger previous) {
        if (number > 0) {
            fibonacci.add(current);
            BigInteger next = current.add(previous);
            generateFibonacciRecursive(number - 1, next, current);
        }
    }
}
