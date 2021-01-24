import java.util.Objects;

class GoldPiece extends Item  {
    private double size; // size is the double in range of 0 to 10
    private static int ind = 1;

    GoldPiece() {
        this.name = "piece" + ind++ + " of gold";
        this.size = Math.random() * 10;

    }

    public String sizeToString() {
        StringBuilder res = new StringBuilder();
        if (this.size <= 0) {
            System.err.println("Size of " + this.name + " isn't correct!!!");
        } else if (this.size <= 2.5) {
            res.append("small");
        } else if (this.size <= 5.0) {
            res.append("medium");
        } else if (this.size <= 7.5) {
            res.append("large");
        } else if (this.size <= 10.0) {
            res.append("huge");
        } else {
            System.err.println("Size of " + this.name + " isn't correct!!!");
        }
        return res.toString();
    }
    public int compareTo(GoldPiece that) {
        return Math.abs(this.size - that.size) < 0.000000001d ? 0 : ((this.size - that.size) >= 0.000000001d ? 1 : -1);
    }


}