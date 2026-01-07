public class PedidoExpress extends Pedido {

    private String ubicacionActual;

    public PedidoExpress(int idPedido, String direccionEntrega, String ubicacionActual) {
        super(idPedido, direccionEntrega, "Express");
        this.ubicacionActual = ubicacionActual;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Buscando repartidor más cercano desde: " + ubicacionActual);
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido express asignado a " + nombreRepartidor);
    }
}