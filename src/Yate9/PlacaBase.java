package Yate9;

public class PlacaBase extends Piezas{
    private static int cantidadrammax = 4;
    private Boolean gaming;
    private Tamanho tamanhoPlaca;


    public PlacaBase(String nombre, int consumoenergia, Double precio, String fabricante, Boolean gaming, Tamanho tamanhoPlaca) {
        super(nombre, consumoenergia, precio, fabricante);
        this.gaming = gaming;
        this.tamanhoPlaca = tamanhoPlaca;
    }
    public Tamanho getTamanhoPlaca() {
        return tamanhoPlaca;
    }

    public Boolean getGaming() {
        return gaming;
    }

    public void setGaming(Boolean gaming) {
        this.gaming = gaming;
    }
    public static int getCantidadrammax() {
        return cantidadrammax;
    }

    public static boolean esMismoTamanho(Enum tamanhoCaja, Enum tamanhoPlaca){
        if(tamanhoCaja == tamanhoPlaca){
            System.out.println("Mismo tamaño entre la caja y la placa!");
            return true;
        }else{
            System.out.println("No tienen el mismo tamaño la caja y la placa");
            return false;
        }
    }




    @Override
    public String toString() {
        return "PlacaBase{" +
                "gaming=" + gaming +
                ", consumoenergia=" + consumoenergia +
                ", precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
