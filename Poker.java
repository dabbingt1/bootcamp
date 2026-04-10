public class Poker{
    // rank
    // suite
    private int rank;//(1-13)
    private Suite suite;

    public Poker(int rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public int getRank(){
        return this.rank;
    }

    public Suite getSuite(){
        return this.suite;
    }

    public static void main(String[] args) {
        Poker c1 = new Poker(12, Suite.CLUB);
        System.out.println(c1.getRank());
        System.out.println(c1.getSuite());

        

    }

}