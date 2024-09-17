
public class DroneDepot {

int posX, posY;

int nextID = 0;

public DroneDepot(int x, int y) {
posX = x;
posY = y;
}

public Drone deployDrone (int speed, int range, int limit, String message) {
	

return new Drone (nextID++, posX, posY, speed, range, limit, message);

}

}