package ar.udec.tablerodecomandos.persistence.crud;

import ar.udec.tablerodecomandos.persistence.entity.VentasEntity;
import org.springframework.data.repository.CrudRepository;

public interface IConsultarVentasCrud extends CrudRepository<VentasEntity,Integer> {
}
