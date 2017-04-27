package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.04.25..
 */
public class MergeSort {
    private int[] numbers;
    private int[] helper;
    private int number;

    public void sort(int[] inputarray){
        this.numbers = inputarray;
        number = inputarray.length;
        this.helper = new int[number];
        mergeSort(0, number-1);

    }

    public void mergeSort(int low, int high){
        if(low < high){
            int middle = (high + low)/2;
            mergeSort(low,middle);
            mergeSort(middle+1,high);
            merge(low,middle,high);
        }

    }

    public void merge(int low, int middle, int high){
        for(int i = low; i <= high; i++){
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while(i <= middle && j <= high){
            if(helper[i]< helper[j]){
                numbers[k] = helper[i];
                i++;
            }else{
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            numbers[k] = helper[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] array= {10,6,15,4,1,35,42,23,8,11};
        MergeSort ms = new MergeSort();
        ms.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
