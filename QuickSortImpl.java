import java.util.ArrayList;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by ridme on 3/2/2018.
 */

public class QuickSortImpl implements Sort{
    @Override
    public  ArrayList<Integer>  asc( final ArrayList<Integer> unsorted) {
        // make a copy of list to be modified.
        ArrayList<Integer> elems = new ArrayList<Integer>(unsorted);

        return elems;
    }
    @Override
    public ArrayList<Integer> desc(final ArrayList<Integer> elems) {
        return elems;
    }
}
