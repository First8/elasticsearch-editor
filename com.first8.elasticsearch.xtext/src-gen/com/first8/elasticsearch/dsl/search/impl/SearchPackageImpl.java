/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.SearchFactory;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchPackageImpl extends EPackageImpl implements SearchPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "search.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchDSLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortSortOjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortObjectPropertiesObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sorT_MODEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asC_DESCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiTermQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetsObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetTypeObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsStatsFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statisticalFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statisticalFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateHistogramFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateHistogramFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass histogramFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass histogramFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyValueFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyValueScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsFacetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsFacetObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsFacetParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetFilterParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allTermsParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass excludeParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptFieldParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likeTextParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortMatchQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchQueryParametersObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiMatchQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiMatchQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonQueryParametersObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantScoreQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantScoreQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disMaxQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disMaxQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filteredQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filteredQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyLikeThisQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyLikeThisQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyLikeThisFieldQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyLikeThisFieldQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleFuzzyQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fuzzyQueryObjectParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoshapeQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoshapeQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasChildQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasChildQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasParentQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasParentQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicesQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicesQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moreLikeThisQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moreLikeThisQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moreLikeThisFieldQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moreLikeThisFieldQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simplePrefixQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixQueryParameterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryStringQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryStringQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleQueryStringQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleQueryStringQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeQueryParametersObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpQueryParameterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanFirstQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanFirstQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanMultiQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanMultiQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanNearQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanNearQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanNotQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanNotQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanOrQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanOrQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanTermQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spanTermQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termQueryParametersObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topChildrenQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topChildrenQueryObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleAndFilterArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolFilterClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoBoundingBoxFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoBoundingBoxFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceRangeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoDistanceRangeFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoPolygonFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoPolygonFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoShapeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoShapeFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geohashCellFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geohashCellFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasChildFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasChildFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasParentFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasParentFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicesFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indicesFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orFilterArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeFilterParametersObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regexpFilterParameterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termsFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFilterObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoShapeObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geoShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polygonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boundingBoxObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass twoPointBoundingBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latLonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latLonArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latLonStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeTypeEnvelopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.first8.elasticsearch.dsl.search.SearchPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SearchPackageImpl()
  {
    super(eNS_URI, SearchFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SearchPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static SearchPackage init()
  {
    if (isInited) return (SearchPackage)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI);

    // Obtain or create and register package
    SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SearchPackageImpl());

    isInited = true;

    // Load packages
    theSearchPackage.loadPackage();

    // Fix loaded packages
    theSearchPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theSearchPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SearchPackage.eNS_URI, theSearchPackage);
    return theSearchPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchDSL()
  {
    if (searchDSLEClass == null)
    {
      searchDSLEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(0);
    }
    return searchDSLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDSL_Fields()
  {
        return (EReference)getSearchDSL().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDSL_From()
  {
        return (EAttribute)getSearchDSL().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDSL_Size()
  {
        return (EAttribute)getSearchDSL().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDSL_Sort()
  {
        return (EReference)getSearchDSL().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDSL_Query()
  {
        return (EReference)getSearchDSL().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDSL_Facets()
  {
        return (EReference)getSearchDSL().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDSL_Stats()
  {
        return (EReference)getSearchDSL().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchField()
  {
    if (searchFieldEClass == null)
    {
      searchFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(1);
    }
    return searchFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchField_Fields()
  {
        return (EReference)getSearchField().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchField_From()
  {
        return (EAttribute)getSearchField().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchField_Size()
  {
        return (EAttribute)getSearchField().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchField_Sort()
  {
        return (EReference)getSearchField().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchField_Query()
  {
        return (EReference)getSearchField().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchField_Facets()
  {
        return (EReference)getSearchField().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchField_Stats()
  {
        return (EReference)getSearchField().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStats()
  {
    if (statsEClass == null)
    {
      statsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(2);
    }
    return statsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStats_Groups()
  {
        return (EAttribute)getStats().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSort()
  {
    if (sortEClass == null)
    {
      sortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(3);
    }
    return sortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSort_Sortvalues()
  {
        return (EReference)getSort().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortValue()
  {
    if (sortValueEClass == null)
    {
      sortValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(4);
    }
    return sortValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSortValue_SortFieldName()
  {
        return (EAttribute)getSortValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortValue_SortShortObject()
  {
        return (EReference)getSortValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortValue_SortObject()
  {
        return (EReference)getSortValue().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSortValue_SortByScore()
  {
        return (EAttribute)getSortValue().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortSortOject()
  {
    if (shortSortOjectEClass == null)
    {
      shortSortOjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(5);
    }
    return shortSortOjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShortSortOject_SortFieldName()
  {
        return (EAttribute)getShortSortOject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShortSortOject_AscDesc()
  {
        return (EReference)getShortSortOject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortObject()
  {
    if (sortObjectEClass == null)
    {
      sortObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(6);
    }
    return sortObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSortObject_SortFieldName()
  {
        return (EAttribute)getSortObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortObject_SortProperties()
  {
        return (EReference)getSortObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortObjectPropertiesObject()
  {
    if (sortObjectPropertiesObjectEClass == null)
    {
      sortObjectPropertiesObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(7);
    }
    return sortObjectPropertiesObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortObjectPropertiesObject_Sort()
  {
        return (EReference)getSortObjectPropertiesObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortObjectProperty()
  {
    if (sortObjectPropertyEClass == null)
    {
      sortObjectPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(8);
    }
    return sortObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortObjectProperty_Order()
  {
        return (EReference)getSortObjectProperty().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSortObjectProperty_SortMode()
  {
        return (EReference)getSortObjectProperty().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSortObjectProperty_Missing()
  {
        return (EAttribute)getSortObjectProperty().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSORT_MODE()
  {
    if (sorT_MODEEClass == null)
    {
      sorT_MODEEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(9);
    }
    return sorT_MODEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSORT_MODE_SortMode()
  {
        return (EAttribute)getSORT_MODE().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASC_DESC()
  {
    if (asC_DESCEClass == null)
    {
      asC_DESCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(10);
    }
    return asC_DESCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getASC_DESC_AscDesc()
  {
        return (EAttribute)getASC_DESC().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFields()
  {
    if (fieldsEClass == null)
    {
      fieldsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(11);
    }
    return fieldsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFields_Selectfields()
  {
        return (EReference)getFields().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    if (queryEClass == null)
    {
      queryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(12);
    }
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Query()
  {
        return (EReference)getQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilter()
  {
    if (filterEClass == null)
    {
      filterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(13);
    }
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilter_Filter()
  {
        return (EReference)getFilter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterObject()
  {
    if (filterObjectEClass == null)
    {
      filterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(14);
    }
    return filterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterType()
  {
    if (filterTypeEClass == null)
    {
      filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(15);
    }
    return filterTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_And()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Bool()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterType_Exists()
  {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoBoundingBox()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoDistance()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoDistanceRange()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoPolygon()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoShape()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_GeoHashCell()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_HasChild()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_HasParent()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterType_Ids()
  {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Indices()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterType_Limit()
  {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterType_MatchAll()
  {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterType_Missing()
  {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Nested()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Not()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Or()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Prefix()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Query()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Regexp()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Script()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Term()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Terms()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterType_Type()
  {
        return (EReference)getFilterType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryObject()
  {
    if (queryObjectEClass == null)
    {
      queryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(16);
    }
    return queryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryObject_QueryType()
  {
        return (EReference)getQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryType()
  {
    if (queryTypeEClass == null)
    {
      queryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(17);
    }
    return queryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Match()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_MultiMatch()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Bool()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Common()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_ConstantScore()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_DisMax()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Filtered()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_FuzzyLikeThis()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_FuzzyLikeThisField()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Geoshape()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_HasChild()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_HasParent()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryType_Ids()
  {
        return (EAttribute)getQueryType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Indices()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryType_MatchAll()
  {
        return (EAttribute)getQueryType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_MoreLikeThis()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_MoreLikeThisField()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Nested()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_QueryString()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SimpleQuery()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanFirst()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanMulti()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanNear()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanNot()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanOr()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_SpanTerm()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Fuzzy()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Prefix()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Term()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Range()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Regexp()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Wildcard()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_Terms()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQueryType_TopChildren()
  {
        return (EReference)getQueryType().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanQuery()
  {
    if (spanQueryEClass == null)
    {
      spanQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(18);
    }
    return spanQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanQuery_SpanQuery()
  {
        return (EReference)getSpanQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiTermQuery()
  {
    if (multiTermQueryEClass == null)
    {
      multiTermQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(19);
    }
    return multiTermQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiTermQuery_MultiTermQuery()
  {
        return (EReference)getMultiTermQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacets()
  {
    if (facetsEClass == null)
    {
      facetsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(20);
    }
    return facetsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetsObject()
  {
    if (facetsObjectEClass == null)
    {
      facetsObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(21);
    }
    return facetsObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacetsObject_FacetName()
  {
        return (EAttribute)getFacetsObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetsObject_Config()
  {
        return (EReference)getFacetsObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetsObject_Params()
  {
        return (EReference)getFacetsObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetTypeObject()
  {
    if (facetTypeObjectEClass == null)
    {
      facetTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(22);
    }
    return facetTypeObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetTypeObject_FacetType()
  {
        return (EReference)getFacetTypeObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetType()
  {
    if (facetTypeEClass == null)
    {
      facetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(23);
    }
    return facetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetType_FacetType()
  {
        return (EReference)getFacetType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceFacet()
  {
    if (geoDistanceFacetEClass == null)
    {
      geoDistanceFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(24);
    }
    return geoDistanceFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceFacetObject()
  {
    if (geoDistanceFacetObjectEClass == null)
    {
      geoDistanceFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(25);
    }
    return geoDistanceFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceFacetObject_FieldName()
  {
        return (EAttribute)getGeoDistanceFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoDistanceFacetObject_Point()
  {
        return (EReference)getGeoDistanceFacetObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsStatsFacet()
  {
    if (termsStatsFacetEClass == null)
    {
      termsStatsFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(26);
    }
    return termsStatsFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatisticalFacet()
  {
    if (statisticalFacetEClass == null)
    {
      statisticalFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(27);
    }
    return statisticalFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatisticalFacetObject()
  {
    if (statisticalFacetObjectEClass == null)
    {
      statisticalFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(28);
    }
    return statisticalFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatisticalFacetObject_Field()
  {
        return (EAttribute)getStatisticalFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatisticalFacetObject_Script()
  {
        return (EReference)getStatisticalFacetObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatisticalFacetObject_Fields()
  {
        return (EAttribute)getStatisticalFacetObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryFacet()
  {
    if (queryFacetEClass == null)
    {
      queryFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(29);
    }
    return queryFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterFacet()
  {
    if (filterFacetEClass == null)
    {
      filterFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(30);
    }
    return filterFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateHistogramFacet()
  {
    if (dateHistogramFacetEClass == null)
    {
      dateHistogramFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(31);
    }
    return dateHistogramFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateHistogramFacetObject()
  {
    if (dateHistogramFacetObjectEClass == null)
    {
      dateHistogramFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(32);
    }
    return dateHistogramFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateHistogramFacetObject_Field()
  {
        return (EAttribute)getDateHistogramFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDateHistogramFacetObject_KeyValue()
  {
        return (EReference)getDateHistogramFacetObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDateHistogramFacetObject_KeyValueScript()
  {
        return (EReference)getDateHistogramFacetObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHistogramFacet()
  {
    if (histogramFacetEClass == null)
    {
      histogramFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(33);
    }
    return histogramFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHistogramFacetObject()
  {
    if (histogramFacetObjectEClass == null)
    {
      histogramFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(34);
    }
    return histogramFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHistogramFacetObject_Field()
  {
        return (EAttribute)getHistogramFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHistogramFacetObject_KeyValue()
  {
        return (EReference)getHistogramFacetObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHistogramFacetObject_KeyValueScript()
  {
        return (EReference)getHistogramFacetObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFacet()
  {
    if (rangeFacetEClass == null)
    {
      rangeFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(35);
    }
    return rangeFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFacetObject()
  {
    if (rangeFacetObjectEClass == null)
    {
      rangeFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(36);
    }
    return rangeFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeFacetObject_Field()
  {
        return (EAttribute)getRangeFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeFacetObject_KeyValue()
  {
        return (EReference)getRangeFacetObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeFacetObject_KeyValueScript()
  {
        return (EReference)getRangeFacetObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyValueField()
  {
    if (keyValueFieldEClass == null)
    {
      keyValueFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(37);
    }
    return keyValueFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValueField_KeyField()
  {
        return (EAttribute)getKeyValueField().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValueField_ValueField()
  {
        return (EAttribute)getKeyValueField().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyValueScript()
  {
    if (keyValueScriptEClass == null)
    {
      keyValueScriptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(38);
    }
    return keyValueScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValueScript_KeyScript()
  {
        return (EAttribute)getKeyValueScript().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValueScript_ValueScript()
  {
        return (EAttribute)getKeyValueScript().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsFacet()
  {
    if (termsFacetEClass == null)
    {
      termsFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(39);
    }
    return termsFacetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsFacetObject()
  {
    if (termsFacetObjectEClass == null)
    {
      termsFacetObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(40);
    }
    return termsFacetObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermsFacetObject_Params()
  {
        return (EReference)getTermsFacetObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsFacetParameter()
  {
    if (termsFacetParameterEClass == null)
    {
      termsFacetParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(41);
    }
    return termsFacetParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_Field()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_Fields()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_Size()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_Order()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermsFacetParameter_AllTerms()
  {
        return (EReference)getTermsFacetParameter().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermsFacetParameter_Exclude()
  {
        return (EReference)getTermsFacetParameter().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_Regex()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFacetParameter_RegexFlags()
  {
        return (EAttribute)getTermsFacetParameter().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermsFacetParameter_Script()
  {
        return (EReference)getTermsFacetParameter().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermsFacetParameter_ScriptField()
  {
        return (EReference)getTermsFacetParameter().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetParameter()
  {
    if (facetParameterEClass == null)
    {
      facetParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(42);
    }
    return facetParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacetParameter_Global()
  {
        return (EAttribute)getFacetParameter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetParameter_FaceFilter()
  {
        return (EReference)getFacetParameter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacetParameter_Nested()
  {
        return (EAttribute)getFacetParameter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetFilterParam()
  {
    if (facetFilterParamEClass == null)
    {
      facetFilterParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(43);
    }
    return facetFilterParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllTermsParam()
  {
    if (allTermsParamEClass == null)
    {
      allTermsParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(44);
    }
    return allTermsParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllTermsParam_AllTerms()
  {
        return (EAttribute)getAllTermsParam().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExcludeParam()
  {
    if (excludeParamEClass == null)
    {
      excludeParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(45);
    }
    return excludeParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExcludeParam_ExcludeFieldNames()
  {
        return (EAttribute)getExcludeParam().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptParam()
  {
    if (scriptParamEClass == null)
    {
      scriptParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(46);
    }
    return scriptParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptParam_Script()
  {
        return (EAttribute)getScriptParam().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptFieldParam()
  {
    if (scriptFieldParamEClass == null)
    {
      scriptFieldParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(47);
    }
    return scriptFieldParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptFieldParam_FieldName()
  {
        return (EAttribute)getScriptFieldParam().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLikeTextParam()
  {
    if (likeTextParamEClass == null)
    {
      likeTextParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(48);
    }
    return likeTextParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikeTextParam_LikeQuery()
  {
        return (EAttribute)getLikeTextParam().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikeTextParam_Params()
  {
        return (EAttribute)getLikeTextParam().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchQuery()
  {
    if (matchQueryEClass == null)
    {
      matchQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(49);
    }
    return matchQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchQuery_FieldName()
  {
        return (EAttribute)getMatchQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortMatchQueryObject()
  {
    if (shortMatchQueryObjectEClass == null)
    {
      shortMatchQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(50);
    }
    return shortMatchQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShortMatchQueryObject_Query()
  {
        return (EAttribute)getShortMatchQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchQueryObject()
  {
    if (matchQueryObjectEClass == null)
    {
      matchQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(51);
    }
    return matchQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchQueryObject_Parameters()
  {
        return (EReference)getMatchQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchQueryParametersObject()
  {
    if (matchQueryParametersObjectEClass == null)
    {
      matchQueryParametersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(52);
    }
    return matchQueryParametersObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchQueryParametersObject_Query()
  {
        return (EAttribute)getMatchQueryParametersObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatchQueryParametersObject_Params()
  {
        return (EAttribute)getMatchQueryParametersObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiMatchQuery()
  {
    if (multiMatchQueryEClass == null)
    {
      multiMatchQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(53);
    }
    return multiMatchQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiMatchQueryObject()
  {
    if (multiMatchQueryObjectEClass == null)
    {
      multiMatchQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(54);
    }
    return multiMatchQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiMatchQueryObject_Fields()
  {
        return (EAttribute)getMultiMatchQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiMatchQueryObject_Params()
  {
        return (EAttribute)getMultiMatchQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolQuery()
  {
    if (boolQueryEClass == null)
    {
      boolQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(55);
    }
    return boolQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolQueryObject()
  {
    if (boolQueryObjectEClass == null)
    {
      boolQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(56);
    }
    return boolQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolQueryObject_Clause()
  {
        return (EReference)getBoolQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolQueryObject_Params()
  {
        return (EAttribute)getBoolQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolClause()
  {
    if (boolClauseEClass == null)
    {
      boolClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(57);
    }
    return boolClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolClause_Query()
  {
        return (EReference)getBoolClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonQuery()
  {
    if (commonQueryEClass == null)
    {
      commonQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(58);
    }
    return commonQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonQueryObject()
  {
    if (commonQueryObjectEClass == null)
    {
      commonQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(59);
    }
    return commonQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommonQueryObject_FieldName()
  {
        return (EAttribute)getCommonQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommonQueryObject_Parameters()
  {
        return (EReference)getCommonQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonQueryParametersObject()
  {
    if (commonQueryParametersObjectEClass == null)
    {
      commonQueryParametersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(60);
    }
    return commonQueryParametersObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommonQueryParametersObject_Query()
  {
        return (EAttribute)getCommonQueryParametersObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommonQueryParametersObject_Params()
  {
        return (EAttribute)getCommonQueryParametersObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantScoreQuery()
  {
    if (constantScoreQueryEClass == null)
    {
      constantScoreQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(61);
    }
    return constantScoreQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantScoreQueryObject()
  {
    if (constantScoreQueryObjectEClass == null)
    {
      constantScoreQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(62);
    }
    return constantScoreQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisMaxQuery()
  {
    if (disMaxQueryEClass == null)
    {
      disMaxQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(63);
    }
    return disMaxQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisMaxQueryObject()
  {
    if (disMaxQueryObjectEClass == null)
    {
      disMaxQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(64);
    }
    return disMaxQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisMaxQueryObject_Query()
  {
        return (EReference)getDisMaxQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilteredQuery()
  {
    if (filteredQueryEClass == null)
    {
      filteredQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(65);
    }
    return filteredQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilteredQueryObject()
  {
    if (filteredQueryObjectEClass == null)
    {
      filteredQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(66);
    }
    return filteredQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredQueryObject_Query()
  {
        return (EReference)getFilteredQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredQueryObject_Filter()
  {
        return (EReference)getFilteredQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyLikeThisQuery()
  {
    if (fuzzyLikeThisQueryEClass == null)
    {
      fuzzyLikeThisQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(67);
    }
    return fuzzyLikeThisQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyLikeThisQueryObject()
  {
    if (fuzzyLikeThisQueryObjectEClass == null)
    {
      fuzzyLikeThisQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(68);
    }
    return fuzzyLikeThisQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyLikeThisFieldQuery()
  {
    if (fuzzyLikeThisFieldQueryEClass == null)
    {
      fuzzyLikeThisFieldQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(69);
    }
    return fuzzyLikeThisFieldQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyLikeThisFieldQueryObject()
  {
    if (fuzzyLikeThisFieldQueryObjectEClass == null)
    {
      fuzzyLikeThisFieldQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(70);
    }
    return fuzzyLikeThisFieldQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuzzyLikeThisFieldQueryObject_FieldName()
  {
        return (EAttribute)getFuzzyLikeThisFieldQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuzzyLikeThisFieldQueryObject_Params()
  {
        return (EAttribute)getFuzzyLikeThisFieldQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyQuery()
  {
    if (fuzzyQueryEClass == null)
    {
      fuzzyQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(71);
    }
    return fuzzyQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuzzyQuery_Field()
  {
        return (EAttribute)getFuzzyQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleFuzzyQueryObject()
  {
    if (simpleFuzzyQueryObjectEClass == null)
    {
      simpleFuzzyQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(72);
    }
    return simpleFuzzyQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleFuzzyQueryObject_Query()
  {
        return (EAttribute)getSimpleFuzzyQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyQueryObject()
  {
    if (fuzzyQueryObjectEClass == null)
    {
      fuzzyQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(73);
    }
    return fuzzyQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFuzzyQueryObject_Q()
  {
        return (EReference)getFuzzyQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuzzyQueryObjectParameters()
  {
    if (fuzzyQueryObjectParametersEClass == null)
    {
      fuzzyQueryObjectParametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(74);
    }
    return fuzzyQueryObjectParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuzzyQueryObjectParameters_Value()
  {
        return (EAttribute)getFuzzyQueryObjectParameters().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuzzyQueryObjectParameters_Params()
  {
        return (EAttribute)getFuzzyQueryObjectParameters().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoshapeQuery()
  {
    if (geoshapeQueryEClass == null)
    {
      geoshapeQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(75);
    }
    return geoshapeQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoshapeQueryObject()
  {
    if (geoshapeQueryObjectEClass == null)
    {
      geoshapeQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(76);
    }
    return geoshapeQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoshapeQueryObject_FieldName()
  {
        return (EAttribute)getGeoshapeQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoshapeQueryObject_Shape()
  {
        return (EReference)getGeoshapeQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasChildQuery()
  {
    if (hasChildQueryEClass == null)
    {
      hasChildQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(77);
    }
    return hasChildQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasChildQueryObject()
  {
    if (hasChildQueryObjectEClass == null)
    {
      hasChildQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(78);
    }
    return hasChildQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasChildQueryObject_ChildType()
  {
        return (EAttribute)getHasChildQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasChildQueryObject_Query()
  {
        return (EReference)getHasChildQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasChildQueryObject_Filter()
  {
        return (EReference)getHasChildQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasParentQuery()
  {
    if (hasParentQueryEClass == null)
    {
      hasParentQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(79);
    }
    return hasParentQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasParentQueryObject()
  {
    if (hasParentQueryObjectEClass == null)
    {
      hasParentQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(80);
    }
    return hasParentQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasParentQueryObject_ParentType()
  {
        return (EAttribute)getHasParentQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasParentQueryObject_Query()
  {
        return (EReference)getHasParentQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasParentQueryObject_Filter()
  {
        return (EReference)getHasParentQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicesQuery()
  {
    if (indicesQueryEClass == null)
    {
      indicesQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(81);
    }
    return indicesQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicesQueryObject()
  {
    if (indicesQueryObjectEClass == null)
    {
      indicesQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(82);
    }
    return indicesQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicesQueryObject_Query()
  {
        return (EReference)getIndicesQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicesQueryObject_NoMatchQuery()
  {
        return (EReference)getIndicesQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoreLikeThisQuery()
  {
    if (moreLikeThisQueryEClass == null)
    {
      moreLikeThisQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(83);
    }
    return moreLikeThisQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoreLikeThisQueryObject()
  {
    if (moreLikeThisQueryObjectEClass == null)
    {
      moreLikeThisQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(84);
    }
    return moreLikeThisQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoreLikeThisFieldQuery()
  {
    if (moreLikeThisFieldQueryEClass == null)
    {
      moreLikeThisFieldQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(85);
    }
    return moreLikeThisFieldQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoreLikeThisFieldQueryObject()
  {
    if (moreLikeThisFieldQueryObjectEClass == null)
    {
      moreLikeThisFieldQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(86);
    }
    return moreLikeThisFieldQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoreLikeThisFieldQueryObject_FieldName()
  {
        return (EAttribute)getMoreLikeThisFieldQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoreLikeThisFieldQueryObject_Query()
  {
        return (EReference)getMoreLikeThisFieldQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoreLikeThisFieldQueryObject_Params()
  {
        return (EAttribute)getMoreLikeThisFieldQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedQuery()
  {
    if (nestedQueryEClass == null)
    {
      nestedQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(87);
    }
    return nestedQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedQueryObject()
  {
    if (nestedQueryObjectEClass == null)
    {
      nestedQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(88);
    }
    return nestedQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixQuery()
  {
    if (prefixQueryEClass == null)
    {
      prefixQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(89);
    }
    return prefixQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixQuery_FieldName()
  {
        return (EAttribute)getPrefixQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimplePrefixQueryObject()
  {
    if (simplePrefixQueryObjectEClass == null)
    {
      simplePrefixQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(90);
    }
    return simplePrefixQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimplePrefixQueryObject_Prefix()
  {
        return (EAttribute)getSimplePrefixQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixQueryObject()
  {
    if (prefixQueryObjectEClass == null)
    {
      prefixQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(91);
    }
    return prefixQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefixQueryObject_Prefix()
  {
        return (EReference)getPrefixQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixQueryParameterObject()
  {
    if (prefixQueryParameterObjectEClass == null)
    {
      prefixQueryParameterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(92);
    }
    return prefixQueryParameterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixQueryParameterObject_Value()
  {
        return (EAttribute)getPrefixQueryParameterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryStringQuery()
  {
    if (queryStringQueryEClass == null)
    {
      queryStringQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(93);
    }
    return queryStringQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryStringQueryObject()
  {
    if (queryStringQueryObjectEClass == null)
    {
      queryStringQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(94);
    }
    return queryStringQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryStringQueryObject_Query()
  {
        return (EAttribute)getQueryStringQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryStringQueryObject_Params()
  {
        return (EAttribute)getQueryStringQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleQueryStringQuery()
  {
    if (simpleQueryStringQueryEClass == null)
    {
      simpleQueryStringQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(95);
    }
    return simpleQueryStringQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleQueryStringQueryObject()
  {
    if (simpleQueryStringQueryObjectEClass == null)
    {
      simpleQueryStringQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(96);
    }
    return simpleQueryStringQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleQueryStringQueryObject_Query()
  {
        return (EAttribute)getSimpleQueryStringQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleQueryStringQueryObject_Params()
  {
        return (EAttribute)getSimpleQueryStringQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeQuery()
  {
    if (rangeQueryEClass == null)
    {
      rangeQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(97);
    }
    return rangeQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeQueryObject()
  {
    if (rangeQueryObjectEClass == null)
    {
      rangeQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(98);
    }
    return rangeQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeQueryObject_FieldName()
  {
        return (EAttribute)getRangeQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeQueryObject_Params()
  {
        return (EReference)getRangeQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeQueryParametersObject()
  {
    if (rangeQueryParametersObjectEClass == null)
    {
      rangeQueryParametersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(99);
    }
    return rangeQueryParametersObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeQueryParametersObject_Params()
  {
        return (EAttribute)getRangeQueryParametersObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpQuery()
  {
    if (regexpQueryEClass == null)
    {
      regexpQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(100);
    }
    return regexpQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpQueryObject()
  {
    if (regexpQueryObjectEClass == null)
    {
      regexpQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(101);
    }
    return regexpQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpQueryObject_FieldName()
  {
        return (EAttribute)getRegexpQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpQueryObject_Regexp()
  {
        return (EAttribute)getRegexpQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegexpQueryObject_Params()
  {
        return (EReference)getRegexpQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpQueryParameterObject()
  {
    if (regexpQueryParameterObjectEClass == null)
    {
      regexpQueryParameterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(102);
    }
    return regexpQueryParameterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpQueryParameterObject_Regex()
  {
        return (EAttribute)getRegexpQueryParameterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpQueryParameterObject_Params()
  {
        return (EAttribute)getRegexpQueryParameterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanFirstQuery()
  {
    if (spanFirstQueryEClass == null)
    {
      spanFirstQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(103);
    }
    return spanFirstQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanFirstQueryObject()
  {
    if (spanFirstQueryObjectEClass == null)
    {
      spanFirstQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(104);
    }
    return spanFirstQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanFirstQueryObject_Subquery()
  {
        return (EReference)getSpanFirstQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanMultiQuery()
  {
    if (spanMultiQueryEClass == null)
    {
      spanMultiQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(105);
    }
    return spanMultiQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanMultiQueryObject()
  {
    if (spanMultiQueryObjectEClass == null)
    {
      spanMultiQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(106);
    }
    return spanMultiQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanNearQuery()
  {
    if (spanNearQueryEClass == null)
    {
      spanNearQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(107);
    }
    return spanNearQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanNearQueryObject()
  {
    if (spanNearQueryObjectEClass == null)
    {
      spanNearQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(108);
    }
    return spanNearQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanNearQueryObject_Clauses()
  {
        return (EReference)getSpanNearQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpanNearQueryObject_Slop()
  {
        return (EAttribute)getSpanNearQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpanNearQueryObject_InOrder()
  {
        return (EAttribute)getSpanNearQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpanNearQueryObject_CollectPayloads()
  {
        return (EAttribute)getSpanNearQueryObject().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanNotQuery()
  {
    if (spanNotQueryEClass == null)
    {
      spanNotQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(109);
    }
    return spanNotQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanNotQueryObject()
  {
    if (spanNotQueryObjectEClass == null)
    {
      spanNotQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(110);
    }
    return spanNotQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanNotQueryObject_IncludeQuery()
  {
        return (EReference)getSpanNotQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanNotQueryObject_ExcludeQuery()
  {
        return (EReference)getSpanNotQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanOrQuery()
  {
    if (spanOrQueryEClass == null)
    {
      spanOrQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(111);
    }
    return spanOrQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanOrQueryObject()
  {
    if (spanOrQueryObjectEClass == null)
    {
      spanOrQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(112);
    }
    return spanOrQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanOrQueryObject_Clauses()
  {
        return (EReference)getSpanOrQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanTermQuery()
  {
    if (spanTermQueryEClass == null)
    {
      spanTermQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(113);
    }
    return spanTermQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpanTermQueryObject()
  {
    if (spanTermQueryObjectEClass == null)
    {
      spanTermQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(114);
    }
    return spanTermQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpanTermQueryObject_FieldName()
  {
        return (EAttribute)getSpanTermQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpanTermQueryObject_Params()
  {
        return (EReference)getSpanTermQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermQuery()
  {
    if (termQueryEClass == null)
    {
      termQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(115);
    }
    return termQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermQueryObject()
  {
    if (termQueryObjectEClass == null)
    {
      termQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(116);
    }
    return termQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermQueryObject_FieldName()
  {
        return (EAttribute)getTermQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermQueryObject_Term()
  {
        return (EAttribute)getTermQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTermQueryObject_Params()
  {
        return (EReference)getTermQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermQueryParametersObject()
  {
    if (termQueryParametersObjectEClass == null)
    {
      termQueryParametersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(117);
    }
    return termQueryParametersObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermQueryParametersObject_Term()
  {
        return (EAttribute)getTermQueryParametersObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermQueryParametersObject_Boost()
  {
        return (EAttribute)getTermQueryParametersObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsQuery()
  {
    if (termsQueryEClass == null)
    {
      termsQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(118);
    }
    return termsQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsQueryObject()
  {
    if (termsQueryObjectEClass == null)
    {
      termsQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(119);
    }
    return termsQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsQueryObject_FieldName()
  {
        return (EAttribute)getTermsQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsQueryObject_Terms()
  {
        return (EAttribute)getTermsQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopChildrenQuery()
  {
    if (topChildrenQueryEClass == null)
    {
      topChildrenQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(120);
    }
    return topChildrenQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopChildrenQueryObject()
  {
    if (topChildrenQueryObjectEClass == null)
    {
      topChildrenQueryObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(121);
    }
    return topChildrenQueryObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopChildrenQueryObject_ChildType()
  {
        return (EAttribute)getTopChildrenQueryObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopChildrenQueryObject_Query()
  {
        return (EReference)getTopChildrenQueryObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopChildrenQueryObject_Params()
  {
        return (EAttribute)getTopChildrenQueryObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardQuery()
  {
    if (wildcardQueryEClass == null)
    {
      wildcardQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(122);
    }
    return wildcardQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndFilter()
  {
    if (andFilterEClass == null)
    {
      andFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(123);
    }
    return andFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleAndFilterArray()
  {
    if (simpleAndFilterArrayEClass == null)
    {
      simpleAndFilterArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(124);
    }
    return simpleAndFilterArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleAndFilterArray_SubFilter()
  {
        return (EReference)getSimpleAndFilterArray().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndFilterObject()
  {
    if (andFilterObjectEClass == null)
    {
      andFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(125);
    }
    return andFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolFilter()
  {
    if (boolFilterEClass == null)
    {
      boolFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(126);
    }
    return boolFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolFilterObject()
  {
    if (boolFilterObjectEClass == null)
    {
      boolFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(127);
    }
    return boolFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolFilterObject_Clause()
  {
        return (EReference)getBoolFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolFilterClause()
  {
    if (boolFilterClauseEClass == null)
    {
      boolFilterClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(128);
    }
    return boolFilterClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoolFilterClause_Filter()
  {
        return (EReference)getBoolFilterClause().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoBoundingBoxFilter()
  {
    if (geoBoundingBoxFilterEClass == null)
    {
      geoBoundingBoxFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(129);
    }
    return geoBoundingBoxFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoBoundingBoxFilterObject()
  {
    if (geoBoundingBoxFilterObjectEClass == null)
    {
      geoBoundingBoxFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(130);
    }
    return geoBoundingBoxFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoBoundingBoxFilterObject_FieldName()
  {
        return (EAttribute)getGeoBoundingBoxFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoBoundingBoxFilterObject_BoundingBox()
  {
        return (EReference)getGeoBoundingBoxFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceFilter()
  {
    if (geoDistanceFilterEClass == null)
    {
      geoDistanceFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(131);
    }
    return geoDistanceFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceFilterObject()
  {
    if (geoDistanceFilterObjectEClass == null)
    {
      geoDistanceFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(132);
    }
    return geoDistanceFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceFilterObject_Distance()
  {
        return (EAttribute)getGeoDistanceFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceFilterObject_FieldName()
  {
        return (EAttribute)getGeoDistanceFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoDistanceFilterObject_Point()
  {
        return (EReference)getGeoDistanceFilterObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceFilterObject_Params()
  {
        return (EAttribute)getGeoDistanceFilterObject().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceRangeFilter()
  {
    if (geoDistanceRangeFilterEClass == null)
    {
      geoDistanceRangeFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(133);
    }
    return geoDistanceRangeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoDistanceRangeFilterObject()
  {
    if (geoDistanceRangeFilterObjectEClass == null)
    {
      geoDistanceRangeFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(134);
    }
    return geoDistanceRangeFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceRangeFilterObject_From()
  {
        return (EAttribute)getGeoDistanceRangeFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceRangeFilterObject_To()
  {
        return (EAttribute)getGeoDistanceRangeFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoDistanceRangeFilterObject_FieldName()
  {
        return (EAttribute)getGeoDistanceRangeFilterObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoDistanceRangeFilterObject_Point()
  {
        return (EReference)getGeoDistanceRangeFilterObject().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoPolygonFilter()
  {
    if (geoPolygonFilterEClass == null)
    {
      geoPolygonFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(135);
    }
    return geoPolygonFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoPolygonFilterObject()
  {
    if (geoPolygonFilterObjectEClass == null)
    {
      geoPolygonFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(136);
    }
    return geoPolygonFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoPolygonFilterObject_FieldName()
  {
        return (EAttribute)getGeoPolygonFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoPolygonFilterObject_Polygon()
  {
        return (EReference)getGeoPolygonFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoShapeFilter()
  {
    if (geoShapeFilterEClass == null)
    {
      geoShapeFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(137);
    }
    return geoShapeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoShapeFilterObject()
  {
    if (geoShapeFilterObjectEClass == null)
    {
      geoShapeFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(138);
    }
    return geoShapeFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoShapeFilterObject_FieldName()
  {
        return (EAttribute)getGeoShapeFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoShapeFilterObject_Shape()
  {
        return (EReference)getGeoShapeFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeohashCellFilter()
  {
    if (geohashCellFilterEClass == null)
    {
      geohashCellFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(139);
    }
    return geohashCellFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeohashCellFilterObject()
  {
    if (geohashCellFilterObjectEClass == null)
    {
      geohashCellFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(140);
    }
    return geohashCellFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasChildFilter()
  {
    if (hasChildFilterEClass == null)
    {
      hasChildFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(141);
    }
    return hasChildFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasChildFilterObject()
  {
    if (hasChildFilterObjectEClass == null)
    {
      hasChildFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(142);
    }
    return hasChildFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasChildFilterObject_ChildType()
  {
        return (EAttribute)getHasChildFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasChildFilterObject_Query()
  {
        return (EReference)getHasChildFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasChildFilterObject_Filter()
  {
        return (EReference)getHasChildFilterObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasParentFilter()
  {
    if (hasParentFilterEClass == null)
    {
      hasParentFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(143);
    }
    return hasParentFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasParentFilterObject()
  {
    if (hasParentFilterObjectEClass == null)
    {
      hasParentFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(144);
    }
    return hasParentFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHasParentFilterObject_ParentType()
  {
        return (EAttribute)getHasParentFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasParentFilterObject_Query()
  {
        return (EReference)getHasParentFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasParentFilterObject_Filter()
  {
        return (EReference)getHasParentFilterObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicesFilter()
  {
    if (indicesFilterEClass == null)
    {
      indicesFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(145);
    }
    return indicesFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndicesFilterObject()
  {
    if (indicesFilterObjectEClass == null)
    {
      indicesFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(146);
    }
    return indicesFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicesFilterObject_Filter()
  {
        return (EReference)getIndicesFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndicesFilterObject_NoMatchFilter()
  {
        return (EReference)getIndicesFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedFilter()
  {
    if (nestedFilterEClass == null)
    {
      nestedFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(147);
    }
    return nestedFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedFilterObject()
  {
    if (nestedFilterObjectEClass == null)
    {
      nestedFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(148);
    }
    return nestedFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNestedFilterObject_Path()
  {
        return (EAttribute)getNestedFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedFilterObject_Filter()
  {
        return (EReference)getNestedFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotFilter()
  {
    if (notFilterEClass == null)
    {
      notFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(149);
    }
    return notFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotFilterObject()
  {
    if (notFilterObjectEClass == null)
    {
      notFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(150);
    }
    return notFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrFilter()
  {
    if (orFilterEClass == null)
    {
      orFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(151);
    }
    return orFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrFilterArray()
  {
    if (orFilterArrayEClass == null)
    {
      orFilterArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(152);
    }
    return orFilterArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrFilterArray_SubQuery()
  {
        return (EReference)getOrFilterArray().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixFilter()
  {
    if (prefixFilterEClass == null)
    {
      prefixFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(153);
    }
    return prefixFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixFilterObject()
  {
    if (prefixFilterObjectEClass == null)
    {
      prefixFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(154);
    }
    return prefixFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixFilterObject_FieldName()
  {
        return (EAttribute)getPrefixFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixFilterObject_Prefix()
  {
        return (EAttribute)getPrefixFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryFilter()
  {
    if (queryFilterEClass == null)
    {
      queryFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(155);
    }
    return queryFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFQuery()
  {
    if (fQueryEClass == null)
    {
      fQueryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(156);
    }
    return fQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFilter()
  {
    if (rangeFilterEClass == null)
    {
      rangeFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(157);
    }
    return rangeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFilterObject()
  {
    if (rangeFilterObjectEClass == null)
    {
      rangeFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(158);
    }
    return rangeFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeFilterObject_FieldName()
  {
        return (EAttribute)getRangeFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeFilterObject_Params()
  {
        return (EReference)getRangeFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeFilterParametersObject()
  {
    if (rangeFilterParametersObjectEClass == null)
    {
      rangeFilterParametersObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(159);
    }
    return rangeFilterParametersObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeFilterParametersObject_Params()
  {
        return (EAttribute)getRangeFilterParametersObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpFilter()
  {
    if (regexpFilterEClass == null)
    {
      regexpFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(160);
    }
    return regexpFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpFilterObject()
  {
    if (regexpFilterObjectEClass == null)
    {
      regexpFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(161);
    }
    return regexpFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpFilterObject_FieldName()
  {
        return (EAttribute)getRegexpFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpFilterObject_Regexp()
  {
        return (EAttribute)getRegexpFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegexpFilterObject_Params()
  {
        return (EReference)getRegexpFilterObject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegexpFilterParameterObject()
  {
    if (regexpFilterParameterObjectEClass == null)
    {
      regexpFilterParameterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(162);
    }
    return regexpFilterParameterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpFilterParameterObject_Regexp()
  {
        return (EAttribute)getRegexpFilterParameterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegexpFilterParameterObject_Params()
  {
        return (EAttribute)getRegexpFilterParameterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptFilter()
  {
    if (scriptFilterEClass == null)
    {
      scriptFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(163);
    }
    return scriptFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScriptFilterObject()
  {
    if (scriptFilterObjectEClass == null)
    {
      scriptFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(164);
    }
    return scriptFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScriptFilterObject_Script()
  {
        return (EAttribute)getScriptFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScriptFilterObject_Params()
  {
        return (EReference)getScriptFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermFilter()
  {
    if (termFilterEClass == null)
    {
      termFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(165);
    }
    return termFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermFilterObject()
  {
    if (termFilterObjectEClass == null)
    {
      termFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(166);
    }
    return termFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermFilterObject_FieldName()
  {
        return (EAttribute)getTermFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermFilterObject_Term()
  {
        return (EAttribute)getTermFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsFilter()
  {
    if (termsFilterEClass == null)
    {
      termsFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(167);
    }
    return termsFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermsFilterObject()
  {
    if (termsFilterObjectEClass == null)
    {
      termsFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(168);
    }
    return termsFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFilterObject_FieldName()
  {
        return (EAttribute)getTermsFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermsFilterObject_Terms()
  {
        return (EAttribute)getTermsFilterObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeFilter()
  {
    if (typeFilterEClass == null)
    {
      typeFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(169);
    }
    return typeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeFilterObject()
  {
    if (typeFilterObjectEClass == null)
    {
      typeFilterObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(170);
    }
    return typeFilterObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFilterObject_Type()
  {
        return (EAttribute)getTypeFilterObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoShapeObject()
  {
    if (geoShapeObjectEClass == null)
    {
      geoShapeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(171);
    }
    return geoShapeObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeoShape()
  {
    if (geoShapeEClass == null)
    {
      geoShapeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(172);
    }
    return geoShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeoShape_Shape()
  {
        return (EReference)getGeoShape().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeoShape_IndexedShape()
  {
        return (EAttribute)getGeoShape().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolygon()
  {
    if (polygonEClass == null)
    {
      polygonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(173);
    }
    return polygonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolygon_Points()
  {
        return (EReference)getPolygon().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoundingBoxObject()
  {
    if (boundingBoxObjectEClass == null)
    {
      boundingBoxObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(174);
    }
    return boundingBoxObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoundingBoxObject_TwoPointBoundingBox()
  {
        return (EReference)getBoundingBoxObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoundingBoxObject_VerticesBoundingBox()
  {
        return (EAttribute)getBoundingBoxObject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTwoPointBoundingBox()
  {
    if (twoPointBoundingBoxEClass == null)
    {
      twoPointBoundingBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(175);
    }
    return twoPointBoundingBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoPointBoundingBox_TopLeft()
  {
        return (EReference)getTwoPointBoundingBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTwoPointBoundingBox_BottomRight()
  {
        return (EReference)getTwoPointBoundingBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatLon()
  {
    if (latLonEClass == null)
    {
      latLonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(176);
    }
    return latLonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatLon_LatLonObject()
  {
        return (EAttribute)getLatLon().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLatLon_LatLonArray()
  {
        return (EReference)getLatLon().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLatLon_LatLonString()
  {
        return (EReference)getLatLon().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatLonArray()
  {
    if (latLonArrayEClass == null)
    {
      latLonArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(177);
    }
    return latLonArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatLonArray_Lon()
  {
        return (EAttribute)getLatLonArray().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatLonArray_Lat()
  {
        return (EAttribute)getLatLonArray().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatLonString()
  {
    if (latLonStringEClass == null)
    {
      latLonStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(178);
    }
    return latLonStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatLonString_LatLonOrHash()
  {
        return (EAttribute)getLatLonString().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeObject()
  {
    if (shapeObjectEClass == null)
    {
      shapeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(179);
    }
    return shapeObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeObject_Shape()
  {
        return (EReference)getShapeObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShape()
  {
    if (shapeEClass == null)
    {
      shapeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(180);
    }
    return shapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeType()
  {
    if (shapeTypeEClass == null)
    {
      shapeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(181);
    }
    return shapeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShapeTypeEnvelope()
  {
    if (shapeTypeEnvelopeEClass == null)
    {
      shapeTypeEnvelopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(182);
    }
    return shapeTypeEnvelopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShapeTypeEnvelope_Points()
  {
        return (EReference)getShapeTypeEnvelope().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject()
  {
    if (objectEClass == null)
    {
      objectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(183);
    }
    return objectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_Members()
  {
        return (EReference)getObject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMember()
  {
    if (memberEClass == null)
    {
      memberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(184);
    }
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMember_Key()
  {
        return (EAttribute)getMember().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Value()
  {
        return (EReference)getMember().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    if (valueEClass == null)
    {
      valueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(185);
    }
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Object()
  {
        return (EReference)getValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_String()
  {
        return (EAttribute)getValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Array()
  {
        return (EReference)getValue().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Bool()
  {
        return (EAttribute)getValue().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Null()
  {
        return (EAttribute)getValue().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Number()
  {
        return (EAttribute)getValue().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray()
  {
    if (arrayEClass == null)
    {
      arrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SearchPackage.eNS_URI).getEClassifiers().get(186);
    }
    return arrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_Values()
  {
        return (EReference)getArray().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchFactory getSearchFactory()
  {
    return (SearchFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("com.first8.elasticsearch.dsl.search." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //SearchPackageImpl
