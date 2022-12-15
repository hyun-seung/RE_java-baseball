package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class DefenceNumber {

    private List<Integer> defenceNumber;

    DefenceNumber() {
        defenceNumber = new ArrayList<>();
    }

    public void create() {
        while (defenceNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!defenceNumber.contains(randomNumber)) {
                defenceNumber.add(randomNumber);
            }
        }
    }

    public Integer get(int index) {
        return defenceNumber.get(index);
    }

    public int indexOf(int number) {
        return defenceNumber.indexOf(number);
    }

    public void clear() {
        defenceNumber.clear();
    }
}
