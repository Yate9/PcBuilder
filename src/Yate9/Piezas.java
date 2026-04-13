package Yate9;

public  abstract class Piezas {
    protected String nombre;
    protected String fabricante;
    protected Double precio;
    protected int consumoenergia;

    public Piezas(String nombre, int consumoenergia, Double precio, String fabricante) {
        this.nombre = nombre;
        this.consumoenergia = consumoenergia;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConsumoenergia() {
        return consumoenergia;
    }

    public void setConsumoenergia(int consumoenergia) {
        this.consumoenergia = consumoenergia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Piezas{" +
                "nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", consumoenergia=" + consumoenergia +
                '}';
    }
}

