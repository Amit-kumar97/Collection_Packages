package Sortings;

import java.util.Arrays;

//------------Generics Implementation of Selection Sort

public class Selection_Sort<T extends Comparable<? super T>> {
    T[] ar;

    Selection_Sort(T[] ar)
    {
        this.ar = ar;
    }

    //-----------Method for Selection sort
    public T[] selectionsort()
    {
        int index;

        for (int i = 0; i < ar.length-1; i++) {
            index = i;
            for (int j = i+1; j < ar.length; j++)
            {
                if(ar[index].compareTo(ar[j])>0)
                    index = j;
            }

            if(index!=i)
            {
                T temp = ar[index];
                ar[index] = ar[i];
                ar[i] = temp;
            }
        }
        return ar;
    }
}

//class h
//{
//    public static void main(String[] args) {
//
//        Integer ar[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Selection_Sort<Integer> obj = new Selection_Sort<>(ar);
//        Integer[] arr = obj.selectionsort();
//        System.out.println(Arrays.toString(arr));
//    }
//}

