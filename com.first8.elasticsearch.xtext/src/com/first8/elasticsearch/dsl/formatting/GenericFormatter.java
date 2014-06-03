package com.first8.elasticsearch.dsl.formatting;

import java.util.List;
import java.util.Set;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * Based on
 * http://blog.dietmar-stoll.de/2011/02/quickly-formatting-dsls-with-xtext.html.
 */
public class GenericFormatter {

	/**
	 * In your implementation of
	 * {@link org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter#configureFormatting(org.eclipse.xtext.formatting.impl.FormattingConfig)}
	 * you may call this generic formatting method first. It indents blocks
	 * between curly braces and sets a linewrap before each keyword. Add your
	 * own behavior afterwards, e.g.
	 *
	 * <pre>
	 *   keywords = grammar.findKeywords(...);
	 *   for (final Keyword keyword : keywords) {
	 *    config.setNoLinewrap().before(keyword);
	 *   }
	 * </pre>
	 */
	public static void genericFormatting(final FormattingConfig config,
			final IGrammarAccess grammar) {
		for (final Pair<Keyword, Keyword> pair : grammar.findKeywordPairs("{",
				"}")) {
			// a space before the first '{'
			config.setSpace(" ").before(pair.getFirst());
			// indentation between
			config.setIndentation(pair.getFirst(), pair.getSecond());
			// and a linewrap before the last '{'
			 config.setLinewrap(1).before(pair.getSecond());
		}

		// linewrap before all keywords

		final List<Keyword> keywords = grammar.findKeywords(",", "{");
		for (final Keyword keyword : keywords) {
			config.setLinewrap().after(keyword);
		}
	}
}