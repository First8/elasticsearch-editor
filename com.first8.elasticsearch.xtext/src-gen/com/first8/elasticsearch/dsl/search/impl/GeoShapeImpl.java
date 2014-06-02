/**
 */
package com.first8.elasticsearch.dsl.search.impl;

import com.first8.elasticsearch.dsl.search.GeoShape;
import com.first8.elasticsearch.dsl.search.SearchPackage;
import com.first8.elasticsearch.dsl.search.Shape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link com.first8.elasticsearch.dsl.search.impl.GeoShapeImpl#getIndexedShape <em>Indexed Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoShapeImpl extends GeoShapeObjectImpl implements GeoShape
{
  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected Shape shape;

  /**
   * The default value of the '{@link #getIndexedShape() <em>Indexed Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexedShape()
   * @generated
   * @ordered
   */
  protected static final String INDEXED_SHAPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndexedShape() <em>Indexed Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexedShape()
   * @generated
   * @ordered
   */
  protected String indexedShape = INDEXED_SHAPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeoShapeImpl()
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
    return SearchPackage.eINSTANCE.getGeoShape();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShape(Shape newShape, NotificationChain msgs)
  {
    Shape oldShape = shape;
    shape = newShape;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_SHAPE__SHAPE, oldShape, newShape);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(Shape newShape)
  {
    if (newShape != shape)
    {
      NotificationChain msgs = null;
      if (shape != null)
        msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_SHAPE__SHAPE, null, msgs);
      if (newShape != null)
        msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SearchPackage.GEO_SHAPE__SHAPE, null, msgs);
      msgs = basicSetShape(newShape, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_SHAPE__SHAPE, newShape, newShape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndexedShape()
  {
    return indexedShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexedShape(String newIndexedShape)
  {
    String oldIndexedShape = indexedShape;
    indexedShape = newIndexedShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SearchPackage.GEO_SHAPE__INDEXED_SHAPE, oldIndexedShape, indexedShape));
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
      case SearchPackage.GEO_SHAPE__SHAPE:
        return basicSetShape(null, msgs);
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
      case SearchPackage.GEO_SHAPE__SHAPE:
        return getShape();
      case SearchPackage.GEO_SHAPE__INDEXED_SHAPE:
        return getIndexedShape();
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
      case SearchPackage.GEO_SHAPE__SHAPE:
        setShape((Shape)newValue);
        return;
      case SearchPackage.GEO_SHAPE__INDEXED_SHAPE:
        setIndexedShape((String)newValue);
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
      case SearchPackage.GEO_SHAPE__SHAPE:
        setShape((Shape)null);
        return;
      case SearchPackage.GEO_SHAPE__INDEXED_SHAPE:
        setIndexedShape(INDEXED_SHAPE_EDEFAULT);
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
      case SearchPackage.GEO_SHAPE__SHAPE:
        return shape != null;
      case SearchPackage.GEO_SHAPE__INDEXED_SHAPE:
        return INDEXED_SHAPE_EDEFAULT == null ? indexedShape != null : !INDEXED_SHAPE_EDEFAULT.equals(indexedShape);
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
    result.append(" (indexedShape: ");
    result.append(indexedShape);
    result.append(')');
    return result.toString();
  }

} //GeoShapeImpl
