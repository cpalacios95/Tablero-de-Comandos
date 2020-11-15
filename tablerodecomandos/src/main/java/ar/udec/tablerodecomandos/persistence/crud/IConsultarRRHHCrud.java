package ar.udec.tablerodecomandos.persistence.crud;

import ar.udec.tablerodecomandos.persistence.entity.RRHHEntity;
import org.springframework.data.repository.CrudRepository;

public interface IConsultarRRHHCrud extends CrudRepository<RRHHEntity, Integer> {
}
