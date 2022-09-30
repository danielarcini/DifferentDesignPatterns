
public class MultiplierOp extends NumberDecorator {
    public MultiplierOp(NumberDecor subtractOp) {
        super(subtractOp);
    }

    public int[] setNumbersList(int[] numberList) {
        this.numberList = numberList;
        return decorNumber.setNumbersList(numberList);
    }

    public void performNumberOperation() {
        super.performNumberOperation();
        System.out.println("********** Multiply all the numbers together ***********");
        int result = 1;
        for(int i =0; i< numberList.length;i++){
            result = numberList[i]* result;
        }
        System.out.println("Multiply operation result: " + result);
    }
}
