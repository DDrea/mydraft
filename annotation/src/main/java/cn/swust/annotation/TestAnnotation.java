package cn.swust.annotation;

import java.lang.reflect.Field;
import java.util.Properties;

public class TestAnnotation {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("zsssss");
        boolean mal = check(person);
        System.out.println(mal);
        Properties pro;

    }
    public static boolean check(Person person) throws IllegalAccessException {
        Class<Person> cls = Person.class;
        Field[] fields = cls.getFields();
        System.out.println("开始遍历fields");
        System.out.println(fields.length);
        for(Field f: fields){
            System.out.println("进入了");
            Range range = f.getAnnotation(Range.class);
            if(range!=null){
                if(f.getName().equals("name")){
                    String s = (String) f.get(person);
                    if(s.length()<range.min() || s.length()>range.max())
                        return false;
                }
            }
        }
        return true;
    }
}
