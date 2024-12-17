package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;
    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this);
    }

    public String getNombre() { return nombre; }
    public Pais getPais() { return pais; }
    public void incrementarVentas() { ventas++; }
    public int getVentas() { return ventas; }

    public static Fabricante fabricaMayorVentas() {
        Fabricante max = null;
        for (Fabricante f : listaFabricantes) {
            if (max == null || f.getVentas() > max.getVentas()) {
                max = f;
            }
        }
        return max;
    }
}
