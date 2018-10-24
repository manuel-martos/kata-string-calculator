import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringCalculator {
    private static final String COMA_SEPARATOR = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String SEPARATOR_SPECIFIER = "//";

    int add(String input) {
        List<String> separators;
        if (hasSeparatorSpecifier(input)) {
            separators = getSeparators(input);
            input = removeSeparatorSpecifier(input);
        } else {
            separators = getDefaultSeparators();
        }
        return sumNumbers(getNumbers(input, separators));
    }

    private List<String> getSeparators(String input) {
        List<String> separators = new ArrayList<>();
        int idx = input.indexOf(NEW_LINE_SEPARATOR);
        separators.add(input.substring(SEPARATOR_SPECIFIER.length(), idx));
        return separators;
    }

    private List<String> getDefaultSeparators() {
        List<String> separators = new ArrayList<>();
        separators.add(COMA_SEPARATOR);
        separators.add(NEW_LINE_SEPARATOR);
        return separators;
    }

    private String removeSeparatorSpecifier(String input) {
        int idx = input.indexOf(NEW_LINE_SEPARATOR);
        return input.substring(idx + 1);
    }

    private boolean hasSeparatorSpecifier(String input) {
        return input.indexOf(SEPARATOR_SPECIFIER) == 0;
    }

    private List<String> getNumbers(String input, List<String> separators) {
        List<String> result = new ArrayList<>();
        if (!input.isEmpty()) {
            String firstSeparator = separators.get(0);
            String[] inputSplit = input.split(firstSeparator);
            if (separators.size() == 2) {
                String secondSeparator = separators.get(1);
                for (String item : inputSplit) {
                    if (item.contains(secondSeparator)) {
                        result.addAll(Arrays.asList(item.split(secondSeparator)));
                    } else {
                        result.add(item);
                    }
                }
            } else {
                result.addAll(Arrays.asList(inputSplit));
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