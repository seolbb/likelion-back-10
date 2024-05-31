package ch02;

// 1,000 이하의 소수를 효율적으로 나열하는 방법

class OptimizedPrimeFinder {
    public static void main(String[] args) {
        int operationCount = 0;                         // 연산 횟수 (곱셈, 나눗셈)
        int primeCount = 0;                             // 찾은 소수의 개수
        int[] primes = new int[500];                    // 소수를 저장하는 배열

        primes[primeCount++] = 2;                       // 2는 소수
        primes[primeCount++] = 3;                       // 3은 소수

        for (int num = 5; num <= 1000; num += 2) {      // 조사 대상은 홀수만
            boolean isPrime = true;
            for (int i = 1; primes[i] * primes[i] <= num; i++) {
                operationCount += 2;
                if (num % primes[i] == 0) {             // 나누어떨어지면 소수가 아님
                    isPrime = false;
                    break;                              // 더 이상 반복 불필요
                }
            }
            if (isPrime) {                              // 소수임
                primes[primeCount++] = num;             // 배열에 소수 저장
                operationCount++;
            }
        }

        // 찾은 소수 출력
        for (int i = 0; i < primeCount; i++)
            System.out.println(primes[i]);

        System.out.println("연산 횟수(곱셈, 나눗셈): " + operationCount);
    }
}