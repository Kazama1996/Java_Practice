package Launcher.ipml.DesignPattern;

import DesignPattern.Decorator.Baverage;
import DesignPattern.Decorator.Espresso;
import DesignPattern.Decorator.MilkDecorator;
import DesignPattern.Decorator.SugarDecorator;
import Launcher.Launcher;

public class DecoratorLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        Baverage baverage1 = new Espresso();

        System.out.println(baverage1.getDescription() + " Cost: " + baverage1.cost());

        Baverage baverage2 = new Espresso();

        baverage2 = new MilkDecorator(baverage2);

        System.out.println(baverage2.getDescription() + " Cost: " + baverage2.cost());

        Baverage baverage3 = new Espresso();

        baverage3 = new MilkDecorator(baverage3);

        baverage3 = new SugarDecorator(baverage3);

        System.out.println(baverage3.getDescription() + " Cost: " + baverage3.cost());

    }

}
