/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.FuzzyQuery;
import com.first8.elasticsearch.dsl.search.MultiTermQuery;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Term Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.MultiTermQueryImpl#getMultiTermQuery <em>Multi Term Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiTermQueryImpl extends SpanMultiQueryObjectImpl implements MultiTermQuery
{
  /**
   * The cached value of the '{@link #getMultiTermQuery() <em>Multi Term Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiTermQuery()
   * @generated
   * @ordered
   */
  protected FuzzyQuery multiTermQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiTermQueryImpl()
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
    return SearchPackage.eINSTANCE.getMultiTermQuery();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQuery getMultiTermQuery()
  {
    return multiTermQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiTermQuery(FuzzyQuery newMultiTermQuery, NotificationChain msgs)
  {
    FuzzyQuery oldMultiTermQuery = multiTermQuery;
    multiTermQuery = newMultiTermQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY, oldMultiTermQuery, newMultiTermQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiTermQuery(FuzzyQuery newMultiTermQuery)
  {
    if (newMultiTermQuery != multiTermQuery)
    {
      NotificationChain msgs = null;
      if (multiTermQuery != null)
        msgs = ((InternalEObject)multiTermQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY, null, msgs);
      if (newMultiTermQuery != null)
        msgs = ((InternalEObject)newMultiTermQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY, null, msgs);
      msgs = basicSetMultiTermQuery(newMultiTermQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY, newMultiTermQuery, newMultiTermQuery));
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
      case SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY:
        return basicSetMultiTermQuery(null, msgs);
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
      case SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY:
        return getMultiTermQuery();
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
      case SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY:
        setMultiTermQuery((FuzzyQuery)newValue);
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
      case SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY:
        setMultiTermQuery((FuzzyQuery)null);
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
      case SearchPackage.MULTI_TERM_QUERY__MULTI_TERM_QUERY:
        return multiTermQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //MultiTermQueryImpl
