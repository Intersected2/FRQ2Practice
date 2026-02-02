public class HiddenWord{
    private String word = "";
    private String ram = "";
    public HiddenWord(String word){
        this.word = word;
    }
    public String getHint(String gword){
        ram = "";
        for (int i = 0;i < word.length(); i++){
            if (word.substring(i,i + 1).equals(gword.substring(i,i + 1))){
                ram += word.substring(i,i + 1);
            }else if (true){
                for (int j = 0; j < word.length(); j++){
                    if (word.substring(i,i + 1).equals(word.substring(j,j + 1))){
                        ram += "+";
                    }
                }
            }else{
                ram += "*";
            }
        }
        return ram;
    }
}
