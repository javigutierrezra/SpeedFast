import java.util.ArrayList;
import java.util.List;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    protected int id;
    protected String cliente;
    protected String repartidor;
    protected boolean cancelado;
    protected List<String> historial;

    // Constructor
    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.cancelado = false;
        this.historial = new ArrayList<>();
        historial.add("Pedido creado para " + cliente);
    }

    // Método implementado (abstracción)
    public void mostrarResumen() {
        System.out.println("Pedido #" + id +
                " | Cliente: " + cliente +
                " | Repartidor: " + repartidor);
    }

    // Método abstracto (cada subclase lo personaliza)
    public abstract int calcularTiempoEntrega();

    // Método para polimorfismo (sobrescritura)
    public abstract void asignarRepartidor();

    // Sobrecarga
    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        historial.add("Repartidor asignado manualmente: " + nombre);
    }

    // Implementación de interfaces
    @Override
    public void cancelar() {
        cancelado = true;
        historial.add("Pedido cancelado");
        System.out.println("Pedido #" + id + " cancelado");
    }

    @Override
    public List<String> verHistorial() {
        return historial;
    }
}
