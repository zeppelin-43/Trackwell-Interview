package Services;

import com.trackwell.trackwellinterviewtest.Entities.Position;
import com.trackwell.trackwellinterviewtest.Entities.Vessel;
import com.trackwell.trackwellinterviewtest.Entities.VesselInfo;

public interface MainService {


    VesselInfo addVesselPosition(String name, Position position);

    VesselInfo getVesselInfo(String name);
}
