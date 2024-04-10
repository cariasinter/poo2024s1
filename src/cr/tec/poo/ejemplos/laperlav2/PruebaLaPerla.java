package cr.tec.poo.ejemplos.laperlav2;

import cr.tec.poo.ejemplos.laperlav2.entidades.Cliente;
import cr.tec.poo.ejemplos.laperlav2.entidades.Factura;
import cr.tec.poo.ejemplos.laperlav2.entidades.Producto;

public class PruebaLaPerla {

    public static void main(String[] args) {
        // Clientes
        Cliente yoko = new Cliente("001", "Yoko Ono");
        Cliente linda = new Cliente("002", "Linda McCartney");
        Cliente brian = new Cliente("003", "Brian Epstein");

        // Productos
        Producto p1 = new Producto("JRY101", 200, "Pendientes de diamantes muy bonitos para lucir en toda ocasion");
        Producto p2 = new Producto("JRY102", 150, "Anillo de plata zirconia");
        Producto p3 = new Producto("JRY103", 103, "Collar de perlas de oro");
        Producto p4 = new Producto("JRY104", 250, "Pulsera de oro de eslabones");
        Producto p5 = new Producto("JRY105", 300, "Conjunto de plata circonita");

        // Facturas
        Factura f1 = new Factura(yoko);
        f1.agregarLinea(2, p1);
        f1.agregarLinea(1, p3);
        f1.agregarLinea(2, p4);
        f1.guardarEnBaseDeDatos();
        f1.imprimir();

        Factura f2 = new Factura(linda);
        f2.agregarLinea(2, p2);
        f2.agregarLinea(1, p4);
        f2.guardarEnBaseDeDatos();
        f2.imprimir();

        Factura f3 = new Factura(brian);
        f3.agregarLinea(1, p5);
        f3.imprimir();





    }
}
