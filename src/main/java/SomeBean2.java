public class SomeBean2 {

    private SomeBean someBean;

    public SomeBean getSomeBean() {
        return someBean;
    }

    public void setSomeBean(SomeBean someBean) {
        this.someBean = someBean;
    }
    public int age;

    @Override
    public String toString() {
        return "SomeBean2{" +
                "someBean=" + someBean +
                ", age=" + age +
                '}';
    }
}
