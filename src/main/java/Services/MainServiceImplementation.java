package Services;

import Repositories.MainRepository;
import com.trackwell.trackwellinterviewtest.Entities.Position;
import com.trackwell.trackwellinterviewtest.Entities.VesselInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.applet.Main;

import java.util.Date;

@Service
public class MainServiceImplementation implements MainService{

    private MainRepository mainRepository;
    @Autowired
    public MainServiceImplementation(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @Override
    public VesselInfo addVesselPosition(String name, Position position) {
        Date date = new Date();
        position.setReceivedDate(date);
        VesselInfo vesselInfo = mainRepository.getVesselInfo(name);
        vesselInfo.setPosition(position);
        mainRepository.saveVesselInfo(vesselInfo);
        return vesselInfo;
    }

    @Override
    public VesselInfo getVesselInfo(String name) {
        return mainRepository.getVesselInfo(name);
    }
}
