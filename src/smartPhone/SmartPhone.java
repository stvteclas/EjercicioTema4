package smartPhone;

public class SmartPhone extends SmartDevice{
    private String banda;
    private String tamanioBateria;
    private String camara;

    public SmartPhone(){}

    public SmartPhone(String tipoPantalla, int memoria, String tamaño, Double peso) {
        super(tipoPantalla, memoria, tamaño, peso);
    }

    public SmartPhone(String tipoPantalla, int memoria, String tamaño, Double peso, String banda, String tamanioBateria, String camara) {
        super(tipoPantalla, memoria, tamaño, peso);
        this.banda = banda;
        this.tamanioBateria = tamanioBateria;
        this.camara = camara;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getTamanioBateria() {
        return tamanioBateria;
    }

    public void setTamanioBateria(String tamanioBateria) {
        this.tamanioBateria = tamanioBateria;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return  "Dispositivo telefono = "+  super.toString()+ "banda='" + banda + '\'' +
                ", tamanioBateria='" + tamanioBateria + '\'' +
                ", camara='" + camara + '\''
               ;
    }
}
