package numberbaseball;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (true) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            // TODO: strike 개수를 계산하세요
            int number = 3;
            int number2 = 8;
            int number3 = 9;

            int strike = 0;
            if (user1 == number) {
                strike = strike + 1;

            }
            if (user2 == number2) {
                strike = strike + 1;
            }

            if (user3 == number3) {
                strike = strike + 1;
            }


            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.println(strike + "스트라이크");




            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if (strike == 3) {
                break;
            }
            int ball = 0;//볼 개수
            boolean isCorrect = false; // 정답 여부
            // 여기서부터 학생들이 작성할 코드 영역입니다
            // TODO: strike와 ball의 개수를 계산하세요
            if(!(user1 == number)){
                ball = ball +1;
            }


            // TODO: 결과를 출력하세요 (예: "1 스트라이크 1 볼")


            // TODO: 3 스트라이크인 경우 isCorrect를 true로 변경하세요


        }

        System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
