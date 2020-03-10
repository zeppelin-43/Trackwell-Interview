package com.trackwell.trackwellinterviewtest.Controllers;

import Services.MainService;
import com.trackwell.trackwellinterviewtest.Entities.VesselInfo;
import com.trackwell.trackwellinterviewtest.Entities.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/{name}")
    public VesselInfo getVesselInfo(@PathVariable String name) {
        return mainService.getVesselInfo(name);
    }

    @PostMapping(path = "/addPosition/{name}")
    public VesselInfo addPosition(@PathVariable String name, @RequestBody Position position) {
        return mainService.addVesselPosition(name, position);
    }

}
