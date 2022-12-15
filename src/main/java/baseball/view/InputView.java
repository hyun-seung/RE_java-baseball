package baseball.view;

import baseball.utils.Validate;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final Validate validate;

    InputView() {
        validate = new Validate();
    }

    public int getBaseballNumber() {
        String input = Console.readLine();
        validate.isBaseballNumber(input);
        return Integer.parseInt(input);
    }

    public int getRestartOrEndNumber() {
        String input = Console.readLine();
        validate.isRestartOrEndNumber(input);
        return Integer.parseInt(input);
    }
}
