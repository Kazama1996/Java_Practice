package JAVA_Language.classloader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {

    public void test1() {
        // 對於 自定義類(ClassLoaderTest) 使用getClassLoader()->獲取系統類加載器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@55054057

        // 調用系統類加載器的getParent() -> 獲取擴展類加載器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1); // jdk.internal.loader.ClassLoaders$PlatformClassLoader@4b1210ee
        // 調用擴展類加載器的getParent() -> 無法獲取引導類加載器
        // 引到類加載器主要負責加載java的核心類庫, 無法加載自定義類
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2); // null

        // 就算是核心類 也不能透過 getClassLoader 獲取引導類加載器
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3); // 可以看到直接是null , 因為String 是java 核心類, 所以他的類加載器 是 "引導類加載器"
    }

    // Properties: 用來讀取配置文件

    public void test2() throws Exception {
        Properties props = new Properties();
        // 讀取配置文件

        // 方法1
        // 此時的配置文件默認在目前的module下
        // FileInputStream fis = new FileInputStream("jdbc.properties");

        // 方法2 利用 ClassLoader
        // 配置文件默認路徑為: 目前 module 的 src 底下

        // ClassLoader classLoader = ClassLoader.class.getClassLoader();
        // InputStream is = classLoader.getResourceAsStream("jdbc.properties");

        // props.load(is);

        String user = props.getProperty("user");
        String password = props.getProperty("password");

        System.out.println(user);
        System.out.println(password);

    }

}
