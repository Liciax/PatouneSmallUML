/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.smalluml.services.SmallUMLGrammarAccess;
import smalluml.Association;
import smalluml.Attribute;
import smalluml.Cardinality;
import smalluml.Diagram;
import smalluml.Enumeration;
import smalluml.Operation;
import smalluml.Role;
import smalluml.SmallumlPackage;
import smalluml.Type;

@SuppressWarnings("all")
public class SmallUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallumlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallumlPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case SmallumlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallumlPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case SmallumlPackage.CLASS:
				sequence_Class(context, (smalluml.Class) semanticObject); 
				return; 
			case SmallumlPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case SmallumlPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case SmallumlPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case SmallumlPackage.PARAMETER:
				sequence_Parameter(context, (smalluml.Parameter) semanticObject); 
				return; 
			case SmallumlPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SmallumlPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DiagramEntity returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (name=ID roles+=Role roles+=Role+)
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=[AbstractEntity|EString])
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAbstractEntityEStringParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Cardinality returns Cardinality
	 *
	 * Constraint:
	 *     (lowerBound=EString upperBound=EString)
	 */
	protected void sequence_Cardinality(ISerializationContext context, Cardinality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.CARDINALITY__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.CARDINALITY__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.CARDINALITY__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.CARDINALITY__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCardinalityAccess().getLowerBoundEStringParserRuleCall_2_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getCardinalityAccess().getUpperBoundEStringParserRuleCall_4_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DiagramEntity returns Class
	 *     AbstractEntity returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=EString 
	 *         extends=[Class|EString]? 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (operations+=Operation operations+=Operation*)?
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, smalluml.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Diagram returns Diagram
	 *
	 * Constraint:
	 *     (name=ID entities+=DiagramEntity*)
	 */
	protected void sequence_Diagram(ISerializationContext context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DiagramEntity returns Enumeration
	 *     AbstractEntity returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID elements+=EString elements+=EString*)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (returnType=[AbstractEntity|EString]? name=EString parameters+=Parameter? parameters+=Parameter*)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=[AbstractEntity|EString]? name=EString)
	 */
	protected void sequence_Parameter(ISerializationContext context, smalluml.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=ID cardinality=Cardinality entity=[Class|EString])
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__CARDINALITY));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getCardinalityCardinalityParserRuleCall_3_0(), semanticObject.getCardinality());
		feeder.accept(grammarAccess.getRoleAccess().getEntityClassEStringParserRuleCall_5_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DiagramEntity returns Type
	 *     AbstractEntity returns Type
	 *     Type returns Type
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
