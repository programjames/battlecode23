package fourthbotcopy.coordination;

import battlecode.common.*;

public interface Module {
    /*
     * A Module is anything that takes up comm space.
     * 
     * Examples of uses of Modules:
     *   1. A minimap.
     *   2. A shared strategy.
     *   3. A group of units might share a module that includes details
     *      like who the leader is, where they plan to attack, etc.
     */

     public void push() throws GameActionException; // Push updates to the module to the shared memory
        /*
         * Push updates to the module to the shared memory
         */
     
     public void pull() throws GameActionException; // Pull updates to the module from shared memory       
     
}
