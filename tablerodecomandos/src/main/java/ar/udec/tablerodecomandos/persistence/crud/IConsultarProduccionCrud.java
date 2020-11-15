package ar.udec.tablerodecomandos.persistence.crud;

import ar.udec.tablerodecomandos.persistence.entity.ProduccionEntity;
import org.springframework.data.repository.CrudRepository;

public interface IConsultarProduccionCrud extends CrudRepository<ProduccionEntity, Integer> {
}
