package Launcher.ipml;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.Lock;

import JAVA_Language.Java8.Lambda.LambdaTest;
import JAVA_Language.Java8.Lambda.LambdaTest1;
import JAVA_Language.Java8.factionalInterface.MyFunctionalInterfaceTest;
import JAVA_Language.Java8.methodref.MethodRefTest;
import JAVA_Language.Java8.streamapi.StreamAPITest;
import JAVA_Language.Thread.CreateThread.ThreadTest;
import JAVA_Language.Thread.Deadlock.DeadlockTest;
import JAVA_Language.Thread.Lock.LockTest;
import JAVA_Language.Thread.ThreadCommunication.CommunicationTest;
import JAVA_Language.Thread.ThreadCommunication.ProducerConsumerTest;
import JAVA_Language.Thread.ThreadCommunication.Quiz.ConsuerProducerTest;
import JAVA_Language.Thread.ThreadQuiz.QuizTest;
import JAVA_Language.Thread.ThreadSafe.WindowTest;
import JAVA_Language.classloader.ClassLoaderTest;
import JAVA_Language.reflection.NewInstanceTest;
import JAVA_Language.reflection.ReflectionTest;
import JAVA_Language.reflection.ch5.FieldTest;
import JAVA_Language.reflection.ch5.MethodTest;
import JAVA_Language.reflection.ch5.OtherTest;
import JAVA_Language.reflection.ch6.ReflectionTest1;
import Launcher.Launcher;

public class Java_LanguageLauncher implements Launcher {

    @Override
    public void launch() throws Exception {
        ConsuerProducerTest test = new ConsuerProducerTest();
        test.test01();

    }
}
