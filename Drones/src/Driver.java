
public class Driver {


public static void main(String[] args) {

Drone d1 = new Drone (2, 0, 0, 0, 0, 100, "Hi");
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);
d1.moveX(10);
d1.moveY(20);
d1.moveX(-5);
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);

System.out.println(d1.loadPayload(50));
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);
System.out.println(d1.loadPayload(100));
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);

System.out.println("Depot Drone: ");

DroneDepot depot = new DroneDepot(10,10);
d1 = depot.deployDrone(0, 0, 200, null);

System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);
d1.moveX(10);
d1.moveY(20);
d1.moveX(-5);
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);

System.out.println(d1.loadPayload(50));
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);
System.out.println(d1.loadPayload(100));
System.out.println(d1.ID + " (" + d1.posX + "," + d1.posY + ")" + d1.currentPayload);
	}

}
