/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.Array;
import com.first8.elasticsearch.dsl.search.Fields;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fields</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.FieldsImpl#getSelectfields <em>Selectfields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldsImpl extends MinimalEObjectImpl.Container implements Fields
{
  /**
   * The cached value of the '{@link #getSelectfields() <em>Selectfields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectfields()
   * @generated
   * @ordered
   */
  protected Array selectfields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldsImpl()
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
    return SearchPackage.eINSTANCE.getFields();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array getSelectfields()
  {
    return selectfields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectfields(Array newSelectfields, NotificationChain msgs)
  {
    Array oldSelectfields = selectfields;
    selectfields = newSelectfields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.FIELDS__SELECTFIELDS, oldSelectfields, newSelectfields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectfields(Array newSelectfields)
  {
    if (newSelectfields != selectfields)
    {
      NotificationChain msgs = null;
      if (selectfields != null)
        msgs = ((InternalEObject)selectfields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FIELDS__SELECTFIELDS, null, msgs);
      if (newSelectfields != null)
        msgs = ((InternalEObject)newSelectfields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.FIELDS__SELECTFIELDS, null, msgs);
      msgs = basicSetSelectfields(newSelectfields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.FIELDS__SELECTFIELDS, newSelectfields, newSelectfields));
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
      case SearchPackage.FIELDS__SELECTFIELDS:
        return basicSetSelectfields(null, msgs);
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
      case SearchPackage.FIELDS__SELECTFIELDS:
        return getSelectfields();
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
      case SearchPackage.FIELDS__SELECTFIELDS:
        setSelectfields((Array)newValue);
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
      case SearchPackage.FIELDS__SELECTFIELDS:
        setSelectfields((Array)null);
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
      case SearchPackage.FIELDS__SELECTFIELDS:
        return selectfields != null;
    }
    return super.eIsSet(featureID);
  }

} //FieldsImpl
