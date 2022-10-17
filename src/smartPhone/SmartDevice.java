package smartPhone;

public class SmartDevice {
    private String tipoPantalla;

    private int memoria;
    private String tamaño;
    private Double peso;

    public SmartDevice() {
    }

    public SmartDevice(String tipoPantalla, int memoria, String tamaño, Double peso) {
        this.tipoPantalla = tipoPantalla;

        this.memoria = memoria;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }





    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return   "tipoPantalla='" + tipoPantalla + '\'' +

                ", memoria=" + memoria +
                ", tamaño=" + tamaño +
                ", peso=" + peso ;
    }
}
