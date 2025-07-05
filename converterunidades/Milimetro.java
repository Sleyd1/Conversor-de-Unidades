package converterunidades;

public class Milimetro extends SistemadeUnidade{

    private float valormm;

    public Milimetro(float valormm) {
        this.valormm = valormm;


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
            case "mi", "MI","Mi","mI":
                System.out.println(paraMilha() + "MI");

                break;
            default:
                System.out.println("opção indisponivel");

        }


    }

        @Override
        public float paraMetro(){
            return valormm /1000;
        }

        @Override
        public float paraCentimetro(){
            return valormm /10;
        }

        @Override
        public float paraPolegada(){
            return (float) (valormm /25.4);
        }
        @Override
        public float paraPes(){
            return (float) (valormm /304.8);
        }

        @Override
        public float paraMilha(){
            return (float) (valormm /1.609e+6);
        }

        @Override
        public float paraMilimetro(){
        return 0;
    }




}
