package baseball.domain;

import baseball.utils.Constants;
import baseball.view.TotalView;
import java.util.List;

public class BaseballGame {

    private final TotalView view;
    private Refree refree;
    private boolean isPlaying = false;

    public BaseballGame() {
        view = new TotalView();
        refree = new Refree();
    }

    public void start() {
        try {
            isPlaying = true;
            refree.setDefenceNumber();
            view.startGame();

            while (isPlaying) {
                getBaseballNumber();
                getResult();
            }
        } catch (IllegalArgumentException e) {

        }
    }

    private void getBaseballNumber() {
        List<Integer> baseballNumber = view.getBaseballNumber();
        refree.setOffenceNumber(baseballNumber);
    }

    private void getResult() {
        int ballCount = refree.getBallCount();
        int strikeCount = refree.getStrikeCount();
        view.printResult(ballCount, strikeCount);

        if (strikeCount == 3) {
            endOrRestart();
        }
    }

    private void endOrRestart() {
        int restartOrEndNumber = view.getRestartOrEndNumber();

        if (restartOrEndNumber == Constants.RESTART) {
            restart();
        }
        if(restartOrEndNumber == Constants.END) {
            end();
        }
    }

    private void restart() {
        refree.setDefenceNumber();
    }

    private void end() {
        isPlaying = false;
    }
}
