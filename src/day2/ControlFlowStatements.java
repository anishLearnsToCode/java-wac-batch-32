package day2;

public class ControlFlowStatements {
    public static void main(String[] args) {
        // continue
//        for (int i = 0 ; i < 10 ; i++) {
//            if (2 <= i && i <= 5) {
//                continue;
//            }
//
//            System.out.println(i);
//        }


        // break
        for (int i = 0 ; i < 10 ; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("i am outside loop");
    }
}
