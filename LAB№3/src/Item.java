public class Item implements Mineable{
    protected String name;
    protected double hp;
    @Override
    public GoldPiece produce() {
        return new GoldPiece();
    }

    public boolean isBroken(){
        if (this.hp < 0) {
            System.err.println("HP of " + this.name + " isn't correct!!!");
            return true;
        }
        return this.hp < 0.33;
    }
    private String hpToString() {
        StringBuilder res = new StringBuilder();

        if (this.hp < 0) {
            System.err.println("HP of " + this.name + " isn't correct!!!");
        } else if (this.hp < 0.33 ) {
            res.append("broken");
        } else if (this.hp < 0.66 ) {
            res.append("battered");
        } else if (this.hp < 1.0) {
            res.append("shabby");
        } else if (Math.abs(this.hp - 1.0) < 0.000000001) {
            res.append("new");
        } else {
            System.err.println("HP of " + this.name + " isn't correct!!!");
        }

        return res.toString();
    }
    public void breakDown() {
        this.hp = this.hp * (Math.random() * 0.6 + 0.4);
    }
    public void restore() {
        this.hp = 1.0d;
    }
    public String toString() {
        return hpToString() + " " + this.name;
    }
    public boolean isShabby(){
        if(this.hp<0){
            System.err.println("HP of " + this.name + " isn't correct!!!");
            return true;
        }
            return this.hp<1.0;
    }

}
