public class Drinks extends Product implements Salable {
    public Drinks(String name, double price, int id) {
        super(name, price, id);
    }

    @Override
    public boolean isSalable() {
        return false;
    }
}
