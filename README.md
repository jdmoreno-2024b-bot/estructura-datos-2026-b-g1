# Estructura de Datos - 2026-B

Repositorio de clase - Corporacion Universitaria del Huila (CORHUILA).

| | |
| --- | --- |
| **Grupo** | 1 |
| **Horario** | Martes 8:20 p. m. - 10:00 p. m. |
| **Aula** | B2-210 |
| **Semestre** | 2026-B |
| **Frecuencia** | 1 sesion por semana |

## Estructura

El repositorio esta organizado en 16 semanas (`01-week` .. `16-week`).
Cada semana tiene la siguiente forma:

```
NN-week/
|-- 01-session/           # Sesion de la semana
\-- 02-optional-activity/ # Actividad opcional de refuerzo
```

- Las carpetas `NN-session` contienen el material trabajado en clase.
- `optional-activity` guarda ejercicios opcionales de refuerzo, no calificables.

## Como trabajar

```bash
git clone https://github.com/code-corhuila/estructura-datos-2026-b-g1.git
cd estructura-datos-2026-b-g1
```

Antes de cada clase, actualiza tu copia local:

```bash
git pull origin main
```
## Parte C - Modelado (Análisis)
**Dominio elegido: Tienda Online de Tecnología**

### 1. Clase: Producto
- **Atributos:** nombre, precio, stock, categoria
- **Métodos:** aplicarDescuento(), verificarDisponibilidad(), actualizarStock()
- **Abstracción:** Dejé fuera detalles irrelevantes como el color de la caja, el peso del embalaje y la fábrica de origen. Solo conservé lo necesario para vender.

### 2. Clase: Cliente
- **Atributos:** nombre, email, direccion, historialCompras
- **Métodos:** registrarse(), comprar(), dejarReseña()
- **Abstracción:** Dejé fuera datos personales no relevantes como altura, tipo de sangre o comida favorita. Solo datos para la compra y entrega.

### 3. Clase: Pedido
- **Atributos:** idPedido, listaProductos, fecha, estado
- **Métodos:** calcularTotal(), cambiarEstado(), generarFactura()
- **Abstracción:** Dejé fuera la ruta del camión, el nombre del mensajero y la hora exacta de apertura del paquete. Solo el flujo de creación, pago y entrega. 