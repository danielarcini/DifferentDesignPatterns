public interface Facade {

    public void addNumbers();
    public void setNumbersList(int[] numbersList);
    public void notifyObservers();
    public void register(Observer newObserver);
}
