package com.personal.pattern.decorator;

import com.personal.pattern.decorator.beverage.Beverage;
import com.personal.pattern.decorator.beverage.Cappucino;
import com.personal.pattern.decorator.beverage.condiments.Mocha;
import com.personal.pattern.decorator.beverage.condiments.WhippedCream;
import com.personal.pattern.decorator.io.LowerCaseInputStream;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author ashoksrirampandian
 */
/*
    Decorator Pattern
    This pattern attaches additional responsibilities to an object dynamically. Decorators
    provide a flexible alternative to subclassing for extending functionality

    Design principles in play
    1. Class should be open for extension but closed for modification (Open Closed principle)
*/
public class Main {
    private static String FILE_PATH = "/Users/ashoksrirampandian/NetBeansProjects/Design Patterns/src/com/personal/pattern/decorator/test.txt";
    public static void main(String[] args) {
        String description = new String();
        
        Beverage b = new Cappucino();
        b.getDescription();
        b = new Mocha(b);
        b.getDescription();
        b = new WhippedCream(b);
        b.getDescription();
        
        System.out.println(b.getCost());
        
        testLowerCaseInputStream();
    }

    private static void testLowerCaseInputStream() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream( 
                                new BufferedInputStream (
                                    new FileInputStream(FILE_PATH)));
            
            while( ( c = in.read() ) >= 0 ) {
                System.out.print( (char) c );
            }
            
            in.close();
        } catch( IOException e ) {
            e.printStackTrace();
        } 
    }
}
