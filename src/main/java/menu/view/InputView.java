package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.Validator;

public class InputView {

    public String readCoachNames() {
        String input = Console.readLine();
        Validator.validateCoachNamesInput(input);
        return input;
    }
}
