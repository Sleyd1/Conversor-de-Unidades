package converterunidades;

public class Milhas extends SistemadeUnidade {
    private final float valormilha;

    public Milhas(float valormilha) {
        this.valormilha = valormilha;

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
            case "ft","FT","Ft","fT":
                System.out.println(paraPes() +"FT");

                break;
            case "mm", "MM","Mm","mM":
                System.out.println(paraMilimetro() + "MM");

                break;
            default:
                System.out.println("opção indisponivel");

        }
    }

    @Override
    public float paraMetro() {
        return valormilha *  1609;
    }

    @Override
    public float paraMilimetro() {
        return (float) (valormilha *  1.609e+6);
    }

    @Override
    public float paraCentimetro() {
        return valormilha * 160900;
    }

    @Override
    public float paraPolegada() {
        return valormilha * 63360;
    }

    @Override
    public float paraPes() {
        return  valormilha * 5280;
    }

    @Override
    public float paraMilha() {
        return 0;
    }


}

