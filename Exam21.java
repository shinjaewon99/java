interface Phone{
    final int TIME = 10000;
    void sendcall();
    void receivecall();

    default void printlogo(){
        System.out.println("Phone");
    }
}

class samsung implements Phone{

    @Override
    public void sendcall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receivecall() {
        System.out.println("전화가 왔습니다");
    }
    public void flash(){
        System.out.println("전화기에 불이켜졌습니다");
    }
}

public class Exam21 {

    public static void main(String[] args) {
    samsung phone = new samsung();
    phone.printlogo();
    phone.sendcall();
    phone.receivecall();
    phone.flash();
    }

}






