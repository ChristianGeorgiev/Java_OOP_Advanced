package ex5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {
    @Author(name = "Pesho")
    static void printMethodsByAuthor(Class<?> cl){

        Map<String, List<String>> methodsByAuthor = new HashMap<>();

        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            Author author = method.getAnnotation(Author.class);
            if (author != null) {
                methodsByAuthor
                        .putIfAbsent(author.name(), new ArrayList<>());
                methodsByAuthor
                        .get(author.name()).add(method.getName() + "()");
            }
        }

        for (String s : methodsByAuthor.keySet()) {
            System.out.printf("%s: %s%n", s, String.join(", ", methodsByAuthor.get(s)));
        }

    }

    @Author(name = "Pesho")
    public static void main(String[] args) {
        printMethodsByAuthor(Tracker.class);
    }
}
