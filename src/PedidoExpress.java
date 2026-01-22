public class PedidoExpress extends Pedido {

    public PedidoExpress(int id, String cliente) {
        super(id, cliente);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor express";
        historial.add("Repartidor asignado automáticamente (express)");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15;
    }

    @Override
    public void despachar() {
        historial.add("Pedido express despachado");
        System.out.println("Pedido express en camino");
    }
}