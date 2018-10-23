class StringCalculator {
    int add(String numbers) {
        if (!numbers.isEmpty()) {
            int idx = numbers.indexOf(",");
            if (idx != -1) {
                String str1 = numbers.substring(0, idx);
                String str2 = numbers.substring(idx + 1);
                int num1 = Integer.valueOf(str1);
                int num2 = Integer.valueOf(str2);
                return num1 + num2;
            } else {
                return Integer.valueOf(numbers);
            }
        } else {
            return 0;
        }
    }
}
