package TestAnnotation;

public @interface MyAnnotation {
    String value() default "";
    int a() default 1;
}
