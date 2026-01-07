public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(101, "Av. Providencia 123", true);
        Pedido pedido2 = new PedidoEncomienda(102, "Calle Los Álamos 456", 5);
        Pedido pedido3 = new PedidoExpress(103, "Av. Las Condes 789", "Metro Manquehue");

        Pedido[] pedidos = {pedido1, pedido2, pedido3};

        // Polimorfismo: se ejecuta versión sobrescrita
        for (Pedido p : pedidos) {
            p.asignarRepartidor();
            System.out.println();
        }

        // Llamadas a método sobrecargado
        pedido1.asignarRepartidor("Juan Pérez");
        pedido2.asignarRepartidor("Camila Soto");
        pedido3.asignarRepartidor("Luis Díaz");
    }
}