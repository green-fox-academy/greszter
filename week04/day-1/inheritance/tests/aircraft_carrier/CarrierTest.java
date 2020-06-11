package aircraft_carrier;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.Assert.*;

public class CarrierTest {

  Aircraft f16;
  Aircraft f32;
  Carrier carrier;

  @Before
  public void setUp() {
    f16 = new F16();
    f32 = new F32();
    carrier = new Carrier(300, 2000);
    carrier.add(f16);
    carrier.add(f32);
  }


  @Test
  public void add() {
    carrier.add(f16);
    carrier.add(f32);
    assertEquals(4, carrier.getCarrierSize());
  }

  @Test
  public void fillIfNoAmmo() {
    carrier.setStoreOfAmmo(0);
    carrier.fill();
    assertEquals(0, f16.getAmmunition());
    assertEquals(0, f32.getAmmunition());
  }

  @Test
  public void fillWithAmmoForPriority() {
    carrier.setStoreOfAmmo(15);
    carrier.fill();
    assertEquals(0, f16.getAmmunition());
    assertEquals(12, f32.getAmmunition());
  }

  @Test
  public void fillAll() {
    carrier.setStoreOfAmmo(300);
    carrier.fill();
    assertEquals(8, f16.getAmmunition());
    assertEquals(12, f32.getAmmunition());
  }

//  @Test
//  public void getAllDamage(){
//    Carrier otherCarrier = new Carrier(100, 1500);
//    Aircraft aircraft = new F16();
//    otherCarrier.add(aircraft);
//    carrier.fill();
//    carrier.fight(otherCarrier);
//    assertEquals(840, this.carrier.getAllDamage());
//    assertEquals(1160, this.carrier.getHealthPoint());
//  }
}