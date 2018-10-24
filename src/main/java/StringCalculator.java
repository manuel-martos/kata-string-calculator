import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringCalculator {
    private static final String COMA_SEPARATOR = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    int add(String input) {
        return sumNumbers(getNumbers(input));
    }

    private List<String> getNumbers(String input) {
        List<String> result = new ArrayList<>();
        if (!input.isEmpty()) {
            String[] inputSplit = input.split(COMA_SEPARATOR);
            for (String item : inputSplit) {
                if (item.contains(NEW_LINE_SEPARATOR)) {
                    result.addAll(Arrays.asList(item.split(NEW_LINE_SEPARATOR)));
                } else {
                    result.add(item);
                }
            }
        }
        return result;
    }

    private int sumNumbers(List<String> numbers) {
        int result = 0;
        for (String number : numbers) {
            result += Integer.valueOf(number);
        }
        return result;
    }
}