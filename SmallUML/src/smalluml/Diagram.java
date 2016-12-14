/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Diagram is the root element of a SmallUML Diagram, and contains all the elements of a diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Diagram#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.DiagramEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements contained in the diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getDiagram_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramEntity> getEntities();

} // Diagram
