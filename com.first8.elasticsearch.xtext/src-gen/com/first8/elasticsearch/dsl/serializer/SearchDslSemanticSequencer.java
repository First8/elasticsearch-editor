package com.first8.elasticsearch.dsl.serializer;

import com.first8.elasticsearch.dsl.search.ASC_DESC;
import com.first8.elasticsearch.dsl.search.AllTermsParam;
import com.first8.elasticsearch.dsl.search.Array;
import com.first8.elasticsearch.dsl.search.BoolClause;
import com.first8.elasticsearch.dsl.search.BoolFilterClause;
import com.first8.elasticsearch.dsl.search.BoolFilterObject;
import com.first8.elasticsearch.dsl.search.BoolQueryObject;
import com.first8.elasticsearch.dsl.search.BoundingBoxObject;
import com.first8.elasticsearch.dsl.search.CommonQueryObject;
import com.first8.elasticsearch.dsl.search.CommonQueryParametersObject;
import com.first8.elasticsearch.dsl.search.DateHistogramFacetObject;
import com.first8.elasticsearch.dsl.search.DisMaxQueryObject;
import com.first8.elasticsearch.dsl.search.ExcludeParam;
import com.first8.elasticsearch.dsl.search.FacetParameter;
import com.first8.elasticsearch.dsl.search.FacetType;
import com.first8.elasticsearch.dsl.search.FacetTypeObject;
import com.first8.elasticsearch.dsl.search.FacetsObject;
import com.first8.elasticsearch.dsl.search.Fields;
import com.first8.elasticsearch.dsl.search.Filter;
import com.first8.elasticsearch.dsl.search.FilterType;
import com.first8.elasticsearch.dsl.search.FilteredQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters;
import com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject;
import com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject;
import com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject;
import com.first8.elasticsearch.dsl.search.GeoShape;
import com.first8.elasticsearch.dsl.search.GeoShapeFilterObject;
import com.first8.elasticsearch.dsl.search.GeoshapeQueryObject;
import com.first8.elasticsearch.dsl.search.HasChildFilterObject;
import com.first8.elasticsearch.dsl.search.HasChildQueryObject;
import com.first8.elasticsearch.dsl.search.HasParentFilterObject;
import com.first8.elasticsearch.dsl.search.HasParentQueryObject;
import com.first8.elasticsearch.dsl.search.HistogramFacetObject;
import com.first8.elasticsearch.dsl.search.IndicesFilterObject;
import com.first8.elasticsearch.dsl.search.IndicesQueryObject;
import com.first8.elasticsearch.dsl.search.KeyValueField;
import com.first8.elasticsearch.dsl.search.KeyValueScript;
import com.first8.elasticsearch.dsl.search.LatLon;
import com.first8.elasticsearch.dsl.search.LatLonArray;
import com.first8.elasticsearch.dsl.search.LatLonString;
import com.first8.elasticsearch.dsl.search.LikeTextParam;
import com.first8.elasticsearch.dsl.search.MatchQueryObject;
import com.first8.elasticsearch.dsl.search.MatchQueryParametersObject;
import com.first8.elasticsearch.dsl.search.Member;
import com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject;
import com.first8.elasticsearch.dsl.search.MultiMatchQueryObject;
import com.first8.elasticsearch.dsl.search.MultiTermQuery;
import com.first8.elasticsearch.dsl.search.NestedFilterObject;
import com.first8.elasticsearch.dsl.search.OrFilterArray;
import com.first8.elasticsearch.dsl.search.Polygon;
import com.first8.elasticsearch.dsl.search.PrefixFilterObject;
import com.first8.elasticsearch.dsl.search.PrefixQueryObject;
import com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject;
import com.first8.elasticsearch.dsl.search.Query;
import com.first8.elasticsearch.dsl.search.QueryObject;
import com.first8.elasticsearch.dsl.search.QueryStringQueryObject;
import com.first8.elasticsearch.dsl.search.QueryType;
import com.first8.elasticsearch.dsl.search.RangeFacetObject;
import com.first8.elasticsearch.dsl.search.RangeFilterObject;
import com.first8.elasticsearch.dsl.search.RangeFilterParametersObject;
import com.first8.elasticsearch.dsl.search.RangeQueryObject;
import com.first8.elasticsearch.dsl.search.RangeQueryParametersObject;
import com.first8.elasticsearch.dsl.search.RegexpFilterObject;
import com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject;
import com.first8.elasticsearch.dsl.search.RegexpQueryObject;
import com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject;
import com.first8.elasticsearch.dsl.search.SORT_MODE;
import com.first8.elasticsearch.dsl.search.ScriptFieldParam;
import com.first8.elasticsearch.dsl.search.ScriptFilterObject;
import com.first8.elasticsearch.dsl.search.ScriptParam;
import com.first8.elasticsearch.dsl.search.SearchDSL;
import com.first8.elasticsearch.dsl.search.SearchField;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.ShapeObject;
import com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope;
import com.first8.elasticsearch.dsl.search.ShortMatchQueryObject;
import com.first8.elasticsearch.dsl.search.ShortSortOject;
import com.first8.elasticsearch.dsl.search.SimpleAndFilterArray;
import com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject;
import com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject;
import com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject;
import com.first8.elasticsearch.dsl.search.Sort;
import com.first8.elasticsearch.dsl.search.SortObject;
import com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject;
import com.first8.elasticsearch.dsl.search.SortObjectProperty;
import com.first8.elasticsearch.dsl.search.SortValue;
import com.first8.elasticsearch.dsl.search.SpanFirstQueryObject;
import com.first8.elasticsearch.dsl.search.SpanNearQueryObject;
import com.first8.elasticsearch.dsl.search.SpanNotQueryObject;
import com.first8.elasticsearch.dsl.search.SpanOrQueryObject;
import com.first8.elasticsearch.dsl.search.SpanQuery;
import com.first8.elasticsearch.dsl.search.SpanTermQueryObject;
import com.first8.elasticsearch.dsl.search.StatisticalFacetObject;
import com.first8.elasticsearch.dsl.search.Stats;
import com.first8.elasticsearch.dsl.search.TermFilterObject;
import com.first8.elasticsearch.dsl.search.TermQueryObject;
import com.first8.elasticsearch.dsl.search.TermQueryParametersObject;
import com.first8.elasticsearch.dsl.search.TermsFacetObject;
import com.first8.elasticsearch.dsl.search.TermsFacetParameter;
import com.first8.elasticsearch.dsl.search.TermsFilterObject;
import com.first8.elasticsearch.dsl.search.TermsQueryObject;
import com.first8.elasticsearch.dsl.search.TopChildrenQueryObject;
import com.first8.elasticsearch.dsl.search.TwoPointBoundingBox;
import com.first8.elasticsearch.dsl.search.TypeFilterObject;
import com.first8.elasticsearch.dsl.search.Value;
import com.first8.elasticsearch.dsl.services.SearchDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SearchDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SearchDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SearchPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SearchPackage.ASC_DESC:
				if(context == grammarAccess.getASC_DESCRule()) {
					sequence_ASC_DESC(context, (ASC_DESC) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.ALL_TERMS_PARAM:
				if(context == grammarAccess.getAllTermsParamRule()) {
					sequence_AllTermsParam(context, (AllTermsParam) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.BOOL_CLAUSE:
				if(context == grammarAccess.getBoolClauseRule()) {
					sequence_BoolClause(context, (BoolClause) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.BOOL_FILTER_CLAUSE:
				if(context == grammarAccess.getBoolFilterClauseRule()) {
					sequence_BoolFilterClause(context, (BoolFilterClause) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.BOOL_FILTER_OBJECT:
				if(context == grammarAccess.getBoolFilterRule() ||
				   context == grammarAccess.getBoolFilterObjectRule()) {
					sequence_BoolFilterObject(context, (BoolFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.BOOL_QUERY_OBJECT:
				if(context == grammarAccess.getBoolQueryRule() ||
				   context == grammarAccess.getBoolQueryObjectRule()) {
					sequence_BoolQueryObject(context, (BoolQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.BOUNDING_BOX_OBJECT:
				if(context == grammarAccess.getBoundingBoxObjectRule()) {
					sequence_BoundingBoxObject(context, (BoundingBoxObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.COMMON_QUERY_OBJECT:
				if(context == grammarAccess.getCommonQueryRule() ||
				   context == grammarAccess.getCommonQueryObjectRule()) {
					sequence_CommonQueryObject(context, (CommonQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.COMMON_QUERY_PARAMETERS_OBJECT:
				if(context == grammarAccess.getCommonQueryParametersObjectRule()) {
					sequence_CommonQueryParametersObject(context, (CommonQueryParametersObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.DATE_HISTOGRAM_FACET_OBJECT:
				if(context == grammarAccess.getDateHistogramFacetRule() ||
				   context == grammarAccess.getDateHistogramFacetObjectRule() ||
				   context == grammarAccess.getFacetTypeRule()) {
					sequence_DateHistogramFacetObject(context, (DateHistogramFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.DIS_MAX_QUERY_OBJECT:
				if(context == grammarAccess.getDisMaxQueryRule() ||
				   context == grammarAccess.getDisMaxQueryObjectRule()) {
					sequence_DisMaxQueryObject(context, (DisMaxQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.EXCLUDE_PARAM:
				if(context == grammarAccess.getExcludeParamRule()) {
					sequence_ExcludeParam(context, (ExcludeParam) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FACET_PARAMETER:
				if(context == grammarAccess.getFacetParameterRule()) {
					sequence_FacetParameter(context, (FacetParameter) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FACET_TYPE:
				if(context == grammarAccess.getFacetTypeRule()) {
					sequence_FacetType(context, (FacetType) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FACET_TYPE_OBJECT:
				if(context == grammarAccess.getFacetTypeObjectRule()) {
					sequence_FacetTypeObject(context, (FacetTypeObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FACETS_OBJECT:
				if(context == grammarAccess.getFacetsRule() ||
				   context == grammarAccess.getFacetsObjectRule()) {
					sequence_FacetsObject(context, (FacetsObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FIELDS:
				if(context == grammarAccess.getFieldsRule()) {
					sequence_Fields(context, (Fields) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FILTER:
				if(context == grammarAccess.getConstantScoreQueryRule() ||
				   context == grammarAccess.getConstantScoreQueryObjectRule() ||
				   context == grammarAccess.getFacetFilterParamRule() ||
				   context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getFilterRule() ||
				   context == grammarAccess.getFilterFacetRule()) {
					sequence_Filter(context, (Filter) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FILTER_TYPE:
				if(context == grammarAccess.getFilterObjectRule() ||
				   context == grammarAccess.getFilterTypeRule()) {
					sequence_FilterType(context, (FilterType) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FILTERED_QUERY_OBJECT:
				if(context == grammarAccess.getFilteredQueryRule() ||
				   context == grammarAccess.getFilteredQueryObjectRule()) {
					sequence_FilteredQueryObject(context, (FilteredQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT:
				if(context == grammarAccess.getFuzzyLikeThisFieldQueryRule() ||
				   context == grammarAccess.getFuzzyLikeThisFieldQueryObjectRule()) {
					sequence_FuzzyLikeThisFieldQueryObject(context, (FuzzyLikeThisFieldQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FUZZY_QUERY_OBJECT:
				if(context == grammarAccess.getFuzzyQueryRule() ||
				   context == grammarAccess.getFuzzyQueryObjectRule()) {
					sequence_FuzzyQueryObject(context, (FuzzyQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.FUZZY_QUERY_OBJECT_PARAMETERS:
				if(context == grammarAccess.getFuzzyQueryObjectParametersRule()) {
					sequence_FuzzyQueryObjectParameters(context, (FuzzyQueryObjectParameters) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_BOUNDING_BOX_FILTER_OBJECT:
				if(context == grammarAccess.getGeoBoundingBoxFilterRule() ||
				   context == grammarAccess.getGeoBoundingBoxFilterObjectRule()) {
					sequence_GeoBoundingBoxFilterObject(context, (GeoBoundingBoxFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_DISTANCE_FACET_OBJECT:
				if(context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getGeoDistanceFacetRule() ||
				   context == grammarAccess.getGeoDistanceFacetObjectRule()) {
					sequence_GeoDistanceFacetObject(context, (GeoDistanceFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_DISTANCE_FILTER_OBJECT:
				if(context == grammarAccess.getGeoDistanceFilterRule() ||
				   context == grammarAccess.getGeoDistanceFilterObjectRule()) {
					sequence_GeoDistanceFilterObject(context, (GeoDistanceFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_DISTANCE_RANGE_FILTER_OBJECT:
				if(context == grammarAccess.getGeoDistanceRangeFilterRule() ||
				   context == grammarAccess.getGeoDistanceRangeFilterObjectRule()) {
					sequence_GeoDistanceRangeFilterObject(context, (GeoDistanceRangeFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_POLYGON_FILTER_OBJECT:
				if(context == grammarAccess.getGeoPolygonFilterRule() ||
				   context == grammarAccess.getGeoPolygonFilterObjectRule()) {
					sequence_GeoPolygonFilterObject(context, (GeoPolygonFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_SHAPE:
				if(context == grammarAccess.getGeoShapeRule() ||
				   context == grammarAccess.getGeoShapeObjectRule()) {
					sequence_GeoShape(context, (GeoShape) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEO_SHAPE_FILTER_OBJECT:
				if(context == grammarAccess.getGeoShapeFilterRule() ||
				   context == grammarAccess.getGeoShapeFilterObjectRule()) {
					sequence_GeoShapeFilterObject(context, (GeoShapeFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.GEOSHAPE_QUERY_OBJECT:
				if(context == grammarAccess.getGeoshapeQueryRule() ||
				   context == grammarAccess.getGeoshapeQueryObjectRule()) {
					sequence_GeoshapeQueryObject(context, (GeoshapeQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.HAS_CHILD_FILTER_OBJECT:
				if(context == grammarAccess.getHasChildFilterRule() ||
				   context == grammarAccess.getHasChildFilterObjectRule()) {
					sequence_HasChildFilterObject(context, (HasChildFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.HAS_CHILD_QUERY_OBJECT:
				if(context == grammarAccess.getHasChildQueryRule() ||
				   context == grammarAccess.getHasChildQueryObjectRule()) {
					sequence_HasChildQueryObject(context, (HasChildQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.HAS_PARENT_FILTER_OBJECT:
				if(context == grammarAccess.getHasParentFilterRule() ||
				   context == grammarAccess.getHasParentFilterObjectRule()) {
					sequence_HasParentFilterObject(context, (HasParentFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.HAS_PARENT_QUERY_OBJECT:
				if(context == grammarAccess.getHasParentQueryRule() ||
				   context == grammarAccess.getHasParentQueryObjectRule()) {
					sequence_HasParentQueryObject(context, (HasParentQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.HISTOGRAM_FACET_OBJECT:
				if(context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getHistogramFacetRule() ||
				   context == grammarAccess.getHistogramFacetObjectRule()) {
					sequence_HistogramFacetObject(context, (HistogramFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.INDICES_FILTER_OBJECT:
				if(context == grammarAccess.getIndicesFilterRule() ||
				   context == grammarAccess.getIndicesFilterObjectRule()) {
					sequence_IndicesFilterObject(context, (IndicesFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.INDICES_QUERY_OBJECT:
				if(context == grammarAccess.getIndicesQueryRule() ||
				   context == grammarAccess.getIndicesQueryObjectRule()) {
					sequence_IndicesQueryObject(context, (IndicesQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.KEY_VALUE_FIELD:
				if(context == grammarAccess.getKeyValueFieldRule()) {
					sequence_KeyValueField(context, (KeyValueField) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.KEY_VALUE_SCRIPT:
				if(context == grammarAccess.getKeyValueScriptRule()) {
					sequence_KeyValueScript(context, (KeyValueScript) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.LAT_LON:
				if(context == grammarAccess.getGeohashCellFilterRule() ||
				   context == grammarAccess.getGeohashCellFilterObjectRule() ||
				   context == grammarAccess.getLatLonRule()) {
					sequence_LatLon(context, (LatLon) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.LAT_LON_ARRAY:
				if(context == grammarAccess.getLatLonArrayRule()) {
					sequence_LatLonArray(context, (LatLonArray) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.LAT_LON_STRING:
				if(context == grammarAccess.getLatLonStringRule()) {
					sequence_LatLonString(context, (LatLonString) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.LIKE_TEXT_PARAM:
				if(context == grammarAccess.getFuzzyLikeThisQueryRule() ||
				   context == grammarAccess.getFuzzyLikeThisQueryObjectRule()) {
					sequence_FuzzyLikeThisQueryObject_LikeTextParam(context, (LikeTextParam) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLikeTextParamRule()) {
					sequence_LikeTextParam(context, (LikeTextParam) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMoreLikeThisFieldQueryRule() ||
				   context == grammarAccess.getMoreLikeThisQueryRule() ||
				   context == grammarAccess.getMoreLikeThisQueryObjectRule()) {
					sequence_LikeTextParam_MoreLikeThisQueryObject(context, (LikeTextParam) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MATCH_QUERY_OBJECT:
				if(context == grammarAccess.getMatchQueryRule() ||
				   context == grammarAccess.getMatchQueryObjectRule()) {
					sequence_MatchQueryObject(context, (MatchQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MATCH_QUERY_PARAMETERS_OBJECT:
				if(context == grammarAccess.getMatchQueryParametersObjectRule()) {
					sequence_MatchQueryParametersObject(context, (MatchQueryParametersObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MORE_LIKE_THIS_FIELD_QUERY_OBJECT:
				if(context == grammarAccess.getMoreLikeThisFieldQueryObjectRule()) {
					sequence_MoreLikeThisFieldQueryObject(context, (MoreLikeThisFieldQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MULTI_MATCH_QUERY_OBJECT:
				if(context == grammarAccess.getMultiMatchQueryRule() ||
				   context == grammarAccess.getMultiMatchQueryObjectRule()) {
					sequence_MultiMatchQueryObject(context, (MultiMatchQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.MULTI_TERM_QUERY:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_MultiTermQuery(context, (MultiTermQuery) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.NESTED_FILTER_OBJECT:
				if(context == grammarAccess.getNestedFilterRule() ||
				   context == grammarAccess.getNestedFilterObjectRule()) {
					sequence_NestedFilterObject(context, (NestedFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.OBJECT:
				if(context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getObjectRule() ||
				   context == grammarAccess.getTermsStatsFacetRule()) {
					sequence_Object(context, (com.first8.elasticsearch.dsl.search.Object) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.OR_FILTER_ARRAY:
				if(context == grammarAccess.getOrFilterRule() ||
				   context == grammarAccess.getOrFilterArrayRule()) {
					sequence_OrFilterArray(context, (OrFilterArray) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.POLYGON:
				if(context == grammarAccess.getPolygonRule()) {
					sequence_Polygon(context, (Polygon) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.PREFIX_FILTER_OBJECT:
				if(context == grammarAccess.getPrefixFilterRule() ||
				   context == grammarAccess.getPrefixFilterObjectRule()) {
					sequence_PrefixFilterObject(context, (PrefixFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.PREFIX_QUERY_OBJECT:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getPrefixQueryRule() ||
				   context == grammarAccess.getPrefixQueryObjectRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_PrefixQueryObject(context, (PrefixQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.PREFIX_QUERY_PARAMETER_OBJECT:
				if(context == grammarAccess.getPrefixQueryParameterObjectRule()) {
					sequence_PrefixQueryParameterObject(context, (PrefixQueryParameterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.QUERY:
				if(context == grammarAccess.getConstantScoreQueryRule() ||
				   context == grammarAccess.getConstantScoreQueryObjectRule() ||
				   context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getNestedQueryRule() ||
				   context == grammarAccess.getNestedQueryObjectRule() ||
				   context == grammarAccess.getNotFilterRule() ||
				   context == grammarAccess.getNotFilterObjectRule() ||
				   context == grammarAccess.getQueryRule() ||
				   context == grammarAccess.getQueryFacetRule() ||
				   context == grammarAccess.getQueryFilterRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.QUERY_OBJECT:
				if(context == grammarAccess.getFQueryRule() ||
				   context == grammarAccess.getQueryFilterRule() ||
				   context == grammarAccess.getQueryObjectRule()) {
					sequence_QueryObject(context, (QueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.QUERY_STRING_QUERY_OBJECT:
				if(context == grammarAccess.getQueryStringQueryRule() ||
				   context == grammarAccess.getQueryStringQueryObjectRule()) {
					sequence_QueryStringQueryObject(context, (QueryStringQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.QUERY_TYPE:
				if(context == grammarAccess.getQueryTypeRule()) {
					sequence_QueryType(context, (QueryType) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.RANGE_FACET_OBJECT:
				if(context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getRangeFacetRule() ||
				   context == grammarAccess.getRangeFacetObjectRule()) {
					sequence_RangeFacetObject(context, (RangeFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.RANGE_FILTER_OBJECT:
				if(context == grammarAccess.getRangeFilterRule() ||
				   context == grammarAccess.getRangeFilterObjectRule()) {
					sequence_RangeFilterObject(context, (RangeFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.RANGE_FILTER_PARAMETERS_OBJECT:
				if(context == grammarAccess.getRangeFilterParametersObjectRule()) {
					sequence_RangeFilterParametersObject(context, (RangeFilterParametersObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.RANGE_QUERY_OBJECT:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getRangeQueryRule() ||
				   context == grammarAccess.getRangeQueryObjectRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_RangeQueryObject(context, (RangeQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.RANGE_QUERY_PARAMETERS_OBJECT:
				if(context == grammarAccess.getRangeQueryParametersObjectRule()) {
					sequence_RangeQueryParametersObject(context, (RangeQueryParametersObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.REGEXP_FILTER_OBJECT:
				if(context == grammarAccess.getRegexpFilterRule() ||
				   context == grammarAccess.getRegexpFilterObjectRule()) {
					sequence_RegexpFilterObject(context, (RegexpFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.REGEXP_FILTER_PARAMETER_OBJECT:
				if(context == grammarAccess.getRegexpFilterParameterObjectRule()) {
					sequence_RegexpFilterParameterObject(context, (RegexpFilterParameterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.REGEXP_QUERY_OBJECT:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getRegexpQueryRule() ||
				   context == grammarAccess.getRegexpQueryObjectRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_RegexpQueryObject(context, (RegexpQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.REGEXP_QUERY_PARAMETER_OBJECT:
				if(context == grammarAccess.getRegexpQueryParameterObjectRule()) {
					sequence_RegexpQueryParameterObject(context, (RegexpQueryParameterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT_MODE:
				if(context == grammarAccess.getSORT_MODERule()) {
					sequence_SORT_MODE(context, (SORT_MODE) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SCRIPT_FIELD_PARAM:
				if(context == grammarAccess.getScriptFieldParamRule()) {
					sequence_ScriptFieldParam(context, (ScriptFieldParam) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SCRIPT_FILTER_OBJECT:
				if(context == grammarAccess.getScriptFilterRule() ||
				   context == grammarAccess.getScriptFilterObjectRule()) {
					sequence_ScriptFilterObject(context, (ScriptFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SCRIPT_PARAM:
				if(context == grammarAccess.getScriptParamRule()) {
					sequence_ScriptParam(context, (ScriptParam) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SEARCH_DSL:
				if(context == grammarAccess.getSearchDSLRule()) {
					sequence_SearchDSL(context, (SearchDSL) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SEARCH_FIELD:
				if(context == grammarAccess.getSearchFieldRule()) {
					sequence_SearchField(context, (SearchField) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SHAPE_OBJECT:
				if(context == grammarAccess.getShapeObjectRule()) {
					sequence_ShapeObject(context, (ShapeObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SHAPE_TYPE_ENVELOPE:
				if(context == grammarAccess.getShapeRule() ||
				   context == grammarAccess.getShapeTypeRule() ||
				   context == grammarAccess.getShapeTypeEnvelopeRule()) {
					sequence_ShapeTypeEnvelope(context, (ShapeTypeEnvelope) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SHORT_MATCH_QUERY_OBJECT:
				if(context == grammarAccess.getMatchQueryRule() ||
				   context == grammarAccess.getShortMatchQueryObjectRule()) {
					sequence_ShortMatchQueryObject(context, (ShortMatchQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SHORT_SORT_OJECT:
				if(context == grammarAccess.getShortSortOjectRule()) {
					sequence_ShortSortOject(context, (ShortSortOject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SIMPLE_AND_FILTER_ARRAY:
				if(context == grammarAccess.getAndFilterRule() ||
				   context == grammarAccess.getAndFilterObjectRule() ||
				   context == grammarAccess.getSimpleAndFilterArrayRule()) {
					sequence_SimpleAndFilterArray(context, (SimpleAndFilterArray) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SIMPLE_FUZZY_QUERY_OBJECT:
				if(context == grammarAccess.getFuzzyQueryRule() ||
				   context == grammarAccess.getSimpleFuzzyQueryObjectRule()) {
					sequence_SimpleFuzzyQueryObject(context, (SimpleFuzzyQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SIMPLE_PREFIX_QUERY_OBJECT:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getPrefixQueryRule() ||
				   context == grammarAccess.getSimplePrefixQueryObjectRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_SimplePrefixQueryObject(context, (SimplePrefixQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SIMPLE_QUERY_STRING_QUERY_OBJECT:
				if(context == grammarAccess.getSimpleQueryStringQueryRule() ||
				   context == grammarAccess.getSimpleQueryStringQueryObjectRule()) {
					sequence_SimpleQueryStringQueryObject(context, (SimpleQueryStringQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT:
				if(context == grammarAccess.getSortRule()) {
					sequence_Sort(context, (Sort) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT_OBJECT:
				if(context == grammarAccess.getSortObjectRule()) {
					sequence_SortObject(context, (SortObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT_OBJECT_PROPERTIES_OBJECT:
				if(context == grammarAccess.getSortObjectPropertiesObjectRule()) {
					sequence_SortObjectPropertiesObject(context, (SortObjectPropertiesObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT_OBJECT_PROPERTY:
				if(context == grammarAccess.getSortObjectPropertyRule()) {
					sequence_SortObjectProperty(context, (SortObjectProperty) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SORT_VALUE:
				if(context == grammarAccess.getSortValueRule()) {
					sequence_SortValue(context, (SortValue) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_FIRST_QUERY_OBJECT:
				if(context == grammarAccess.getSpanFirstQueryRule() ||
				   context == grammarAccess.getSpanFirstQueryObjectRule()) {
					sequence_SpanFirstQueryObject(context, (SpanFirstQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_NEAR_QUERY_OBJECT:
				if(context == grammarAccess.getSpanNearQueryRule() ||
				   context == grammarAccess.getSpanNearQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_SpanNearQueryObject(context, (SpanNearQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_NOT_QUERY_OBJECT:
				if(context == grammarAccess.getSpanNotQueryRule() ||
				   context == grammarAccess.getSpanNotQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_SpanNotQueryObject(context, (SpanNotQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_OR_QUERY_OBJECT:
				if(context == grammarAccess.getSpanOrQueryRule() ||
				   context == grammarAccess.getSpanOrQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule()) {
					sequence_SpanOrQueryObject(context, (SpanOrQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_QUERY:
				if(context == grammarAccess.getSpanQueryRule()) {
					sequence_SpanQuery(context, (SpanQuery) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.SPAN_TERM_QUERY_OBJECT:
				if(context == grammarAccess.getSpanQueryRule() ||
				   context == grammarAccess.getSpanTermQueryRule() ||
				   context == grammarAccess.getSpanTermQueryObjectRule()) {
					sequence_SpanTermQueryObject(context, (SpanTermQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.STATISTICAL_FACET_OBJECT:
				if(context == grammarAccess.getFacetTypeRule() ||
				   context == grammarAccess.getStatisticalFacetRule() ||
				   context == grammarAccess.getStatisticalFacetObjectRule()) {
					sequence_StatisticalFacetObject(context, (StatisticalFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.STATS:
				if(context == grammarAccess.getStatsRule()) {
					sequence_Stats(context, (Stats) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERM_FILTER_OBJECT:
				if(context == grammarAccess.getTermFilterRule() ||
				   context == grammarAccess.getTermFilterObjectRule()) {
					sequence_TermFilterObject(context, (TermFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERM_QUERY_OBJECT:
				if(context == grammarAccess.getMultiTermQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryRule() ||
				   context == grammarAccess.getSpanMultiQueryObjectRule() ||
				   context == grammarAccess.getSpanQueryRule() ||
				   context == grammarAccess.getTermQueryRule() ||
				   context == grammarAccess.getTermQueryObjectRule() ||
				   context == grammarAccess.getWildcardQueryRule()) {
					sequence_TermQueryObject(context, (TermQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERM_QUERY_PARAMETERS_OBJECT:
				if(context == grammarAccess.getTermQueryParametersObjectRule()) {
					sequence_TermQueryParametersObject(context, (TermQueryParametersObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERMS_FACET_OBJECT:
				if(context == grammarAccess.getTermsFacetRule() ||
				   context == grammarAccess.getTermsFacetObjectRule()) {
					sequence_TermsFacetObject(context, (TermsFacetObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERMS_FACET_PARAMETER:
				if(context == grammarAccess.getTermsFacetParameterRule()) {
					sequence_TermsFacetParameter(context, (TermsFacetParameter) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERMS_FILTER_OBJECT:
				if(context == grammarAccess.getTermsFilterRule() ||
				   context == grammarAccess.getTermsFilterObjectRule()) {
					sequence_TermsFilterObject(context, (TermsFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TERMS_QUERY_OBJECT:
				if(context == grammarAccess.getTermsQueryRule() ||
				   context == grammarAccess.getTermsQueryObjectRule()) {
					sequence_TermsQueryObject(context, (TermsQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TOP_CHILDREN_QUERY_OBJECT:
				if(context == grammarAccess.getTopChildrenQueryRule() ||
				   context == grammarAccess.getTopChildrenQueryObjectRule()) {
					sequence_TopChildrenQueryObject(context, (TopChildrenQueryObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TWO_POINT_BOUNDING_BOX:
				if(context == grammarAccess.getTwoPointBoundingBoxRule()) {
					sequence_TwoPointBoundingBox(context, (TwoPointBoundingBox) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.TYPE_FILTER_OBJECT:
				if(context == grammarAccess.getTypeFilterRule() ||
				   context == grammarAccess.getTypeFilterObjectRule()) {
					sequence_TypeFilterObject(context, (TypeFilterObject) semanticObject); 
					return; 
				}
				else break;
			case SearchPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (ascDesc='"asc"' | ascDesc='"desc"')
	 */
	protected void sequence_ASC_DESC(EObject context, ASC_DESC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     allTerms=BOOLEAN
	 */
	protected void sequence_AllTermsParam(EObject context, AllTermsParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getAllTermsParam_AllTerms()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getAllTermsParam_AllTerms()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAllTermsParamAccess().getAllTermsBOOLEANTerminalRuleCall_2_0(), semanticObject.getAllTerms());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Value? values+=Value*)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     query=QueryObject
	 */
	protected void sequence_BoolClause(EObject context, BoolClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getBoolClause_Query()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getBoolClause_Query()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolClauseAccess().getQueryQueryObjectParserRuleCall_2_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     filter=FilterObject
	 */
	protected void sequence_BoolFilterClause(EObject context, BoolFilterClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getBoolFilterClause_Filter()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getBoolFilterClause_Filter()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolFilterClauseAccess().getFilterFilterObjectParserRuleCall_2_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (clause+=BoolFilterClause clause+=BoolFilterClause*)
	 */
	protected void sequence_BoolFilterObject(EObject context, BoolFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clause+=BoolClause clause+=BoolClause* (params+=BoolQueryParameter params+=BoolQueryParameter*)?)
	 */
	protected void sequence_BoolQueryObject(EObject context, BoolQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (twoPointBoundingBox=TwoPointBoundingBox | verticesBoundingBox=VerticesBoundingBox)
	 */
	protected void sequence_BoundingBoxObject(EObject context, BoundingBoxObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING parameters=CommonQueryParametersObject)
	 */
	protected void sequence_CommonQueryObject(EObject context, CommonQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getCommonQueryObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getCommonQueryObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getCommonQueryObject_Parameters()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getCommonQueryObject_Parameters()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommonQueryObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getCommonQueryObjectAccess().getParametersCommonQueryParametersObjectParserRuleCall_3_0(), semanticObject.getParameters());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (query=STRING (params+=CommonQueryParameter params+=CommonQueryParameter*)?)
	 */
	protected void sequence_CommonQueryParametersObject(EObject context, CommonQueryParametersObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=FieldParam | keyValue=KeyValueField | keyValueScript=KeyValueScript)
	 */
	protected void sequence_DateHistogramFacetObject(EObject context, DateHistogramFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query+=QueryObject query+=QueryObject*)
	 */
	protected void sequence_DisMaxQueryObject(EObject context, DisMaxQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (excludeFieldNames+=STRING excludeFieldNames+=STRING*)
	 */
	protected void sequence_ExcludeParam(EObject context, ExcludeParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (global=GlobalParam | faceFilter=FacetFilterParam)
	 */
	protected void sequence_FacetParameter(EObject context, FacetParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (facetType=FacetType params+=FacetParameter*)
	 */
	protected void sequence_FacetTypeObject(EObject context, FacetTypeObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     facetType=TermsFacet
	 */
	protected void sequence_FacetType(EObject context, FacetType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFacetType_FacetType()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFacetType_FacetType()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFacetTypeAccess().getFacetTypeTermsFacetParserRuleCall_0_0(), semanticObject.getFacetType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (facetName=STRING config=FacetTypeObject)
	 */
	protected void sequence_FacetsObject(EObject context, FacetsObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFacetsObject_FacetName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFacetsObject_FacetName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFacetsObject_Config()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFacetsObject_Config()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFacetsObjectAccess().getFacetNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFacetName());
		feeder.accept(grammarAccess.getFacetsObjectAccess().getConfigFacetTypeObjectParserRuleCall_3_0(), semanticObject.getConfig());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     selectfields=Array
	 */
	protected void sequence_Fields(EObject context, Fields semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFields_Selectfields()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFields_Selectfields()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldsAccess().getSelectfieldsArrayParserRuleCall_2_0(), semanticObject.getSelectfields());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         and=AndFilter | 
	 *         bool=BoolFilter | 
	 *         exists=ExistsFilter | 
	 *         geoBoundingBox=GeoBoundingBoxFilter | 
	 *         geoDistance=GeoDistanceFilter | 
	 *         geoDistanceRange=GeoDistanceRangeFilter | 
	 *         geoPolygon=GeoPolygonFilter | 
	 *         geoShape=GeoShapeFilter | 
	 *         geoHashCell=GeohashCellFilter | 
	 *         hasChild=HasChildFilter | 
	 *         hasParent=HasParentFilter | 
	 *         ids=IdsFilter | 
	 *         indices=IndicesFilter | 
	 *         limit=LimitFilter | 
	 *         matchAll=MatchAllFilter | 
	 *         missing=MissingFilter | 
	 *         nested=NestedFilter | 
	 *         not=NotFilter | 
	 *         or=OrFilter | 
	 *         prefix=PrefixFilter | 
	 *         query=QueryFilter | 
	 *         regexp=RegexpFilter | 
	 *         script=ScriptFilter | 
	 *         term=TermFilter | 
	 *         terms=TermsFilter | 
	 *         type=TypeFilter
	 *     )
	 */
	protected void sequence_FilterType(EObject context, FilterType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     filter=FilterObject
	 */
	protected void sequence_Filter(EObject context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=Query filter=Filter)
	 */
	protected void sequence_FilteredQueryObject(EObject context, FilteredQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFilteredQueryObject_Query()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFilteredQueryObject_Query()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFilteredQueryObject_Filter()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFilteredQueryObject_Filter()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilteredQueryObjectAccess().getQueryQueryParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.accept(grammarAccess.getFilteredQueryObjectAccess().getFilterFilterParserRuleCall_3_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING (params+=FuzzyLikeThisFieldQueryParameter params+=FuzzyLikeThisFieldQueryParameter*)?)
	 */
	protected void sequence_FuzzyLikeThisFieldQueryObject(EObject context, FuzzyLikeThisFieldQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (likeQuery=STRING (params+=FuzzyLikeThisQueryParameter params+=FuzzyLikeThisQueryParameter*)?)
	 */
	protected void sequence_FuzzyLikeThisQueryObject_LikeTextParam(EObject context, LikeTextParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING (params+=FuzzyQueryParameter params+=FuzzyQueryParameter*)?)
	 */
	protected void sequence_FuzzyQueryObjectParameters(EObject context, FuzzyQueryObjectParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=STRING q=FuzzyQueryObjectParameters)
	 */
	protected void sequence_FuzzyQueryObject(EObject context, FuzzyQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFuzzyQuery_Field()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFuzzyQuery_Field()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFuzzyQueryObject_Q()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFuzzyQueryObject_Q()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuzzyQueryObjectAccess().getFieldSTRINGTerminalRuleCall_1_0(), semanticObject.getField());
		feeder.accept(grammarAccess.getFuzzyQueryObjectAccess().getQFuzzyQueryObjectParametersParserRuleCall_3_0(), semanticObject.getQ());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING boundingBox=BoundingBoxObject)
	 */
	protected void sequence_GeoBoundingBoxFilterObject(EObject context, GeoBoundingBoxFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoBoundingBoxFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoBoundingBoxFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoBoundingBoxFilterObject_BoundingBox()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoBoundingBoxFilterObject_BoundingBox()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeoBoundingBoxFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getGeoBoundingBoxFilterObjectAccess().getBoundingBoxBoundingBoxObjectParserRuleCall_3_0(), semanticObject.getBoundingBox());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING point=LatLon)
	 */
	protected void sequence_GeoDistanceFacetObject(EObject context, GeoDistanceFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (distance=STRING fieldName=STRING point=LatLon (params+=GeoDistanceFilterParameter params+=GeoDistanceFilterParameter*)?)
	 */
	protected void sequence_GeoDistanceFilterObject(EObject context, GeoDistanceFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=STRING to=STRING fieldName=STRING point=LatLon)
	 */
	protected void sequence_GeoDistanceRangeFilterObject(EObject context, GeoDistanceRangeFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_From()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_From()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_To()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_To()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_Point()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoDistanceRangeFilterObject_Point()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeoDistanceRangeFilterObjectAccess().getFromSTRINGTerminalRuleCall_3_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getGeoDistanceRangeFilterObjectAccess().getToSTRINGTerminalRuleCall_7_0(), semanticObject.getTo());
		feeder.accept(grammarAccess.getGeoDistanceRangeFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_9_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getGeoDistanceRangeFilterObjectAccess().getPointLatLonParserRuleCall_11_0(), semanticObject.getPoint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING polygon=Polygon)
	 */
	protected void sequence_GeoPolygonFilterObject(EObject context, GeoPolygonFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoPolygonFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoPolygonFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoPolygonFilterObject_Polygon()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoPolygonFilterObject_Polygon()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeoPolygonFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getGeoPolygonFilterObjectAccess().getPolygonPolygonParserRuleCall_6_0(), semanticObject.getPolygon());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING shape=GeoShapeObject)
	 */
	protected void sequence_GeoShapeFilterObject(EObject context, GeoShapeFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoShapeFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoShapeFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoShapeFilterObject_Shape()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoShapeFilterObject_Shape()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeoShapeFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getGeoShapeFilterObjectAccess().getShapeGeoShapeObjectParserRuleCall_3_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (shape=Shape | indexedShape=IndexedShape)
	 */
	protected void sequence_GeoShape(EObject context, GeoShape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING shape=ShapeObject)
	 */
	protected void sequence_GeoshapeQueryObject(EObject context, GeoshapeQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoshapeQueryObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoshapeQueryObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getGeoshapeQueryObject_Shape()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getGeoshapeQueryObject_Shape()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGeoshapeQueryObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getGeoshapeQueryObjectAccess().getShapeShapeObjectParserRuleCall_3_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (childType=STRING (query=Query | filter=Filter))
	 */
	protected void sequence_HasChildFilterObject(EObject context, HasChildFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (childType=STRING (query=Query | filter=Filter))
	 */
	protected void sequence_HasChildQueryObject(EObject context, HasChildQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parentType=STRING (query=Query | filter=Filter))
	 */
	protected void sequence_HasParentFilterObject(EObject context, HasParentFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parentType=STRING (query=Query | filter=Filter))
	 */
	protected void sequence_HasParentQueryObject(EObject context, HasParentQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=FieldParam | keyValue=KeyValueField | keyValueScript=KeyValueScript)
	 */
	protected void sequence_HistogramFacetObject(EObject context, HistogramFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (filter=Filter noMatchFilter=FilterObject?)
	 */
	protected void sequence_IndicesFilterObject(EObject context, IndicesFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=Query noMatchQuery=QueryObject?)
	 */
	protected void sequence_IndicesQueryObject(EObject context, IndicesQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyField=STRING valueField=STRING)
	 */
	protected void sequence_KeyValueField(EObject context, KeyValueField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getKeyValueField_KeyField()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getKeyValueField_KeyField()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getKeyValueField_ValueField()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getKeyValueField_ValueField()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeyValueFieldAccess().getKeyFieldSTRINGTerminalRuleCall_2_0(), semanticObject.getKeyField());
		feeder.accept(grammarAccess.getKeyValueFieldAccess().getValueFieldSTRINGTerminalRuleCall_6_0(), semanticObject.getValueField());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyScript=STRING valueScript=STRING)
	 */
	protected void sequence_KeyValueScript(EObject context, KeyValueScript semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getKeyValueScript_KeyScript()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getKeyValueScript_KeyScript()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getKeyValueScript_ValueScript()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getKeyValueScript_ValueScript()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeyValueScriptAccess().getKeyScriptSTRINGTerminalRuleCall_2_0(), semanticObject.getKeyScript());
		feeder.accept(grammarAccess.getKeyValueScriptAccess().getValueScriptSTRINGTerminalRuleCall_6_0(), semanticObject.getValueScript());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lon=FLOAT lat=FLOAT)
	 */
	protected void sequence_LatLonArray(EObject context, LatLonArray semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getLatLonArray_Lon()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getLatLonArray_Lon()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getLatLonArray_Lat()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getLatLonArray_Lat()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLatLonArrayAccess().getLonFLOATParserRuleCall_1_0(), semanticObject.getLon());
		feeder.accept(grammarAccess.getLatLonArrayAccess().getLatFLOATParserRuleCall_3_0(), semanticObject.getLat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     latLonOrHash=STRING
	 */
	protected void sequence_LatLonString(EObject context, LatLonString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getLatLonString_LatLonOrHash()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getLatLonString_LatLonOrHash()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLatLonStringAccess().getLatLonOrHashSTRINGTerminalRuleCall_0(), semanticObject.getLatLonOrHash());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (latLonObject=LatLonPropertyObject | latLonArray=LatLonArray | latLonString=LatLonString)
	 */
	protected void sequence_LatLon(EObject context, LatLon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     likeQuery=STRING
	 */
	protected void sequence_LikeTextParam(EObject context, LikeTextParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (likeQuery=STRING (params+=MoreLikeThisQueryParameter params+=MoreLikeThisQueryParameter*)?)
	 */
	protected void sequence_LikeTextParam_MoreLikeThisQueryObject(EObject context, LikeTextParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING parameters=MatchQueryParametersObject)
	 */
	protected void sequence_MatchQueryObject(EObject context, MatchQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getMatchQuery_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getMatchQuery_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getMatchQueryObject_Parameters()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getMatchQueryObject_Parameters()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatchQueryObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getMatchQueryObjectAccess().getParametersMatchQueryParametersObjectParserRuleCall_3_0(), semanticObject.getParameters());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (query=STRING (params+=MatchQueryParameter params+=MatchQueryParameter*)?)
	 */
	protected void sequence_MatchQueryParametersObject(EObject context, MatchQueryParametersObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=Value)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getMember_Key()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getMember_Key()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getMember_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getMember_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMemberAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getMemberAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING query=LikeTextParam (params+=MoreLikeThisFieldQueryParameter params+=MoreLikeThisFieldQueryParameter*)?)
	 */
	protected void sequence_MoreLikeThisFieldQueryObject(EObject context, MoreLikeThisFieldQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fields=FieldsParam (params+=MultiMatchQueryParameter params+=MultiMatchQueryParameter*)?)
	 */
	protected void sequence_MultiMatchQueryObject(EObject context, MultiMatchQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     multiTermQuery=FuzzyQuery
	 */
	protected void sequence_MultiTermQuery(EObject context, MultiTermQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=STRING filter=Filter)
	 */
	protected void sequence_NestedFilterObject(EObject context, NestedFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getNestedFilterObject_Path()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getNestedFilterObject_Path()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getNestedFilterObject_Filter()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getNestedFilterObject_Filter()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNestedFilterObjectAccess().getPathSTRINGTerminalRuleCall_3_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getNestedFilterObjectAccess().getFilterFilterParserRuleCall_5_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (members+=Member? members+=Member*)
	 */
	protected void sequence_Object(EObject context, com.first8.elasticsearch.dsl.search.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subQuery+=QueryObject subQuery+=QueryObject*)
	 */
	protected void sequence_OrFilterArray(EObject context, OrFilterArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (points+=LatLon points+=LatLon*)
	 */
	protected void sequence_Polygon(EObject context, Polygon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING prefix=STRING)
	 */
	protected void sequence_PrefixFilterObject(EObject context, PrefixFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getPrefixFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getPrefixFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getPrefixFilterObject_Prefix()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getPrefixFilterObject_Prefix()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getPrefixFilterObjectAccess().getPrefixSTRINGTerminalRuleCall_3_0(), semanticObject.getPrefix());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING prefix=PrefixQueryParameterObject)
	 */
	protected void sequence_PrefixQueryObject(EObject context, PrefixQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PrefixQueryParameterObject(EObject context, PrefixQueryParameterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getPrefixQueryParameterObject_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getPrefixQueryParameterObject_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixQueryParameterObjectAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     queryType=QueryType
	 */
	protected void sequence_QueryObject(EObject context, QueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getQueryObject_QueryType()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getQueryObject_QueryType()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQueryObjectAccess().getQueryTypeQueryTypeParserRuleCall_1_0(), semanticObject.getQueryType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (query=STRING (params+=QueryStringQueryParameter params+=QueryStringQueryParameter*)?)
	 */
	protected void sequence_QueryStringQueryObject(EObject context, QueryStringQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         match=MatchQuery | 
	 *         multiMatch=MultiMatchQuery | 
	 *         bool=BoolQuery | 
	 *         common=CommonQuery | 
	 *         constantScore=ConstantScoreQuery | 
	 *         disMax=DisMaxQuery | 
	 *         filtered=FilteredQuery | 
	 *         fuzzyLikeThis=FuzzyLikeThisQuery | 
	 *         fuzzyLikeThisField=FuzzyLikeThisFieldQuery | 
	 *         geoshape=GeoshapeQuery | 
	 *         hasChild=HasChildQuery | 
	 *         hasParent=HasParentQuery | 
	 *         ids=IdsQuery | 
	 *         indices=IndicesQuery | 
	 *         matchAll=MatchAllQuery | 
	 *         moreLikeThis=MoreLikeThisQuery | 
	 *         moreLikeThisField=MoreLikeThisFieldQuery | 
	 *         nested=NestedQuery | 
	 *         queryString=QueryStringQuery | 
	 *         simpleQuery=SimpleQueryStringQuery | 
	 *         spanFirst=SpanFirstQuery | 
	 *         spanMulti=SpanMultiQuery | 
	 *         spanNear=SpanNearQuery | 
	 *         spanNot=SpanNotQuery | 
	 *         spanOr=SpanOrQuery | 
	 *         spanTerm=SpanTermQuery | 
	 *         fuzzy=FuzzyQuery | 
	 *         prefix=PrefixQuery | 
	 *         term=TermQuery | 
	 *         range=RangeQuery | 
	 *         regexp=RegexpQuery | 
	 *         wildcard=WildcardQuery | 
	 *         terms=TermsQuery | 
	 *         topChildren=TopChildrenQuery
	 *     )
	 */
	protected void sequence_QueryType(EObject context, QueryType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     query=QueryObject
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=FieldParam | keyValue=KeyValueField | keyValueScript=KeyValueScript)
	 */
	protected void sequence_RangeFacetObject(EObject context, RangeFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING params=RangeQueryParametersObject)
	 */
	protected void sequence_RangeFilterObject(EObject context, RangeFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getRangeFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getRangeFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getRangeFilterObject_Params()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getRangeFilterObject_Params()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getRangeFilterObjectAccess().getParamsRangeQueryParametersObjectParserRuleCall_3_0(), semanticObject.getParams());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (params+=RangeQueryParameter params+=RangeQueryParameter*)
	 */
	protected void sequence_RangeFilterParametersObject(EObject context, RangeFilterParametersObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING params=RangeQueryParametersObject)
	 */
	protected void sequence_RangeQueryObject(EObject context, RangeQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=RangeQueryParameter params+=RangeQueryParameter*)
	 */
	protected void sequence_RangeQueryParametersObject(EObject context, RangeQueryParametersObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING (regexp=STRING | params=RegexpFilterParameterObject))
	 */
	protected void sequence_RegexpFilterObject(EObject context, RegexpFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (regexp=STRING (params+=RegexpFilterParameter params+=RegexpFilterParameter*)?)
	 */
	protected void sequence_RegexpFilterParameterObject(EObject context, RegexpFilterParameterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING (regexp=STRING | params=RegexpQueryParameterObject))
	 */
	protected void sequence_RegexpQueryObject(EObject context, RegexpQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (regex=STRING (params+=RegexpQueryParameter params+=RegexpQueryParameter*)?)
	 */
	protected void sequence_RegexpQueryParameterObject(EObject context, RegexpQueryParameterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sortMode='"min"' | sortMode='"max"' | sortMode='"avg"' | sortMode=''sum'')
	 */
	protected void sequence_SORT_MODE(EObject context, SORT_MODE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fieldName=STRING
	 */
	protected void sequence_ScriptFieldParam(EObject context, ScriptFieldParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getScriptFieldParam_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getScriptFieldParam_FieldName()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptFieldParamAccess().getFieldNameSTRINGTerminalRuleCall_2_0(), semanticObject.getFieldName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (script=STRING params=Object?)
	 */
	protected void sequence_ScriptFilterObject(EObject context, ScriptFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     script=STRING
	 */
	protected void sequence_ScriptParam(EObject context, ScriptParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getScriptParam_Script()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getScriptParam_Script()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScriptParamAccess().getScriptSTRINGTerminalRuleCall_2_0(), semanticObject.getScript());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fields=Fields? 
	 *         from=From? 
	 *         size=Size? 
	 *         sort=Sort? 
	 *         query=Query 
	 *         facets=Facets? 
	 *         stats=Stats?
	 *     )
	 */
	protected void sequence_SearchDSL(EObject context, SearchDSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fields=Fields | 
	 *         from=From | 
	 *         size=Size | 
	 *         sort=Sort | 
	 *         query=Query | 
	 *         facets=Facets | 
	 *         stats=Stats
	 *     )
	 */
	protected void sequence_SearchField(EObject context, SearchField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     shape=Shape
	 */
	protected void sequence_ShapeObject(EObject context, ShapeObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getShapeObject_Shape()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getShapeObject_Shape()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShapeObjectAccess().getShapeShapeParserRuleCall_1_0(), semanticObject.getShape());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (points+=LatLonArray points+=LatLonArray*)
	 */
	protected void sequence_ShapeTypeEnvelope(EObject context, ShapeTypeEnvelope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING query=STRING)
	 */
	protected void sequence_ShortMatchQueryObject(EObject context, ShortMatchQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getMatchQuery_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getMatchQuery_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getShortMatchQueryObject_Query()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getShortMatchQueryObject_Query()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShortMatchQueryObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getShortMatchQueryObjectAccess().getQuerySTRINGTerminalRuleCall_3_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sortFieldName=STRING ascDesc=ASC_DESC)
	 */
	protected void sequence_ShortSortOject(EObject context, ShortSortOject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getShortSortOject_SortFieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getShortSortOject_SortFieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getShortSortOject_AscDesc()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getShortSortOject_AscDesc()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShortSortOjectAccess().getSortFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getSortFieldName());
		feeder.accept(grammarAccess.getShortSortOjectAccess().getAscDescASC_DESCParserRuleCall_3_0(), semanticObject.getAscDesc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subFilter+=Filter subFilter+=Filter*)
	 */
	protected void sequence_SimpleAndFilterArray(EObject context, SimpleAndFilterArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=STRING query=STRING)
	 */
	protected void sequence_SimpleFuzzyQueryObject(EObject context, SimpleFuzzyQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getFuzzyQuery_Field()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getFuzzyQuery_Field()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getSimpleFuzzyQueryObject_Query()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getSimpleFuzzyQueryObject_Query()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleFuzzyQueryObjectAccess().getFieldSTRINGTerminalRuleCall_1_0(), semanticObject.getField());
		feeder.accept(grammarAccess.getSimpleFuzzyQueryObjectAccess().getQuerySTRINGTerminalRuleCall_3_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING prefix=STRING)
	 */
	protected void sequence_SimplePrefixQueryObject(EObject context, SimplePrefixQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=STRING (params+=SimpleQueryStringQueryParameter params+=SimpleQueryStringQueryParameter*)?)
	 */
	protected void sequence_SimpleQueryStringQueryObject(EObject context, SimpleQueryStringQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sort+=SortObjectProperty sort+=SortObjectProperty*)
	 */
	protected void sequence_SortObjectPropertiesObject(EObject context, SortObjectPropertiesObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (order=ASC_DESC | sortMode=SORT_MODE | missing=STRING)
	 */
	protected void sequence_SortObjectProperty(EObject context, SortObjectProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sortFieldName=STRING sortProperties=SortObjectPropertiesObject)
	 */
	protected void sequence_SortObject(EObject context, SortObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getSortObject_SortFieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getSortObject_SortFieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getSortObject_SortProperties()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getSortObject_SortProperties()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSortObjectAccess().getSortFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getSortFieldName());
		feeder.accept(grammarAccess.getSortObjectAccess().getSortPropertiesSortObjectPropertiesObjectParserRuleCall_3_0(), semanticObject.getSortProperties());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sortFieldName=STRING | sortShortObject=ShortSortOject | sortObject=SortObject | sortByScore='"_score"')
	 */
	protected void sequence_SortValue(EObject context, SortValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sortvalues+=SortValue sortvalues+=SortValue*)
	 */
	protected void sequence_Sort(EObject context, Sort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subquery=SpanQuery
	 */
	protected void sequence_SpanFirstQueryObject(EObject context, SpanFirstQueryObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getSpanFirstQueryObject_Subquery()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getSpanFirstQueryObject_Subquery()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpanFirstQueryObjectAccess().getSubquerySpanQueryParserRuleCall_4_0(), semanticObject.getSubquery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (clauses+=SpanQuery clauses+=SpanQuery* slop=SlopParam inOrder=InOrderParam collectPayloads=CollectPayloadsParam)
	 */
	protected void sequence_SpanNearQueryObject(EObject context, SpanNearQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (includeQuery=SpanQuery excludeQuery=SpanQuery)
	 */
	protected void sequence_SpanNotQueryObject(EObject context, SpanNotQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clauses+=SpanQuery clauses+=SpanQuery*)
	 */
	protected void sequence_SpanOrQueryObject(EObject context, SpanOrQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     spanQuery=SpanFirstQuery
	 */
	protected void sequence_SpanQuery(EObject context, SpanQuery semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getSpanQuery_SpanQuery()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getSpanQuery_SpanQuery()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpanQueryAccess().getSpanQuerySpanFirstQueryParserRuleCall_0_0(), semanticObject.getSpanQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING params=TermQueryObject)
	 */
	protected void sequence_SpanTermQueryObject(EObject context, SpanTermQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=FieldParam | script=ScriptParam | fields=FieldsParam)
	 */
	protected void sequence_StatisticalFacetObject(EObject context, StatisticalFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (groups+=STRING groups+=STRING*)
	 */
	protected void sequence_Stats(EObject context, Stats semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING term=STRING)
	 */
	protected void sequence_TermFilterObject(EObject context, TermFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTermFilterObject_FieldName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTermFilterObject_FieldName()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTermFilterObject_Term()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTermFilterObject_Term()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermFilterObjectAccess().getFieldNameSTRINGTerminalRuleCall_1_0(), semanticObject.getFieldName());
		feeder.accept(grammarAccess.getTermFilterObjectAccess().getTermSTRINGTerminalRuleCall_3_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING (term=SimpleTerm | params=TermQueryParametersObject))
	 */
	protected void sequence_TermQueryObject(EObject context, TermQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term=STRING boost=BoostParam)
	 */
	protected void sequence_TermQueryParametersObject(EObject context, TermQueryParametersObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTermQueryParametersObject_Term()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTermQueryParametersObject_Term()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTermQueryParametersObject_Boost()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTermQueryParametersObject_Boost()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermQueryParametersObjectAccess().getTermSTRINGTerminalRuleCall_3_0(), semanticObject.getTerm());
		feeder.accept(grammarAccess.getTermQueryParametersObjectAccess().getBoostBoostParamParserRuleCall_5_0(), semanticObject.getBoost());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (params+=TermsFacetParameter params+=TermsFacetParameter*)
	 */
	protected void sequence_TermsFacetObject(EObject context, TermsFacetObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         field=FieldParam | 
	 *         fields=FieldsParam | 
	 *         size=SizeParam | 
	 *         order=OrderParam | 
	 *         allTerms=AllTermsParam | 
	 *         exclude=ExcludeParam | 
	 *         regex=RegexParam | 
	 *         regexFlags=RegexFlagsParam | 
	 *         script=ScriptParam | 
	 *         scriptField=ScriptFieldParam
	 *     )
	 */
	protected void sequence_TermsFacetParameter(EObject context, TermsFacetParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING terms+=STRING terms+=STRING*)
	 */
	protected void sequence_TermsFilterObject(EObject context, TermsFilterObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=STRING terms+=STRING terms+=STRING*)
	 */
	protected void sequence_TermsQueryObject(EObject context, TermsQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (childType=STRING query=Query (params+=TopChildrenQueryParameter params+=TopChildrenQueryParameter*)?)
	 */
	protected void sequence_TopChildrenQueryObject(EObject context, TopChildrenQueryObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (topLeft=LatLon bottomRight=LatLon)
	 */
	protected void sequence_TwoPointBoundingBox(EObject context, TwoPointBoundingBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTwoPointBoundingBox_TopLeft()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTwoPointBoundingBox_TopLeft()));
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTwoPointBoundingBox_BottomRight()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTwoPointBoundingBox_BottomRight()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTwoPointBoundingBoxAccess().getTopLeftLatLonParserRuleCall_2_0(), semanticObject.getTopLeft());
		feeder.accept(grammarAccess.getTwoPointBoundingBoxAccess().getBottomRightLatLonParserRuleCall_6_0(), semanticObject.getBottomRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=STRING
	 */
	protected void sequence_TypeFilterObject(EObject context, TypeFilterObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SearchPackage.eINSTANCE.getTypeFilterObject_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SearchPackage.eINSTANCE.getTypeFilterObject_Type()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeFilterObjectAccess().getTypeSTRINGTerminalRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         object=Object | 
	 *         string=STRING | 
	 *         array=Array | 
	 *         bool=BOOLEAN | 
	 *         null=NULL | 
	 *         number=NUMBER
	 *     )
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
