public class Slave implements Drivable, Domesticatable, Tradable {

    private int maxSpeed;
    public String name;

    public Slave() {
        this.maxSpeed = 1;
    }

    public Slave(String name) {
        this.maxSpeed = 1;
        this.name = name;
    }

    @Override
    public String sound() {
        return "啊！";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10 * this.getMaxSpeed();
    }

    @Override
    public String toString(){
        String name = this.name;
        return name + " (Max speed: " + this.maxSpeed + ", Price: " + this.getPrice() +")";
    }

    public static void main(String[] args) {
        Slave s = new Slave("A man");
        System.out.println(s.toString());
        System.out.println(s.sound());
    }
}
