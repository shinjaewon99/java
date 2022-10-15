import java.io.*;

interface Function{
    void print();
}
public class java1 {
    public static void main(String[] args) {
        Function f = () -> {
            System.out.println("Hello");
        };


        f.print(); // 람다식 호출

        f  = () -> System.out.println("안녕"); // 람다식 작성


        f.print();
    }
}
