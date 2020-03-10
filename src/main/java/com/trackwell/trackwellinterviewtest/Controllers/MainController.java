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

    /**
     * Returns the VesselInfo for a vessel with the name
     * @param name
     * @return
     */
    @GetMapping("/{name}")
    public VesselInfo getVesselInfo(@PathVariable String name) {
        return mainService.getVesselInfo(name);
    }

    /**
     * Adds a position to a vessel
     * @param name Name of the vessel
     * @param position The new position of the vessel
     * @return
     */
    @PostMapping(path = "/addPosition/{name}")
    public VesselInfo addPosition(@PathVariable String name, @RequestBody Position position) {
        return mainService.addVesselPosition(name, position);
    }

}
