import java.util.Arrays;

/**
 * Author:  create by zwh
 * Time:2020/11/5 10:58
 */
public class maopao {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 6, 0, 1, 8};
        System.out.println("初始数组是" + Arrays.toString(arr));
        asort(arr);
        System.out.println("排序厚的数组" + Arrays.toString(arr));
        System.out.println(arr.length);
    }


    public static void asort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j]<arr[j+1]){
          int t=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=t;
            }
            }
        }

    }
}
