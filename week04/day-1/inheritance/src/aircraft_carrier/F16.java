package aircraft_carrier;

public class F16 extends Aircraft {

  public F16() {
    this.maxAmmo = 8;
    this.baseDamage = 30;
    this.type = "F16";
  }

  @Override
  public boolean getPriority() {
    return false;
  }
}
