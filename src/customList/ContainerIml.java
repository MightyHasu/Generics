package customList;

import java.util.ArrayList;
import java.util.List;

public class ContainerIml<T extends Comparable<T>> implements Container{

    private Class<T> classType;

    private List<T> list;

    public ContainerIml(Class<T> classType) {
        this.setClassType(classType);
        this.list = new ArrayList<>();
    }

    public Class<T> getClassType() {
        return classType;
    }

    private void setClassType(Class<T> classType) {
        this.classType = classType;
    }

    @Override
    public void add(Comparable element) {
        this.list.add((T) element);
    }

    @Override
    public T remove(int index) {
        T t = (T)(this.list.get(index));
        this.list.remove(this.list.get(index));
        return t;
    }

    @Override
    public boolean contains(Comparable element) {
        return this.list.contains(element);
    }

    @Override
    public void swap(int index1, int index2) {
            this.list.add(this.list.get(index1));
            this.list.set(index1, this.list.get(index2));
            this.list.set(index2, this.list.get(this.list.size() - 1));
            this.list.remove(this.list.size() - 1);
    }

    @Override
    public int countGreaterThan(Comparable element) {
        int count = 0;
        for (T t : this.list) {
            if (t.compareTo((T)element)>0){
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        T t = null;
        for (int i = 0; i <this.list.size()-1 ; i++) {
            if (this.list.get(i).compareTo(this.list.get(i+1))>=0){
                t = this.list.get(i);
            }
        }
        return t;
    }

    @Override
    public T getMin() {
        T t = null;
        for (int i = 0; i <this.list.size()-1 ; i++) {
            if (this.list.get(i).compareTo(this.list.get(i+1))<=0){
                t = this.list.get(i);
            }
        }
        return t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s, ",t));
        }
        sb.trimToSize();
        sb.replace(sb.length()-2,sb.length()-1, "");
        return sb.toString();
    }
}
