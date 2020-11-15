package ar.udec.tablerodecomandos.core.repository;

import ar.udec.tablerodecomandos.core.domain.Produccion;

import java.util.List;

public interface IConsultarProduccionRepository {

    List<Produccion> obtenerDatosProduccion();

}
