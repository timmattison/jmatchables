package com.timmattison.matchables;

import java.util.ArrayList;
import java.util.List;

/**
 * Simplifies the creation of lists of Matchable objects so they can be easily passed to other methods
 * 
 * @author Tim Mattison
 **/
public class MatchableList {
	public static List<Matchable> create(Matchable... matchables) {
		List<Matchable> matchableList = new ArrayList<Matchable>();

		for (Matchable matchable : matchables) {
			matchableList.add(matchable);
		}

		return matchableList;
	}
}
