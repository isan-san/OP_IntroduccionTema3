

public class App {
    public static void main(String[] args) {

        int primerNumero = 3;
        int segundoNumero = 3;

        System.out.println("La suma de "+primerNumero+" más "+segundoNumero+" es igual a: "+suma(primerNumero,segundoNumero));

        Coche miCoche = new Coche();

        miCoche.agregarPuerta();

        System.out.println("El coche ahora tiene: "+miCoche.NumeroDePuertas +" puertas");

    }

    private static int suma(int primerNumero, int segundoNumero){
        return primerNumero + segundoNumero;
    }
}
