import java.lang.reflect.Method;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class reflectionClass = Reflection.class;
        Reflection ref = (Reflection) reflectionClass.newInstance();

        Method[] methods = reflectionClass.getDeclaredMethods();
        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith("get")){
                getters.add(method);
            }else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        getters = getters.stream()
                .sorted((x1, x2) -> x1.getName().compareTo(x2.getName())).collect(Collectors.toList());
        setters = setters.stream()
                .sorted((x1, x2) -> x1.getName().compareTo(x2.getName())).collect(Collectors.toList());

        for (Method getter : getters) {
            System.out.printf("%s will return %s%n", getter.getName(), getter.getReturnType().getSimpleName());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of %s%n",setter.getName(),
                    setter.getParameterTypes()[0].getSimpleName());
        }
    }
}
