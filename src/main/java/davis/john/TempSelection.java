package davis.john;

/**
 * Created by jrdavis on 2/4/16.
 */
public class TempSelection {

    private int temp;

    public TempSelection(int temp) {
        this.temp = temp;
    }

    public String tempSelection(){
        if (temp > 38) {
            return String.valueOf(WaxColor.Yellow);
        }
        if (temp > 31 ){
            return String.valueOf(WaxColor.Red);
        }
        if (temp > 26){
           return String.valueOf(WaxColor.Violet);
        }
        if (temp > 18){
            return String.valueOf(WaxColor.Blue);
        }
        if (temp > 5) {
            return String.valueOf(WaxColor.Green);
        }
        return  String.valueOf(WaxColor.White);


    }

   public int tempInput(){


        return 0;
    }
}
