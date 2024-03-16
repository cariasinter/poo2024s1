package cr.tec.poo.ejemplos.universidad.utilitarios;

import java.util.Map;

public class GeneradorDeReportes {

    public String generarReporte(String nombreReporte, Map<String, String> contenidos) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("**************************************************\n");
        stringBuilder.append("Universidad Orientada a Objetos\n");
        stringBuilder.append(String.format("Reporte: %s\n", nombreReporte));
        stringBuilder.append("**************************************************\n");
        for (String key : contenidos.keySet()) {
            stringBuilder.append(String.format("%s : %s\n", key, contenidos.get(key)));
        }
        stringBuilder.append("**************************************************\n");
        stringBuilder.append("Derechos reservados 2024\n");
        stringBuilder.append("**************************************************\n");
        return stringBuilder.toString();
    }
}
