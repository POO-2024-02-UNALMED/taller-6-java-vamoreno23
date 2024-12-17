package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int ventas;
    private static ArrayList<Pais> listaPaises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public String getNombre() { return nombre; }
    public void incrementarVentas() { ventas++; }
    public int getVentas() { return ventas; }

    public static Pais paisMasVendedor() {
        Pais max = null;
        for (Pais p : listaPaises) {
            if (max == null || p.getVentas() > max.getVentas()) {
                max = p;
            }
        }
        return max;
    }
}
