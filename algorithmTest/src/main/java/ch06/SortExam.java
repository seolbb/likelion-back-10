package ch06;

import java.util.Arrays;

public class SortExam {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){ //한번 돌면 마지막 요소 하나가 정렬됨.
                //인접한 두 요소를 비교해서 앞의요소가 뒤에요소보다 큰 값이면 교환
                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    swap(arr,j,j+1);
                }
            }
            System.out.println(i+1+"번째 :: "+Arrays.toString(arr));
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            //최소값을 찾는다.
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr,i,minIndex);

            System.out.println(i+1+"번째 :: "+Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr = {64,33,67,22,6,88,5};
        System.out.println("원래배열 : " + Arrays.toString(arr));

//        bubbleSort(arr);
        selectionSort(arr);

        System.out.println("정렬 후 배열 : " + Arrays.toString(arr));

    }
}
