
/**
 * 
 * @author ghyzel
 *
 */
public class Hand {
	
	/**
	 * The cards in the hand
	 */
	private Card [] cards;
	
	/**
	 * Creates an empty hand
	 */
	public Hand() {
		cards = new Card[0];		
	}

	/**
	 * Adds Card c to the hand
	 * 
	 * @param c card to be added
	 */
	public void addCard(Card c) {
		Card[] tempCards = new Card[cards.length+1];
		int i=0;
		for (i=0;i<cards.length;i++){
			tempCards[i]=cards[i];
		}
		tempCards[i]=c;
		cards=tempCards;
	}

	
	/**
	 * @return number of cards in the hand
	 */
	public int size() {
		return cards.length;
	}
	
	/**
	 * Returns an array of all the cards in the hand
	 * 
	 * @return the cards in the hand
	 */
	public Card[] getCards() {
		Card[] tempCards = new Card[this.cards.length];
		for(int i=0;i<tempCards.length;i++){
			tempCards[i]=this.cards[i];
		}
		return tempCards;
	}
	
	/**
	 * Empties the hand, and returns an array containing the discarded cards.
	 * 
	 * @return the discarded cards
	 */
	public Card[] emptyHand() {
		Card[] tempCards = new Card[cards.length];
		Card[] tempCards2 = new Card[0];
		for(int i=0;i<cards.length;i++){
			tempCards[i]=cards[i];
		}
		cards=tempCards2;
		return tempCards;
		
	}
	
	/**
	 * Returns a String representation of the hand
	 * 
	 * E.g.
	 * 
	 * "Empty Hand"
	 * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
	 * 
	 * @return a String representing the hand
	 */
	@Override
	public String toString() {
		Card[] tempCards = new Card[cards.length];
		String o="";
		for(int i=0;i<cards.length;i++){
			tempCards[i]=cards[i];
		}
		if(cards.length==0){
			return "Empty Hand";
		}
		else{
			for(int i=0;i<cards.length;i++){
				o= o+i+". "+tempCards[i].toString()+"\n";
			}
		}
		return o;
	}
}
