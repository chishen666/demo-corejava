package com.carrx.corejava.relex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射demo
 *
 * @author SEELE
 */
public class RelexDemo {

    public static void main(String[] args) {
        try {
            // 获取Class对象
            // getClazz();
            // 获取构造方法
            // testConstructor();
            // 获取成员变量
            // testField();
            // 获取成员方法
            testMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Class对象的三种方式
     * 1 Object ——> getClass();
     * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
     * 3 通过Class类的静态方法：forName（String  className）(常用)
     */
    public static void getClazz() throws ClassNotFoundException {
        Student stu = new Student();
        // 三种获取Class对象的方法, 最常用第一种 Class实例只有一个.
        Class<?> clazz1 = Class.forName("com.xc.corejava.relex.Student");
        Class<?> clazz2 = stu.getClass();
        Class<?> clazz3 = Student.class;
        System.out.println(clazz1 == clazz2); // true
        System.out.println(clazz1 == clazz3); // true
    }

    /**
     * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
     * <p>
     * 1.获取构造方法：
     * 1).批量的方法：getConstructors
     * public Constructor[] ()：所有"公有的"构造方法
     * public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)
     * <p>
     * 2).获取单个的方法，并调用：
     * public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
     * public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
     * <p>
     * 调用构造方法：
     * Constructor-->newInstance(Object... initargs)
     */
    public static void testConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clazz = Class.forName("com.xc.corejava.relex.Student");

        Constructor<?>[] cons = clazz.getConstructors();
        for (Constructor<?> constructor : cons) {
            System.out.println(constructor);
        }
        System.out.println();

        Constructor<?>[] deCons = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : deCons) {
            System.out.println(constructor);
        }
        System.out.println();

        Constructor<?> con = clazz.getConstructor(int.class);
        System.out.println(con);
        System.out.println();

        Constructor<?> deCon = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(deCon);

        Object obj = con.newInstance(12);
        System.out.println(obj);

        deCon.setAccessible(true);
        Object obj1 = deCon.newInstance("zhangsan", 1);
        System.out.println(obj1);

    }

    /**
     * 获取成员变量并调用：
     * <p>
     * 1.批量的
     * 1).Field[] getFields():获取所有的"公有字段"
     * 2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
     * 2.获取单个的：
     * 1).public Field getField(String fieldName):获取某个"公有的"字段；
     * 2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
     * <p>
     * 设置字段的值：
     * Field --> public void set(Object obj,Object value):
     * 参数说明：
     * 1.obj:要设置的字段所在的对象；
     * 2.value:要为字段设置的值；
     */
    public static void testField()
            throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException,
            IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<?> clazz = Class.forName("com.xc.corejava.relex.Student");

        Field[] fies = clazz.getFields();
        for (Field field : fies) {
            System.out.println(field);
        }
        System.out.println();

        Field[] deFies = clazz.getDeclaredFields();
        for (Field field : deFies) {
            System.out.println(field);
        }
        System.out.println();

        Field fie = clazz.getField("id");
        System.out.println(fie);
        Field deFie = clazz.getDeclaredField("sex");
        System.out.println(deFie);

        Object obj = clazz.getConstructor().newInstance();
        fie.set(obj, 123);
        deFie.setAccessible(true);
        deFie.set(obj, 1);
        Student s = (Student) obj;
        System.out.println(s.getId() + ":" + s.getSex());

    }

    /**
     * 获取成员方法并调用：
     * <p>
     * 1.批量的：
     * public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
     * public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
     * 2.获取单个的：
     * public Method getMethod(String name,Class<?>... parameterTypes):
     * 参数：
     * name : 方法名；
     * Class ... : 形参的Class类型对象
     * public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
     * <p>
     * 调用方法：
     * Method --> public Object invoke(Object obj,Object... args):
     * 参数说明：
     * obj : 要调用方法的对象；
     * args:调用方式时所传递的实参；
     * <p>
     * ):
     */
    public static void testMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("com.xc.corejava.relex.Student");

        Method[] mes = clazz.getMethods();
        for (Method method : mes) {
            System.out.println(method);
        }
        System.out.println();

        Method[] deMes = clazz.getDeclaredMethods();
        for (Method method : deMes) {
            System.out.println(method);
        }
        System.out.println();

        Method me = clazz.getMethod("getAge");
        System.out.println(me);

        Method deMe = clazz.getDeclaredMethod("test", int.class);
        System.out.println(deMe);

        Object obj = clazz.getConstructor().newInstance();
        System.out.println(me.invoke(obj));
        deMe.setAccessible(true);
        System.out.println(deMe.invoke(null, 234));

    }

}
