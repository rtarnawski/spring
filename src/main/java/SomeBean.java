import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SomeBean {
    private String name = "";
    private int age;

    private List<String> list;
    private Set<String> set;
    private String[] table;
    private Map<String, String> map;

    @Override
    public String toString() {

        return "SomeBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", set=" + set +
                ", table=" + (table == null ? null : Arrays.asList(table)) +
                ", map=" + map +
                '}';
    }
    public SomeBean(String name, int age, List<String> list, Set<String> set, String[] table, Map<String, String> map) {

        this.name = name;
        this.age = age;
        this.list = list;
        this.set = set;
        this.table = table;
        this.map = map;
    }
}
