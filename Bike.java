/*
* The Bike program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-17
*/

///////////////////////////////////////////////////////////////////////////////

public class Bike extends Vehicle {

  public int cadence = 1;
  private final int numberOfTires = 2;

  public Bike() {
    super();
  }

  public int getTires() {
    return numberOfTires;
  }

  public int ringBell() {
    return cadence;
  }
  
}
