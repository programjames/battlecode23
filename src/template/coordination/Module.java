package template.coordination;

public class Module {
    /*
     * A Module is a shared piece of code that *any* robot can run and access.
     * A description of the current state of the module can live basically anywhere.
     * These descriptions can be shared between robots thorugh the shared memory,
     * which allows them to have both a consistent memory between them of what the
     * module is for, and allow any robot to update the module.
     * 
     * Examples of uses of Modules:
     *   1. A minimap.
     *   2. A shared strategy.
     *   3. A group of units might share a module that includes details
     *      like who the leader is, where they plan to attack, etc.
     */

     public Module() {
        
     }

     public void push() {
        /*
         * Push updates to the module to the shared memory
         * 
         * Shared memory is small and has low bandwidth, so this should
         * be called only when strictly necessary/very important
         */
     }

     public void pull() {
        /*
         * Pull changes to the  module from shared memory
         * 
         * This probably should be called every round for every module a robot
         * is keeping track of.
         */
        
     }
}
