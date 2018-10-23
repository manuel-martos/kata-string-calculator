class StringCalculator {
    int add(String input) {
        int result = 0;
        if (!input.isEmpty()) {
            String[] numbers = input.split(",");
            for (String number : numbers) {
                if (!number.isEmpty()) {
                    result += Integer.valueOf(number);
                }
            }
        }
        return result;
    }
}
