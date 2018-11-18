package old;

public class SomeBean3 {

    private SomeBean someBean;
    private SomeBean2 someBean2;

    public SomeBean3(SomeBean someBean, SomeBean2 someBean2) {

        this.someBean = someBean;
        this.someBean2 = someBean2;
    }
 /*   public old.SomeBean3() {

    }*/
    @Override
    public String toString() {

        return "old.SomeBean3{" +
                "someBean=" + someBean +
                ", someBean2=" + someBean2 +
                '}';
    }
}
