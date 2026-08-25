class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        String nBinary = binaryHelper(n);
        int oneCounter = 0;
        for (int i = 0; i < nBinary.length(); i++) {
            if (nBinary.charAt(i) == '1') {
                oneCounter++;
            }
        }
        if (oneCounter == 1) {
            return true;
        }
        return false;
    }

    private String binaryHelper(int n) {
        String result = "";
        while (n > 0) {
            result = (n % 2) + result;
            n /= 2;
        }
        return result;
    }
}