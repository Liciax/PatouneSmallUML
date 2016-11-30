package org.smalluml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'}'", "'Type'", "';'", "'Class'", "'extends'", "'attributes'", "'('", "')'", "','", "'operations'", "':'", "'Association'", "'role'", "'with'", "'['", "']'", "'Enumeration'", "'Date'", "'day'", "'month'", "'year'", "'timestamp'", "'Timestamp'", "'hours'", "'minutes'", "'seconds'", "'-'", "'abstract'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDiagram"
    // InternalSmallUML.g:53:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( ruleDiagram EOF )
            // InternalSmallUML.g:55:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSmallUML.g:62:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__Diagram__Group__0 ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__Diagram__Group__0 ) )
            // InternalSmallUML.g:68:3: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // InternalSmallUML.g:69:3: ( rule__Diagram__Group__0 )
            // InternalSmallUML.g:69:4: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleDiagramEntity"
    // InternalSmallUML.g:78:1: entryRuleDiagramEntity : ruleDiagramEntity EOF ;
    public final void entryRuleDiagramEntity() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleDiagramEntity EOF )
            // InternalSmallUML.g:80:1: ruleDiagramEntity EOF
            {
             before(grammarAccess.getDiagramEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleDiagramEntity();

            state._fsp--;

             after(grammarAccess.getDiagramEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiagramEntity"


    // $ANTLR start "ruleDiagramEntity"
    // InternalSmallUML.g:87:1: ruleDiagramEntity : ( ( rule__DiagramEntity__Alternatives ) ) ;
    public final void ruleDiagramEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__DiagramEntity__Alternatives ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__DiagramEntity__Alternatives ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__DiagramEntity__Alternatives ) )
            // InternalSmallUML.g:93:3: ( rule__DiagramEntity__Alternatives )
            {
             before(grammarAccess.getDiagramEntityAccess().getAlternatives()); 
            // InternalSmallUML.g:94:3: ( rule__DiagramEntity__Alternatives )
            // InternalSmallUML.g:94:4: rule__DiagramEntity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DiagramEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDiagramEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagramEntity"


    // $ANTLR start "entryRuleAbstractEntity"
    // InternalSmallUML.g:103:1: entryRuleAbstractEntity : ruleAbstractEntity EOF ;
    public final void entryRuleAbstractEntity() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleAbstractEntity EOF )
            // InternalSmallUML.g:105:1: ruleAbstractEntity EOF
            {
             before(grammarAccess.getAbstractEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractEntity();

            state._fsp--;

             after(grammarAccess.getAbstractEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractEntity"


    // $ANTLR start "ruleAbstractEntity"
    // InternalSmallUML.g:112:1: ruleAbstractEntity : ( ( rule__AbstractEntity__Alternatives ) ) ;
    public final void ruleAbstractEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__AbstractEntity__Alternatives ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__AbstractEntity__Alternatives ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__AbstractEntity__Alternatives ) )
            // InternalSmallUML.g:118:3: ( rule__AbstractEntity__Alternatives )
            {
             before(grammarAccess.getAbstractEntityAccess().getAlternatives()); 
            // InternalSmallUML.g:119:3: ( rule__AbstractEntity__Alternatives )
            // InternalSmallUML.g:119:4: rule__AbstractEntity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractEntity"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleType EOF )
            // InternalSmallUML.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:137:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Type__Group__0 ) )
            // InternalSmallUML.g:143:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalSmallUML.g:144:3: ( rule__Type__Group__0 )
            // InternalSmallUML.g:144:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleClass EOF )
            // InternalSmallUML.g:155:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUML.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUML.g:169:3: ( rule__Class__Group__0 )
            // InternalSmallUML.g:169:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleAttribute EOF )
            // InternalSmallUML.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__Attribute__Group__0 )
            // InternalSmallUML.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleOperation EOF )
            // InternalSmallUML.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSmallUML.g:212:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Operation__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Operation__Group__0 )
            // InternalSmallUML.g:219:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUML.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleParameter EOF )
            // InternalSmallUML.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSmallUML.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSmallUML.g:243:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSmallUML.g:244:3: ( rule__Parameter__Group__0 )
            // InternalSmallUML.g:244:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:253:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleAssociation EOF )
            // InternalSmallUML.g:255:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:262:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__Association__Group__0 ) )
            // InternalSmallUML.g:268:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalSmallUML.g:269:3: ( rule__Association__Group__0 )
            // InternalSmallUML.g:269:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:278:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleRole EOF )
            // InternalSmallUML.g:280:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:287:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Role__Group__0 ) )
            // InternalSmallUML.g:293:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSmallUML.g:294:3: ( rule__Role__Group__0 )
            // InternalSmallUML.g:294:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleCardinality"
    // InternalSmallUML.g:303:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleCardinality EOF )
            // InternalSmallUML.g:305:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalSmallUML.g:312:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalSmallUML.g:318:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalSmallUML.g:319:3: ( rule__Cardinality__Group__0 )
            // InternalSmallUML.g:319:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:328:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:329:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:330:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:337:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:341:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:342:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:342:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:343:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:344:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:344:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleDate"
    // InternalSmallUML.g:353:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalSmallUML.g:354:1: ( ruleDate EOF )
            // InternalSmallUML.g:355:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSmallUML.g:362:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:366:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalSmallUML.g:367:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalSmallUML.g:367:2: ( ( rule__Date__Group__0 ) )
            // InternalSmallUML.g:368:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalSmallUML.g:369:3: ( rule__Date__Group__0 )
            // InternalSmallUML.g:369:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleTimestamp"
    // InternalSmallUML.g:378:1: entryRuleTimestamp : ruleTimestamp EOF ;
    public final void entryRuleTimestamp() throws RecognitionException {
        try {
            // InternalSmallUML.g:379:1: ( ruleTimestamp EOF )
            // InternalSmallUML.g:380:1: ruleTimestamp EOF
            {
             before(grammarAccess.getTimestampRule()); 
            pushFollow(FOLLOW_1);
            ruleTimestamp();

            state._fsp--;

             after(grammarAccess.getTimestampRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimestamp"


    // $ANTLR start "ruleTimestamp"
    // InternalSmallUML.g:387:1: ruleTimestamp : ( ( rule__Timestamp__Group__0 ) ) ;
    public final void ruleTimestamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:391:2: ( ( ( rule__Timestamp__Group__0 ) ) )
            // InternalSmallUML.g:392:2: ( ( rule__Timestamp__Group__0 ) )
            {
            // InternalSmallUML.g:392:2: ( ( rule__Timestamp__Group__0 ) )
            // InternalSmallUML.g:393:3: ( rule__Timestamp__Group__0 )
            {
             before(grammarAccess.getTimestampAccess().getGroup()); 
            // InternalSmallUML.g:394:3: ( rule__Timestamp__Group__0 )
            // InternalSmallUML.g:394:4: rule__Timestamp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimestampAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimestamp"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:404:1: ( ruleEString EOF )
            // InternalSmallUML.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:419:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:429:1: ( ruleEInt EOF )
            // InternalSmallUML.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:444:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__DiagramEntity__Alternatives"
    // InternalSmallUML.g:452:1: rule__DiagramEntity__Alternatives : ( ( ruleAbstractEntity ) | ( ruleAssociation ) );
    public final void rule__DiagramEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:456:1: ( ( ruleAbstractEntity ) | ( ruleAssociation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==16||(LA1_0>=29 && LA1_0<=30)||LA1_0==35||LA1_0==40) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:457:2: ( ruleAbstractEntity )
                    {
                    // InternalSmallUML.g:457:2: ( ruleAbstractEntity )
                    // InternalSmallUML.g:458:3: ruleAbstractEntity
                    {
                     before(grammarAccess.getDiagramEntityAccess().getAbstractEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractEntity();

                    state._fsp--;

                     after(grammarAccess.getDiagramEntityAccess().getAbstractEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:463:2: ( ruleAssociation )
                    {
                    // InternalSmallUML.g:463:2: ( ruleAssociation )
                    // InternalSmallUML.g:464:3: ruleAssociation
                    {
                     before(grammarAccess.getDiagramEntityAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getDiagramEntityAccess().getAssociationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiagramEntity__Alternatives"


    // $ANTLR start "rule__AbstractEntity__Alternatives"
    // InternalSmallUML.g:473:1: rule__AbstractEntity__Alternatives : ( ( ruleClass ) | ( ruleEnumeration ) | ( ruleType ) | ( ruleDate ) | ( ruleTimestamp ) );
    public final void rule__AbstractEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:477:1: ( ( ruleClass ) | ( ruleEnumeration ) | ( ruleType ) | ( ruleDate ) | ( ruleTimestamp ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
            case 40:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:478:2: ( ruleClass )
                    {
                    // InternalSmallUML.g:478:2: ( ruleClass )
                    // InternalSmallUML.g:479:3: ruleClass
                    {
                     before(grammarAccess.getAbstractEntityAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:484:2: ( ruleEnumeration )
                    {
                    // InternalSmallUML.g:484:2: ( ruleEnumeration )
                    // InternalSmallUML.g:485:3: ruleEnumeration
                    {
                     before(grammarAccess.getAbstractEntityAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:490:2: ( ruleType )
                    {
                    // InternalSmallUML.g:490:2: ( ruleType )
                    // InternalSmallUML.g:491:3: ruleType
                    {
                     before(grammarAccess.getAbstractEntityAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:496:2: ( ruleDate )
                    {
                    // InternalSmallUML.g:496:2: ( ruleDate )
                    // InternalSmallUML.g:497:3: ruleDate
                    {
                     before(grammarAccess.getAbstractEntityAccess().getDateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getDateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:502:2: ( ruleTimestamp )
                    {
                    // InternalSmallUML.g:502:2: ( ruleTimestamp )
                    // InternalSmallUML.g:503:3: ruleTimestamp
                    {
                     before(grammarAccess.getAbstractEntityAccess().getTimestampParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTimestamp();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntityAccess().getTimestampParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractEntity__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUML.g:512:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:516:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:517:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:517:2: ( RULE_STRING )
                    // InternalSmallUML.g:518:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:523:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:523:2: ( RULE_ID )
                    // InternalSmallUML.g:524:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Diagram__Group__0"
    // InternalSmallUML.g:533:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:537:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // InternalSmallUML.g:538:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // InternalSmallUML.g:545:1: rule__Diagram__Group__0__Impl : ( () ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:549:1: ( ( () ) )
            // InternalSmallUML.g:550:1: ( () )
            {
            // InternalSmallUML.g:550:1: ( () )
            // InternalSmallUML.g:551:2: ()
            {
             before(grammarAccess.getDiagramAccess().getDiagramAction_0()); 
            // InternalSmallUML.g:552:2: ()
            // InternalSmallUML.g:552:3: 
            {
            }

             after(grammarAccess.getDiagramAccess().getDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // InternalSmallUML.g:560:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:564:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // InternalSmallUML.g:565:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // InternalSmallUML.g:572:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:576:1: ( ( 'Diagram' ) )
            // InternalSmallUML.g:577:1: ( 'Diagram' )
            {
            // InternalSmallUML.g:577:1: ( 'Diagram' )
            // InternalSmallUML.g:578:2: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // InternalSmallUML.g:587:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:591:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // InternalSmallUML.g:592:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // InternalSmallUML.g:599:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:603:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // InternalSmallUML.g:604:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:604:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // InternalSmallUML.g:605:2: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:606:2: ( rule__Diagram__NameAssignment_2 )
            // InternalSmallUML.g:606:3: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // InternalSmallUML.g:614:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:618:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // InternalSmallUML.g:619:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // InternalSmallUML.g:626:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:630:1: ( ( '{' ) )
            // InternalSmallUML.g:631:1: ( '{' )
            {
            // InternalSmallUML.g:631:1: ( '{' )
            // InternalSmallUML.g:632:2: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // InternalSmallUML.g:641:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:645:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // InternalSmallUML.g:646:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // InternalSmallUML.g:653:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__EntitiesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:657:1: ( ( ( rule__Diagram__EntitiesAssignment_4 )* ) )
            // InternalSmallUML.g:658:1: ( ( rule__Diagram__EntitiesAssignment_4 )* )
            {
            // InternalSmallUML.g:658:1: ( ( rule__Diagram__EntitiesAssignment_4 )* )
            // InternalSmallUML.g:659:2: ( rule__Diagram__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getEntitiesAssignment_4()); 
            // InternalSmallUML.g:660:2: ( rule__Diagram__EntitiesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==16||LA4_0==24||(LA4_0>=29 && LA4_0<=30)||LA4_0==35||LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmallUML.g:660:3: rule__Diagram__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Diagram__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // InternalSmallUML.g:668:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:672:1: ( rule__Diagram__Group__5__Impl )
            // InternalSmallUML.g:673:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diagram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // InternalSmallUML.g:679:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:683:1: ( ( '}' ) )
            // InternalSmallUML.g:684:1: ( '}' )
            {
            // InternalSmallUML.g:684:1: ( '}' )
            // InternalSmallUML.g:685:2: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalSmallUML.g:695:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:699:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalSmallUML.g:700:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalSmallUML.g:707:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:711:1: ( ( () ) )
            // InternalSmallUML.g:712:1: ( () )
            {
            // InternalSmallUML.g:712:1: ( () )
            // InternalSmallUML.g:713:2: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // InternalSmallUML.g:714:2: ()
            // InternalSmallUML.g:714:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalSmallUML.g:722:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:726:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalSmallUML.g:727:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalSmallUML.g:734:1: rule__Type__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:738:1: ( ( 'Type' ) )
            // InternalSmallUML.g:739:1: ( 'Type' )
            {
            // InternalSmallUML.g:739:1: ( 'Type' )
            // InternalSmallUML.g:740:2: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalSmallUML.g:749:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:753:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalSmallUML.g:754:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalSmallUML.g:761:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:765:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // InternalSmallUML.g:766:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:766:1: ( ( rule__Type__NameAssignment_2 ) )
            // InternalSmallUML.g:767:2: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:768:2: ( rule__Type__NameAssignment_2 )
            // InternalSmallUML.g:768:3: rule__Type__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalSmallUML.g:776:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:780:1: ( rule__Type__Group__3__Impl )
            // InternalSmallUML.g:781:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalSmallUML.g:787:1: rule__Type__Group__3__Impl : ( ';' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:791:1: ( ( ';' ) )
            // InternalSmallUML.g:792:1: ( ';' )
            {
            // InternalSmallUML.g:792:1: ( ';' )
            // InternalSmallUML.g:793:2: ';'
            {
             before(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUML.g:803:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:807:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:808:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalSmallUML.g:815:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:819:1: ( ( () ) )
            // InternalSmallUML.g:820:1: ( () )
            {
            // InternalSmallUML.g:820:1: ( () )
            // InternalSmallUML.g:821:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalSmallUML.g:822:2: ()
            // InternalSmallUML.g:822:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalSmallUML.g:830:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:834:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:835:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalSmallUML.g:842:1: rule__Class__Group__1__Impl : ( ( rule__Class__AbstractAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:846:1: ( ( ( rule__Class__AbstractAssignment_1 )? ) )
            // InternalSmallUML.g:847:1: ( ( rule__Class__AbstractAssignment_1 )? )
            {
            // InternalSmallUML.g:847:1: ( ( rule__Class__AbstractAssignment_1 )? )
            // InternalSmallUML.g:848:2: ( rule__Class__AbstractAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_1()); 
            // InternalSmallUML.g:849:2: ( rule__Class__AbstractAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==40) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:849:3: rule__Class__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalSmallUML.g:857:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:861:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:862:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalSmallUML.g:869:1: rule__Class__Group__2__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:873:1: ( ( 'Class' ) )
            // InternalSmallUML.g:874:1: ( 'Class' )
            {
            // InternalSmallUML.g:874:1: ( 'Class' )
            // InternalSmallUML.g:875:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalSmallUML.g:884:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:888:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:889:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalSmallUML.g:896:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:900:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalSmallUML.g:901:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalSmallUML.g:901:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalSmallUML.g:902:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalSmallUML.g:903:2: ( rule__Class__NameAssignment_3 )
            // InternalSmallUML.g:903:3: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalSmallUML.g:911:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:915:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:916:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalSmallUML.g:923:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:927:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUML.g:928:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUML.g:928:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUML.g:929:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUML.g:930:2: ( rule__Class__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:930:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalSmallUML.g:938:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:942:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:943:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalSmallUML.g:950:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:954:1: ( ( '{' ) )
            // InternalSmallUML.g:955:1: ( '{' )
            {
            // InternalSmallUML.g:955:1: ( '{' )
            // InternalSmallUML.g:956:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalSmallUML.g:965:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:969:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUML.g:970:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalSmallUML.g:977:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:981:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUML.g:982:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUML.g:982:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUML.g:983:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUML.g:984:2: ( rule__Class__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:984:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalSmallUML.g:992:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:996:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalSmallUML.g:997:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalSmallUML.g:1004:1: rule__Class__Group__7__Impl : ( ( rule__Class__Group_7__0 )? ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1008:1: ( ( ( rule__Class__Group_7__0 )? ) )
            // InternalSmallUML.g:1009:1: ( ( rule__Class__Group_7__0 )? )
            {
            // InternalSmallUML.g:1009:1: ( ( rule__Class__Group_7__0 )? )
            // InternalSmallUML.g:1010:2: ( rule__Class__Group_7__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_7()); 
            // InternalSmallUML.g:1011:2: ( rule__Class__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1011:3: rule__Class__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalSmallUML.g:1019:1: rule__Class__Group__8 : rule__Class__Group__8__Impl ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1023:1: ( rule__Class__Group__8__Impl )
            // InternalSmallUML.g:1024:2: rule__Class__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalSmallUML.g:1030:1: rule__Class__Group__8__Impl : ( '}' ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1034:1: ( ( '}' ) )
            // InternalSmallUML.g:1035:1: ( '}' )
            {
            // InternalSmallUML.g:1035:1: ( '}' )
            // InternalSmallUML.g:1036:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSmallUML.g:1046:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1050:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUML.g:1051:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalSmallUML.g:1058:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1062:1: ( ( 'extends' ) )
            // InternalSmallUML.g:1063:1: ( 'extends' )
            {
            // InternalSmallUML.g:1063:1: ( 'extends' )
            // InternalSmallUML.g:1064:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalSmallUML.g:1073:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1077:1: ( rule__Class__Group_4__1__Impl )
            // InternalSmallUML.g:1078:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalSmallUML.g:1084:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ExtendsAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1088:1: ( ( ( rule__Class__ExtendsAssignment_4_1 ) ) )
            // InternalSmallUML.g:1089:1: ( ( rule__Class__ExtendsAssignment_4_1 ) )
            {
            // InternalSmallUML.g:1089:1: ( ( rule__Class__ExtendsAssignment_4_1 ) )
            // InternalSmallUML.g:1090:2: ( rule__Class__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getExtendsAssignment_4_1()); 
            // InternalSmallUML.g:1091:2: ( rule__Class__ExtendsAssignment_4_1 )
            // InternalSmallUML.g:1091:3: rule__Class__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getExtendsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalSmallUML.g:1100:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1104:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUML.g:1105:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalSmallUML.g:1112:1: rule__Class__Group_6__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1116:1: ( ( 'attributes' ) )
            // InternalSmallUML.g:1117:1: ( 'attributes' )
            {
            // InternalSmallUML.g:1117:1: ( 'attributes' )
            // InternalSmallUML.g:1118:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalSmallUML.g:1127:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1131:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUML.g:1132:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalSmallUML.g:1139:1: rule__Class__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1143:1: ( ( '(' ) )
            // InternalSmallUML.g:1144:1: ( '(' )
            {
            // InternalSmallUML.g:1144:1: ( '(' )
            // InternalSmallUML.g:1145:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalSmallUML.g:1154:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1158:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUML.g:1159:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalSmallUML.g:1166:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__AttributesAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1170:1: ( ( ( rule__Class__AttributesAssignment_6_2 ) ) )
            // InternalSmallUML.g:1171:1: ( ( rule__Class__AttributesAssignment_6_2 ) )
            {
            // InternalSmallUML.g:1171:1: ( ( rule__Class__AttributesAssignment_6_2 ) )
            // InternalSmallUML.g:1172:2: ( rule__Class__AttributesAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_6_2()); 
            // InternalSmallUML.g:1173:2: ( rule__Class__AttributesAssignment_6_2 )
            // InternalSmallUML.g:1173:3: rule__Class__AttributesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalSmallUML.g:1181:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1185:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUML.g:1186:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalSmallUML.g:1193:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1197:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalSmallUML.g:1198:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalSmallUML.g:1198:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalSmallUML.g:1199:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalSmallUML.g:1200:2: ( rule__Class__Group_6_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmallUML.g:1200:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalSmallUML.g:1208:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1212:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUML.g:1213:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalSmallUML.g:1219:1: rule__Class__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1223:1: ( ( ')' ) )
            // InternalSmallUML.g:1224:1: ( ')' )
            {
            // InternalSmallUML.g:1224:1: ( ')' )
            // InternalSmallUML.g:1225:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalSmallUML.g:1235:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1239:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalSmallUML.g:1240:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalSmallUML.g:1247:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1251:1: ( ( ',' ) )
            // InternalSmallUML.g:1252:1: ( ',' )
            {
            // InternalSmallUML.g:1252:1: ( ',' )
            // InternalSmallUML.g:1253:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalSmallUML.g:1262:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1266:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalSmallUML.g:1267:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalSmallUML.g:1273:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__AttributesAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1277:1: ( ( ( rule__Class__AttributesAssignment_6_3_1 ) ) )
            // InternalSmallUML.g:1278:1: ( ( rule__Class__AttributesAssignment_6_3_1 ) )
            {
            // InternalSmallUML.g:1278:1: ( ( rule__Class__AttributesAssignment_6_3_1 ) )
            // InternalSmallUML.g:1279:2: ( rule__Class__AttributesAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_6_3_1()); 
            // InternalSmallUML.g:1280:2: ( rule__Class__AttributesAssignment_6_3_1 )
            // InternalSmallUML.g:1280:3: rule__Class__AttributesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Class__Group_7__0"
    // InternalSmallUML.g:1289:1: rule__Class__Group_7__0 : rule__Class__Group_7__0__Impl rule__Class__Group_7__1 ;
    public final void rule__Class__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1293:1: ( rule__Class__Group_7__0__Impl rule__Class__Group_7__1 )
            // InternalSmallUML.g:1294:2: rule__Class__Group_7__0__Impl rule__Class__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0"


    // $ANTLR start "rule__Class__Group_7__0__Impl"
    // InternalSmallUML.g:1301:1: rule__Class__Group_7__0__Impl : ( 'operations' ) ;
    public final void rule__Class__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1305:1: ( ( 'operations' ) )
            // InternalSmallUML.g:1306:1: ( 'operations' )
            {
            // InternalSmallUML.g:1306:1: ( 'operations' )
            // InternalSmallUML.g:1307:2: 'operations'
            {
             before(grammarAccess.getClassAccess().getOperationsKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getOperationsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__0__Impl"


    // $ANTLR start "rule__Class__Group_7__1"
    // InternalSmallUML.g:1316:1: rule__Class__Group_7__1 : rule__Class__Group_7__1__Impl rule__Class__Group_7__2 ;
    public final void rule__Class__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1320:1: ( rule__Class__Group_7__1__Impl rule__Class__Group_7__2 )
            // InternalSmallUML.g:1321:2: rule__Class__Group_7__1__Impl rule__Class__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1"


    // $ANTLR start "rule__Class__Group_7__1__Impl"
    // InternalSmallUML.g:1328:1: rule__Class__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Class__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1332:1: ( ( '(' ) )
            // InternalSmallUML.g:1333:1: ( '(' )
            {
            // InternalSmallUML.g:1333:1: ( '(' )
            // InternalSmallUML.g:1334:2: '('
            {
             before(grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__1__Impl"


    // $ANTLR start "rule__Class__Group_7__2"
    // InternalSmallUML.g:1343:1: rule__Class__Group_7__2 : rule__Class__Group_7__2__Impl rule__Class__Group_7__3 ;
    public final void rule__Class__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1347:1: ( rule__Class__Group_7__2__Impl rule__Class__Group_7__3 )
            // InternalSmallUML.g:1348:2: rule__Class__Group_7__2__Impl rule__Class__Group_7__3
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2"


    // $ANTLR start "rule__Class__Group_7__2__Impl"
    // InternalSmallUML.g:1355:1: rule__Class__Group_7__2__Impl : ( ( rule__Class__OperationsAssignment_7_2 ) ) ;
    public final void rule__Class__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1359:1: ( ( ( rule__Class__OperationsAssignment_7_2 ) ) )
            // InternalSmallUML.g:1360:1: ( ( rule__Class__OperationsAssignment_7_2 ) )
            {
            // InternalSmallUML.g:1360:1: ( ( rule__Class__OperationsAssignment_7_2 ) )
            // InternalSmallUML.g:1361:2: ( rule__Class__OperationsAssignment_7_2 )
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_7_2()); 
            // InternalSmallUML.g:1362:2: ( rule__Class__OperationsAssignment_7_2 )
            // InternalSmallUML.g:1362:3: rule__Class__OperationsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__2__Impl"


    // $ANTLR start "rule__Class__Group_7__3"
    // InternalSmallUML.g:1370:1: rule__Class__Group_7__3 : rule__Class__Group_7__3__Impl rule__Class__Group_7__4 ;
    public final void rule__Class__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1374:1: ( rule__Class__Group_7__3__Impl rule__Class__Group_7__4 )
            // InternalSmallUML.g:1375:2: rule__Class__Group_7__3__Impl rule__Class__Group_7__4
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3"


    // $ANTLR start "rule__Class__Group_7__3__Impl"
    // InternalSmallUML.g:1382:1: rule__Class__Group_7__3__Impl : ( ( rule__Class__Group_7_3__0 )* ) ;
    public final void rule__Class__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1386:1: ( ( ( rule__Class__Group_7_3__0 )* ) )
            // InternalSmallUML.g:1387:1: ( ( rule__Class__Group_7_3__0 )* )
            {
            // InternalSmallUML.g:1387:1: ( ( rule__Class__Group_7_3__0 )* )
            // InternalSmallUML.g:1388:2: ( rule__Class__Group_7_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_7_3()); 
            // InternalSmallUML.g:1389:2: ( rule__Class__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUML.g:1389:3: rule__Class__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__3__Impl"


    // $ANTLR start "rule__Class__Group_7__4"
    // InternalSmallUML.g:1397:1: rule__Class__Group_7__4 : rule__Class__Group_7__4__Impl ;
    public final void rule__Class__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1401:1: ( rule__Class__Group_7__4__Impl )
            // InternalSmallUML.g:1402:2: rule__Class__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4"


    // $ANTLR start "rule__Class__Group_7__4__Impl"
    // InternalSmallUML.g:1408:1: rule__Class__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Class__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1412:1: ( ( ')' ) )
            // InternalSmallUML.g:1413:1: ( ')' )
            {
            // InternalSmallUML.g:1413:1: ( ')' )
            // InternalSmallUML.g:1414:2: ')'
            {
             before(grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7__4__Impl"


    // $ANTLR start "rule__Class__Group_7_3__0"
    // InternalSmallUML.g:1424:1: rule__Class__Group_7_3__0 : rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 ;
    public final void rule__Class__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1428:1: ( rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1 )
            // InternalSmallUML.g:1429:2: rule__Class__Group_7_3__0__Impl rule__Class__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0"


    // $ANTLR start "rule__Class__Group_7_3__0__Impl"
    // InternalSmallUML.g:1436:1: rule__Class__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1440:1: ( ( ',' ) )
            // InternalSmallUML.g:1441:1: ( ',' )
            {
            // InternalSmallUML.g:1441:1: ( ',' )
            // InternalSmallUML.g:1442:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__0__Impl"


    // $ANTLR start "rule__Class__Group_7_3__1"
    // InternalSmallUML.g:1451:1: rule__Class__Group_7_3__1 : rule__Class__Group_7_3__1__Impl ;
    public final void rule__Class__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1455:1: ( rule__Class__Group_7_3__1__Impl )
            // InternalSmallUML.g:1456:2: rule__Class__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1"


    // $ANTLR start "rule__Class__Group_7_3__1__Impl"
    // InternalSmallUML.g:1462:1: rule__Class__Group_7_3__1__Impl : ( ( rule__Class__OperationsAssignment_7_3_1 ) ) ;
    public final void rule__Class__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1466:1: ( ( ( rule__Class__OperationsAssignment_7_3_1 ) ) )
            // InternalSmallUML.g:1467:1: ( ( rule__Class__OperationsAssignment_7_3_1 ) )
            {
            // InternalSmallUML.g:1467:1: ( ( rule__Class__OperationsAssignment_7_3_1 ) )
            // InternalSmallUML.g:1468:2: ( rule__Class__OperationsAssignment_7_3_1 )
            {
             before(grammarAccess.getClassAccess().getOperationsAssignment_7_3_1()); 
            // InternalSmallUML.g:1469:2: ( rule__Class__OperationsAssignment_7_3_1 )
            // InternalSmallUML.g:1469:3: rule__Class__OperationsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_7_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUML.g:1478:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1482:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:1483:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSmallUML.g:1490:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1494:1: ( ( () ) )
            // InternalSmallUML.g:1495:1: ( () )
            {
            // InternalSmallUML.g:1495:1: ( () )
            // InternalSmallUML.g:1496:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalSmallUML.g:1497:2: ()
            // InternalSmallUML.g:1497:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSmallUML.g:1505:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1509:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:1510:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSmallUML.g:1517:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1521:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1522:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1522:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUML.g:1523:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1524:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUML.g:1524:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSmallUML.g:1532:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1536:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:1537:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSmallUML.g:1544:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1548:1: ( ( ':' ) )
            // InternalSmallUML.g:1549:1: ( ':' )
            {
            // InternalSmallUML.g:1549:1: ( ':' )
            // InternalSmallUML.g:1550:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSmallUML.g:1559:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1563:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUML.g:1564:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSmallUML.g:1570:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1574:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalSmallUML.g:1575:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalSmallUML.g:1575:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalSmallUML.g:1576:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalSmallUML.g:1577:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalSmallUML.g:1577:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalSmallUML.g:1586:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1590:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSmallUML.g:1591:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalSmallUML.g:1598:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1602:1: ( ( () ) )
            // InternalSmallUML.g:1603:1: ( () )
            {
            // InternalSmallUML.g:1603:1: ( () )
            // InternalSmallUML.g:1604:2: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // InternalSmallUML.g:1605:2: ()
            // InternalSmallUML.g:1605:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalSmallUML.g:1613:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1617:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSmallUML.g:1618:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalSmallUML.g:1625:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_1 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1629:1: ( ( ( rule__Operation__ReturnTypeAssignment_1 )? ) )
            // InternalSmallUML.g:1630:1: ( ( rule__Operation__ReturnTypeAssignment_1 )? )
            {
            // InternalSmallUML.g:1630:1: ( ( rule__Operation__ReturnTypeAssignment_1 )? )
            // InternalSmallUML.g:1631:2: ( rule__Operation__ReturnTypeAssignment_1 )?
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_1()); 
            // InternalSmallUML.g:1632:2: ( rule__Operation__ReturnTypeAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=RULE_STRING && LA11_1<=RULE_ID)) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2>=RULE_STRING && LA11_2<=RULE_ID)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:1632:3: rule__Operation__ReturnTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__ReturnTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalSmallUML.g:1640:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1644:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalSmallUML.g:1645:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalSmallUML.g:1652:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1656:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1657:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1657:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalSmallUML.g:1658:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1659:2: ( rule__Operation__NameAssignment_2 )
            // InternalSmallUML.g:1659:3: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalSmallUML.g:1667:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1671:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalSmallUML.g:1672:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalSmallUML.g:1679:1: rule__Operation__Group__3__Impl : ( '(' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1683:1: ( ( '(' ) )
            // InternalSmallUML.g:1684:1: ( '(' )
            {
            // InternalSmallUML.g:1684:1: ( '(' )
            // InternalSmallUML.g:1685:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalSmallUML.g:1694:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1698:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalSmallUML.g:1699:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalSmallUML.g:1706:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__ParametersAssignment_4 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1710:1: ( ( ( rule__Operation__ParametersAssignment_4 )? ) )
            // InternalSmallUML.g:1711:1: ( ( rule__Operation__ParametersAssignment_4 )? )
            {
            // InternalSmallUML.g:1711:1: ( ( rule__Operation__ParametersAssignment_4 )? )
            // InternalSmallUML.g:1712:2: ( rule__Operation__ParametersAssignment_4 )?
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_4()); 
            // InternalSmallUML.g:1713:2: ( rule__Operation__ParametersAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:1713:3: rule__Operation__ParametersAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__ParametersAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalSmallUML.g:1721:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1725:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalSmallUML.g:1726:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalSmallUML.g:1733:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )* ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1737:1: ( ( ( rule__Operation__Group_5__0 )* ) )
            // InternalSmallUML.g:1738:1: ( ( rule__Operation__Group_5__0 )* )
            {
            // InternalSmallUML.g:1738:1: ( ( rule__Operation__Group_5__0 )* )
            // InternalSmallUML.g:1739:2: ( rule__Operation__Group_5__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // InternalSmallUML.g:1740:2: ( rule__Operation__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmallUML.g:1740:3: rule__Operation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Operation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalSmallUML.g:1748:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1752:1: ( rule__Operation__Group__6__Impl )
            // InternalSmallUML.g:1753:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalSmallUML.g:1759:1: rule__Operation__Group__6__Impl : ( ')' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1763:1: ( ( ')' ) )
            // InternalSmallUML.g:1764:1: ( ')' )
            {
            // InternalSmallUML.g:1764:1: ( ')' )
            // InternalSmallUML.g:1765:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // InternalSmallUML.g:1775:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1779:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // InternalSmallUML.g:1780:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // InternalSmallUML.g:1787:1: rule__Operation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1791:1: ( ( ',' ) )
            // InternalSmallUML.g:1792:1: ( ',' )
            {
            // InternalSmallUML.g:1792:1: ( ',' )
            // InternalSmallUML.g:1793:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // InternalSmallUML.g:1802:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1806:1: ( rule__Operation__Group_5__1__Impl )
            // InternalSmallUML.g:1807:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // InternalSmallUML.g:1813:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ParametersAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1817:1: ( ( ( rule__Operation__ParametersAssignment_5_1 ) ) )
            // InternalSmallUML.g:1818:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            {
            // InternalSmallUML.g:1818:1: ( ( rule__Operation__ParametersAssignment_5_1 ) )
            // InternalSmallUML.g:1819:2: ( rule__Operation__ParametersAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 
            // InternalSmallUML.g:1820:2: ( rule__Operation__ParametersAssignment_5_1 )
            // InternalSmallUML.g:1820:3: rule__Operation__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSmallUML.g:1829:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1833:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSmallUML.g:1834:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSmallUML.g:1841:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1845:1: ( ( () ) )
            // InternalSmallUML.g:1846:1: ( () )
            {
            // InternalSmallUML.g:1846:1: ( () )
            // InternalSmallUML.g:1847:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalSmallUML.g:1848:2: ()
            // InternalSmallUML.g:1848:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSmallUML.g:1856:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1860:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSmallUML.g:1861:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSmallUML.g:1868:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1872:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // InternalSmallUML.g:1873:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // InternalSmallUML.g:1873:1: ( ( rule__Parameter__Group_1__0 )? )
            // InternalSmallUML.g:1874:2: ( rule__Parameter__Group_1__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_1()); 
            // InternalSmallUML.g:1875:2: ( rule__Parameter__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==23) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==RULE_ID) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==23) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:1875:3: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSmallUML.g:1883:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1887:1: ( rule__Parameter__Group__2__Impl )
            // InternalSmallUML.g:1888:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSmallUML.g:1894:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1898:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1899:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1899:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalSmallUML.g:1900:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1901:2: ( rule__Parameter__NameAssignment_2 )
            // InternalSmallUML.g:1901:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // InternalSmallUML.g:1910:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1914:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // InternalSmallUML.g:1915:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // InternalSmallUML.g:1922:1: rule__Parameter__Group_1__0__Impl : ( ( rule__Parameter__TypeAssignment_1_0 ) ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1926:1: ( ( ( rule__Parameter__TypeAssignment_1_0 ) ) )
            // InternalSmallUML.g:1927:1: ( ( rule__Parameter__TypeAssignment_1_0 ) )
            {
            // InternalSmallUML.g:1927:1: ( ( rule__Parameter__TypeAssignment_1_0 ) )
            // InternalSmallUML.g:1928:2: ( rule__Parameter__TypeAssignment_1_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1_0()); 
            // InternalSmallUML.g:1929:2: ( rule__Parameter__TypeAssignment_1_0 )
            // InternalSmallUML.g:1929:3: rule__Parameter__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // InternalSmallUML.g:1937:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1941:1: ( rule__Parameter__Group_1__1__Impl )
            // InternalSmallUML.g:1942:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // InternalSmallUML.g:1948:1: rule__Parameter__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1952:1: ( ( ':' ) )
            // InternalSmallUML.g:1953:1: ( ':' )
            {
            // InternalSmallUML.g:1953:1: ( ':' )
            // InternalSmallUML.g:1954:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalSmallUML.g:1964:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1968:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalSmallUML.g:1969:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalSmallUML.g:1976:1: rule__Association__Group__0__Impl : ( () ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1980:1: ( ( () ) )
            // InternalSmallUML.g:1981:1: ( () )
            {
            // InternalSmallUML.g:1981:1: ( () )
            // InternalSmallUML.g:1982:2: ()
            {
             before(grammarAccess.getAssociationAccess().getAssociationAction_0()); 
            // InternalSmallUML.g:1983:2: ()
            // InternalSmallUML.g:1983:3: 
            {
            }

             after(grammarAccess.getAssociationAccess().getAssociationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalSmallUML.g:1991:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1995:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalSmallUML.g:1996:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalSmallUML.g:2003:1: rule__Association__Group__1__Impl : ( 'Association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2007:1: ( ( 'Association' ) )
            // InternalSmallUML.g:2008:1: ( 'Association' )
            {
            // InternalSmallUML.g:2008:1: ( 'Association' )
            // InternalSmallUML.g:2009:2: 'Association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalSmallUML.g:2018:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2022:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalSmallUML.g:2023:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalSmallUML.g:2030:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2034:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2035:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2035:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalSmallUML.g:2036:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2037:2: ( rule__Association__NameAssignment_2 )
            // InternalSmallUML.g:2037:3: rule__Association__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalSmallUML.g:2045:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2049:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalSmallUML.g:2050:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalSmallUML.g:2057:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2061:1: ( ( '{' ) )
            // InternalSmallUML.g:2062:1: ( '{' )
            {
            // InternalSmallUML.g:2062:1: ( '{' )
            // InternalSmallUML.g:2063:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalSmallUML.g:2072:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2076:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalSmallUML.g:2077:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalSmallUML.g:2084:1: rule__Association__Group__4__Impl : ( ( rule__Association__RolesAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2088:1: ( ( ( rule__Association__RolesAssignment_4 ) ) )
            // InternalSmallUML.g:2089:1: ( ( rule__Association__RolesAssignment_4 ) )
            {
            // InternalSmallUML.g:2089:1: ( ( rule__Association__RolesAssignment_4 ) )
            // InternalSmallUML.g:2090:2: ( rule__Association__RolesAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getRolesAssignment_4()); 
            // InternalSmallUML.g:2091:2: ( rule__Association__RolesAssignment_4 )
            // InternalSmallUML.g:2091:3: rule__Association__RolesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Association__RolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalSmallUML.g:2099:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2103:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalSmallUML.g:2104:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalSmallUML.g:2111:1: rule__Association__Group__5__Impl : ( ( ( rule__Association__Group_5__0 ) ) ( ( rule__Association__Group_5__0 )* ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2115:1: ( ( ( ( rule__Association__Group_5__0 ) ) ( ( rule__Association__Group_5__0 )* ) ) )
            // InternalSmallUML.g:2116:1: ( ( ( rule__Association__Group_5__0 ) ) ( ( rule__Association__Group_5__0 )* ) )
            {
            // InternalSmallUML.g:2116:1: ( ( ( rule__Association__Group_5__0 ) ) ( ( rule__Association__Group_5__0 )* ) )
            // InternalSmallUML.g:2117:2: ( ( rule__Association__Group_5__0 ) ) ( ( rule__Association__Group_5__0 )* )
            {
            // InternalSmallUML.g:2117:2: ( ( rule__Association__Group_5__0 ) )
            // InternalSmallUML.g:2118:3: ( rule__Association__Group_5__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup_5()); 
            // InternalSmallUML.g:2119:3: ( rule__Association__Group_5__0 )
            // InternalSmallUML.g:2119:4: rule__Association__Group_5__0
            {
            pushFollow(FOLLOW_16);
            rule__Association__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup_5()); 

            }

            // InternalSmallUML.g:2122:2: ( ( rule__Association__Group_5__0 )* )
            // InternalSmallUML.g:2123:3: ( rule__Association__Group_5__0 )*
            {
             before(grammarAccess.getAssociationAccess().getGroup_5()); 
            // InternalSmallUML.g:2124:3: ( rule__Association__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:2124:4: rule__Association__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Association__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalSmallUML.g:2133:1: rule__Association__Group__6 : rule__Association__Group__6__Impl ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2137:1: ( rule__Association__Group__6__Impl )
            // InternalSmallUML.g:2138:2: rule__Association__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalSmallUML.g:2144:1: rule__Association__Group__6__Impl : ( '}' ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2148:1: ( ( '}' ) )
            // InternalSmallUML.g:2149:1: ( '}' )
            {
            // InternalSmallUML.g:2149:1: ( '}' )
            // InternalSmallUML.g:2150:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group_5__0"
    // InternalSmallUML.g:2160:1: rule__Association__Group_5__0 : rule__Association__Group_5__0__Impl rule__Association__Group_5__1 ;
    public final void rule__Association__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2164:1: ( rule__Association__Group_5__0__Impl rule__Association__Group_5__1 )
            // InternalSmallUML.g:2165:2: rule__Association__Group_5__0__Impl rule__Association__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Association__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_5__0"


    // $ANTLR start "rule__Association__Group_5__0__Impl"
    // InternalSmallUML.g:2172:1: rule__Association__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Association__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2176:1: ( ( ',' ) )
            // InternalSmallUML.g:2177:1: ( ',' )
            {
            // InternalSmallUML.g:2177:1: ( ',' )
            // InternalSmallUML.g:2178:2: ','
            {
             before(grammarAccess.getAssociationAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_5__0__Impl"


    // $ANTLR start "rule__Association__Group_5__1"
    // InternalSmallUML.g:2187:1: rule__Association__Group_5__1 : rule__Association__Group_5__1__Impl ;
    public final void rule__Association__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2191:1: ( rule__Association__Group_5__1__Impl )
            // InternalSmallUML.g:2192:2: rule__Association__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_5__1"


    // $ANTLR start "rule__Association__Group_5__1__Impl"
    // InternalSmallUML.g:2198:1: rule__Association__Group_5__1__Impl : ( ( rule__Association__RolesAssignment_5_1 ) ) ;
    public final void rule__Association__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2202:1: ( ( ( rule__Association__RolesAssignment_5_1 ) ) )
            // InternalSmallUML.g:2203:1: ( ( rule__Association__RolesAssignment_5_1 ) )
            {
            // InternalSmallUML.g:2203:1: ( ( rule__Association__RolesAssignment_5_1 ) )
            // InternalSmallUML.g:2204:2: ( rule__Association__RolesAssignment_5_1 )
            {
             before(grammarAccess.getAssociationAccess().getRolesAssignment_5_1()); 
            // InternalSmallUML.g:2205:2: ( rule__Association__RolesAssignment_5_1 )
            // InternalSmallUML.g:2205:3: rule__Association__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRolesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_5__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSmallUML.g:2214:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2218:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSmallUML.g:2219:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalSmallUML.g:2226:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2230:1: ( ( () ) )
            // InternalSmallUML.g:2231:1: ( () )
            {
            // InternalSmallUML.g:2231:1: ( () )
            // InternalSmallUML.g:2232:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalSmallUML.g:2233:2: ()
            // InternalSmallUML.g:2233:3: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSmallUML.g:2241:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2245:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSmallUML.g:2246:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalSmallUML.g:2253:1: rule__Role__Group__1__Impl : ( 'role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2257:1: ( ( 'role' ) )
            // InternalSmallUML.g:2258:1: ( 'role' )
            {
            // InternalSmallUML.g:2258:1: ( 'role' )
            // InternalSmallUML.g:2259:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalSmallUML.g:2268:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2272:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSmallUML.g:2273:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalSmallUML.g:2280:1: rule__Role__Group__2__Impl : ( ( rule__Role__NameAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2284:1: ( ( ( rule__Role__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2285:1: ( ( rule__Role__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2285:1: ( ( rule__Role__NameAssignment_2 ) )
            // InternalSmallUML.g:2286:2: ( rule__Role__NameAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2287:2: ( rule__Role__NameAssignment_2 )
            // InternalSmallUML.g:2287:3: rule__Role__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalSmallUML.g:2295:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2299:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSmallUML.g:2300:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalSmallUML.g:2307:1: rule__Role__Group__3__Impl : ( ( rule__Role__CardinalityAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2311:1: ( ( ( rule__Role__CardinalityAssignment_3 ) ) )
            // InternalSmallUML.g:2312:1: ( ( rule__Role__CardinalityAssignment_3 ) )
            {
            // InternalSmallUML.g:2312:1: ( ( rule__Role__CardinalityAssignment_3 ) )
            // InternalSmallUML.g:2313:2: ( rule__Role__CardinalityAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getCardinalityAssignment_3()); 
            // InternalSmallUML.g:2314:2: ( rule__Role__CardinalityAssignment_3 )
            // InternalSmallUML.g:2314:3: rule__Role__CardinalityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__CardinalityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getCardinalityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalSmallUML.g:2322:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2326:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSmallUML.g:2327:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalSmallUML.g:2334:1: rule__Role__Group__4__Impl : ( 'with' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2338:1: ( ( 'with' ) )
            // InternalSmallUML.g:2339:1: ( 'with' )
            {
            // InternalSmallUML.g:2339:1: ( 'with' )
            // InternalSmallUML.g:2340:2: 'with'
            {
             before(grammarAccess.getRoleAccess().getWithKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalSmallUML.g:2349:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2353:1: ( rule__Role__Group__5__Impl )
            // InternalSmallUML.g:2354:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalSmallUML.g:2360:1: rule__Role__Group__5__Impl : ( ( rule__Role__EntityAssignment_5 ) ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2364:1: ( ( ( rule__Role__EntityAssignment_5 ) ) )
            // InternalSmallUML.g:2365:1: ( ( rule__Role__EntityAssignment_5 ) )
            {
            // InternalSmallUML.g:2365:1: ( ( rule__Role__EntityAssignment_5 ) )
            // InternalSmallUML.g:2366:2: ( rule__Role__EntityAssignment_5 )
            {
             before(grammarAccess.getRoleAccess().getEntityAssignment_5()); 
            // InternalSmallUML.g:2367:2: ( rule__Role__EntityAssignment_5 )
            // InternalSmallUML.g:2367:3: rule__Role__EntityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Role__EntityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getEntityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalSmallUML.g:2376:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2380:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalSmallUML.g:2381:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalSmallUML.g:2388:1: rule__Cardinality__Group__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2392:1: ( ( () ) )
            // InternalSmallUML.g:2393:1: ( () )
            {
            // InternalSmallUML.g:2393:1: ( () )
            // InternalSmallUML.g:2394:2: ()
            {
             before(grammarAccess.getCardinalityAccess().getCardinalityAction_0()); 
            // InternalSmallUML.g:2395:2: ()
            // InternalSmallUML.g:2395:3: 
            {
            }

             after(grammarAccess.getCardinalityAccess().getCardinalityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalSmallUML.g:2403:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2407:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalSmallUML.g:2408:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalSmallUML.g:2415:1: rule__Cardinality__Group__1__Impl : ( '[' ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2419:1: ( ( '[' ) )
            // InternalSmallUML.g:2420:1: ( '[' )
            {
            // InternalSmallUML.g:2420:1: ( '[' )
            // InternalSmallUML.g:2421:2: '['
            {
             before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalSmallUML.g:2430:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2434:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalSmallUML.g:2435:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalSmallUML.g:2442:1: rule__Cardinality__Group__2__Impl : ( ( rule__Cardinality__LowerBoundAssignment_2 ) ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2446:1: ( ( ( rule__Cardinality__LowerBoundAssignment_2 ) ) )
            // InternalSmallUML.g:2447:1: ( ( rule__Cardinality__LowerBoundAssignment_2 ) )
            {
            // InternalSmallUML.g:2447:1: ( ( rule__Cardinality__LowerBoundAssignment_2 ) )
            // InternalSmallUML.g:2448:2: ( rule__Cardinality__LowerBoundAssignment_2 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_2()); 
            // InternalSmallUML.g:2449:2: ( rule__Cardinality__LowerBoundAssignment_2 )
            // InternalSmallUML.g:2449:3: rule__Cardinality__LowerBoundAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__LowerBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalSmallUML.g:2457:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2461:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalSmallUML.g:2462:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalSmallUML.g:2469:1: rule__Cardinality__Group__3__Impl : ( ',' ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2473:1: ( ( ',' ) )
            // InternalSmallUML.g:2474:1: ( ',' )
            {
            // InternalSmallUML.g:2474:1: ( ',' )
            // InternalSmallUML.g:2475:2: ','
            {
             before(grammarAccess.getCardinalityAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalSmallUML.g:2484:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2488:1: ( rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5 )
            // InternalSmallUML.g:2489:2: rule__Cardinality__Group__4__Impl rule__Cardinality__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalSmallUML.g:2496:1: rule__Cardinality__Group__4__Impl : ( ( rule__Cardinality__UpperBoundAssignment_4 ) ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2500:1: ( ( ( rule__Cardinality__UpperBoundAssignment_4 ) ) )
            // InternalSmallUML.g:2501:1: ( ( rule__Cardinality__UpperBoundAssignment_4 ) )
            {
            // InternalSmallUML.g:2501:1: ( ( rule__Cardinality__UpperBoundAssignment_4 ) )
            // InternalSmallUML.g:2502:2: ( rule__Cardinality__UpperBoundAssignment_4 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_4()); 
            // InternalSmallUML.g:2503:2: ( rule__Cardinality__UpperBoundAssignment_4 )
            // InternalSmallUML.g:2503:3: rule__Cardinality__UpperBoundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__UpperBoundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__Cardinality__Group__5"
    // InternalSmallUML.g:2511:1: rule__Cardinality__Group__5 : rule__Cardinality__Group__5__Impl ;
    public final void rule__Cardinality__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2515:1: ( rule__Cardinality__Group__5__Impl )
            // InternalSmallUML.g:2516:2: rule__Cardinality__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__5"


    // $ANTLR start "rule__Cardinality__Group__5__Impl"
    // InternalSmallUML.g:2522:1: rule__Cardinality__Group__5__Impl : ( ']' ) ;
    public final void rule__Cardinality__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2526:1: ( ( ']' ) )
            // InternalSmallUML.g:2527:1: ( ']' )
            {
            // InternalSmallUML.g:2527:1: ( ']' )
            // InternalSmallUML.g:2528:2: ']'
            {
             before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:2538:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2542:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:2543:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSmallUML.g:2550:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2554:1: ( ( () ) )
            // InternalSmallUML.g:2555:1: ( () )
            {
            // InternalSmallUML.g:2555:1: ( () )
            // InternalSmallUML.g:2556:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalSmallUML.g:2557:2: ()
            // InternalSmallUML.g:2557:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUML.g:2565:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2569:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:2570:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSmallUML.g:2577:1: rule__Enumeration__Group__1__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2581:1: ( ( 'Enumeration' ) )
            // InternalSmallUML.g:2582:1: ( 'Enumeration' )
            {
            // InternalSmallUML.g:2582:1: ( 'Enumeration' )
            // InternalSmallUML.g:2583:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSmallUML.g:2592:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2596:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:2597:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSmallUML.g:2604:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2608:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2609:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2609:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalSmallUML.g:2610:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2611:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalSmallUML.g:2611:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSmallUML.g:2619:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2623:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:2624:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSmallUML.g:2631:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2635:1: ( ( '{' ) )
            // InternalSmallUML.g:2636:1: ( '{' )
            {
            // InternalSmallUML.g:2636:1: ( '{' )
            // InternalSmallUML.g:2637:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSmallUML.g:2646:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2650:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUML.g:2651:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSmallUML.g:2658:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__ElementsAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2662:1: ( ( ( rule__Enumeration__ElementsAssignment_4 ) ) )
            // InternalSmallUML.g:2663:1: ( ( rule__Enumeration__ElementsAssignment_4 ) )
            {
            // InternalSmallUML.g:2663:1: ( ( rule__Enumeration__ElementsAssignment_4 ) )
            // InternalSmallUML.g:2664:2: ( rule__Enumeration__ElementsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getElementsAssignment_4()); 
            // InternalSmallUML.g:2665:2: ( rule__Enumeration__ElementsAssignment_4 )
            // InternalSmallUML.g:2665:3: rule__Enumeration__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSmallUML.g:2673:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2677:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalSmallUML.g:2678:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSmallUML.g:2685:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2689:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalSmallUML.g:2690:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalSmallUML.g:2690:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalSmallUML.g:2691:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalSmallUML.g:2692:2: ( rule__Enumeration__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallUML.g:2692:3: rule__Enumeration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Enumeration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalSmallUML.g:2700:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2704:1: ( rule__Enumeration__Group__6__Impl )
            // InternalSmallUML.g:2705:2: rule__Enumeration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalSmallUML.g:2711:1: rule__Enumeration__Group__6__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2715:1: ( ( '}' ) )
            // InternalSmallUML.g:2716:1: ( '}' )
            {
            // InternalSmallUML.g:2716:1: ( '}' )
            // InternalSmallUML.g:2717:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__0"
    // InternalSmallUML.g:2727:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2731:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalSmallUML.g:2732:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Enumeration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0"


    // $ANTLR start "rule__Enumeration__Group_5__0__Impl"
    // InternalSmallUML.g:2739:1: rule__Enumeration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2743:1: ( ( ',' ) )
            // InternalSmallUML.g:2744:1: ( ',' )
            {
            // InternalSmallUML.g:2744:1: ( ',' )
            // InternalSmallUML.g:2745:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__1"
    // InternalSmallUML.g:2754:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2758:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalSmallUML.g:2759:2: rule__Enumeration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1"


    // $ANTLR start "rule__Enumeration__Group_5__1__Impl"
    // InternalSmallUML.g:2765:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__ElementsAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2769:1: ( ( ( rule__Enumeration__ElementsAssignment_5_1 ) ) )
            // InternalSmallUML.g:2770:1: ( ( rule__Enumeration__ElementsAssignment_5_1 ) )
            {
            // InternalSmallUML.g:2770:1: ( ( rule__Enumeration__ElementsAssignment_5_1 ) )
            // InternalSmallUML.g:2771:2: ( rule__Enumeration__ElementsAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getElementsAssignment_5_1()); 
            // InternalSmallUML.g:2772:2: ( rule__Enumeration__ElementsAssignment_5_1 )
            // InternalSmallUML.g:2772:3: rule__Enumeration__ElementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalSmallUML.g:2781:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2785:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSmallUML.g:2786:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalSmallUML.g:2793:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2797:1: ( ( () ) )
            // InternalSmallUML.g:2798:1: ( () )
            {
            // InternalSmallUML.g:2798:1: ( () )
            // InternalSmallUML.g:2799:2: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // InternalSmallUML.g:2800:2: ()
            // InternalSmallUML.g:2800:3: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalSmallUML.g:2808:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2812:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalSmallUML.g:2813:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalSmallUML.g:2820:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2824:1: ( ( 'Date' ) )
            // InternalSmallUML.g:2825:1: ( 'Date' )
            {
            // InternalSmallUML.g:2825:1: ( 'Date' )
            // InternalSmallUML.g:2826:2: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalSmallUML.g:2835:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2839:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalSmallUML.g:2840:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalSmallUML.g:2847:1: rule__Date__Group__2__Impl : ( ( rule__Date__NameAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2851:1: ( ( ( rule__Date__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2852:1: ( ( rule__Date__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2852:1: ( ( rule__Date__NameAssignment_2 ) )
            // InternalSmallUML.g:2853:2: ( rule__Date__NameAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2854:2: ( rule__Date__NameAssignment_2 )
            // InternalSmallUML.g:2854:3: rule__Date__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Date__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalSmallUML.g:2862:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2866:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalSmallUML.g:2867:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalSmallUML.g:2874:1: rule__Date__Group__3__Impl : ( '{' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2878:1: ( ( '{' ) )
            // InternalSmallUML.g:2879:1: ( '{' )
            {
            // InternalSmallUML.g:2879:1: ( '{' )
            // InternalSmallUML.g:2880:2: '{'
            {
             before(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalSmallUML.g:2889:1: rule__Date__Group__4 : rule__Date__Group__4__Impl rule__Date__Group__5 ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2893:1: ( rule__Date__Group__4__Impl rule__Date__Group__5 )
            // InternalSmallUML.g:2894:2: rule__Date__Group__4__Impl rule__Date__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Date__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalSmallUML.g:2901:1: rule__Date__Group__4__Impl : ( ( rule__Date__Group_4__0 )? ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2905:1: ( ( ( rule__Date__Group_4__0 )? ) )
            // InternalSmallUML.g:2906:1: ( ( rule__Date__Group_4__0 )? )
            {
            // InternalSmallUML.g:2906:1: ( ( rule__Date__Group_4__0 )? )
            // InternalSmallUML.g:2907:2: ( rule__Date__Group_4__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_4()); 
            // InternalSmallUML.g:2908:2: ( rule__Date__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:2908:3: rule__Date__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Date__Group__5"
    // InternalSmallUML.g:2916:1: rule__Date__Group__5 : rule__Date__Group__5__Impl rule__Date__Group__6 ;
    public final void rule__Date__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2920:1: ( rule__Date__Group__5__Impl rule__Date__Group__6 )
            // InternalSmallUML.g:2921:2: rule__Date__Group__5__Impl rule__Date__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Date__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5"


    // $ANTLR start "rule__Date__Group__5__Impl"
    // InternalSmallUML.g:2928:1: rule__Date__Group__5__Impl : ( ( rule__Date__Group_5__0 )? ) ;
    public final void rule__Date__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2932:1: ( ( ( rule__Date__Group_5__0 )? ) )
            // InternalSmallUML.g:2933:1: ( ( rule__Date__Group_5__0 )? )
            {
            // InternalSmallUML.g:2933:1: ( ( rule__Date__Group_5__0 )? )
            // InternalSmallUML.g:2934:2: ( rule__Date__Group_5__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_5()); 
            // InternalSmallUML.g:2935:2: ( rule__Date__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmallUML.g:2935:3: rule__Date__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__5__Impl"


    // $ANTLR start "rule__Date__Group__6"
    // InternalSmallUML.g:2943:1: rule__Date__Group__6 : rule__Date__Group__6__Impl rule__Date__Group__7 ;
    public final void rule__Date__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2947:1: ( rule__Date__Group__6__Impl rule__Date__Group__7 )
            // InternalSmallUML.g:2948:2: rule__Date__Group__6__Impl rule__Date__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Date__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__6"


    // $ANTLR start "rule__Date__Group__6__Impl"
    // InternalSmallUML.g:2955:1: rule__Date__Group__6__Impl : ( ( rule__Date__Group_6__0 )? ) ;
    public final void rule__Date__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2959:1: ( ( ( rule__Date__Group_6__0 )? ) )
            // InternalSmallUML.g:2960:1: ( ( rule__Date__Group_6__0 )? )
            {
            // InternalSmallUML.g:2960:1: ( ( rule__Date__Group_6__0 )? )
            // InternalSmallUML.g:2961:2: ( rule__Date__Group_6__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_6()); 
            // InternalSmallUML.g:2962:2: ( rule__Date__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmallUML.g:2962:3: rule__Date__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__6__Impl"


    // $ANTLR start "rule__Date__Group__7"
    // InternalSmallUML.g:2970:1: rule__Date__Group__7 : rule__Date__Group__7__Impl rule__Date__Group__8 ;
    public final void rule__Date__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2974:1: ( rule__Date__Group__7__Impl rule__Date__Group__8 )
            // InternalSmallUML.g:2975:2: rule__Date__Group__7__Impl rule__Date__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Date__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__7"


    // $ANTLR start "rule__Date__Group__7__Impl"
    // InternalSmallUML.g:2982:1: rule__Date__Group__7__Impl : ( ( rule__Date__Group_7__0 )? ) ;
    public final void rule__Date__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2986:1: ( ( ( rule__Date__Group_7__0 )? ) )
            // InternalSmallUML.g:2987:1: ( ( rule__Date__Group_7__0 )? )
            {
            // InternalSmallUML.g:2987:1: ( ( rule__Date__Group_7__0 )? )
            // InternalSmallUML.g:2988:2: ( rule__Date__Group_7__0 )?
            {
             before(grammarAccess.getDateAccess().getGroup_7()); 
            // InternalSmallUML.g:2989:2: ( rule__Date__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmallUML.g:2989:3: rule__Date__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Date__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__7__Impl"


    // $ANTLR start "rule__Date__Group__8"
    // InternalSmallUML.g:2997:1: rule__Date__Group__8 : rule__Date__Group__8__Impl ;
    public final void rule__Date__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3001:1: ( rule__Date__Group__8__Impl )
            // InternalSmallUML.g:3002:2: rule__Date__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__8"


    // $ANTLR start "rule__Date__Group__8__Impl"
    // InternalSmallUML.g:3008:1: rule__Date__Group__8__Impl : ( '}' ) ;
    public final void rule__Date__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3012:1: ( ( '}' ) )
            // InternalSmallUML.g:3013:1: ( '}' )
            {
            // InternalSmallUML.g:3013:1: ( '}' )
            // InternalSmallUML.g:3014:2: '}'
            {
             before(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__8__Impl"


    // $ANTLR start "rule__Date__Group_4__0"
    // InternalSmallUML.g:3024:1: rule__Date__Group_4__0 : rule__Date__Group_4__0__Impl rule__Date__Group_4__1 ;
    public final void rule__Date__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3028:1: ( rule__Date__Group_4__0__Impl rule__Date__Group_4__1 )
            // InternalSmallUML.g:3029:2: rule__Date__Group_4__0__Impl rule__Date__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0"


    // $ANTLR start "rule__Date__Group_4__0__Impl"
    // InternalSmallUML.g:3036:1: rule__Date__Group_4__0__Impl : ( 'day' ) ;
    public final void rule__Date__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3040:1: ( ( 'day' ) )
            // InternalSmallUML.g:3041:1: ( 'day' )
            {
            // InternalSmallUML.g:3041:1: ( 'day' )
            // InternalSmallUML.g:3042:2: 'day'
            {
             before(grammarAccess.getDateAccess().getDayKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDayKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__0__Impl"


    // $ANTLR start "rule__Date__Group_4__1"
    // InternalSmallUML.g:3051:1: rule__Date__Group_4__1 : rule__Date__Group_4__1__Impl ;
    public final void rule__Date__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3055:1: ( rule__Date__Group_4__1__Impl )
            // InternalSmallUML.g:3056:2: rule__Date__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1"


    // $ANTLR start "rule__Date__Group_4__1__Impl"
    // InternalSmallUML.g:3062:1: rule__Date__Group_4__1__Impl : ( ( rule__Date__DayAssignment_4_1 ) ) ;
    public final void rule__Date__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3066:1: ( ( ( rule__Date__DayAssignment_4_1 ) ) )
            // InternalSmallUML.g:3067:1: ( ( rule__Date__DayAssignment_4_1 ) )
            {
            // InternalSmallUML.g:3067:1: ( ( rule__Date__DayAssignment_4_1 ) )
            // InternalSmallUML.g:3068:2: ( rule__Date__DayAssignment_4_1 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_4_1()); 
            // InternalSmallUML.g:3069:2: ( rule__Date__DayAssignment_4_1 )
            // InternalSmallUML.g:3069:3: rule__Date__DayAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__DayAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_4__1__Impl"


    // $ANTLR start "rule__Date__Group_5__0"
    // InternalSmallUML.g:3078:1: rule__Date__Group_5__0 : rule__Date__Group_5__0__Impl rule__Date__Group_5__1 ;
    public final void rule__Date__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3082:1: ( rule__Date__Group_5__0__Impl rule__Date__Group_5__1 )
            // InternalSmallUML.g:3083:2: rule__Date__Group_5__0__Impl rule__Date__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_5__0"


    // $ANTLR start "rule__Date__Group_5__0__Impl"
    // InternalSmallUML.g:3090:1: rule__Date__Group_5__0__Impl : ( 'month' ) ;
    public final void rule__Date__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3094:1: ( ( 'month' ) )
            // InternalSmallUML.g:3095:1: ( 'month' )
            {
            // InternalSmallUML.g:3095:1: ( 'month' )
            // InternalSmallUML.g:3096:2: 'month'
            {
             before(grammarAccess.getDateAccess().getMonthKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getMonthKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_5__0__Impl"


    // $ANTLR start "rule__Date__Group_5__1"
    // InternalSmallUML.g:3105:1: rule__Date__Group_5__1 : rule__Date__Group_5__1__Impl ;
    public final void rule__Date__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3109:1: ( rule__Date__Group_5__1__Impl )
            // InternalSmallUML.g:3110:2: rule__Date__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_5__1"


    // $ANTLR start "rule__Date__Group_5__1__Impl"
    // InternalSmallUML.g:3116:1: rule__Date__Group_5__1__Impl : ( ( rule__Date__MonthAssignment_5_1 ) ) ;
    public final void rule__Date__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3120:1: ( ( ( rule__Date__MonthAssignment_5_1 ) ) )
            // InternalSmallUML.g:3121:1: ( ( rule__Date__MonthAssignment_5_1 ) )
            {
            // InternalSmallUML.g:3121:1: ( ( rule__Date__MonthAssignment_5_1 ) )
            // InternalSmallUML.g:3122:2: ( rule__Date__MonthAssignment_5_1 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_5_1()); 
            // InternalSmallUML.g:3123:2: ( rule__Date__MonthAssignment_5_1 )
            // InternalSmallUML.g:3123:3: rule__Date__MonthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__MonthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_5__1__Impl"


    // $ANTLR start "rule__Date__Group_6__0"
    // InternalSmallUML.g:3132:1: rule__Date__Group_6__0 : rule__Date__Group_6__0__Impl rule__Date__Group_6__1 ;
    public final void rule__Date__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3136:1: ( rule__Date__Group_6__0__Impl rule__Date__Group_6__1 )
            // InternalSmallUML.g:3137:2: rule__Date__Group_6__0__Impl rule__Date__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_6__0"


    // $ANTLR start "rule__Date__Group_6__0__Impl"
    // InternalSmallUML.g:3144:1: rule__Date__Group_6__0__Impl : ( 'year' ) ;
    public final void rule__Date__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3148:1: ( ( 'year' ) )
            // InternalSmallUML.g:3149:1: ( 'year' )
            {
            // InternalSmallUML.g:3149:1: ( 'year' )
            // InternalSmallUML.g:3150:2: 'year'
            {
             before(grammarAccess.getDateAccess().getYearKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getYearKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_6__0__Impl"


    // $ANTLR start "rule__Date__Group_6__1"
    // InternalSmallUML.g:3159:1: rule__Date__Group_6__1 : rule__Date__Group_6__1__Impl ;
    public final void rule__Date__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3163:1: ( rule__Date__Group_6__1__Impl )
            // InternalSmallUML.g:3164:2: rule__Date__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_6__1"


    // $ANTLR start "rule__Date__Group_6__1__Impl"
    // InternalSmallUML.g:3170:1: rule__Date__Group_6__1__Impl : ( ( rule__Date__YearAssignment_6_1 ) ) ;
    public final void rule__Date__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3174:1: ( ( ( rule__Date__YearAssignment_6_1 ) ) )
            // InternalSmallUML.g:3175:1: ( ( rule__Date__YearAssignment_6_1 ) )
            {
            // InternalSmallUML.g:3175:1: ( ( rule__Date__YearAssignment_6_1 ) )
            // InternalSmallUML.g:3176:2: ( rule__Date__YearAssignment_6_1 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_6_1()); 
            // InternalSmallUML.g:3177:2: ( rule__Date__YearAssignment_6_1 )
            // InternalSmallUML.g:3177:3: rule__Date__YearAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__YearAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getYearAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_6__1__Impl"


    // $ANTLR start "rule__Date__Group_7__0"
    // InternalSmallUML.g:3186:1: rule__Date__Group_7__0 : rule__Date__Group_7__0__Impl rule__Date__Group_7__1 ;
    public final void rule__Date__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3190:1: ( rule__Date__Group_7__0__Impl rule__Date__Group_7__1 )
            // InternalSmallUML.g:3191:2: rule__Date__Group_7__0__Impl rule__Date__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_7__0"


    // $ANTLR start "rule__Date__Group_7__0__Impl"
    // InternalSmallUML.g:3198:1: rule__Date__Group_7__0__Impl : ( 'timestamp' ) ;
    public final void rule__Date__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3202:1: ( ( 'timestamp' ) )
            // InternalSmallUML.g:3203:1: ( 'timestamp' )
            {
            // InternalSmallUML.g:3203:1: ( 'timestamp' )
            // InternalSmallUML.g:3204:2: 'timestamp'
            {
             before(grammarAccess.getDateAccess().getTimestampKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getTimestampKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_7__0__Impl"


    // $ANTLR start "rule__Date__Group_7__1"
    // InternalSmallUML.g:3213:1: rule__Date__Group_7__1 : rule__Date__Group_7__1__Impl ;
    public final void rule__Date__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3217:1: ( rule__Date__Group_7__1__Impl )
            // InternalSmallUML.g:3218:2: rule__Date__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_7__1"


    // $ANTLR start "rule__Date__Group_7__1__Impl"
    // InternalSmallUML.g:3224:1: rule__Date__Group_7__1__Impl : ( ( rule__Date__TimestampAssignment_7_1 ) ) ;
    public final void rule__Date__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3228:1: ( ( ( rule__Date__TimestampAssignment_7_1 ) ) )
            // InternalSmallUML.g:3229:1: ( ( rule__Date__TimestampAssignment_7_1 ) )
            {
            // InternalSmallUML.g:3229:1: ( ( rule__Date__TimestampAssignment_7_1 ) )
            // InternalSmallUML.g:3230:2: ( rule__Date__TimestampAssignment_7_1 )
            {
             before(grammarAccess.getDateAccess().getTimestampAssignment_7_1()); 
            // InternalSmallUML.g:3231:2: ( rule__Date__TimestampAssignment_7_1 )
            // InternalSmallUML.g:3231:3: rule__Date__TimestampAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__TimestampAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getTimestampAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group_7__1__Impl"


    // $ANTLR start "rule__Timestamp__Group__0"
    // InternalSmallUML.g:3240:1: rule__Timestamp__Group__0 : rule__Timestamp__Group__0__Impl rule__Timestamp__Group__1 ;
    public final void rule__Timestamp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3244:1: ( rule__Timestamp__Group__0__Impl rule__Timestamp__Group__1 )
            // InternalSmallUML.g:3245:2: rule__Timestamp__Group__0__Impl rule__Timestamp__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Timestamp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__0"


    // $ANTLR start "rule__Timestamp__Group__0__Impl"
    // InternalSmallUML.g:3252:1: rule__Timestamp__Group__0__Impl : ( () ) ;
    public final void rule__Timestamp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3256:1: ( ( () ) )
            // InternalSmallUML.g:3257:1: ( () )
            {
            // InternalSmallUML.g:3257:1: ( () )
            // InternalSmallUML.g:3258:2: ()
            {
             before(grammarAccess.getTimestampAccess().getTimestampAction_0()); 
            // InternalSmallUML.g:3259:2: ()
            // InternalSmallUML.g:3259:3: 
            {
            }

             after(grammarAccess.getTimestampAccess().getTimestampAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__0__Impl"


    // $ANTLR start "rule__Timestamp__Group__1"
    // InternalSmallUML.g:3267:1: rule__Timestamp__Group__1 : rule__Timestamp__Group__1__Impl rule__Timestamp__Group__2 ;
    public final void rule__Timestamp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3271:1: ( rule__Timestamp__Group__1__Impl rule__Timestamp__Group__2 )
            // InternalSmallUML.g:3272:2: rule__Timestamp__Group__1__Impl rule__Timestamp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Timestamp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__1"


    // $ANTLR start "rule__Timestamp__Group__1__Impl"
    // InternalSmallUML.g:3279:1: rule__Timestamp__Group__1__Impl : ( 'Timestamp' ) ;
    public final void rule__Timestamp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3283:1: ( ( 'Timestamp' ) )
            // InternalSmallUML.g:3284:1: ( 'Timestamp' )
            {
            // InternalSmallUML.g:3284:1: ( 'Timestamp' )
            // InternalSmallUML.g:3285:2: 'Timestamp'
            {
             before(grammarAccess.getTimestampAccess().getTimestampKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getTimestampKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__1__Impl"


    // $ANTLR start "rule__Timestamp__Group__2"
    // InternalSmallUML.g:3294:1: rule__Timestamp__Group__2 : rule__Timestamp__Group__2__Impl rule__Timestamp__Group__3 ;
    public final void rule__Timestamp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3298:1: ( rule__Timestamp__Group__2__Impl rule__Timestamp__Group__3 )
            // InternalSmallUML.g:3299:2: rule__Timestamp__Group__2__Impl rule__Timestamp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Timestamp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__2"


    // $ANTLR start "rule__Timestamp__Group__2__Impl"
    // InternalSmallUML.g:3306:1: rule__Timestamp__Group__2__Impl : ( ( rule__Timestamp__NameAssignment_2 ) ) ;
    public final void rule__Timestamp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3310:1: ( ( ( rule__Timestamp__NameAssignment_2 ) ) )
            // InternalSmallUML.g:3311:1: ( ( rule__Timestamp__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:3311:1: ( ( rule__Timestamp__NameAssignment_2 ) )
            // InternalSmallUML.g:3312:2: ( rule__Timestamp__NameAssignment_2 )
            {
             before(grammarAccess.getTimestampAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:3313:2: ( rule__Timestamp__NameAssignment_2 )
            // InternalSmallUML.g:3313:3: rule__Timestamp__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimestampAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__2__Impl"


    // $ANTLR start "rule__Timestamp__Group__3"
    // InternalSmallUML.g:3321:1: rule__Timestamp__Group__3 : rule__Timestamp__Group__3__Impl rule__Timestamp__Group__4 ;
    public final void rule__Timestamp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3325:1: ( rule__Timestamp__Group__3__Impl rule__Timestamp__Group__4 )
            // InternalSmallUML.g:3326:2: rule__Timestamp__Group__3__Impl rule__Timestamp__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Timestamp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__3"


    // $ANTLR start "rule__Timestamp__Group__3__Impl"
    // InternalSmallUML.g:3333:1: rule__Timestamp__Group__3__Impl : ( '{' ) ;
    public final void rule__Timestamp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3337:1: ( ( '{' ) )
            // InternalSmallUML.g:3338:1: ( '{' )
            {
            // InternalSmallUML.g:3338:1: ( '{' )
            // InternalSmallUML.g:3339:2: '{'
            {
             before(grammarAccess.getTimestampAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__3__Impl"


    // $ANTLR start "rule__Timestamp__Group__4"
    // InternalSmallUML.g:3348:1: rule__Timestamp__Group__4 : rule__Timestamp__Group__4__Impl rule__Timestamp__Group__5 ;
    public final void rule__Timestamp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3352:1: ( rule__Timestamp__Group__4__Impl rule__Timestamp__Group__5 )
            // InternalSmallUML.g:3353:2: rule__Timestamp__Group__4__Impl rule__Timestamp__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Timestamp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__4"


    // $ANTLR start "rule__Timestamp__Group__4__Impl"
    // InternalSmallUML.g:3360:1: rule__Timestamp__Group__4__Impl : ( ( rule__Timestamp__Group_4__0 )? ) ;
    public final void rule__Timestamp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3364:1: ( ( ( rule__Timestamp__Group_4__0 )? ) )
            // InternalSmallUML.g:3365:1: ( ( rule__Timestamp__Group_4__0 )? )
            {
            // InternalSmallUML.g:3365:1: ( ( rule__Timestamp__Group_4__0 )? )
            // InternalSmallUML.g:3366:2: ( rule__Timestamp__Group_4__0 )?
            {
             before(grammarAccess.getTimestampAccess().getGroup_4()); 
            // InternalSmallUML.g:3367:2: ( rule__Timestamp__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmallUML.g:3367:3: rule__Timestamp__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timestamp__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimestampAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__4__Impl"


    // $ANTLR start "rule__Timestamp__Group__5"
    // InternalSmallUML.g:3375:1: rule__Timestamp__Group__5 : rule__Timestamp__Group__5__Impl rule__Timestamp__Group__6 ;
    public final void rule__Timestamp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3379:1: ( rule__Timestamp__Group__5__Impl rule__Timestamp__Group__6 )
            // InternalSmallUML.g:3380:2: rule__Timestamp__Group__5__Impl rule__Timestamp__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Timestamp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__5"


    // $ANTLR start "rule__Timestamp__Group__5__Impl"
    // InternalSmallUML.g:3387:1: rule__Timestamp__Group__5__Impl : ( ( rule__Timestamp__Group_5__0 )? ) ;
    public final void rule__Timestamp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3391:1: ( ( ( rule__Timestamp__Group_5__0 )? ) )
            // InternalSmallUML.g:3392:1: ( ( rule__Timestamp__Group_5__0 )? )
            {
            // InternalSmallUML.g:3392:1: ( ( rule__Timestamp__Group_5__0 )? )
            // InternalSmallUML.g:3393:2: ( rule__Timestamp__Group_5__0 )?
            {
             before(grammarAccess.getTimestampAccess().getGroup_5()); 
            // InternalSmallUML.g:3394:2: ( rule__Timestamp__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSmallUML.g:3394:3: rule__Timestamp__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timestamp__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimestampAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__5__Impl"


    // $ANTLR start "rule__Timestamp__Group__6"
    // InternalSmallUML.g:3402:1: rule__Timestamp__Group__6 : rule__Timestamp__Group__6__Impl rule__Timestamp__Group__7 ;
    public final void rule__Timestamp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3406:1: ( rule__Timestamp__Group__6__Impl rule__Timestamp__Group__7 )
            // InternalSmallUML.g:3407:2: rule__Timestamp__Group__6__Impl rule__Timestamp__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Timestamp__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__6"


    // $ANTLR start "rule__Timestamp__Group__6__Impl"
    // InternalSmallUML.g:3414:1: rule__Timestamp__Group__6__Impl : ( ( rule__Timestamp__Group_6__0 )? ) ;
    public final void rule__Timestamp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3418:1: ( ( ( rule__Timestamp__Group_6__0 )? ) )
            // InternalSmallUML.g:3419:1: ( ( rule__Timestamp__Group_6__0 )? )
            {
            // InternalSmallUML.g:3419:1: ( ( rule__Timestamp__Group_6__0 )? )
            // InternalSmallUML.g:3420:2: ( rule__Timestamp__Group_6__0 )?
            {
             before(grammarAccess.getTimestampAccess().getGroup_6()); 
            // InternalSmallUML.g:3421:2: ( rule__Timestamp__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmallUML.g:3421:3: rule__Timestamp__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Timestamp__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimestampAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__6__Impl"


    // $ANTLR start "rule__Timestamp__Group__7"
    // InternalSmallUML.g:3429:1: rule__Timestamp__Group__7 : rule__Timestamp__Group__7__Impl ;
    public final void rule__Timestamp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3433:1: ( rule__Timestamp__Group__7__Impl )
            // InternalSmallUML.g:3434:2: rule__Timestamp__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__7"


    // $ANTLR start "rule__Timestamp__Group__7__Impl"
    // InternalSmallUML.g:3440:1: rule__Timestamp__Group__7__Impl : ( '}' ) ;
    public final void rule__Timestamp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3444:1: ( ( '}' ) )
            // InternalSmallUML.g:3445:1: ( '}' )
            {
            // InternalSmallUML.g:3445:1: ( '}' )
            // InternalSmallUML.g:3446:2: '}'
            {
             before(grammarAccess.getTimestampAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group__7__Impl"


    // $ANTLR start "rule__Timestamp__Group_4__0"
    // InternalSmallUML.g:3456:1: rule__Timestamp__Group_4__0 : rule__Timestamp__Group_4__0__Impl rule__Timestamp__Group_4__1 ;
    public final void rule__Timestamp__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3460:1: ( rule__Timestamp__Group_4__0__Impl rule__Timestamp__Group_4__1 )
            // InternalSmallUML.g:3461:2: rule__Timestamp__Group_4__0__Impl rule__Timestamp__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Timestamp__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_4__0"


    // $ANTLR start "rule__Timestamp__Group_4__0__Impl"
    // InternalSmallUML.g:3468:1: rule__Timestamp__Group_4__0__Impl : ( 'hours' ) ;
    public final void rule__Timestamp__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3472:1: ( ( 'hours' ) )
            // InternalSmallUML.g:3473:1: ( 'hours' )
            {
            // InternalSmallUML.g:3473:1: ( 'hours' )
            // InternalSmallUML.g:3474:2: 'hours'
            {
             before(grammarAccess.getTimestampAccess().getHoursKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getHoursKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_4__0__Impl"


    // $ANTLR start "rule__Timestamp__Group_4__1"
    // InternalSmallUML.g:3483:1: rule__Timestamp__Group_4__1 : rule__Timestamp__Group_4__1__Impl ;
    public final void rule__Timestamp__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3487:1: ( rule__Timestamp__Group_4__1__Impl )
            // InternalSmallUML.g:3488:2: rule__Timestamp__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_4__1"


    // $ANTLR start "rule__Timestamp__Group_4__1__Impl"
    // InternalSmallUML.g:3494:1: rule__Timestamp__Group_4__1__Impl : ( ( rule__Timestamp__HoursAssignment_4_1 ) ) ;
    public final void rule__Timestamp__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3498:1: ( ( ( rule__Timestamp__HoursAssignment_4_1 ) ) )
            // InternalSmallUML.g:3499:1: ( ( rule__Timestamp__HoursAssignment_4_1 ) )
            {
            // InternalSmallUML.g:3499:1: ( ( rule__Timestamp__HoursAssignment_4_1 ) )
            // InternalSmallUML.g:3500:2: ( rule__Timestamp__HoursAssignment_4_1 )
            {
             before(grammarAccess.getTimestampAccess().getHoursAssignment_4_1()); 
            // InternalSmallUML.g:3501:2: ( rule__Timestamp__HoursAssignment_4_1 )
            // InternalSmallUML.g:3501:3: rule__Timestamp__HoursAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__HoursAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTimestampAccess().getHoursAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_4__1__Impl"


    // $ANTLR start "rule__Timestamp__Group_5__0"
    // InternalSmallUML.g:3510:1: rule__Timestamp__Group_5__0 : rule__Timestamp__Group_5__0__Impl rule__Timestamp__Group_5__1 ;
    public final void rule__Timestamp__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3514:1: ( rule__Timestamp__Group_5__0__Impl rule__Timestamp__Group_5__1 )
            // InternalSmallUML.g:3515:2: rule__Timestamp__Group_5__0__Impl rule__Timestamp__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Timestamp__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_5__0"


    // $ANTLR start "rule__Timestamp__Group_5__0__Impl"
    // InternalSmallUML.g:3522:1: rule__Timestamp__Group_5__0__Impl : ( 'minutes' ) ;
    public final void rule__Timestamp__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3526:1: ( ( 'minutes' ) )
            // InternalSmallUML.g:3527:1: ( 'minutes' )
            {
            // InternalSmallUML.g:3527:1: ( 'minutes' )
            // InternalSmallUML.g:3528:2: 'minutes'
            {
             before(grammarAccess.getTimestampAccess().getMinutesKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getMinutesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_5__0__Impl"


    // $ANTLR start "rule__Timestamp__Group_5__1"
    // InternalSmallUML.g:3537:1: rule__Timestamp__Group_5__1 : rule__Timestamp__Group_5__1__Impl ;
    public final void rule__Timestamp__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3541:1: ( rule__Timestamp__Group_5__1__Impl )
            // InternalSmallUML.g:3542:2: rule__Timestamp__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_5__1"


    // $ANTLR start "rule__Timestamp__Group_5__1__Impl"
    // InternalSmallUML.g:3548:1: rule__Timestamp__Group_5__1__Impl : ( ( rule__Timestamp__MinutesAssignment_5_1 ) ) ;
    public final void rule__Timestamp__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3552:1: ( ( ( rule__Timestamp__MinutesAssignment_5_1 ) ) )
            // InternalSmallUML.g:3553:1: ( ( rule__Timestamp__MinutesAssignment_5_1 ) )
            {
            // InternalSmallUML.g:3553:1: ( ( rule__Timestamp__MinutesAssignment_5_1 ) )
            // InternalSmallUML.g:3554:2: ( rule__Timestamp__MinutesAssignment_5_1 )
            {
             before(grammarAccess.getTimestampAccess().getMinutesAssignment_5_1()); 
            // InternalSmallUML.g:3555:2: ( rule__Timestamp__MinutesAssignment_5_1 )
            // InternalSmallUML.g:3555:3: rule__Timestamp__MinutesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__MinutesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTimestampAccess().getMinutesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_5__1__Impl"


    // $ANTLR start "rule__Timestamp__Group_6__0"
    // InternalSmallUML.g:3564:1: rule__Timestamp__Group_6__0 : rule__Timestamp__Group_6__0__Impl rule__Timestamp__Group_6__1 ;
    public final void rule__Timestamp__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3568:1: ( rule__Timestamp__Group_6__0__Impl rule__Timestamp__Group_6__1 )
            // InternalSmallUML.g:3569:2: rule__Timestamp__Group_6__0__Impl rule__Timestamp__Group_6__1
            {
            pushFollow(FOLLOW_32);
            rule__Timestamp__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_6__0"


    // $ANTLR start "rule__Timestamp__Group_6__0__Impl"
    // InternalSmallUML.g:3576:1: rule__Timestamp__Group_6__0__Impl : ( 'seconds' ) ;
    public final void rule__Timestamp__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3580:1: ( ( 'seconds' ) )
            // InternalSmallUML.g:3581:1: ( 'seconds' )
            {
            // InternalSmallUML.g:3581:1: ( 'seconds' )
            // InternalSmallUML.g:3582:2: 'seconds'
            {
             before(grammarAccess.getTimestampAccess().getSecondsKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getSecondsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_6__0__Impl"


    // $ANTLR start "rule__Timestamp__Group_6__1"
    // InternalSmallUML.g:3591:1: rule__Timestamp__Group_6__1 : rule__Timestamp__Group_6__1__Impl ;
    public final void rule__Timestamp__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3595:1: ( rule__Timestamp__Group_6__1__Impl )
            // InternalSmallUML.g:3596:2: rule__Timestamp__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_6__1"


    // $ANTLR start "rule__Timestamp__Group_6__1__Impl"
    // InternalSmallUML.g:3602:1: rule__Timestamp__Group_6__1__Impl : ( ( rule__Timestamp__SecondsAssignment_6_1 ) ) ;
    public final void rule__Timestamp__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3606:1: ( ( ( rule__Timestamp__SecondsAssignment_6_1 ) ) )
            // InternalSmallUML.g:3607:1: ( ( rule__Timestamp__SecondsAssignment_6_1 ) )
            {
            // InternalSmallUML.g:3607:1: ( ( rule__Timestamp__SecondsAssignment_6_1 ) )
            // InternalSmallUML.g:3608:2: ( rule__Timestamp__SecondsAssignment_6_1 )
            {
             before(grammarAccess.getTimestampAccess().getSecondsAssignment_6_1()); 
            // InternalSmallUML.g:3609:2: ( rule__Timestamp__SecondsAssignment_6_1 )
            // InternalSmallUML.g:3609:3: rule__Timestamp__SecondsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Timestamp__SecondsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTimestampAccess().getSecondsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUML.g:3618:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3622:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:3623:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSmallUML.g:3630:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3634:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:3635:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:3635:1: ( ( '-' )? )
            // InternalSmallUML.g:3636:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:3637:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmallUML.g:3637:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSmallUML.g:3645:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3649:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:3650:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSmallUML.g:3656:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3660:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:3661:1: ( RULE_INT )
            {
            // InternalSmallUML.g:3661:1: ( RULE_INT )
            // InternalSmallUML.g:3662:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Diagram__NameAssignment_2"
    // InternalSmallUML.g:3672:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3676:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3677:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3677:2: ( RULE_ID )
            // InternalSmallUML.g:3678:3: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__NameAssignment_2"


    // $ANTLR start "rule__Diagram__EntitiesAssignment_4"
    // InternalSmallUML.g:3687:1: rule__Diagram__EntitiesAssignment_4 : ( ruleDiagramEntity ) ;
    public final void rule__Diagram__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3691:1: ( ( ruleDiagramEntity ) )
            // InternalSmallUML.g:3692:2: ( ruleDiagramEntity )
            {
            // InternalSmallUML.g:3692:2: ( ruleDiagramEntity )
            // InternalSmallUML.g:3693:3: ruleDiagramEntity
            {
             before(grammarAccess.getDiagramAccess().getEntitiesDiagramEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDiagramEntity();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getEntitiesDiagramEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__EntitiesAssignment_4"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // InternalSmallUML.g:3702:1: rule__Type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3706:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3707:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3707:2: ( RULE_ID )
            // InternalSmallUML.g:3708:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__Class__AbstractAssignment_1"
    // InternalSmallUML.g:3717:1: rule__Class__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3721:1: ( ( ( 'abstract' ) ) )
            // InternalSmallUML.g:3722:2: ( ( 'abstract' ) )
            {
            // InternalSmallUML.g:3722:2: ( ( 'abstract' ) )
            // InternalSmallUML.g:3723:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalSmallUML.g:3724:3: ( 'abstract' )
            // InternalSmallUML.g:3725:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalSmallUML.g:3736:1: rule__Class__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3740:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3741:2: ( ruleEString )
            {
            // InternalSmallUML.g:3741:2: ( ruleEString )
            // InternalSmallUML.g:3742:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Class__ExtendsAssignment_4_1"
    // InternalSmallUML.g:3751:1: rule__Class__ExtendsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3755:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3756:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3756:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3757:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0()); 
            // InternalSmallUML.g:3758:3: ( ruleEString )
            // InternalSmallUML.g:3759:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getExtendsClassEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getExtendsClassEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getExtendsClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ExtendsAssignment_4_1"


    // $ANTLR start "rule__Class__AttributesAssignment_6_2"
    // InternalSmallUML.g:3770:1: rule__Class__AttributesAssignment_6_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3774:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3775:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3775:2: ( ruleAttribute )
            // InternalSmallUML.g:3776:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_6_2"


    // $ANTLR start "rule__Class__AttributesAssignment_6_3_1"
    // InternalSmallUML.g:3785:1: rule__Class__AttributesAssignment_6_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3789:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3790:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3790:2: ( ruleAttribute )
            // InternalSmallUML.g:3791:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_6_3_1"


    // $ANTLR start "rule__Class__OperationsAssignment_7_2"
    // InternalSmallUML.g:3800:1: rule__Class__OperationsAssignment_7_2 : ( ruleOperation ) ;
    public final void rule__Class__OperationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3804:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:3805:2: ( ruleOperation )
            {
            // InternalSmallUML.g:3805:2: ( ruleOperation )
            // InternalSmallUML.g:3806:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationsAssignment_7_2"


    // $ANTLR start "rule__Class__OperationsAssignment_7_3_1"
    // InternalSmallUML.g:3815:1: rule__Class__OperationsAssignment_7_3_1 : ( ruleOperation ) ;
    public final void rule__Class__OperationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3819:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:3820:2: ( ruleOperation )
            {
            // InternalSmallUML.g:3820:2: ( ruleOperation )
            // InternalSmallUML.g:3821:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationsAssignment_7_3_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUML.g:3830:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3834:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3835:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3835:2: ( RULE_ID )
            // InternalSmallUML.g:3836:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalSmallUML.g:3845:1: rule__Attribute__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3849:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3850:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3850:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3851:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeAccess().getTypeAbstractEntityCrossReference_3_0()); 
            // InternalSmallUML.g:3852:3: ( ruleEString )
            // InternalSmallUML.g:3853:4: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeAbstractEntityEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAbstractEntityEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeAbstractEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Operation__ReturnTypeAssignment_1"
    // InternalSmallUML.g:3864:1: rule__Operation__ReturnTypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3868:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3869:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3869:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3870:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAbstractEntityCrossReference_1_0()); 
            // InternalSmallUML.g:3871:3: ( ruleEString )
            // InternalSmallUML.g:3872:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAbstractEntityEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getReturnTypeAbstractEntityEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getReturnTypeAbstractEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnTypeAssignment_1"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalSmallUML.g:3883:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3887:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3888:2: ( ruleEString )
            {
            // InternalSmallUML.g:3888:2: ( ruleEString )
            // InternalSmallUML.g:3889:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ParametersAssignment_4"
    // InternalSmallUML.g:3898:1: rule__Operation__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3902:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:3903:2: ( ruleParameter )
            {
            // InternalSmallUML.g:3903:2: ( ruleParameter )
            // InternalSmallUML.g:3904:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_4"


    // $ANTLR start "rule__Operation__ParametersAssignment_5_1"
    // InternalSmallUML.g:3913:1: rule__Operation__ParametersAssignment_5_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3917:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:3918:2: ( ruleParameter )
            {
            // InternalSmallUML.g:3918:2: ( ruleParameter )
            // InternalSmallUML.g:3919:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_5_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_0"
    // InternalSmallUML.g:3928:1: rule__Parameter__TypeAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3932:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3933:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3933:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3934:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getTypeAbstractEntityCrossReference_1_0_0()); 
            // InternalSmallUML.g:3935:3: ( ruleEString )
            // InternalSmallUML.g:3936:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeAbstractEntityEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeAbstractEntityEStringParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeAbstractEntityCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1_0"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalSmallUML.g:3947:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3951:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3952:2: ( ruleEString )
            {
            // InternalSmallUML.g:3952:2: ( ruleEString )
            // InternalSmallUML.g:3953:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalSmallUML.g:3962:1: rule__Association__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3966:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3967:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3967:2: ( RULE_ID )
            // InternalSmallUML.g:3968:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_2"


    // $ANTLR start "rule__Association__RolesAssignment_4"
    // InternalSmallUML.g:3977:1: rule__Association__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__Association__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3981:1: ( ( ruleRole ) )
            // InternalSmallUML.g:3982:2: ( ruleRole )
            {
            // InternalSmallUML.g:3982:2: ( ruleRole )
            // InternalSmallUML.g:3983:3: ruleRole
            {
             before(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RolesAssignment_4"


    // $ANTLR start "rule__Association__RolesAssignment_5_1"
    // InternalSmallUML.g:3992:1: rule__Association__RolesAssignment_5_1 : ( ruleRole ) ;
    public final void rule__Association__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3996:1: ( ( ruleRole ) )
            // InternalSmallUML.g:3997:2: ( ruleRole )
            {
            // InternalSmallUML.g:3997:2: ( ruleRole )
            // InternalSmallUML.g:3998:3: ruleRole
            {
             before(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRolesRoleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RolesAssignment_5_1"


    // $ANTLR start "rule__Role__NameAssignment_2"
    // InternalSmallUML.g:4007:1: rule__Role__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4011:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:4012:2: ( RULE_ID )
            {
            // InternalSmallUML.g:4012:2: ( RULE_ID )
            // InternalSmallUML.g:4013:3: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_2"


    // $ANTLR start "rule__Role__CardinalityAssignment_3"
    // InternalSmallUML.g:4022:1: rule__Role__CardinalityAssignment_3 : ( ruleCardinality ) ;
    public final void rule__Role__CardinalityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4026:1: ( ( ruleCardinality ) )
            // InternalSmallUML.g:4027:2: ( ruleCardinality )
            {
            // InternalSmallUML.g:4027:2: ( ruleCardinality )
            // InternalSmallUML.g:4028:3: ruleCardinality
            {
             before(grammarAccess.getRoleAccess().getCardinalityCardinalityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getCardinalityCardinalityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__CardinalityAssignment_3"


    // $ANTLR start "rule__Role__EntityAssignment_5"
    // InternalSmallUML.g:4037:1: rule__Role__EntityAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Role__EntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4041:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:4042:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:4042:2: ( ( ruleEString ) )
            // InternalSmallUML.g:4043:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getEntityClassCrossReference_5_0()); 
            // InternalSmallUML.g:4044:3: ( ruleEString )
            // InternalSmallUML.g:4045:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getEntityClassEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getEntityClassEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getEntityClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__EntityAssignment_5"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_2"
    // InternalSmallUML.g:4056:1: rule__Cardinality__LowerBoundAssignment_2 : ( ruleEString ) ;
    public final void rule__Cardinality__LowerBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4060:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4061:2: ( ruleEString )
            {
            // InternalSmallUML.g:4061:2: ( ruleEString )
            // InternalSmallUML.g:4062:3: ruleEString
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getLowerBoundEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__LowerBoundAssignment_2"


    // $ANTLR start "rule__Cardinality__UpperBoundAssignment_4"
    // InternalSmallUML.g:4071:1: rule__Cardinality__UpperBoundAssignment_4 : ( ruleEString ) ;
    public final void rule__Cardinality__UpperBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4075:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4076:2: ( ruleEString )
            {
            // InternalSmallUML.g:4076:2: ( ruleEString )
            // InternalSmallUML.g:4077:3: ruleEString
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getUpperBoundEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__UpperBoundAssignment_4"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalSmallUML.g:4086:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4090:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:4091:2: ( RULE_ID )
            {
            // InternalSmallUML.g:4091:2: ( RULE_ID )
            // InternalSmallUML.g:4092:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__ElementsAssignment_4"
    // InternalSmallUML.g:4101:1: rule__Enumeration__ElementsAssignment_4 : ( ruleEString ) ;
    public final void rule__Enumeration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4105:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4106:2: ( ruleEString )
            {
            // InternalSmallUML.g:4106:2: ( ruleEString )
            // InternalSmallUML.g:4107:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ElementsAssignment_4"


    // $ANTLR start "rule__Enumeration__ElementsAssignment_5_1"
    // InternalSmallUML.g:4116:1: rule__Enumeration__ElementsAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Enumeration__ElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4120:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4121:2: ( ruleEString )
            {
            // InternalSmallUML.g:4121:2: ( ruleEString )
            // InternalSmallUML.g:4122:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getElementsEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ElementsAssignment_5_1"


    // $ANTLR start "rule__Date__NameAssignment_2"
    // InternalSmallUML.g:4131:1: rule__Date__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Date__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4135:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:4136:2: ( RULE_ID )
            {
            // InternalSmallUML.g:4136:2: ( RULE_ID )
            // InternalSmallUML.g:4137:3: RULE_ID
            {
             before(grammarAccess.getDateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__NameAssignment_2"


    // $ANTLR start "rule__Date__DayAssignment_4_1"
    // InternalSmallUML.g:4146:1: rule__Date__DayAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Date__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4150:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4151:2: ( ruleEString )
            {
            // InternalSmallUML.g:4151:2: ( ruleEString )
            // InternalSmallUML.g:4152:3: ruleEString
            {
             before(grammarAccess.getDateAccess().getDayEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateAccess().getDayEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_4_1"


    // $ANTLR start "rule__Date__MonthAssignment_5_1"
    // InternalSmallUML.g:4161:1: rule__Date__MonthAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Date__MonthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4165:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4166:2: ( ruleEString )
            {
            // InternalSmallUML.g:4166:2: ( ruleEString )
            // InternalSmallUML.g:4167:3: ruleEString
            {
             before(grammarAccess.getDateAccess().getMonthEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateAccess().getMonthEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_5_1"


    // $ANTLR start "rule__Date__YearAssignment_6_1"
    // InternalSmallUML.g:4176:1: rule__Date__YearAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Date__YearAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4180:1: ( ( ruleEString ) )
            // InternalSmallUML.g:4181:2: ( ruleEString )
            {
            // InternalSmallUML.g:4181:2: ( ruleEString )
            // InternalSmallUML.g:4182:3: ruleEString
            {
             before(grammarAccess.getDateAccess().getYearEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateAccess().getYearEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__YearAssignment_6_1"


    // $ANTLR start "rule__Date__TimestampAssignment_7_1"
    // InternalSmallUML.g:4191:1: rule__Date__TimestampAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Date__TimestampAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4195:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:4196:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:4196:2: ( ( ruleEString ) )
            // InternalSmallUML.g:4197:3: ( ruleEString )
            {
             before(grammarAccess.getDateAccess().getTimestampTimestampCrossReference_7_1_0()); 
            // InternalSmallUML.g:4198:3: ( ruleEString )
            // InternalSmallUML.g:4199:4: ruleEString
            {
             before(grammarAccess.getDateAccess().getTimestampTimestampEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateAccess().getTimestampTimestampEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getDateAccess().getTimestampTimestampCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__TimestampAssignment_7_1"


    // $ANTLR start "rule__Timestamp__NameAssignment_2"
    // InternalSmallUML.g:4210:1: rule__Timestamp__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Timestamp__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4214:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:4215:2: ( RULE_ID )
            {
            // InternalSmallUML.g:4215:2: ( RULE_ID )
            // InternalSmallUML.g:4216:3: RULE_ID
            {
             before(grammarAccess.getTimestampAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTimestampAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__NameAssignment_2"


    // $ANTLR start "rule__Timestamp__HoursAssignment_4_1"
    // InternalSmallUML.g:4225:1: rule__Timestamp__HoursAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Timestamp__HoursAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4229:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:4230:2: ( ruleEInt )
            {
            // InternalSmallUML.g:4230:2: ( ruleEInt )
            // InternalSmallUML.g:4231:3: ruleEInt
            {
             before(grammarAccess.getTimestampAccess().getHoursEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimestampAccess().getHoursEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__HoursAssignment_4_1"


    // $ANTLR start "rule__Timestamp__MinutesAssignment_5_1"
    // InternalSmallUML.g:4240:1: rule__Timestamp__MinutesAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Timestamp__MinutesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4244:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:4245:2: ( ruleEInt )
            {
            // InternalSmallUML.g:4245:2: ( ruleEInt )
            // InternalSmallUML.g:4246:3: ruleEInt
            {
             before(grammarAccess.getTimestampAccess().getMinutesEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimestampAccess().getMinutesEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__MinutesAssignment_5_1"


    // $ANTLR start "rule__Timestamp__SecondsAssignment_6_1"
    // InternalSmallUML.g:4255:1: rule__Timestamp__SecondsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Timestamp__SecondsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:4259:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:4260:2: ( ruleEInt )
            {
            // InternalSmallUML.g:4260:2: ( ruleEInt )
            // InternalSmallUML.g:4261:3: ruleEInt
            {
             before(grammarAccess.getTimestampAccess().getSecondsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimestampAccess().getSecondsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timestamp__SecondsAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010861016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010861014002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000442000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010861014000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000780002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010860014000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000040L});

}