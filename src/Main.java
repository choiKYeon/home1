import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String 질문;
        int a = 1;
        while (true) {
            System.out.print("== 명언 앱 ==");
            try {
                질문 = scan.nextLine();
                scan.nextLine();
                if (질문.equals("등록")) {
                    System.out.println("명언 : 현재를 사랑하라.");
                    System.out.println("작가 : 작자미상");
                    System.out.println(a + "번 명언이 등록되었습니다.");
                    a++;
                    continue;
                } else if (질문.equals("종료")) {
                    break;
                } else if(질문.equals("목록")){
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------");
                    System.out.println("2 / 작자미상 / 과거에 집착하지 마라.");
                    System.out.println("1 / 작자미상 / 현재를 사랑하라.");
                    continue;
                }
            } catch (InputMismatchException e) {

            }

        }
        System.out.println("종료합니다");
    }
}