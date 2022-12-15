package baseball.view;

import baseball.utils.Validate;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    private final Validate validate;

    InputView() {
        validate = new Validate();
    }

    public List<Integer> getBaseballNumber() {
        String input = Console.readLine();
        validate.isBaseballNumber(input);
        return stringToIntegerList(input);
    }

    private List<Integer> stringToIntegerList(String target) {
        List<Integer> result = new ArrayList<>();
        for (String number : target.split("")) {
            result.add(Integer.parseInt(number));
        }
        return result;
    }

    public int getRestartOrEndNumber() {
        String input = Console.readLine();
        validate.isRestartOrEndNumber(input);
        return Integer.parseInt(input);
    }
}
