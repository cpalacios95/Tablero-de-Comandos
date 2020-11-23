package ar.udec.tablerodecomandos.controller.endpoint;


import ar.udec.tablerodecomandos.controller.dtomodel.VentasDTO;
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

        List<VentasDTO> misVentas = iConsultarVentasInput.obtenerDatosVentas().stream().map(Ventas ->
                new VentasDTO(Ventas.getMes(),Ventas.getCliente(),Ventas.getImporte(),Ventas.getContado(),
                        Ventas.getCredito(),Ventas.getMedio(),Ventas.getDestino())).collect(Collectors.toCollection(ArrayList::new));

        return ResponseEntity.ok(misVentas);
    }

    @GetMapping(value = "/ventas/totalventasmes")
    public ResponseEntity<?> totalVentasMes(){
        double importeTotal = iConsultarVentasInput.totalVentasMes();

        return ResponseEntity.ok(importeTotal);
    }


}
