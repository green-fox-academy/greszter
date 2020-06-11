package aircraft_carrier;

public class Aircraft {

  protected int ammunition;
  protected int maxAmmo;
  protected int baseDamage;
  protected String type;
  protected int totalDamage;
  protected boolean priority;

  public Aircraft() {
    this.ammunition = 0;
  }

  public int fight() {
    int damage = this.baseDamage * this.ammunition;
    this.ammunition = 0;
    return damage;
  }

  public int refill(int ammo) {
    int remainingAmmo = ammo;
    if (ammo < this.maxAmmo) {
      ammo = ammo;
      this.setAmmunition(this.getAmmunition());
    } else {
      remainingAmmo = ammo - this.maxAmmo;
      this.ammunition += (this.maxAmmo <= ammo) ? this.maxAmmo : (this.maxAmmo - ammo);
    }
    return remainingAmmo;
  }

  public String getType() {
    return this.type;
  }

  public int getAmmunition() {
    return this.ammunition;
  }

  public void setAmmunition(int ammunition) {
    this.ammunition = ammunition;
  }

  public int getBaseDamage() {
    return this.baseDamage;
  }

  public String getStatus() {
    return ("Type " + this.getType() + ", Ammo: " + this.getAmmunition() + ", Base Damage: " +
        this.getBaseDamage() +
        ", All damage: " + this.getTotalDamage());
  }

  public int getTotalDamage() {
    return totalDamage;
  }

  public boolean getPriority() {
    return priority;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }
}


