package clebertsfigueiredo;

public class Main {
    public static void main(String[] args) {


        Carro c1 = new Carro("Hyundai", "HB20S", 2013);

        for(int i = 0; 40 >= i; i++) {
            c1.acelerar();
        }

        for(int i = 0; 10 >= i; i++) {
            c1.reduzir();
        }

        String status = c1.pegaStatus();
        System.out.println(status);


    }
}
