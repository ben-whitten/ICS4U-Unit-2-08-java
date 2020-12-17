/*
* The Truck program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-17
*/

///////////////////////////////////////////////////////////////////////////////

public class Truck extends Vehicle {

  public String licenseplateNumber;
  private final int numberOfTires = 4;
  
  public Truck() {
    super();
  }

  public int getTires() {
    return numberOfTires;
  }

  public void provideAir() {
    super.accelerate();
    super.accelerate();
  }

}
