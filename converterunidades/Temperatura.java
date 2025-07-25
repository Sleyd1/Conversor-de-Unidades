package converterunidades;
import java.util.Scanner;

/**
 * Converte temperaturas entre Celsius, Fahrenheit e Kelvin.
 * Utiliza entrada do usuário para definir tipo de conversão.
 */

public class Temperatura {
    private final float valor1;
    private final Scanner entrada = new Scanner(System.in);

    public Temperatura(float valor1){
        this.valor1 = valor1;
    }

    private float  FahrenheitParaCelsius(){
        //Fahrenheit (°F) → Celsius (°C)
        return (valor1 - 32)*5/9;
    }

    private float celsiusParaFahrenheit(){
        //Celsius (°C) → Fahrenheit (°F)
        return (valor1 * 9/5) + 32;
    }

    private float celsiusParaKelvin(){
        // Celsius (°C) → Kelvin (K)
        return (float) (valor1 + 273.15);

    }
    private float kelvinParaCelsius(){
        //Kelvin (K) → Celsius (°C)
        return (float) (valor1 - 273.15);

    }
    private float fahrenheitParaKelvin(){
        // Fahrenheit (°F) → Kelvin (K)
        return (float) ((valor1 -32) * 5/9 + 273.15);
    }
    private float kelvinParaFahrenheit(){
        //Kelvin (K) → Fahrenheit (°F)
        return (float) ((valor1 -273.15) * 9/5 + 32);
    }


    public void converter(){
        System.out.println("Escolha as unidades de temperatura que vc quer converter:");
        System.out.println("Fahrenheit → Celsius digite: FC");
        System.out.println("Celsius → Fahrenheit digite: CF");
        System.out.println("Celsius → Kelvin digite: CK");
        System.out.println("Kelvin → Celsius digite: KC");
        System.out.println("Fahrenheit → Kelvin digite: FK");
        System.out.println("Kelvin → Fahrenheit: KF");
        this.escolhaDeConversao();
    }

    private void escolhaDeConversao(){
        System.out.print("Digite Aqui (apenas duas letras):");
        String usuarioEscreve = entrada.nextLine();
        if (!usuarioEscreve.matches("(?i)^[a-z]{2}$")){
            System.out.println("por favor, digite apenas duas letras validas para a sua conversão.");
        } else {

            if (usuarioEscreve.equalsIgnoreCase("FC")){
                System.out.println("Fahrenheit → Celsius: " + FahrenheitParaCelsius() + "°C");
            } else if (usuarioEscreve.equalsIgnoreCase("CF")) {
                System.out.println("Celsius → Fahrenheit: " + celsiusParaFahrenheit() + "°F");

            } else if (usuarioEscreve.equalsIgnoreCase("CK")) {
                System.out.println("Celsius → Kelvin: " + celsiusParaKelvin() + "K");

            }else if (usuarioEscreve.equalsIgnoreCase("KC")) {
                System.out.println("Kelvin → Celsius: " + kelvinParaCelsius() + "°C");

            }else if (usuarioEscreve.equalsIgnoreCase("FK")) {
                System.out.println("Fahrenheit → Kelvin: " + fahrenheitParaKelvin() + "K");

            } else if (usuarioEscreve.equalsIgnoreCase("KF")) {
                System.out.println("Kelvin → Fahrenheit: " + kelvinParaFahrenheit() + "°F");
            } else {
                System.out.println("Valor invalido! ");
            }
        }

        entrada.close();

    }






}
