public class HiddenWord{
    private String word = "";
    private String  ram = "";
    private String ram2 = "";
    public HiddenWord(String word){
        this.word = word;
    }
    public String getHint(String gword){
        for (int i = 0; i < word.length();i++){
            if (word.substring(i,i + 1).equals(gword.substring(i,i + 1))){
                ram += word.substring(i,i + 1);
            }else {
                for (int j = 0; j < gword.length();j++){
                    if (word.substring(i,i + 1).equals(gword.substring(j,j + 1)) && (i != j)){

                    }
                }
            }
        }
        return ram;
    }
}
