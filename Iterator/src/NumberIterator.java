import java.util.Iterator;

public class NumberIterator implements Iterator<Integer>{

    private int [] newArray;
    private int curr_Elem = 0;
    private NumberList nl;

    public NumberIterator(NumberList nl){
        super();
        this.nl = nl;
    }
    @Override
    public boolean hasNext() {
        if (curr_Elem < nl.size) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
            return nl.nls[curr_Elem++];
    }
    public void remove() {
        newArray = new int[nl.size - 1];
        int j = 0;
        for(int i = 0 ; i < nl.size; i++){
            if(i != curr_Elem-1 ){
                newArray[j] = nl.nls[i];
                j++;
            }
        }
        nl.size = nl.size -1;
        curr_Elem = 0;
        nl.nls = newArray;
    }
}


