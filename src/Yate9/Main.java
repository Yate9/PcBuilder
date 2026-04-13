package Yate9;

public class Main {
    public static void main(String[] args) {


     Caja caja= new Caja("Nox Hummer", 20,60.0,"Nox",Tamanho.ATX);
     PlacaBase placa= new PlacaBase("Gygabyte 450", 10,100.0,"Gygabyte",true,Tamanho.MICROATX);

        System.out.println(PlacaBase.getCantidadrammax());
        PlacaBase.esMismoTamanho(caja.getTamanhoCaja(),placa.getTamanhoPlaca());
    }
}
