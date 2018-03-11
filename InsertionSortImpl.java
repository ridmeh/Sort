import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by ridme on 3/2/2018.
 */
public class InsertionSortImpl implements  Sort{
    @Override
    public ArrayList<Integer> asc( final ArrayList<Integer> unsorted) {

        assert unsorted.size() != 0 :"no element to sort";

        // make a copy of list to be modified.
        ArrayList<Integer> elems = new ArrayList<Integer>(unsorted);

        for(int i = 1; i < elems.size(); i++){
            for(int j = i ; j > 0 ; j--){
                if( elems.get(j)  < elems.get(j-1) ) {
                    int tmp = elems.get(j);
                    elems.set(j, elems.get(j-1));
                    elems.set(j-1,  tmp);
                }
            }
        }
        return elems;
    }

    @Override
    public ArrayList<Integer>  desc( final ArrayList<Integer> elems) {
        return elems;
    }


}
