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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'}'", "'Type'", "';'", "'abstract'", "'Class'", "'extends'", "'attributes'", "'('", "','", "')'", "'operations'", "':'", "'Association'", "'role'", "'with'", "'['", "']'", "'Enumeration'", "'Date'", "'day'", "'month'", "'year'", "'timestamp'", "'Timestamp'", "'hours'", "'minutes'", "'seconds'", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
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
    // InternalSmallUML.g:71:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleDiagramEntity ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleDiagramEntity ) )* otherlv_5= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleDiagramEntity ) )* otherlv_5= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleDiagramEntity ) )* otherlv_5= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleDiagramEntity ) )* otherlv_5= '}'
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
            		
            // InternalSmallUML.g:112:3: ( (lv_entities_4_0= ruleDiagramEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=17)||LA1_0==25||(LA1_0>=30 && LA1_0<=31)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUML.g:113:4: (lv_entities_4_0= ruleDiagramEntity )
            	    {
            	    // InternalSmallUML.g:113:4: (lv_entities_4_0= ruleDiagramEntity )
            	    // InternalSmallUML.g:114:5: lv_entities_4_0= ruleDiagramEntity
            	    {

            	    					newCompositeNode(grammarAccess.getDiagramAccess().getEntitiesDiagramEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_4_0=ruleDiagramEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"org.smalluml.SmallUML.DiagramEntity");
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


    // $ANTLR start "entryRuleDiagramEntity"
    // InternalSmallUML.g:139:1: entryRuleDiagramEntity returns [EObject current=null] : iv_ruleDiagramEntity= ruleDiagramEntity EOF ;
    public final EObject entryRuleDiagramEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagramEntity = null;


        try {
            // InternalSmallUML.g:139:54: (iv_ruleDiagramEntity= ruleDiagramEntity EOF )
            // InternalSmallUML.g:140:2: iv_ruleDiagramEntity= ruleDiagramEntity EOF
            {
             newCompositeNode(grammarAccess.getDiagramEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagramEntity=ruleDiagramEntity();

            state._fsp--;

             current =iv_ruleDiagramEntity; 
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
    // $ANTLR end "entryRuleDiagramEntity"


    // $ANTLR start "ruleDiagramEntity"
    // InternalSmallUML.g:146:1: ruleDiagramEntity returns [EObject current=null] : (this_AbstractEntity_0= ruleAbstractEntity | this_Association_1= ruleAssociation ) ;
    public final EObject ruleDiagramEntity() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractEntity_0 = null;

        EObject this_Association_1 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:152:2: ( (this_AbstractEntity_0= ruleAbstractEntity | this_Association_1= ruleAssociation ) )
            // InternalSmallUML.g:153:2: (this_AbstractEntity_0= ruleAbstractEntity | this_Association_1= ruleAssociation )
            {
            // InternalSmallUML.g:153:2: (this_AbstractEntity_0= ruleAbstractEntity | this_Association_1= ruleAssociation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||(LA2_0>=16 && LA2_0<=17)||(LA2_0>=30 && LA2_0<=31)||LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:154:3: this_AbstractEntity_0= ruleAbstractEntity
                    {

                    			newCompositeNode(grammarAccess.getDiagramEntityAccess().getAbstractEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractEntity_0=ruleAbstractEntity();

                    state._fsp--;


                    			current = this_AbstractEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:163:3: this_Association_1= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getDiagramEntityAccess().getAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_1;
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
    // $ANTLR end "ruleDiagramEntity"


    // $ANTLR start "entryRuleAbstractEntity"
    // InternalSmallUML.g:175:1: entryRuleAbstractEntity returns [EObject current=null] : iv_ruleAbstractEntity= ruleAbstractEntity EOF ;
    public final EObject entryRuleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntity = null;


        try {
            // InternalSmallUML.g:175:55: (iv_ruleAbstractEntity= ruleAbstractEntity EOF )
            // InternalSmallUML.g:176:2: iv_ruleAbstractEntity= ruleAbstractEntity EOF
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
    // InternalSmallUML.g:182:1: ruleAbstractEntity returns [EObject current=null] : (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType | this_Date_3= ruleDate | this_Timestamp_4= ruleTimestamp ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Type_2 = null;

        EObject this_Date_3 = null;

        EObject this_Timestamp_4 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:188:2: ( (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType | this_Date_3= ruleDate | this_Timestamp_4= ruleTimestamp ) )
            // InternalSmallUML.g:189:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType | this_Date_3= ruleDate | this_Timestamp_4= ruleTimestamp )
            {
            // InternalSmallUML.g:189:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType | this_Date_3= ruleDate | this_Timestamp_4= ruleTimestamp )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:190:3: this_Class_0= ruleClass
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
                    // InternalSmallUML.g:199:3: this_Enumeration_1= ruleEnumeration
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
                    // InternalSmallUML.g:208:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current = this_Type_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:217:3: this_Date_3= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getDateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_3=ruleDate();

                    state._fsp--;


                    			current = this_Date_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:226:3: this_Timestamp_4= ruleTimestamp
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntityAccess().getTimestampParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timestamp_4=ruleTimestamp();

                    state._fsp--;


                    			current = this_Timestamp_4;
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
    // InternalSmallUML.g:238:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:238:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:239:2: iv_ruleType= ruleType EOF
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
    // InternalSmallUML.g:245:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmallUML.g:251:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSmallUML.g:252:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSmallUML.g:252:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalSmallUML.g:253:3: () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSmallUML.g:253:3: ()
            // InternalSmallUML.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            // InternalSmallUML.g:264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:265:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:266:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getSemicolonKeyword_3());
            		

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
    // InternalSmallUML.g:290:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:290:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:291:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUML.g:297:1: ruleClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
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
            // InternalSmallUML.g:303:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalSmallUML.g:304:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalSmallUML.g:304:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalSmallUML.g:305:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalSmallUML.g:305:3: ()
            // InternalSmallUML.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:312:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:313:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalSmallUML.g:313:4: (lv_abstract_1_0= 'abstract' )
                    // InternalSmallUML.g:314:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalSmallUML.g:330:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:331:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:331:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:332:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalSmallUML.g:349:3: (otherlv_4= 'extends' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:350:4: otherlv_4= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalSmallUML.g:354:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:355:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:355:5: ( ruleEString )
                    // InternalSmallUML.g:356:6: ruleEString
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

            otherlv_6=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSmallUML.g:375:3: (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:376:4: otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSmallUML.g:384:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalSmallUML.g:385:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:385:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalSmallUML.g:386:6: lv_attributes_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalSmallUML.g:403:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:404:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:408:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:409:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:409:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSmallUML.g:410:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

                    otherlv_12=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:433:3: (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:434:4: otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getOperationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSmallUML.g:442:4: ( (lv_operations_15_0= ruleOperation ) )
                    // InternalSmallUML.g:443:5: (lv_operations_15_0= ruleOperation )
                    {
                    // InternalSmallUML.g:443:5: (lv_operations_15_0= ruleOperation )
                    // InternalSmallUML.g:444:6: lv_operations_15_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalSmallUML.g:461:4: (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:462:5: otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_8); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSmallUML.g:466:5: ( (lv_operations_17_0= ruleOperation ) )
                    	    // InternalSmallUML.g:467:6: (lv_operations_17_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:467:6: (lv_operations_17_0= ruleOperation )
                    	    // InternalSmallUML.g:468:7: lv_operations_17_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

                    otherlv_18=(Token)match(input,22,FOLLOW_14); 

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
    // InternalSmallUML.g:499:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:499:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:500:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUML.g:506:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSmallUML.g:512:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:513:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:513:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalSmallUML.g:514:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:514:3: ()
            // InternalSmallUML.g:515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:522:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:523:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSmallUML.g:543:3: ( ( ruleEString ) )
            // InternalSmallUML.g:544:4: ( ruleEString )
            {
            // InternalSmallUML.g:544:4: ( ruleEString )
            // InternalSmallUML.g:545:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractEntityCrossReference_3_0());
            				
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:563:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:563:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:564:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalSmallUML.g:570:1: ruleOperation returns [EObject current=null] : ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:576:2: ( ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) )
            // InternalSmallUML.g:577:2: ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            {
            // InternalSmallUML.g:577:2: ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            // InternalSmallUML.g:578:3: () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
            {
            // InternalSmallUML.g:578:3: ()
            // InternalSmallUML.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:585:3: ( ( ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=RULE_ID && LA10_1<=RULE_STRING)) ) {
                    alt10=1;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=RULE_ID && LA10_2<=RULE_STRING)) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:586:4: ( ruleEString )
                    {
                    // InternalSmallUML.g:586:4: ( ruleEString )
                    // InternalSmallUML.g:587:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeAbstractEntityCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmallUML.g:601:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:602:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:602:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:603:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmallUML.g:624:3: ( (lv_parameters_4_0= ruleParameter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:625:4: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSmallUML.g:625:4: (lv_parameters_4_0= ruleParameter )
                    // InternalSmallUML.g:626:5: lv_parameters_4_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
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

            // InternalSmallUML.g:643:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:644:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:648:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalSmallUML.g:649:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalSmallUML.g:649:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalSmallUML.g:650:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSmallUML.g:676:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:676:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:677:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSmallUML.g:683:1: ruleParameter returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:689:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalSmallUML.g:690:2: ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:690:2: ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            // InternalSmallUML.g:691:3: () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) )
            {
            // InternalSmallUML.g:691:3: ()
            // InternalSmallUML.g:692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:698:3: ( ( ( ruleEString ) ) otherlv_2= ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==24) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==24) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:699:4: ( ( ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalSmallUML.g:699:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:700:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:700:5: ( ruleEString )
                    // InternalSmallUML.g:701:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeAbstractEntityCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:720:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:721:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:721:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:722:5: lv_name_3_0= ruleEString
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
    // InternalSmallUML.g:743:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:743:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:744:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalSmallUML.g:750:1: ruleAssociation returns [EObject current=null] : ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) ;
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
            // InternalSmallUML.g:756:2: ( ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) )
            // InternalSmallUML.g:757:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            {
            // InternalSmallUML.g:757:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            // InternalSmallUML.g:758:3: () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}'
            {
            // InternalSmallUML.g:758:3: ()
            // InternalSmallUML.g:759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationAccess().getAssociationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalSmallUML.g:769:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:770:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:770:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:771:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:791:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalSmallUML.g:792:4: (lv_roles_4_0= ruleRole )
            {
            // InternalSmallUML.g:792:4: (lv_roles_4_0= ruleRole )
            // InternalSmallUML.g:793:5: lv_roles_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalSmallUML.g:810:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmallUML.g:811:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:815:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalSmallUML.g:816:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:816:5: (lv_roles_6_0= ruleRole )
            	    // InternalSmallUML.g:817:6: lv_roles_6_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalSmallUML.g:843:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:843:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:844:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUML.g:850:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:856:2: ( ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:857:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:857:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            // InternalSmallUML.g:858:3: () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:858:3: ()
            // InternalSmallUML.g:859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalSmallUML.g:869:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:870:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:870:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:871:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalSmallUML.g:887:3: ( (lv_cardinality_3_0= ruleCardinality ) )
            // InternalSmallUML.g:888:4: (lv_cardinality_3_0= ruleCardinality )
            {
            // InternalSmallUML.g:888:4: (lv_cardinality_3_0= ruleCardinality )
            // InternalSmallUML.g:889:5: lv_cardinality_3_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getCardinalityCardinalityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getWithKeyword_4());
            		
            // InternalSmallUML.g:910:3: ( ( ruleEString ) )
            // InternalSmallUML.g:911:4: ( ruleEString )
            {
            // InternalSmallUML.g:911:4: ( ruleEString )
            // InternalSmallUML.g:912:5: ruleEString
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
    // InternalSmallUML.g:930:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:930:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:931:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSmallUML.g:937:1: ruleCardinality returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:943:2: ( ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) )
            // InternalSmallUML.g:944:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            {
            // InternalSmallUML.g:944:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            // InternalSmallUML.g:945:3: () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']'
            {
            // InternalSmallUML.g:945:3: ()
            // InternalSmallUML.g:946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCardinalityAccess().getCardinalityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSmallUML.g:956:3: ( (lv_lowerBound_2_0= ruleEString ) )
            // InternalSmallUML.g:957:4: (lv_lowerBound_2_0= ruleEString )
            {
            // InternalSmallUML.g:957:4: (lv_lowerBound_2_0= ruleEString )
            // InternalSmallUML.g:958:5: lv_lowerBound_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCardinalityAccess().getCommaKeyword_3());
            		
            // InternalSmallUML.g:979:3: ( (lv_upperBound_4_0= ruleEString ) )
            // InternalSmallUML.g:980:4: (lv_upperBound_4_0= ruleEString )
            {
            // InternalSmallUML.g:980:4: (lv_upperBound_4_0= ruleEString )
            // InternalSmallUML.g:981:5: lv_upperBound_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSmallUML.g:1006:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:1006:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:1007:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUML.g:1013:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) ;
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
            // InternalSmallUML.g:1019:2: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) )
            // InternalSmallUML.g:1020:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            {
            // InternalSmallUML.g:1020:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            // InternalSmallUML.g:1021:3: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}'
            {
            // InternalSmallUML.g:1021:3: ()
            // InternalSmallUML.g:1022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalSmallUML.g:1032:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:1033:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:1033:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:1034:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:1054:3: ( (lv_elements_4_0= ruleEString ) )
            // InternalSmallUML.g:1055:4: (lv_elements_4_0= ruleEString )
            {
            // InternalSmallUML.g:1055:4: (lv_elements_4_0= ruleEString )
            // InternalSmallUML.g:1056:5: lv_elements_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalSmallUML.g:1073:3: (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:1074:4: otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:1078:4: ( (lv_elements_6_0= ruleEString ) )
            	    // InternalSmallUML.g:1079:5: (lv_elements_6_0= ruleEString )
            	    {
            	    // InternalSmallUML.g:1079:5: (lv_elements_6_0= ruleEString )
            	    // InternalSmallUML.g:1080:6: lv_elements_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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


    // $ANTLR start "entryRuleDate"
    // InternalSmallUML.g:1106:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSmallUML.g:1106:45: (iv_ruleDate= ruleDate EOF )
            // InternalSmallUML.g:1107:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSmallUML.g:1113:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )? (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )? (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )? (otherlv_10= 'timestamp' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_day_5_0 = null;

        AntlrDatatypeRuleToken lv_month_7_0 = null;

        AntlrDatatypeRuleToken lv_year_9_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1119:2: ( ( () otherlv_1= 'Date' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )? (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )? (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )? (otherlv_10= 'timestamp' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalSmallUML.g:1120:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )? (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )? (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )? (otherlv_10= 'timestamp' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:1120:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )? (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )? (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )? (otherlv_10= 'timestamp' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalSmallUML.g:1121:3: () otherlv_1= 'Date' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )? (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )? (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )? (otherlv_10= 'timestamp' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalSmallUML.g:1121:3: ()
            // InternalSmallUML.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateAccess().getDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
            		
            // InternalSmallUML.g:1132:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:1133:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:1133:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:1134:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:1154:3: (otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:1155:4: otherlv_4= 'day' ( (lv_day_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getDateAccess().getDayKeyword_4_0());
                    			
                    // InternalSmallUML.g:1159:4: ( (lv_day_5_0= ruleEString ) )
                    // InternalSmallUML.g:1160:5: (lv_day_5_0= ruleEString )
                    {
                    // InternalSmallUML.g:1160:5: (lv_day_5_0= ruleEString )
                    // InternalSmallUML.g:1161:6: lv_day_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateAccess().getDayEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_day_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateRule());
                    						}
                    						set(
                    							current,
                    							"day",
                    							lv_day_5_0,
                    							"org.smalluml.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:1179:3: (otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:1180:4: otherlv_6= 'month' ( (lv_month_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDateAccess().getMonthKeyword_5_0());
                    			
                    // InternalSmallUML.g:1184:4: ( (lv_month_7_0= ruleEString ) )
                    // InternalSmallUML.g:1185:5: (lv_month_7_0= ruleEString )
                    {
                    // InternalSmallUML.g:1185:5: (lv_month_7_0= ruleEString )
                    // InternalSmallUML.g:1186:6: lv_month_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateAccess().getMonthEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_month_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateRule());
                    						}
                    						set(
                    							current,
                    							"month",
                    							lv_month_7_0,
                    							"org.smalluml.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:1204:3: (otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmallUML.g:1205:4: otherlv_8= 'year' ( (lv_year_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getDateAccess().getYearKeyword_6_0());
                    			
                    // InternalSmallUML.g:1209:4: ( (lv_year_9_0= ruleEString ) )
                    // InternalSmallUML.g:1210:5: (lv_year_9_0= ruleEString )
                    {
                    // InternalSmallUML.g:1210:5: (lv_year_9_0= ruleEString )
                    // InternalSmallUML.g:1211:6: lv_year_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateAccess().getYearEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_year_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateRule());
                    						}
                    						set(
                    							current,
                    							"year",
                    							lv_year_9_0,
                    							"org.smalluml.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:1229:3: (otherlv_10= 'timestamp' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmallUML.g:1230:4: otherlv_10= 'timestamp' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDateAccess().getTimestampKeyword_7_0());
                    			
                    // InternalSmallUML.g:1234:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:1235:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:1235:5: ( ruleEString )
                    // InternalSmallUML.g:1236:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDateAccess().getTimestampTimestampCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDateAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleTimestamp"
    // InternalSmallUML.g:1259:1: entryRuleTimestamp returns [EObject current=null] : iv_ruleTimestamp= ruleTimestamp EOF ;
    public final EObject entryRuleTimestamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimestamp = null;


        try {
            // InternalSmallUML.g:1259:50: (iv_ruleTimestamp= ruleTimestamp EOF )
            // InternalSmallUML.g:1260:2: iv_ruleTimestamp= ruleTimestamp EOF
            {
             newCompositeNode(grammarAccess.getTimestampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimestamp=ruleTimestamp();

            state._fsp--;

             current =iv_ruleTimestamp; 
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
    // $ANTLR end "entryRuleTimestamp"


    // $ANTLR start "ruleTimestamp"
    // InternalSmallUML.g:1266:1: ruleTimestamp returns [EObject current=null] : ( () otherlv_1= 'Timestamp' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )? (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )? (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleTimestamp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_hours_5_0 = null;

        AntlrDatatypeRuleToken lv_minutes_7_0 = null;

        AntlrDatatypeRuleToken lv_seconds_9_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1272:2: ( ( () otherlv_1= 'Timestamp' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )? (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )? (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )? otherlv_10= '}' ) )
            // InternalSmallUML.g:1273:2: ( () otherlv_1= 'Timestamp' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )? (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )? (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            {
            // InternalSmallUML.g:1273:2: ( () otherlv_1= 'Timestamp' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )? (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )? (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            // InternalSmallUML.g:1274:3: () otherlv_1= 'Timestamp' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )? (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )? (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )? otherlv_10= '}'
            {
            // InternalSmallUML.g:1274:3: ()
            // InternalSmallUML.g:1275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimestampAccess().getTimestampAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTimestampAccess().getTimestampKeyword_1());
            		
            // InternalSmallUML.g:1285:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:1286:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:1286:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:1287:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTimestampAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimestampRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getTimestampAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:1307:3: (otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmallUML.g:1308:4: otherlv_4= 'hours' ( (lv_hours_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimestampAccess().getHoursKeyword_4_0());
                    			
                    // InternalSmallUML.g:1312:4: ( (lv_hours_5_0= ruleEInt ) )
                    // InternalSmallUML.g:1313:5: (lv_hours_5_0= ruleEInt )
                    {
                    // InternalSmallUML.g:1313:5: (lv_hours_5_0= ruleEInt )
                    // InternalSmallUML.g:1314:6: lv_hours_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTimestampAccess().getHoursEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_hours_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimestampRule());
                    						}
                    						set(
                    							current,
                    							"hours",
                    							lv_hours_5_0,
                    							"org.smalluml.SmallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:1332:3: (otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmallUML.g:1333:4: otherlv_6= 'minutes' ( (lv_minutes_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimestampAccess().getMinutesKeyword_5_0());
                    			
                    // InternalSmallUML.g:1337:4: ( (lv_minutes_7_0= ruleEInt ) )
                    // InternalSmallUML.g:1338:5: (lv_minutes_7_0= ruleEInt )
                    {
                    // InternalSmallUML.g:1338:5: (lv_minutes_7_0= ruleEInt )
                    // InternalSmallUML.g:1339:6: lv_minutes_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTimestampAccess().getMinutesEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_minutes_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimestampRule());
                    						}
                    						set(
                    							current,
                    							"minutes",
                    							lv_minutes_7_0,
                    							"org.smalluml.SmallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:1357:3: (otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSmallUML.g:1358:4: otherlv_8= 'seconds' ( (lv_seconds_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getTimestampAccess().getSecondsKeyword_6_0());
                    			
                    // InternalSmallUML.g:1362:4: ( (lv_seconds_9_0= ruleEInt ) )
                    // InternalSmallUML.g:1363:5: (lv_seconds_9_0= ruleEInt )
                    {
                    // InternalSmallUML.g:1363:5: (lv_seconds_9_0= ruleEInt )
                    // InternalSmallUML.g:1364:6: lv_seconds_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTimestampAccess().getSecondsEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_seconds_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimestampRule());
                    						}
                    						set(
                    							current,
                    							"seconds",
                    							lv_seconds_9_0,
                    							"org.smalluml.SmallUML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTimestampAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTimestamp"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:1390:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:1390:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:1391:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:1397:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1403:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:1404:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:1404:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmallUML.g:1405:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:1413:3: this_ID_1= RULE_ID
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
    // InternalSmallUML.g:1424:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1424:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1425:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:1431:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1437:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1438:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1438:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1439:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1439:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmallUML.g:1440:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_31); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000010C2036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000882000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000F00002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E00002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000E000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}