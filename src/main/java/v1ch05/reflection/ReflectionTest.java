package v1ch05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cls = Class.forName(name);
            Class superCls = cls.getSuperclass();

            String modifiers = Modifier.toString(cls.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print("class " + name);
            if (superCls != null && superCls != Object.class) {
                System.out.print(" extends " + superCls.getName());
            }

            System.out.print("\n{\n");
            printConstructors(cls);
            System.out.println();
            printMethod(cls);
            System.out.println();
            printFields(cls);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printFields(Class cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    private static void printMethod(Class cls) {
        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    private static void printConstructors(Class cls) {
        Constructor[] constructors = cls.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(cls.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }

            System.out.print(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }
}
