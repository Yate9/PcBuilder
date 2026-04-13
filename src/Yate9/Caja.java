package Yate9;

public class Caja extends Piezas {
    private Tamanho TamanhoCaja;

    public Caja(String nombre, int consumoenergia, Double precio, String fabricante, Tamanho tamanhoCaja) {
        super(nombre, consumoenergia, precio, fabricante);
        TamanhoCaja = tamanhoCaja;
    }


    public Tamanho getTamanhoCaja() {
        return TamanhoCaja;
    }

    public void setTamanhoCaja(Tamanho tamanhoCaja) {
        TamanhoCaja = tamanhoCaja;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "consumoenergia=" + consumoenergia +
                ", precio=" + precio +
                ", fabricante='" + fabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", TamanhoCaja=" + TamanhoCaja +
                '}';
    }
}
