package human;


import human.jackets.NikeJacket;
import human.jackets.PumaJacket;
import human.jackets.ReebokJacket;

import human.pants.NikePants;
import human.pants.PumaPants;
import human.pants.ReebokPants;

import human.shoes.NikeShoe;
import human.shoes.PumaShoe;
import human.shoes.ReebokShoe;

public class Main {
    public static void main(String[] args) {
        NikeJacket jacket = new NikeJacket();
        PumaJacket jacket1 = new PumaJacket();
        ReebokJacket jacket2 = new ReebokJacket();
        NikePants pants = new NikePants();
        PumaPants pants1 = new PumaPants();
        ReebokPants pants2 = new ReebokPants();
        NikeShoe shoe = new NikeShoe();
        PumaShoe shoe1 = new PumaShoe();
        ReebokShoe shoe2 = new ReebokShoe();
        Human human = new Human("Kiryl",jacket1,pants2,shoe);
        Human human1 = new Human("Ann",jacket,pants1,shoe2);
        Human human2 = new Human("Den",jacket2,pants,shoe1);
        human.putOffAllThings();
        human1.putOnAllThings();
        human2.putOffAllThings();
    }
}
