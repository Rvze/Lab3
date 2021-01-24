public class Sea implements Destructing{
    private String name;

    Sea(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }


    public void destruct(Item item) {
        System.out.println(this + " destruct " + item + ".");
        String prevItem = item.toString();
        item.breakDown();
        System.out.println(prevItem + " -> " + item);
    }
}
