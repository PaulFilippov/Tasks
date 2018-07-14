package SortingAndCollections;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.*;

public class CollectionTest {

    private int a;
    private int b;

    public CollectionTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public CollectionTest() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        CollectionTest other = (CollectionTest) obj;
        if (a != other.a)
            return false;
        if (b != other.b)
            return false;
        return true;
    }

}