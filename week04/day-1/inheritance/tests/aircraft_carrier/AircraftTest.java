package aircraft_carrier;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class AircraftTest {

    Aircraft f16 = new F16();
    Aircraft f32 = new F32();


    @Test
    public void getPriority() {
        assertFalse(f16.getPriority());
        assertTrue(f32.getPriority());
    }

    @Test
    public void fight(){
        f32.ammunition = 1;
        f16.ammunition = 1;
        assertEquals(50, f32.fight());
        assertEquals(0, f32.getAmmunition());
        assertEquals(30, f16.fight());
        assertEquals(0, f16.getAmmunition());
    }

    @Test
    public void refill(){
        assertEquals(292, f16.refill(300));
        assertEquals(0, f16.refill(8));
        assertEquals(3, f16.refill(3));
        assertEquals(288, f32.refill(300));
        assertEquals(0, f32.refill(12));
        assertEquals(3, f32.refill(3));
    }

    @Test
    public void getType(){
        assertEquals("F16", f16.getType());
        assertEquals("F32", f32.getType());
    }

    @Test
    public void getAmmunition(){
        assertEquals(0, f16.getAmmunition());
        assertEquals(0, f32.getAmmunition());
    }

    @Test
    public void getBaseDamage(){
        assertEquals(30, f16.getBaseDamage());
        assertEquals(50, f32.getBaseDamage());
    }

    @Test
    public void getStatus(){
        assertEquals("Type F16, Ammo: 0, Base Damage: 30, All damage: 0", f16.getStatus());
        assertEquals("Type F32, Ammo: 0, Base Damage: 50, All damage: 0", f32.getStatus());
    }

    @Test
    public void getTotalDamage(){
        assertEquals(0, f16.getTotalDamage());
        assertEquals(0, f32.getTotalDamage());
    }

}