# Explorando la Sobrecarga y Sobrescritura en Clases Derivadas – SpeedFast

## Descripción del Proyecto

Este proyecto corresponde a una actividad formativa individual desarrollada en Java utilizando IntelliJ IDEA.  
El objetivo principal es aplicar los conceptos de Programación Orientada a Objetos, específicamente:

- Polimorfismo
- Sobrecarga de métodos (Overloading)
- Sobrescritura de métodos (Overriding)
- Herencia entre clases

Se implementa una jerarquía de clases que representa un sistema de pedidos para la empresa ficticia de reparto a domicilio llamada **SpeedFast**, la cual ofrece tres tipos de servicios:

1. Pedido de comida desde restaurantes
2. Pedido de encomiendas (documentos o paquetes)
3. Pedido de compras express (supermercado o farmacia)

Cada tipo de pedido posee criterios distintos para la asignación del repartidor, los cuales fueron modelados mediante polimorfismo.

---

## Jerarquía de Clases

El sistema está compuesto por las siguientes clases:

### Clase Base: `Pedido`

Representa un pedido genérico y contiene los atributos comunes a todos los pedidos:

- `idPedido`: identificador único del pedido
- `direccionEntrega`: dirección donde debe ser entregado
- `tipoPedido`: descripción del tipo de pedido

Además define dos versiones del método `asignarRepartidor()`:

- Un método sin parámetros, que imprime un mensaje genérico
- Un método sobrecargado que recibe el nombre del repartidor asignado

### Subclases Derivadas

Se crearon tres subclases que extienden de `Pedido` y personalizan su comportamiento:

#### `PedidoComida`

- Incluye el atributo adicional `tieneMochilaTermica`
- Sobrescribe el método `asignarRepartidor()` para verificar si el repartidor cumple con este requisito

#### `PedidoEncomienda`

- Posee el atributo `peso`
- Implementa validaciones relacionadas con el peso del paquete y su embalaje

#### `PedidoExpress`

- Utiliza el atributo `ubicacionActual`
- Su lógica de asignación se basa en encontrar al repartidor más cercano con disponibilidad inmediata

---

## Aplicación del Polimorfismo

El polimorfismo se aplica cuando desde la clase `Main` se crean objetos de las subclases y se invoca el método `asignarRepartidor()`.  
Dependiendo del tipo real del objeto, se ejecuta la versión sobrescrita correspondiente.

De esta manera, un mismo mensaje produce comportamientos diferentes en tiempo de ejecución.

---

## Ejecución del Programa

La clase `Main` se encarga de probar el funcionamiento del sistema:

- Se instancia al menos un objeto de cada subclase
- Se invocan los métodos sobrescritos
- Se prueba la versión sobrecargada del método

Los resultados se imprimen por consola mostrando mensajes claros y descriptivos.

---

## Requisitos Técnicos

- Lenguaje: Java
- IDE: IntelliJ IDEA
- Paradigma: Programación Orientada a Objetos
- El proyecto compila y se ejecuta correctamente

---

## Autor

**Nombre:** Javiera Gutierrez  
Actividad desarrollada para el curso de Programación Orientada a Objetos ii.