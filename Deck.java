public class Deck {
    //vessel
    private Poker[] cards;

    //constructor
    public Deck(){
        this.cards = new Poker[13 * Suite.values().length];
        int idx = 0;
        for ( int i = 1; i <= 13; i++){
            for ( Suite suite : Suite.values()){
                this.cards[idx] = new Poker(i, suite);
                idx++;
            }
        }
    }

    //get set
    public Poker[] getCards() {
        return this.cards;

    }
    public static void main(String[] args) {
        Deck d1 = new Deck();
        Poker[] cards = d1.getCards();
        for ( int i = 0; i < cards.length; i++) {
             System.out.println(cards[i].getRank() + "" + cards[i].getSuite());

        }      
        } 
    }

