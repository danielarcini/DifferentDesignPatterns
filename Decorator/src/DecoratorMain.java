/**
 * Daniel Arciniega
 *  Decorator program
 */

public class DecoratorMain {

    public static void main( String[] args ) {

        /*****
         Add 10 random numbers between [0, 10) to a numberList
         *****/
        int numberList[] = new int[10];
        for( int i = 0; i < 10; ++i ) {
            numberList[i] = ((int)(Math.random() * 10));
        }
        /*****
         * Go through the numberList, printing each number.
         *****/
        System.out.println("Initial 10 numbers in the numberList");
        for(int i = 0; i< numberList.length; i++){
            System.out.println(numberList[i]);
        }
        /*****
         * - One class will add all the numbers together and print the result in the format: ("Add operation result: " + result)
         * - One class will subtract all the numbers from 100 and then print the result in the format: ("Subtract operation result: " + result)
         * - One class will multiple all the numbers together and then print the result in the format: ("Multiply operation result: " + result)
         *****/
        NumberDecorator numberDecorator = new MultiplierOp(new SubtractOp(new AddOp()));
        numberDecorator.setNumbersList( numberList );
        numberDecorator.performNumberOperation();
    }
}