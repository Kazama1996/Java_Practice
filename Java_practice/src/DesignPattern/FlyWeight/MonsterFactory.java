package DesignPattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class MonsterFactory {
    private static Map<String, Monster> monsterMap = new HashMap<>();

    public static Monster getMonster(String type, int atk, int def) {
        String key = type + "_" + atk + "_" + def;
        Monster monster = monsterMap.get(key);
        if (monster == null) {
            monster = new ConcreteMonster(type, atk, def);
            monsterMap.put(key, monster);
        }
        System.out.println("MonsterMap大小： " + monsterMap.size());
        return monster;
    }

}
