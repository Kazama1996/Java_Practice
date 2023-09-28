import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.transform.Source;

import Concurrency.AnotherThread;
import Launcher.Launcher;
import Launcher.ipml.ConcurrencyLauncher;
import Launcher.ipml.Java_LanguageLauncher;
import Launcher.ipml.SortingLauncher;
import Launcher.ipml.DesignPattern.CompositeLauncher;
import Launcher.ipml.DesignPattern.DecoratorLauncher;

public class App {

    public static void main(String[] args) throws Exception {

        Launcher launcher = new DecoratorLauncher();

        launcher.launch();

    }
}
