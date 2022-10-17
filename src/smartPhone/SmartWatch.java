package smartPhone;

public class SmartWatch extends SmartDevice{
    private Boolean gps;
    private Boolean rpm;
    public SmartWatch(){

    }

    public SmartWatch(String tipoPantalla, int memoria, String tamaño, Double peso) {
        super(tipoPantalla, memoria, tamaño, peso);
    }

    public SmartWatch(String tipoPantalla, int memoria, String tamaño, Double peso, Boolean gps, Boolean rpm) {
        super(tipoPantalla, memoria, tamaño, peso);
        this.gps = gps;
        this.rpm = rpm;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public Boolean getRpm() {
        return rpm;
    }

    public void setRpm(Boolean rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return super.toString() + "gps=" + gps +
                ", rpm=" + rpm ;
    }
}
