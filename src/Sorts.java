public class Sorts {
    public void burbujaMejorada(int arrayay[])
    {
        int buffer;
        int i,j;
        for(i = 0; i < arrayay.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                if(arrayay[i] < arrayay[j])
                {
                    buffer = arrayay[j];
                    arrayay[j] = arrayay[i];
                    arrayay[i] = buffer;
                }
            }
        }
    }

    public void inserccion(int array[])
    {
        int n = array.length;
        for (int i=1; i<n; ++i)
        {
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }
    public void seleccion(int[]arrayay)
    {
        int i, j, k, p, buffer, limit = arrayay.length-1;
        for(k = 0; k < limit; k++)
        {
            p = k;
            for(i = k+1; i <= limit; i++)
                if(arrayay[i] < arrayay[p]) p = i;
            if(p != k)
            {
                buffer = arrayay[p];
                arrayay[p] = arrayay[k];
                arrayay[k] = buffer;
            }
        }
    }
     public void shell(int[] arrayay)
    {
        for ( int increment = arrayay.length / 2; increment > 0; increment =
                (increment == 2 ? 1 : (int) Math.round(increment / 2.2)))
        {
            for (int i = increment; i < arrayay.length; i++)
            {
                for (int j = i; j >= increment && arrayay[j - increment] >
                        arrayay[j]; j -= increment)
                {
                    int temp = arrayay[j];
                    arrayay[j] = arrayay[j - increment];
                    arrayay[j - increment] = temp;
                }
            }
        }
    }


}
