package baseball.domain;

import baseball.utils.Constants;
import java.util.List;

public class Refree {

    DefenceNumber defenceNumber;
    List<Integer> offenceNumber;

    Refree() {
        defenceNumber = new DefenceNumber();
    }

    public void setDefenceNumber() {
        defenceNumber.clear();
        defenceNumber.create();
    }

    public void setOffenceNumber(List<Integer> offenceNumber) {
        this.offenceNumber = offenceNumber;
    }

    public int getBallCount() {
        int result = 0;
        for (Integer number : offenceNumber) {
            if (isBall(number)) {
                result++;
            }
        }
        return result;
    }

    private boolean isBall(Integer number) {
        int defence = defenceNumber.indexOf(number);
        int offence = offenceNumber.indexOf(number);

        if(defence != -1 && offence != defence) {
            return true;
        }
        return false;
    }

    public int getStrikeCount() {
        int result = 0;
        for (int i = 0; i < Constants.SIZE; i++) {
            if (isStrike(i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isStrike(int index) {
        int defence = defenceNumber.get(index);
        int offence = offenceNumber.get(index);

        if (defence == offence) {
            return true;
        }
        return false;
    }
}
