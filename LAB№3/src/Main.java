public class Main {
    public static void main(String[] args) {
        Person snork = new Person("Snork ",TypeOfPerson.COLLECTOR);
        Knife knife = new Knife();
        System.out.println(snork.getName()+snork.getAdverb() + knife.Knife("knife"));
        snork.changeTypeOfPerson(TypeOfPerson.GOLDMINER);
        Paw paw = new Paw("paw ");
        Item item = new Item();
        snork.mine(item);
        snork.mine(item);
        snork.mine(item);
        Ship ship = new Ship("Ship");
        Sea sea = new Sea("Sea");
        while (!ship.isBroken()) {
            sea.destruct(ship);
        }
        Person sniff = new Person("Sniff",TypeOfPerson.COLLECTOR);
        Clothes belt = new Clothes("belt");
        while(!belt.isShabby()){
            sea.destruct(belt);
        }
        sniff.toTake(belt);


    }
}
