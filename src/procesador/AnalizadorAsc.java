/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

package procesador;
/* First part of user declarations.  */

/* "%code imports" blocks.  */

/* Line 33 of lalr1.java  */
/* Line 55 of "entradaBison"  */

  import java.io.File;



/* Line 33 of lalr1.java  */
/* Line 47 of "AnalizadorAsc.java"  */

/**
 * A Bison parser, automatically generated from <tt>entradaBison</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class AnalizadorAsc
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int PUNTOYCOMA = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int NEWLINE = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int IF = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int NEW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ARRAY = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int FUNCTION = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int DOCWRITE = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int VAR = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int PROMPT = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int OPARITMETICO = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int OPRELACIONAL = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int OPASIGNACION = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int OPESPECIAL = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int OPLOGICO = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int CORCHETEAB = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int CORCHETECE = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int PARENTESISAB = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int PARENTESISCE = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int LLAVEAB = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int LLAVECE = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int COMA = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int DOSPUNTOS = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int ENTERO = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int CADENA = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFICADOR = 286;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>AnalizadorAsc</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public AnalizadorAsc (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 91 of "entradaBison"  */
    { lexico.estadoDecV(false); };
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 94 of "entradaBison"  */
    { lexico.estadoDecV(true); };
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 97 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (1-(1)))).nParam; };
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 98 of "entradaBison"  */
    { yyval.nParam = 0; };
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 101 of "entradaBison"  */
    { yyval.nParam = 1; };
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 102 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (3-(3)))).nParam + 1; };
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 105 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.ENTERO && ((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.VECTOR ) errores.addError("Tipo incompatible");
if(((EntradaTS)(yystack.valueAt (3-(1)))).tipo == TipoParam.VECTOR || ((EntradaTS)(yystack.valueAt (3-(1)))).tipo == TipoParam.FUNCION) errores.addError("Error en la asignacion: tipo incompatible"); 
((EntradaTS)(yystack.valueAt (3-(1)))).tipo = ((Parametros)(yystack.valueAt (3-(3)))).tipo;
yyval.tipo = ((EntradaTS)(yystack.valueAt (3-(1)))).tipo; };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 109 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 112 of "entradaBison"  */
    { if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) errores.addError("Tipos de datos no validos para operador logico");
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 114 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 117 of "entradaBison"  */
    { if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) errores.addError("Tipos de datos no validos para operador relacional");
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 119 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 122 of "entradaBison"  */
    { if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) errores.addError("Tipos de datos no validos para operador aritmetico");
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 124 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 127 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) errores.addError("Tipos de datos no validos para operador de incremento"); 
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 129 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 132 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (3-(2)))).tipo; };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 133 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 136 of "entradaBison"  */
    { if(!tablaSimbolos.buscarFuncionTS(((EntradaTS)(yystack.valueAt (4-(1)))).getLVal().getNombre(), ((Parametros)(yystack.valueAt (4-(3)))).nParam)) errores.addError("Funcion no definida"); 
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 138 of "entradaBison"  */
    { if(!(((EntradaTS)(yystack.valueAt (4-(1)))).getLVal() instanceof Variable)) errores.addError("Variable no definida");
Variable v = (Variable)((EntradaTS)(yystack.valueAt (4-(1)))).getLVal();
if(v.getTipo() != Variable.TipoVariable.VECTOR) errores.addError("La variable no es de tipo vector.");
if(((Parametros)(yystack.valueAt (4-(3)))).tipo != TipoParam.ENTERO) errores.addError("Indice no es de tipo entero."); 
yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 143 of "entradaBison"  */
    { if(((EntradaTS)(yystack.valueAt (1-(1)))).getLVal().getTipo() == Variable.TipoVariable.ENTERO) yyval.tipo = TipoParam.ENTERO;
else if(((EntradaTS)(yystack.valueAt (1-(1)))).getLVal().getTipo() == Variable.TipoVariable.VECTOR) yyval.tipo = TipoParam.VECTOR;
else errores.addError("Tipo no valido"); };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 146 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 147 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 148 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 151 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 152 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (5-(4)))).tipo != TipoParam.ENTERO) errores.addError("Tamaño de vector debe ser entero"); 
yyval.tipo = TipoParam.VECTOR; };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 156 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (6-(3)))).tipo != TipoParam.ENTERO) errores.addError("Condición debe ser entera"); };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 159 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (9-(3)))).tipo != TipoParam.ENTERO) errores.addError("Variable del Switch debe ser entera"); };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 166 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (7-(3)))).tipo != TipoParam.ENTERO) errores.addError("Condición debe ser entera"); };
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 173 of "entradaBison"  */
    { lexico.estadoDecF(true); };
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 176 of "entradaBison"  */
    { lexico.estadoDecF(false); 
tablaSimbolos.borrarTabla();};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 180 of "entradaBison"  */
    { if(lexico.getEstadoDecF) errores.addError("No se admiten declaración recursiva de funciones."); 
 else if(tablaSimbolos.buscarFuncionTS(((EntradaTS)(yystack.valueAt (3-(1)))).getLVal().getNombre(), ((Parametros)(yystack.valueAt (3-(3)))).nParam))
	errores.addError("Funcion ya definida"); 
tablaSimbolos.añadir(((EntradaTS)(yystack.valueAt (3-(1)))).getLVal().getNombre(),false,EntradaTS.TipoEntradaTS.FUNCION)
tablaSimbolos.crearTabla(); };
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 185 of "entradaBison"  */
    {
tablaSimbolos.añadir(((EntradaTS)(yystack.valueAt (3-(1)))).getLVal().getNombre(),false,EntradaTS.TipoEntradaTS.FUNCION)
tablaSimbolos.crearTabla(); };
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 190 of "entradaBison"  */
    { yyval.nParam=1; };
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 191 of "entradaBison"  */
    { yyval.nParam=((Parametros)(yystack.valueAt (3-(3)))).nParam+1; };
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 194 of "entradaBison"  */
    { if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) errores.addError("Funcion debe devolver un entero"); };
  break;
    



/* Line 351 of lalr1.java  */
/* Line 690 of "AnalizadorAsc.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final byte yypact_ninf_ = -58;
  private static final byte yypact_[] =
  {
        31,   -58,   -58,    -1,     1,   -24,     3,   -58,     4,    82,
       0,   -58,    30,    28,   -58,   -58,    14,   -58,     2,   -58,
      19,    23,    39,   -58,   -58,   -58,   -58,   -58,   -58,     0,
       0,    24,   -58,    26,    27,    -8,   -58,    37,    78,     0,
      79,   -58,    31,   -58,    79,    79,    79,    44,    45,    40,
      49,    50,   -58,    65,    23,   -58,    55,    54,   -58,   -11,
     -58,    23,    39,   -58,    75,    75,    57,    75,   -58,   -58,
      58,   -58,   -58,    79,   -58,    53,    61,   -20,    70,     0,
     -58,   -58,    75,   -58,    25,   -58,    31,    59,    92,    75,
     -58,    69,    88,   -58,     0,    80,   -58,     0,    75,    76,
     -58,   -58,    86,    31,   -58,    14,   106,   -58,   -58
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     6,     5,     0,     0,     0,     0,    13,     0,     0,
       0,    35,    32,     0,     2,     4,     0,     7,     0,    11,
      19,    21,    23,    25,    27,    29,     9,    10,     8,     0,
       0,     0,    45,     0,     0,    32,    26,     0,     0,     0,
      15,     1,     0,    12,     0,     0,     0,     0,     0,     0,
       0,     0,    28,     0,    36,    18,     0,     0,    14,    16,
       3,    20,    22,    24,    41,    41,     0,    41,    34,    33,
       0,    31,    30,     0,    40,     0,     0,     0,     0,     0,
      17,    38,    41,    48,     0,    47,     0,     0,     0,    41,
      49,     0,    53,    37,     0,     0,    50,    52,    41,     0,
      39,    51,     0,     0,    46,     0,    44,    43,    42
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] =
  {
       -58,   -58,   -40,   -16,    41,   -58,   -58,   -58,    42,    -9,
     -58,   -35,    72,    73,   109,   -58,   -58,   -58,   -58,   -57,
     -58,   -58,   -58,   -58,   -58,    29,   -58
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte
  yydefgoto_[] =
  {
        -1,    13,    14,    15,    16,    17,    18,    57,    58,    19,
      20,    21,    22,    23,    24,    25,    55,    26,    27,    75,
      89,   108,    28,    32,    67,    85,    98
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final byte yytable_ninf_ = -1;
  private static final byte
  yytable_[] =
  {
        42,    37,    60,    54,    83,    59,    45,    31,    76,    61,
      78,    84,     6,    39,     8,    40,    73,     1,     2,     9,
      47,    48,    29,    10,    30,    88,    33,    34,    41,    11,
      56,    12,    95,    43,     1,     2,     3,     4,    59,    44,
      45,   102,     5,     6,     7,     8,    92,    49,    38,    90,
       9,    39,    91,    40,    10,    46,    50,    51,     3,     4,
      11,    52,    12,   105,     5,     6,     7,     8,    64,    65,
      87,    66,     9,    68,    69,    70,    10,    71,    72,    74,
      77,    79,    11,    93,    12,    99,    82,    53,   101,   106,
       6,     6,     8,     8,     6,    86,     8,     9,     9,    94,
      84,    10,    10,    97,   103,    10,   100,    11,    11,    35,
      35,    11,   104,    35,   107,    80,    81,    62,    36,    63,
      96
  };

  /* YYCHECK.  */
  private static final byte
  yycheck_[] =
  {
        16,    10,    42,    38,    24,    40,    17,    31,    65,    44,
      67,    31,    12,    21,    14,    23,    27,     3,     4,    19,
      29,    30,    23,    23,    23,    82,    23,    23,     0,    29,
      39,    31,    89,    31,     3,     4,     5,     6,    73,    20,
      17,    98,    11,    12,    13,    14,    86,    23,    18,    24,
      19,    21,    27,    23,    23,    16,    30,    30,     5,     6,
      29,    24,    31,   103,    11,    12,    13,    14,    24,    24,
      79,    31,    19,    24,    24,    10,    23,    22,    24,     4,
      23,    23,    29,    24,    31,    94,    25,     9,    97,   105,
      12,    12,    14,    14,    12,    25,    14,    19,    19,     7,
      31,    23,    23,    15,    28,    23,    26,    29,    29,    31,
      31,    29,    26,    31,     8,    73,    75,    45,     9,    46,
      91
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     3,     4,     5,     6,    11,    12,    13,    14,    19,
      23,    29,    31,    33,    34,    35,    36,    37,    38,    41,
      42,    43,    44,    45,    46,    47,    49,    50,    54,    23,
      23,    31,    55,    23,    23,    31,    46,    41,    18,    21,
      23,     0,    35,    31,    20,    17,    16,    41,    41,    23,
      30,    30,    24,     9,    43,    48,    41,    39,    40,    43,
      34,    43,    44,    45,    24,    24,    31,    56,    24,    24,
      10,    22,    24,    27,     4,    51,    51,    23,    51,    23,
      40,    36,    25,    24,    31,    57,    25,    41,    51,    52,
      24,    27,    34,    24,     7,    51,    57,    15,    58,    41,
      26,    41,    51,    28,    26,    34,    35,     8,    53
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    32,    33,    34,    34,    35,    35,    36,    36,    36,
      36,    36,    37,    38,    39,    39,    40,    40,    41,    41,
      42,    42,    43,    43,    44,    44,    45,    45,    46,    46,
      47,    47,    47,    47,    47,    47,    48,    48,    49,    50,
      51,    51,    52,    53,    53,    54,    55,    56,    56,    57,
      57,    58,    58,    58
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     3,     1,     1,     1,     1,     1,     1,
       1,     1,     2,     1,     1,     0,     1,     3,     3,     1,
       3,     1,     3,     1,     3,     1,     2,     1,     3,     1,
       4,     4,     1,     4,     4,     1,     1,     5,     6,     9,
       1,     0,     7,     1,     0,     2,     9,     3,     3,     2,
       3,     2,     1,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "PUNTOYCOMA", "NEWLINE", "IF", "SWITCH",
  "CASE", "BREAK", "NEW", "ARRAY", "FUNCTION", "DOCWRITE", "VAR", "PROMPT",
  "RETURN", "OPARITMETICO", "OPRELACIONAL", "OPASIGNACION", "OPESPECIAL",
  "OPLOGICO", "CORCHETEAB", "CORCHETECE", "PARENTESISAB", "PARENTESISCE",
  "LLAVEAB", "LLAVECE", "COMA", "DOSPUNTOS", "ENTERO", "CADENA",
  "IDENTIFICADOR", "$accept", "X", "A", "D", "S", "V", "T", "P", "Z", "P6",
  "P7", "P5", "P4", "P3", "P2", "P1", "N", "I", "W", "L", "C", "B", "F",
  "F2", "H", "J", "R", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        33,     0,    -1,    34,    -1,    36,    35,    34,    -1,    35,
      -1,     4,    -1,     3,    -1,    37,    -1,    54,    -1,    49,
      -1,    50,    -1,    41,    -1,    38,    31,    -1,    13,    -1,
      40,    -1,    -1,    43,    -1,    43,    27,    40,    -1,    31,
      18,    48,    -1,    42,    -1,    42,    20,    43,    -1,    43,
      -1,    43,    17,    44,    -1,    44,    -1,    44,    16,    45,
      -1,    45,    -1,    19,    46,    -1,    46,    -1,    23,    41,
      24,    -1,    47,    -1,    31,    23,    39,    24,    -1,    31,
      21,    41,    22,    -1,    31,    -1,    14,    23,    30,    24,
      -1,    12,    23,    30,    24,    -1,    29,    -1,    43,    -1,
       9,    10,    23,    41,    24,    -1,     5,    23,    41,    24,
      51,    36,    -1,     6,    23,    41,    24,    51,    25,    52,
      51,    26,    -1,     4,    -1,    -1,    51,     7,    41,    28,
      34,    35,    53,    -1,     8,    -1,    -1,    11,    55,    -1,
      31,    23,    56,    51,    25,    34,    58,    51,    26,    -1,
      31,    23,    57,    -1,    31,    23,    24,    -1,    31,    24,
      -1,    31,    27,    57,    -1,    15,    41,    -1,    15,    -1,
      -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     9,    11,    13,    15,    17,    19,
      21,    23,    25,    28,    30,    32,    33,    35,    39,    43,
      45,    49,    51,    55,    57,    61,    63,    66,    68,    72,
      74,    79,    84,    86,    91,    96,    98,   100,   106,   113,
     123,   125,   126,   134,   136,   137,   140,   150,   154,   158,
     161,   165,   168,   170
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    73,    73,    76,    77,    80,    81,    84,    85,    86,
      87,    88,    91,    94,    97,    98,   101,   102,   105,   109,
     112,   114,   117,   119,   122,   124,   127,   129,   132,   133,
     136,   138,   143,   146,   147,   148,   151,   152,   156,   159,
     162,   163,   166,   169,   170,   173,   176,   180,   185,   190,
     191,   194,   195,   196
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 120;
  private static final int yynnts_ = 27;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 41;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 32;

  private static final int yyuser_token_number_max_ = 286;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 9 of "entradaBison"  */


   public static GestorErrores errores;
	public static GestorTS tablaSimbolos;
	public static AnalizadorLexico lexico;
	
	public static void main(String[] args) {
		
		//Comprobaciones del archivo
		if(args.length < 1){
			System.err.println("ERROR - El programa tiene que recibir como argumento" +
					" la ruta del archivo con el codigo fuente a procesar.");
			System.exit(1);
		}
		
		File source = new File(args[0]);
		if(!source.exists() || !source.canRead()){
			System.err.println("No se ha podido leer el archivo: "+args[0]);
			System.exit(2);
		}
		
		//Creamos el analizador lexico
		AnalizadorLexico lexico = new AnalizadorLexico(source);
		
		//Creamos la tabla de simbolos
		tablaSimbolos = new GestorTS();
		
		//Creamos el gestor de errores
		errores = new GestorErrores(lexico);
		
		AnalizadorAsc analizador = new AnalizadorAsc(lexico);
		analizador.parse();
		//Crear y lanzar el analizador sintatico-semantico
		//AnalizadorSS ss = new AnalizadorSS(lexico);
	}
	
	public static GestorErrores getGestorErrores(){
		return errores;
	}
	
	public static GestorTS getGestorTS(){
		return tablaSimbolos;
	}




/* Line 927 of lalr1.java  */
/* Line 1427 of "AnalizadorAsc.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 200 of "entradaBison"  */






