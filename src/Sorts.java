public class Sorts {
    public void burbujaMejorada(int arrayay[])
    {
        for(int i=0; i<array.length; i++){
            int swaps=0;
            for(int j=0; j<array.length-i-1; j++){
                if(arrayay[j]>arrayay[j+1]){
                    int t=arrayay[j];
                    arrayay[j]=arrayay[j+1];
                    arrayay[j+1]=t;
                    swaps++;
                }
            }
            if(swaps==0)
                break;
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
