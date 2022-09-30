import java.util.Iterator;
public class NumberList implements Container{

    int [] nls;
    int size= 0;

    public NumberList(){
        super();
        nls = new int[10];
    }

    public void addNumber(int i){
        nls[size] = i;
        size++;
    }

    @Override
    public Iterator<Integer> getIterator() {

        return new NumberIterator(this);
    }


}
