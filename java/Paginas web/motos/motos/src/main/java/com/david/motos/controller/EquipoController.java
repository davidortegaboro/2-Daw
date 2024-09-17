package com.david.motos.controller;


import com.david.motos.common.container.EquipoContainer;
import com.david.motos.common.container.MotoContainer;
import com.david.motos.common.container.PilotoContainer;
import com.david.motos.domain.service.EquipoService;
import com.david.motos.domain.service.MotoService;
import com.david.motos.domain.service.PilotoService;
import org.springframework.stereotype.Controller;

@Controller
public class EquipoController {

    EquipoService equipoService;

    MotoService motoService;

    PilotoService pilotoService;
    public EquipoController() {
        this.equipoService = EquipoContainer.getEquipoService();
        this.motoService = MotoContainer.getMotoService();
        this.pilotoService = PilotoContainer.getPilotoService();
    }
}
