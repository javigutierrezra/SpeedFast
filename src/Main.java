import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        Pedido p1 = new PedidoComida(1, "Javiera");
        Pedido p2 = new PedidoEncomienda(2, "Carlos");
        Pedido p3 = new PedidoExpress(3, "Ana");

        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);

        // Asignación automática
        p1.asignarRepartidor();
        p2.asignarRepartidor();

        // Asignación manual (sobrecarga)
        p3.asignarRepartidor("Luis");

        for (Pedido p : pedidos) {
            p.mostrarResumen();
            System.out.println("Tiempo estimado: " + p.calcularTiempoEntrega() + " minutos");
            p.despachar();
            System.out.println();
        }

        // Cancelación
        p2.cancelar();

        // Historial
        System.out.println("Historial del pedido 1:");
        for (String evento : p1.verHistorial()) {
            System.out.println("- " + evento);
        }
    }
}
