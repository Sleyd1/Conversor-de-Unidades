package converterunidades;

import java.util.Scanner;

public class Centimetro extends SistemadeUnidade {
    private final float valorcm;

    public Centimetro(float valorcm) {
        this.valorcm = valorcm;

    }




    public float paraCentimetro(){

        return 0;
    }

    @Override
    public void pergunte(String codigo) {
        switch (codigo) {
            case "M","m":
                System.out.println(paraMetro() + "M");

                break;
            case "mm","MM","Mm","mM":
                System.out.println(paraMilimetro() + "MM");

                break;
            case "in","IN","In","iN":
               System.out.println(paraPolegada() + "IN");

                break;
            case "ft","FT","Ft","fT":
                System.out.println(paraPes() +"FT");

                break;
            case "mi", "MI","Mi","mI":
                System.out.println(paraMilha() + "MI");

                break;
            default:
                System.out.println("opção indisponivel");

        }


    }

    @Override
    public float paraMetro(){
        return this.valorcm /100;
    }

    @Override
    public float paraMilimetro(){
        return this.valorcm * 10;
    }

    @Override
    public float paraPolegada(){
        return (float) (this.valorcm /2.54);
    }

    @Override
    public float paraPes(){
        return (float) (this.valorcm /30.48);
    }

    @Override
    public float paraMilha(){
        return  this.valorcm /160900;
    }


}