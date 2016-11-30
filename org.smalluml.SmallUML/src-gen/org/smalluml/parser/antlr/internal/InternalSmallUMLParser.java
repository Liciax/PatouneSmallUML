package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'}'", "'abstract'", "'Class'", "'extends'", "'attributes'", "'('", "','", "')'", "'operations'", "':'", "'Association'", "'role'", "'with'", "'['", "']'", "'Enumeration'", "'smallBoolean'", "'smallInteger'", "'smallReal'", "'smallString'", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }



     	private SmallUMLGrammarAccess grammarAccess;

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Diagram";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDiagram"
    // InternalSmallUML.g:64:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSmallUML.g:64:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSmallUML.g:65:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSmallUML.g:71:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleAbstractEntity ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleAbstractEntity ) )* otherlv_5= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleAbstractEntity ) )* otherlv_5= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleAbstractEntity ) )* otherlv_5= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleAbstractEntity ) )* otherlv_5= '}'
            {
            // InternalSmallUML.g:79:3: ()
            // InternalSmallUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiagramAccess().getDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
            		
            // InternalSmallUML.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:112:3: ( (lv_entities_4_0= ruleAbstractEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==23||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUML.g:113:4: (lv_entities_4_0= ruleAbstractEntity )
            	    {
            	    // InternalSmallUML.g:113:4: (lv_entities_4_0= ruleAbstractEntity )
            	    // InternalSmallUML.g:114:5: lv_entities_4_0= ruleAbstractEntity
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getEntitiesAbstractEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_4_0=ruleAbstractEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"org.smalluml.SmallUML.AbstractEntity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleAbstractEntity"
    // InternalSmallUML.g:139:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // InternalSmallUML.g:139:55: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // InternalSmallUML.g:140:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractEntity=ruleAbstractEntity();

            state._fsp--;

             current =iv_ruleAbstractEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // InternalSmallUML.g:146:1: ruleAbstractEntity returns [EObject current=null] : (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Association_2= ruleAssociation ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Association_2 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:152:2: ( (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Association_2= ruleAssociation ) )
            // InternalSmallUML.g:153:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Association_2= ruleAssociation )
            {
            // InternalSmallUML.g:153:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Association_2= ruleAssociation )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:154:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:163:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:172:3: this_Association_2= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getAssociationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_2=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:184:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:184:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:185:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:191:1: ruleType returns [EObject current=null] : (this_smallBoolean_0= rulesmallBoolean | this_smallInteger_1= rulesmallInteger | this_smallReal_2= rulesmallReal | this_smallString_3= rulesmallString ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_smallBoolean_0 = null;

        EObject this_smallInteger_1 = null;

        EObject this_smallReal_2 = null;

        EObject this_smallString_3 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:197:2: ( (this_smallBoolean_0= rulesmallBoolean | this_smallInteger_1= rulesmallInteger | this_smallReal_2= rulesmallReal | this_smallString_3= rulesmallString ) )
            // InternalSmallUML.g:198:2: (this_smallBoolean_0= rulesmallBoolean | this_smallInteger_1= rulesmallInteger | this_smallReal_2= rulesmallReal | this_smallString_3= rulesmallString )
            {
            // InternalSmallUML.g:198:2: (this_smallBoolean_0= rulesmallBoolean | this_smallInteger_1= rulesmallInteger | this_smallReal_2= rulesmallReal | this_smallString_3= rulesmallString )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:199:3: this_smallBoolean_0= rulesmallBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmallBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_smallBoolean_0=rulesmallBoolean();

                    state._fsp--;


                    			current = this_smallBoolean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:208:3: this_smallInteger_1= rulesmallInteger
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmallIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_smallInteger_1=rulesmallInteger();

                    state._fsp--;


                    			current = this_smallInteger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:217:3: this_smallReal_2= rulesmallReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmallRealParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_smallReal_2=rulesmallReal();

                    state._fsp--;


                    			current = this_smallReal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:226:3: this_smallString_3= rulesmallString
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSmallStringParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_smallString_3=rulesmallString();

                    state._fsp--;


                    			current = this_smallString_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:238:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:238:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:239:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:245:1: ruleClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_operations_15_0 = null;

        EObject lv_operations_17_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:251:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalSmallUML.g:252:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalSmallUML.g:252:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalSmallUML.g:253:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalSmallUML.g:253:3: ()
            // InternalSmallUML.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:260:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:261:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalSmallUML.g:261:4: (lv_abstract_1_0= 'abstract' )
                    // InternalSmallUML.g:262:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalSmallUML.g:278:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:279:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:279:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:280:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:297:3: (otherlv_4= 'extends' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:298:4: otherlv_4= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalSmallUML.g:302:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:303:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:303:5: ( ruleEString )
                    // InternalSmallUML.g:304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSmallUML.g:323:3: (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:324:4: otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSmallUML.g:332:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalSmallUML.g:333:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:333:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalSmallUML.g:334:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_9_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_9_0,
                    							"org.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:351:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:352:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:356:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:357:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:357:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSmallUML.g:358:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"org.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:381:3: (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:382:4: otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getOperationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSmallUML.g:390:4: ( (lv_operations_15_0= ruleOperation ) )
                    // InternalSmallUML.g:391:5: (lv_operations_15_0= ruleOperation )
                    {
                    // InternalSmallUML.g:391:5: (lv_operations_15_0= ruleOperation )
                    // InternalSmallUML.g:392:6: lv_operations_15_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operations_15_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_15_0,
                    							"org.smalluml.SmallUML.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:409:4: (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:410:5: otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_13); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSmallUML.g:414:5: ( (lv_operations_17_0= ruleOperation ) )
                    	    // InternalSmallUML.g:415:6: (lv_operations_17_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:415:6: (lv_operations_17_0= ruleOperation )
                    	    // InternalSmallUML.g:416:7: lv_operations_17_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_operations_17_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_17_0,
                    	    								"org.smalluml.SmallUML.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:447:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:447:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:448:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:454:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:460:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSmallUML.g:461:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSmallUML.g:461:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSmallUML.g:462:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalSmallUML.g:462:3: ()
            // InternalSmallUML.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:469:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:470:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:470:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:471:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSmallUML.g:491:3: ( (lv_type_3_0= ruleType ) )
            // InternalSmallUML.g:492:4: (lv_type_3_0= ruleType )
            {
            // InternalSmallUML.g:492:4: (lv_type_3_0= ruleType )
            // InternalSmallUML.g:493:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.smalluml.SmallUML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:514:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:514:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:515:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSmallUML.g:521:1: ruleOperation returns [EObject current=null] : ( () ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_returnType_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:527:2: ( ( () ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) )
            // InternalSmallUML.g:528:2: ( () ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            {
            // InternalSmallUML.g:528:2: ( () ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            // InternalSmallUML.g:529:3: () ( (lv_returnType_1_0= ruleType ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
            {
            // InternalSmallUML.g:529:3: ()
            // InternalSmallUML.g:530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:536:3: ( (lv_returnType_1_0= ruleType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=29 && LA10_0<=32)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:537:4: (lv_returnType_1_0= ruleType )
                    {
                    // InternalSmallUML.g:537:4: (lv_returnType_1_0= ruleType )
                    // InternalSmallUML.g:538:5: lv_returnType_1_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_returnType_1_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					set(
                    						current,
                    						"returnType",
                    						lv_returnType_1_0,
                    						"org.smalluml.SmallUML.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmallUML.g:555:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:556:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:556:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:557:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmallUML.g:578:3: ( (lv_parameters_4_0= ruleParameter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||(LA11_0>=29 && LA11_0<=32)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:579:4: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSmallUML.g:579:4: (lv_parameters_4_0= ruleParameter )
                    // InternalSmallUML.g:580:5: lv_parameters_4_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_4_0,
                    						"org.smalluml.SmallUML.Parameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmallUML.g:597:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:598:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:602:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalSmallUML.g:603:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalSmallUML.g:603:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalSmallUML.g:604:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.smalluml.SmallUML.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUML.g:630:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:630:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:631:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSmallUML.g:637:1: ruleParameter returns [EObject current=null] : ( () ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:643:2: ( ( () ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalSmallUML.g:644:2: ( () ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:644:2: ( () ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            // InternalSmallUML.g:645:3: () ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) )
            {
            // InternalSmallUML.g:645:3: ()
            // InternalSmallUML.g:646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:652:3: ( ( (lv_type_1_0= ruleType ) ) otherlv_2= ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=32)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:653:4: ( (lv_type_1_0= ruleType ) ) otherlv_2= ':'
                    {
                    // InternalSmallUML.g:653:4: ( (lv_type_1_0= ruleType ) )
                    // InternalSmallUML.g:654:5: (lv_type_1_0= ruleType )
                    {
                    // InternalSmallUML.g:654:5: (lv_type_1_0= ruleType )
                    // InternalSmallUML.g:655:6: lv_type_1_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_1_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.smalluml.SmallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:677:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:678:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:678:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:679:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:700:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:700:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:701:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:707:1: ruleAssociation returns [EObject current=null] : ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_roles_4_0 = null;

        EObject lv_roles_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:713:2: ( ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) )
            // InternalSmallUML.g:714:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            {
            // InternalSmallUML.g:714:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            // InternalSmallUML.g:715:3: () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}'
            {
            // InternalSmallUML.g:715:3: ()
            // InternalSmallUML.g:716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationAccess().getAssociationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalSmallUML.g:726:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:727:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:727:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:728:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:748:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalSmallUML.g:749:4: (lv_roles_4_0= ruleRole )
            {
            // InternalSmallUML.g:749:4: (lv_roles_4_0= ruleRole )
            // InternalSmallUML.g:750:5: lv_roles_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_roles_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_4_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:767:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmallUML.g:768:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_18); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:772:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalSmallUML.g:773:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:773:5: (lv_roles_6_0= ruleRole )
            	    // InternalSmallUML.g:774:6: lv_roles_6_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_roles_6_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_6_0,
            	    							"org.smalluml.SmallUML.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:800:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:800:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:801:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:807:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:813:2: ( ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:814:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:814:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            // InternalSmallUML.g:815:3: () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:815:3: ()
            // InternalSmallUML.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalSmallUML.g:826:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:827:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:827:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:828:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmallUML.g:844:3: ( (lv_cardinality_3_0= ruleCardinality ) )
            // InternalSmallUML.g:845:4: (lv_cardinality_3_0= ruleCardinality )
            {
            // InternalSmallUML.g:845:4: (lv_cardinality_3_0= ruleCardinality )
            // InternalSmallUML.g:846:5: lv_cardinality_3_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getCardinalityCardinalityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_cardinality_3_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_3_0,
            						"org.smalluml.SmallUML.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getWithKeyword_4());
            		
            // InternalSmallUML.g:867:3: ( ( ruleEString ) )
            // InternalSmallUML.g:868:4: ( ruleEString )
            {
            // InternalSmallUML.g:868:4: ( ruleEString )
            // InternalSmallUML.g:869:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getEntityClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:887:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:887:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:888:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUML.g:894:1: ruleCardinality returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:900:2: ( ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) )
            // InternalSmallUML.g:901:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            {
            // InternalSmallUML.g:901:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            // InternalSmallUML.g:902:3: () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']'
            {
            // InternalSmallUML.g:902:3: ()
            // InternalSmallUML.g:903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCardinalityAccess().getCardinalityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSmallUML.g:913:3: ( (lv_lowerBound_2_0= ruleEString ) )
            // InternalSmallUML.g:914:4: (lv_lowerBound_2_0= ruleEString )
            {
            // InternalSmallUML.g:914:4: (lv_lowerBound_2_0= ruleEString )
            // InternalSmallUML.g:915:5: lv_lowerBound_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_lowerBound_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCardinalityAccess().getCommaKeyword_3());
            		
            // InternalSmallUML.g:936:3: ( (lv_upperBound_4_0= ruleEString ) )
            // InternalSmallUML.g:937:4: (lv_upperBound_4_0= ruleEString )
            {
            // InternalSmallUML.g:937:4: (lv_upperBound_4_0= ruleEString )
            // InternalSmallUML.g:938:5: lv_upperBound_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_upperBound_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_4_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:963:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:963:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:964:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:970:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elements_4_0 = null;

        AntlrDatatypeRuleToken lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:976:2: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) )
            // InternalSmallUML.g:977:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            {
            // InternalSmallUML.g:977:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            // InternalSmallUML.g:978:3: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}'
            {
            // InternalSmallUML.g:978:3: ()
            // InternalSmallUML.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalSmallUML.g:989:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:990:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:990:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:991:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:1011:3: ( (lv_elements_4_0= ruleEString ) )
            // InternalSmallUML.g:1012:4: (lv_elements_4_0= ruleEString )
            {
            // InternalSmallUML.g:1012:4: (lv_elements_4_0= ruleEString )
            // InternalSmallUML.g:1013:5: lv_elements_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_elements_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:1030:3: (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:1031:4: otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:1035:4: ( (lv_elements_6_0= ruleEString ) )
            	    // InternalSmallUML.g:1036:5: (lv_elements_6_0= ruleEString )
            	    {
            	    // InternalSmallUML.g:1036:5: (lv_elements_6_0= ruleEString )
            	    // InternalSmallUML.g:1037:6: lv_elements_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_elements_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_6_0,
            	    							"org.smalluml.SmallUML.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRulesmallBoolean"
    // InternalSmallUML.g:1063:1: entryRulesmallBoolean returns [EObject current=null] : iv_rulesmallBoolean= rulesmallBoolean EOF ;
    public final EObject entryRulesmallBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmallBoolean = null;


        try {
            // InternalSmallUML.g:1063:53: (iv_rulesmallBoolean= rulesmallBoolean EOF )
            // InternalSmallUML.g:1064:2: iv_rulesmallBoolean= rulesmallBoolean EOF
            {
             newCompositeNode(grammarAccess.getSmallBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesmallBoolean=rulesmallBoolean();

            state._fsp--;

             current =iv_rulesmallBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmallBoolean"


    // $ANTLR start "rulesmallBoolean"
    // InternalSmallUML.g:1070:1: rulesmallBoolean returns [EObject current=null] : ( () otherlv_1= 'smallBoolean' ) ;
    public final EObject rulesmallBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1076:2: ( ( () otherlv_1= 'smallBoolean' ) )
            // InternalSmallUML.g:1077:2: ( () otherlv_1= 'smallBoolean' )
            {
            // InternalSmallUML.g:1077:2: ( () otherlv_1= 'smallBoolean' )
            // InternalSmallUML.g:1078:3: () otherlv_1= 'smallBoolean'
            {
            // InternalSmallUML.g:1078:3: ()
            // InternalSmallUML.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmallBooleanAccess().getSmallBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallBooleanAccess().getSmallBooleanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesmallBoolean"


    // $ANTLR start "entryRulesmallInteger"
    // InternalSmallUML.g:1093:1: entryRulesmallInteger returns [EObject current=null] : iv_rulesmallInteger= rulesmallInteger EOF ;
    public final EObject entryRulesmallInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmallInteger = null;


        try {
            // InternalSmallUML.g:1093:53: (iv_rulesmallInteger= rulesmallInteger EOF )
            // InternalSmallUML.g:1094:2: iv_rulesmallInteger= rulesmallInteger EOF
            {
             newCompositeNode(grammarAccess.getSmallIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesmallInteger=rulesmallInteger();

            state._fsp--;

             current =iv_rulesmallInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmallInteger"


    // $ANTLR start "rulesmallInteger"
    // InternalSmallUML.g:1100:1: rulesmallInteger returns [EObject current=null] : ( () otherlv_1= 'smallInteger' ) ;
    public final EObject rulesmallInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1106:2: ( ( () otherlv_1= 'smallInteger' ) )
            // InternalSmallUML.g:1107:2: ( () otherlv_1= 'smallInteger' )
            {
            // InternalSmallUML.g:1107:2: ( () otherlv_1= 'smallInteger' )
            // InternalSmallUML.g:1108:3: () otherlv_1= 'smallInteger'
            {
            // InternalSmallUML.g:1108:3: ()
            // InternalSmallUML.g:1109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmallIntegerAccess().getSmallIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallIntegerAccess().getSmallIntegerKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesmallInteger"


    // $ANTLR start "entryRulesmallReal"
    // InternalSmallUML.g:1123:1: entryRulesmallReal returns [EObject current=null] : iv_rulesmallReal= rulesmallReal EOF ;
    public final EObject entryRulesmallReal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmallReal = null;


        try {
            // InternalSmallUML.g:1123:50: (iv_rulesmallReal= rulesmallReal EOF )
            // InternalSmallUML.g:1124:2: iv_rulesmallReal= rulesmallReal EOF
            {
             newCompositeNode(grammarAccess.getSmallRealRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesmallReal=rulesmallReal();

            state._fsp--;

             current =iv_rulesmallReal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmallReal"


    // $ANTLR start "rulesmallReal"
    // InternalSmallUML.g:1130:1: rulesmallReal returns [EObject current=null] : ( () otherlv_1= 'smallReal' ) ;
    public final EObject rulesmallReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1136:2: ( ( () otherlv_1= 'smallReal' ) )
            // InternalSmallUML.g:1137:2: ( () otherlv_1= 'smallReal' )
            {
            // InternalSmallUML.g:1137:2: ( () otherlv_1= 'smallReal' )
            // InternalSmallUML.g:1138:3: () otherlv_1= 'smallReal'
            {
            // InternalSmallUML.g:1138:3: ()
            // InternalSmallUML.g:1139:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmallRealAccess().getSmallRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallRealAccess().getSmallRealKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesmallReal"


    // $ANTLR start "entryRulesmallString"
    // InternalSmallUML.g:1153:1: entryRulesmallString returns [EObject current=null] : iv_rulesmallString= rulesmallString EOF ;
    public final EObject entryRulesmallString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmallString = null;


        try {
            // InternalSmallUML.g:1153:52: (iv_rulesmallString= rulesmallString EOF )
            // InternalSmallUML.g:1154:2: iv_rulesmallString= rulesmallString EOF
            {
             newCompositeNode(grammarAccess.getSmallStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesmallString=rulesmallString();

            state._fsp--;

             current =iv_rulesmallString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmallString"


    // $ANTLR start "rulesmallString"
    // InternalSmallUML.g:1160:1: rulesmallString returns [EObject current=null] : ( () otherlv_1= 'smallString' ) ;
    public final EObject rulesmallString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1166:2: ( ( () otherlv_1= 'smallString' ) )
            // InternalSmallUML.g:1167:2: ( () otherlv_1= 'smallString' )
            {
            // InternalSmallUML.g:1167:2: ( () otherlv_1= 'smallString' )
            // InternalSmallUML.g:1168:3: () otherlv_1= 'smallString'
            {
            // InternalSmallUML.g:1168:3: ()
            // InternalSmallUML.g:1169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmallStringAccess().getSmallStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallStringAccess().getSmallStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesmallString"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:1183:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:1183:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:1184:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:1190:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1196:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:1197:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:1197:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:1198:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:1206:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:1217:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1217:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1218:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:1224:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1230:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1231:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1231:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1232:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1232:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:1233:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001080E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000222000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001E0000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001E0180030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}