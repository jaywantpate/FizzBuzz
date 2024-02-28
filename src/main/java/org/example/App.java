package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String FizzBuzz(int x){
        String ans = " ";
        if(x%3 == 0)
            ans ="Fizz";
        else if(x%5 == 0)
            ans = "Buzz";
        return ans;
    }
    public static void main( String[] args ) {
    }
}
