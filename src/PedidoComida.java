public class PedidoComida extends Pedido {

    public PedidoComida(int id, String cliente) {
        super(id, cliente);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor comida";
        historial.add("Repartidor asignado automáticamente (comida)");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 30;
    }

    @Override
    public void despachar() {
        historial.add("Pedido de comida despachado");
        System.out.println("Pedido de comida en camino");
    }
}