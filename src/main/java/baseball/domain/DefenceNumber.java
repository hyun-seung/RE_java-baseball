package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class DefenceNumber {

    private List<Integer> defenceNumber;

    private void create() {
        defenceNumber = new ArrayList<>();

        while(defenceNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!defenceNumber.contains(randomNumber)) {
                defenceNumber.add(randomNumber);
            }
        }
    }
}
