public class Promo {
    private String code;
    private double percent;
    private double flat;

    public Promo(String code, double percent, double flat){
        this.code = code;
        this.percent = percent;
        this.flat = flat;
    }

    public double getPercent(){
        return percent;
    }

    public double getFlat() {
        return flat;
    }

    public String getCode() {
        return code;
    }
}
