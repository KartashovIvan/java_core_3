package org.example.homework.third.ex2.factory;

import org.example.homework.third.ex2.components.IphoneCamera;
import org.example.homework.third.ex2.components.MotherBoard;
import org.example.homework.third.ex2.components.OperationalSystem;
import org.example.homework.third.ex2.components.SamsungCamera;
import org.example.homework.third.ex2.phone.Iphone15;
import org.example.homework.third.ex2.phone.SamsungGalaxy;

public class PhoneFactory {

    public void assembly(Iphone15 iphone15) {
        iphone15.setCamera(new IphoneCamera());
        iphone15.setMotherBoard(new MotherBoard("7uik", 15, 12, 13));
        iphone15.setOperationalSystem(new OperationalSystem("Ios"));
    }

    public void assembly(SamsungGalaxy samsungGalaxy) {
        samsungGalaxy.setMotherBoard(new MotherBoard("j-108", 10, 12, 13));
        samsungGalaxy.setOperationalSystem(new OperationalSystem("Samsung"));
        samsungGalaxy.setCamera(new SamsungCamera());
    }
}
