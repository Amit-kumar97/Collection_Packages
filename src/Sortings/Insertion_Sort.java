package Sortings;

import java.util.Arrays;

//------------Generics Implementation of Insertion Sort

public class Insertion_Sort<T extends Comparable<? super T>>
{
    T[] ar;

    ///constructor
    Insertion_Sort(T[] ar)
    {
        this.ar = ar;
    }

    //----------Method to implement Insertion Sort
    public T[] insertionsort()
    {
        for (int i = 1; i < ar.length; i++) {
            T temp = ar[i];
            int j = i;

            while (j > 0 && ar[j - 1].compareTo(temp)>0)
            {
                ar[j] = ar[j - 1];
                j--;
            }

            ar[j] = temp;
        }
        return ar;
    }
}

//class h
//{
//    public static void main(String[] args) {
//
//        String[] ar = {"Earl", "Robert", "Asha", "Arthur"};
//        Insertion_Sort<String> obj = new Insertion_Sort<>(ar);
//        String[] arr = obj.insertionsort();
//        System.out.println(Arrays.toString(arr));
//    }
//}