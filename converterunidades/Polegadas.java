package converterunidades;

public class Polegadas extends SistemadeUnidade {
    private final float valorin;

    public Polegadas(float valorin) {
        this.valorin = valorin;

    }

    @Override
    public void pergunte (String codigo) {
        switch (codigo) {
            case "M","m":
                System.out.println(paraMetro() + "M");

                break;
            case "cm","CM","Cm","cM":
                System.out.println(paraCentimetro() + "CM");

                break;
            case "mi","MI","Mi","mI":
                System.out.println(paraMilha() + "MI");

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
        return (float) (valorin /39.37);
    }

    @Override
    public float paraMilimetro() {
        return (float) (valorin * 25.4);
    }

    @Override
    public float paraCentimetro() {
        return (float) (valorin /2.54);
    }

    @Override
    public float paraPolegada() {
        return 0;
    }

    @Override
    public float paraPes() {
        return valorin /12;
    }

    @Override
    public float paraMilha() {
        return  valorin /63360;
    }








}

