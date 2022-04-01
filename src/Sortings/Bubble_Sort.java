package Sortings;

import java.util.Arrays;

//------------Generics Implementation of Bubble Sort

public class Bubble_Sort<T extends Comparable<? super T>> {
    T[] ar;

    //constructor
    Bubble_Sort(T[] ar)
    {
        this.ar = ar;
    }

    //----------Method to Implement Bubble Sort
    public T[] bubblesort()
    {
        for (int i = 0; i < ar.length-1; i++)
        {
            for (int j = 0; j < ar.length-1-i; j++)
            {
                if(ar[j].compareTo(ar[j+1])>0)
                {
                    T temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        return ar;
    }
}

//class h
//{
//    public static void main(String[] args) {
//        String[] ar = {"Earl", "Robert", "Asha", "Arthur"};
//        Bubble_Sort<String> obj = new Bubble_Sort<>(ar);
//        String[] arr = obj.bubblesort(ar);
//        System.out.println(Arrays.toString(arr));
//    }
//}
