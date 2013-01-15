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
	  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 49 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecV(false); };
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 52 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecV(true); };
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 55 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (1-(1)))).nParam; };
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 56 of "entradaBison"  */
    { yyval.nParam = 0; };
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 59 of "entradaBison"  */
    { yyval.nParam = 1; };
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 60 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (3-(3)))).nParam + 1; };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 63 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.ENTERO && ((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.VECTOR ) 
		Procesador.errores.addError("Tipo incompatible",false);
	if(((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.VECTOR || ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.FUNCION)
		Procesador.errores.addError("Error en la asignacion: tipo incompatible",false); 
	((Parametros)(yystack.valueAt (3-(1)))).tipo = ((Parametros)(yystack.valueAt (3-(3)))).tipo;
	Procesador.tablaSimbolos.setTipoVariable(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(1)))).tipo);
	yyval.tipo = ((Parametros)(yystack.valueAt (3-(1)))).tipo; };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 71 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 74 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador logico",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 78 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 81 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador relacional",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 85 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 88 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO))
		Procesador.errores.addError("Tipos de datos no validos para operador aritmetico",false);
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 92 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 95 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tipos de datos no validos para operador de incremento",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 99 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 102 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (3-(2)))).tipo; };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 103 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 106 of "entradaBison"  */
    { 
	if(!Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (4-(1)))).nombre, ((Parametros)(yystack.valueAt (4-(3)))).nParam)) 
		Procesador.errores.addError("Funcion no definida",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 110 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo == TipoParam.NULO) 
		Procesador.errores.addError("Variable no definida",false);
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo != TipoParam.VECTOR) 
		Procesador.errores.addError("La variable no es de tipo vector.", false);
	if(((Parametros)(yystack.valueAt (4-(3)))).tipo != TipoParam.ENTERO) Procesador.errores.addError("Indice no es de tipo entero.",false); 
	yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 117 of "entradaBison"  */
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
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 126 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de prompt debe ser una cadena.",false); 
			yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 129 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de Document.write debe ser una cadena.",false); 
			  yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 132 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; };
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 133 of "entradaBison"  */
    { yyval.tipo = TipoParam.CADENA; };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 136 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 137 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (5-(4)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tamaño de vector debe ser entero",false); 
	yyval.tipo = TipoParam.VECTOR; };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 143 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (6-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false); };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 148 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (9-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Variable del Switch debe ser entera",false); };
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 157 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (7-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false); };
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 166 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecF(1); };
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 169 of "entradaBison"  */
    { 
	Procesador.lexico.setEstadoDecF(0); 
	Procesador.tablaSimbolos.borrarTabla();};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 174 of "entradaBison"  */
    { 
	if(Procesador.lexico.getEstadoDecF() != 0) 
		Procesador.errores.addError("No se admite la declaración anidada de funciones.",false); 
	else if(Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(3)))).nParam))
		Procesador.errores.addError("Funcion ya definida",false); 
	
	Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,false,EntradaTS.TipoEntradaTS.FUNCION);
	Procesador.tablaSimbolos.crearTabla(); };
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 182 of "entradaBison"  */
    {
	Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,false,EntradaTS.TipoEntradaTS.FUNCION);
	Procesador.tablaSimbolos.crearTabla();
	Procesador.lexico.setEstadoDecF(2); };
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 188 of "entradaBison"  */
    { yyval.nParam=1; };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 189 of "entradaBison"  */
    { yyval.nParam=((Parametros)(yystack.valueAt (3-(3)))).nParam+1; };
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 192 of "entradaBison"  */
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
  private static final byte yypact_ninf_ = -44;
  private static final byte yypact_[] =
  {
         8,    13,   -44,    -5,     2,     5,     3,   -44,    22,    30,
      87,   -44,   -44,    58,    50,   -44,   -44,   -44,     4,   -44,
      25,   -44,    43,    51,    56,   -44,   -44,   -44,   -44,   -44,
     -44,   -44,    87,    87,    44,   -44,    13,    87,    87,    34,
     -44,    49,    84,    87,   107,   -44,     8,   -44,   107,   107,
     107,    60,    61,   -15,   -44,    55,    62,    63,   -44,    65,
      51,   -44,    66,    70,   -44,   -12,   -44,    51,    56,   -44,
      13,    13,   -44,     6,   -44,     8,   -44,   -44,    59,   -44,
     -44,   107,    35,    72,   -44,    69,    89,    87,   -44,   -44,
      13,   -44,    87,    13,    78,    98,    13,   -44,    82,   -44,
      87,    83,   -44,    92,   -44,     8,     4,   103,   -44,   -44
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     7,     0,     0,     0,     0,    14,     0,     0,
       0,    36,    37,    33,     0,     2,     4,     5,     0,     8,
       0,    12,    20,    22,    24,    26,    28,    30,    10,    11,
       9,     6,     0,     0,     0,    47,    43,     0,     0,    33,
      27,     0,     0,     0,    16,     1,     0,    13,     0,     0,
       0,     0,     0,     0,    42,     0,     0,     0,    29,     0,
      38,    19,     0,     0,    15,    17,     3,    21,    23,    25,
      43,    43,    50,     0,    49,     0,    35,    34,     0,    32,
      31,     0,     0,     0,    51,     0,    55,     0,    18,    40,
      43,    52,    54,    43,     0,     0,    43,    53,     0,    39,
       0,     0,    48,     0,    41,     0,     0,    46,    45,    44
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] =
  {
       -44,   -44,   -43,   -16,    -1,    40,   -44,   -44,   -44,    31,
      -9,   -44,   -38,    74,    75,   115,   -44,   -44,   -44,   -44,
     -19,   -44,   -44,   -44,   -44,   -44,    42,   -44
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte
  yydefgoto_[] =
  {
        -1,    14,    15,    16,    17,    18,    19,    20,    63,    64,
      21,    22,    23,    24,    25,    26,    27,    61,    28,    29,
      55,    96,   109,    30,    35,    36,    74,    93
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final byte yytable_ninf_ = -1;
  private static final byte
  yytable_[] =
  {
        31,    41,    46,    66,    60,    49,    65,     1,     2,    72,
      67,     1,     2,     3,     4,    81,    73,     2,    32,     5,
       6,     7,     8,    51,    52,    33,    37,     9,    56,    57,
      84,    10,    86,    85,    62,    54,    34,    11,    12,    13,
       3,     4,     6,    65,     8,    38,     5,     6,     7,     8,
      45,    82,    83,    10,     9,    43,    47,    44,    10,    11,
      12,    39,   106,    48,    11,    12,    13,    53,    49,    54,
      54,    95,    50,    58,    98,    78,    42,   101,    94,    43,
      75,    44,    87,    97,    70,    71,    76,    77,    79,    54,
     107,   103,    54,    59,    80,    54,     6,    90,     8,     6,
      73,     8,    99,     9,    92,   100,     9,    10,   102,   104,
      10,   108,    88,    11,    12,    39,    11,    12,    13,     6,
     105,     8,    89,    68,    40,    69,     9,    91,     0,     0,
      10,     0,     0,     0,     0,     0,    11,    12,    39
  };

  /* YYCHECK.  */
  private static final byte
  yycheck_[] =
  {
         1,    10,    18,    46,    42,    17,    44,     3,     4,    24,
      48,     3,     4,     5,     6,    27,    31,     4,    23,    11,
      12,    13,    14,    32,    33,    23,    23,    19,    37,    38,
      24,    23,    75,    27,    43,    36,    31,    29,    30,    31,
       5,     6,    12,    81,    14,    23,    11,    12,    13,    14,
       0,    70,    71,    23,    19,    21,    31,    23,    23,    29,
      30,    31,   105,    20,    29,    30,    31,    23,    17,    70,
      71,    90,    16,    24,    93,    10,    18,    96,    87,    21,
      25,    23,    23,    92,    24,    24,    24,    24,    22,    90,
     106,   100,    93,     9,    24,    96,    12,    25,    14,    12,
      31,    14,    24,    19,    15,     7,    19,    23,    26,    26,
      23,     8,    81,    29,    30,    31,    29,    30,    31,    12,
      28,    14,    82,    49,     9,    50,    19,    85,    -1,    -1,
      23,    -1,    -1,    -1,    -1,    -1,    29,    30,    31
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     3,     4,     5,     6,    11,    12,    13,    14,    19,
      23,    29,    30,    31,    33,    34,    35,    36,    37,    38,
      39,    42,    43,    44,    45,    46,    47,    48,    50,    51,
      55,    36,    23,    23,    31,    56,    57,    23,    23,    31,
      47,    42,    18,    21,    23,     0,    35,    31,    20,    17,
      16,    42,    42,    23,    36,    52,    42,    42,    24,     9,
      44,    49,    42,    40,    41,    44,    34,    44,    45,    46,
      24,    24,    24,    31,    58,    25,    24,    24,    10,    22,
      24,    27,    52,    52,    24,    27,    34,    23,    41,    37,
      25,    58,    15,    59,    42,    52,    53,    42,    52,    24,
       7,    52,    26,    42,    26,    28,    34,    35,     8,    54
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
         0,    32,    33,    34,    34,    35,    35,    36,    37,    37,
      37,    37,    37,    38,    39,    40,    40,    41,    41,    42,
      42,    43,    43,    44,    44,    45,    45,    46,    46,    47,
      47,    48,    48,    48,    48,    48,    48,    48,    49,    49,
      50,    51,    52,    52,    53,    54,    54,    55,    56,    57,
      57,    58,    58,    59,    59,    59
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     3,     1,     1,     2,     1,     1,     1,
       1,     1,     1,     2,     1,     1,     0,     1,     3,     3,
       1,     3,     1,     3,     1,     3,     1,     2,     1,     3,
       1,     4,     4,     1,     4,     4,     1,     1,     1,     5,
       6,     9,     1,     0,     7,     1,     0,     2,     7,     3,
       3,     2,     3,     2,     1,     0
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
  "IDENTIFICADOR", "$accept", "X", "A", "D", "Q", "S", "V", "T", "P", "Z",
  "P6", "P7", "P5", "P4", "P3", "P2", "P1", "N", "I", "W", "L", "C", "B",
  "F", "F2", "H", "J", "R", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        33,     0,    -1,    34,    -1,    37,    35,    34,    -1,    35,
      -1,    36,    -1,     3,    36,    -1,     4,    -1,    38,    -1,
      55,    -1,    50,    -1,    51,    -1,    42,    -1,    39,    31,
      -1,    13,    -1,    41,    -1,    -1,    44,    -1,    44,    27,
      41,    -1,    31,    18,    49,    -1,    43,    -1,    43,    20,
      44,    -1,    44,    -1,    44,    17,    45,    -1,    45,    -1,
      45,    16,    46,    -1,    46,    -1,    19,    47,    -1,    47,
      -1,    23,    42,    24,    -1,    48,    -1,    31,    23,    40,
      24,    -1,    31,    21,    42,    22,    -1,    31,    -1,    14,
      23,    42,    24,    -1,    12,    23,    42,    24,    -1,    29,
      -1,    30,    -1,    44,    -1,     9,    10,    23,    42,    24,
      -1,     5,    23,    42,    24,    52,    37,    -1,     6,    23,
      42,    24,    52,    25,    53,    52,    26,    -1,    36,    -1,
      -1,    52,     7,    42,    28,    34,    35,    54,    -1,     8,
      -1,    -1,    11,    56,    -1,    57,    52,    25,    34,    59,
      52,    26,    -1,    31,    23,    58,    -1,    31,    23,    24,
      -1,    31,    24,    -1,    31,    27,    58,    -1,    15,    42,
      -1,    15,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     9,    11,    13,    16,    18,    20,
      22,    24,    26,    28,    31,    33,    35,    36,    38,    42,
      46,    48,    52,    54,    58,    60,    64,    66,    69,    71,
      75,    77,    82,    87,    89,    94,    99,   101,   103,   105,
     111,   118,   128,   130,   131,   139,   141,   142,   145,   153,
     157,   161,   164,   168,   171,   173
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    28,    28,    31,    32,    35,    36,    39,    42,    43,
      44,    45,    46,    49,    52,    55,    56,    59,    60,    63,
      71,    74,    78,    81,    85,    88,    92,    95,    99,   102,
     103,   106,   110,   117,   126,   129,   132,   133,   136,   137,
     143,   148,   153,   154,   157,   162,   163,   166,   169,   174,
     182,   188,   189,   192,   195,   196
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

  private static final int yylast_ = 138;
  private static final int yynnts_ = 28;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 45;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 32;

  private static final int yyuser_token_number_max_ = 286;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


/* Line 931 of lalr1.java  */
/* Line 200 of "entradaBison"  */






