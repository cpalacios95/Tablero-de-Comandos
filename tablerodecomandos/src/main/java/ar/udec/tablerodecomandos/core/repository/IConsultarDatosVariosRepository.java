package ar.udec.tablerodecomandos.core.repository;

import ar.udec.tablerodecomandos.core.domain.DatosVarios;

import java.util.List;

public interface IConsultarDatosVariosRepository {


    List<DatosVarios> obtenerDatosVarios();
}