package Sortings;

import java.util.Arrays;

//------------Generics Implementation of Quick Sort

public class Quick_Sort<T extends Comparable<? super T>> {

    T[] ar;

    //constructor
    Quick_Sort()
    {
        this.ar = ar;
    }

    //-------method to implement Quick Sort
    public T[] quicksort(T[] ar,int start,int end)
    {
        if(start<end)
        {
            int pivot = partition(ar,start,end);
            //----------recursively calling the method here

            //----------left side of array
            quicksort(ar,start,pivot-1);
            //----------right side of array
            quicksort(ar,pivot+1,end);
        }
        return ar;
    }

    //---------here in this partition method we are going to break down the array
    //---------main logic of quick sort
    public int partition(T[] ar,int p,int q)
    {
        int pivotIndex = (p+q) / 2;
        T pivotValue = ar[pivotIndex];
        p--;
        q++;

        while (true)
        {
            //-----------start at the FIRST index of the sub-array and increment
            //-----------FORWARD until we find a value that is > pivotValue
            do p++;
            while (ar[p].compareTo(pivotValue) < 0);

            //----------start at the LAST index of the sub-array and increment
            //----------BACKWARD until we find a value that is < pivotValue
            do q--;
            while (ar[q].compareTo(pivotValue) > 0);

            if (p >= q)
                return q;

            //-----------swap values at the startIndex and endIndex
            T temp = ar[p];
            ar[p] = ar[q];
            ar[q] = temp;
        }
    }
}
//class h
//{
//    public static void main(String[] args) {
//
////        String[] ar = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
//
//        Double[] ar = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
//        Quick_Sort<Double> obj = new Quick_Sort<>();
//        Double [] arr = obj.quicksort(ar,0, ar.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//}