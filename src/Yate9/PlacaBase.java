package Yate9;

import java.util.ArrayList;

public class PlacaBase extends Piezas {
    private static int cantidadrammax = 4;
    private Boolean gaming;
    private Tamanho tamanhoPlaca;
    private ArrayList<MemoriaRam> memoriasRam;
    private ArrayList<Gpu> gpus;


    public PlacaBase(String nombre, int consumoenergia, Double precio, String fabricante, Boolean gaming, Tamanho tamanhoPlaca) {
        super(nombre, consumoenergia, precio, fabricante);
        this.gaming = gaming;
        this.tamanhoPlaca = tamanhoPlaca;
        this.memoriasRam = new ArrayList<>();
        this.gpus = new ArrayList<>();
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

    public ArrayList<MemoriaRam> getMemoriasRam() {
        return memoriasRam;
    }

    public ArrayList<Gpu> getGpus() {
        return gpus;
    }

    public void addRam(MemoriaRam ram) {
        if (memoriasRam.size() >= cantidadrammax) {
            System.out.println("Máximo 4 módulos de RAM.");
            return;
        }
        memoriasRam.add(ram);
    }

    public void addGpu(Gpu gpu) {
        if (gaming) {
            if (gpus.size() >= 2) {
                System.out.println("Una placa Gaming admite como máximo 2 GPUs.");
            return;
            }
        } else {
            if (gpus.size() >= 1) {
                System.out.println("Una placa No Gaming admite como máximo 1 GPU.");
            return;
            }
        }
        gpus.add(gpu);
    }

    public static boolean esMismoTamanho(Enum tamanhoCaja, Enum tamanhoPlaca){
        return tamanhoCaja == tamanhoPlaca;
    }

    public void inspeccionarRAM() {
        int ddr4 = 0;
        int ddr5 = 0;
        int gddr = 0;

        for (MemoriaRam ram : memoriasRam) {
            if (ram instanceof RamDddr ddr) {
                if (ddr.getTipoDdr() == TipoDdr.DDR4) {
                    ddr4++;
                } else if (ddr.getTipoDdr() == TipoDdr.DDR5) {
                    ddr5++;
                }
            } else if (ram instanceof RamGddr) {
                gddr++;
            }
        }

        System.out.println("RAM inspeccionada:");
        System.out.println("DDR4: " + ddr4);
        System.out.println("DDR5: " + ddr5);
        System.out.println("GDDR: " + gddr);
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "gaming=" + gaming +
                ", tamanhoPlaca=" + tamanhoPlaca +
                ", memoriasRam=" + memoriasRam +
                ", gpus=" + gpus +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", consumoenergia=" + consumoenergia +
                '}';
    }
}
