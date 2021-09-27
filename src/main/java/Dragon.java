public class Dragon implements Drivable, Tradable, Domesticatable {
    private int price;
    private int maxSpeed;

    public Dragon() {
        this.maxSpeed = 100;
        this.price = 114514;
    }

    @Override
    public String sound() { return "Rua!"; }

    @Override
    public void upgradeSpeed() { this.maxSpeed += 5; }

    @Override
    public void downgradeSpeed() { this.maxSpeed -= 5; }

    @Override
    public int getMaxSpeed() { return this.maxSpeed; }

    @Override
    public int getPrice() { return this.price; }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +"; Price: " + this.price + ")";
    }
}
