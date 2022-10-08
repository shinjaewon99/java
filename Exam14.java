
class Human{
    String name;
    int age;
    double height , weight;

    public Human(){
        String name;
    }
}
public class Exam14 {
    public static void main(String[] args) {

        Human aHuman = new Human();
        aHuman.name = "홍길동";
        aHuman.age = 21;
        aHuman.height = 180.5;
        aHuman.weight = 73.2;

        Human [] aHuman2 = new Human[5];
        for (int i = 0 ; i < aHuman2.length ; i++){
            aHuman2[i] = new Human();
            
        }
        }
    }



