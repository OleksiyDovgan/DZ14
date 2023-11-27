class Solution3 {
    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];
        for (char ch : text.toCharArray()) {
            charCount[ch - 'a']++;
        }

        int minInstances = Integer.MAX_VALUE;


        minInstances = Math.min(minInstances, charCount['b' - 'a']);
        minInstances = Math.min(minInstances, charCount['a' - 'a']);
        minInstances = Math.min(minInstances, charCount['l' - 'a'] / 2);
        minInstances = Math.min(minInstances, charCount['o' - 'a'] / 2);
        minInstances = Math.min(minInstances, charCount['n' - 'a']);

        return minInstances;
    }
}