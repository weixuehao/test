package wxh.sort;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Date;
//3秒
public class SelectSort {
    public static void main(String[] args) {
        //int[] list = {5,2,7,5,5,4,8,1};
        //selectSort(list);
        int[] arr = new int[80000];
        for(int i =0;i<80000;i++){
            arr[i] = (int)(Math.random()*8000000);
        }
        long start = System.currentTimeMillis();
        selectSort(arr);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time/1000);
    }

    public static int[] selectSort(int[] arr){
        int minindex = 0;
        int min = 0;
        for(int i = 0;i < arr.length-1; i++){
            minindex = i;
            min = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minindex = j;
                }
            }
            if(min != arr[i]){
                arr[minindex] = arr[i];
                arr[i] = min;
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
