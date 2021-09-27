package Collections;

import java.util.Comparator;

public class ComparatorBylocation implements Comparator<Student> {
    @Override

    public int compare(Student o1, Student o2) {
        return o2.getLocation().compareToIgnoreCase(o1.getLocation());
    }
}
