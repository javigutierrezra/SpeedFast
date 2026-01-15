public class Main {
    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(1, "Av. Siempre Viva 123", 4);
        Pedido pedidoEncomienda = new PedidoEncomienda(2, "Calle Central 456", 8);
        Pedido pedidoExpress = new PedidoExpress(3, "Ruta Norte 789", 6);

        System.out.println("=== PEDIDO COMIDA ===");
        pedidoComida.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedidoComida.calcularTiempoEntrega() + " minutos\n");

        System.out.println("=== PEDIDO ENCOMIENDA ===");
        pedidoEncomienda.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedidoEncomienda.calcularTiempoEntrega() + " minutos\n");

        System.out.println("=== PEDIDO EXPRESS ===");
        pedidoExpress.mostrarResumen();
        System.out.println("Tiempo estimado: " + pedidoExpress.calcularTiempoEntrega() + " minutos\n");
    }
}