package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.04.25..
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] array= {10,6,15,4,1,35,42,23,8,11};
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.bubbleSort(array)));
    }


}
