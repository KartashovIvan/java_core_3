package org.example.homework.third.ex2;

import org.example.homework.third.ex2.components.IphoneCamera;
import org.example.homework.third.ex2.components.SamsungCamera;
import org.example.homework.third.ex2.factory.PhoneFactory;
import org.example.homework.third.ex2.phone.Iphone15;
import org.example.homework.third.ex2.phone.Phone;
import org.example.homework.third.ex2.phone.SamsungGalaxy;

public class Runner {
    public static void main(String[] args) {
        Iphone15 iphone15 = new Iphone15();
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();

        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.assembly(iphone15);
        phoneFactory.assembly(samsungGalaxy);

        System.out.println(iphone15);
        System.out.println(samsungGalaxy);
    }
}
