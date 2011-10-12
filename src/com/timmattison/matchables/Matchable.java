package com.timmattison.matchables;

/**
 * An abstract class on which MatchableString and MatchablePattern are based
 * 
 * @author Tim Mattison
 **/
public abstract class Matchable {
	protected String string = null;

	public Matchable(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public abstract boolean matches(String input);

	public boolean matches(Character character) {
		return matches(String.valueOf(character));
	}
}
