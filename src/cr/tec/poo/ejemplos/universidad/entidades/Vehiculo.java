package cr.tec.poo.ejemplos.universidad.entidades;

import cr.tec.poo.ejemplos.universidad.utilitarios.GeneradorDeReportes;

import java.util.Date;
import java.util.Map;

public class Vehiculo {

    private Date fechaCompra;

    private String marca;

    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.fechaCompra = new Date(); // fechaCompra es hoy
        this.marca = marca;
        this.modelo = modelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String generarReporte() {
        GeneradorDeReportes generadorDeReportes = new GeneradorDeReportes();
        Map<String,String> contenidos = Map.of("Fecha de Compra", getFechaCompra().toString(),
                "Marca", getMarca(),
                "Modelo",  getModelo());
        return generadorDeReportes.generarReporte("Vehículo", contenidos);
    }
}
