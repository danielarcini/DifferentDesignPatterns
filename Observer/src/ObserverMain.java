/**
 * Daniel Arciniega
 * CSE 360: Assignment 3
 * Template file for starting the Observer practice program
 */

public class ObserverMain {

    public static void main( String[] args ) {

        /*****
         * TODO: Add 5 random numbers between [0, 10) to a numberList
         *****/
         int numberList[] = new int[5];
        for( int i = 0; i < 5; ++i ) {
            numberList[i] = ((int)(Math.random() * 10));
        }

        /*****
         * TODO: Go through the numberList, printing each number.
         *****/
        System.out.println("Initial 5 numbers in the numberList");
        for(int i = 0; i< numberList.length; i++){
            System.out.println(numberList[i]);
        }


        /*****
         * TODO: Add/edit code as necessary to create a class (or classes) that will complete each of the following:
         * - Add all the numbers together and then add the result to the numberList
         * - Subtract all the numbers from 100 and then add the result to the number list
         * - Multiple all the numbers together and then add the result to the number list
         *
         * Each time a new value is added to the numberList, the observer should print out the new list of numbers
         *****/
        NumberFacade numberFacade = new NumberFacade();
        numberFacade.setNumbersList( numberList );

        NumberObserver numberObserver = new NumberObserver( numberFacade );

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/

        numberFacade.addNumbers();

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.subtractNumbers();

        /**
         * TODO: Observer should print the message:
         * "********** numberList has been updated ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.multiplyNumbers();

    }
}