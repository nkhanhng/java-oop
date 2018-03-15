import java.util.ArrayList;

public class WallTest {
    public static void main(String[] args) {
        ArrayList<Wall> walls = new ArrayList<>();


        //2 Creat wall
        Wall newWall1 = new Wall(2,3);
        Wall newWall2 = new Wall(3,5);

        walls.add(newWall1);
        walls.add(newWall2);
    }

}
