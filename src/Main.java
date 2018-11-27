import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int array[]=null;
    public static void main(String args[]){
        menu();
    }
    public static void menu(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1. Generar array");
        System.out.println("2. Ordenar por bubble-sort");
        System.out.println("3. Ordenar por inserction-sort");
        System.out.println("4. Ordenar por selection-sort");
        System.out.println("5. Ordenar por quick-sort");
        System.out.println("6. Ordenar por merge-sort");
        System.out.println("7. Ordenar por shell-sort");
        System.out.println("8. Ordenar por heap-sort");
        System.out.println("9. Ordenar por radix-sort");
        System.out.println("10. Mostrar arreglo");
        System.out.println("11. Busqueda binaria");
        System.out.println("12. Salir");
        System.out.println("- - - - - - - - - - - - - - - - \nSelecciona una opción: ");
        int i= new Scanner(System.in).nextInt();
        switch (i){
            case 1:{
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Generando arreglo aleatorio");
                array= generateArray(1000); //
                break;
            }
            case 2: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("Burbuja mejorada: ");
                new Sorts().burbujaMejorada(array);
                showArray(array);
                break;
            }
            case 3:{
                System.out.println("-----------------------------------------------------------------");

                System.out.println("Inserction: ");
                new Sorts().inserccion(array);
                showArray(array);
                break;
            }
            case 4: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("Selection: ");
                new Sorts().seleccion(array);
                showArray(array);
                break;
            }
            case 5: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("QuickSort: ");
                new QuickSort().sort(array,0,array.length-1);
                showArray(array);
                break;
            }
            case 6: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("MergeSort");
                new MergeSort().sort(array,0,array.length-1);
                showArray(array);
                break;
            }
            case 7: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("Shell: ");
                new Sorts().shell(array);
                showArray(array);
                break;
            }
            case 8: {
                System.out.println("HeapSort: ");
                new HeapSort().sort(array);
                showArray(array);
                break;
            }
            case 9: {
                System.out.println("-----------------------------------------------------------------");

                System.out.println("RadixSort: ");
                new RadixSort().radixsort(array,array.length);
                showArray(array);
                break;
            }
            case 10: {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Mostrando arreglo");

                showArray(array);
                break;
            }
            case 11: {
                binarySearch();
                break;
            }
            case 12: System.exit(1);break;
            default: menu();
        }
        System.out.println("-----------------------------------------------------------------");

        menu();
    }
    public static int[] generateArray(int arrayLength){
        int []arr=new int[arrayLength];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)(Math.random()*1000);
        }
        showArray(arr);
        return arr;
    }
    public static void showArray(int array[]){
        System.out.println("-----------------------------------------------------------------");
        System.out.println(Arrays.toString(array));
    }
    public static void binarySearch(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Binary Search");
        new Sorts().burbujaMejorada(array);
        System.out.println("Ingresa el número a buscar: ");
        int number=new Scanner(System.in).nextInt();
        int result=new BinarySearch().binarySearch(array,0,array.length-1,number);
        if(result==-1) System.out.println("El número no se encuentra en el arreglo");
        else System.out.println("El número está en el indice: "+result);
    }
}
