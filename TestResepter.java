import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestResepter {
    public static void main(String[] args) {
        /* create some Legemiddel objects */
        Vannedannede vannedannede1 = new Vannedannede("Alcohol", 2, 44, 1);
        Vannedannede vannedannede2 = new Vannedannede("Hypnotic", 2, 44, 1);
        Vanlig vanlig = new Vanlig("Sealex", 109, 44);
        /* create new Resepts */
        MilitaryResept militaryResept = new MilitaryResept(vannedannede2, new Doctor("Ødegaard"), 1, 5);
        PResept pResept = new PResept(vanlig, new Doctor("Solskjær"), 2);
        BlueResept blueResept = new BlueResept(vannedannede1, new Doctor("Haaland"), 3, 5);
        /* test resepts */
        System.out.println("Resept color is " + militaryResept.color() + ", price is " + militaryResept.toPrice());
        System.out.println("Resept color is " + pResept.color() + ", price is " + pResept.toPrice() + ", reit is " + pResept.getReit());
        pResept.use();
        System.out.println("Resept color is " + pResept.color() + ", price is " + pResept.toPrice() + ", reit is " + pResept.getReit());
        System.out.println("Resept color is " + blueResept.color() + " and price is " + blueResept.toPrice());
        /* test toString method */
        List<Resept> resepts = new ArrayList<>();
        resepts.add(militaryResept);
        resepts.add(pResept);
        resepts.add(blueResept);
        for (Resept resept : resepts) {
            System.out.println(resept.toString());
        }

    }
}

