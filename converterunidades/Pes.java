package converterunidades;

public class Pes extends SistemadeUnidade {
    private final float valorpes;

    public Pes(float valorpes) {
        this.valorpes = valorpes;

    }

    @Override
    public void pergunte(String codigo) {
        switch (codigo) {
            case "M","m":
                System.out.println(paraMetro() + "M");

                break;
            case "cm","CM","Cm","cM":
                System.out.println(paraCentimetro() + "CM");

                break;
            case "in","IN","In","iN":
                System.out.println(paraPolegada() + "IN");

                break;
            case "mm","MM","Mm","mM":
                System.out.println(paraMilimetro() +"MM");

                break;
            case "mi", "MI","Mi","mI":
                System.out.println(paraMilha() + "MI");

                break;
            default:
                System.out.println("opção indisponivel");

        }
    }

    @Override
    public float paraMetro() {
        return (float) (valorpes /3.281);
    }

    @Override
    public float paraMilimetro() {
        return (float) (valorpes * 304.8);
    }

    @Override
    public float paraCentimetro() {
        return (float) (valorpes * 30.48);
    }

    @Override
    public float paraPolegada() {
        return valorpes * 12;
    }

    @Override
    public float paraPes() {
        return 0;
    }

    @Override
    public float paraMilha() {
        return  valorpes / 5280;
    }



}
