/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.ASC_DESC;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.ShortSortOject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Sort Oject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.ShortSortOjectImpl#getSortFieldName <em>Sort Field Name</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.ShortSortOjectImpl#getAscDesc <em>Asc Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortSortOjectImpl extends MinimalEObjectImpl.Container implements ShortSortOject
{
  /**
   * The default value of the '{@link #getSortFieldName() <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortFieldName()
   * @generated
   * @ordered
   */
  protected static final String SORT_FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSortFieldName() <em>Sort Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortFieldName()
   * @generated
   * @ordered
   */
  protected String sortFieldName = SORT_FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAscDesc() <em>Asc Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAscDesc()
   * @generated
   * @ordered
   */
  protected ASC_DESC ascDesc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShortSortOjectImpl()
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
    return SearchPackage.eINSTANCE.getShortSortOject();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSortFieldName()
  {
    return sortFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortFieldName(String newSortFieldName)
  {
    String oldSortFieldName = sortFieldName;
    sortFieldName = newSortFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SHORT_SORT_OJECT__SORT_FIELD_NAME, oldSortFieldName, sortFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASC_DESC getAscDesc()
  {
    return ascDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAscDesc(ASC_DESC newAscDesc, NotificationChain msgs)
  {
    ASC_DESC oldAscDesc = ascDesc;
    ascDesc = newAscDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.SHORT_SORT_OJECT__ASC_DESC, oldAscDesc, newAscDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAscDesc(ASC_DESC newAscDesc)
  {
    if (newAscDesc != ascDesc)
    {
      NotificationChain msgs = null;
      if (ascDesc != null)
        msgs = ((InternalEObject)ascDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SHORT_SORT_OJECT__ASC_DESC, null, msgs);
      if (newAscDesc != null)
        msgs = ((InternalEObject)newAscDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.SHORT_SORT_OJECT__ASC_DESC, null, msgs);
      msgs = basicSetAscDesc(newAscDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.SHORT_SORT_OJECT__ASC_DESC, newAscDesc, newAscDesc));
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
      case SearchPackage.SHORT_SORT_OJECT__ASC_DESC:
        return basicSetAscDesc(null, msgs);
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
      case SearchPackage.SHORT_SORT_OJECT__SORT_FIELD_NAME:
        return getSortFieldName();
      case SearchPackage.SHORT_SORT_OJECT__ASC_DESC:
        return getAscDesc();
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
      case SearchPackage.SHORT_SORT_OJECT__SORT_FIELD_NAME:
        setSortFieldName((String)newValue);
        return;
      case SearchPackage.SHORT_SORT_OJECT__ASC_DESC:
        setAscDesc((ASC_DESC)newValue);
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
      case SearchPackage.SHORT_SORT_OJECT__SORT_FIELD_NAME:
        setSortFieldName(SORT_FIELD_NAME_EDEFAULT);
        return;
      case SearchPackage.SHORT_SORT_OJECT__ASC_DESC:
        setAscDesc((ASC_DESC)null);
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
      case SearchPackage.SHORT_SORT_OJECT__SORT_FIELD_NAME:
        return SORT_FIELD_NAME_EDEFAULT == null ? sortFieldName != null : !SORT_FIELD_NAME_EDEFAULT.equals(sortFieldName);
      case SearchPackage.SHORT_SORT_OJECT__ASC_DESC:
        return ascDesc != null;
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
    result.append(" (sortFieldName: ");
    result.append(sortFieldName);
    result.append(')');
    return result.toString();
  }

} //ShortSortOjectImpl
