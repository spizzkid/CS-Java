package question4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        //��ȡclass
        Class<? extends ArrayList> c = list.getClass();
        //��ȡadd����
        Method add = c.getMethod("add", Object.class);

        add.invoke(list, "str");
        add.invoke(list,'S');
        add.invoke(list,2.1f);

        System.out.println(list);

    }
}
