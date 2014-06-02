/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.KeyValueField;
import com.first8.elasticsearch.dsl.search.SearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.KeyValueFieldImpl#getKeyField <em>Key Field</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.KeyValueFieldImpl#getValueField <em>Value Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValueFieldImpl extends MinimalEObjectImpl.Container implements KeyValueField
{
  /**
   * The default value of the '{@link #getKeyField() <em>Key Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyField()
   * @generated
   * @ordered
   */
  protected static final String KEY_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyField() <em>Key Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyField()
   * @generated
   * @ordered
   */
  protected String keyField = KEY_FIELD_EDEFAULT;

  /**
   * The default value of the '{@link #getValueField() <em>Value Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueField()
   * @generated
   * @ordered
   */
  protected static final String VALUE_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueField() <em>Value Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueField()
   * @generated
   * @ordered
   */
  protected String valueField = VALUE_FIELD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyValueFieldImpl()
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
    return SearchPackage.eINSTANCE.getKeyValueField();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKeyField()
  {
    return keyField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyField(String newKeyField)
  {
    String oldKeyField = keyField;
    keyField = newKeyField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.KEY_VALUE_FIELD__KEY_FIELD, oldKeyField, keyField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueField()
  {
    return valueField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueField(String newValueField)
  {
    String oldValueField = valueField;
    valueField = newValueField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.KEY_VALUE_FIELD__VALUE_FIELD, oldValueField, valueField));
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
      case SearchPackage.KEY_VALUE_FIELD__KEY_FIELD:
        return getKeyField();
      case SearchPackage.KEY_VALUE_FIELD__VALUE_FIELD:
        return getValueField();
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
      case SearchPackage.KEY_VALUE_FIELD__KEY_FIELD:
        setKeyField((String)newValue);
        return;
      case SearchPackage.KEY_VALUE_FIELD__VALUE_FIELD:
        setValueField((String)newValue);
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
      case SearchPackage.KEY_VALUE_FIELD__KEY_FIELD:
        setKeyField(KEY_FIELD_EDEFAULT);
        return;
      case SearchPackage.KEY_VALUE_FIELD__VALUE_FIELD:
        setValueField(VALUE_FIELD_EDEFAULT);
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
      case SearchPackage.KEY_VALUE_FIELD__KEY_FIELD:
        return KEY_FIELD_EDEFAULT == null ? keyField != null : !KEY_FIELD_EDEFAULT.equals(keyField);
      case SearchPackage.KEY_VALUE_FIELD__VALUE_FIELD:
        return VALUE_FIELD_EDEFAULT == null ? valueField != null : !VALUE_FIELD_EDEFAULT.equals(valueField);
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
    result.append(" (keyField: ");
    result.append(keyField);
    result.append(", valueField: ");
    result.append(valueField);
    result.append(')');
    return result.toString();
  }

} //KeyValueFieldImpl
