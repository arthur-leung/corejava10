package v1ch05.arrays;

import java.lang.reflect.Array;
import java.util.Objects;

public class Copy {
    public Object goodCopyOf(Object a, int newLength) {
        Class cls = a.getClass();
        if (!cls.isArray()) {
            return null;
        }

        Class componentType = cls.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

    public Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }
}
