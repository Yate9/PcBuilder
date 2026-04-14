package Yate9;

public class RamDddr extends MemoriaRam{
    private TipoDdr tipoDdr;


    public RamDddr(String nombre, int consumoenergia, Double precio, String fabricante, TipoDdr tipoDdr) {
        super(nombre, consumoenergia, precio, fabricante);
        this.tipoDdr = tipoDdr;
    }

    public TipoDdr getTipoDdr() {
        return tipoDdr;
    }

    public void setTipoDdr(TipoDdr tipoDdr) {
        this.tipoDdr = tipoDdr;
    }
}
