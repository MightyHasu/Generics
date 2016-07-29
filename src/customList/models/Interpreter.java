package customList.models;

public class Interpreter {
    private ContainerIml list;

    public Interpreter() {
        this.list = new ContainerIml<>();
    }

    public ContainerIml getList() {
        return list;
    }

    public void implementCommand(String input){
        String[]tokens = input.split("\\s+");
        switch (tokens[0]){
            case "Add" :
                this.list.add(tokens[1]);
                break;
            case "Remove" :
                this.list.remove(Integer.valueOf(tokens[1]));
                break;
            case "Contains" :
                System.out.println(this.list.contains(tokens[1]));
                break;
            case "Swap" :
                this.list.swap(Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]));
                break;
            case "Greater" :
                System.out.println(this.list.countGreaterThan(tokens[1]));
                break;
            case "Max" :
                System.out.println(this.list.getMax());
                break;
            case "Min" :
                System.out.println(this.list.getMin());
                break;
            case "Print" :
                System.out.println(this.list.toString());
                break;
            default:
                break;
        }
    }
}
