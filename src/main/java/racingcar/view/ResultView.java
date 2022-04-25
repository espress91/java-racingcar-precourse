package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.ArrayList;

public class ResultView {

    public static void print(String contents) {
        System.out.println(contents);
    }

    public static void carLineView(String carName, int position) {
        String carLine = "";
        for (int i = 0; i < position; i++) {
            carLine = carLine + "-";
        }
        System.out.println(carName + " : " + carLine);
    }

    public static void winnerNameView(ArrayList winnerList) {
        String winners = ((RacingCar)winnerList.get(0)).getCarName();
        for (int i = 1; i < winnerList.size(); i++) {
            winners = winners + ", " + ((RacingCar)winnerList.get(i)).getCarName();
        }
        System.out.println( "최종 우승자는 " + winners + " 입니다.");
    }

    public static void newLine() {
        System.out.println();
    }
}
