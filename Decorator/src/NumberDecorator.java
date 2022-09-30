public abstract class NumberDecorator implements NumberDecor {

    int [] numberList;
    protected NumberDecor decorNumber;

    public NumberDecorator(NumberDecor decorNumber){
        numberList = new int[10];
        this.decorNumber = decorNumber;
    }

    public void performNumberOperation() {
        this.decorNumber.performNumberOperation();
    }

    public int[] setNumbersList(int[] numberList){
        this.numberList = numberList;
        return decorNumber.setNumbersList(numberList);
    }

}


