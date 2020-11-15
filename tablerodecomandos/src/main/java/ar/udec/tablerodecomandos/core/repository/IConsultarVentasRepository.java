package ar.udec.tablerodecomandos.core.repository;

import ar.udec.tablerodecomandos.core.domain.Ventas;

import java.util.List;

public interface IConsultarVentasRepository {

    List<Ventas> obtenerDatosVentas();

    double totalVentasMes();
}
