# SpeedFast – Sistema de Entregas
**Semana 3 – Programación Orientada a Objetos**

## 📌 Descripción del proyecto
SpeedFast es una aplicación desarrollada en Java que simula un sistema de entregas,
permitiendo gestionar distintos tipos de pedidos como comida, encomiendas y compras
express. El diseño del sistema aplica los principios fundamentales de la Programación
Orientada a Objetos, integrando abstracción, polimorfismo e interfaces para lograr un
código escalable, reutilizable y mantenible.

---

## 🎯 Objetivo
Diseñar e implementar un sistema orientado a objetos que permita:
- Gestionar pedidos diferenciados por tipo.
- Aplicar polimorfismo mediante sobrescritura y sobrecarga de métodos.
- Utilizar una clase abstracta para definir comportamientos comunes.
- Implementar interfaces para desacoplar responsabilidades funcionales.

---

## 🧱 Estructura del sistema

### 🔹 Clase abstracta
**Pedido**
- Define atributos y comportamientos comunes a todos los pedidos.
- Implementa el método `mostrarResumen()`.
- Declara el método abstracto `calcularTiempoEntrega()`.

### 🔹 Subclases (Polimorfismo)
- `PedidoComida`
- `PedidoEncomienda`
- `PedidoExpress`

Cada subclase:
- Sobrescribe el método `asignarRepartidor()`.
- Implementa su propia lógica para el cálculo del tiempo de entrega.
- Define el comportamiento de despacho.

---

## 🔌 Interfaces implementadas

- **Despachable**
    - Método: `despachar()`

- **Cancelable**
    - Método: `cancelar()`

- **Rastreable**
    - Método: `verHistorial()`

Las interfaces son implementadas directamente por la clase abstracta `Pedido`, lo que
permite desacoplar responsabilidades y favorecer la mantenibilidad del sistema.

---

## ▶️ Simulación (Clase Main)
La clase `Main` permite simular el funcionamiento del sistema, mostrando:
- Asignación automática y manual de repartidores.
- Cálculo del tiempo estimado de entrega.
- Despacho de pedidos.
- Cancelación de pedidos.
- Visualización del historial de entregas mediante un `ArrayList`.

---

## 🛠 Tecnologías utilizadas
- Java
- IntelliJ IDEA
- GitHub

---
## 📚 Conclusión
El sistema SpeedFast demuestra la correcta aplicación de los principios de la
Programación Orientada a Objetos, permitiendo una estructura clara, extensible y fácil
de mantener. El uso de abstracción, polimorfismo e interfaces facilita la incorporación
de nuevos tipos de pedidos sin afectar el funcionamiento del sistema existente.
## Autor

**Nombre:** Javiera Gutierrez  
Actividad desarrollada para el curso de Programación Orientada a Objetos ii.