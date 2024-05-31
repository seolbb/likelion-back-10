package ch03;

import java.util.Scanner;

public class BinarySearchExample {
    // 요솟수가 size인 배열 arr에서 key와 같은 요소를 이진 검색
    static int binarySearch(int[] arr, int size, int key) {
        int left = 0;          // 검색 범위의 시작 인덱스
        int right = size - 1;  // 검색 범위의 끝 인덱스

        while (left <= right) {
            int mid = (left + right) / 2; // 중앙 요소의 인덱스
            if (arr[mid] == key)
                return mid;               // 검색 성공
            else if (arr[mid] < key)
                left = mid + 1;           // 검색 범위를 오른쪽 절반으로 좁힘
            else
                right = mid - 1;          // 검색 범위를 왼쪽 절반으로 좁힘
        }

        return -1;                       // 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 개수: ");
        int num = stdIn.nextInt();
        int[] array = new int[num];       // 요소 개수 num인 배열 생성

        System.out.println("오름차순으로 입력해주세요.");

        System.out.print("array[0]: ");   // 첫 번째 요소 입력
        array[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("array[" + i + "]: ");
                array[i] = stdIn.nextInt();
            } while (array[i] < array[i - 1]);  // 오름차순 유지를 위해 검사
        }

        System.out.print("찾을 숫자: ");  // 검색할 값 입력
        int key = stdIn.nextInt();

        int idx = binarySearch(array, num, key); // 배열 array에서 key 검색

        if (idx == -1)
            System.out.println("해당 숫자를 찾을 수 없습니다.");
        else
            System.out.println("해당 숫자는 array[" + idx + "]에 있습니다.");
    }
}

