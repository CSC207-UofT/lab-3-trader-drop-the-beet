public class Sheep implements Domesticatable, Tradable {

    public Sheep() {
    }

    @Override
    public String sound() {
        return "Hee-haw!";
    }


    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id;
    }
}