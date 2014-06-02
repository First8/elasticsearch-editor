/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.FuzzyQueryObject;
import com.first8.elasticsearch.dsl.search.FuzzyQueryObjectParameters;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Query Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FuzzyQueryObjectImpl#getQ <em>Q</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuzzyQueryObjectImpl extends FuzzyQueryImpl implements FuzzyQueryObject
{
  /**
   * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ()
   * @generated
   * @ordered
   */
  protected FuzzyQueryObjectParameters q;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuzzyQueryObjectImpl()
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
    return SearchPackage.eINSTANCE.getFuzzyQueryObject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuzzyQueryObjectParameters getQ()
  {
    return q;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQ(FuzzyQueryObjectParameters newQ, NotificationChain msgs)
  {
    FuzzyQueryObjectParameters oldQ = q;
    q = newQ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FUZZY_QUERY_OBJECT__Q, oldQ, newQ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQ(FuzzyQueryObjectParameters newQ)
  {
    if (newQ != q)
    {
      NotificationChain msgs = null;
      if (q != null)
        msgs = ((InternalEObject)q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FUZZY_QUERY_OBJECT__Q, null, msgs);
      if (newQ != null)
        msgs = ((InternalEObject)newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FUZZY_QUERY_OBJECT__Q, null, msgs);
      msgs = basicSetQ(newQ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FUZZY_QUERY_OBJECT__Q, newQ, newQ));
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
      case SearchPackage.FUZZY_QUERY_OBJECT__Q:
        return basicSetQ(null, msgs);
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
      case SearchPackage.FUZZY_QUERY_OBJECT__Q:
        return getQ();
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
      case SearchPackage.FUZZY_QUERY_OBJECT__Q:
        setQ((FuzzyQueryObjectParameters)newValue);
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
      case SearchPackage.FUZZY_QUERY_OBJECT__Q:
        setQ((FuzzyQueryObjectParameters)null);
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
      case SearchPackage.FUZZY_QUERY_OBJECT__Q:
        return q != null;
    }
    return super.eIsSet(featureID);
  }

} //FuzzyQueryObjectImpl
