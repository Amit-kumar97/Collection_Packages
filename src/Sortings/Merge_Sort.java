package Sortings;

import java.util.Arrays;

//------------Generics Implementation of Merge Sort

public class Merge_Sort<T extends Comparable<? super T>> {
    T[] ar;

    //constructor
    Merge_Sort()
    {
        this.ar = ar;
    }

    //--------main function that sorts array[lb..ub] using merge()
    public T[] mergesort(T[] ar,int lb,int ub)
    {
        //--------base case
        if(lb<ub)
        {
            //-------find the middle point
            int m = (lb+ub)/2;

            mergesort(ar,lb,m);                   //--------sort first half
            mergesort(ar,m+1,ub);              //--------sort second half

            //-------merge the sorted halves
            merge(ar,lb,m,ub);
        }
        return ar;
    }

    //---------merges two subarrays of array[].
    public void merge(T[] ar,int lb,int m,int ub)
    {
        int n1 = m-lb+1;
        int n2 = ub-m;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        //--------fill in left array
        for (int i = 0; i <L.length ; i++) {
            L[i] = ar[lb+i];
        }
        //---------fill in right array
        for (int i = 0; i <R.length; i++) {
            R[i] = ar[m+1+i];
        }
        /* Merge the temp arrays */

        //------initial indexes of first and second subarrays
        int Lindex = 0,Rindex = 0;
        int currentindex = lb;

        //--------compare each index of the subarrays adding the lowest value to the currentIndex
        while(Lindex<L.length && Rindex<R.length)
        {
            if(L[Lindex].compareTo(R[Rindex])<=0)
            {
                ar[currentindex] = L[Lindex];
                Lindex++;
            }
            else
            {
                ar[currentindex] = R[Rindex];
                Rindex++;
            }
            currentindex++;
        }

        //--------copy remaining elements of leftArray[] if any
        while (Lindex<L.length)
            ar[currentindex++] = L[Lindex++];

        //------copy remaining elements of rightArray[] if any
        while (Rindex<R.length)
            ar[currentindex++] = R[Rindex++];
    }
}
//class h
//{
//    public static void main(String[] args) {
//
//   //     String[] ar = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
//
//        Double[] ar = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
//        Merge_Sort<Double> obj = new Merge_Sort<>();
//        Double[] arr = obj.mergesort(ar,0, ar.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//}