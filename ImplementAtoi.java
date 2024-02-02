class ImplementAtoi {
    int atoi(String s) {
        // Your code here
        int res = 0;
        boolean isNegative = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                isNegative = true;
                continue;
            }
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                res = res * 10 + (s.charAt(i) - '0');
            } else {
                return -1;
            }
        }
        if (isNegative)
            res *= -1;
        return res;
    }
}
