package com.timmattison.matchables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Matches when the input string has a match for the regular expression
 * pattern in the MatchablePattern.  Used for matching and capturing strings
 * using regular expressions.
 *
 * @author Tim Mattison
**/
public class MatchablePattern extends Matchable {

	public MatchablePattern(String string) {
		super(string);
	}

	@Override
	public boolean matches(String data) {
		return getMatcher(data).find();
	}

	public Matcher getMatcher(String data) {
		Pattern pattern = Pattern.compile(string);
		Matcher matcher = pattern.matcher(data);

		return matcher;
	}

	public String extractMatch(String data) {
		Matcher matcher = getMatcher(data);
		matcher.find();

		return matcher.group(1);
	}
}
