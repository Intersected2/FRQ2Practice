public class AdditionPattern{
    private int startnum;
    private int current;
    private int pattern;
    public AdditionPattern(int startnum, int pattern){
        this.startnum = startnum;
        this.pattern = pattern;
        this.current = startnum;
    }
    public void next(){
        current += this.pattern;
    }
    public void prev(){
        if(current != startnum){
            current -= this.pattern;
        }
    }
    public int currentNumber(){
        return current;
    }
}
