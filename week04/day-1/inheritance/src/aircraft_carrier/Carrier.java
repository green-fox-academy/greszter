package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  protected List<Aircraft> carrier = new ArrayList<>();
  protected int storeOfAmmo;
  protected int healthPoint;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
  }

  public int getStoreOfAmmo() {
    return storeOfAmmo;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setStoreOfAmmo(int storeOfAmmo) {
    this.storeOfAmmo = storeOfAmmo;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public Aircraft getAircraft(int number) {
    return this.carrier.get(number);
  }

  public int getAircraftIndex(Aircraft aircraft) {
    return this.carrier.indexOf(aircraft);
  }

  public int getCarrierSize() {
    return this.carrier.size();
  }

  public void fill() {
    Carrier tempAircrafts = new Carrier(this.getStoreOfAmmo(), this.getHealthPoint());
    if (this.getStoreOfAmmo() == 0) {
      System.out.println("Not enough ammo");
      System.exit(-1);
    }
    for (int i = 0; i < this.carrier.size(); i++) {
      if (this.carrier.get(i).getPriority()) {
        tempAircrafts.add(this.carrier.get(i));
      }
    }
    for (int i = 0; i < this.carrier.size(); i++) {
      if (!this.carrier.get(i).getPriority()) {
        tempAircrafts.add(this.carrier.get(i));
      }
    }
    for (int i = 0; i < this.carrier.size(); i++) {
      if (tempAircrafts.getStoreOfAmmo() >= tempAircrafts.getAircraft(i).getMaxAmmo()) {
        tempAircrafts.getAircraft(i).refill(tempAircrafts.getStoreOfAmmo());
        tempAircrafts.storeOfAmmo -= tempAircrafts.getAircraft(i).getMaxAmmo();
      } else {
        System.out.println("Not enough ammo for all aircrafts");
        System.exit(-1);
      }
    }
    this.carrier.clear();
    this.storeOfAmmo = tempAircrafts.getStoreOfAmmo();
    for (int i = 0; i < this.carrier.size(); i++) {
      this.carrier.add(tempAircrafts.getAircraft(i));
    }
  }

  public void fight(Carrier carrierToFight) {
    int allDamage = 0;
    for (int i = 0; i < this.carrier.size(); i++) {
      this.carrier.get(i).fight();
      allDamage += this.carrier.get(i).fight();
    }
    this.healthPoint -= allDamage;
  }

  public int getAllDamage() {
    int allDamage = 0;
    for (int i = 0; i < this.carrier.size(); i++) {
      this.carrier.get(i).fight();
      allDamage += this.carrier.get(i).fight();
    }
    return allDamage;
  }


  public String getStatus() {
    StringBuilder status = new StringBuilder();
    status.append(
        ("HP: " + getHealthPoint() + ", Aircraft count: " + getCarrierSize() + ", Ammo Storage: " +
            getStoreOfAmmo() + ", Total damage: " + getAllDamage() + "\r\n" + "Aircrafts:" +
            "\r\n"));
    if (this.getHealthPoint() <= 0) {
      return "It's dead Jim :(";
    } else {
      for (int i = 0; i < this.carrier.size(); i++) {
        status.append(this.carrier.get(i).getStatus() + "\r\n");
      }
    }
    return status.toString();
  }
}