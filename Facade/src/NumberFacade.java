public class NumberFacade {
    private int[] numberlist;
    private int total;

    public void setNumbersList(int[] numberList) {
        this.numberlist = numberList;
    }

    public void addNumbers() {
        System.out.println("********** Add all the numbers together ***********");
        for(int i = 0; i< numberlist.length; i++){
            total = numberlist[i] + total;
        }
        System.out.println(total);
    }

    public void subtractNumbers() {
        System.out.println("********** Subtract all the numbers from 100 ***********");
        int subtracted = 100;

        for(int i = 0; i< numberlist.length; i++){
            subtracted = subtracted - numberlist[i];
        }
        System.out.println(subtracted);
    }

    public void multiplyNumbers() {
        System.out.println("********** Multiply all the numbers together ***********");
        int multiplied = 1;
        for(int i =0; i< numberlist.length;i++){
            multiplied = numberlist[i]* multiplied;
        }
        System.out.println(multiplied);
    }
}
