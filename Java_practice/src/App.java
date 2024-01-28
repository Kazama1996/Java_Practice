import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

import DesignPattern.Proxy.DynamicProxy.ProxyFactory;
import DesignPattern.Proxy.DynamicProxy.RealClass1;
import DesignPattern.Proxy.DynamicProxy.RealClass2;
import DesignPattern.Proxy.DynamicProxy.RealInterface;
import DesignPattern.Proxy.DynamicProxy.RealInterface2;
import DesignPattern.Singleton.SingletonLazyThreadSafe;
import DesignPattern.Singleton.SingletonPublic;
import DesignPattern.Singleton.SingletonStaticFactoryEager;
import DesignPattern.Singleton.SingletonStaticFactoryLazy;
import DesignPattern.Singleton.SingletonTest;
import JAVA_Language.Thread.CreateThread.EvenRunnable;
import JAVA_Language.interfaceAndAbstractclass.MyInterface1;
import JAVA_Language.interfaceAndAbstractclass.TestClass;
import Launcher.Launcher;
import Launcher.Test;
import Launcher.ipml.Java_LanguageLauncher;
import Launcher.ipml.Algorithm.DynamicProgrammingLauncher;
import Launcher.ipml.DataStructure.BinarySearchTreeLauncher;
import Launcher.ipml.DataStructure.RedBlackTreeLauncher;
import Launcher.ipml.DesignPattern.FlyWeightLauncher;
import Launcher.ipml.DesignPattern.ProxyLauncher;

class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}

class IntPair extends Pair<Integer> {

    public IntPair(Integer first, Integer second) {
        super(first, second);
        // TODO Auto-generated constructor stub
    }

}

public class App {

    public static <T> void copyElements(List<? extends T> source, List<T> destination) {
        for (T element : source) {
            destination.add(element);
        }
    }

    static <T> void addElement(List<? super T> list, T element) {
        list.add(element);
    }

    public static long sumWildcard(List<? extends Number> numbers) {
        return numbers.stream().mapToLong(Number::longValue).sum();
    }

    public static <T> void myCopy(List<? extends T> from, List<? super T> to) {
        for (T el : from) {
            to.add(el);
        }
    }

    public static <T> void PrintAllElement(List<? extends T> list) {
        for (T el : list) {
            System.out.println(el);
        }
    }

    public static void main(String[] args) {

        Pair<String> p1 = new Pair<>("Hello", "world");
        Pair<Integer> p2 = new Pair<>(123, 456);
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();
        System.out.println(c1 == c2); // true
        System.out.println(c1 == Pair.class); // true
    }

}
