package ar.udec.tablerodecomandos.persistence.crud;

import ar.udec.tablerodecomandos.persistence.entity.DatosVariosEntity;
import org.springframework.data.repository.CrudRepository;

public interface IConsultarDatosVariosCrud extends CrudRepository<DatosVariosEntity,Integer> {
}
