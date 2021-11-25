package wxh.sort;

import java.util.Arrays;
//720毫秒
public class InsertSort {
    public static void main(String[] args) {
        //int[] list = {3,2,7,5,9,4,8,1};
        //insertSort(list);
//测试时间
        int[] arr = new int[80000];
        for(int i =0;i<80000;i++){
            arr[i] = (int)(Math.random()*8000000);
        }
        long start = System.currentTimeMillis();
        System.out.println(start);
        insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end);
        long time = end - start;
        System.out.println(time/1000);
        //System.out.println(Arrays.toString(result));
        //System.out.println(result.length);
    }
    public static int[] insertSort(int[] arr){
        int insertval = 0;
        int insertindex = 0;
        for (int i = 1;i<arr.length; i++){
            insertval=arr[i];
            insertindex = i-1;
            while (insertindex>=0 && insertval<arr[insertindex]){
                arr[insertindex+1] = arr[insertindex];
                insertindex--;
            }
            if(insertindex+1!=i)
            arr[insertindex+1] = insertval;
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
