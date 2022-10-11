import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Exam23 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("이름을 입력하세요");

            String s = in.next();
            a.add(s);

        }

        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.println(name + "");


        }
        int index =0;
        for (int i = 1; i < a.size(); i++) {
            if(a.get(index).length() < a.get(i).length())
                index =i;

        }

        System.out.println("가장 긴이름은" + a.get(index));


        }
    }








