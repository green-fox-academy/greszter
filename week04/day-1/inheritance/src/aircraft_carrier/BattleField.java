package aircraft_carrier;

public class BattleField {
  public static void main(String[] args) {

    Aircraft f16 = new F16();
    Aircraft f32 = new F32();
    Carrier carrier = new Carrier(300, 0);

    carrier.add(f16);
    carrier.add(f32);



    System.out.println(carrier.getStatus());


}
}
