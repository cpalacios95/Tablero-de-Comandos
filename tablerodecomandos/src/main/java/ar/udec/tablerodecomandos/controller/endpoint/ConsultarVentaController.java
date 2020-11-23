package ar.udec.tablerodecomandos.controller.endpoint;


import ar.udec.tablerodecomandos.controller.dtomodel.VentasDTO;
import ar.udec.tablerodecomandos.core.domain.Ventas;
import ar.udec.tablerodecomandos.core.input.IConsultarVentasInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/planeamiento")
public class ConsultarVentaController {

    @Autowired
    IConsultarVentasInput iConsultarVentasInput;


    @GetMapping(value = "/ventas")
    public ResponseEntity<?> obtenerDatosVentas(){


        Ventas ventas = iConsultarVentasInput.obtenerDatosVentas();

        VentasDTO ventasDTO= new VentasDTO(ventas.getMes(), ventas.getCliente(), ventas.getImporte(),ventas.getContado(),ventas.getCredito(),ventas.getMedio(),ventas.getDestino());

        return ResponseEntity.ok(ventasDTO);
    }



}
