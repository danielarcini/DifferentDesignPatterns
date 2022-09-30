public class SubtractOp extends NumberDecorator{

    public SubtractOp(NumberDecor addOp) {
        super(addOp);
    }

    public int[] setNumbersList(int[] numberList) {
        this.numberList = numberList;
        return decorNumber.setNumbersList(numberList);
    }

    public void performNumberOperation() {
        super.performNumberOperation();
        System.out.println("********** Subtract all the numbers from 100 ***********");
        int subtracted = 100;

        for(int i = 0; i< numberList.length; i++){
            subtracted = subtracted - numberList[i];
        }
        System.out.println("Subtract operation result: " + subtracted);
    }
}
