public class PedidoComida extends Pedido {

    private boolean tieneMochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, boolean tieneMochilaTermica) {
        super(idPedido, direccionEntrega, "Comida");
        this.tieneMochilaTermica = tieneMochilaTermica;
    }

    // Sobrescritura (overriding)
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... " +
                (tieneMochilaTermica ? "OK" : "ERROR: Repartidor sin mochila térmica"));
    }

    // Sobrecarga sobrescrita
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido de comida asignado a " + nombreRepartidor);
    }
}