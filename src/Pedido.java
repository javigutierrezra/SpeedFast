public class Pedido {

    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido){
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    //Metodo generico que sera sobrescrito
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }
    // Metodo sobrecargado (overloading)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido" + idPedido + " asignando repartidor..." + nombreRepartidor);
    }
    public int getIdPedido() {
        return idPedido;
    }
    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public String getTipoPedido() {
        return tipoPedido;
    }
}
