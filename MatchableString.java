package com.timmattison.matchables;

/**
 * Matches when the input string contains the MatchableString.  Used for
 * straight-forward, exact substring matching.
 *
 * @author Tim Mattison
**/
public class MatchableString extends Matchable {
	public MatchableString(String string) {
		super(string);
	}

	@Override
	public boolean matches(String input) {
		return input.contains(string);
	}
}
