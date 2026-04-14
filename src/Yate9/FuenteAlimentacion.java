package Yate9;

public class FuenteAlimentacion extends Piezas{
    private int capacidadEnergeia;

    public FuenteAlimentacion(String nombre, int consumoenergia, Double precio, String fabricante, int capacidadEnergeia) {
        super(nombre, consumoenergia, precio, fabricante);
        this.capacidadEnergeia = capacidadEnergeia;
    }
    public int getCapacidadEnergeia() {
        return capacidadEnergeia;
    }
    public void setCapacidadEnergeia(int capacidadEnergeia) {
        this.capacidadEnergeia = capacidadEnergeia;
    }
}
