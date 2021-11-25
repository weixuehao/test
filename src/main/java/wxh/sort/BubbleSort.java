package wxh.sort;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
//12秒
public class BubbleSort {
    public BubbleSort(){}
    public static void main(String[] args) {
        //int[] list = {3,2,7,5,9,4,8,1};
        //bubble(list);

        int[] arr = new int[80000];
        for(int i =0;i<80000;i++){
            arr[i] = (int)(Math.random()*8000000);
        }
        long start = System.currentTimeMillis();
        bubble(arr);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time/1000);
    }

    public static int[] bubble(int[] list){
        int temp=0;
        boolean flx = false;
        for(int i=0;i<list.length-1;i++){
            for(int j = 0;j<list.length-1-i;j++){
                if(list[j]>list[j+1]){
                    flx = false;
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
            }
            //System.out.println(ArrayUtils.toString(list));
            if(flx) break;
            else flx = true;
        }

        return list;
    }
}
