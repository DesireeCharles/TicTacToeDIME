package de.ls5.dywa.generated.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Delegation {
    String attributeName();
    java.lang.Class<?> attributeClass();
}
