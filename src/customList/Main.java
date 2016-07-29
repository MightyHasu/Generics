package customList;

public class Main {

    public static void main(String[] args) {
        Container<Integer> list = new ContainerIml<>(Integer.TYPE);

        list.add(4);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(9);
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
        System.out.println(list.contains(7));
        System.out.println(list.countGreaterThan(6));
        System.out.println(list.getMax());
        System.out.println(list.getMin());
    }

}
