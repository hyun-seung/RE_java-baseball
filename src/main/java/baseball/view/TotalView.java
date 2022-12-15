package baseball.view;

public class TotalView {

    OutputView output;
    InputView input;

    TotalView() {
        output = new OutputView();
        input = new InputView();
    }

    public void startGame() {
        output.printMain();
    }

    public int getBaseballNumber() {
        output.printInput();
        return input.getBaseballNumber();
    }

    public void printResult(int strikeCount, int ballCount) {
        output.printResult(strikeCount, ballCount);
    }

    public int getRestartOrEndNumber() {
        output.printGameEnd();
        return input.getRestartOrEndNumber();
    }
}
