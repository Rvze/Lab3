import java.util.ArrayList;

public class Person extends MoominTrolls implements Mining {
    private TypeOfPerson type;




    private ArrayList<Item> items = new ArrayList<>();

    Person(String name, TypeOfPerson typeOfPerson) {
        super(name);
        this.type = typeOfPerson;
    }


    public boolean mine(Item item) {
        GoldPiece gp = item.produce();
        if (gp == null) {
            System.out.println(item + " is not mineable!!!");
            return false;
        }
        if (items.add(gp)) {
            System.out.println(this.getName() + " mine " + gp.sizeToString() +" "+ gp.name+ ".");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<GoldPiece> getGoldPieces() {
        ArrayList<GoldPiece> res = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getClass() == GoldPiece.class) {
                res.add((GoldPiece) item);
            }
        }
    return res;
    }
    boolean changeTypeOfPerson(TypeOfPerson type){
        try{
            TypeOfPerson prevType = TypeOfPerson.COLLECTOR;
            this.type = type;
            System.out.println(this.getName()+ "changes type from "+ prevType +  " "+ "to " + this.type+".");
            return true;
        }
        catch(Exception e){
            System.err.println("Wrong");
            return false;
        }
    }
    public void toTake(Item item){
        System.out.println(this.type+ " "+ this.getName()+ " took " + item);
    }

}
