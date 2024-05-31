package annotation;

//@PrintAnnotation
@Count100
public class Service {
    @PrintAnnotation("@")
    public void method01(){
        System.out.println("method 01 run");
    }
    @PrintAnnotation("&")
    public void method02(){
        System.out.println("method 02 run");
    }
    @PrintAnnotation(value = "#", number = 10)
    public void method03(){
        System.out.println("method 03 run");
    }
    public void method04(){
        System.out.println("method 04 run");
    }
}
