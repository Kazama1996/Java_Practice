package Launcher.ipml;

import javax.swing.text.Style;

import JAVA_Language.Ex;
import JAVA_Language.Friend;
import JAVA_Language.Person;
import Launcher.Launcher;

public class Java_LanguageLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        Friend originalFriend = new Friend("OOF");
        Person original = new Person("original", 25, originalFriend);
        Person deepCopy = original.deepClone();
        System.out.println("Before modify");
        System.out.println("original: " + original);
        System.out.println("deepCopy: " + deepCopy);
        original.setAge(87);
        original.setName("modifyName");
        original.getFriend().setName("new Friend");
        System.out.println("After modify");
        System.out.println("original: " + original);
        System.out.println("deepCopy: " + deepCopy);

    }
}
