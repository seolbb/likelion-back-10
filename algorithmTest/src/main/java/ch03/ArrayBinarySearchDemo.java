package ch03;
import java.util.Arrays;
import java.util.Scanner;

class ArrayBinarySearchDemo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 개수: ");
        int count = stdIn.nextInt();
        int[] array = new int[count];             // 요소 개수 count인 배열

        System.out.println("오름차순으로 입력해주세요.");

        System.out.print("array[0]: ");           // 첫 번째 요소 입력
        array[0] = stdIn.nextInt();

        for (int i = 1; i < count; i++) {
            do {
                System.out.print("array[" + i + "]: ");
                array[i] = stdIn.nextInt();
            } while (array[i] < array[i - 1]);  // 오름차순을 유지하기 위한 검증
        }

        System.out.print("찾을 값: ");         // 검색할 값 입력
        int searchValue = stdIn.nextInt();

        int resultIndex = Arrays.binarySearch(array, searchValue); // 배열 array에서 searchValue 검색

        if (resultIndex < 0)
            System.out.println("해당 값의 요소가 없습니다.");
        else
            System.out.println("해당 값은 array[" + resultIndex + "]에 있습니다.");
    }
}