public class Narkotisk extends Legemiddel {
    private int narkoticStrength;

    public Narkotisk(String name, int price, double activeIngredient, int narkoticStrength) {
        super(name, price, activeIngredient);
        this.narkoticStrength = narkoticStrength;
    }

    public int getNarkoticStrength() {
        return narkoticStrength;
    }

    @Override
    public String toString() {
        return "Narkotisk info:" +" Id = "+getId()+ ", name = " + getName() + ", price = " + getPrice() +
                " $, active ingredient = " + getActiveIngredient() + ", narkotic strength = " +
                getNarkoticStrength();
    }
}

