# Proyecto Semana 2 - SpeedFast

## Descripción
Este proyecto es una implementación de un sistema de pedidos para la empresa **SpeedFast**.  
Se utiliza **programación orientada a objetos** en Java, aplicando **clases abstractas**, **herencia** y **polimorfismo** para modelar distintos tipos de pedidos: comida, encomienda y express.

---

## Clases

### Clase abstracta `Pedido`
- Atributos comunes: `idPedido`, `direccionEntrega`, `distanciaKm`
- Métodos:
    - `mostrarResumen()`: Muestra información básica del pedido.
    - `calcularTiempoEntrega()`: Método abstracto, implementado en subclases.

### Subclases
1. **PedidoComida**
    - Tiempo de entrega = 15 min + 2 min por km
2. **PedidoEncomienda**
    - Tiempo de entrega = 20 min + 1.5 min por km (redondeado)
3. **PedidoExpress**
    - Tiempo base 10 min, si distancia > 5 km, se suman 5 min adicionales

---

## Uso
1. Crear objetos de cada tipo de pedido en la clase `Main`.
2. Llamar a `mostrarResumen()` para ver los datos del pedido.
3. Llamar a `calcularTiempoEntrega()` para obtener el tiempo estimado.
4. Ejemplo de ejecución:

```java
Pedido pedidoComida = new PedidoComida(1, "Av. Siempre Viva 123", 4);
pedidoComida.mostrarResumen();
System.out.println("Tiempo estimado: " + pedidoComida.calcularTiempoEntrega() + " minutos");

## Autor

**Nombre:** Javiera Gutierrez  
Actividad desarrollada para el curso de Programación Orientada a Objetos ii.