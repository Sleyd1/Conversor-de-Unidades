package converterunidades;
import java.util.Scanner;

public class Comprimento {
    private final float valor;
    private String escolhaDeConversao;
    Scanner entrada = new Scanner(System.in);

    public Comprimento(float valor){
        this.valor = valor;

    }

    public void comecar(){
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha a unidades de medidas que você quer converter \n(digite apenas as letras determinadas abaixo):");
        System.out.println("Milímetro digite: mm");
        System.out.println("Pentímetro digite: cm");
        System.out.println("Polegada digite: in");
        System.out.println("Pes digite: ft");
        System.out.println("Milhas digite: mi");
        System.out.print("Digite aqui: ");
        String escolhaDoUsuario = entrada.nextLine();
        System.out.println("--------------------------------------------------");
        if (escolhaDoUsuario.equalsIgnoreCase("mm")){
            this.milimetro();
        } else if (escolhaDoUsuario.equalsIgnoreCase("cm")) {
            this.centimetro();
        } else if (escolhaDoUsuario.equalsIgnoreCase("in")) {
            this.polegada();

        } else if (escolhaDoUsuario.equalsIgnoreCase("ft")) {
            this.pes();

        } else {
            this.milha();
        }


    }



    private void milimetro(){
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

       if (escolhaDeConversao.equalsIgnoreCase("m")){
           System.out.println(valorMm.mmParaM() + "M");

       } else if (escolhaDeConversao.equalsIgnoreCase("cm")) {
           System.out.println(valorMm.mmParaCm() + "CM");

       }else if (escolhaDeConversao.equalsIgnoreCase("in")) {
           System.out.println(valorMm.mmParaIn() + "IN");

       }else if (escolhaDeConversao.equalsIgnoreCase("ft")) {
           System.out.println(valorMm.mmParaFt()+ "FT");

       } else {
           System.out.println(valorMm.mmParaMi() + "MI");
       }
       entrada.close();
        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");
    }

    private void centimetro(){
        Centimetro valorCm = new Centimetro(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: in/IN");
        System.out.println("Para Pés digite: ft/FT");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        if (escolhaDeConversao.equalsIgnoreCase("m")){
            System.out.println(valorCm.cmParaM() + " M");

        } else if (escolhaDeConversao.equalsIgnoreCase("mm")) {
            System.out.println(valorCm.cmParaMm() + "MM");

        }else if (escolhaDeConversao.equalsIgnoreCase("in")) {
            System.out.println(valorCm.cmParaIn() + " IN");

        }else if (escolhaDeConversao.equalsIgnoreCase("ft")) {
            System.out.println(valorCm.cmParaFt() + "FT");

        } else {
            System.out.println(valorCm.cmParaMi() + "MI");
        }
        entrada.close();

        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

    private void polegada(){
        Polegadas valorIn = new Polegadas(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: ft/FT");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        if (escolhaDeConversao.equalsIgnoreCase("m")){
            System.out.println(valorIn.inParaM() + "M");

        } else if (escolhaDeConversao.equalsIgnoreCase("mm")) {
            System.out.println(valorIn.inParaMm() + "MM");

        }else if (escolhaDeConversao.equalsIgnoreCase("cm")) {
            System.out.println(valorIn.inParaCm() + "CM");

        }else if (escolhaDeConversao.equalsIgnoreCase("ft")) {
            System.out.println(valorIn.inParaFt() + "FT");

        } else {
            System.out.println(valorIn.inParaMi() + "MI");
        }
        entrada.close();
        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

    private void pes(){
        Pes valorPes = new Pes(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: in/IN");
        System.out.println("Para Milhas digite: mi/MI");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        if (escolhaDeConversao.equalsIgnoreCase("m")){
            System.out.println(valorPes.ftParaM() + "M");

        } else if (escolhaDeConversao.equalsIgnoreCase("mm")) {
            System.out.println(valorPes.ftParaMm() +"MM");

        }else if (escolhaDeConversao.equalsIgnoreCase("cm")) {
            System.out.println(valorPes.ftParaCm() + "CM");

        }else if (escolhaDeConversao.equalsIgnoreCase("in")) {
            System.out.println(valorPes.ftParaIn() + "IN");

        } else {
            System.out.println(valorPes.ftParaMi() + "MI");
        }
        entrada.close();

        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }

    private void milha(){
        Milhas valorMilha = new Milhas(this.valor);
        System.out.println("Para qual unidade de comprimento você quer converter?");
        System.out.println("Para Metro digite: m/M");
        System.out.println("Para Centimetro digite: mm/MM");
        System.out.println("Para Polegada digite: cm/CM");
        System.out.println("Para Pés digite: in/IN");
        System.out.println("Para Milhas digite: ft/FT");
        System.out.print("Digite aqui: ");
        escolhaDeConversao = entrada.nextLine();

        if (escolhaDeConversao.equalsIgnoreCase("m")){
            System.out.println(valorMilha.miParaM() + "M");

        } else if (escolhaDeConversao.equalsIgnoreCase("mm")) {
            System.out.println(valorMilha.miParaMm() + "MM");

        }else if (escolhaDeConversao.equalsIgnoreCase("cm")) {
            System.out.println(valorMilha.miParaCm() + "CM");

        }else if (escolhaDeConversao.equalsIgnoreCase("in")) {
            System.out.println(valorMilha.miParaIn() + "IN");

        } else {
            System.out.println(valorMilha.miParaFt() + "FT");
        }
        entrada.close();
        System.out.println("---------------Fim do programa--------------------");
        System.out.println("--------------------------------------------------");

    }





}

class Milimetro {
    private final float valormm;
    public Milimetro(float valormm) {
        this.valormm = valormm;

    }

    public float mmParaM(){
        return valormm /1000;
    }

    public float mmParaCm(){
        return valormm /10;
    }
    public float mmParaIn(){
        return (float) (valormm /25.4);
    }
    public float mmParaFt(){
        return (float) (valormm /304.8);
    }
    public float mmParaMi(){
        return (float) (valormm /1.609e+6);
    }


}

class Centimetro {
    private final float valorcm;

    public Centimetro(float valorcm) {
        this.valorcm = valorcm;

    }

    public float cmParaM(){
        return valorcm /100;
    }

    public float cmParaMm(){
        return valorcm * 10;
    }
    public float cmParaIn(){
        return (float) (valorcm /2.54);
    }
    public float cmParaFt(){
        return (float) (valorcm /30.48);
    }
    public float cmParaMi(){
        return  valorcm /160900;
    }


}

class Polegadas {
    private final float valorin;

    public Polegadas(float valorin) {
        this.valorin = valorin;

    }

    public float inParaM(){
        return (float) (valorin /39.37);
    }

    public float inParaMm(){
        return (float) (valorin * 25.4);
    }
    public float inParaCm(){
        return (float) (valorin /2.54);
    }
    public float inParaFt(){
        return valorin /12;
    }
    public float inParaMi(){
        return  valorin /63360;
    }


}

class Pes {
    private final float valorpes;

    public Pes(float valorpes) {
        this.valorpes = valorpes;

    }

    public float ftParaM(){
        return (float) (valorpes /3.281);
    }

    public float ftParaMm(){
        return (float) (valorpes * 304.8);
    }
    public float ftParaCm(){
        return (float) (valorpes * 30.48);
    }
    public float ftParaIn(){
        return valorpes * 12;
    }
    public float ftParaMi(){
        return  valorpes / 5280;
    }


}

class Milhas {
    private final float valormilha;

    public Milhas(float valormilha) {
        this.valormilha = valormilha;

    }

    public float miParaM(){
        return valormilha *  1609;
    }

    public float miParaMm(){
        return (float) (valormilha *  1.609e+6);
    }
    public float miParaCm(){
        return valormilha * 160900;
    }
    public float miParaIn(){
        return valormilha * 63360;
    }
    public float miParaFt(){
        return  valormilha * 5280;
    }


}

