package Launcher.ipml.DesignPattern;

import DesignPattern.Composite.Gift;
import DesignPattern.Composite.Fukubukuro;
import DesignPattern.Composite.Prize;
import Launcher.Launcher;

public class CompositeLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        // 宣告去年福袋的獎品
        Gift prizeLastYear1 = new Prize(50);
        Gift prizeLastYear2 = new Prize(40);
        Gift prizeLastYear3 = new Prize(30);

        // 宣告今年的福袋獎品
        Gift prize1 = new Prize(500);
        Gift prize2 = new Prize(400);
        Gift prize3 = new Prize(300);

        // 宣告去年的福袋
        Gift FukubukuroLastYear1 = new Fukubukuro();
        Gift FukubukuroLastYear2 = new Fukubukuro();

        // 宣告今年的福袋
        Gift Fukubukuro1 = new Fukubukuro();
        Gift Fukubukuro2 = new Fukubukuro();

        // 把去年的獎品裝進去年的福袋
        FukubukuroLastYear1.add(prizeLastYear1);
        FukubukuroLastYear1.add(prizeLastYear2);

        FukubukuroLastYear2.add(prizeLastYear2);
        FukubukuroLastYear2.add(prizeLastYear3);

        // (今年的獎品+去年的福袋) 裝進去今年的福袋
        Fukubukuro1.add(FukubukuroLastYear1);
        Fukubukuro1.add(prize1);
        Fukubukuro1.add(prize2);

        Fukubukuro2.add(FukubukuroLastYear1);
        Fukubukuro2.add(prize2);
        Fukubukuro2.add(prize3);

        System.out.println(FukubukuroLastYear1.getPrice());
        System.out.println(FukubukuroLastYear2.getPrice());
        System.out.println(Fukubukuro1.getPrice());
        System.out.println(Fukubukuro2.getPrice());

    }

}
