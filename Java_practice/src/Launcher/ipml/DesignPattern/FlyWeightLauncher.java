package Launcher.ipml.DesignPattern;

import DesignPattern.FlyWeight.Monster;
import DesignPattern.FlyWeight.MonsterFactory;
import Launcher.Launcher;

public class FlyWeightLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        Monster iceDragon1 = MonsterFactory.getMonster("冰龍", 5, 3);
        Monster iceDragon2 = MonsterFactory.getMonster("冰龍", 5, 3);

        Monster bat1 = MonsterFactory.getMonster("吸血蝙蝠", 2, 1);
        Monster bat2 = MonsterFactory.getMonster("吸血蝙蝠", 2, 1);

        Monster minotaurus1 = MonsterFactory.getMonster("牛頭人", 10, 10);
        Monster minotaurus2 = MonsterFactory.getMonster("牛頭人", 10, 10);

        iceDragon1.draw(5, 1);
        iceDragon2.draw(6, 7);

        bat1.draw(2, 8);
        bat2.draw(13, 7);

        minotaurus1.draw(11, 7);
        minotaurus2.draw(7, 7);

    }

}
