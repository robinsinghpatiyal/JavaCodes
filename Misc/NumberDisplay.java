public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int replavceValue){
        if((replavceValue>=0) && (replavceValue<limit)){
            value = replavceValue;
        }
    }

    public String getDisplayValue(){
        if(value<10){
            return "0"+value;
        }
        else{
            return ""+value;
        }
    }
    public void increment(){
        value = (value+1)%limit;
    }
}
