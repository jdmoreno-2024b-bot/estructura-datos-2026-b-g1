Dominio: Tienda de Barrio1. Clase Producto
Atributos: nombre, precio, stock
Métodos: vender(), revisarStock()
Que dejé por fuera: color del empaque, proveedor, peso. No importa para vender.2. Clase Cliente
Atributos: nombre, cedula, puntos
Métodos: comprar(), acumularPuntos()
Que dejé por fuera: donde vive, edad, estatura. Solo necesito identificarlo.3. Clase Venta
Atributos: fecha, total, listaProductos
Métodos: calcularTotal(), hacerFactura()
Que dejé por fuera: que música había, quien atendió. Solo importa que se vendió y cuanto.

Apliqué la abstracción para quedarme solo con lo esencial del problema. Eliminé atributos irrelevantes que no afectan la lógica de la tienda (como color, dirección, etc.) para simplificar el modelo y que cada clase tenga solo una responsabilidad.g