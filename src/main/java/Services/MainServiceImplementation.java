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

    /**
     * Set the position of a vessel
     * @param name
     * @param position
     * @return
     */
    @Override
    public VesselInfo addVesselPosition(String name, Position position) {
        Date date = new Date(); // Get the date of today
        position.setReceivedDate(date); // Set the recieved date as today
        VesselInfo vesselInfo = mainRepository.getVesselInfo(name); // Get the VesselInfo object from the DB (assuming there is a DB)
        vesselInfo.setPosition(position); // Set the position of the vessel
        mainRepository.save(vesselInfo); // Save
        return vesselInfo;
    }

    /**
     * Returns the Vesselinfo of a vessel with name
     * @param name
     * @return
     */
    @Override
    public VesselInfo getVesselInfo(String name) {
        return mainRepository.getVesselInfo(name);
    }
}
