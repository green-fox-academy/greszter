package aircraft_carrier;

public class F32 extends Aircraft {

  public F32() {
    this.maxAmmo = 12;
    this.baseDamage = 50;
    this.type = "F32";
  }

  @Override
  public boolean getPriority() {
    return true;
  }
}
