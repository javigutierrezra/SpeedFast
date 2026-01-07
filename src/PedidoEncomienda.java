public class PedidoEncomienda extends Pedido {

    private double peso;

    public PedidoEncomienda(int idPedido, String direccionEntrega, double peso) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.peso = peso;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... " +
                (peso < 10 ? "OK" : "ERROR: Peso excede el límite permitido"));
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido de encomienda asignado a " + nombreRepartidor);
    }
}