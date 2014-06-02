package com.first8.elasticsearch.dsl.serializer;

import com.first8.elasticsearch.dsl.services.SearchDslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SearchDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SearchDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_AndFilterObject___LeftCurlyBracketKeyword_0_FiltersKeyword_1_ColonKeyword_2__q;
	protected AbstractElementAlias match_BoolFilterObject___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q;
	protected AbstractElementAlias match_FQuery___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q;
	protected AbstractElementAlias match_FuzzyLikeThisFieldQuery_Flt_fieldKeyword_0_0_or_Fuzzy_like_this_fieldKeyword_0_1;
	protected AbstractElementAlias match_FuzzyLikeThisQuery_FltKeyword_0_0_or_Fuzzy_like_thisKeyword_0_1;
	protected AbstractElementAlias match_GeoBoundingBoxFilterObject___CommaKeyword_4_0_TypeParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_GeoBoundingBoxFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q;
	protected AbstractElementAlias match_GeoPolygonFilterObject___CommaKeyword_8_0_CacheParamParserRuleCall_8_1__q;
	protected AbstractElementAlias match_GeoShapeFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_GeohashCellFilterObject_NUMBERParserRuleCall_7_0_or_STRINGTerminalRuleCall_7_1;
	protected AbstractElementAlias match_GeohashCellFilterObject___CommaKeyword_8_0_NeighborsKeyword_8_1_ColonKeyword_8_2_BOOLEANTerminalRuleCall_8_3__q;
	protected AbstractElementAlias match_HasChildQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_HasParentFilterObject_Parent_typeKeyword_1_1_or_TypeKeyword_1_0;
	protected AbstractElementAlias match_HasParentQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_HistogramFacetObject___CommaKeyword_2_0_HistogramFacetParameterParserRuleCall_2_1__a;
	protected AbstractElementAlias match_IndicesFilterObject_IndexParamParserRuleCall_0_1_or_IndicesParamParserRuleCall_0_0;
	protected AbstractElementAlias match_IndicesQueryObject_IndexParamParserRuleCall_1_1_or_IndicesParamParserRuleCall_1_0;
	protected AbstractElementAlias match_MoreLikeThisFieldQuery_Mlt_fieldKeyword_0_0_or_More_like_this_fieldKeyword_0_1;
	protected AbstractElementAlias match_MoreLikeThisQuery_MltKeyword_0_0_or_More_like_thisKeyword_0_1;
	protected AbstractElementAlias match_NestedFilterObject___CommaKeyword_6_0_CacheParamParserRuleCall_6_1__q;
	protected AbstractElementAlias match_NotFilterObject___CommaKeyword_2_0_CacheParamParserRuleCall_2_1__q;
	protected AbstractElementAlias match_PrefixFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_PrefixQueryParameterObject_PrefixKeyword_1_1_or_ValueKeyword_1_0;
	protected AbstractElementAlias match_RangeFilterObject___CommaKeyword_4_0_RangeFilterExecutionParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_RangeFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q;
	protected AbstractElementAlias match_ScriptFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q;
	protected AbstractElementAlias match_TermFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q;
	protected AbstractElementAlias match_TermQueryParametersObject_TermKeyword_1_0_or_ValueKeyword_1_1;
	protected AbstractElementAlias match_TermQuery_WildcardQuery___TermKeyword_0_ColonKeyword_1___or___WildcardKeyword_0_ColonKeyword_1__;
	protected AbstractElementAlias match_TermsFilterObject___CommaKeyword_7_0_TermsFilterExecutionParamParserRuleCall_7_1__q;
	protected AbstractElementAlias match_TermsFilter_InKeyword_0_0_or_TermsKeyword_0_1;
	protected AbstractElementAlias match_TermsQuery_InKeyword_0_0_or_TermsKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SearchDslGrammarAccess) access;
		match_AndFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAndFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getAndFilterObjectAccess().getCacheParamParserRuleCall_4_1()));
		match_AndFilterObject___LeftCurlyBracketKeyword_0_FiltersKeyword_1_ColonKeyword_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAndFilterObjectAccess().getLeftCurlyBracketKeyword_0()), new TokenAlias(false, false, grammarAccess.getAndFilterObjectAccess().getFiltersKeyword_1()), new TokenAlias(false, false, grammarAccess.getAndFilterObjectAccess().getColonKeyword_2()));
		match_BoolFilterObject___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBoolFilterObjectAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getBoolFilterObjectAccess().getCacheParamParserRuleCall_3_1()));
		match_FQuery___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFQueryAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getFQueryAccess().getCacheParamParserRuleCall_3_1()));
		match_FuzzyLikeThisFieldQuery_Flt_fieldKeyword_0_0_or_Fuzzy_like_this_fieldKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFuzzyLikeThisFieldQueryAccess().getFlt_fieldKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFuzzyLikeThisFieldQueryAccess().getFuzzy_like_this_fieldKeyword_0_1()));
		match_FuzzyLikeThisQuery_FltKeyword_0_0_or_Fuzzy_like_thisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFuzzyLikeThisQueryAccess().getFltKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFuzzyLikeThisQueryAccess().getFuzzy_like_thisKeyword_0_1()));
		match_GeoBoundingBoxFilterObject___CommaKeyword_4_0_TypeParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGeoBoundingBoxFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getGeoBoundingBoxFilterObjectAccess().getTypeParamParserRuleCall_4_1()));
		match_GeoBoundingBoxFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGeoBoundingBoxFilterObjectAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getGeoBoundingBoxFilterObjectAccess().getCacheParamParserRuleCall_5_1()));
		match_GeoPolygonFilterObject___CommaKeyword_8_0_CacheParamParserRuleCall_8_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGeoPolygonFilterObjectAccess().getCommaKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getGeoPolygonFilterObjectAccess().getCacheParamParserRuleCall_8_1()));
		match_GeoShapeFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGeoShapeFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getGeoShapeFilterObjectAccess().getCacheParamParserRuleCall_4_1()));
		match_GeohashCellFilterObject_NUMBERParserRuleCall_7_0_or_STRINGTerminalRuleCall_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getNUMBERParserRuleCall_7_0()), new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getSTRINGTerminalRuleCall_7_1()));
		match_GeohashCellFilterObject___CommaKeyword_8_0_NeighborsKeyword_8_1_ColonKeyword_8_2_BOOLEANTerminalRuleCall_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getCommaKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getNeighborsKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getColonKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getGeohashCellFilterObjectAccess().getBOOLEANTerminalRuleCall_8_3()));
		match_HasChildQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getHasChildQueryObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getHasChildQueryObjectAccess().getScoreModeParamParserRuleCall_4_1()));
		match_HasParentFilterObject_Parent_typeKeyword_1_1_or_TypeKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHasParentFilterObjectAccess().getParent_typeKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getHasParentFilterObjectAccess().getTypeKeyword_1_0()));
		match_HasParentQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getHasParentQueryObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getHasParentQueryObjectAccess().getScoreModeParamParserRuleCall_4_1()));
		match_HistogramFacetObject___CommaKeyword_2_0_HistogramFacetParameterParserRuleCall_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getHistogramFacetObjectAccess().getCommaKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getHistogramFacetObjectAccess().getHistogramFacetParameterParserRuleCall_2_1()));
		match_IndicesFilterObject_IndexParamParserRuleCall_0_1_or_IndicesParamParserRuleCall_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIndicesFilterObjectAccess().getIndexParamParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getIndicesFilterObjectAccess().getIndicesParamParserRuleCall_0_0()));
		match_IndicesQueryObject_IndexParamParserRuleCall_1_1_or_IndicesParamParserRuleCall_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIndicesQueryObjectAccess().getIndexParamParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getIndicesQueryObjectAccess().getIndicesParamParserRuleCall_1_0()));
		match_MoreLikeThisFieldQuery_Mlt_fieldKeyword_0_0_or_More_like_this_fieldKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMoreLikeThisFieldQueryAccess().getMlt_fieldKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMoreLikeThisFieldQueryAccess().getMore_like_this_fieldKeyword_0_1()));
		match_MoreLikeThisQuery_MltKeyword_0_0_or_More_like_thisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMoreLikeThisQueryAccess().getMltKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMoreLikeThisQueryAccess().getMore_like_thisKeyword_0_1()));
		match_NestedFilterObject___CommaKeyword_6_0_CacheParamParserRuleCall_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNestedFilterObjectAccess().getCommaKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getNestedFilterObjectAccess().getCacheParamParserRuleCall_6_1()));
		match_NotFilterObject___CommaKeyword_2_0_CacheParamParserRuleCall_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNotFilterObjectAccess().getCommaKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getNotFilterObjectAccess().getCacheParamParserRuleCall_2_1()));
		match_PrefixFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPrefixFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getPrefixFilterObjectAccess().getCacheParamParserRuleCall_4_1()));
		match_PrefixQueryParameterObject_PrefixKeyword_1_1_or_ValueKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrefixQueryParameterObjectAccess().getPrefixKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPrefixQueryParameterObjectAccess().getValueKeyword_1_0()));
		match_RangeFilterObject___CommaKeyword_4_0_RangeFilterExecutionParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRangeFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getRangeFilterObjectAccess().getRangeFilterExecutionParamParserRuleCall_4_1()));
		match_RangeFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRangeFilterObjectAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRangeFilterObjectAccess().getCacheParamParserRuleCall_5_1()));
		match_ScriptFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScriptFilterObjectAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getScriptFilterObjectAccess().getCacheParamParserRuleCall_5_1()));
		match_TermFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTermFilterObjectAccess().getCommaKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getTermFilterObjectAccess().getCacheParamParserRuleCall_4_1()));
		match_TermQueryParametersObject_TermKeyword_1_0_or_ValueKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTermQueryParametersObjectAccess().getTermKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTermQueryParametersObjectAccess().getValueKeyword_1_1()));
		match_TermQuery_WildcardQuery___TermKeyword_0_ColonKeyword_1___or___WildcardKeyword_0_ColonKeyword_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTermQueryAccess().getTermKeyword_0()), new TokenAlias(false, false, grammarAccess.getTermQueryAccess().getColonKeyword_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWildcardQueryAccess().getWildcardKeyword_0()), new TokenAlias(false, false, grammarAccess.getWildcardQueryAccess().getColonKeyword_1())));
		match_TermsFilterObject___CommaKeyword_7_0_TermsFilterExecutionParamParserRuleCall_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTermsFilterObjectAccess().getCommaKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getTermsFilterObjectAccess().getTermsFilterExecutionParamParserRuleCall_7_1()));
		match_TermsFilter_InKeyword_0_0_or_TermsKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTermsFilterAccess().getInKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getTermsFilterAccess().getTermsKeyword_0_1()));
		match_TermsQuery_InKeyword_0_0_or_TermsKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTermsQueryAccess().getInKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getTermsQueryAccess().getTermsKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBOOLEANRule())
			return getBOOLEANToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBOOL_CLAUSERule())
			return getBOOL_CLAUSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBoostParamRule())
			return getBoostParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCacheParamRule())
			return getCacheParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEndParamRule())
			return getEndParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFieldsParamRule())
			return getFieldsParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHistogramFacetParameterRule())
			return getHistogramFacetParameterToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIndexParamRule())
			return getIndexParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIndicesParamRule())
			return getIndicesParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMinimumShouldMatchParamRule())
			return getMinimumShouldMatchParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRangeFilterExecutionParamRule())
			return getRangeFilterExecutionParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRangesParamRule())
			return getRangesParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getScoreModeParamRule())
			return getScoreModeParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTermsFilterExecutionParamRule())
			return getTermsFilterExecutionParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTieBreakerParamRule())
			return getTieBreakerParamToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeParamRule())
			return getTypeParamToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BOOLEAN:
	 *   'true' | 'false';
	 */
	protected String getBOOLEANToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal BOOL_CLAUSE:
	 * 	'"must"' | '"must_not"' | '"should"';
	 */
	protected String getBOOL_CLAUSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"must\"";
	}
	
	/**
	 * BoostParam:
	 * 	'"boost"' ':' FLOAT;
	 */
	protected String getBoostParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"boost\":.";
	}
	
	/**
	 * CacheParam:
	 * 		'"_cache"' ':' BOOLEAN;
	 */
	protected String getCacheParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"_cache\":true";
	}
	
	/**
	 * EndParam:
	 * 	'"end"' ':' INT;
	 */
	protected String getEndParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"end\":";
	}
	
	/**
	 * FieldsParam:
	 * 	'"fields"' ':' '['
	 * 			STRING (',' STRING)*
	 * 		']'
	 * ;
	 */
	protected String getFieldsParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"fields\":[\"\"]";
	}
	
	/**
	 * HistogramFacetParameter:
	 * 	IntervalParam | TimeIntervalParam
	 * ;
	 */
	protected String getHistogramFacetParameterToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"interval\":";
	}
	
	/**
	 * IndexParam:
	 * 	'"index"' ':' STRING;
	 */
	protected String getIndexParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"index\":\"\"";
	}
	
	/**
	 * IndicesParam:
	 * 	'"indices"' ':' '[' INT (',' INT)* ']';
	 */
	protected String getIndicesParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"indices\":[]";
	}
	
	/**
	 * MinimumShouldMatchParam:
	 * 	'"minimum_should_match"' ':' (INT | STRING | ComplexMinimumShouldMatch);
	 */
	protected String getMinimumShouldMatchParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"minimum_should_match\":";
	}
	
	/**
	 * NUMBER:
	 * 	FLOAT | INT;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * RangeFilterExecutionParam:
	 * 	'"execution"' ':' ('"index"' | '"fielddata"');
	 */
	protected String getRangeFilterExecutionParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"execution\":\"index\"";
	}
	
	/**
	 * RangesParam:
	 * 	'"ranges"' ':' '[' RangeObject (',' RangeObject)* ']';
	 */
	protected String getRangesParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"ranges\":[{\"from\":.]";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * ScoreModeParam:
	 * 	'"score_mode"' ':' SCORE_MODES;
	 */
	protected String getScoreModeParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"score_mode\":\"max\"";
	}
	
	/**
	 * TermsFilterExecutionParam:
	 * 	'"execution"' ':' ('"plain"' | '"fielddata"' | '"bool"' | '"and"' | '"or"'| '"bool_nocache"' | '"and_nocache"' | '"or_nocache"');
	 */
	protected String getTermsFilterExecutionParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"execution\":\"plain\"";
	}
	
	/**
	 * TieBreakerParam:
	 * 	'"tie_breaker"' ':' FLOAT;
	 */
	protected String getTieBreakerParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"tie_breaker\":.";
	}
	
	/**
	 * TypeParam:
	 * 	'"type"' ':' ('"indexed"' | '"memory"');
	 */
	protected String getTypeParamToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"type\":\"indexed\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AndFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q.equals(syntax))
				emit_AndFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AndFilterObject___LeftCurlyBracketKeyword_0_FiltersKeyword_1_ColonKeyword_2__q.equals(syntax))
				emit_AndFilterObject___LeftCurlyBracketKeyword_0_FiltersKeyword_1_ColonKeyword_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BoolFilterObject___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q.equals(syntax))
				emit_BoolFilterObject___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FQuery___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q.equals(syntax))
				emit_FQuery___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FuzzyLikeThisFieldQuery_Flt_fieldKeyword_0_0_or_Fuzzy_like_this_fieldKeyword_0_1.equals(syntax))
				emit_FuzzyLikeThisFieldQuery_Flt_fieldKeyword_0_0_or_Fuzzy_like_this_fieldKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FuzzyLikeThisQuery_FltKeyword_0_0_or_Fuzzy_like_thisKeyword_0_1.equals(syntax))
				emit_FuzzyLikeThisQuery_FltKeyword_0_0_or_Fuzzy_like_thisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeoBoundingBoxFilterObject___CommaKeyword_4_0_TypeParamParserRuleCall_4_1__q.equals(syntax))
				emit_GeoBoundingBoxFilterObject___CommaKeyword_4_0_TypeParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeoBoundingBoxFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q.equals(syntax))
				emit_GeoBoundingBoxFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeoPolygonFilterObject___CommaKeyword_8_0_CacheParamParserRuleCall_8_1__q.equals(syntax))
				emit_GeoPolygonFilterObject___CommaKeyword_8_0_CacheParamParserRuleCall_8_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeoShapeFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q.equals(syntax))
				emit_GeoShapeFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeohashCellFilterObject_NUMBERParserRuleCall_7_0_or_STRINGTerminalRuleCall_7_1.equals(syntax))
				emit_GeohashCellFilterObject_NUMBERParserRuleCall_7_0_or_STRINGTerminalRuleCall_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GeohashCellFilterObject___CommaKeyword_8_0_NeighborsKeyword_8_1_ColonKeyword_8_2_BOOLEANTerminalRuleCall_8_3__q.equals(syntax))
				emit_GeohashCellFilterObject___CommaKeyword_8_0_NeighborsKeyword_8_1_ColonKeyword_8_2_BOOLEANTerminalRuleCall_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HasChildQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q.equals(syntax))
				emit_HasChildQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HasParentFilterObject_Parent_typeKeyword_1_1_or_TypeKeyword_1_0.equals(syntax))
				emit_HasParentFilterObject_Parent_typeKeyword_1_1_or_TypeKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HasParentQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q.equals(syntax))
				emit_HasParentQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HistogramFacetObject___CommaKeyword_2_0_HistogramFacetParameterParserRuleCall_2_1__a.equals(syntax))
				emit_HistogramFacetObject___CommaKeyword_2_0_HistogramFacetParameterParserRuleCall_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IndicesFilterObject_IndexParamParserRuleCall_0_1_or_IndicesParamParserRuleCall_0_0.equals(syntax))
				emit_IndicesFilterObject_IndexParamParserRuleCall_0_1_or_IndicesParamParserRuleCall_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IndicesQueryObject_IndexParamParserRuleCall_1_1_or_IndicesParamParserRuleCall_1_0.equals(syntax))
				emit_IndicesQueryObject_IndexParamParserRuleCall_1_1_or_IndicesParamParserRuleCall_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MoreLikeThisFieldQuery_Mlt_fieldKeyword_0_0_or_More_like_this_fieldKeyword_0_1.equals(syntax))
				emit_MoreLikeThisFieldQuery_Mlt_fieldKeyword_0_0_or_More_like_this_fieldKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MoreLikeThisQuery_MltKeyword_0_0_or_More_like_thisKeyword_0_1.equals(syntax))
				emit_MoreLikeThisQuery_MltKeyword_0_0_or_More_like_thisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NestedFilterObject___CommaKeyword_6_0_CacheParamParserRuleCall_6_1__q.equals(syntax))
				emit_NestedFilterObject___CommaKeyword_6_0_CacheParamParserRuleCall_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotFilterObject___CommaKeyword_2_0_CacheParamParserRuleCall_2_1__q.equals(syntax))
				emit_NotFilterObject___CommaKeyword_2_0_CacheParamParserRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrefixFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q.equals(syntax))
				emit_PrefixFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrefixQueryParameterObject_PrefixKeyword_1_1_or_ValueKeyword_1_0.equals(syntax))
				emit_PrefixQueryParameterObject_PrefixKeyword_1_1_or_ValueKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RangeFilterObject___CommaKeyword_4_0_RangeFilterExecutionParamParserRuleCall_4_1__q.equals(syntax))
				emit_RangeFilterObject___CommaKeyword_4_0_RangeFilterExecutionParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RangeFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q.equals(syntax))
				emit_RangeFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ScriptFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q.equals(syntax))
				emit_ScriptFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q.equals(syntax))
				emit_TermFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermQueryParametersObject_TermKeyword_1_0_or_ValueKeyword_1_1.equals(syntax))
				emit_TermQueryParametersObject_TermKeyword_1_0_or_ValueKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermQuery_WildcardQuery___TermKeyword_0_ColonKeyword_1___or___WildcardKeyword_0_ColonKeyword_1__.equals(syntax))
				emit_TermQuery_WildcardQuery___TermKeyword_0_ColonKeyword_1___or___WildcardKeyword_0_ColonKeyword_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermsFilterObject___CommaKeyword_7_0_TermsFilterExecutionParamParserRuleCall_7_1__q.equals(syntax))
				emit_TermsFilterObject___CommaKeyword_7_0_TermsFilterExecutionParamParserRuleCall_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermsFilter_InKeyword_0_0_or_TermsKeyword_0_1.equals(syntax))
				emit_TermsFilter_InKeyword_0_0_or_TermsKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TermsQuery_InKeyword_0_0_or_TermsKeyword_0_1.equals(syntax))
				emit_TermsQuery_InKeyword_0_0_or_TermsKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_AndFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '"filters"' ':')?
	 */
	protected void emit_AndFilterObject___LeftCurlyBracketKeyword_0_FiltersKeyword_1_ColonKeyword_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_BoolFilterObject___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_FQuery___CommaKeyword_3_0_CacheParamParserRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"flt_field"' | '"fuzzy_like_this_field"'
	 */
	protected void emit_FuzzyLikeThisFieldQuery_Flt_fieldKeyword_0_0_or_Fuzzy_like_this_fieldKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"fuzzy_like_this"' | '"flt"'
	 */
	protected void emit_FuzzyLikeThisQuery_FltKeyword_0_0_or_Fuzzy_like_thisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' TypeParam)?
	 */
	protected void emit_GeoBoundingBoxFilterObject___CommaKeyword_4_0_TypeParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_GeoBoundingBoxFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_GeoPolygonFilterObject___CommaKeyword_8_0_CacheParamParserRuleCall_8_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_GeoShapeFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NUMBER | STRING
	 */
	protected void emit_GeohashCellFilterObject_NUMBERParserRuleCall_7_0_or_STRINGTerminalRuleCall_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '"neighbors"' ':' BOOLEAN)?
	 */
	protected void emit_GeohashCellFilterObject___CommaKeyword_8_0_NeighborsKeyword_8_1_ColonKeyword_8_2_BOOLEANTerminalRuleCall_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ScoreModeParam)?
	 */
	protected void emit_HasChildQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"type"' | '"parent_type"'
	 */
	protected void emit_HasParentFilterObject_Parent_typeKeyword_1_1_or_TypeKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ScoreModeParam)?
	 */
	protected void emit_HasParentQueryObject___CommaKeyword_4_0_ScoreModeParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' HistogramFacetParameter)*
	 */
	protected void emit_HistogramFacetObject___CommaKeyword_2_0_HistogramFacetParameterParserRuleCall_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     IndexParam | IndicesParam
	 */
	protected void emit_IndicesFilterObject_IndexParamParserRuleCall_0_1_or_IndicesParamParserRuleCall_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     IndexParam | IndicesParam
	 */
	protected void emit_IndicesQueryObject_IndexParamParserRuleCall_1_1_or_IndicesParamParserRuleCall_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"mlt_field"' | '"more_like_this_field"'
	 */
	protected void emit_MoreLikeThisFieldQuery_Mlt_fieldKeyword_0_0_or_More_like_this_fieldKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"mlt"' | '"more_like_this"'
	 */
	protected void emit_MoreLikeThisQuery_MltKeyword_0_0_or_More_like_thisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_NestedFilterObject___CommaKeyword_6_0_CacheParamParserRuleCall_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_NotFilterObject___CommaKeyword_2_0_CacheParamParserRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_PrefixFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"value"' | '"prefix"'
	 */
	protected void emit_PrefixQueryParameterObject_PrefixKeyword_1_1_or_ValueKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' RangeFilterExecutionParam)?
	 */
	protected void emit_RangeFilterObject___CommaKeyword_4_0_RangeFilterExecutionParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_RangeFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_ScriptFilterObject___CommaKeyword_5_0_CacheParamParserRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' CacheParam)?
	 */
	protected void emit_TermFilterObject___CommaKeyword_4_0_CacheParamParserRuleCall_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"term"' | '"value"'
	 */
	protected void emit_TermQueryParametersObject_TermKeyword_1_0_or_ValueKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('"wildcard"' ':') | ('"term"' ':')
	 */
	protected void emit_TermQuery_WildcardQuery___TermKeyword_0_ColonKeyword_1___or___WildcardKeyword_0_ColonKeyword_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' TermsFilterExecutionParam)?
	 */
	protected void emit_TermsFilterObject___CommaKeyword_7_0_TermsFilterExecutionParamParserRuleCall_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"in"' | '"terms"'
	 */
	protected void emit_TermsFilter_InKeyword_0_0_or_TermsKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"in"' | '"terms"'
	 */
	protected void emit_TermsQuery_InKeyword_0_0_or_TermsKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
