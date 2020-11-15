package ar.udec.tablerodecomandos.core.input;

import ar.udec.tablerodecomandos.core.domain.Ventas;

import java.util.List;

public interface IConsultarVentasInput {

    List<Ventas> obtenerDatosVentas();

    double totalVentasMes();

}
