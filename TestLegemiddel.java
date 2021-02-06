import java.util.ArrayList;
import java.util.List;

public class TestLegemiddel {
    public static void main(String[] args) {
        /* create some Legemiddel objects */
        Narkotisk narkotisk = new Narkotisk("Diamorphine", 1000, 44, 5);
        Vannedannede vannedannede = new Vannedannede("Hypnotic", 2, 44, 1);
        Vanlig vanlig = new Vanlig("Sealex", 25, 44);
        /* test Legemiddels */
        System.out.println("Narkotisk info: Id = " + narkotisk.getId() + " , name = " + narkotisk.getName() + ", price = " + narkotisk.getPrice() +
                " $, active ingredient = " + narkotisk.getActiveIngredient() + " narkotic strength = " +
                narkotisk.getNarkoticStrength());
        System.out.println("Vannedannede info: Id = " + vannedannede.getId() + " , name = " + vannedannede.getName() + ", price = " + vannedannede.getPrice() +
                " $, active ingredient = " + vannedannede.getActiveIngredient() + " addictive power = " +
                vannedannede.getAddictivePower());
        System.out.println("Vanlig info: Id = " + vanlig.getId() + " , name = " + vanlig.getName() + ", price = " + vanlig.getPrice() +
                " $, active ingredient = " + vanlig.getActiveIngredient());
        /* test toString method */
        List<Legemiddel> legemiddels = new ArrayList<>();
        legemiddels.add(narkotisk);
        legemiddels.add(vannedannede);
        legemiddels.add(vanlig);
        for (Legemiddel legemiddel : legemiddels) {
            System.out.println(legemiddel.toString());
        }

    }

}

