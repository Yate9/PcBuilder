package Yate9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


     Caja caja= new Caja("Nox Hummer", 20,60.0,"Nox",Tamanho.ATX);
     PlacaBase placa= new PlacaBase("Gygabyte 450", 10,100.0,"Gygabyte",true,Tamanho.ATX);
        Cpu cpu = new Cpu("Ryzen 5", 65, 150.0, "AMD");
        Gpu gpu1 = new Gpu("RTX 4060", 120, 300.0, "NVIDIA");
        Gpu gpu2 = new Gpu("RTX 3060", 100, 250.0, "NVIDIA");
        //Gpu gpu3 = new Gpu("RTX 2060", 80, 200.0, "NVIDIA");
        Refrigeracion refrigeracion = new Refrigeracion("Cooler Master", 10, 35.0, "Cooler Master");
        FuenteAlimentacion fuente = new FuenteAlimentacion("Corsair 650W", 5, 80.0, "Corsair", 10000);

        placa.addRam(new RamDddr("Corsair Vengeance LPX 3200M", 32, 100.0, "Corsair", TipoDdr.DDR4));
        placa.addRam(new RamDddr("Corsair Vengeance LPX 4800M", 48, 110.0, "Corsair", TipoDdr.DDR4));
       placa.addRam(new RamDddr("Corsair Vengeance LPX 9600M", 96, 130.0, "Corsair", TipoDdr.DDR4));
       //placa.addRam(new RamDddr("Corsair Vengeance LPX 19200M", 15, 150.0, "Corsair", TipoDdr.DDR4));
       //placa.addRam(new RamDddr("Corsair Vengeance LPX 6400M", 64, 120.0, "Corsair", TipoDdr.DDR4));
        placa.addRam(new RamDddr("Corsair Vengeance LPX 12800M", 12800, 140.0, "Corsair", TipoDdr.DDR5));
        //placa.addRam(new RamDddr("Corsair Vengeance LPX 25600M", 25600, 160.0, "Corsair", TipoDdr.DDR5));
        //placa.addRam(new RamGddr("Corsair Vengeance LPX 51200M", 51200, 180.0, "Corsair"));
        placa.addGpu(gpu1);
        placa.addGpu(gpu2);
        //placa.addGpu(gpu3);
        Ordenador ordenador = new Ordenador(cpu, refrigeracion, fuente, caja, placa, gpu1);

        if (!ordenador.validarCompatibilidad()) {
            System.out.println("Error. El ordenador no es compatible.");
            return;
        }

        System.out.println("Precio total: " + ordenador.getPrecioTotal() + "€");
        System.out.println("Consumo total: " + ordenador.getConsumoTotal() + "W");

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto dinero tienes? ");
        double dinero = scanner.nextDouble();

        double total = ordenador.getPrecioTotal();

        if (dinero >= total) {
            System.out.println("Compra OK. Tu cambio es: " + (dinero - total) + "€");
        } else {
            System.out.println("Error. Te faltan: " + (total - dinero) + "€");
        }

        if (ordenador.encender()) {
            System.out.println("El ordenador enciende correctamente.");
        } else {
            System.out.println("Error. La fuente no soporta el consumo total.");
        }

        placa.inspeccionarRAM();
    }
}
