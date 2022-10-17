import smartPhone.SmartPhone;
import smartPhone.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setTipoPantalla("OLED");
        smartPhone.setMemoria(256);
        smartPhone.setBanda("5G");
        smartPhone.setCamara("128Mpx");
        smartPhone.setTamanioBateria("5000Mamp");
        smartPhone.setPeso(450.0);
        smartPhone.setTamaño("161,95 x 75,53 x 8,92 mm");

        SmartWatch smartWatch = new SmartWatch("TFT",1,"2,5 cm x 2,5cm",20.0,true,true);
        System.out.println("smartWatch = " + smartWatch.toString());
        System.out.println( smartPhone.toString());
    }
}