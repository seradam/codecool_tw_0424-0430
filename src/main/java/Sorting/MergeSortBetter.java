package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.04.27..
 */
public class MergeSortBetter {

    public int[] mergeSort(int[] array){
        if (array.length > 1) {
            int[] arr1 = new int[array.length / 2];
            int[] arr2 = new int[array.length - arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = array[i];
            }
            for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
                arr2[i - arr1.length] = array[i];
            }
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);


            int i = 0;
            int j = 0;
            int k = 0;

            while (j < arr1.length && k < arr2.length){
                if(arr1[j] < arr2[k]){
                    array[i] = arr1[j];
                    i++;
                    j++;
                }else {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while (j < arr1.length){
                array[i] = arr1[j];
                i++;
                j++;
            }
            while (k < arr2.length){
                array[i] = arr2[k];
                i++;
                k++;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] testArray = {13,42,25,7,89,6,36,1,2,5,42};
        MergeSortBetter ms = new MergeSortBetter();
        System.out.println(Arrays.toString(ms.mergeSort(testArray)));

    }
}
