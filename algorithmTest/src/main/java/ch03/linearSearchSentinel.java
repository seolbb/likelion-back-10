package ch03;

import java.util.Scanner;

class LinearSearchSentinel {
    // 배열 arr에서 key와 일치하는 요소를 보초법을 사용하여 선형 검색
    static int linearSearchSentinel(int[] arr, int size, int key) {
        int i = 0;
        arr[size] = key; // 보초 추가

        while (true) {
            if (arr[i] == key)
                break;
            i++;
        }
        return i == size ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 개수: ");
        int num = stdIn.nextInt();
        int[] array = new int[num + 1]; // 요소 개수가 num + 1인 배열로, 마지막은 보초용

        for (int i = 0; i < num; i++) {
            System.out.print("array[" + i + "]: ");
            array[i] = stdIn.nextInt();
        }

        System.out.print("찾을 값: "); // 찾고자 하는 값 입력
        int key = stdIn.nextInt();

        int index = linearSearchSentinel(array, num, key); // 배열 array에서 key를 검색

        if (index == -1)
            System.out.println("찾는 값의 요소가 없습니다.");
        else
            System.out.println("찾는 값은 array[" + index + "]에 있습니다.");
    }
}