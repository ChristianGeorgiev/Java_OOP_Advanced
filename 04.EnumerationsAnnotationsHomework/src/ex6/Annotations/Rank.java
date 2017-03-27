package ex6.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rank {
    String type = "Enumeration";
    String category = "Rank";
    String description = "Provides rank constants for a Card class.";
}
