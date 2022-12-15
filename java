public class Ejercicio10 {


    public static void main (String[] args) {
        Iphone iphone = new Iphone();
        iphone.year = 2022;
        iphone.marca = "Apple";
        iphone.modelo = "XX";
        iphone.sistema = "IOS7";
        iphone.memoria = 125;
        iphone.touch = true;

        System.out.println("Marca:" + iphone.marca);
        System.out.println("Modelo:" + iphone.modelo);
        System.out.println("Year:" + iphone.year);
        System.out.println("Sistema Operativo:" + iphone.sistema);
        System.out.println("Memoria:" + iphone.memoria + "GB");
        System.out.println("Touch:" + iphone.touch);

        Samsung samsung = new Samsung();
        samsung.year = 2021;
        samsung.marca = "Samsung";
        samsung.modelo = "S7";
        samsung.sistema = "Android";
        samsung.memoria = 64;
        samsung.touch = true;

        System.out.println("Marca:" + samsung.marca);
        System.out.println("Modelo:" + samsung.modelo);
        System.out.println("Year:" + samsung.year);
        System.out.println("Sistema Operativo:" + samsung.sistema);
        System.out.println("Memoria:" + samsung.memoria + "GB");
        System.out.println("Touch:" + samsung.touch);

    }
}

class SmartDevice {
    int year;
    String marca;
    String modelo;
    String sistema;
    int memoria;
    boolean touch;
}

class Iphone extends SmartDevice {
}

class Samsung extends SmartDevice {
}
