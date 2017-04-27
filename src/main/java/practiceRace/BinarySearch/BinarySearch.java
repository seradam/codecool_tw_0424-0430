package practiceRace.BinarySearch;

/**
 * Created by seradam on 2017.04.27..
 */
public class BinarySearch {

    int[] arr;

    public BinarySearch(int[] sortedarr){
        this.arr = sortedarr;
    }

    public int search(int target){
        int min = 0;
        int max = this.arr.length-1;
        while (min <= max){
            int guess = (min + max)/2;
            if(target == arr[guess]){
                return guess;
            }
            else if (target < arr[guess]){
                max = guess -1;
            }
            else{
                min = guess + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testarr = {1,5,8,12,36,42,67,85,95,111};
        BinarySearch bs = new BinarySearch(testarr);
        System.out.println(bs.search(1));
        System.out.println(bs.search(5));
        System.out.println(bs.search(8));
        System.out.println(bs.search(12));
        System.out.println(bs.search(36));
        System.out.println(bs.search(42));
        System.out.println(bs.search(67));
        System.out.println(bs.search(85));
        System.out.println(bs.search(95));
        System.out.println(bs.search(111));
    }
}
