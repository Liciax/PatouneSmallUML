/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Timestamp#getHours <em>Hours</em>}</li>
 *   <li>{@link smalluml.Timestamp#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link smalluml.Timestamp#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getTimestamp()
 * @model
 * @generated
 */
public interface Timestamp extends Type {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see smalluml.SmallumlPackage#getTimestamp_Hours()
	 * @model
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link smalluml.Timestamp#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see smalluml.SmallumlPackage#getTimestamp_Minutes()
	 * @model
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link smalluml.Timestamp#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see smalluml.SmallumlPackage#getTimestamp_Seconds()
	 * @model
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link smalluml.Timestamp#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

} // Timestamp
