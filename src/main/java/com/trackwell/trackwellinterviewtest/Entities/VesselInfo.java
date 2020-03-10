package com.trackwell.trackwellinterviewtest.Entities;

import javax.persistence.Entity;

@Entity
public class VesselInfo {

    private Vessel vessel;
    private Position position;

    public VesselInfo(Vessel v, Position p) {
        vessel = v;
        position = p;
    }

    public Vessel getVessel() {
        return vessel;
    }

    public void setVessel(Vessel v) {
        vessel = v;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position p) {
        position = p;
    }
}
