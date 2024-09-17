
public class Drone { 
int ID;
int posX, posY; 
int topspeed; 
int signalRange; 
int payloadLimit; 
String message;
int currentPayload;

public Drone(int droneID, int x, int y, int speed, int range, int limit, String m) {
ID = droneID;
posX = x;
posY = y;
topspeed = speed;
signalRange = range;
payloadLimit = limit;
message = m;
currentPayload = 0;

}


public void moveX(int dx) {
posX = posX + dx;

}

public void moveY(int dy) {
posY = posY + dy;

}

public boolean loadPayload (int weight) {
 if (currentPayload + weight <= payloadLimit) {
	 currentPayload += weight;
	 return true;
 }
 
 else {
	 return false;
	 
   }
 
  }
}
