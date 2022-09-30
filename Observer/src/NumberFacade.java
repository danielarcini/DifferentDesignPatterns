import java.util.ArrayList;

public class NumberFacade{
    private int [] nl;
    private ArrayList<Observer> observers;
    private int total;
    private int multiplied;
    private int subtracted;

    public NumberFacade(){
        observers = new ArrayList<Observer>();
    }

    public void addNumbers() {
        System.out.println("********** Add all the numbers together ***********");

        for(int i = 0; i< nl.length; i++){
            total = nl[i] + total;
        }
        int []newArray = new int[nl.length+1];
        for(int i = 0; i< nl.length; i++){
            newArray[i] = nl[i];
        }
        newArray[nl.length] = total;
        this.nl = newArray;

        notifyObservers();
    }
    public void setNumbersList(int[] numbersList){

        this.nl = numbersList;
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(nl);
        }
    }

    public void subtractNumbers() {
        System.out.println("********** Subtract all the numbers from 100 ***********");
        subtracted = 100;

        int []newArray = new int[nl.length+1];
        for(int i = 0; i< nl.length; i++){
            newArray[i] = nl[i];
            subtracted = subtracted - newArray[i];
        }

        newArray[nl.length] = subtracted;
        this.nl = newArray;

        notifyObservers();
    }

    public void multiplyNumbers() {
        System.out.println("********** Multiply all the numbers together ***********");
        multiplied = 1;
        for(int i =0; i< nl.length;i++){
            multiplied = nl[i]* multiplied;
        }

        int []newArray = new int[nl.length+1];
        for(int i = 0; i< nl.length; i++){
            newArray[i] = nl[i];
        }
        newArray[nl.length] = multiplied;
        this.nl = newArray;
        notifyObservers();
    }

    public void register(Observer newObserver){
        observers.add(newObserver);
    }
}
