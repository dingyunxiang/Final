package test;

import entity.CyryEntity;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dingyunxiang on 16/5/1.
 */
public class TestReleflect {


    public static void main(String[] args) {
        Class a = null;
        try {
            a = Class.forName("entity.CyryEntity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        CyryEntity c  =new CyryEntity();
        c.setName("hah");
        method(c);
//        Field[] fields = c.getClass().getDeclaredFields();
//        for(Field f:fields){
//            //System.out.println(f.getName());
//        }
//        try {
//            Field f1 = a.getField("name");
//            System.out.println(f1);
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        //System.out.println(c.getClass().get);
//        Method[] methods = a.getMethods();
//        for(Method m:methods){
//           // System.out.println(m.getName());
//        }
    }

    public static void method(Object obj) {
        try {
            Class clazz = obj.getClass();
            Field[] fields = obj.getClass().getDeclaredFields();//获得属性
//            for (Field field : fields) {
//                System.out.print(field.getName()+" ");
                PropertyDescriptor pd = new PropertyDescriptor("name",
                        clazz);
                Method getMethod = pd.getReadMethod();//获得get方法
                Object o = getMethod.invoke(obj);//执行get方法返回一个Object
                System.out.println(o);
//            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
