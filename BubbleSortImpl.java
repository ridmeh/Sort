import java.util.ArrayList;

/**
 * Created by ridme on 3/11/2018.
 */
public class BubbleSortImpl implements Sort{
    @Override
    public ArrayList<Integer> asc(final ArrayList<Integer> unsorted) {
        assert unsorted.size() != 0 :"no element to sort";

        // make a copy of list to be modified.
        ArrayList<Integer> elems = new ArrayList<Integer>(unsorted);
        for(int i=0;i< elems.size(); i++){
            for(int j= i+1 ;j<elems.size();j++){
                if( elems.get(i)  > elems.get(j) ) {
                    // Swap
                    int tmp = elems.get(i);
                    elems.set(i, elems.get(j));
                    elems.set(j,  tmp);
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
