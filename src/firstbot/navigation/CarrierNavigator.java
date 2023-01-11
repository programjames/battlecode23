package firstbot.navigation;

import battlecode.common.*;
import firstbot.robots.*;

public class CarrierNavigator extends Navigator {
    /*
     * A special Navigator just for Carriers!
     * 
     * Reasons for this: Carriers have to keep track of things like
     * where wells and HQs are that ordinary robots don't. It's wasteful
     * for every robot to have to do this, which is why the Carriers have
     * their own Navigator
     */

    Carrier carrier;

    MapLocation myWellLocation; // MapLocation of the well this carrier frequents

    public CarrierNavigator(Carrier carrier, RobotController rc) {
        super(carrier, rc);
        this.carrier = carrier;
    }

    public void navigateToWell() {
        /*
         * Navigate to a well to collect resources
         */
    }

    public void navigateToHQ() {
        /*
         * Navigate to a headquarters to deposit resources
         */
    }

}
