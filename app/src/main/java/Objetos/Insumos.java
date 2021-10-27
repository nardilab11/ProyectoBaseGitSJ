package Objetos;

public class Insumos {
    private int id;
    private String[] insumos = {"Punching Bag", "Objeto 2", "Objeto 3", "Objeto 4", "Guantes", "Corredora"};
    private int[] precios = {25000, 12000, 35000, 40000};

    public Insumos(int id, String[] insumos) {
        this.id = id;
        this.insumos = insumos;
    }

    public Insumos() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getInsumos() {
        return insumos;
    }

    public void setInsumos(String[] insumos) {
        this.insumos = insumos;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public int anadirAdicional(int valor, int adicional){
        return valor + adicional;
    }
}
