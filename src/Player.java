public class Player {
    int x;
    int y;


    public Player(){
        this.x = 0;
        this.y = 0;
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters & Setters

    public int getX(){
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Player playerTest = new Player(6,7);
        System.out.println(playerTest.getX() + " " + playerTest.getY());

        playerTest.setX(2);
        System.out.println(playerTest.getX() + " " + playerTest.getY());

        playerTest.setY(4);
        System.out.println(playerTest.getX() + " " + playerTest.getY());
    }
}
