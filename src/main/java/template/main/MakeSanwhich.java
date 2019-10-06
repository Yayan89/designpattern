package template.main;

import template.Hoagie;
import template.ItalianHoagie;
import template.VegetarianHoagie;

public class MakeSanwhich {
    public static void main(String[] args) {
        Hoagie sandwich1 = new ItalianHoagie();
        Hoagie sandwich2 = new VegetarianHoagie();

        sandwich1.makeSandwich();
        sandwich2.makeSandwich();
    }
}
