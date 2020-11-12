public class Robot implements Runnable{

    private String name = null;
    private double coordX = 0;
    private double coordY = 0;
    private int lastRobotID = 0;

    public Robot(){


    }

    public Robot(int lastRobotID, double coordX, double coordY) {
        this.lastRobotID = lastRobotID;
        this.setName(lastRobotID);
        this.coordX = coordX;
        this.coordY = coordY;
        System.out.println("Robot created => "+ getName());
    }

    public String getName() {
        return name;
    }

    public void setName(int lastRobotID) {
       this.name = "Robot-" + lastRobotID;
    }

    public double getCoordX() { return coordX; }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) robot ID = "+this.lastRobotID);
        //new Robot();

    }


}
