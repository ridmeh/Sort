import java.util.ArrayList;

/**
 * Created by ridme on 3/2/2018.
 */
public class DoSort {
    public static void main(String[] arr){

        ArrayList<Integer> elems = new ArrayList<Integer>();

        elems.add(5);
        elems.add(7);
        elems.add(2);
        elems.add(5);
        elems.add(2);
        elems.add(1);
        elems.add(-9);
        elems.add(7);
        elems.add(-40);

        System.out.println("Before Sorting:");
        for (Integer elem : elems) {
            System.out.println(elem.intValue());
        }

        BubbleSortImpl bs = new BubbleSortImpl();
        ArrayList<Integer> sortedBubble = bs.asc(elems);

        System.out.println("After Bubble Sorting:");
        for (Integer elem : sortedBubble)
            System.out.println(elem.intValue());

        // Insertion Sort
        // Adaptive, stable, inplace, online-can sort as it receives
        InsertionSortImpl is = new InsertionSortImpl();
        ArrayList<Integer> sortedIns = is.asc(elems);

        System.out.println("After Insertion Sorting:");
        for (Integer elem : sortedIns)
            System.out.println(elem.intValue());

        // Quick Sort
        QuickSortImpl qs = new QuickSortImpl();
        ArrayList<Integer> sortedQuick = qs.asc(elems);

        System.out.println("After Quick Sorting:");
        for (Integer elem : sortedQuick)
            System.out.println(elem.intValue());


        // based on distribution of data
        // need strategy pattern to define which sort to use



    }
}
