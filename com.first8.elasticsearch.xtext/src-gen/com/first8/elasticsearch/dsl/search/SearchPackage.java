/**
 */
package com.first8.elasticsearch.dsl.search;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.first8.elasticsearch.dsl.search.SearchFactory
 * @model kind="package"
 * @generated
 */
public interface SearchPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "search";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.first8.com/elasticsearch/dsl/SearchDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "search";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SearchPackage eINSTANCE = com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl.init();

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl <em>DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSearchDSL()
   * @generated
   */
  int SEARCH_DSL = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__FIELDS = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__FROM = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__SIZE = 2;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__SORT = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__QUERY = 4;

  /**
   * The feature id for the '<em><b>Facets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__FACETS = 5;

  /**
   * The feature id for the '<em><b>Stats</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL__STATS = 6;

  /**
   * The number of structural features of the '<em>DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DSL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SearchFieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SearchFieldImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSearchField()
   * @generated
   */
  int SEARCH_FIELD = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__FIELDS = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__FROM = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__SIZE = 2;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__SORT = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__QUERY = 4;

  /**
   * The feature id for the '<em><b>Facets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__FACETS = 5;

  /**
   * The feature id for the '<em><b>Stats</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD__STATS = 6;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_FIELD_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.StatsImpl <em>Stats</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.StatsImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getStats()
   * @generated
   */
  int STATS = 2;

  /**
   * The feature id for the '<em><b>Groups</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATS__GROUPS = 0;

  /**
   * The number of structural features of the '<em>Stats</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SortImpl <em>Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SortImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSort()
   * @generated
   */
  int SORT = 3;

  /**
   * The feature id for the '<em><b>Sortvalues</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__SORTVALUES = 0;

  /**
   * The number of structural features of the '<em>Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SortValueImpl <em>Sort Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SortValueImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSortValue()
   * @generated
   */
  int SORT_VALUE = 4;

  /**
   * The feature id for the '<em><b>Sort Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_VALUE__SORT_FIELD_NAME = 0;

  /**
   * The feature id for the '<em><b>Sort Short Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_VALUE__SORT_SHORT_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Sort Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_VALUE__SORT_OBJECT = 2;

  /**
   * The feature id for the '<em><b>Sort By Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_VALUE__SORT_BY_SCORE = 3;

  /**
   * The number of structural features of the '<em>Sort Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShortSortOjectImpl <em>Short Sort Oject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShortSortOjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShortSortOject()
   * @generated
   */
  int SHORT_SORT_OJECT = 5;

  /**
   * The feature id for the '<em><b>Sort Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_SORT_OJECT__SORT_FIELD_NAME = 0;

  /**
   * The feature id for the '<em><b>Asc Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_SORT_OJECT__ASC_DESC = 1;

  /**
   * The number of structural features of the '<em>Short Sort Oject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_SORT_OJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SortObjectImpl <em>Sort Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SortObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSortObject()
   * @generated
   */
  int SORT_OBJECT = 6;

  /**
   * The feature id for the '<em><b>Sort Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT__SORT_FIELD_NAME = 0;

  /**
   * The feature id for the '<em><b>Sort Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT__SORT_PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Sort Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SortObjectPropertiesObjectImpl <em>Sort Object Properties Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SortObjectPropertiesObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSortObjectPropertiesObject()
   * @generated
   */
  int SORT_OBJECT_PROPERTIES_OBJECT = 7;

  /**
   * The feature id for the '<em><b>Sort</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTIES_OBJECT__SORT = 0;

  /**
   * The number of structural features of the '<em>Sort Object Properties Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTIES_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SortObjectPropertyImpl <em>Sort Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SortObjectPropertyImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSortObjectProperty()
   * @generated
   */
  int SORT_OBJECT_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTY__ORDER = 0;

  /**
   * The feature id for the '<em><b>Sort Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTY__SORT_MODE = 1;

  /**
   * The feature id for the '<em><b>Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTY__MISSING = 2;

  /**
   * The number of structural features of the '<em>Sort Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_OBJECT_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SORT_MODEImpl <em>SORT MODE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SORT_MODEImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSORT_MODE()
   * @generated
   */
  int SORT_MODE = 9;

  /**
   * The feature id for the '<em><b>Sort Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_MODE__SORT_MODE = 0;

  /**
   * The number of structural features of the '<em>SORT MODE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_MODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ASC_DESCImpl <em>ASC DESC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ASC_DESCImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getASC_DESC()
   * @generated
   */
  int ASC_DESC = 10;

  /**
   * The feature id for the '<em><b>Asc Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASC_DESC__ASC_DESC = 0;

  /**
   * The number of structural features of the '<em>ASC DESC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASC_DESC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FieldsImpl <em>Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FieldsImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFields()
   * @generated
   */
  int FIELDS = 11;

  /**
   * The feature id for the '<em><b>Selectfields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__SELECTFIELDS = 0;

  /**
   * The number of structural features of the '<em>Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetTypeImpl <em>Facet Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetTypeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacetType()
   * @generated
   */
  int FACET_TYPE = 23;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_TYPE__FACET_TYPE = 0;

  /**
   * The number of structural features of the '<em>Facet Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryFacetImpl <em>Query Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryFacet()
   * @generated
   */
  int QUERY_FACET = 29;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Query Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 12;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__FACET_TYPE = QUERY_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__QUERY = QUERY_FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = QUERY_FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilterFacetImpl <em>Filter Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilterFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilterFacet()
   * @generated
   */
  int FILTER_FACET = 30;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Filter Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 13;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__FACET_TYPE = FILTER_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__FILTER = FILTER_FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = FILTER_FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetFilterParamImpl <em>Facet Filter Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetFilterParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacetFilterParam()
   * @generated
   */
  int FACET_FILTER_PARAM = 43;

  /**
   * The number of structural features of the '<em>Facet Filter Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FILTER_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilterObjectImpl <em>Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilterObject()
   * @generated
   */
  int FILTER_OBJECT = 14;

  /**
   * The number of structural features of the '<em>Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_OBJECT_FEATURE_COUNT = FACET_FILTER_PARAM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl <em>Filter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilterTypeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilterType()
   * @generated
   */
  int FILTER_TYPE = 15;

  /**
   * The feature id for the '<em><b>And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__AND = FILTER_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__BOOL = FILTER_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__EXISTS = FILTER_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Geo Bounding Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_BOUNDING_BOX = FILTER_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Geo Distance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_DISTANCE = FILTER_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Geo Distance Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_DISTANCE_RANGE = FILTER_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Geo Polygon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_POLYGON = FILTER_OBJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Geo Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_SHAPE = FILTER_OBJECT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Geo Hash Cell</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__GEO_HASH_CELL = FILTER_OBJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Has Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__HAS_CHILD = FILTER_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Has Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__HAS_PARENT = FILTER_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__IDS = FILTER_OBJECT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__INDICES = FILTER_OBJECT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__LIMIT = FILTER_OBJECT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Match All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__MATCH_ALL = FILTER_OBJECT_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Missing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__MISSING = FILTER_OBJECT_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__NESTED = FILTER_OBJECT_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__NOT = FILTER_OBJECT_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__OR = FILTER_OBJECT_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__PREFIX = FILTER_OBJECT_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__QUERY = FILTER_OBJECT_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Regexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__REGEXP = FILTER_OBJECT_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__SCRIPT = FILTER_OBJECT_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__TERM = FILTER_OBJECT_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__TERMS = FILTER_OBJECT_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE__TYPE = FILTER_OBJECT_FEATURE_COUNT + 25;

  /**
   * The number of structural features of the '<em>Filter Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_TYPE_FEATURE_COUNT = FILTER_OBJECT_FEATURE_COUNT + 26;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryFilterImpl <em>Query Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryFilter()
   * @generated
   */
  int QUERY_FILTER = 155;

  /**
   * The number of structural features of the '<em>Query Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FQueryImpl <em>FQuery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFQuery()
   * @generated
   */
  int FQUERY = 156;

  /**
   * The number of structural features of the '<em>FQuery</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FQUERY_FEATURE_COUNT = QUERY_FILTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryObjectImpl <em>Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryObject()
   * @generated
   */
  int QUERY_OBJECT = 16;

  /**
   * The feature id for the '<em><b>Query Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_OBJECT__QUERY_TYPE = FQUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_OBJECT_FEATURE_COUNT = FQUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl <em>Query Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryTypeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryType()
   * @generated
   */
  int QUERY_TYPE = 17;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__MATCH = 0;

  /**
   * The feature id for the '<em><b>Multi Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__MULTI_MATCH = 1;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__BOOL = 2;

  /**
   * The feature id for the '<em><b>Common</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__COMMON = 3;

  /**
   * The feature id for the '<em><b>Constant Score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__CONSTANT_SCORE = 4;

  /**
   * The feature id for the '<em><b>Dis Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__DIS_MAX = 5;

  /**
   * The feature id for the '<em><b>Filtered</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__FILTERED = 6;

  /**
   * The feature id for the '<em><b>Fuzzy Like This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__FUZZY_LIKE_THIS = 7;

  /**
   * The feature id for the '<em><b>Fuzzy Like This Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__FUZZY_LIKE_THIS_FIELD = 8;

  /**
   * The feature id for the '<em><b>Geoshape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__GEOSHAPE = 9;

  /**
   * The feature id for the '<em><b>Has Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__HAS_CHILD = 10;

  /**
   * The feature id for the '<em><b>Has Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__HAS_PARENT = 11;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__IDS = 12;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__INDICES = 13;

  /**
   * The feature id for the '<em><b>Match All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__MATCH_ALL = 14;

  /**
   * The feature id for the '<em><b>More Like This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__MORE_LIKE_THIS = 15;

  /**
   * The feature id for the '<em><b>More Like This Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__MORE_LIKE_THIS_FIELD = 16;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__NESTED = 17;

  /**
   * The feature id for the '<em><b>Query String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__QUERY_STRING = 18;

  /**
   * The feature id for the '<em><b>Simple Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SIMPLE_QUERY = 19;

  /**
   * The feature id for the '<em><b>Span First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_FIRST = 20;

  /**
   * The feature id for the '<em><b>Span Multi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_MULTI = 21;

  /**
   * The feature id for the '<em><b>Span Near</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_NEAR = 22;

  /**
   * The feature id for the '<em><b>Span Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_NOT = 23;

  /**
   * The feature id for the '<em><b>Span Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_OR = 24;

  /**
   * The feature id for the '<em><b>Span Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__SPAN_TERM = 25;

  /**
   * The feature id for the '<em><b>Fuzzy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__FUZZY = 26;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__PREFIX = 27;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__TERM = 28;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__RANGE = 29;

  /**
   * The feature id for the '<em><b>Regexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__REGEXP = 30;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__WILDCARD = 31;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__TERMS = 32;

  /**
   * The feature id for the '<em><b>Top Children</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE__TOP_CHILDREN = 33;

  /**
   * The number of structural features of the '<em>Query Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TYPE_FEATURE_COUNT = 34;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanQueryImpl <em>Span Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanQuery()
   * @generated
   */
  int SPAN_QUERY = 18;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_QUERY__SPAN_QUERY = 0;

  /**
   * The number of structural features of the '<em>Span Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanMultiQueryImpl <em>Span Multi Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanMultiQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanMultiQuery()
   * @generated
   */
  int SPAN_MULTI_QUERY = 105;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_MULTI_QUERY__SPAN_QUERY = SPAN_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Multi Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_MULTI_QUERY_FEATURE_COUNT = SPAN_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanMultiQueryObjectImpl <em>Span Multi Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanMultiQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanMultiQueryObject()
   * @generated
   */
  int SPAN_MULTI_QUERY_OBJECT = 106;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_MULTI_QUERY_OBJECT__SPAN_QUERY = SPAN_MULTI_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Multi Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_MULTI_QUERY_OBJECT_FEATURE_COUNT = SPAN_MULTI_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MultiTermQueryImpl <em>Multi Term Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MultiTermQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMultiTermQuery()
   * @generated
   */
  int MULTI_TERM_QUERY = 19;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TERM_QUERY__SPAN_QUERY = SPAN_MULTI_QUERY_OBJECT__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TERM_QUERY__MULTI_TERM_QUERY = SPAN_MULTI_QUERY_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multi Term Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_TERM_QUERY_FEATURE_COUNT = SPAN_MULTI_QUERY_OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetsImpl <em>Facets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetsImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacets()
   * @generated
   */
  int FACETS = 20;

  /**
   * The number of structural features of the '<em>Facets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetsObjectImpl <em>Facets Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetsObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacetsObject()
   * @generated
   */
  int FACETS_OBJECT = 21;

  /**
   * The feature id for the '<em><b>Facet Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_OBJECT__FACET_NAME = FACETS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_OBJECT__CONFIG = FACETS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_OBJECT__PARAMS = FACETS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Facets Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACETS_OBJECT_FEATURE_COUNT = FACETS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetTypeObjectImpl <em>Facet Type Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetTypeObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacetTypeObject()
   * @generated
   */
  int FACET_TYPE_OBJECT = 22;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_TYPE_OBJECT__FACET_TYPE = 0;

  /**
   * The number of structural features of the '<em>Facet Type Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_TYPE_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFacetImpl <em>Geo Distance Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceFacet()
   * @generated
   */
  int GEO_DISTANCE_FACET = 24;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Geo Distance Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFacetObjectImpl <em>Geo Distance Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceFacetObject()
   * @generated
   */
  int GEO_DISTANCE_FACET_OBJECT = 25;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET_OBJECT__FACET_TYPE = GEO_DISTANCE_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET_OBJECT__FIELD_NAME = GEO_DISTANCE_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET_OBJECT__POINT = GEO_DISTANCE_FACET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geo Distance Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FACET_OBJECT_FEATURE_COUNT = GEO_DISTANCE_FACET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsStatsFacetImpl <em>Terms Stats Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsStatsFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsStatsFacet()
   * @generated
   */
  int TERMS_STATS_FACET = 26;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_STATS_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Terms Stats Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_STATS_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.StatisticalFacetImpl <em>Statistical Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.StatisticalFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getStatisticalFacet()
   * @generated
   */
  int STATISTICAL_FACET = 27;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Statistical Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.StatisticalFacetObjectImpl <em>Statistical Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.StatisticalFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getStatisticalFacetObject()
   * @generated
   */
  int STATISTICAL_FACET_OBJECT = 28;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_OBJECT__FACET_TYPE = STATISTICAL_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_OBJECT__FIELD = STATISTICAL_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_OBJECT__SCRIPT = STATISTICAL_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_OBJECT__FIELDS = STATISTICAL_FACET_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Statistical Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATISTICAL_FACET_OBJECT_FEATURE_COUNT = STATISTICAL_FACET_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetImpl <em>Date Histogram Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getDateHistogramFacet()
   * @generated
   */
  int DATE_HISTOGRAM_FACET = 31;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Date Histogram Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetObjectImpl <em>Date Histogram Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.DateHistogramFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getDateHistogramFacetObject()
   * @generated
   */
  int DATE_HISTOGRAM_FACET_OBJECT = 32;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_OBJECT__FACET_TYPE = DATE_HISTOGRAM_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_OBJECT__FIELD = DATE_HISTOGRAM_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE = DATE_HISTOGRAM_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Key Value Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT = DATE_HISTOGRAM_FACET_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Date Histogram Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_HISTOGRAM_FACET_OBJECT_FEATURE_COUNT = DATE_HISTOGRAM_FACET_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HistogramFacetImpl <em>Histogram Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HistogramFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHistogramFacet()
   * @generated
   */
  int HISTOGRAM_FACET = 33;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Histogram Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HistogramFacetObjectImpl <em>Histogram Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HistogramFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHistogramFacetObject()
   * @generated
   */
  int HISTOGRAM_FACET_OBJECT = 34;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_OBJECT__FACET_TYPE = HISTOGRAM_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_OBJECT__FIELD = HISTOGRAM_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_OBJECT__KEY_VALUE = HISTOGRAM_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Key Value Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_OBJECT__KEY_VALUE_SCRIPT = HISTOGRAM_FACET_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Histogram Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HISTOGRAM_FACET_OBJECT_FEATURE_COUNT = HISTOGRAM_FACET_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeFacetImpl <em>Range Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeFacet()
   * @generated
   */
  int RANGE_FACET = 35;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET__FACET_TYPE = FACET_TYPE__FACET_TYPE;

  /**
   * The number of structural features of the '<em>Range Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_FEATURE_COUNT = FACET_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeFacetObjectImpl <em>Range Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeFacetObject()
   * @generated
   */
  int RANGE_FACET_OBJECT = 36;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_OBJECT__FACET_TYPE = RANGE_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_OBJECT__FIELD = RANGE_FACET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_OBJECT__KEY_VALUE = RANGE_FACET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Key Value Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_OBJECT__KEY_VALUE_SCRIPT = RANGE_FACET_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Range Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FACET_OBJECT_FEATURE_COUNT = RANGE_FACET_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.KeyValueFieldImpl <em>Key Value Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.KeyValueFieldImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getKeyValueField()
   * @generated
   */
  int KEY_VALUE_FIELD = 37;

  /**
   * The feature id for the '<em><b>Key Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_FIELD__KEY_FIELD = 0;

  /**
   * The feature id for the '<em><b>Value Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_FIELD__VALUE_FIELD = 1;

  /**
   * The number of structural features of the '<em>Key Value Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.KeyValueScriptImpl <em>Key Value Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.KeyValueScriptImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getKeyValueScript()
   * @generated
   */
  int KEY_VALUE_SCRIPT = 38;

  /**
   * The feature id for the '<em><b>Key Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_SCRIPT__KEY_SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Value Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_SCRIPT__VALUE_SCRIPT = 1;

  /**
   * The number of structural features of the '<em>Key Value Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_SCRIPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetImpl <em>Terms Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsFacetImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsFacet()
   * @generated
   */
  int TERMS_FACET = 39;

  /**
   * The number of structural features of the '<em>Terms Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetObjectImpl <em>Terms Facet Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsFacetObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsFacetObject()
   * @generated
   */
  int TERMS_FACET_OBJECT = 40;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_OBJECT__PARAMS = TERMS_FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Terms Facet Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_OBJECT_FEATURE_COUNT = TERMS_FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl <em>Terms Facet Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsFacetParameterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsFacetParameter()
   * @generated
   */
  int TERMS_FACET_PARAMETER = 41;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__FIELD = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__FIELDS = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__SIZE = 2;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__ORDER = 3;

  /**
   * The feature id for the '<em><b>All Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__ALL_TERMS = 4;

  /**
   * The feature id for the '<em><b>Exclude</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__EXCLUDE = 5;

  /**
   * The feature id for the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__REGEX = 6;

  /**
   * The feature id for the '<em><b>Regex Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__REGEX_FLAGS = 7;

  /**
   * The feature id for the '<em><b>Script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__SCRIPT = 8;

  /**
   * The feature id for the '<em><b>Script Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER__SCRIPT_FIELD = 9;

  /**
   * The number of structural features of the '<em>Terms Facet Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FACET_PARAMETER_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FacetParameterImpl <em>Facet Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FacetParameterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFacetParameter()
   * @generated
   */
  int FACET_PARAMETER = 42;

  /**
   * The feature id for the '<em><b>Global</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PARAMETER__GLOBAL = 0;

  /**
   * The feature id for the '<em><b>Face Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PARAMETER__FACE_FILTER = 1;

  /**
   * The feature id for the '<em><b>Nested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PARAMETER__NESTED = 2;

  /**
   * The number of structural features of the '<em>Facet Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.AllTermsParamImpl <em>All Terms Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.AllTermsParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getAllTermsParam()
   * @generated
   */
  int ALL_TERMS_PARAM = 44;

  /**
   * The feature id for the '<em><b>All Terms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_TERMS_PARAM__ALL_TERMS = 0;

  /**
   * The number of structural features of the '<em>All Terms Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALL_TERMS_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ExcludeParamImpl <em>Exclude Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ExcludeParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getExcludeParam()
   * @generated
   */
  int EXCLUDE_PARAM = 45;

  /**
   * The feature id for the '<em><b>Exclude Field Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDE_PARAM__EXCLUDE_FIELD_NAMES = 0;

  /**
   * The number of structural features of the '<em>Exclude Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDE_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ScriptParamImpl <em>Script Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ScriptParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getScriptParam()
   * @generated
   */
  int SCRIPT_PARAM = 46;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM__SCRIPT = 0;

  /**
   * The number of structural features of the '<em>Script Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ScriptFieldParamImpl <em>Script Field Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ScriptFieldParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getScriptFieldParam()
   * @generated
   */
  int SCRIPT_FIELD_PARAM = 47;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FIELD_PARAM__FIELD_NAME = 0;

  /**
   * The number of structural features of the '<em>Script Field Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FIELD_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisQueryImpl <em>Fuzzy Like This Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyLikeThisQuery()
   * @generated
   */
  int FUZZY_LIKE_THIS_QUERY = 67;

  /**
   * The number of structural features of the '<em>Fuzzy Like This Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisQueryObjectImpl <em>Fuzzy Like This Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyLikeThisQueryObject()
   * @generated
   */
  int FUZZY_LIKE_THIS_QUERY_OBJECT = 68;

  /**
   * The number of structural features of the '<em>Fuzzy Like This Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_QUERY_OBJECT_FEATURE_COUNT = FUZZY_LIKE_THIS_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.LikeTextParamImpl <em>Like Text Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.LikeTextParamImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getLikeTextParam()
   * @generated
   */
  int LIKE_TEXT_PARAM = 48;

  /**
   * The feature id for the '<em><b>Like Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_TEXT_PARAM__LIKE_QUERY = FUZZY_LIKE_THIS_QUERY_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_TEXT_PARAM__PARAMS = FUZZY_LIKE_THIS_QUERY_OBJECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Like Text Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKE_TEXT_PARAM_FEATURE_COUNT = FUZZY_LIKE_THIS_QUERY_OBJECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MatchQueryImpl <em>Match Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MatchQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMatchQuery()
   * @generated
   */
  int MATCH_QUERY = 49;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY__FIELD_NAME = 0;

  /**
   * The number of structural features of the '<em>Match Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShortMatchQueryObjectImpl <em>Short Match Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShortMatchQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShortMatchQueryObject()
   * @generated
   */
  int SHORT_MATCH_QUERY_OBJECT = 50;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_MATCH_QUERY_OBJECT__FIELD_NAME = MATCH_QUERY__FIELD_NAME;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_MATCH_QUERY_OBJECT__QUERY = MATCH_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Short Match Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_MATCH_QUERY_OBJECT_FEATURE_COUNT = MATCH_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MatchQueryObjectImpl <em>Match Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MatchQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMatchQueryObject()
   * @generated
   */
  int MATCH_QUERY_OBJECT = 51;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_OBJECT__FIELD_NAME = MATCH_QUERY__FIELD_NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_OBJECT__PARAMETERS = MATCH_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Match Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_OBJECT_FEATURE_COUNT = MATCH_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MatchQueryParametersObjectImpl <em>Match Query Parameters Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MatchQueryParametersObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMatchQueryParametersObject()
   * @generated
   */
  int MATCH_QUERY_PARAMETERS_OBJECT = 52;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_PARAMETERS_OBJECT__QUERY = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_PARAMETERS_OBJECT__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Match Query Parameters Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_QUERY_PARAMETERS_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MultiMatchQueryImpl <em>Multi Match Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MultiMatchQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMultiMatchQuery()
   * @generated
   */
  int MULTI_MATCH_QUERY = 53;

  /**
   * The number of structural features of the '<em>Multi Match Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_MATCH_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MultiMatchQueryObjectImpl <em>Multi Match Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MultiMatchQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMultiMatchQueryObject()
   * @generated
   */
  int MULTI_MATCH_QUERY_OBJECT = 54;

  /**
   * The feature id for the '<em><b>Fields</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_MATCH_QUERY_OBJECT__FIELDS = MULTI_MATCH_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_MATCH_QUERY_OBJECT__PARAMS = MULTI_MATCH_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Match Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_MATCH_QUERY_OBJECT_FEATURE_COUNT = MULTI_MATCH_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolQueryImpl <em>Bool Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolQuery()
   * @generated
   */
  int BOOL_QUERY = 55;

  /**
   * The number of structural features of the '<em>Bool Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolQueryObjectImpl <em>Bool Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolQueryObject()
   * @generated
   */
  int BOOL_QUERY_OBJECT = 56;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_QUERY_OBJECT__CLAUSE = BOOL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_QUERY_OBJECT__PARAMS = BOOL_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bool Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_QUERY_OBJECT_FEATURE_COUNT = BOOL_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolClauseImpl <em>Bool Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolClauseImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolClause()
   * @generated
   */
  int BOOL_CLAUSE = 57;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CLAUSE__QUERY = 0;

  /**
   * The number of structural features of the '<em>Bool Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.CommonQueryImpl <em>Common Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.CommonQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getCommonQuery()
   * @generated
   */
  int COMMON_QUERY = 58;

  /**
   * The number of structural features of the '<em>Common Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.CommonQueryObjectImpl <em>Common Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.CommonQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getCommonQueryObject()
   * @generated
   */
  int COMMON_QUERY_OBJECT = 59;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_OBJECT__FIELD_NAME = COMMON_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_OBJECT__PARAMETERS = COMMON_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Common Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_OBJECT_FEATURE_COUNT = COMMON_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.CommonQueryParametersObjectImpl <em>Common Query Parameters Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.CommonQueryParametersObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getCommonQueryParametersObject()
   * @generated
   */
  int COMMON_QUERY_PARAMETERS_OBJECT = 60;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_PARAMETERS_OBJECT__QUERY = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_PARAMETERS_OBJECT__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Common Query Parameters Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_QUERY_PARAMETERS_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ConstantScoreQueryImpl <em>Constant Score Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ConstantScoreQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getConstantScoreQuery()
   * @generated
   */
  int CONSTANT_SCORE_QUERY = 61;

  /**
   * The number of structural features of the '<em>Constant Score Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_SCORE_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ConstantScoreQueryObjectImpl <em>Constant Score Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ConstantScoreQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getConstantScoreQueryObject()
   * @generated
   */
  int CONSTANT_SCORE_QUERY_OBJECT = 62;

  /**
   * The number of structural features of the '<em>Constant Score Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_SCORE_QUERY_OBJECT_FEATURE_COUNT = CONSTANT_SCORE_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.DisMaxQueryImpl <em>Dis Max Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.DisMaxQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getDisMaxQuery()
   * @generated
   */
  int DIS_MAX_QUERY = 63;

  /**
   * The number of structural features of the '<em>Dis Max Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIS_MAX_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.DisMaxQueryObjectImpl <em>Dis Max Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.DisMaxQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getDisMaxQueryObject()
   * @generated
   */
  int DIS_MAX_QUERY_OBJECT = 64;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIS_MAX_QUERY_OBJECT__QUERY = DIS_MAX_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dis Max Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIS_MAX_QUERY_OBJECT_FEATURE_COUNT = DIS_MAX_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilteredQueryImpl <em>Filtered Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilteredQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilteredQuery()
   * @generated
   */
  int FILTERED_QUERY = 65;

  /**
   * The number of structural features of the '<em>Filtered Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FilteredQueryObjectImpl <em>Filtered Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FilteredQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFilteredQueryObject()
   * @generated
   */
  int FILTERED_QUERY_OBJECT = 66;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_QUERY_OBJECT__QUERY = FILTERED_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_QUERY_OBJECT__FILTER = FILTERED_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Filtered Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_QUERY_OBJECT_FEATURE_COUNT = FILTERED_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisFieldQueryImpl <em>Fuzzy Like This Field Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisFieldQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyLikeThisFieldQuery()
   * @generated
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY = 69;

  /**
   * The number of structural features of the '<em>Fuzzy Like This Field Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisFieldQueryObjectImpl <em>Fuzzy Like This Field Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyLikeThisFieldQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyLikeThisFieldQueryObject()
   * @generated
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT = 70;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT__FIELD_NAME = FUZZY_LIKE_THIS_FIELD_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT__PARAMS = FUZZY_LIKE_THIS_FIELD_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fuzzy Like This Field Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_LIKE_THIS_FIELD_QUERY_OBJECT_FEATURE_COUNT = FUZZY_LIKE_THIS_FIELD_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyQueryImpl <em>Fuzzy Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyQuery()
   * @generated
   */
  int FUZZY_QUERY = 71;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY__FIELD = 0;

  /**
   * The number of structural features of the '<em>Fuzzy Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SimpleFuzzyQueryObjectImpl <em>Simple Fuzzy Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SimpleFuzzyQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSimpleFuzzyQueryObject()
   * @generated
   */
  int SIMPLE_FUZZY_QUERY_OBJECT = 72;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUZZY_QUERY_OBJECT__FIELD = FUZZY_QUERY__FIELD;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUZZY_QUERY_OBJECT__QUERY = FUZZY_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Fuzzy Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FUZZY_QUERY_OBJECT_FEATURE_COUNT = FUZZY_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyQueryObjectImpl <em>Fuzzy Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyQueryObject()
   * @generated
   */
  int FUZZY_QUERY_OBJECT = 73;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT__FIELD = FUZZY_QUERY__FIELD;

  /**
   * The feature id for the '<em><b>Q</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT__Q = FUZZY_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fuzzy Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT_FEATURE_COUNT = FUZZY_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.FuzzyQueryObjectParametersImpl <em>Fuzzy Query Object Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.FuzzyQueryObjectParametersImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getFuzzyQueryObjectParameters()
   * @generated
   */
  int FUZZY_QUERY_OBJECT_PARAMETERS = 74;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT_PARAMETERS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT_PARAMETERS__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Fuzzy Query Object Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUZZY_QUERY_OBJECT_PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoshapeQueryImpl <em>Geoshape Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoshapeQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoshapeQuery()
   * @generated
   */
  int GEOSHAPE_QUERY = 75;

  /**
   * The number of structural features of the '<em>Geoshape Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOSHAPE_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoshapeQueryObjectImpl <em>Geoshape Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoshapeQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoshapeQueryObject()
   * @generated
   */
  int GEOSHAPE_QUERY_OBJECT = 76;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOSHAPE_QUERY_OBJECT__FIELD_NAME = GEOSHAPE_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOSHAPE_QUERY_OBJECT__SHAPE = GEOSHAPE_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geoshape Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOSHAPE_QUERY_OBJECT_FEATURE_COUNT = GEOSHAPE_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasChildQueryImpl <em>Has Child Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasChildQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasChildQuery()
   * @generated
   */
  int HAS_CHILD_QUERY = 77;

  /**
   * The number of structural features of the '<em>Has Child Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasChildQueryObjectImpl <em>Has Child Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasChildQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasChildQueryObject()
   * @generated
   */
  int HAS_CHILD_QUERY_OBJECT = 78;

  /**
   * The feature id for the '<em><b>Child Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_QUERY_OBJECT__CHILD_TYPE = HAS_CHILD_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_QUERY_OBJECT__QUERY = HAS_CHILD_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_QUERY_OBJECT__FILTER = HAS_CHILD_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Child Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_QUERY_OBJECT_FEATURE_COUNT = HAS_CHILD_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasParentQueryImpl <em>Has Parent Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasParentQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasParentQuery()
   * @generated
   */
  int HAS_PARENT_QUERY = 79;

  /**
   * The number of structural features of the '<em>Has Parent Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasParentQueryObjectImpl <em>Has Parent Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasParentQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasParentQueryObject()
   * @generated
   */
  int HAS_PARENT_QUERY_OBJECT = 80;

  /**
   * The feature id for the '<em><b>Parent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_QUERY_OBJECT__PARENT_TYPE = HAS_PARENT_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_QUERY_OBJECT__QUERY = HAS_PARENT_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_QUERY_OBJECT__FILTER = HAS_PARENT_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Parent Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_QUERY_OBJECT_FEATURE_COUNT = HAS_PARENT_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.IndicesQueryImpl <em>Indices Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.IndicesQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getIndicesQuery()
   * @generated
   */
  int INDICES_QUERY = 81;

  /**
   * The number of structural features of the '<em>Indices Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.IndicesQueryObjectImpl <em>Indices Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.IndicesQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getIndicesQueryObject()
   * @generated
   */
  int INDICES_QUERY_OBJECT = 82;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_QUERY_OBJECT__QUERY = INDICES_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>No Match Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_QUERY_OBJECT__NO_MATCH_QUERY = INDICES_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indices Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_QUERY_OBJECT_FEATURE_COUNT = INDICES_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MoreLikeThisQueryImpl <em>More Like This Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MoreLikeThisQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMoreLikeThisQuery()
   * @generated
   */
  int MORE_LIKE_THIS_QUERY = 83;

  /**
   * The number of structural features of the '<em>More Like This Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MoreLikeThisQueryObjectImpl <em>More Like This Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MoreLikeThisQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMoreLikeThisQueryObject()
   * @generated
   */
  int MORE_LIKE_THIS_QUERY_OBJECT = 84;

  /**
   * The number of structural features of the '<em>More Like This Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_QUERY_OBJECT_FEATURE_COUNT = MORE_LIKE_THIS_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MoreLikeThisFieldQueryImpl <em>More Like This Field Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MoreLikeThisFieldQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMoreLikeThisFieldQuery()
   * @generated
   */
  int MORE_LIKE_THIS_FIELD_QUERY = 85;

  /**
   * The number of structural features of the '<em>More Like This Field Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_FIELD_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MoreLikeThisFieldQueryObjectImpl <em>More Like This Field Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MoreLikeThisFieldQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMoreLikeThisFieldQueryObject()
   * @generated
   */
  int MORE_LIKE_THIS_FIELD_QUERY_OBJECT = 86;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_FIELD_QUERY_OBJECT__FIELD_NAME = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_FIELD_QUERY_OBJECT__QUERY = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_FIELD_QUERY_OBJECT__PARAMS = 2;

  /**
   * The number of structural features of the '<em>More Like This Field Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_LIKE_THIS_FIELD_QUERY_OBJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NestedQueryImpl <em>Nested Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NestedQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNestedQuery()
   * @generated
   */
  int NESTED_QUERY = 87;

  /**
   * The number of structural features of the '<em>Nested Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NestedQueryObjectImpl <em>Nested Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NestedQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNestedQueryObject()
   * @generated
   */
  int NESTED_QUERY_OBJECT = 88;

  /**
   * The number of structural features of the '<em>Nested Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUERY_OBJECT_FEATURE_COUNT = NESTED_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PrefixQueryImpl <em>Prefix Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PrefixQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPrefixQuery()
   * @generated
   */
  int PREFIX_QUERY = 89;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY__SPAN_QUERY = MULTI_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY__MULTI_TERM_QUERY = MULTI_TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY__FIELD_NAME = MULTI_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prefix Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_FEATURE_COUNT = MULTI_TERM_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SimplePrefixQueryObjectImpl <em>Simple Prefix Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SimplePrefixQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSimplePrefixQueryObject()
   * @generated
   */
  int SIMPLE_PREFIX_QUERY_OBJECT = 90;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PREFIX_QUERY_OBJECT__SPAN_QUERY = PREFIX_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PREFIX_QUERY_OBJECT__MULTI_TERM_QUERY = PREFIX_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PREFIX_QUERY_OBJECT__FIELD_NAME = PREFIX_QUERY__FIELD_NAME;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PREFIX_QUERY_OBJECT__PREFIX = PREFIX_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Prefix Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PREFIX_QUERY_OBJECT_FEATURE_COUNT = PREFIX_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PrefixQueryObjectImpl <em>Prefix Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PrefixQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPrefixQueryObject()
   * @generated
   */
  int PREFIX_QUERY_OBJECT = 91;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_OBJECT__SPAN_QUERY = PREFIX_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_OBJECT__MULTI_TERM_QUERY = PREFIX_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_OBJECT__FIELD_NAME = PREFIX_QUERY__FIELD_NAME;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_OBJECT__PREFIX = PREFIX_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prefix Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_OBJECT_FEATURE_COUNT = PREFIX_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PrefixQueryParameterObjectImpl <em>Prefix Query Parameter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PrefixQueryParameterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPrefixQueryParameterObject()
   * @generated
   */
  int PREFIX_QUERY_PARAMETER_OBJECT = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_PARAMETER_OBJECT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Prefix Query Parameter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_QUERY_PARAMETER_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryStringQueryImpl <em>Query String Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryStringQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryStringQuery()
   * @generated
   */
  int QUERY_STRING_QUERY = 93;

  /**
   * The number of structural features of the '<em>Query String Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_STRING_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.QueryStringQueryObjectImpl <em>Query String Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.QueryStringQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getQueryStringQueryObject()
   * @generated
   */
  int QUERY_STRING_QUERY_OBJECT = 94;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_STRING_QUERY_OBJECT__QUERY = QUERY_STRING_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_STRING_QUERY_OBJECT__PARAMS = QUERY_STRING_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query String Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_STRING_QUERY_OBJECT_FEATURE_COUNT = QUERY_STRING_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SimpleQueryStringQueryImpl <em>Simple Query String Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SimpleQueryStringQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSimpleQueryStringQuery()
   * @generated
   */
  int SIMPLE_QUERY_STRING_QUERY = 95;

  /**
   * The number of structural features of the '<em>Simple Query String Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUERY_STRING_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SimpleQueryStringQueryObjectImpl <em>Simple Query String Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SimpleQueryStringQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSimpleQueryStringQueryObject()
   * @generated
   */
  int SIMPLE_QUERY_STRING_QUERY_OBJECT = 96;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUERY_STRING_QUERY_OBJECT__QUERY = SIMPLE_QUERY_STRING_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUERY_STRING_QUERY_OBJECT__PARAMS = SIMPLE_QUERY_STRING_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Query String Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_QUERY_STRING_QUERY_OBJECT_FEATURE_COUNT = SIMPLE_QUERY_STRING_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeQueryImpl <em>Range Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeQuery()
   * @generated
   */
  int RANGE_QUERY = 97;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY__SPAN_QUERY = MULTI_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY__MULTI_TERM_QUERY = MULTI_TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The number of structural features of the '<em>Range Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_FEATURE_COUNT = MULTI_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeQueryObjectImpl <em>Range Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeQueryObject()
   * @generated
   */
  int RANGE_QUERY_OBJECT = 98;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_OBJECT__SPAN_QUERY = RANGE_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_OBJECT__MULTI_TERM_QUERY = RANGE_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_OBJECT__FIELD_NAME = RANGE_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_OBJECT__PARAMS = RANGE_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_OBJECT_FEATURE_COUNT = RANGE_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeQueryParametersObjectImpl <em>Range Query Parameters Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeQueryParametersObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeQueryParametersObject()
   * @generated
   */
  int RANGE_QUERY_PARAMETERS_OBJECT = 99;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_PARAMETERS_OBJECT__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Range Query Parameters Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_QUERY_PARAMETERS_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpQueryImpl <em>Regexp Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpQuery()
   * @generated
   */
  int REGEXP_QUERY = 100;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY__SPAN_QUERY = MULTI_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY__MULTI_TERM_QUERY = MULTI_TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The number of structural features of the '<em>Regexp Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_FEATURE_COUNT = MULTI_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpQueryObjectImpl <em>Regexp Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpQueryObject()
   * @generated
   */
  int REGEXP_QUERY_OBJECT = 101;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT__SPAN_QUERY = REGEXP_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT__MULTI_TERM_QUERY = REGEXP_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT__FIELD_NAME = REGEXP_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Regexp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT__REGEXP = REGEXP_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT__PARAMS = REGEXP_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Regexp Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_OBJECT_FEATURE_COUNT = REGEXP_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpQueryParameterObjectImpl <em>Regexp Query Parameter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpQueryParameterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpQueryParameterObject()
   * @generated
   */
  int REGEXP_QUERY_PARAMETER_OBJECT = 102;

  /**
   * The feature id for the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_PARAMETER_OBJECT__REGEX = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_PARAMETER_OBJECT__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Regexp Query Parameter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_QUERY_PARAMETER_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanFirstQueryImpl <em>Span First Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanFirstQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanFirstQuery()
   * @generated
   */
  int SPAN_FIRST_QUERY = 103;

  /**
   * The number of structural features of the '<em>Span First Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_FIRST_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanFirstQueryObjectImpl <em>Span First Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanFirstQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanFirstQueryObject()
   * @generated
   */
  int SPAN_FIRST_QUERY_OBJECT = 104;

  /**
   * The feature id for the '<em><b>Subquery</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_FIRST_QUERY_OBJECT__SUBQUERY = SPAN_FIRST_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Span First Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_FIRST_QUERY_OBJECT_FEATURE_COUNT = SPAN_FIRST_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryImpl <em>Span Near Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanNearQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanNearQuery()
   * @generated
   */
  int SPAN_NEAR_QUERY = 107;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY__SPAN_QUERY = SPAN_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Near Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_FEATURE_COUNT = SPAN_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl <em>Span Near Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanNearQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanNearQueryObject()
   * @generated
   */
  int SPAN_NEAR_QUERY_OBJECT = 108;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT__SPAN_QUERY = SPAN_NEAR_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT__CLAUSES = SPAN_NEAR_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Slop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT__SLOP = SPAN_NEAR_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>In Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT__IN_ORDER = SPAN_NEAR_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Collect Payloads</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT__COLLECT_PAYLOADS = SPAN_NEAR_QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Span Near Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NEAR_QUERY_OBJECT_FEATURE_COUNT = SPAN_NEAR_QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanNotQueryImpl <em>Span Not Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanNotQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanNotQuery()
   * @generated
   */
  int SPAN_NOT_QUERY = 109;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY__SPAN_QUERY = SPAN_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Not Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY_FEATURE_COUNT = SPAN_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanNotQueryObjectImpl <em>Span Not Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanNotQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanNotQueryObject()
   * @generated
   */
  int SPAN_NOT_QUERY_OBJECT = 110;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY_OBJECT__SPAN_QUERY = SPAN_NOT_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Include Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY_OBJECT__INCLUDE_QUERY = SPAN_NOT_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exclude Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY_OBJECT__EXCLUDE_QUERY = SPAN_NOT_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Span Not Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_NOT_QUERY_OBJECT_FEATURE_COUNT = SPAN_NOT_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanOrQueryImpl <em>Span Or Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanOrQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanOrQuery()
   * @generated
   */
  int SPAN_OR_QUERY = 111;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_OR_QUERY__SPAN_QUERY = SPAN_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Or Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_OR_QUERY_FEATURE_COUNT = SPAN_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanOrQueryObjectImpl <em>Span Or Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanOrQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanOrQueryObject()
   * @generated
   */
  int SPAN_OR_QUERY_OBJECT = 112;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_OR_QUERY_OBJECT__SPAN_QUERY = SPAN_OR_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_OR_QUERY_OBJECT__CLAUSES = SPAN_OR_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Span Or Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_OR_QUERY_OBJECT_FEATURE_COUNT = SPAN_OR_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanTermQueryImpl <em>Span Term Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanTermQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanTermQuery()
   * @generated
   */
  int SPAN_TERM_QUERY = 113;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY__SPAN_QUERY = SPAN_QUERY__SPAN_QUERY;

  /**
   * The number of structural features of the '<em>Span Term Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY_FEATURE_COUNT = SPAN_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SpanTermQueryObjectImpl <em>Span Term Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SpanTermQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSpanTermQueryObject()
   * @generated
   */
  int SPAN_TERM_QUERY_OBJECT = 114;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY_OBJECT__SPAN_QUERY = SPAN_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY_OBJECT__FIELD_NAME = SPAN_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY_OBJECT__PARAMS = SPAN_TERM_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Span Term Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPAN_TERM_QUERY_OBJECT_FEATURE_COUNT = SPAN_TERM_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermQueryImpl <em>Term Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermQuery()
   * @generated
   */
  int TERM_QUERY = 115;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY__SPAN_QUERY = MULTI_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY__MULTI_TERM_QUERY = MULTI_TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The number of structural features of the '<em>Term Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_FEATURE_COUNT = MULTI_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermQueryObjectImpl <em>Term Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermQueryObject()
   * @generated
   */
  int TERM_QUERY_OBJECT = 116;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT__SPAN_QUERY = TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT__MULTI_TERM_QUERY = TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT__FIELD_NAME = TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT__TERM = TERM_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT__PARAMS = TERM_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Term Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_OBJECT_FEATURE_COUNT = TERM_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermQueryParametersObjectImpl <em>Term Query Parameters Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermQueryParametersObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermQueryParametersObject()
   * @generated
   */
  int TERM_QUERY_PARAMETERS_OBJECT = 117;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_PARAMETERS_OBJECT__TERM = 0;

  /**
   * The feature id for the '<em><b>Boost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_PARAMETERS_OBJECT__BOOST = 1;

  /**
   * The number of structural features of the '<em>Term Query Parameters Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_QUERY_PARAMETERS_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsQueryImpl <em>Terms Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsQuery()
   * @generated
   */
  int TERMS_QUERY = 118;

  /**
   * The number of structural features of the '<em>Terms Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsQueryObjectImpl <em>Terms Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsQueryObject()
   * @generated
   */
  int TERMS_QUERY_OBJECT = 119;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_QUERY_OBJECT__FIELD_NAME = TERMS_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_QUERY_OBJECT__TERMS = TERMS_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Terms Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_QUERY_OBJECT_FEATURE_COUNT = TERMS_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryImpl <em>Top Children Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTopChildrenQuery()
   * @generated
   */
  int TOP_CHILDREN_QUERY = 120;

  /**
   * The number of structural features of the '<em>Top Children Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_CHILDREN_QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryObjectImpl <em>Top Children Query Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TopChildrenQueryObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTopChildrenQueryObject()
   * @generated
   */
  int TOP_CHILDREN_QUERY_OBJECT = 121;

  /**
   * The feature id for the '<em><b>Child Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_CHILDREN_QUERY_OBJECT__CHILD_TYPE = TOP_CHILDREN_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_CHILDREN_QUERY_OBJECT__QUERY = TOP_CHILDREN_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_CHILDREN_QUERY_OBJECT__PARAMS = TOP_CHILDREN_QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Top Children Query Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_CHILDREN_QUERY_OBJECT_FEATURE_COUNT = TOP_CHILDREN_QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.WildcardQueryImpl <em>Wildcard Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.WildcardQueryImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getWildcardQuery()
   * @generated
   */
  int WILDCARD_QUERY = 122;

  /**
   * The feature id for the '<em><b>Span Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_QUERY__SPAN_QUERY = MULTI_TERM_QUERY__SPAN_QUERY;

  /**
   * The feature id for the '<em><b>Multi Term Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_QUERY__MULTI_TERM_QUERY = MULTI_TERM_QUERY__MULTI_TERM_QUERY;

  /**
   * The number of structural features of the '<em>Wildcard Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_QUERY_FEATURE_COUNT = MULTI_TERM_QUERY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.AndFilterImpl <em>And Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.AndFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getAndFilter()
   * @generated
   */
  int AND_FILTER = 123;

  /**
   * The number of structural features of the '<em>And Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.SimpleAndFilterArrayImpl <em>Simple And Filter Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.SimpleAndFilterArrayImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getSimpleAndFilterArray()
   * @generated
   */
  int SIMPLE_AND_FILTER_ARRAY = 124;

  /**
   * The feature id for the '<em><b>Sub Filter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_FILTER_ARRAY__SUB_FILTER = AND_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple And Filter Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_FILTER_ARRAY_FEATURE_COUNT = AND_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.AndFilterObjectImpl <em>And Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.AndFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getAndFilterObject()
   * @generated
   */
  int AND_FILTER_OBJECT = 125;

  /**
   * The number of structural features of the '<em>And Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FILTER_OBJECT_FEATURE_COUNT = AND_FILTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolFilterImpl <em>Bool Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolFilter()
   * @generated
   */
  int BOOL_FILTER = 126;

  /**
   * The number of structural features of the '<em>Bool Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolFilterObjectImpl <em>Bool Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolFilterObject()
   * @generated
   */
  int BOOL_FILTER_OBJECT = 127;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FILTER_OBJECT__CLAUSE = BOOL_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FILTER_OBJECT_FEATURE_COUNT = BOOL_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoolFilterClauseImpl <em>Bool Filter Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoolFilterClauseImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoolFilterClause()
   * @generated
   */
  int BOOL_FILTER_CLAUSE = 128;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FILTER_CLAUSE__FILTER = 0;

  /**
   * The number of structural features of the '<em>Bool Filter Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FILTER_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterImpl <em>Geo Bounding Box Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoBoundingBoxFilter()
   * @generated
   */
  int GEO_BOUNDING_BOX_FILTER = 129;

  /**
   * The number of structural features of the '<em>Geo Bounding Box Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_BOUNDING_BOX_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterObjectImpl <em>Geo Bounding Box Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoBoundingBoxFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoBoundingBoxFilterObject()
   * @generated
   */
  int GEO_BOUNDING_BOX_FILTER_OBJECT = 130;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_BOUNDING_BOX_FILTER_OBJECT__FIELD_NAME = GEO_BOUNDING_BOX_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_BOUNDING_BOX_FILTER_OBJECT__BOUNDING_BOX = GEO_BOUNDING_BOX_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geo Bounding Box Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_BOUNDING_BOX_FILTER_OBJECT_FEATURE_COUNT = GEO_BOUNDING_BOX_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterImpl <em>Geo Distance Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceFilter()
   * @generated
   */
  int GEO_DISTANCE_FILTER = 131;

  /**
   * The number of structural features of the '<em>Geo Distance Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl <em>Geo Distance Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceFilterObject()
   * @generated
   */
  int GEO_DISTANCE_FILTER_OBJECT = 132;

  /**
   * The feature id for the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_OBJECT__DISTANCE = GEO_DISTANCE_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_OBJECT__FIELD_NAME = GEO_DISTANCE_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_OBJECT__POINT = GEO_DISTANCE_FILTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_OBJECT__PARAMS = GEO_DISTANCE_FILTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Geo Distance Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_FILTER_OBJECT_FEATURE_COUNT = GEO_DISTANCE_FILTER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterImpl <em>Geo Distance Range Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceRangeFilter()
   * @generated
   */
  int GEO_DISTANCE_RANGE_FILTER = 133;

  /**
   * The number of structural features of the '<em>Geo Distance Range Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl <em>Geo Distance Range Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoDistanceRangeFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoDistanceRangeFilterObject()
   * @generated
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT = 134;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT__FROM = GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT__TO = GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT__FIELD_NAME = GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT__POINT = GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Geo Distance Range Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_DISTANCE_RANGE_FILTER_OBJECT_FEATURE_COUNT = GEO_DISTANCE_RANGE_FILTER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoPolygonFilterImpl <em>Geo Polygon Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoPolygonFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoPolygonFilter()
   * @generated
   */
  int GEO_POLYGON_FILTER = 135;

  /**
   * The number of structural features of the '<em>Geo Polygon Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_POLYGON_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoPolygonFilterObjectImpl <em>Geo Polygon Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoPolygonFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoPolygonFilterObject()
   * @generated
   */
  int GEO_POLYGON_FILTER_OBJECT = 136;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_POLYGON_FILTER_OBJECT__FIELD_NAME = GEO_POLYGON_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Polygon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_POLYGON_FILTER_OBJECT__POLYGON = GEO_POLYGON_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geo Polygon Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_POLYGON_FILTER_OBJECT_FEATURE_COUNT = GEO_POLYGON_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeFilterImpl <em>Geo Shape Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoShapeFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoShapeFilter()
   * @generated
   */
  int GEO_SHAPE_FILTER = 137;

  /**
   * The number of structural features of the '<em>Geo Shape Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeFilterObjectImpl <em>Geo Shape Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoShapeFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoShapeFilterObject()
   * @generated
   */
  int GEO_SHAPE_FILTER_OBJECT = 138;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_FILTER_OBJECT__FIELD_NAME = GEO_SHAPE_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_FILTER_OBJECT__SHAPE = GEO_SHAPE_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geo Shape Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_FILTER_OBJECT_FEATURE_COUNT = GEO_SHAPE_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeohashCellFilterImpl <em>Geohash Cell Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeohashCellFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeohashCellFilter()
   * @generated
   */
  int GEOHASH_CELL_FILTER = 139;

  /**
   * The number of structural features of the '<em>Geohash Cell Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOHASH_CELL_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeohashCellFilterObjectImpl <em>Geohash Cell Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeohashCellFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeohashCellFilterObject()
   * @generated
   */
  int GEOHASH_CELL_FILTER_OBJECT = 140;

  /**
   * The number of structural features of the '<em>Geohash Cell Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOHASH_CELL_FILTER_OBJECT_FEATURE_COUNT = GEOHASH_CELL_FILTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasChildFilterImpl <em>Has Child Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasChildFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasChildFilter()
   * @generated
   */
  int HAS_CHILD_FILTER = 141;

  /**
   * The number of structural features of the '<em>Has Child Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasChildFilterObjectImpl <em>Has Child Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasChildFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasChildFilterObject()
   * @generated
   */
  int HAS_CHILD_FILTER_OBJECT = 142;

  /**
   * The feature id for the '<em><b>Child Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_FILTER_OBJECT__CHILD_TYPE = HAS_CHILD_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_FILTER_OBJECT__QUERY = HAS_CHILD_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_FILTER_OBJECT__FILTER = HAS_CHILD_FILTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Child Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CHILD_FILTER_OBJECT_FEATURE_COUNT = HAS_CHILD_FILTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasParentFilterImpl <em>Has Parent Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasParentFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasParentFilter()
   * @generated
   */
  int HAS_PARENT_FILTER = 143;

  /**
   * The number of structural features of the '<em>Has Parent Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.HasParentFilterObjectImpl <em>Has Parent Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.HasParentFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getHasParentFilterObject()
   * @generated
   */
  int HAS_PARENT_FILTER_OBJECT = 144;

  /**
   * The feature id for the '<em><b>Parent Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_FILTER_OBJECT__PARENT_TYPE = HAS_PARENT_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_FILTER_OBJECT__QUERY = HAS_PARENT_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_FILTER_OBJECT__FILTER = HAS_PARENT_FILTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Parent Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_PARENT_FILTER_OBJECT_FEATURE_COUNT = HAS_PARENT_FILTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.IndicesFilterImpl <em>Indices Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.IndicesFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getIndicesFilter()
   * @generated
   */
  int INDICES_FILTER = 145;

  /**
   * The number of structural features of the '<em>Indices Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.IndicesFilterObjectImpl <em>Indices Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.IndicesFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getIndicesFilterObject()
   * @generated
   */
  int INDICES_FILTER_OBJECT = 146;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_FILTER_OBJECT__FILTER = INDICES_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>No Match Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_FILTER_OBJECT__NO_MATCH_FILTER = INDICES_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indices Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDICES_FILTER_OBJECT_FEATURE_COUNT = INDICES_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NestedFilterImpl <em>Nested Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NestedFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNestedFilter()
   * @generated
   */
  int NESTED_FILTER = 147;

  /**
   * The number of structural features of the '<em>Nested Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NestedFilterObjectImpl <em>Nested Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NestedFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNestedFilterObject()
   * @generated
   */
  int NESTED_FILTER_OBJECT = 148;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_OBJECT__PATH = NESTED_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_OBJECT__FILTER = NESTED_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_OBJECT_FEATURE_COUNT = NESTED_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NotFilterImpl <em>Not Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NotFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNotFilter()
   * @generated
   */
  int NOT_FILTER = 149;

  /**
   * The number of structural features of the '<em>Not Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.NotFilterObjectImpl <em>Not Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.NotFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getNotFilterObject()
   * @generated
   */
  int NOT_FILTER_OBJECT = 150;

  /**
   * The number of structural features of the '<em>Not Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FILTER_OBJECT_FEATURE_COUNT = NOT_FILTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.OrFilterImpl <em>Or Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.OrFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getOrFilter()
   * @generated
   */
  int OR_FILTER = 151;

  /**
   * The number of structural features of the '<em>Or Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.OrFilterArrayImpl <em>Or Filter Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.OrFilterArrayImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getOrFilterArray()
   * @generated
   */
  int OR_FILTER_ARRAY = 152;

  /**
   * The feature id for the '<em><b>Sub Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FILTER_ARRAY__SUB_QUERY = OR_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Filter Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FILTER_ARRAY_FEATURE_COUNT = OR_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PrefixFilterImpl <em>Prefix Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PrefixFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPrefixFilter()
   * @generated
   */
  int PREFIX_FILTER = 153;

  /**
   * The number of structural features of the '<em>Prefix Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PrefixFilterObjectImpl <em>Prefix Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PrefixFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPrefixFilterObject()
   * @generated
   */
  int PREFIX_FILTER_OBJECT = 154;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FILTER_OBJECT__FIELD_NAME = PREFIX_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FILTER_OBJECT__PREFIX = PREFIX_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Prefix Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FILTER_OBJECT_FEATURE_COUNT = PREFIX_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeFilterImpl <em>Range Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeFilter()
   * @generated
   */
  int RANGE_FILTER = 157;

  /**
   * The number of structural features of the '<em>Range Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeFilterObjectImpl <em>Range Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeFilterObject()
   * @generated
   */
  int RANGE_FILTER_OBJECT = 158;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_OBJECT__FIELD_NAME = RANGE_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_OBJECT__PARAMS = RANGE_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_OBJECT_FEATURE_COUNT = RANGE_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RangeFilterParametersObjectImpl <em>Range Filter Parameters Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RangeFilterParametersObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRangeFilterParametersObject()
   * @generated
   */
  int RANGE_FILTER_PARAMETERS_OBJECT = 159;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_PARAMETERS_OBJECT__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Range Filter Parameters Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FILTER_PARAMETERS_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpFilterImpl <em>Regexp Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpFilter()
   * @generated
   */
  int REGEXP_FILTER = 160;

  /**
   * The number of structural features of the '<em>Regexp Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpFilterObjectImpl <em>Regexp Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpFilterObject()
   * @generated
   */
  int REGEXP_FILTER_OBJECT = 161;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_OBJECT__FIELD_NAME = REGEXP_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Regexp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_OBJECT__REGEXP = REGEXP_FILTER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_OBJECT__PARAMS = REGEXP_FILTER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Regexp Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_OBJECT_FEATURE_COUNT = REGEXP_FILTER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.RegexpFilterParameterObjectImpl <em>Regexp Filter Parameter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.RegexpFilterParameterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getRegexpFilterParameterObject()
   * @generated
   */
  int REGEXP_FILTER_PARAMETER_OBJECT = 162;

  /**
   * The feature id for the '<em><b>Regexp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_PARAMETER_OBJECT__REGEXP = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_PARAMETER_OBJECT__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Regexp Filter Parameter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEXP_FILTER_PARAMETER_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ScriptFilterImpl <em>Script Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ScriptFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getScriptFilter()
   * @generated
   */
  int SCRIPT_FILTER = 163;

  /**
   * The number of structural features of the '<em>Script Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ScriptFilterObjectImpl <em>Script Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ScriptFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getScriptFilterObject()
   * @generated
   */
  int SCRIPT_FILTER_OBJECT = 164;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FILTER_OBJECT__SCRIPT = SCRIPT_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FILTER_OBJECT__PARAMS = SCRIPT_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Script Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FILTER_OBJECT_FEATURE_COUNT = SCRIPT_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermFilterImpl <em>Term Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermFilter()
   * @generated
   */
  int TERM_FILTER = 165;

  /**
   * The number of structural features of the '<em>Term Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermFilterObjectImpl <em>Term Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermFilterObject()
   * @generated
   */
  int TERM_FILTER_OBJECT = 166;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER_OBJECT__FIELD_NAME = TERM_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER_OBJECT__TERM = TERM_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Term Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER_OBJECT_FEATURE_COUNT = TERM_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsFilterImpl <em>Terms Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsFilter()
   * @generated
   */
  int TERMS_FILTER = 167;

  /**
   * The number of structural features of the '<em>Terms Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TermsFilterObjectImpl <em>Terms Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TermsFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTermsFilterObject()
   * @generated
   */
  int TERMS_FILTER_OBJECT = 168;

  /**
   * The feature id for the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FILTER_OBJECT__FIELD_NAME = TERMS_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FILTER_OBJECT__TERMS = TERMS_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Terms Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FILTER_OBJECT_FEATURE_COUNT = TERMS_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TypeFilterImpl <em>Type Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TypeFilterImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTypeFilter()
   * @generated
   */
  int TYPE_FILTER = 169;

  /**
   * The number of structural features of the '<em>Type Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FILTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TypeFilterObjectImpl <em>Type Filter Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TypeFilterObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTypeFilterObject()
   * @generated
   */
  int TYPE_FILTER_OBJECT = 170;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FILTER_OBJECT__TYPE = TYPE_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Filter Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FILTER_OBJECT_FEATURE_COUNT = TYPE_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeObjectImpl <em>Geo Shape Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoShapeObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoShapeObject()
   * @generated
   */
  int GEO_SHAPE_OBJECT = 171;

  /**
   * The number of structural features of the '<em>Geo Shape Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeImpl <em>Geo Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.GeoShapeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getGeoShape()
   * @generated
   */
  int GEO_SHAPE = 172;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE__SHAPE = GEO_SHAPE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indexed Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE__INDEXED_SHAPE = GEO_SHAPE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geo Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEO_SHAPE_FEATURE_COUNT = GEO_SHAPE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.PolygonImpl <em>Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.PolygonImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getPolygon()
   * @generated
   */
  int POLYGON = 173;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__POINTS = 0;

  /**
   * The number of structural features of the '<em>Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.BoundingBoxObjectImpl <em>Bounding Box Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.BoundingBoxObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getBoundingBoxObject()
   * @generated
   */
  int BOUNDING_BOX_OBJECT = 174;

  /**
   * The feature id for the '<em><b>Two Point Bounding Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDING_BOX_OBJECT__TWO_POINT_BOUNDING_BOX = 0;

  /**
   * The feature id for the '<em><b>Vertices Bounding Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDING_BOX_OBJECT__VERTICES_BOUNDING_BOX = 1;

  /**
   * The number of structural features of the '<em>Bounding Box Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUNDING_BOX_OBJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.TwoPointBoundingBoxImpl <em>Two Point Bounding Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.TwoPointBoundingBoxImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getTwoPointBoundingBox()
   * @generated
   */
  int TWO_POINT_BOUNDING_BOX = 175;

  /**
   * The feature id for the '<em><b>Top Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_POINT_BOUNDING_BOX__TOP_LEFT = 0;

  /**
   * The feature id for the '<em><b>Bottom Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_POINT_BOUNDING_BOX__BOTTOM_RIGHT = 1;

  /**
   * The number of structural features of the '<em>Two Point Bounding Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_POINT_BOUNDING_BOX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.LatLonImpl <em>Lat Lon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.LatLonImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getLatLon()
   * @generated
   */
  int LAT_LON = 176;

  /**
   * The feature id for the '<em><b>Lat Lon Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON__LAT_LON_OBJECT = GEOHASH_CELL_FILTER_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lat Lon Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON__LAT_LON_ARRAY = GEOHASH_CELL_FILTER_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lat Lon String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON__LAT_LON_STRING = GEOHASH_CELL_FILTER_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Lat Lon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_FEATURE_COUNT = GEOHASH_CELL_FILTER_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.LatLonArrayImpl <em>Lat Lon Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.LatLonArrayImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getLatLonArray()
   * @generated
   */
  int LAT_LON_ARRAY = 177;

  /**
   * The feature id for the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_ARRAY__LON = 0;

  /**
   * The feature id for the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_ARRAY__LAT = 1;

  /**
   * The number of structural features of the '<em>Lat Lon Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_ARRAY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.LatLonStringImpl <em>Lat Lon String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.LatLonStringImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getLatLonString()
   * @generated
   */
  int LAT_LON_STRING = 178;

  /**
   * The feature id for the '<em><b>Lat Lon Or Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_STRING__LAT_LON_OR_HASH = 0;

  /**
   * The number of structural features of the '<em>Lat Lon String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_LON_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShapeObjectImpl <em>Shape Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShapeObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShapeObject()
   * @generated
   */
  int SHAPE_OBJECT = 179;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_OBJECT__SHAPE = 0;

  /**
   * The number of structural features of the '<em>Shape Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShapeImpl <em>Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShapeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShape()
   * @generated
   */
  int SHAPE = 180;

  /**
   * The number of structural features of the '<em>Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShapeTypeImpl <em>Shape Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShapeTypeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShapeType()
   * @generated
   */
  int SHAPE_TYPE = 181;

  /**
   * The number of structural features of the '<em>Shape Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_TYPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ShapeTypeEnvelopeImpl <em>Shape Type Envelope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ShapeTypeEnvelopeImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getShapeTypeEnvelope()
   * @generated
   */
  int SHAPE_TYPE_ENVELOPE = 182;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_TYPE_ENVELOPE__POINTS = SHAPE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shape Type Envelope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_TYPE_ENVELOPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ObjectImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 183;

  /**
   * The feature id for the '<em><b>Facet Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FACET_TYPE = TERMS_STATS_FACET__FACET_TYPE;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__MEMBERS = TERMS_STATS_FACET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = TERMS_STATS_FACET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.MemberImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 184;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ValueImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getValue()
   * @generated
   */
  int VALUE = 185;

  /**
   * The feature id for the '<em><b>Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__OBJECT = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STRING = 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ARRAY = 2;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__BOOL = 3;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NULL = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NUMBER = 5;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.first8.elasticsearch.dsl.search.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.first8.elasticsearch.dsl.search.impl.ArrayImpl
   * @see com.first8.elasticsearch.dsl.search.impl.SearchPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 186;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUES = 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SearchDSL <em>DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL
   * @generated
   */
  EClass getSearchDSL();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getFields()
   * @see #getSearchDSL()
   * @generated
   */
  EReference getSearchDSL_Fields();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getFrom()
   * @see #getSearchDSL()
   * @generated
   */
  EAttribute getSearchDSL_From();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getSize()
   * @see #getSearchDSL()
   * @generated
   */
  EAttribute getSearchDSL_Size();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getSort()
   * @see #getSearchDSL()
   * @generated
   */
  EReference getSearchDSL_Sort();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getQuery()
   * @see #getSearchDSL()
   * @generated
   */
  EReference getSearchDSL_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facets</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getFacets()
   * @see #getSearchDSL()
   * @generated
   */
  EReference getSearchDSL_Facets();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchDSL#getStats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stats</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchDSL#getStats()
   * @see #getSearchDSL()
   * @generated
   */
  EReference getSearchDSL_Stats();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SearchField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField
   * @generated
   */
  EClass getSearchField();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchField#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getFields()
   * @see #getSearchField()
   * @generated
   */
  EReference getSearchField_Fields();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SearchField#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getFrom()
   * @see #getSearchField()
   * @generated
   */
  EAttribute getSearchField_From();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SearchField#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getSize()
   * @see #getSearchField()
   * @generated
   */
  EAttribute getSearchField_Size();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchField#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getSort()
   * @see #getSearchField()
   * @generated
   */
  EReference getSearchField_Sort();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchField#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getQuery()
   * @see #getSearchField()
   * @generated
   */
  EReference getSearchField_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchField#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facets</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getFacets()
   * @see #getSearchField()
   * @generated
   */
  EReference getSearchField_Facets();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SearchField#getStats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stats</em>'.
   * @see com.first8.elasticsearch.dsl.search.SearchField#getStats()
   * @see #getSearchField()
   * @generated
   */
  EReference getSearchField_Stats();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Stats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stats</em>'.
   * @see com.first8.elasticsearch.dsl.search.Stats
   * @generated
   */
  EClass getStats();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.Stats#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Groups</em>'.
   * @see com.first8.elasticsearch.dsl.search.Stats#getGroups()
   * @see #getStats()
   * @generated
   */
  EAttribute getStats_Groups();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort</em>'.
   * @see com.first8.elasticsearch.dsl.search.Sort
   * @generated
   */
  EClass getSort();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.Sort#getSortvalues <em>Sortvalues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sortvalues</em>'.
   * @see com.first8.elasticsearch.dsl.search.Sort#getSortvalues()
   * @see #getSort()
   * @generated
   */
  EReference getSort_Sortvalues();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SortValue <em>Sort Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortValue
   * @generated
   */
  EClass getSortValue();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortFieldName <em>Sort Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortValue#getSortFieldName()
   * @see #getSortValue()
   * @generated
   */
  EAttribute getSortValue_SortFieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortShortObject <em>Sort Short Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort Short Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortValue#getSortShortObject()
   * @see #getSortValue()
   * @generated
   */
  EReference getSortValue_SortShortObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortObject <em>Sort Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortValue#getSortObject()
   * @see #getSortValue()
   * @generated
   */
  EReference getSortValue_SortObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SortValue#getSortByScore <em>Sort By Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort By Score</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortValue#getSortByScore()
   * @see #getSortValue()
   * @generated
   */
  EAttribute getSortValue_SortByScore();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ShortSortOject <em>Short Sort Oject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Sort Oject</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShortSortOject
   * @generated
   */
  EClass getShortSortOject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getSortFieldName <em>Sort Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShortSortOject#getSortFieldName()
   * @see #getShortSortOject()
   * @generated
   */
  EAttribute getShortSortOject_SortFieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.ShortSortOject#getAscDesc <em>Asc Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Asc Desc</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShortSortOject#getAscDesc()
   * @see #getShortSortOject()
   * @generated
   */
  EReference getShortSortOject_AscDesc();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SortObject <em>Sort Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObject
   * @generated
   */
  EClass getSortObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SortObject#getSortFieldName <em>Sort Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObject#getSortFieldName()
   * @see #getSortObject()
   * @generated
   */
  EAttribute getSortObject_SortFieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SortObject#getSortProperties <em>Sort Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort Properties</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObject#getSortProperties()
   * @see #getSortObject()
   * @generated
   */
  EReference getSortObject_SortProperties();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject <em>Sort Object Properties Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Object Properties Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject
   * @generated
   */
  EClass getSortObjectPropertiesObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject#getSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sort</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectPropertiesObject#getSort()
   * @see #getSortObjectPropertiesObject()
   * @generated
   */
  EReference getSortObjectPropertiesObject_Sort();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty <em>Sort Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Object Property</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectProperty
   * @generated
   */
  EClass getSortObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectProperty#getOrder()
   * @see #getSortObjectProperty()
   * @generated
   */
  EReference getSortObjectProperty_Order();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getSortMode <em>Sort Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sort Mode</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectProperty#getSortMode()
   * @see #getSortObjectProperty()
   * @generated
   */
  EReference getSortObjectProperty_SortMode();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SortObjectProperty#getMissing <em>Missing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Missing</em>'.
   * @see com.first8.elasticsearch.dsl.search.SortObjectProperty#getMissing()
   * @see #getSortObjectProperty()
   * @generated
   */
  EAttribute getSortObjectProperty_Missing();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SORT_MODE <em>SORT MODE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SORT MODE</em>'.
   * @see com.first8.elasticsearch.dsl.search.SORT_MODE
   * @generated
   */
  EClass getSORT_MODE();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SORT_MODE#getSortMode <em>Sort Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort Mode</em>'.
   * @see com.first8.elasticsearch.dsl.search.SORT_MODE#getSortMode()
   * @see #getSORT_MODE()
   * @generated
   */
  EAttribute getSORT_MODE_SortMode();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ASC_DESC <em>ASC DESC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASC DESC</em>'.
   * @see com.first8.elasticsearch.dsl.search.ASC_DESC
   * @generated
   */
  EClass getASC_DESC();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ASC_DESC#getAscDesc <em>Asc Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asc Desc</em>'.
   * @see com.first8.elasticsearch.dsl.search.ASC_DESC#getAscDesc()
   * @see #getASC_DESC()
   * @generated
   */
  EAttribute getASC_DESC_AscDesc();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.Fields
   * @generated
   */
  EClass getFields();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Fields#getSelectfields <em>Selectfields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selectfields</em>'.
   * @see com.first8.elasticsearch.dsl.search.Fields#getSelectfields()
   * @see #getFields()
   * @generated
   */
  EReference getFields_Selectfields();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Query#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.Query#getQuery()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Query();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Filter#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.Filter#getFilter()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FilterObject <em>Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterObject
   * @generated
   */
  EClass getFilterObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FilterType <em>Filter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType
   * @generated
   */
  EClass getFilterType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>And</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getAnd()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_And();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getBool()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Bool();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FilterType#getExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getExists()
   * @see #getFilterType()
   * @generated
   */
  EAttribute getFilterType_Exists();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoBoundingBox <em>Geo Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Bounding Box</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoBoundingBox()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoBoundingBox();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistance <em>Geo Distance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Distance</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoDistance()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoDistance();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoDistanceRange <em>Geo Distance Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Distance Range</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoDistanceRange()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoDistanceRange();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoPolygon <em>Geo Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Polygon</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoPolygon()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoPolygon();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoShape <em>Geo Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoShape()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoShape();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getGeoHashCell <em>Geo Hash Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geo Hash Cell</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getGeoHashCell()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_GeoHashCell();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getHasChild <em>Has Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Child</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getHasChild()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_HasChild();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getHasParent <em>Has Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Parent</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getHasParent()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_HasParent();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FilterType#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ids</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getIds()
   * @see #getFilterType()
   * @generated
   */
  EAttribute getFilterType_Ids();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Indices</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getIndices()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Indices();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FilterType#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Limit</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getLimit()
   * @see #getFilterType()
   * @generated
   */
  EAttribute getFilterType_Limit();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FilterType#getMatchAll <em>Match All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match All</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getMatchAll()
   * @see #getFilterType()
   * @generated
   */
  EAttribute getFilterType_MatchAll();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FilterType#getMissing <em>Missing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Missing</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getMissing()
   * @see #getFilterType()
   * @generated
   */
  EAttribute getFilterType_Missing();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getNested()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Nested();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Not</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getNot()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Not();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Or</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getOr()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Or();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getPrefix()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getQuery()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getRegexp <em>Regexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Regexp</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getRegexp()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Regexp();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getScript()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Script();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getTerm()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Term();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getTerms()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Terms();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilterType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterType#getType()
   * @see #getFilterType()
   * @generated
   */
  EReference getFilterType_Type();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryObject <em>Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryObject
   * @generated
   */
  EClass getQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryObject#getQueryType <em>Query Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryObject#getQueryType()
   * @see #getQueryObject()
   * @generated
   */
  EReference getQueryObject_QueryType();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryType <em>Query Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType
   * @generated
   */
  EClass getQueryType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getMatch()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Match();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getMultiMatch <em>Multi Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multi Match</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getMultiMatch()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_MultiMatch();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getBool()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Bool();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getCommon <em>Common</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Common</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getCommon()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Common();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getConstantScore <em>Constant Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant Score</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getConstantScore()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_ConstantScore();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getDisMax <em>Dis Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dis Max</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getDisMax()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_DisMax();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getFiltered <em>Filtered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filtered</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getFiltered()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Filtered();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThis <em>Fuzzy Like This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fuzzy Like This</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThis()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_FuzzyLikeThis();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThisField <em>Fuzzy Like This Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fuzzy Like This Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getFuzzyLikeThisField()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_FuzzyLikeThisField();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getGeoshape <em>Geoshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geoshape</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getGeoshape()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Geoshape();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getHasChild <em>Has Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Child</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getHasChild()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_HasChild();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getHasParent <em>Has Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Parent</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getHasParent()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_HasParent();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.QueryType#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ids</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getIds()
   * @see #getQueryType()
   * @generated
   */
  EAttribute getQueryType_Ids();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Indices</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getIndices()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Indices();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.QueryType#getMatchAll <em>Match All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match All</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getMatchAll()
   * @see #getQueryType()
   * @generated
   */
  EAttribute getQueryType_MatchAll();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThis <em>More Like This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>More Like This</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThis()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_MoreLikeThis();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThisField <em>More Like This Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>More Like This Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getMoreLikeThisField()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_MoreLikeThisField();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getNested()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Nested();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getQueryString <em>Query String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query String</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getQueryString()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_QueryString();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSimpleQuery <em>Simple Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSimpleQuery()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SimpleQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanFirst <em>Span First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span First</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanFirst()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanFirst();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanMulti <em>Span Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Multi</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanMulti()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanMulti();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNear <em>Span Near</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Near</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanNear()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanNear();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanNot <em>Span Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Not</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanNot()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanNot();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanOr <em>Span Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Or</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanOr()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanOr();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getSpanTerm <em>Span Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getSpanTerm()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_SpanTerm();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getFuzzy <em>Fuzzy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fuzzy</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getFuzzy()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Fuzzy();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getPrefix()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getTerm()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Term();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getRange()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Range();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getRegexp <em>Regexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Regexp</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getRegexp()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Regexp();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wildcard</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getWildcard()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Wildcard();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getTerms()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_Terms();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.QueryType#getTopChildren <em>Top Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top Children</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryType#getTopChildren()
   * @see #getQueryType()
   * @generated
   */
  EReference getQueryType_TopChildren();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanQuery <em>Span Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanQuery
   * @generated
   */
  EClass getSpanQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SpanQuery#getSpanQuery <em>Span Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Span Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanQuery#getSpanQuery()
   * @see #getSpanQuery()
   * @generated
   */
  EReference getSpanQuery_SpanQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MultiTermQuery <em>Multi Term Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Term Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiTermQuery
   * @generated
   */
  EClass getMultiTermQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.MultiTermQuery#getMultiTermQuery <em>Multi Term Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multi Term Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiTermQuery#getMultiTermQuery()
   * @see #getMultiTermQuery()
   * @generated
   */
  EReference getMultiTermQuery_MultiTermQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Facets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facets</em>'.
   * @see com.first8.elasticsearch.dsl.search.Facets
   * @generated
   */
  EClass getFacets();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FacetsObject <em>Facets Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facets Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetsObject
   * @generated
   */
  EClass getFacetsObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FacetsObject#getFacetName <em>Facet Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Facet Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetsObject#getFacetName()
   * @see #getFacetsObject()
   * @generated
   */
  EAttribute getFacetsObject_FacetName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FacetsObject#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetsObject#getConfig()
   * @see #getFacetsObject()
   * @generated
   */
  EReference getFacetsObject_Config();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.FacetsObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetsObject#getParams()
   * @see #getFacetsObject()
   * @generated
   */
  EReference getFacetsObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FacetTypeObject <em>Facet Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Type Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetTypeObject
   * @generated
   */
  EClass getFacetTypeObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FacetTypeObject#getFacetType <em>Facet Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facet Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetTypeObject#getFacetType()
   * @see #getFacetTypeObject()
   * @generated
   */
  EReference getFacetTypeObject_FacetType();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FacetType <em>Facet Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetType
   * @generated
   */
  EClass getFacetType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FacetType#getFacetType <em>Facet Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facet Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetType#getFacetType()
   * @see #getFacetType()
   * @generated
   */
  EReference getFacetType_FacetType();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacet <em>Geo Distance Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacet
   * @generated
   */
  EClass getGeoDistanceFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject <em>Geo Distance Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject
   * @generated
   */
  EClass getGeoDistanceFacetObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject#getFieldName()
   * @see #getGeoDistanceFacetObject()
   * @generated
   */
  EAttribute getGeoDistanceFacetObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFacetObject#getPoint()
   * @see #getGeoDistanceFacetObject()
   * @generated
   */
  EReference getGeoDistanceFacetObject_Point();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsStatsFacet <em>Terms Stats Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Stats Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsStatsFacet
   * @generated
   */
  EClass getTermsStatsFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.StatisticalFacet <em>Statistical Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statistical Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacet
   * @generated
   */
  EClass getStatisticalFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject <em>Statistical Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statistical Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacetObject
   * @generated
   */
  EClass getStatisticalFacetObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getField()
   * @see #getStatisticalFacetObject()
   * @generated
   */
  EAttribute getStatisticalFacetObject_Field();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getScript()
   * @see #getStatisticalFacetObject()
   * @generated
   */
  EReference getStatisticalFacetObject_Script();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.StatisticalFacetObject#getFields()
   * @see #getStatisticalFacetObject()
   * @generated
   */
  EAttribute getStatisticalFacetObject_Fields();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryFacet <em>Query Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryFacet
   * @generated
   */
  EClass getQueryFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FilterFacet <em>Filter Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilterFacet
   * @generated
   */
  EClass getFilterFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacet <em>Date Histogram Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Histogram Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacet
   * @generated
   */
  EClass getDateHistogramFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacetObject <em>Date Histogram Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Histogram Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacetObject
   * @generated
   */
  EClass getDateHistogramFacetObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getField()
   * @see #getDateHistogramFacetObject()
   * @generated
   */
  EAttribute getDateHistogramFacetObject_Field();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getKeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getKeyValue()
   * @see #getDateHistogramFacetObject()
   * @generated
   */
  EReference getDateHistogramFacetObject_KeyValue();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getKeyValueScript <em>Key Value Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.DateHistogramFacetObject#getKeyValueScript()
   * @see #getDateHistogramFacetObject()
   * @generated
   */
  EReference getDateHistogramFacetObject_KeyValueScript();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HistogramFacet <em>Histogram Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Histogram Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacet
   * @generated
   */
  EClass getHistogramFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject <em>Histogram Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Histogram Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacetObject
   * @generated
   */
  EClass getHistogramFacetObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacetObject#getField()
   * @see #getHistogramFacetObject()
   * @generated
   */
  EAttribute getHistogramFacetObject_Field();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValue()
   * @see #getHistogramFacetObject()
   * @generated
   */
  EReference getHistogramFacetObject_KeyValue();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValueScript <em>Key Value Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.HistogramFacetObject#getKeyValueScript()
   * @see #getHistogramFacetObject()
   * @generated
   */
  EReference getHistogramFacetObject_KeyValueScript();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeFacet <em>Range Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFacet
   * @generated
   */
  EClass getRangeFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeFacetObject <em>Range Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFacetObject
   * @generated
   */
  EClass getRangeFacetObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RangeFacetObject#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFacetObject#getField()
   * @see #getRangeFacetObject()
   * @generated
   */
  EAttribute getRangeFacetObject_Field();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RangeFacetObject#getKeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFacetObject#getKeyValue()
   * @see #getRangeFacetObject()
   * @generated
   */
  EReference getRangeFacetObject_KeyValue();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RangeFacetObject#getKeyValueScript <em>Key Value Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Value Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFacetObject#getKeyValueScript()
   * @see #getRangeFacetObject()
   * @generated
   */
  EReference getRangeFacetObject_KeyValueScript();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.KeyValueField <em>Key Value Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueField
   * @generated
   */
  EClass getKeyValueField();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.KeyValueField#getKeyField <em>Key Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueField#getKeyField()
   * @see #getKeyValueField()
   * @generated
   */
  EAttribute getKeyValueField_KeyField();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.KeyValueField#getValueField <em>Value Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueField#getValueField()
   * @see #getKeyValueField()
   * @generated
   */
  EAttribute getKeyValueField_ValueField();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.KeyValueScript <em>Key Value Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueScript
   * @generated
   */
  EClass getKeyValueScript();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getKeyScript <em>Key Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueScript#getKeyScript()
   * @see #getKeyValueScript()
   * @generated
   */
  EAttribute getKeyValueScript_KeyScript();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.KeyValueScript#getValueScript <em>Value Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.KeyValueScript#getValueScript()
   * @see #getKeyValueScript()
   * @generated
   */
  EAttribute getKeyValueScript_ValueScript();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsFacet <em>Terms Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Facet</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacet
   * @generated
   */
  EClass getTermsFacet();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsFacetObject <em>Terms Facet Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Facet Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetObject
   * @generated
   */
  EClass getTermsFacetObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.TermsFacetObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetObject#getParams()
   * @see #getTermsFacetObject()
   * @generated
   */
  EReference getTermsFacetObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter <em>Terms Facet Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Facet Parameter</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter
   * @generated
   */
  EClass getTermsFacetParameter();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getField()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_Field();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getFields()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_Fields();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getSize()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_Size();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getOrder()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_Order();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getAllTerms <em>All Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>All Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getAllTerms()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EReference getTermsFacetParameter_AllTerms();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getExclude <em>Exclude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getExclude()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EReference getTermsFacetParameter_Exclude();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regex</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegex()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_Regex();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegexFlags <em>Regex Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regex Flags</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getRegexFlags()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EAttribute getTermsFacetParameter_RegexFlags();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScript()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EReference getTermsFacetParameter_Script();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScriptField <em>Script Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Script Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFacetParameter#getScriptField()
   * @see #getTermsFacetParameter()
   * @generated
   */
  EReference getTermsFacetParameter_ScriptField();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FacetParameter <em>Facet Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Parameter</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetParameter
   * @generated
   */
  EClass getFacetParameter();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getGlobal <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Global</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetParameter#getGlobal()
   * @see #getFacetParameter()
   * @generated
   */
  EAttribute getFacetParameter_Global();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getFaceFilter <em>Face Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Face Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetParameter#getFaceFilter()
   * @see #getFacetParameter()
   * @generated
   */
  EReference getFacetParameter_FaceFilter();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FacetParameter#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nested</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetParameter#getNested()
   * @see #getFacetParameter()
   * @generated
   */
  EAttribute getFacetParameter_Nested();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FacetFilterParam <em>Facet Filter Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Filter Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.FacetFilterParam
   * @generated
   */
  EClass getFacetFilterParam();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.AllTermsParam <em>All Terms Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>All Terms Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.AllTermsParam
   * @generated
   */
  EClass getAllTermsParam();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.AllTermsParam#getAllTerms <em>All Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.AllTermsParam#getAllTerms()
   * @see #getAllTermsParam()
   * @generated
   */
  EAttribute getAllTermsParam_AllTerms();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ExcludeParam <em>Exclude Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclude Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.ExcludeParam
   * @generated
   */
  EClass getExcludeParam();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.ExcludeParam#getExcludeFieldNames <em>Exclude Field Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exclude Field Names</em>'.
   * @see com.first8.elasticsearch.dsl.search.ExcludeParam#getExcludeFieldNames()
   * @see #getExcludeParam()
   * @generated
   */
  EAttribute getExcludeParam_ExcludeFieldNames();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ScriptParam <em>Script Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptParam
   * @generated
   */
  EClass getScriptParam();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ScriptParam#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptParam#getScript()
   * @see #getScriptParam()
   * @generated
   */
  EAttribute getScriptParam_Script();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ScriptFieldParam <em>Script Field Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Field Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFieldParam
   * @generated
   */
  EClass getScriptFieldParam();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ScriptFieldParam#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFieldParam#getFieldName()
   * @see #getScriptFieldParam()
   * @generated
   */
  EAttribute getScriptFieldParam_FieldName();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.LikeTextParam <em>Like Text Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Like Text Param</em>'.
   * @see com.first8.elasticsearch.dsl.search.LikeTextParam
   * @generated
   */
  EClass getLikeTextParam();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.LikeTextParam#getLikeQuery <em>Like Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Like Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.LikeTextParam#getLikeQuery()
   * @see #getLikeTextParam()
   * @generated
   */
  EAttribute getLikeTextParam_LikeQuery();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.LikeTextParam#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.LikeTextParam#getParams()
   * @see #getLikeTextParam()
   * @generated
   */
  EAttribute getLikeTextParam_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MatchQuery <em>Match Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQuery
   * @generated
   */
  EClass getMatchQuery();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.MatchQuery#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQuery#getFieldName()
   * @see #getMatchQuery()
   * @generated
   */
  EAttribute getMatchQuery_FieldName();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ShortMatchQueryObject <em>Short Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Match Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShortMatchQueryObject
   * @generated
   */
  EClass getShortMatchQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ShortMatchQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShortMatchQueryObject#getQuery()
   * @see #getShortMatchQueryObject()
   * @generated
   */
  EAttribute getShortMatchQueryObject_Query();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MatchQueryObject <em>Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryObject
   * @generated
   */
  EClass getMatchQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.MatchQueryObject#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryObject#getParameters()
   * @see #getMatchQueryObject()
   * @generated
   */
  EReference getMatchQueryObject_Parameters();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MatchQueryParametersObject <em>Match Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Query Parameters Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryParametersObject
   * @generated
   */
  EClass getMatchQueryParametersObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.MatchQueryParametersObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryParametersObject#getQuery()
   * @see #getMatchQueryParametersObject()
   * @generated
   */
  EAttribute getMatchQueryParametersObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.MatchQueryParametersObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.MatchQueryParametersObject#getParams()
   * @see #getMatchQueryParametersObject()
   * @generated
   */
  EAttribute getMatchQueryParametersObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MultiMatchQuery <em>Multi Match Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Match Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQuery
   * @generated
   */
  EClass getMultiMatchQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MultiMatchQueryObject <em>Multi Match Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Match Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQueryObject
   * @generated
   */
  EClass getMultiMatchQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.MultiMatchQueryObject#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQueryObject#getFields()
   * @see #getMultiMatchQueryObject()
   * @generated
   */
  EAttribute getMultiMatchQueryObject_Fields();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.MultiMatchQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.MultiMatchQueryObject#getParams()
   * @see #getMultiMatchQueryObject()
   * @generated
   */
  EAttribute getMultiMatchQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolQuery <em>Bool Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolQuery
   * @generated
   */
  EClass getBoolQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolQueryObject <em>Bool Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolQueryObject
   * @generated
   */
  EClass getBoolQueryObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.BoolQueryObject#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clause</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolQueryObject#getClause()
   * @see #getBoolQueryObject()
   * @generated
   */
  EReference getBoolQueryObject_Clause();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.BoolQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolQueryObject#getParams()
   * @see #getBoolQueryObject()
   * @generated
   */
  EAttribute getBoolQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolClause <em>Bool Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Clause</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolClause
   * @generated
   */
  EClass getBoolClause();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.BoolClause#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolClause#getQuery()
   * @see #getBoolClause()
   * @generated
   */
  EReference getBoolClause_Query();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.CommonQuery <em>Common Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQuery
   * @generated
   */
  EClass getCommonQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject <em>Common Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryObject
   * @generated
   */
  EClass getCommonQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryObject#getFieldName()
   * @see #getCommonQueryObject()
   * @generated
   */
  EAttribute getCommonQueryObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.CommonQueryObject#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryObject#getParameters()
   * @see #getCommonQueryObject()
   * @generated
   */
  EReference getCommonQueryObject_Parameters();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.CommonQueryParametersObject <em>Common Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Query Parameters Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryParametersObject
   * @generated
   */
  EClass getCommonQueryParametersObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.CommonQueryParametersObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryParametersObject#getQuery()
   * @see #getCommonQueryParametersObject()
   * @generated
   */
  EAttribute getCommonQueryParametersObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.CommonQueryParametersObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.CommonQueryParametersObject#getParams()
   * @see #getCommonQueryParametersObject()
   * @generated
   */
  EAttribute getCommonQueryParametersObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ConstantScoreQuery <em>Constant Score Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Score Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.ConstantScoreQuery
   * @generated
   */
  EClass getConstantScoreQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ConstantScoreQueryObject <em>Constant Score Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Score Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.ConstantScoreQueryObject
   * @generated
   */
  EClass getConstantScoreQueryObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.DisMaxQuery <em>Dis Max Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dis Max Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.DisMaxQuery
   * @generated
   */
  EClass getDisMaxQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.DisMaxQueryObject <em>Dis Max Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dis Max Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.DisMaxQueryObject
   * @generated
   */
  EClass getDisMaxQueryObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.DisMaxQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.DisMaxQueryObject#getQuery()
   * @see #getDisMaxQueryObject()
   * @generated
   */
  EReference getDisMaxQueryObject_Query();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FilteredQuery <em>Filtered Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filtered Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilteredQuery
   * @generated
   */
  EClass getFilteredQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FilteredQueryObject <em>Filtered Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filtered Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilteredQueryObject
   * @generated
   */
  EClass getFilteredQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilteredQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilteredQueryObject#getQuery()
   * @see #getFilteredQueryObject()
   * @generated
   */
  EReference getFilteredQueryObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FilteredQueryObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.FilteredQueryObject#getFilter()
   * @see #getFilteredQueryObject()
   * @generated
   */
  EReference getFilteredQueryObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery <em>Fuzzy Like This Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Like This Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisQuery
   * @generated
   */
  EClass getFuzzyLikeThisQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisQueryObject <em>Fuzzy Like This Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Like This Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisQueryObject
   * @generated
   */
  EClass getFuzzyLikeThisQueryObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery <em>Fuzzy Like This Field Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Like This Field Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQuery
   * @generated
   */
  EClass getFuzzyLikeThisFieldQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject <em>Fuzzy Like This Field Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Like This Field Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject
   * @generated
   */
  EClass getFuzzyLikeThisFieldQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject#getFieldName()
   * @see #getFuzzyLikeThisFieldQueryObject()
   * @generated
   */
  EAttribute getFuzzyLikeThisFieldQueryObject_FieldName();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyLikeThisFieldQueryObject#getParams()
   * @see #getFuzzyLikeThisFieldQueryObject()
   * @generated
   */
  EAttribute getFuzzyLikeThisFieldQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyQuery <em>Fuzzy Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQuery
   * @generated
   */
  EClass getFuzzyQuery();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FuzzyQuery#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQuery#getField()
   * @see #getFuzzyQuery()
   * @generated
   */
  EAttribute getFuzzyQuery_Field();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject <em>Simple Fuzzy Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Fuzzy Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject
   * @generated
   */
  EClass getSimpleFuzzyQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleFuzzyQueryObject#getQuery()
   * @see #getSimpleFuzzyQueryObject()
   * @generated
   */
  EAttribute getSimpleFuzzyQueryObject_Query();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObject <em>Fuzzy Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObject
   * @generated
   */
  EClass getFuzzyQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObject#getQ <em>Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObject#getQ()
   * @see #getFuzzyQueryObject()
   * @generated
   */
  EReference getFuzzyQueryObject_Q();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters <em>Fuzzy Query Object Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuzzy Query Object Parameters</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters
   * @generated
   */
  EClass getFuzzyQueryObjectParameters();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters#getValue()
   * @see #getFuzzyQueryObjectParameters()
   * @generated
   */
  EAttribute getFuzzyQueryObjectParameters_Value();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters#getParams()
   * @see #getFuzzyQueryObjectParameters()
   * @generated
   */
  EAttribute getFuzzyQueryObjectParameters_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoshapeQuery <em>Geoshape Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geoshape Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQuery
   * @generated
   */
  EClass getGeoshapeQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoshapeQueryObject <em>Geoshape Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geoshape Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQueryObject
   * @generated
   */
  EClass getGeoshapeQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoshapeQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQueryObject#getFieldName()
   * @see #getGeoshapeQueryObject()
   * @generated
   */
  EAttribute getGeoshapeQueryObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoshapeQueryObject#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoshapeQueryObject#getShape()
   * @see #getGeoshapeQueryObject()
   * @generated
   */
  EReference getGeoshapeQueryObject_Shape();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasChildQuery <em>Has Child Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Child Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildQuery
   * @generated
   */
  EClass getHasChildQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasChildQueryObject <em>Has Child Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Child Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildQueryObject
   * @generated
   */
  EClass getHasChildQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.HasChildQueryObject#getChildType <em>Child Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Child Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildQueryObject#getChildType()
   * @see #getHasChildQueryObject()
   * @generated
   */
  EAttribute getHasChildQueryObject_ChildType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasChildQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildQueryObject#getQuery()
   * @see #getHasChildQueryObject()
   * @generated
   */
  EReference getHasChildQueryObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasChildQueryObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildQueryObject#getFilter()
   * @see #getHasChildQueryObject()
   * @generated
   */
  EReference getHasChildQueryObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasParentQuery <em>Has Parent Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Parent Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentQuery
   * @generated
   */
  EClass getHasParentQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject <em>Has Parent Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Parent Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentQueryObject
   * @generated
   */
  EClass getHasParentQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getParentType <em>Parent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentQueryObject#getParentType()
   * @see #getHasParentQueryObject()
   * @generated
   */
  EAttribute getHasParentQueryObject_ParentType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentQueryObject#getQuery()
   * @see #getHasParentQueryObject()
   * @generated
   */
  EReference getHasParentQueryObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasParentQueryObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentQueryObject#getFilter()
   * @see #getHasParentQueryObject()
   * @generated
   */
  EReference getHasParentQueryObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.IndicesQuery <em>Indices Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indices Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesQuery
   * @generated
   */
  EClass getIndicesQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject <em>Indices Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indices Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesQueryObject
   * @generated
   */
  EClass getIndicesQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesQueryObject#getQuery()
   * @see #getIndicesQueryObject()
   * @generated
   */
  EReference getIndicesQueryObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.IndicesQueryObject#getNoMatchQuery <em>No Match Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>No Match Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesQueryObject#getNoMatchQuery()
   * @see #getIndicesQueryObject()
   * @generated
   */
  EReference getIndicesQueryObject_NoMatchQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisQuery <em>More Like This Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Like This Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisQuery
   * @generated
   */
  EClass getMoreLikeThisQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisQueryObject <em>More Like This Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Like This Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisQueryObject
   * @generated
   */
  EClass getMoreLikeThisQueryObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery <em>More Like This Field Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Like This Field Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQuery
   * @generated
   */
  EClass getMoreLikeThisFieldQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject <em>More Like This Field Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Like This Field Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject
   * @generated
   */
  EClass getMoreLikeThisFieldQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getFieldName()
   * @see #getMoreLikeThisFieldQueryObject()
   * @generated
   */
  EAttribute getMoreLikeThisFieldQueryObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getQuery()
   * @see #getMoreLikeThisFieldQueryObject()
   * @generated
   */
  EReference getMoreLikeThisFieldQueryObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.MoreLikeThisFieldQueryObject#getParams()
   * @see #getMoreLikeThisFieldQueryObject()
   * @generated
   */
  EAttribute getMoreLikeThisFieldQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NestedQuery <em>Nested Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedQuery
   * @generated
   */
  EClass getNestedQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NestedQueryObject <em>Nested Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedQueryObject
   * @generated
   */
  EClass getNestedQueryObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.PrefixQuery <em>Prefix Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQuery
   * @generated
   */
  EClass getPrefixQuery();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.PrefixQuery#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQuery#getFieldName()
   * @see #getPrefixQuery()
   * @generated
   */
  EAttribute getPrefixQuery_FieldName();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject <em>Simple Prefix Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Prefix Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject
   * @generated
   */
  EClass getSimplePrefixQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimplePrefixQueryObject#getPrefix()
   * @see #getSimplePrefixQueryObject()
   * @generated
   */
  EAttribute getSimplePrefixQueryObject_Prefix();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.PrefixQueryObject <em>Prefix Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryObject
   * @generated
   */
  EClass getPrefixQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.PrefixQueryObject#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryObject#getPrefix()
   * @see #getPrefixQueryObject()
   * @generated
   */
  EReference getPrefixQueryObject_Prefix();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject <em>Prefix Query Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Query Parameter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject
   * @generated
   */
  EClass getPrefixQueryParameterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixQueryParameterObject#getValue()
   * @see #getPrefixQueryParameterObject()
   * @generated
   */
  EAttribute getPrefixQueryParameterObject_Value();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryStringQuery <em>Query String Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query String Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQuery
   * @generated
   */
  EClass getQueryStringQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryStringQueryObject <em>Query String Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query String Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQueryObject
   * @generated
   */
  EClass getQueryStringQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.QueryStringQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQueryObject#getQuery()
   * @see #getQueryStringQueryObject()
   * @generated
   */
  EAttribute getQueryStringQueryObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.QueryStringQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryStringQueryObject#getParams()
   * @see #getQueryStringQueryObject()
   * @generated
   */
  EAttribute getQueryStringQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery <em>Simple Query String Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Query String Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQuery
   * @generated
   */
  EClass getSimpleQueryStringQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject <em>Simple Query String Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Query String Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject
   * @generated
   */
  EClass getSimpleQueryStringQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getQuery()
   * @see #getSimpleQueryStringQueryObject()
   * @generated
   */
  EAttribute getSimpleQueryStringQueryObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleQueryStringQueryObject#getParams()
   * @see #getSimpleQueryStringQueryObject()
   * @generated
   */
  EAttribute getSimpleQueryStringQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeQuery <em>Range Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQuery
   * @generated
   */
  EClass getRangeQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeQueryObject <em>Range Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryObject
   * @generated
   */
  EClass getRangeQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RangeQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryObject#getFieldName()
   * @see #getRangeQueryObject()
   * @generated
   */
  EAttribute getRangeQueryObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RangeQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryObject#getParams()
   * @see #getRangeQueryObject()
   * @generated
   */
  EReference getRangeQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeQueryParametersObject <em>Range Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Query Parameters Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryParametersObject
   * @generated
   */
  EClass getRangeQueryParametersObject();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.RangeQueryParametersObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeQueryParametersObject#getParams()
   * @see #getRangeQueryParametersObject()
   * @generated
   */
  EAttribute getRangeQueryParametersObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpQuery <em>Regexp Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQuery
   * @generated
   */
  EClass getRegexpQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject <em>Regexp Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryObject
   * @generated
   */
  EClass getRegexpQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryObject#getFieldName()
   * @see #getRegexpQueryObject()
   * @generated
   */
  EAttribute getRegexpQueryObject_FieldName();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getRegexp <em>Regexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regexp</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryObject#getRegexp()
   * @see #getRegexpQueryObject()
   * @generated
   */
  EAttribute getRegexpQueryObject_Regexp();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RegexpQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryObject#getParams()
   * @see #getRegexpQueryObject()
   * @generated
   */
  EReference getRegexpQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject <em>Regexp Query Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Query Parameter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject
   * @generated
   */
  EClass getRegexpQueryParameterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regex</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject#getRegex()
   * @see #getRegexpQueryParameterObject()
   * @generated
   */
  EAttribute getRegexpQueryParameterObject_Regex();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpQueryParameterObject#getParams()
   * @see #getRegexpQueryParameterObject()
   * @generated
   */
  EAttribute getRegexpQueryParameterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanFirstQuery <em>Span First Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span First Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanFirstQuery
   * @generated
   */
  EClass getSpanFirstQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanFirstQueryObject <em>Span First Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span First Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanFirstQueryObject
   * @generated
   */
  EClass getSpanFirstQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SpanFirstQueryObject#getSubquery <em>Subquery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subquery</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanFirstQueryObject#getSubquery()
   * @see #getSpanFirstQueryObject()
   * @generated
   */
  EReference getSpanFirstQueryObject_Subquery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanMultiQuery <em>Span Multi Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Multi Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanMultiQuery
   * @generated
   */
  EClass getSpanMultiQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanMultiQueryObject <em>Span Multi Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Multi Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanMultiQueryObject
   * @generated
   */
  EClass getSpanMultiQueryObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanNearQuery <em>Span Near Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Near Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQuery
   * @generated
   */
  EClass getSpanNearQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject <em>Span Near Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Near Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject
   * @generated
   */
  EClass getSpanNearQueryObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getClauses <em>Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clauses</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getClauses()
   * @see #getSpanNearQueryObject()
   * @generated
   */
  EReference getSpanNearQueryObject_Clauses();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getSlop <em>Slop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Slop</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getSlop()
   * @see #getSpanNearQueryObject()
   * @generated
   */
  EAttribute getSpanNearQueryObject_Slop();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getInOrder <em>In Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In Order</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getInOrder()
   * @see #getSpanNearQueryObject()
   * @generated
   */
  EAttribute getSpanNearQueryObject_InOrder();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getCollectPayloads <em>Collect Payloads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collect Payloads</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNearQueryObject#getCollectPayloads()
   * @see #getSpanNearQueryObject()
   * @generated
   */
  EAttribute getSpanNearQueryObject_CollectPayloads();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanNotQuery <em>Span Not Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Not Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQuery
   * @generated
   */
  EClass getSpanNotQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject <em>Span Not Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Not Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQueryObject
   * @generated
   */
  EClass getSpanNotQueryObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getIncludeQuery <em>Include Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Include Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getIncludeQuery()
   * @see #getSpanNotQueryObject()
   * @generated
   */
  EReference getSpanNotQueryObject_IncludeQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getExcludeQuery <em>Exclude Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanNotQueryObject#getExcludeQuery()
   * @see #getSpanNotQueryObject()
   * @generated
   */
  EReference getSpanNotQueryObject_ExcludeQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanOrQuery <em>Span Or Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Or Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanOrQuery
   * @generated
   */
  EClass getSpanOrQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanOrQueryObject <em>Span Or Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Or Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanOrQueryObject
   * @generated
   */
  EClass getSpanOrQueryObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.SpanOrQueryObject#getClauses <em>Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clauses</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanOrQueryObject#getClauses()
   * @see #getSpanOrQueryObject()
   * @generated
   */
  EReference getSpanOrQueryObject_Clauses();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanTermQuery <em>Span Term Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Term Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQuery
   * @generated
   */
  EClass getSpanTermQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SpanTermQueryObject <em>Span Term Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Span Term Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQueryObject
   * @generated
   */
  EClass getSpanTermQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.SpanTermQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQueryObject#getFieldName()
   * @see #getSpanTermQueryObject()
   * @generated
   */
  EAttribute getSpanTermQueryObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.SpanTermQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.SpanTermQueryObject#getParams()
   * @see #getSpanTermQueryObject()
   * @generated
   */
  EReference getSpanTermQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermQuery <em>Term Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQuery
   * @generated
   */
  EClass getTermQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermQueryObject <em>Term Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryObject
   * @generated
   */
  EClass getTermQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryObject#getFieldName()
   * @see #getTermQueryObject()
   * @generated
   */
  EAttribute getTermQueryObject_FieldName();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermQueryObject#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryObject#getTerm()
   * @see #getTermQueryObject()
   * @generated
   */
  EAttribute getTermQueryObject_Term();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TermQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryObject#getParams()
   * @see #getTermQueryObject()
   * @generated
   */
  EReference getTermQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject <em>Term Query Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Query Parameters Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryParametersObject
   * @generated
   */
  EClass getTermQueryParametersObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getTerm()
   * @see #getTermQueryParametersObject()
   * @generated
   */
  EAttribute getTermQueryParametersObject_Term();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getBoost <em>Boost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boost</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermQueryParametersObject#getBoost()
   * @see #getTermQueryParametersObject()
   * @generated
   */
  EAttribute getTermQueryParametersObject_Boost();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsQuery <em>Terms Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsQuery
   * @generated
   */
  EClass getTermsQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsQueryObject <em>Terms Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsQueryObject
   * @generated
   */
  EClass getTermsQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsQueryObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsQueryObject#getFieldName()
   * @see #getTermsQueryObject()
   * @generated
   */
  EAttribute getTermsQueryObject_FieldName();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.TermsQueryObject#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsQueryObject#getTerms()
   * @see #getTermsQueryObject()
   * @generated
   */
  EAttribute getTermsQueryObject_Terms();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TopChildrenQuery <em>Top Children Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Children Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQuery
   * @generated
   */
  EClass getTopChildrenQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject <em>Top Children Query Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Children Query Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQueryObject
   * @generated
   */
  EClass getTopChildrenQueryObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getChildType <em>Child Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Child Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getChildType()
   * @see #getTopChildrenQueryObject()
   * @generated
   */
  EAttribute getTopChildrenQueryObject_ChildType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getQuery()
   * @see #getTopChildrenQueryObject()
   * @generated
   */
  EReference getTopChildrenQueryObject_Query();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.TopChildrenQueryObject#getParams()
   * @see #getTopChildrenQueryObject()
   * @generated
   */
  EAttribute getTopChildrenQueryObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.WildcardQuery <em>Wildcard Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.WildcardQuery
   * @generated
   */
  EClass getWildcardQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.AndFilter <em>And Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.AndFilter
   * @generated
   */
  EClass getAndFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.SimpleAndFilterArray <em>Simple And Filter Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple And Filter Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleAndFilterArray
   * @generated
   */
  EClass getSimpleAndFilterArray();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.SimpleAndFilterArray#getSubFilter <em>Sub Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.SimpleAndFilterArray#getSubFilter()
   * @see #getSimpleAndFilterArray()
   * @generated
   */
  EReference getSimpleAndFilterArray_SubFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.AndFilterObject <em>And Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.AndFilterObject
   * @generated
   */
  EClass getAndFilterObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolFilter <em>Bool Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolFilter
   * @generated
   */
  EClass getBoolFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolFilterObject <em>Bool Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterObject
   * @generated
   */
  EClass getBoolFilterObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.BoolFilterObject#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clause</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterObject#getClause()
   * @see #getBoolFilterObject()
   * @generated
   */
  EReference getBoolFilterObject_Clause();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoolFilterClause <em>Bool Filter Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Filter Clause</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterClause
   * @generated
   */
  EClass getBoolFilterClause();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.BoolFilterClause#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoolFilterClause#getFilter()
   * @see #getBoolFilterClause()
   * @generated
   */
  EReference getBoolFilterClause_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter <em>Geo Bounding Box Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Bounding Box Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilter
   * @generated
   */
  EClass getGeoBoundingBoxFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject <em>Geo Bounding Box Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Bounding Box Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject
   * @generated
   */
  EClass getGeoBoundingBoxFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject#getFieldName()
   * @see #getGeoBoundingBoxFilterObject()
   * @generated
   */
  EAttribute getGeoBoundingBoxFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject#getBoundingBox <em>Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounding Box</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoBoundingBoxFilterObject#getBoundingBox()
   * @see #getGeoBoundingBoxFilterObject()
   * @generated
   */
  EReference getGeoBoundingBoxFilterObject_BoundingBox();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilter <em>Geo Distance Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilter
   * @generated
   */
  EClass getGeoDistanceFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject <em>Geo Distance Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject
   * @generated
   */
  EClass getGeoDistanceFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getDistance <em>Distance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distance</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getDistance()
   * @see #getGeoDistanceFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceFilterObject_Distance();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getFieldName()
   * @see #getGeoDistanceFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getPoint()
   * @see #getGeoDistanceFilterObject()
   * @generated
   */
  EReference getGeoDistanceFilterObject_Point();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceFilterObject#getParams()
   * @see #getGeoDistanceFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceFilterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter <em>Geo Distance Range Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Range Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilter
   * @generated
   */
  EClass getGeoDistanceRangeFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject <em>Geo Distance Range Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Distance Range Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject
   * @generated
   */
  EClass getGeoDistanceRangeFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFrom()
   * @see #getGeoDistanceRangeFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceRangeFilterObject_From();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getTo()
   * @see #getGeoDistanceRangeFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceRangeFilterObject_To();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getFieldName()
   * @see #getGeoDistanceRangeFilterObject()
   * @generated
   */
  EAttribute getGeoDistanceRangeFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoDistanceRangeFilterObject#getPoint()
   * @see #getGeoDistanceRangeFilterObject()
   * @generated
   */
  EReference getGeoDistanceRangeFilterObject_Point();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilter <em>Geo Polygon Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Polygon Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilter
   * @generated
   */
  EClass getGeoPolygonFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject <em>Geo Polygon Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Polygon Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject
   * @generated
   */
  EClass getGeoPolygonFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject#getFieldName()
   * @see #getGeoPolygonFilterObject()
   * @generated
   */
  EAttribute getGeoPolygonFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject#getPolygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Polygon</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoPolygonFilterObject#getPolygon()
   * @see #getGeoPolygonFilterObject()
   * @generated
   */
  EReference getGeoPolygonFilterObject_Polygon();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilter <em>Geo Shape Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Shape Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilter
   * @generated
   */
  EClass getGeoShapeFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilterObject <em>Geo Shape Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Shape Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilterObject
   * @generated
   */
  EClass getGeoShapeFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilterObject#getFieldName()
   * @see #getGeoShapeFilterObject()
   * @generated
   */
  EAttribute getGeoShapeFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoShapeFilterObject#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeFilterObject#getShape()
   * @see #getGeoShapeFilterObject()
   * @generated
   */
  EReference getGeoShapeFilterObject_Shape();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeohashCellFilter <em>Geohash Cell Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geohash Cell Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeohashCellFilter
   * @generated
   */
  EClass getGeohashCellFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeohashCellFilterObject <em>Geohash Cell Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geohash Cell Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeohashCellFilterObject
   * @generated
   */
  EClass getGeohashCellFilterObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasChildFilter <em>Has Child Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Child Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilter
   * @generated
   */
  EClass getHasChildFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasChildFilterObject <em>Has Child Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Child Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilterObject
   * @generated
   */
  EClass getHasChildFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.HasChildFilterObject#getChildType <em>Child Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Child Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilterObject#getChildType()
   * @see #getHasChildFilterObject()
   * @generated
   */
  EAttribute getHasChildFilterObject_ChildType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasChildFilterObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilterObject#getQuery()
   * @see #getHasChildFilterObject()
   * @generated
   */
  EReference getHasChildFilterObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasChildFilterObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasChildFilterObject#getFilter()
   * @see #getHasChildFilterObject()
   * @generated
   */
  EReference getHasChildFilterObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasParentFilter <em>Has Parent Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Parent Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilter
   * @generated
   */
  EClass getHasParentFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.HasParentFilterObject <em>Has Parent Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Parent Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilterObject
   * @generated
   */
  EClass getHasParentFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.HasParentFilterObject#getParentType <em>Parent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilterObject#getParentType()
   * @see #getHasParentFilterObject()
   * @generated
   */
  EAttribute getHasParentFilterObject_ParentType();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasParentFilterObject#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilterObject#getQuery()
   * @see #getHasParentFilterObject()
   * @generated
   */
  EReference getHasParentFilterObject_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.HasParentFilterObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.HasParentFilterObject#getFilter()
   * @see #getHasParentFilterObject()
   * @generated
   */
  EReference getHasParentFilterObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.IndicesFilter <em>Indices Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indices Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilter
   * @generated
   */
  EClass getIndicesFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject <em>Indices Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indices Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilterObject
   * @generated
   */
  EClass getIndicesFilterObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilterObject#getFilter()
   * @see #getIndicesFilterObject()
   * @generated
   */
  EReference getIndicesFilterObject_Filter();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.IndicesFilterObject#getNoMatchFilter <em>No Match Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>No Match Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.IndicesFilterObject#getNoMatchFilter()
   * @see #getIndicesFilterObject()
   * @generated
   */
  EReference getIndicesFilterObject_NoMatchFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedFilter
   * @generated
   */
  EClass getNestedFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NestedFilterObject <em>Nested Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedFilterObject
   * @generated
   */
  EClass getNestedFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.NestedFilterObject#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedFilterObject#getPath()
   * @see #getNestedFilterObject()
   * @generated
   */
  EAttribute getNestedFilterObject_Path();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.NestedFilterObject#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.NestedFilterObject#getFilter()
   * @see #getNestedFilterObject()
   * @generated
   */
  EReference getNestedFilterObject_Filter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NotFilter <em>Not Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.NotFilter
   * @generated
   */
  EClass getNotFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.NotFilterObject <em>Not Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.NotFilterObject
   * @generated
   */
  EClass getNotFilterObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.OrFilter <em>Or Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.OrFilter
   * @generated
   */
  EClass getOrFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.OrFilterArray <em>Or Filter Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Filter Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.OrFilterArray
   * @generated
   */
  EClass getOrFilterArray();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.OrFilterArray#getSubQuery <em>Sub Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Query</em>'.
   * @see com.first8.elasticsearch.dsl.search.OrFilterArray#getSubQuery()
   * @see #getOrFilterArray()
   * @generated
   */
  EReference getOrFilterArray_SubQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.PrefixFilter <em>Prefix Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilter
   * @generated
   */
  EClass getPrefixFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.PrefixFilterObject <em>Prefix Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilterObject
   * @generated
   */
  EClass getPrefixFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.PrefixFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilterObject#getFieldName()
   * @see #getPrefixFilterObject()
   * @generated
   */
  EAttribute getPrefixFilterObject_FieldName();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.PrefixFilterObject#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see com.first8.elasticsearch.dsl.search.PrefixFilterObject#getPrefix()
   * @see #getPrefixFilterObject()
   * @generated
   */
  EAttribute getPrefixFilterObject_Prefix();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.QueryFilter <em>Query Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.QueryFilter
   * @generated
   */
  EClass getQueryFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.FQuery <em>FQuery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FQuery</em>'.
   * @see com.first8.elasticsearch.dsl.search.FQuery
   * @generated
   */
  EClass getFQuery();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeFilter <em>Range Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilter
   * @generated
   */
  EClass getRangeFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeFilterObject <em>Range Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterObject
   * @generated
   */
  EClass getRangeFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RangeFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterObject#getFieldName()
   * @see #getRangeFilterObject()
   * @generated
   */
  EAttribute getRangeFilterObject_FieldName();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RangeFilterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterObject#getParams()
   * @see #getRangeFilterObject()
   * @generated
   */
  EReference getRangeFilterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RangeFilterParametersObject <em>Range Filter Parameters Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Filter Parameters Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterParametersObject
   * @generated
   */
  EClass getRangeFilterParametersObject();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.RangeFilterParametersObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RangeFilterParametersObject#getParams()
   * @see #getRangeFilterParametersObject()
   * @generated
   */
  EAttribute getRangeFilterParametersObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpFilter <em>Regexp Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilter
   * @generated
   */
  EClass getRegexpFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpFilterObject <em>Regexp Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterObject
   * @generated
   */
  EClass getRegexpFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterObject#getFieldName()
   * @see #getRegexpFilterObject()
   * @generated
   */
  EAttribute getRegexpFilterObject_FieldName();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpFilterObject#getRegexp <em>Regexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regexp</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterObject#getRegexp()
   * @see #getRegexpFilterObject()
   * @generated
   */
  EAttribute getRegexpFilterObject_Regexp();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.RegexpFilterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterObject#getParams()
   * @see #getRegexpFilterObject()
   * @generated
   */
  EReference getRegexpFilterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject <em>Regexp Filter Parameter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regexp Filter Parameter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject
   * @generated
   */
  EClass getRegexpFilterParameterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getRegexp <em>Regexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regexp</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getRegexp()
   * @see #getRegexpFilterParameterObject()
   * @generated
   */
  EAttribute getRegexpFilterParameterObject_Regexp();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.RegexpFilterParameterObject#getParams()
   * @see #getRegexpFilterParameterObject()
   * @generated
   */
  EAttribute getRegexpFilterParameterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ScriptFilter <em>Script Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilter
   * @generated
   */
  EClass getScriptFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject <em>Script Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilterObject
   * @generated
   */
  EClass getScriptFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilterObject#getScript()
   * @see #getScriptFilterObject()
   * @generated
   */
  EAttribute getScriptFilterObject_Script();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.ScriptFilterObject#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see com.first8.elasticsearch.dsl.search.ScriptFilterObject#getParams()
   * @see #getScriptFilterObject()
   * @generated
   */
  EReference getScriptFilterObject_Params();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermFilter <em>Term Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermFilter
   * @generated
   */
  EClass getTermFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermFilterObject <em>Term Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermFilterObject
   * @generated
   */
  EClass getTermFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermFilterObject#getFieldName()
   * @see #getTermFilterObject()
   * @generated
   */
  EAttribute getTermFilterObject_FieldName();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermFilterObject#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermFilterObject#getTerm()
   * @see #getTermFilterObject()
   * @generated
   */
  EAttribute getTermFilterObject_Term();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsFilter <em>Terms Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFilter
   * @generated
   */
  EClass getTermsFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TermsFilterObject <em>Terms Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFilterObject
   * @generated
   */
  EClass getTermsFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TermsFilterObject#getFieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Name</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFilterObject#getFieldName()
   * @see #getTermsFilterObject()
   * @generated
   */
  EAttribute getTermsFilterObject_FieldName();

  /**
   * Returns the meta object for the attribute list '{@link com.first8.elasticsearch.dsl.search.TermsFilterObject#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Terms</em>'.
   * @see com.first8.elasticsearch.dsl.search.TermsFilterObject#getTerms()
   * @see #getTermsFilterObject()
   * @generated
   */
  EAttribute getTermsFilterObject_Terms();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TypeFilter <em>Type Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Filter</em>'.
   * @see com.first8.elasticsearch.dsl.search.TypeFilter
   * @generated
   */
  EClass getTypeFilter();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TypeFilterObject <em>Type Filter Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Filter Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.TypeFilterObject
   * @generated
   */
  EClass getTypeFilterObject();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.TypeFilterObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.TypeFilterObject#getType()
   * @see #getTypeFilterObject()
   * @generated
   */
  EAttribute getTypeFilterObject_Type();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoShapeObject <em>Geo Shape Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Shape Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShapeObject
   * @generated
   */
  EClass getGeoShapeObject();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.GeoShape <em>Geo Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geo Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShape
   * @generated
   */
  EClass getGeoShape();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.GeoShape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShape#getShape()
   * @see #getGeoShape()
   * @generated
   */
  EReference getGeoShape_Shape();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.GeoShape#getIndexedShape <em>Indexed Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Indexed Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.GeoShape#getIndexedShape()
   * @see #getGeoShape()
   * @generated
   */
  EAttribute getGeoShape_IndexedShape();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polygon</em>'.
   * @see com.first8.elasticsearch.dsl.search.Polygon
   * @generated
   */
  EClass getPolygon();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.Polygon#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see com.first8.elasticsearch.dsl.search.Polygon#getPoints()
   * @see #getPolygon()
   * @generated
   */
  EReference getPolygon_Points();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject <em>Bounding Box Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bounding Box Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoundingBoxObject
   * @generated
   */
  EClass getBoundingBoxObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getTwoPointBoundingBox <em>Two Point Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Two Point Bounding Box</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoundingBoxObject#getTwoPointBoundingBox()
   * @see #getBoundingBoxObject()
   * @generated
   */
  EReference getBoundingBoxObject_TwoPointBoundingBox();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.BoundingBoxObject#getVerticesBoundingBox <em>Vertices Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vertices Bounding Box</em>'.
   * @see com.first8.elasticsearch.dsl.search.BoundingBoxObject#getVerticesBoundingBox()
   * @see #getBoundingBoxObject()
   * @generated
   */
  EAttribute getBoundingBoxObject_VerticesBoundingBox();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox <em>Two Point Bounding Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Point Bounding Box</em>'.
   * @see com.first8.elasticsearch.dsl.search.TwoPointBoundingBox
   * @generated
   */
  EClass getTwoPointBoundingBox();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getTopLeft <em>Top Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top Left</em>'.
   * @see com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getTopLeft()
   * @see #getTwoPointBoundingBox()
   * @generated
   */
  EReference getTwoPointBoundingBox_TopLeft();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getBottomRight <em>Bottom Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bottom Right</em>'.
   * @see com.first8.elasticsearch.dsl.search.TwoPointBoundingBox#getBottomRight()
   * @see #getTwoPointBoundingBox()
   * @generated
   */
  EReference getTwoPointBoundingBox_BottomRight();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.LatLon <em>Lat Lon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lat Lon</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLon
   * @generated
   */
  EClass getLatLon();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonObject <em>Lat Lon Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lat Lon Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLon#getLatLonObject()
   * @see #getLatLon()
   * @generated
   */
  EAttribute getLatLon_LatLonObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonArray <em>Lat Lon Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat Lon Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLon#getLatLonArray()
   * @see #getLatLon()
   * @generated
   */
  EReference getLatLon_LatLonArray();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.LatLon#getLatLonString <em>Lat Lon String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat Lon String</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLon#getLatLonString()
   * @see #getLatLon()
   * @generated
   */
  EReference getLatLon_LatLonString();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.LatLonArray <em>Lat Lon Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lat Lon Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLonArray
   * @generated
   */
  EClass getLatLonArray();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLon <em>Lon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lon</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLonArray#getLon()
   * @see #getLatLonArray()
   * @generated
   */
  EAttribute getLatLonArray_Lon();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.LatLonArray#getLat <em>Lat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lat</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLonArray#getLat()
   * @see #getLatLonArray()
   * @generated
   */
  EAttribute getLatLonArray_Lat();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.LatLonString <em>Lat Lon String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lat Lon String</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLonString
   * @generated
   */
  EClass getLatLonString();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.LatLonString#getLatLonOrHash <em>Lat Lon Or Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lat Lon Or Hash</em>'.
   * @see com.first8.elasticsearch.dsl.search.LatLonString#getLatLonOrHash()
   * @see #getLatLonString()
   * @generated
   */
  EAttribute getLatLonString_LatLonOrHash();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ShapeObject <em>Shape Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShapeObject
   * @generated
   */
  EClass getShapeObject();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.ShapeObject#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShapeObject#getShape()
   * @see #getShapeObject()
   * @generated
   */
  EReference getShapeObject_Shape();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape</em>'.
   * @see com.first8.elasticsearch.dsl.search.Shape
   * @generated
   */
  EClass getShape();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ShapeType <em>Shape Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Type</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShapeType
   * @generated
   */
  EClass getShapeType();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope <em>Shape Type Envelope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape Type Envelope</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope
   * @generated
   */
  EClass getShapeTypeEnvelope();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see com.first8.elasticsearch.dsl.search.ShapeTypeEnvelope#getPoints()
   * @see #getShapeTypeEnvelope()
   * @generated
   */
  EReference getShapeTypeEnvelope_Points();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.Object#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.first8.elasticsearch.dsl.search.Object#getMembers()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Members();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see com.first8.elasticsearch.dsl.search.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.Member#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.first8.elasticsearch.dsl.search.Member#getKey()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Key();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Member#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.Member#getValue()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Value();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Value#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getObject()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Object();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.Value#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getString()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_String();

  /**
   * Returns the meta object for the containment reference '{@link com.first8.elasticsearch.dsl.search.Value#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getArray()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Array();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.Value#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getBool()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Bool();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.Value#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getNull()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Null();

  /**
   * Returns the meta object for the attribute '{@link com.first8.elasticsearch.dsl.search.Value#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see com.first8.elasticsearch.dsl.search.Value#getNumber()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Number();

  /**
   * Returns the meta object for class '{@link com.first8.elasticsearch.dsl.search.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see com.first8.elasticsearch.dsl.search.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference list '{@link com.first8.elasticsearch.dsl.search.Array#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.first8.elasticsearch.dsl.search.Array#getValues()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SearchFactory getSearchFactory();

} //SearchPackage
