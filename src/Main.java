import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }



        int[] first = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] second = Arrays.copyOfRange(a, a.length / 2, a.length);


        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }


    public static void merge(int []first, int []second, int [] a) {

        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length)
            if (first[iFirst] < second[iSecond]) a[j] = first[iFirst];




//        increment iFirst else
//
//        a[j] = second[iSecond]
//
//        increment iSecond
//
//        increment j ENDWHILE

    }


}