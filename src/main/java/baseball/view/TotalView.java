package baseball.view;

import java.util.List;

public class TotalView {

    OutputView output;
    InputView input;

    public TotalView() {
        output = new OutputView();
        input = new InputView();
    }

    public void startGame() {
        output.printMain();
    }

    public List<Integer> getBaseballNumber() {
        output.printInput();
        return input.getBaseballNumber();
    }

    public void printResult(int ballCount, int strikeCount) {
        output.printResult(ballCount, strikeCount);
    }

    public int getRestartOrEndNumber() {
        output.printGameEnd();
        return input.getRestartOrEndNumber();
    }
}
