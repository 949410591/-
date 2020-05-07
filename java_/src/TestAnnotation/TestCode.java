package TestAnnotation;

@MyAnnotation
public class TestCode {
    public static void main(String[] args) {
        @MyAnnotation
        int a;

        C c = new C();
        D.d();

    }
    @MyAnnotation
    private void a(){
        @MyAnnotation
        int c;
    }
    void b(@MyAnnotation int d){}



}



@MyAnnotation
enum B{

        }
@MyAnnotation
@interface  haah{

}

@Deprecated
class C{

}


class D{
    @Deprecated
    public static void d(){

    }

}
