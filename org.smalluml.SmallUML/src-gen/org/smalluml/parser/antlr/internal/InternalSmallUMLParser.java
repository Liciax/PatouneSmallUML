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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'}'", "'Type'", "';'", "'abstract'", "'Class'", "'extends'", "'attributes'", "'('", "','", "')'", "'operations'", "':'", "'Association'", "'role'", "'with'", "'['", "']'", "'Enumeration'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
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

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=17)||LA1_0==25||LA1_0==30) ) {
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

            if ( (LA2_0==14||(LA2_0>=16 && LA2_0<=17)||LA2_0==30) ) {
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
    // InternalSmallUML.g:182:1: ruleAbstractEntity returns [EObject current=null] : (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType ) ;
    public final EObject ruleAbstractEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:188:2: ( (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType ) )
            // InternalSmallUML.g:189:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType )
            {
            // InternalSmallUML.g:189:2: (this_Class_0= ruleClass | this_Enumeration_1= ruleEnumeration | this_Type_2= ruleType )
            int alt3=3;
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
    // InternalSmallUML.g:220:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:220:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:221:2: iv_ruleType= ruleType EOF
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
    // InternalSmallUML.g:227:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmallUML.g:233:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSmallUML.g:234:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSmallUML.g:234:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalSmallUML.g:235:3: () otherlv_1= 'Type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSmallUML.g:235:3: ()
            // InternalSmallUML.g:236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            // InternalSmallUML.g:246:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:247:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:247:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:248:5: lv_name_2_0= RULE_ID
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
    // InternalSmallUML.g:272:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:272:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:273:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUML.g:279:1: ruleClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
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
            // InternalSmallUML.g:285:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalSmallUML.g:286:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalSmallUML.g:286:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalSmallUML.g:287:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'Class' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'extends' ( ( ruleEString ) ) )? otherlv_6= '{' (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )? (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalSmallUML.g:287:3: ()
            // InternalSmallUML.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:294:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:295:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalSmallUML.g:295:4: (lv_abstract_1_0= 'abstract' )
                    // InternalSmallUML.g:296:5: lv_abstract_1_0= 'abstract'
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
            		
            // InternalSmallUML.g:312:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:313:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:313:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:314:5: lv_name_3_0= ruleEString
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

            // InternalSmallUML.g:331:3: (otherlv_4= 'extends' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:332:4: otherlv_4= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalSmallUML.g:336:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:337:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:337:5: ( ruleEString )
                    // InternalSmallUML.g:338:6: ruleEString
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
            		
            // InternalSmallUML.g:357:3: (otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:358:4: otherlv_7= 'attributes' otherlv_8= '(' ( (lv_attributes_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalSmallUML.g:366:4: ( (lv_attributes_9_0= ruleAttribute ) )
                    // InternalSmallUML.g:367:5: (lv_attributes_9_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:367:5: (lv_attributes_9_0= ruleAttribute )
                    // InternalSmallUML.g:368:6: lv_attributes_9_0= ruleAttribute
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

                    // InternalSmallUML.g:385:4: (otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:386:5: otherlv_10= ',' ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:390:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:391:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:391:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSmallUML.g:392:7: lv_attributes_11_0= ruleAttribute
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

            // InternalSmallUML.g:415:3: (otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:416:4: otherlv_13= 'operations' otherlv_14= '(' ( (lv_operations_15_0= ruleOperation ) ) (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getOperationsKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSmallUML.g:424:4: ( (lv_operations_15_0= ruleOperation ) )
                    // InternalSmallUML.g:425:5: (lv_operations_15_0= ruleOperation )
                    {
                    // InternalSmallUML.g:425:5: (lv_operations_15_0= ruleOperation )
                    // InternalSmallUML.g:426:6: lv_operations_15_0= ruleOperation
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

                    // InternalSmallUML.g:443:4: (otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:444:5: otherlv_16= ',' ( (lv_operations_17_0= ruleOperation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_8); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSmallUML.g:448:5: ( (lv_operations_17_0= ruleOperation ) )
                    	    // InternalSmallUML.g:449:6: (lv_operations_17_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:449:6: (lv_operations_17_0= ruleOperation )
                    	    // InternalSmallUML.g:450:7: lv_operations_17_0= ruleOperation
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
    // InternalSmallUML.g:481:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:481:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:482:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUML.g:488:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSmallUML.g:494:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:495:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:495:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalSmallUML.g:496:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:496:3: ()
            // InternalSmallUML.g:497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:504:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:505:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSmallUML.g:525:3: ( ( ruleEString ) )
            // InternalSmallUML.g:526:4: ( ruleEString )
            {
            // InternalSmallUML.g:526:4: ( ruleEString )
            // InternalSmallUML.g:527:5: ruleEString
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
    // InternalSmallUML.g:545:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:545:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:546:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalSmallUML.g:552:1: ruleOperation returns [EObject current=null] : ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) ;
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
            // InternalSmallUML.g:558:2: ( ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) )
            // InternalSmallUML.g:559:2: ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            {
            // InternalSmallUML.g:559:2: ( () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
            // InternalSmallUML.g:560:3: () ( ( ruleEString ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )? (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
            {
            // InternalSmallUML.g:560:3: ()
            // InternalSmallUML.g:561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:567:3: ( ( ruleEString ) )?
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
                    // InternalSmallUML.g:568:4: ( ruleEString )
                    {
                    // InternalSmallUML.g:568:4: ( ruleEString )
                    // InternalSmallUML.g:569:5: ruleEString
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

            // InternalSmallUML.g:583:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:584:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:584:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:585:5: lv_name_2_0= ruleEString
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
            		
            // InternalSmallUML.g:606:3: ( (lv_parameters_4_0= ruleParameter ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:607:4: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSmallUML.g:607:4: (lv_parameters_4_0= ruleParameter )
                    // InternalSmallUML.g:608:5: lv_parameters_4_0= ruleParameter
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

            // InternalSmallUML.g:625:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:626:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:630:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalSmallUML.g:631:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalSmallUML.g:631:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalSmallUML.g:632:6: lv_parameters_6_0= ruleParameter
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
    // InternalSmallUML.g:658:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:658:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:659:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSmallUML.g:665:1: ruleParameter returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:671:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalSmallUML.g:672:2: ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:672:2: ( () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) ) )
            // InternalSmallUML.g:673:3: () ( ( ( ruleEString ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleEString ) )
            {
            // InternalSmallUML.g:673:3: ()
            // InternalSmallUML.g:674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalSmallUML.g:680:3: ( ( ( ruleEString ) ) otherlv_2= ':' )?
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
                    // InternalSmallUML.g:681:4: ( ( ruleEString ) ) otherlv_2= ':'
                    {
                    // InternalSmallUML.g:681:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:682:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:682:5: ( ruleEString )
                    // InternalSmallUML.g:683:6: ruleEString
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

            // InternalSmallUML.g:702:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSmallUML.g:703:4: (lv_name_3_0= ruleEString )
            {
            // InternalSmallUML.g:703:4: (lv_name_3_0= ruleEString )
            // InternalSmallUML.g:704:5: lv_name_3_0= ruleEString
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
    // InternalSmallUML.g:725:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:725:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:726:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalSmallUML.g:732:1: ruleAssociation returns [EObject current=null] : ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) ;
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
            // InternalSmallUML.g:738:2: ( ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' ) )
            // InternalSmallUML.g:739:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            {
            // InternalSmallUML.g:739:2: ( () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}' )
            // InternalSmallUML.g:740:3: () otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_roles_4_0= ruleRole ) ) (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+ otherlv_7= '}'
            {
            // InternalSmallUML.g:740:3: ()
            // InternalSmallUML.g:741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationAccess().getAssociationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalSmallUML.g:751:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:752:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:752:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:753:5: lv_name_2_0= RULE_ID
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
            		
            // InternalSmallUML.g:773:3: ( (lv_roles_4_0= ruleRole ) )
            // InternalSmallUML.g:774:4: (lv_roles_4_0= ruleRole )
            {
            // InternalSmallUML.g:774:4: (lv_roles_4_0= ruleRole )
            // InternalSmallUML.g:775:5: lv_roles_4_0= ruleRole
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

            // InternalSmallUML.g:792:3: (otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) ) )+
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
            	    // InternalSmallUML.g:793:4: otherlv_5= ',' ( (lv_roles_6_0= ruleRole ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:797:4: ( (lv_roles_6_0= ruleRole ) )
            	    // InternalSmallUML.g:798:5: (lv_roles_6_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:798:5: (lv_roles_6_0= ruleRole )
            	    // InternalSmallUML.g:799:6: lv_roles_6_0= ruleRole
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
    // InternalSmallUML.g:825:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:825:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:826:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUML.g:832:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:838:2: ( ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:839:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:839:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) ) )
            // InternalSmallUML.g:840:3: () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) otherlv_4= 'with' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:840:3: ()
            // InternalSmallUML.g:841:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		
            // InternalSmallUML.g:851:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:852:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:852:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:853:5: lv_name_2_0= RULE_ID
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

            // InternalSmallUML.g:869:3: ( (lv_cardinality_3_0= ruleCardinality ) )
            // InternalSmallUML.g:870:4: (lv_cardinality_3_0= ruleCardinality )
            {
            // InternalSmallUML.g:870:4: (lv_cardinality_3_0= ruleCardinality )
            // InternalSmallUML.g:871:5: lv_cardinality_3_0= ruleCardinality
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
            		
            // InternalSmallUML.g:892:3: ( ( ruleEString ) )
            // InternalSmallUML.g:893:4: ( ruleEString )
            {
            // InternalSmallUML.g:893:4: ( ruleEString )
            // InternalSmallUML.g:894:5: ruleEString
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
    // InternalSmallUML.g:912:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalSmallUML.g:912:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalSmallUML.g:913:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalSmallUML.g:919:1: ruleCardinality returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:925:2: ( ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' ) )
            // InternalSmallUML.g:926:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            {
            // InternalSmallUML.g:926:2: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']' )
            // InternalSmallUML.g:927:3: () otherlv_1= '[' ( (lv_lowerBound_2_0= ruleEString ) ) otherlv_3= ',' ( (lv_upperBound_4_0= ruleEString ) ) otherlv_5= ']'
            {
            // InternalSmallUML.g:927:3: ()
            // InternalSmallUML.g:928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCardinalityAccess().getCardinalityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSmallUML.g:938:3: ( (lv_lowerBound_2_0= ruleEString ) )
            // InternalSmallUML.g:939:4: (lv_lowerBound_2_0= ruleEString )
            {
            // InternalSmallUML.g:939:4: (lv_lowerBound_2_0= ruleEString )
            // InternalSmallUML.g:940:5: lv_lowerBound_2_0= ruleEString
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
            		
            // InternalSmallUML.g:961:3: ( (lv_upperBound_4_0= ruleEString ) )
            // InternalSmallUML.g:962:4: (lv_upperBound_4_0= ruleEString )
            {
            // InternalSmallUML.g:962:4: (lv_upperBound_4_0= ruleEString )
            // InternalSmallUML.g:963:5: lv_upperBound_4_0= ruleEString
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
    // InternalSmallUML.g:988:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:988:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:989:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUML.g:995:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) ;
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
            // InternalSmallUML.g:1001:2: ( ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' ) )
            // InternalSmallUML.g:1002:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            {
            // InternalSmallUML.g:1002:2: ( () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}' )
            // InternalSmallUML.g:1003:3: () otherlv_1= 'Enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )* otherlv_7= '}'
            {
            // InternalSmallUML.g:1003:3: ()
            // InternalSmallUML.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalSmallUML.g:1014:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:1015:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:1015:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:1016:5: lv_name_2_0= RULE_ID
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
            		
            // InternalSmallUML.g:1036:3: ( (lv_elements_4_0= ruleEString ) )
            // InternalSmallUML.g:1037:4: (lv_elements_4_0= ruleEString )
            {
            // InternalSmallUML.g:1037:4: (lv_elements_4_0= ruleEString )
            // InternalSmallUML.g:1038:5: lv_elements_4_0= ruleEString
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

            // InternalSmallUML.g:1055:3: (otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:1056:4: otherlv_5= ',' ( (lv_elements_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmallUML.g:1060:4: ( (lv_elements_6_0= ruleEString ) )
            	    // InternalSmallUML.g:1061:5: (lv_elements_6_0= ruleEString )
            	    {
            	    // InternalSmallUML.g:1061:5: (lv_elements_6_0= ruleEString )
            	    // InternalSmallUML.g:1062:6: lv_elements_6_0= ruleEString
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


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:1088:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:1088:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:1089:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:1095:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1101:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:1102:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:1102:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmallUML.g:1103:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:1111:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000042036000L});
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

}