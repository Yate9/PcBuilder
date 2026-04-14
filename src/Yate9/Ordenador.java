package Yate9;

public class Ordenador {
    private Cpu cpu;
    private PlacaBase placaBase;
    private Caja caja;
    private FuenteAlimentacion fuenteAlimentacion;
    private Refrigeracion refrigeracion;
    private Gpu gpu;

    public Ordenador(Cpu cpu, Refrigeracion refrigeracion, FuenteAlimentacion fuenteAlimentacion, Caja caja, PlacaBase placaBase, Gpu gpu) {
        this.cpu = cpu;
        this.refrigeracion = refrigeracion;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.caja = caja;
        this.placaBase = placaBase;
        this.gpu = gpu;
    }
    public Ordenador() {
    }



    public boolean validarCompatibilidad() {
        if (!PlacaBase.esMismoTamanho(caja.getTamanhoCaja(), placaBase.getTamanhoPlaca())) {
            return false;
        }

        for (MemoriaRam ram : placaBase.getMemoriasRam()) {
            if (!(ram instanceof RamDddr)) {
                return false;
            }
        }

        boolean hayDDR4 = false;
        boolean hayDDR5 = false;

        for (MemoriaRam ram : placaBase.getMemoriasRam()) {
            RamDddr ddr = (RamDddr) ram;
            if (ddr.getTipoDdr() == TipoDdr.DDR4) hayDDR4 = true;
            if (ddr.getTipoDdr() == TipoDdr.DDR5) hayDDR5 = true;
        }

        if (hayDDR4 && hayDDR5) {
            return false;
        }

        if (!placaBase.getGaming() && placaBase.getGpus().size() > 1) {
            return false;
        }

        if (placaBase.getGaming() && placaBase.getGpus().size() > 2) {
            return false;
        }

        return true;
    }

    public int getConsumoTotal(){
        int total = caja.getConsumoenergia() + placaBase.getConsumoenergia() + cpu.getConsumoenergia()
                + refrigeracion.getConsumoenergia() + fuenteAlimentacion.getConsumoenergia();
        if (gpu != null) {
            total += gpu.getConsumoenergia();
        }
        for (MemoriaRam ram : placaBase.getMemoriasRam()) {
            total += ram.getConsumoenergia();
        }
        return total;
    }
    public double getPrecioTotal() {
        double total = caja.getPrecio() + placaBase.getPrecio() + cpu.getPrecio()
                + refrigeracion.getPrecio() + fuenteAlimentacion.getPrecio();
        if (gpu != null) {
            total += gpu.getPrecio();
        }
        for (MemoriaRam ram : placaBase.getMemoriasRam()) {
            total += ram.getPrecio();
        }
        return total;
    }
    public boolean encender(){
        if (getConsumoTotal()< fuenteAlimentacion.getCapacidadEnergeia()){
            return true;
        }else {
            return false;
        }
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Refrigeracion getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(Refrigeracion refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public FuenteAlimentacion getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public PlacaBase getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(PlacaBase placaBase) {
        this.placaBase = placaBase;
    }
}
