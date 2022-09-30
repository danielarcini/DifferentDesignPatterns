public class NumberObserver implements Observer{
    private int [] observers;

    private static int observerIDTracker = 0;

    private int observerID;
    private NumberFacade numberFacade;

    public NumberObserver(NumberFacade numberFacade){
        this.numberFacade = numberFacade;
        this.observerID = ++observerIDTracker;

        numberFacade.register(this);

    }
    @Override
    public void update(int[] observers) {
        this.observers = observers;
        display();
    }

    public void display(){
        System.out.println("********** numberList has been updated ***********");
        for(int i = 0; i< this.observers.length;i++){
            System.out.println(this.observers[i]);
        }

    }
}
