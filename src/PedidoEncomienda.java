public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int id, String cliente) {
        super(id, cliente);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor encomiendas";
        historial.add("Repartidor asignado automáticamente (encomienda)");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 60;
    }

    @Override
    public void despachar() {
        historial.add("Encomienda despachada");
        System.out.println("Encomienda enviada");
    }
}