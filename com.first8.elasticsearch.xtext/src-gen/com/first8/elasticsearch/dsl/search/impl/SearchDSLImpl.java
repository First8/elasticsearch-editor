/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.Facets;
import com.first8.elasticsearch.dsl.search.Fields;
import com.first8.elasticsearch.dsl.search.Query;
import com.first8.elasticsearch.dsl.search.SearchDSL;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.Sort;
import com.first8.elasticsearch.dsl.search.Stats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.SearchDSLImpl#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchDSLImpl extends MinimalEObjectImpl.Container implements SearchDSL
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected Fields fields;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected Sort sort;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected Query query;

  /**
   * The cached value of the '{@link #getFacets() <em>Facets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacets()
   * @generated
   * @ordered
   */
  protected Facets facets;

  /**
   * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStats()
   * @generated
   * @ordered
   */
  protected Stats stats;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchDSLImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SearchPackage.eINSTANCE.getSearchDSL();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fields getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(Fields newFields, NotificationChain msgs)
  {
    Fields oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__FIELDS, oldFields, newFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(Fields newFields)
  {
    if (newFields != fields)
    {
      NotificationChain msgs = null;
      if (fields != null)
        msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__FIELDS, null, msgs);
      if (newFields != null)
        msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__FIELDS, null, msgs);
      msgs = basicSetFields(newFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__FIELDS, newFields, newFields));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort getSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs)
  {
    Sort oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__SORT, oldSort, newSort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(Sort newSort)
  {
    if (newSort != sort)
    {
      NotificationChain msgs = null;
      if (sort != null)
        msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__SORT, null, msgs);
      if (newSort != null)
        msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__SORT, null, msgs);
      msgs = basicSetSort(newSort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__SORT, newSort, newSort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs)
  {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(Query newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facets getFacets()
  {
    return facets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacets(Facets newFacets, NotificationChain msgs)
  {
    Facets oldFacets = facets;
    facets = newFacets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__FACETS, oldFacets, newFacets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacets(Facets newFacets)
  {
    if (newFacets != facets)
    {
      NotificationChain msgs = null;
      if (facets != null)
        msgs = ((InternalEObject)facets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__FACETS, null, msgs);
      if (newFacets != null)
        msgs = ((InternalEObject)newFacets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__FACETS, null, msgs);
      msgs = basicSetFacets(newFacets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__FACETS, newFacets, newFacets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stats getStats()
  {
    return stats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStats(Stats newStats, NotificationChain msgs)
  {
    Stats oldStats = stats;
    stats = newStats;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__STATS, oldStats, newStats);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStats(Stats newStats)
  {
    if (newStats != stats)
    {
      NotificationChain msgs = null;
      if (stats != null)
        msgs = ((InternalEObject)stats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__STATS, null, msgs);
      if (newStats != null)
        msgs = ((InternalEObject)newStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SEARCH_DSL__STATS, null, msgs);
      msgs = basicSetStats(newStats, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SEARCH_DSL__STATS, newStats, newStats));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SearchPackage.SEARCH_DSL__FIELDS:
        return basicSetFields(null, msgs);
      case SearchPackage.SEARCH_DSL__SORT:
        return basicSetSort(null, msgs);
      case SearchPackage.SEARCH_DSL__QUERY:
        return basicSetQuery(null, msgs);
      case SearchPackage.SEARCH_DSL__FACETS:
        return basicSetFacets(null, msgs);
      case SearchPackage.SEARCH_DSL__STATS:
        return basicSetStats(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SearchPackage.SEARCH_DSL__FIELDS:
        return getFields();
      case SearchPackage.SEARCH_DSL__FROM:
        return getFrom();
      case SearchPackage.SEARCH_DSL__SIZE:
        return getSize();
      case SearchPackage.SEARCH_DSL__SORT:
        return getSort();
      case SearchPackage.SEARCH_DSL__QUERY:
        return getQuery();
      case SearchPackage.SEARCH_DSL__FACETS:
        return getFacets();
      case SearchPackage.SEARCH_DSL__STATS:
        return getStats();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SearchPackage.SEARCH_DSL__FIELDS:
        setFields((Fields)newValue);
        return;
      case SearchPackage.SEARCH_DSL__FROM:
        setFrom((String)newValue);
        return;
      case SearchPackage.SEARCH_DSL__SIZE:
        setSize((String)newValue);
        return;
      case SearchPackage.SEARCH_DSL__SORT:
        setSort((Sort)newValue);
        return;
      case SearchPackage.SEARCH_DSL__QUERY:
        setQuery((Query)newValue);
        return;
      case SearchPackage.SEARCH_DSL__FACETS:
        setFacets((Facets)newValue);
        return;
      case SearchPackage.SEARCH_DSL__STATS:
        setStats((Stats)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.SEARCH_DSL__FIELDS:
        setFields((Fields)null);
        return;
      case SearchPackage.SEARCH_DSL__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case SearchPackage.SEARCH_DSL__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case SearchPackage.SEARCH_DSL__SORT:
        setSort((Sort)null);
        return;
      case SearchPackage.SEARCH_DSL__QUERY:
        setQuery((Query)null);
        return;
      case SearchPackage.SEARCH_DSL__FACETS:
        setFacets((Facets)null);
        return;
      case SearchPackage.SEARCH_DSL__STATS:
        setStats((Stats)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SearchPackage.SEARCH_DSL__FIELDS:
        return fields != null;
      case SearchPackage.SEARCH_DSL__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case SearchPackage.SEARCH_DSL__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case SearchPackage.SEARCH_DSL__SORT:
        return sort != null;
      case SearchPackage.SEARCH_DSL__QUERY:
        return query != null;
      case SearchPackage.SEARCH_DSL__FACETS:
        return facets != null;
      case SearchPackage.SEARCH_DSL__STATS:
        return stats != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (from: ");
    result.append(from);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //SearchDSLImpl
