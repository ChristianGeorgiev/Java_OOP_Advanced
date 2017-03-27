package ex6.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Suit {
    String type = "Enumeration";
    String category = "Suit";
    String description = "Provides suit constants for a Card class.";


}
