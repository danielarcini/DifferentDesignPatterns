public class AddOp implements NumberDecor{
    private int[] numberList;

    public int[] setNumbersList(int[] numberList) {
        this.numberList = numberList;
        return numberList;
    }

    public void performNumberOperation() {
        System.out.println("********** Add all the numbers from 100 ***********");
        int total = 0;
        for(int i = 0; i< numberList.length; i++){
            total = numberList[i] + total;
        }
        System.out.println("Add operation result: " + total);
    }

}
