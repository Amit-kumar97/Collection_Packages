package Arrays;

public class Array_Operation<T extends Comparable<? super T>> {
    T[] ar;

    public Array_Operation(int size)
    {
        ar = (T[]) new Array_Operation[size];
    }

    void insert(T values)
    {
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
}
