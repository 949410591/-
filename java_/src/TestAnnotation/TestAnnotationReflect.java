package TestAnnotation;

import java.lang.annotation.Annotation;

public class TestAnnotationReflect {
    public static void main(String[] args) {
        Class classA = A.class;
        if(classA.isAnnotationPresent(TestAnnotation.class)){
            TestAnnotation testAnnotation = (TestAnnotation) classA.getAnnotation(TestAnnotation.class);
            System.out.println(testAnnotation.value());



        }
    }
}
