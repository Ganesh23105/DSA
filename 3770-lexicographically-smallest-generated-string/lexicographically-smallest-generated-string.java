class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int len = n + m - 1;

        char[] word = new char[len];
        
        // Step 1: fill with '?'
        for (int i = 0; i < len; i++) {
            word[i] = '?';
        }

        // Step 2: enforce 'T'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (word[i + j] == '?' || word[i + j] == str2.charAt(j)) {
                        word[i + j] = str2.charAt(j);
                    } else {
                        return ""; // conflict
                    }
                }
            }
        }

        // Step 3: fill remaining with 'a'
        for (int i = 0; i < len; i++) {
            if (word[i] == '?') {
                word[i] = 'a';
            }
        }

        // Step 4: fix 'F'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (word[i + j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    boolean fixed = false;

                    // try modifying from right
                    for (int j = m - 1; j >= 0; j--) {
                        int idx = i + j;

                        char original = word[idx];

                        for (char c = 'a'; c <= 'z'; c++) {
                            if (c == original) continue;

                            word[idx] = c;

                            // check all T constraints again
                            boolean valid = true;
                            for (int k = 0; k < n; k++) {
                                if (str1.charAt(k) == 'T') {
                                    for (int x = 0; x < m; x++) {
                                        if (word[k + x] != str2.charAt(x)) {
                                            valid = false;
                                            break;
                                        }
                                    }
                                    if (!valid) break;
                                }
                            }

                            if (valid) {
                                fixed = true;
                                break;
                            }

                            word[idx] = original;
                        }

                        if (fixed) break;
                    }

                    if (!fixed) return "";
                }
            }
        }

        return new String(word);
    }
}