package baseball.utils;

import java.util.HashSet;

public class Validate {

    public void isBaseballNumber(String target) {
        isNumber(target);
        isNotHaveZero(target);
        isRightSize(target);
        isAnotherNumber(target);
    }

    public void isRestartOrEndNumber(String target) {
        isNumber(target);
        isRestartOrEnd(target);
    }

    private void isNumber(String target) {
        String numberRegex = "^[0-9]*$";
        if (!target.matches(numberRegex)) {
            throw new IllegalArgumentException();
        }
    }

    private void isNotHaveZero(String target) {
        String notHaveZeroRegex = "^[^0]*$";
        if (!target.matches(notHaveZeroRegex)) {
            throw new IllegalArgumentException();
        }
    }

    private void isRightSize(String target) {
        if (target.length() != Constants.SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void isAnotherNumber(String target) {
        HashSet<Integer> set = new HashSet<>();
        for (String split : target.split("")) {
            set.add(Integer.parseInt(split));
        }
        if (set.size() != Constants.SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void isRestartOrEnd(String target) {
        String restartOrEndRegex = "^[1-2]$";
        if (!target.matches(restartOrEndRegex)) {
            throw new IllegalArgumentException();
        }
    }
}
