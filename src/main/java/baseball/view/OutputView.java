package baseball.view;

public class OutputView {

    private static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String ZERO_MATCHING = "낫싱";
    private static final String THREE_STRIKE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_OR_END = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public void printMain() {
        System.out.println(GAME_START);
    }

    public void printInput() {
        System.out.print(INPUT_NUMBER);
    }

    public void printResult(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            printZeroMatching();
            return;
        }
        printBall(ballCount);
        printStrike(strikeCount);
    }

    private void printBall(int ballCount) {
        if (ballCount > 0) {
            System.out.print
                    (ballCount + BALL + " ");
        }
    }

    private void printStrike(int strikeCount) {
        if (strikeCount == 0) {
            System.out.println();
        }

        if (strikeCount > 0) {
            System.out.println(strikeCount + STRIKE);
        }
    }

    private void printZeroMatching() {
        System.out.println(ZERO_MATCHING);
    }

    public void printGameEnd() {
        System.out.println(THREE_STRIKE);
        System.out.println(RESTART_OR_END);
    }
}
