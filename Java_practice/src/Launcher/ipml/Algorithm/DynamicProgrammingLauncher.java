package Launcher.ipml.Algorithm;

import java.util.Arrays;

import Algorithm.DynamicProgramming.DynamicProgramming;
import Algorithm.DynamicProgramming.impl.DynamicProgrammingImpl;
import Algorithm.DynamicProgramming.impl.DynamicProgrammingTabulationimpl;
import Launcher.Launcher;

public class DynamicProgrammingLauncher implements Launcher {

    DynamicProgramming dp = new DynamicProgrammingTabulationimpl();

    @Override
    public void launch() throws Exception {
        // String[] workBank1 = new String[] { "purp", "p", "ur", "le", "purpl" };
        // String[] workBank2 = new String[] { "ab", "abc", "cd", "def", "abcd" };
        // String[] workBank3 = new String[] { "bo", "rd", "ate", "t", "ska", "sk",
        // "boar" };
        // String[] workBank4 = new String[] { "a", "p", "ent", "enter", "ot", "o", "t"
        // };
        // String[] workBank5 = new String[] { "e", "ee", "eee" };

        // String target1 = "purple";
        // String target2 = "abcdef";
        // String target3 = "skateboard";
        // String target4 = "enterapotentpot";
        // String target5 = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefe";

        // System.out.println(Arrays.deepToString(dp.allConstructString(workBank1,
        // target1)));
        // System.out.println(Arrays.deepToString(dp.allConstructString(workBank2,
        // target2)));
        // System.out.println(Arrays.deepToString(dp.allConstructString(workBank3,
        // target3)));
        // System.out.println(Arrays.deepToString(dp.allConstructString(workBank4,
        // target4)));
        // System.out.println(Arrays.deepToString(dp.allConstructString(workBank5,
        // target5)));

        int[] nums = new int[] { 3, 4, 5, 8 };

        System.out.println(Arrays.toString(dp.howSum(nums, 7)));

    }

}
