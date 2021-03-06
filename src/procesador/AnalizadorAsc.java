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
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 28 of "entradaBison"  */
    {Procesador.tablaSimbolos.borrarTabla();
	   Procesador.lexico.addParse(2);
	   Procesador.lexico.addParse(1);};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 33 of "entradaBison"  */
    {Procesador.lexico.addParse(3);};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 34 of "entradaBison"  */
    {Procesador.lexico.addParse(4);};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 37 of "entradaBison"  */
    {Procesador.lexico.addParse(5);};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 40 of "entradaBison"  */
    {Procesador.lexico.addParse(6);};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 41 of "entradaBison"  */
    {Procesador.lexico.addParse(7);};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 45 of "entradaBison"  */
    {Procesador.lexico.addParse(8);};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 47 of "entradaBison"  */
    {Procesador.lexico.addParse(9);};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 48 of "entradaBison"  */
    {Procesador.lexico.addParse(10);};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 51 of "entradaBison"  */
    {Procesador.lexico.addParse(11);};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 54 of "entradaBison"  */
    {Procesador.lexico.addParse(12);};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 55 of "entradaBison"  */
    {Procesador.lexico.addParse(13);};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 56 of "entradaBison"  */
    {Procesador.lexico.addParse(14);};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 57 of "entradaBison"  */
    {Procesador.lexico.addParse(15);};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 58 of "entradaBison"  */
    {Procesador.lexico.addParse(16);};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 61 of "entradaBison"  */
    { 
	Procesador.lexico.setEstadoDecV(false);
	Procesador.lexico.addParse(17);};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 66 of "entradaBison"  */
    { Procesador.lexico.setEstadoDecV(true);
			Procesador.lexico.addParse(18); };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 70 of "entradaBison"  */
    { yyval.nParam = ((Parametros)(yystack.valueAt (1-(1)))).nParam;Procesador.lexico.addParse(19);  };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 71 of "entradaBison"  */
    { yyval.nParam = 0; Procesador.lexico.addParse(20); };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 74 of "entradaBison"  */
    { 
	yyval.nParam = 1;
	if(((Parametros)(yystack.valueAt (1-(1)))).tipo != TipoParam.ENTERO)
		Procesador.errores.addError("Parametros de las funciones deben ser enteros.",false);
		Procesador.lexico.addParse(21); };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 79 of "entradaBison"  */
    { 
	yyval.nParam = ((Parametros)(yystack.valueAt (3-(3)))).nParam + 1;
	if(((Parametros)(yystack.valueAt (3-(1)))).tipo != TipoParam.ENTERO)
		Procesador.errores.addError("Parametros de las funciones deben ser enteros.",false);
		Procesador.lexico.addParse(22); };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 86 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.ENTERO && ((Parametros)(yystack.valueAt (3-(3)))).tipo != TipoParam.VECTOR ) 
		Procesador.errores.addError("Tipo incompatible",false);
	if(((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.VECTOR || ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.FUNCION)
		Procesador.errores.addError("Error en la asignacion: tipo incompatible",false);
	((Parametros)(yystack.valueAt (3-(1)))).tipo = ((Parametros)(yystack.valueAt (3-(3)))).tipo;
	EntradaTS ent;
	if((ent = Procesador.tablaSimbolos.setTipoVariable(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(1)))).tipo)) != null)
		((Parametros)(yystack.valueAt (3-(1)))).entrada = ent;
	yyval.tipo = ((Parametros)(yystack.valueAt (3-(1)))).tipo;
	Procesador.lexico.addParse(23); };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 98 of "entradaBison"  */
    { 
	
	if(((Parametros)(yystack.valueAt (6-(6)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tipo incompatible",false);
	if(((Parametros)(yystack.valueAt (6-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("El indice debe ser de tipo entero",false);	
	if(((Parametros)(yystack.valueAt (6-(1)))).tipo != TipoParam.VECTOR)
		Procesador.errores.addError("Error en la asignacion: accediendo a indice de un elemento no vector",false); 
	yyval.tipo = TipoParam.ENTERO;
	Procesador.lexico.addParse(24); };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 108 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(25); };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 111 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador logico",false);
	yyval.tipo = TipoParam.ENTERO;
	Procesador.lexico.addParse(26); };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 116 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(27); };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 119 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO)) 
		Procesador.errores.addError("Tipos de datos no validos para operador relacional",false);
	yyval.tipo = TipoParam.ENTERO; Procesador.lexico.addParse(28); };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 123 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(29); };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 126 of "entradaBison"  */
    { 
	if(!(((Parametros)(yystack.valueAt (3-(1)))).tipo == ((Parametros)(yystack.valueAt (3-(3)))).tipo && ((Parametros)(yystack.valueAt (3-(1)))).tipo == TipoParam.ENTERO))
		Procesador.errores.addError("Tipos de datos no validos para operador aritmetico",false);
	yyval.tipo = TipoParam.ENTERO;
	Procesador.lexico.addParse(30); };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 131 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(31); };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 134 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tipos de datos no validos para operador de incremento",false); 
	yyval.tipo = TipoParam.ENTERO;
	Procesador.lexico.addParse(32); };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 139 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(33); };
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 142 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (3-(2)))).tipo; Procesador.lexico.addParse(34);};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 143 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(35); };
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 146 of "entradaBison"  */
    { 
	if(!Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (4-(1)))).nombre, ((Parametros)(yystack.valueAt (4-(3)))).nParam)) 
		Procesador.errores.addError("Funcion no definida",false); 
	yyval.tipo = TipoParam.ENTERO; 
	Procesador.lexico.addParse(36); };
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 151 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo == TipoParam.NULO) 
		Procesador.errores.addError("Variable no definida",false);
	if(((Parametros)(yystack.valueAt (4-(1)))).tipo != TipoParam.VECTOR) 
		Procesador.errores.addError("La variable no es de tipo vector.", false);
	if(((Parametros)(yystack.valueAt (4-(3)))).tipo != TipoParam.ENTERO) Procesador.errores.addError("Indice no es de tipo entero.",false); 
	yyval.tipo = TipoParam.ENTERO;
	Procesador.lexico.addParse(37); };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 159 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.ENTERO) 
		yyval.tipo = TipoParam.ENTERO;
	else if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.VECTOR) 
		yyval.tipo = TipoParam.VECTOR;
	else if(((Parametros)(yystack.valueAt (1-(1)))).tipo == TipoParam.NULO)
		Procesador.errores.addError("Tipo no definido",false);
	else 
		Procesador.errores.addError("Tipo no valido",false);
		Procesador.lexico.addParse(38); };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 169 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de prompt debe ser una cadena.",false); 
			yyval.tipo = TipoParam.ENTERO;
			Procesador.lexico.addParse(39); };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 173 of "entradaBison"  */
    { if (((Parametros)(yystack.valueAt (4-(3)))).tipo!=TipoParam.CADENA) 
				Procesador.errores.addError("El parametro de Document.write debe ser una cadena.",false); 
			  yyval.tipo = TipoParam.ENTERO;
			  Procesador.lexico.addParse(40); };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 177 of "entradaBison"  */
    { yyval.tipo = TipoParam.ENTERO; Procesador.lexico.addParse(41); };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 178 of "entradaBison"  */
    { yyval.tipo = TipoParam.CADENA; Procesador.lexico.addParse(42); };
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 181 of "entradaBison"  */
    { yyval.tipo = ((Parametros)(yystack.valueAt (1-(1)))).tipo; Procesador.lexico.addParse(43); };
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 182 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (5-(4)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Tamaño de vector debe ser entero",false); 
	yyval.tipo = TipoParam.VECTOR;
	Procesador.lexico.addParse(44);	
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 190 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (6-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false);
		Procesador.lexico.addParse(45); };
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 196 of "entradaBison"  */
    {Procesador.lexico.addParse(46);};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 197 of "entradaBison"  */
    {Procesador.lexico.addParse(47);};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 200 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (9-(3)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Variable del Switch debe ser entera",false);
		Procesador.lexico.addParse(48); };
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 207 of "entradaBison"  */
    {Procesador.lexico.addParse(49);};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 210 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (1-(1)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Condición debe ser entera",false);
		Procesador.lexico.addParse(50); };
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 216 of "entradaBison"  */
    {Procesador.lexico.addParse(51); };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 217 of "entradaBison"  */
    {Procesador.lexico.addParse(52); };
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 220 of "entradaBison"  */
    {Procesador.lexico.addParse(53); };
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 221 of "entradaBison"  */
    {Procesador.lexico.addParse(54); };
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 224 of "entradaBison"  */
    { 
	Procesador.lexico.setEstadoDecF(0); 
	Procesador.tablaSimbolos.borrarTabla();
	Procesador.lexico.addParse(55); };
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 230 of "entradaBison"  */
    { 
	if(Procesador.lexico.getEstadoDecF() != 0) 
		Procesador.errores.addError("No se admite la declaración anidada de funciones.",false); 
	Procesador.lexico.setEstadoDecF(1);
	Procesador.lexico.addParse(56);  };
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 237 of "entradaBison"  */
    { 
	
	if(Procesador.tablaSimbolos.buscarFuncionTS(((Parametros)(yystack.valueAt (3-(1)))).nombre, ((Parametros)(yystack.valueAt (3-(3)))).nParam))
		Procesador.errores.addError("Funcion ya definida",false); 
	
	if(((Parametros)(yystack.valueAt (3-(1)))).entrada == null)
		((Parametros)(yystack.valueAt (3-(1)))).entrada = Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,true,EntradaTS.TipoEntradaTS.FUNCION);
	
	((Funcion)((Parametros)(yystack.valueAt (3-(1)))).entrada).addFuncion(((Parametros)(yystack.valueAt (3-(3)))).nParam);
	
	Procesador.tablaSimbolos.crearTabla(); 
	Procesador.lexico.setEstadoDecF(2);
	for (String s : ((Parametros)(yystack.valueAt (3-(3)))).listaP){
		Procesador.tablaSimbolos.añadir(s,false,EntradaTS.TipoEntradaTS.VARIABLE);
		Procesador.tablaSimbolos.setTipoVariable(s, TipoParam.ENTERO);
	}
	Procesador.lexico.addParse(57); 
	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 255 of "entradaBison"  */
    {
	Procesador.tablaSimbolos.añadir(((Parametros)(yystack.valueAt (3-(1)))).nombre,false,EntradaTS.TipoEntradaTS.FUNCION);
	Procesador.tablaSimbolos.crearTabla();
	Procesador.lexico.setEstadoDecF(2);
	Procesador.lexico.addParse(58);  };
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 262 of "entradaBison"  */
    {Procesador.lexico.addParse(59); };
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 263 of "entradaBison"  */
    {Procesador.lexico.addParse(60); };
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 264 of "entradaBison"  */
    {Procesador.lexico.addParse(61);};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 267 of "entradaBison"  */
    { 
	yyval.nParam=1; 
	yyval.listaP.add(((Parametros)(yystack.valueAt (2-(1)))).nombre); 
	Procesador.lexico.addParse(62);};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 271 of "entradaBison"  */
    {
	yyval.nParam=((Parametros)(yystack.valueAt (3-(3)))).nParam+1;
	((Parametros)(yystack.valueAt (3-(1)))).tipo = TipoParam.ENTERO; 
	((Parametros)(yystack.valueAt (3-(3)))).listaP.add(((Parametros)(yystack.valueAt (3-(1)))).nombre);
	yyval.listaP = ((Parametros)(yystack.valueAt (3-(3)))).listaP;
	Procesador.lexico.addParse(63); };
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 279 of "entradaBison"  */
    { 
	if(((Parametros)(yystack.valueAt (2-(2)))).tipo != TipoParam.ENTERO) 
		Procesador.errores.addError("Funcion debe devolver un entero",false);
	Procesador.lexico.addParse(64); };
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 283 of "entradaBison"  */
    {Procesador.lexico.addParse(65);};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 1047 of "AnalizadorAsc.java"  */
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
  private static final byte yypact_ninf_ = -82;
  private static final byte yypact_[] =
  {
        77,   -10,    17,   -82,    18,   -82,    20,    16,    -4,   -82,
     -82,    15,    51,   -82,    77,    62,   -82,    29,   -82,    42,
      52,    54,   -82,   -82,   -82,   -82,   -82,   -82,    40,    -4,
      -4,    -4,    -4,    11,   -82,    48,    90,    -4,   103,   -82,
     -82,   -82,   -82,   -82,   -82,   -82,   -82,   103,   103,   103,
      45,    72,    53,    57,    60,    63,    -4,   -82,    68,    52,
     -82,    64,    69,   -82,   -13,    52,    54,   -82,   -15,    67,
     -82,    72,    72,   -82,   -82,    73,    71,    79,   -82,   103,
     -82,    37,   -82,    72,    44,    76,   -82,    -4,    90,   -82,
     -82,    80,    44,    -4,   -82,   -82,   -82,    72,    74,   -82,
     -82,     3,    84,    72,   -82,   105,   -82,   -82,    72,   -82,
     -82,    -4,    88,   -82,   -82,    95,   -82,    77,    72,   108,
      72,   105,   -82,   -82,   -82
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,    56,     0,    18,     0,     0,     0,    41,
      42,    38,     0,     2,     4,     0,    12,     0,    16,    25,
      27,    29,    31,    33,    35,    14,    15,    13,     0,     0,
       0,     0,     0,    38,    32,     0,     0,     0,    20,     1,
       3,     8,    11,     5,     7,     6,    17,     0,     0,     0,
       0,    10,     0,     0,     0,     0,     0,    34,     0,    43,
      23,     0,     0,    19,    21,    26,    28,    30,     0,     0,
       9,    10,    10,    40,    39,     0,     0,    37,    36,     0,
      58,     0,    57,    10,     0,     0,    37,     0,     0,    22,
      62,     0,     0,    65,    46,    45,    47,    10,     0,    24,
      63,    10,     0,    10,    64,     0,    44,    60,    10,    55,
      61,     0,     0,    59,    50,     0,    48,     0,    10,    54,
      10,    52,    53,    51,    49
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] =
  {
       -82,   -82,   -12,   -82,   -82,   -82,   -66,   109,    34,   -82,
     -82,   -82,    46,    -8,   -82,   -35,    81,    78,   121,   -82,
      43,   -82,   -82,   -82,     9,   -82,   -82,   -82,   -82,   -82,
     -82,   -82,    47,   -81
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final byte
  yydefgoto_[] =
  {
        -1,    12,    13,    14,    43,    44,    69,    70,    15,    16,
      17,    62,    63,    18,    19,    20,    21,    22,    23,    24,
      60,    25,    95,    26,   112,   115,   124,   121,    27,    28,
      51,   102,    82,    96
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final byte yytable_ninf_ = -1;
  private static final byte
  yytable_[] =
  {
        35,    59,    40,    64,    48,    84,    85,    42,     4,    80,
       6,   103,    65,    29,    79,     7,    81,    92,    93,     8,
     108,    52,    53,    54,    55,     9,    10,    11,     4,    61,
       6,   105,    56,    36,    38,   107,    37,   110,    38,     8,
      30,    31,   113,    32,    64,     9,    10,    33,    75,     1,
       2,    39,   119,    59,   122,     3,     4,     5,     6,    93,
      46,    90,    47,     7,    91,    41,    42,     8,    68,    48,
      49,    50,    57,     9,    10,    11,    42,    71,    76,    98,
     101,    72,     1,     2,    73,   104,    77,    74,     3,     4,
       5,     6,    83,    78,    87,    86,     7,    88,   106,    58,
       8,    97,     4,   114,     6,   118,     9,    10,    11,     7,
     109,    81,   111,     8,   116,     4,   120,     6,    94,     9,
      10,    33,     7,   117,    45,    89,     8,    67,    34,    66,
     123,    99,     9,    10,    33,     0,     0,     0,   100
  };

  /* YYCHECK.  */
  private static final byte
  yycheck_[] =
  {
         8,    36,    14,    38,    17,    71,    72,     4,    12,    24,
      14,    92,    47,    23,    27,    19,    31,    83,    15,    23,
     101,    29,    30,    31,    32,    29,    30,    31,    12,    37,
      14,    97,    21,    18,    23,   101,    21,   103,    23,    23,
      23,    23,   108,    23,    79,    29,    30,    31,    56,     5,
       6,     0,   118,    88,   120,    11,    12,    13,    14,    15,
      31,    24,    20,    19,    27,     3,     4,    23,    23,    17,
      16,    31,    24,    29,    30,    31,     4,    24,    10,    87,
      92,    24,     5,     6,    24,    93,    22,    24,    11,    12,
      13,    14,    25,    24,    23,    22,    19,    18,    24,     9,
      23,    25,    12,   111,    14,   117,    29,    30,    31,    19,
      26,    31,     7,    23,    26,    12,     8,    14,    84,    29,
      30,    31,    19,    28,    15,    79,    23,    49,     7,    48,
     121,    88,    29,    30,    31,    -1,    -1,    -1,    91
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,     5,     6,    11,    12,    13,    14,    19,    23,    29,
      30,    31,    33,    34,    35,    40,    41,    42,    45,    46,
      47,    48,    49,    50,    51,    53,    55,    60,    61,    23,
      23,    23,    23,    31,    50,    45,    18,    21,    23,     0,
      34,     3,     4,    36,    37,    39,    31,    20,    17,    16,
      31,    62,    45,    45,    45,    45,    21,    24,     9,    47,
      52,    45,    43,    44,    47,    47,    48,    49,    23,    38,
      39,    24,    24,    24,    24,    45,    10,    22,    24,    27,
      24,    31,    64,    25,    38,    38,    22,    23,    18,    44,
      24,    27,    38,    15,    40,    54,    65,    25,    45,    52,
      64,    34,    63,    65,    45,    38,    24,    38,    65,    26,
      38,     7,    56,    38,    45,    57,    26,    28,    34,    38,
       8,    59,    38,    56,    58
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
      43,    44,    44,    45,    45,    45,    46,    46,    47,    47,
      48,    48,    49,    49,    50,    50,    51,    51,    51,    51,
      51,    51,    51,    52,    52,    53,    54,    54,    55,    56,
      57,    58,    58,    59,    59,    60,    61,    62,    62,    63,
      63,    63,    64,    64,    65,    65
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     2,     1,     1,     1,     1,
       0,     1,     1,     1,     1,     1,     1,     2,     1,     1,
       0,     1,     3,     3,     6,     1,     3,     1,     3,     1,
       3,     1,     2,     1,     3,     1,     4,     4,     1,     4,
       4,     1,     1,     1,     5,     6,     1,     1,     9,     7,
       1,     1,     0,     2,     0,     7,     1,     3,     3,     3,
       2,     2,     2,     3,     2,     1
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
  "I2", "W", "C", "C1", "C2", "B", "F", "F2", "H", "AS", "J", "R", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        33,     0,    -1,    34,    -1,    35,    34,    -1,    35,    -1,
      40,    36,    -1,    39,    -1,    37,    -1,     3,    -1,    39,
      -1,    -1,     4,    -1,    41,    -1,    60,    -1,    53,    -1,
      55,    -1,    45,    -1,    42,    31,    -1,    13,    -1,    44,
      -1,    -1,    47,    -1,    47,    27,    44,    -1,    31,    18,
      52,    -1,    31,    21,    45,    22,    18,    52,    -1,    46,
      -1,    46,    20,    47,    -1,    47,    -1,    47,    17,    48,
      -1,    48,    -1,    48,    16,    49,    -1,    49,    -1,    19,
      50,    -1,    50,    -1,    23,    45,    24,    -1,    51,    -1,
      31,    23,    43,    24,    -1,    31,    21,    45,    22,    -1,
      31,    -1,    14,    23,    45,    24,    -1,    12,    23,    45,
      24,    -1,    29,    -1,    30,    -1,    47,    -1,     9,    10,
      23,    45,    24,    -1,     5,    23,    45,    24,    38,    54,
      -1,    40,    -1,    65,    -1,     6,    23,    45,    24,    38,
      25,    38,    56,    26,    -1,     7,    57,    28,    34,    38,
      59,    58,    -1,    45,    -1,    56,    -1,    -1,     8,    38,
      -1,    -1,    61,    62,    38,    25,    38,    63,    26,    -1,
      11,    -1,    31,    23,    64,    -1,    31,    23,    24,    -1,
      34,    65,    38,    -1,    34,    38,    -1,    65,    38,    -1,
      31,    24,    -1,    31,    27,    64,    -1,    15,    45,    -1,
      15,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    13,    15,    17,    19,
      21,    22,    24,    26,    28,    30,    32,    34,    37,    39,
      41,    42,    44,    48,    52,    59,    61,    65,    67,    71,
      73,    77,    79,    82,    84,    88,    90,    95,   100,   102,
     107,   112,   114,   116,   118,   124,   131,   133,   135,   145,
     153,   155,   157,   158,   161,   162,   170,   172,   176,   180,
     184,   187,   190,   193,   197,   200
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    28,    28,    33,    34,    37,    40,    41,    45,    47,
      48,    51,    54,    55,    56,    57,    58,    61,    66,    70,
      71,    74,    79,    86,    98,   108,   111,   116,   119,   123,
     126,   131,   134,   139,   142,   143,   146,   151,   159,   169,
     173,   177,   178,   181,   182,   190,   196,   197,   200,   207,
     210,   216,   217,   220,   221,   224,   230,   237,   255,   262,
     263,   264,   267,   271,   279,   283
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
  private static final int yynnts_ = 34;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 39;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 32;

  private static final int yyuser_token_number_max_ = 286;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


/* Line 931 of lalr1.java  */
/* Line 287 of "entradaBison"  */






