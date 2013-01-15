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
/* Line 9 of "entradaBison"  */

import java.io.File;
import java.io.IOException;



/* Line 33 of lalr1.java  */
/* Line 48 of "AnalizadorAsc.java"  */

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
    Parametros getLVal ();

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
    
    private Parametros[] valueStack = new Parametros[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Parametros value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Parametros[] newValueStack = new Parametros[size * 2];
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

    public final Parametros valueAt (int i) {
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
    Parametros yyval;
    

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
	  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 58 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecV(false); };
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 61 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecV(true); };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 64 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (1-(1)))).nParam; };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 65 of "entradaBison"  */
    { yyval.nParam = 0; };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 68 of "entradaBison"  */
    { yyval.nParam = 1; };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 69 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (3-(3)))).nParam + 1; };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 72 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.ENTERO && ((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.VECTOR ) 
		Procesador.errores.addError("Tipo incompatible",false);
	if(((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.VECTOR || ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.FUNCION)
		Procesador.errores.addError("Error en la asignacion: tipo incompatible",false); 
	((Parametros)(yystack.valueAt (3-(1)))).tipo = ((Parametros)(yystack.valueAt (3-(3)))).tipo;
	Procesador.tablaSimbolos.setTipoVariable(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(1)))).tipo);
	yyval.tipo = ((Parametros)(yystack.valueAt (3-(1)))).tipo; };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 80 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 83 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador logico",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 87 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 90 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador relacional",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 94 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 97 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO))
		Procesador.errores.addError("Tipos de datos no validos para operador aritmetico",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 101 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 104 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tipos de datos no validos para operador de incremento",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 108 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 111 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (3-(2)))).tipo; };
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 112 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 115 of "entradaBison"  */
    { 
	if(!Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (4-(1)))).nombre, ((Parametros)(yystack.valueAt (4-(3)))).nParam)) 
		Procesador.errores.addError("Funcion no definida",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 119 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo == TipoParam.NULO) 
		Procesador.errores.addError("Variable no definida",false);
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo != TipoParam.VECTOR) 
		Procesador.errores.addError("La variable no es de tipo vector.", false);
	if(((Parametros)(yystack.valueAt (4-(3)))).tipo != TipoParam.ENTERO) Procesador.errores.addError("Indice no es de tipo entero.",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 126 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.ENTERO) 
		yyval.tipo = TipoParam.ENTERO;
	else if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.VECTOR) 
		yyval.tipo = TipoParam.VECTOR;
	else if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.NULO)
		Procesador.errores.addError("Tipo no definido",false);
	else 
		Procesador.errores.addError("Tipo no valido",false); };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 135 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de prompt debe ser una cadena.",false); 
			yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 138 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de Document.write debe ser una cadena.",false); 
			  yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 141 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 142 of "entradaBison"  */
    { yyval.tipo = TipoParam.CADENA; };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 145 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 146 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (5-(4)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tamaño de vector debe ser entero",false); 
	yyval.tipo = TipoParam.VECTOR; };
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 152 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (6-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false); };
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 157 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (9-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Variable del Switch debe ser entera",false); };
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 163 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (7-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false); };
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 172 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecF(1); };
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 175 of "entradaBison"  */
    { 
	Procesador.lexico.setEstadoDecF(0); 
	Procesador.tablaSimbolos.borrarTabla();};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 181 of "entradaBison"  */
    { 
	if(Procesador.lexico.getEstadoDecF() != 0) 
		Procesador.errores.addError("No se admite la declaración anidada de funciones.",false); 
	else if(Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(3)))).nParam))
		Procesador.errores.addError("Funcion ya definida",false); 
	
	Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,false,EntradaTS.TipoEntradaTS.FUNCION);
	Procesador.tablaSimbolos.crearTabla(); };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 189 of "entradaBison"  */
    {
	Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,false,EntradaTS.TipoEntradaTS.FUNCION);
	Procesador.tablaSimbolos.crearTabla();
	Procesador.lexico.setEstadoDecF(2); };
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 195 of "entradaBison"  */
    { yyval.nParam=1; };
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 196 of "entradaBison"  */
    { yyval.nParam=((Parametros)(yystack.valueAt (3-(3)))).nParam+1; };
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 199 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Funcion debe devolver un entero",false); };
  break;
    



/* Line 351 of lalr1.java  */
/* Line 741 of "AnalizadorAsc.java"  */
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
			         Parametros yyvaluep				 )
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
    Parametros yylval = null;

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
  private static final byte yypact_ninf_ = -43;
  private static final byte yypact_[] =
  {
         4,   -16,    -4,   -20,    -1,   -43,    15,    71,    41,   -43,
     -43,    19,    43,   -43,     4,    58,   -43,    14,   -43,    29,
      30,    36,   -43,   -43,   -43,   -43,   -43,   -43,    41,    41,
      42,   -43,    55,    41,    41,     9,   -43,    44,    27,    41,
      68,   -43,   -43,   -43,   -43,   -43,   -43,   -43,   -43,    68,
      68,    68,    45,    49,   -18,    50,   -43,    52,    53,   -43,
      56,    30,   -43,    59,    54,   -43,    -3,    30,    36,   -43,
      55,    55,   -43,   -19,   -43,     4,   -43,   -43,    51,   -43,
     -43,    68,     4,    61,   -43,    57,    74,    41,   -43,   -43,
      55,   -43,    41,    55,    66,    60,    55,   -43,    70,   -43,
      41,    77,   -43,    76,   -43,     4,    58,    97,   -43,   -43
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     0,    18,     0,     0,     0,    40,
      41,    37,     0,     2,     4,     0,    12,     0,    16,    24,
      26,    28,    30,    32,    34,    14,    15,    13,     0,     0,
       0,    49,    10,     0,     0,    37,    31,     0,     0,     0,
      20,     1,     3,     8,    11,     5,     7,     6,    17,     0,
       0,     0,     0,     0,     0,     0,     9,     0,     0,    33,
       0,    42,    23,     0,     0,    19,    21,    25,    27,    29,
      10,    10,    52,     0,    51,     0,    39,    38,     0,    36,
      35,     0,     0,     0,    53,     0,    57,     0,    22,    44,
      10,    54,    56,    10,     0,     0,    10,    55,     0,    43,
       0,     0,    50,     0,    45,     0,     0,    48,    47,    46
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] =
  {
       -43,   -43,   -12,   -43,     0,   -43,   -42,   -11,    25,   -43,
     -43,   -43,    28,    -8,   -43,   -37,    62,    63,   101,   -43,
     -43,   -43,   -43,   -43,   -43,   -43,   -43,   -43,    26,   -43
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte
  yydefgoto_[] =
  {
        -1,    12,    13,    14,    45,    46,    55,    56,    15,    16,
      17,    64,    65,    18,    19,    20,    21,    22,    23,    24,
      62,    25,    26,    96,   109,    27,    31,    32,    74,    93
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final byte yytable_ninf_ = -1;
  private static final byte
  yytable_[] =
  {
        37,    61,    42,    66,    47,    84,    72,    28,    85,     1,
       2,    30,    67,    73,    50,     3,     4,     5,     6,    29,
      52,    53,    33,     7,    81,    57,    58,     8,    82,    83,
      39,    63,    40,     9,    10,    11,    60,    38,    34,     4,
      39,     6,    40,    41,    66,    48,     7,    50,    95,    49,
       8,    98,    51,     4,   101,     6,     9,    10,    35,    44,
       7,    43,    44,    86,     8,    54,    78,   100,    59,    70,
       9,    10,    11,    71,    87,    75,    76,    77,    80,    94,
       4,    79,     6,     4,    97,     6,    90,     7,    73,    92,
      99,     8,   103,   106,     8,    47,   102,     9,    10,    35,
       9,    10,    35,   104,   105,   108,   107,    89,    36,    88,
       0,    91,    68,     0,    69
  };

  /* YYCHECK.  */
  private static final byte
  yycheck_[] =
  {
         8,    38,    14,    40,    15,    24,    24,    23,    27,     5,
       6,    31,    49,    31,    17,    11,    12,    13,    14,    23,
      28,    29,    23,    19,    27,    33,    34,    23,    70,    71,
      21,    39,    23,    29,    30,    31,     9,    18,    23,    12,
      21,    14,    23,     0,    81,    31,    19,    17,    90,    20,
      23,    93,    16,    12,    96,    14,    29,    30,    31,     4,
      19,     3,     4,    75,    23,    23,    10,     7,    24,    24,
      29,    30,    31,    24,    23,    25,    24,    24,    24,    87,
      12,    22,    14,    12,    92,    14,    25,    19,    31,    15,
      24,    23,   100,   105,    23,   106,    26,    29,    30,    31,
      29,    30,    31,    26,    28,     8,   106,    82,     7,    81,
      -1,    85,    50,    -1,    51
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     5,     6,    11,    12,    13,    14,    19,    23,    29,
      30,    31,    33,    34,    35,    40,    41,    42,    45,    46,
      47,    48,    49,    50,    51,    53,    54,    57,    23,    23,
      31,    58,    59,    23,    23,    31,    50,    45,    18,    21,
      23,     0,    34,     3,     4,    36,    37,    39,    31,    20,
      17,    16,    45,    45,    23,    38,    39,    45,    45,    24,
       9,    47,    52,    45,    43,    44,    47,    47,    48,    49,
      24,    24,    24,    31,    60,    25,    24,    24,    10,    22,
      24,    27,    38,    38,    24,    27,    34,    23,    44,    40,
      25,    60,    15,    61,    45,    38,    55,    45,    38,    24,
       7,    38,    26,    45,    26,    28,    34,    36,     8,    56
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
         0,    32,    33,    34,    34,    35,    36,    36,    37,    38,
      38,    39,    40,    40,    40,    40,    40,    41,    42,    43,
      43,    44,    44,    45,    45,    46,    46,    47,    47,    48,
      48,    49,    49,    50,    50,    51,    51,    51,    51,    51,
      51,    51,    52,    52,    53,    54,    55,    56,    56,    57,
      58,    59,    59,    60,    60,    61,    61,    61
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     2,     1,     1,     1,     1,
       0,     1,     1,     1,     1,     1,     1,     2,     1,     1,
       0,     1,     3,     3,     1,     3,     1,     3,     1,     3,
       1,     2,     1,     3,     1,     4,     4,     1,     4,     4,
       1,     1,     1,     5,     6,     9,     7,     1,     0,     2,
       7,     3,     3,     2,     3,     2,     1,     0
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
  "IDENTIFICADOR", "$accept", "X", "A", "S1", "D", "Q2", "L", "Q", "S",
  "V", "T", "P", "Z", "P6", "P7", "P5", "P4", "P3", "P2", "P1", "N", "I",
  "W", "C", "B", "F", "F2", "H", "J", "R", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        33,     0,    -1,    34,    -1,    35,    34,    -1,    35,    -1,
      40,    36,    -1,    39,    -1,    37,    -1,     3,    -1,    39,
      -1,    -1,     4,    -1,    41,    -1,    57,    -1,    53,    -1,
      54,    -1,    45,    -1,    42,    31,    -1,    13,    -1,    44,
      -1,    -1,    47,    -1,    47,    27,    44,    -1,    31,    18,
      52,    -1,    46,    -1,    46,    20,    47,    -1,    47,    -1,
      47,    17,    48,    -1,    48,    -1,    48,    16,    49,    -1,
      49,    -1,    19,    50,    -1,    50,    -1,    23,    45,    24,
      -1,    51,    -1,    31,    23,    43,    24,    -1,    31,    21,
      45,    22,    -1,    31,    -1,    14,    23,    45,    24,    -1,
      12,    23,    45,    24,    -1,    29,    -1,    30,    -1,    47,
      -1,     9,    10,    23,    45,    24,    -1,     5,    23,    45,
      24,    38,    40,    -1,     6,    23,    45,    24,    38,    25,
      55,    38,    26,    -1,    38,     7,    45,    28,    34,    36,
      56,    -1,     8,    -1,    -1,    11,    58,    -1,    59,    38,
      25,    34,    61,    38,    26,    -1,    31,    23,    60,    -1,
      31,    23,    24,    -1,    31,    24,    -1,    31,    27,    60,
      -1,    15,    45,    -1,    15,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    13,    15,    17,    19,
      21,    22,    24,    26,    28,    30,    32,    34,    37,    39,
      41,    42,    44,    48,    52,    54,    58,    60,    64,    66,
      70,    72,    75,    77,    81,    83,    88,    93,    95,   100,
     105,   107,   109,   111,   117,   124,   134,   142,   144,   145,
     148,   156,   160,   164,   167,   171,   174,   176
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    28,    28,    31,    32,    35,    38,    39,    42,    44,
      45,    48,    51,    52,    53,    54,    55,    58,    61,    64,
      65,    68,    69,    72,    80,    83,    87,    90,    94,    97,
     101,   104,   108,   111,   112,   115,   119,   126,   135,   138,
     141,   142,   145,   146,   152,   157,   163,   168,   169,   172,
     175,   181,   189,   195,   196,   199,   202,   203
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

  private static final int yylast_ = 114;
  private static final int yynnts_ = 30;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 41;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 32;

  private static final int yyuser_token_number_max_ = 286;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


/* Line 931 of lalr1.java  */
/* Line 207 of "entradaBison"  */






