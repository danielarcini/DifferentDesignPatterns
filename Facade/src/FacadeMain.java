/**
 * Daniel Arciniega
 *  Facade program
 */

public class FacadeMain {

    public static void main( String[] args ) {

        /*****
         * Add 10 random numbers between [0, 10) to the numberList
         *****/
        int numberList[] = new int[10];
        for( int i = 0; i < 10; ++i ) {
            numberList[i] = ((int)(Math.random() * 10));
        }

        /*****
         * : Go through the numberList, printing each number.
         *****/
        System.out.println("Initial 10 numbers in the numberList");
        for(int i = 0; i< numberList.length; i++){
            System.out.println(numberList[i]);
        }

        /*****
         * Add/edit code as necessary to create a facade class that will complete each of the following:
         * - Add all the numbers together and print the result
         * - Subtract all the numbers from 100 and print the result
         * - Multiple all the numbers together and print the result
         *****/
        NumberFacade numberFacade = new NumberFacade();
        numberFacade.setNumbersList( numberList );

        /**
         * : The function should print the message:
         * "********** Add all the numbers together ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.addNumbers();

        /**
         * : The function should print the message:
         * "********** Subtract all the numbers from 100 ***********"
         * to make it easier to understand the output.
         **/

        numberFacade.subtractNumbers();

        /**
         * : The function should print the message:
         * "********** Multiply all the numbers together ***********"
         * to make it easier to understand the output.
         **/
        numberFacade.multiplyNumbers();

    }
}