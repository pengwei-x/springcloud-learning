package sort;

/**
 * @author pengwei
 * @date 2023/2/16
 */
public class QuickSortDemo {


    public static void quickSort(int[] arr, int left, int right) {

        if (left>right){
            return;
        }
        int x=0;
        int i = left;
        int j = right;
       int temp = arr[left];
        while (i <j) {

            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {

//                arr[j] = arr[j] ^ arr[i];
//                arr[i] = arr[j] ^ arr[i];
//                arr[j] = arr[j] ^ arr[i];
                x = arr[j];
                arr[j] = arr[i];
                arr[i] =x;
            }
        }
        //找到基数放置好位置
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    public static void sort(int[] arrays, int left, int right) {
        if(left > right) {
            return;
        }
        int l = left;
        int r = right;
        int pivot = arrays[left];
        int temp = 0;
        while(l < r) {
            while(pivot <= arrays[r] && l < r) {
                r--;
            }
            while(pivot >= arrays[l] && l < r) {
                l++;
            }
            if(l < r) {
                temp = arrays[r];
                arrays[r] = arrays[l];
                arrays[l] = temp;
            }
        }
        arrays[left] = arrays[l];
        arrays[l] = pivot;
        sort(arrays, left, l - 1);
        sort(arrays, l + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
//        quickSort(arr,0,arr.length-1);
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
