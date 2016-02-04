package davis.john;


/**
 * Created by jrdavis on 2/4/16.
 */
public class SnowSelection {

    private String snow;


    public SnowSelection(String snow) {
        this.snow = snow;
    }



    public String conditionSelection(){

        if (snow.equalsIgnoreCase("Powder")) {
            return String.valueOf(WaxType.SPECIAL);
        }
        if (snow.equalsIgnoreCase("Firm")) {
            return String.valueOf(WaxType.EXTRA);
        }
        else {
            return String.valueOf(WaxType.STANDARD);
        }
    }




}
