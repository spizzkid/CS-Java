package question4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        //获取class
        Class<? extends ArrayList> c = list.getClass();
        //获取add方法
        Method add = c.getMethod("add", Object.class);

        add.invoke(list, "str");
        add.invoke(list,'S');
        add.invoke(list,2.1f);

        System.out.println(list);

    }
}
