package Arrays;

import java.util.Arrays;

public class Array_Operation<T extends Comparable<? super T>> {
    T[] ar;

    void insert(T values,int size)
    {
        ar = (T[]) new Array_Operation[size];
        if(ar.length==0)
            return;

        else
        {

        }
    }

    T deletion(T values)
    {
        if(ar.length==0)
            return null;

        else
        {
            int temp=0;
            for (int i = 0; i <ar.length ; i++) {

                if(ar[i].compareTo(values)==0)
                {
                    temp = i;
                }
            }
            return ar[temp];
        }
    }
    void mergeArray(T[] ar1, T[] ar2)
    {
        int size = ar1.length+ ar2.length;
        ar = (T[])new Array_Operation[size];
        for (int i = 0; i< ar1.length; i++)
        {
            ar[i] = ar1[i];
        }
        for (int i = 0; i < ar2.length ; i++) {
            ar[i+ ar1.length+1] = ar2[i];
        }
        print(ar);
    }
    void print(T[] ar)
    {
        System.out.println(Arrays.toString(ar));
    }

}
class test
{
    public static void main(String[] args) {
        Array_Operation<Integer> obj = new Array_Operation<Integer>();
        Integer ar1[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer ar2[] = {12,34,54,24,65,23};
        obj.mergeArray(ar1,ar2);
  //      obj.print(ar);
    }
}
