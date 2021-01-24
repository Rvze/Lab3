public class Gold {
    private String name;
    private String adverb;

    Gold(String name, Adverb adverb){
        this.name = name;
        this.adverb = Adverb.GOLD.getUrl();
    }

    public String pieceOfGold(){
        return adverb+name;
    }
    public String toString(){
        return adverb+name;

    }


}
