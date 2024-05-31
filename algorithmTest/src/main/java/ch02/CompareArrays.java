package ch02;

public class CompareArrays {
    // 두 배열이 동일한지 비교하는 메소드
    static boolean areArraysEqual(int[] array1, int[] array2) {
        // 먼저 배열의 길이를 비교
        if (array1.length != array2.length) {
            return false;
        }

        // 다음으로 배열의 각 요소를 비교
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // 모든 조건을 만족하면 true 반환
        return true;
    }

    public static void main(String[] args) {
        // 테스트를 위한 두 배열 선언
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        // areArraysEqual 메소드를 사용하여 배열 비교
        System.out.println("array1과 array2는 동일한가? " + areArraysEqual(array1, array2));
        System.out.println("array1과 array3는 동일한가? " + areArraysEqual(array1, array3));
    }
}