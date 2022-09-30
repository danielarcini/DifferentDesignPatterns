/**
 * Daniel Arciniega
 *  Iterator practice program
 */

import java.util.*;

public class IteratorMain {

    public static void main( String[] args ) {

        /*****
         * Add 10 random numbers between [0, 1000) to the numberList
         *****/
        NumberList numberList = new NumberList();
        for( int i = 0; i < 10; ++i ) {
            numberList.addNumber(((int)(Math.random() * 1000)));
        }

        /*****
         * : Create an iterator to go through the numberList and print each number.
         * If a number is greater than 500, remove it from the list.
         *****/
        Iterator<Integer> iterator = numberList.getIterator();
        System.out.println("Initial 10 numbers in the numberList");
        while( iterator.hasNext() ) {
            System.out.println(iterator.next());
        }
        Iterator iterator2 = numberList.getIterator();
        while (iterator2.hasNext()) {
            if ((Integer) iterator2.next() > 500)
                iterator2.remove();
        }
        System.out.println();
        System.out.println("********** Removed numbers greater than 500 ***********");

        /*****
         * : Go through the numberList again and print each number.
         *****/
        System.out.println("Numbers that are now in the numberList");
        Iterator iterator3 = numberList.getIterator();
        while(iterator3.hasNext())/** use iterator to move through the numberList )**/ {
            System.out.println(iterator3.next());
        }
    }
}