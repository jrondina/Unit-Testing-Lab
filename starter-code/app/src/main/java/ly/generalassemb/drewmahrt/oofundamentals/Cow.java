package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by jamesrondina on 7/13/16.
 */
public class Cow extends Mammal {
    private String mColor;

    public Cow(String color){
        super(4, 15, false, "Cow");
        mColor = color;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }

    @Override
    public String makeNoise() {
        return "Moo!!!";
    }

    @Override
    public String toString() {
        return "Cow" + (mColor.equals("Brown"));
    }
}
