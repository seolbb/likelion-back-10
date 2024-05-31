package ch02;

class SumOfArrayElements {
    public static void main(String[] args) {
        // 배열 변수 선언과 함께 초기화
        int[] numbers = {5, 10, 15, 20, 25};

        // 배열의 각 요소 출력
        for (int i = 0; i < numbers.length; i++)
            System.out.println("numbers[" + i + "] = " + numbers[i]);

        int total = 0; // 합계를 저장할 변수
        // 확장 for 문을 사용하여 배열의 모든 요소의 합을 계산
        for (int num : numbers)
            total += num;

        // 결과 출력
        System.out.println("모든 요소의 합은 " + total + "입니다.");
    }
}