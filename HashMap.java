import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class HashMap {
    public static void main(String[] args) {

        HashMap<String , String> has = new HashMap<String , String>()     ;

        has.put("baby" , "아기");
        has.put("love" , "사랑");
        has.put("apple" , "사과");


        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("찾고싶은 단어를 입력하세요 : ");

            String s = in.next();

            if(s.equals("exit")){
                System.out.println("종료합니다");
                break;
            }
            String m = has.get(s);

            if (m == null){
                System.out.println(m + "없는 단어입니다");
            }

            else{
                System.out.println(m);
            }
        }
        in.close();




    }
    }

