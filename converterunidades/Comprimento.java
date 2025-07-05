package converterunidades;
import java.util.Scanner;

public class Comprimento{

    protected float valor;

    protected String escolhaDeConversao;

     Scanner entrada = new Scanner(System.in);

    public Comprimento(){
        this.digitarvalor();
        this.comecar();
        entrada.close();
    }

    public void digitarvalor() {

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("digite um valor: ");
        this.valor = entrada.nextFloat();

        if (valor == 0){
            System.out.println("Digite um valor acima do zero");
        return;
        }


    }

    public void comecar(){
        String escolhaDoUsuario;
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha a unidades de medidas que você quer converter \n(digite apenas as letras determinadas abaixo):");
        System.out.println("Milímetro digite: mm");
        System.out.println("Centímetro digite: cm");
        System.out.println("Polegada digite: in");
        System.out.println("Pes digite: ft");
        System.out.println("Milhas digite: mi");
        System.out.print("Digite aqui: ");
        entrada.nextLine();
        escolhaDoUsuario = entrada.nextLine();
        System.out.println("--------------------------------------------------");


        switch (escolhaDoUsuario) {
            case "mm","MM","Mm","mM":
                this.milimetro();

                break;
            case "cm", "CM","Cm","cM":
               this.centimetro();

                break;
            case "in","IN","In","iN":

                this.polegada();
                break;
            case "ft", "FT","Ft","fT":
                this.pes();

                break;
            case "mi","MI","Mi","mI" :
                this.milha();

                break;

            default:
                System.out.println("opção indisponivel");

        }

    }



    protected  void milimetro(){
       Milimetro valorMm = new Milimetro(this.valor);

        System.out.println("--------------------------------------------------");
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: cm/CM");
        System.out.println("Para Polegada digite: in/IN");
        System.out.println("Para Pés digite: ft/FT");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        valorMm.pergunte(escolhaDeConversao);

        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");
    }


    protected  void centimetro(){
        Centimetro valorCm = new Centimetro(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: in/IN");
        System.out.println("Para Pés digite: ft/FT");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        valorCm.pergunte(escolhaDeConversao);


        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");
    }

    protected  void polegada(){
        Polegadas valorIn = new Polegadas(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: ft/FT");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        valorIn.pergunte(escolhaDeConversao);

        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

    protected  void pes(){
        Pes valorPes = new Pes(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: in/IN");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

       valorPes.pergunte(escolhaDeConversao);
        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

    protected  void milha(){
        Milhas valorMilha = new Milhas(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: in/IN");
        System.out.println("Para Milhas digite: ft/FT");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        valorMilha.pergunte(escolhaDeConversao);
        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

}

