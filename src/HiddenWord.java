class HiddenWord {
    String word = "";

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String temp = "";
        if (guess.length() > word.length()) {
            return "Error, guess is bigger then word.";
        }
        for (int i = 0; i < guess.length(); i++) {
            if (word.indexOf(guess.substring(i, i + 1)) != -1) {
                if (guess.substring(i, i + 1).equals(word.substring(i, i + 1))) {
                    temp += guess.substring(i, i + 1);
                } else {
                    temp += "+";
                }
            } else {
                temp += "*";
            }
        }
        return temp;
    }
}