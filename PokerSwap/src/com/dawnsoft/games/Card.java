package com.dawnsoft.games;

public enum Card {
	// ===========================================================
	// Elements
	// ===========================================================

	CLUB_ACE(Color.CLUB, Value.ACE),	
	CLUB_TWO(Color.CLUB, Value.TWO),
	CLUB_THREE(Color.CLUB, Value.THREE),
	CLUB_FOUR(Color.CLUB, Value.FOUR),
	CLUB_FIVE(Color.CLUB, Value.FIVE),
	CLUB_SIX(Color.CLUB, Value.SIX),
	CLUB_SEVEN(Color.CLUB, Value.SEVEN),
//	CLUB_EIGHT(Color.CLUB, Value.EIGHT),
//	CLUB_NINE(Color.CLUB, Value.NINE),
	
//	CLUB_TEN(Color.CLUB, Value.TEN),
//	CLUB_JACK(Color.CLUB, Value.JACK),
//	CLUB_QUEEN(Color.CLUB, Value.QUEEN),
//	CLUB_KING(Color.CLUB, Value.KING),
	
	DIAMOND_ACE(Color.DIAMOND, Value.ACE),	
	DIAMOND_TWO(Color.DIAMOND, Value.TWO),
	DIAMOND_THREE(Color.DIAMOND, Value.THREE),
	DIAMOND_FOUR(Color.DIAMOND, Value.FOUR),
	DIAMOND_FIVE(Color.DIAMOND, Value.FIVE),
	DIAMOND_SIX(Color.DIAMOND, Value.SIX),
	DIAMOND_SEVEN(Color.DIAMOND, Value.SEVEN),
//	DIAMOND_EIGHT(Color.DIAMOND, Value.EIGHT),
//	DIAMOND_NINE(Color.DIAMOND, Value.NINE),
	
//	DIAMOND_TEN(Color.DIAMOND, Value.TEN),
//	DIAMOND_JACK(Color.DIAMOND, Value.JACK),
//	DIAMOND_QUEEN(Color.DIAMOND, Value.QUEEN),
//	DIAMOND_KING(Color.DIAMOND, Value.KING);
	
	HEART_ACE(Color.HEART, Value.ACE),	
	HEART_TWO(Color.HEART, Value.TWO),
	HEART_THREE(Color.HEART, Value.THREE),
	HEART_FOUR(Color.HEART, Value.FOUR),
	HEART_FIVE(Color.HEART, Value.FIVE),
	HEART_SIX(Color.HEART, Value.SIX),
	HEART_SEVEN(Color.HEART, Value.SEVEN),
//	HEART_EIGHT(Color.HEART, Value.EIGHT),
//	HEART_NINE(Color.HEART, Value.NINE),
	
//	HEART_TEN(Color.HEART, Value.TEN),
//	HEART_JACK(Color.HEART, Value.JACK),
//	HEART_QUEEN(Color.HEART, Value.QUEEN),
//	HEART_KING(Color.HEART, Value.KING),
	
	SPADE_ACE(Color.SPADE, Value.ACE),	
	SPADE_TWO(Color.SPADE, Value.TWO),
	SPADE_THREE(Color.SPADE, Value.THREE),
	SPADE_FOUR(Color.SPADE, Value.FOUR),
	SPADE_FIVE(Color.SPADE, Value.FIVE),
	SPADE_SIX(Color.SPADE, Value.SIX),
	SPADE_SEVEN(Color.SPADE, Value.SEVEN);
//	SPADE_EIGHT(Color.SPADE, Value.EIGHT),
//	SPADE_NINE(Color.SPADE, Value.NINE);
	
//	SPADE_TEN(Color.SPADE, Value.TEN),
//	SPADE_JACK(Color.SPADE, Value.JACK),
//	SPADE_QUEEN(Color.SPADE, Value.QUEEN),
//	SPADE_KING(Color.SPADE, Value.KING);
	


	// ===========================================================
	// Constants
	// ===========================================================

	public static final int CARD_WIDTH = 40;
	public static final int CARD_HEIGHT = 40;

	// ===========================================================
	// Fields
	// ===========================================================

	public final Color mColor;
	public final Value mValue;

	// ===========================================================
	// Constructors
	// ===========================================================

	private Card(final Color pColor, final Value pValue) {
		this.mColor = pColor;
		this.mValue = pValue;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================
	
	public int getTexturePositionX() {
		return this.mValue.ordinal() * CARD_WIDTH;
	}
	
	public int getTexturePositionY() {
		return this.mColor.ordinal() * CARD_HEIGHT;
	}
	
	
	@Override
	public String toString() {		
		return this.name().substring(0, 1);// + this.mValue.ordinal();
	}

}
