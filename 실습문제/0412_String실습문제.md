public class StringExam {
//물품번호를 받아들여서 물품번호규칙에 맞으면 true,
// 아니면 false를 리턴하는 메소드를 완성하세요.
// 조건1. 물품번호의 길이는 6이다.
// 조건2. 물품번호의 1,2 번째 자리는 알파벳이어야 한다. (대소문자 모두 가능)
// 조건3. 물품번호의 3-6 자리수는 숫자만 가능하다.

    public boolean checkProductNumber(String productNumber) {

        return false;
    }

    public static void main(String[] args) {
        StringExam se = new StringExam();
        System.out.println(se.checkProductNumber("te3456")); // true
        System.out.println(se.checkProductNumber("t33456")); //false
        System.out.println(se.checkProductNumber("ar49786"));//false
        System.out.println(se.checkProductNumber("test56"));//false
    }

}

public class StringExam2 {
//문자열을 입력받아서 공백의 개수를 리턴하는 메소드 
public static int spaceCount(String str) {
return 0;
}

    //문자열을 입력받아서 알파벳 개수를 리턴하는 메소드
    public static int alphaCount(String str) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(spaceCount("test tset ts ttt")); //3
        System.out.println(alphaCount("test tset ts ttt")); //13
    }

}

public class StringExam3 {
//문자열을 입력받아서 역순의 문자열로 바꾸어서 문자열을 리턴하는 메소드 ex) abc - > cda
public static String reverseChange(String str) {
return null;
}

    public static void main(String[] args) {
        System.out.println(reverseChange("abc")); //cba
    }

}
