package ar.udec.tablerodecomandos.persistence;

import ar.udec.tablerodecomandos.controller.dtomodel.VentasDTO;
import ar.udec.tablerodecomandos.core.domain.Ventas;
import ar.udec.tablerodecomandos.core.repository.IConsultarVentasRepository;
import ar.udec.tablerodecomandos.persistence.crud.IConsultarVentasCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsultarVentasImplementation implements IConsultarVentasRepository {

    @Autowired
    IConsultarVentasCrud iConsultarVentasCrud;

    @Override
    public Ventas obtenerDatosVentas() {
        double importeTotal= 0;
        List<Ventas> misVentas= new ArrayList<>();
        iConsultarVentasCrud.findAll().forEach(VentasDTO ->misVentas.add(Ventas.getInstance(VentasDTO.getMes(),
                VentasDTO.getCliente(), VentasDTO.getImporte(), VentasDTO.getContado(),VentasDTO.getCredito(),VentasDTO.getMedio(),
                VentasDTO.getDestino())));

        for(Ventas e: misVentas){
            importeTotal+=e.getImporte();
        }
        Ventas ventas = Ventas.getInstance("algo", "nn", importeTotal, 0, 0,"internet","chilecito");
        return ventas;
    }


}
