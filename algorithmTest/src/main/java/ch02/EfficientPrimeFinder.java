package ch02;

// 1,000 이하의 소수를 효율적으로 나열하는 클래스

class EfficientPrimeFinder {
    public static void main(String[] args) {
        int divisionCount = 0;                        // 나눗셈 연산 횟수
        int primeCount = 0;                           // 찾은 소수의 개수
        int[] primes = new int[500];                  // 소수를 저장할 배열

        primes[primeCount++] = 2;                     // 2는 첫 번째 소수

        for (int candidate = 3; candidate <= 1000; candidate += 2) { // 홀수만 소수 후보로 검사
            int i;
            for (i = 1; i < primeCount; i++) {        // 이미 찾은 소수들로 나누어보기
                divisionCount++;
                if (candidate % primes[i] == 0)       // 나누어 떨어지면 소수가 아님
                    break;                            // 더 이상 검사할 필요 없음
            }
            if (primeCount == i)                      // 모든 소수로 나누어떨어지지 않음
                primes[primeCount++] = candidate;     // 소수 목록에 추가
        }

        for (int i = 0; i < primeCount; i++)          // 찾은 모든 소수 출력
            System.out.println(primes[i]);

        System.out.println("나눗셈 연산을 수행한 횟수: " + divisionCount);
    }
}