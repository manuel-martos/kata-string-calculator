class StringCalculator {
    int add(String numbers) {
        return !numbers.isEmpty()
                ? Integer.valueOf(numbers)
                : 0;
    }
}
