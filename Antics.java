    public static boolean isPalindrome(String word) {
        System.out.println("Enter Word:");
        boolean isPalindrome = true;
        int word_start = 0;
        int word_end = word.length() - 1;
        while (word_start < word_end) {
            if (word.charAt(word_start)!= word.charAt(word_end)) {
                isPalindrome = false;
                break;}
                word_start++;
                word_end--;
            }
        if (isPalindrome) {
            return true;
        }
        else {
            return false;
        }
    }

        public static boolean isAbecedarian(String name) {
            int index = name.length() - 1;
            for (int i = 0; i < index; i++) {
                if (name.charAt(i) <= name.charAt(i + 1)) {
                continue;
                }
                else {
                    return false;
                }
            }
            return true;

    public static boolean isPangram(String word) {
        word=word.toLowerCase();

        for (int i = 97; i < 123; i++) {
            if(!word.contains(String.valueOf(Character.toChars(i)))){
            return false;}
        }
     return true;
    }

    public static String capitalizeFirstLetter(String text){
        text = text.toLowerCase();
        String firstLetter = String.valueOf(text.charAt(0));
        firstLetter = firstLetter.toUpperCase();
        text=text.replaceFirst("^[a-z]", firstLetter);

        return text;

    }