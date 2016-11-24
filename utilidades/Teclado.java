package utilidades;
// =====================================================================
// DESCRIPCION: Paquete que contiene unicamente la clase Teclado en la 
//				que se recogen un conjunto de metodos para el manejo de
//				la entrada desde teclado. 
//
//					Estos metodos permiten la lectura de datos de todos 
//				los tipos basicos java (a excepcion de booleanos): char, 
//				byte, short, int, double y float. Tambien se incorporan 
//				metodos para la entrada de String. 
//
//					La entrada se hace por lineas => se lee una linea 
//				(String) y se busca en ella el tipo de dato requerido
//				llamando a al metodo parse correspondiente.
//					
//					Ninguno de los metodos lanza excepciones. Si se
//				producen, se capturan y se muestra un mensaje de error
//				pero en ningun caso se relanzan.
// =====================================================================				
// MODO DE USO: Colocar este paquete en C:\jdk1.3\jre\classes\Teclado\
//              y compilarlo en ese directorio.
//              Anadir en Packages - ClassPath el directorio 
//              	C:\jdk1.3\jre\classes\
//              Para utilizar el paquete, es necesario realizar el 
// 				siguiente import:
// 					import Teclado.*;
// =====================================================================


//package Teclado; 

import java.io.*;

public class Teclado {
	
	public static final byte 	BYTE_ERR 	=	Byte.MAX_VALUE;
	public static final short 	SHORT_ERR 	= 	Short.MAX_VALUE;
	public static final int 	INT_ERR 	=	Integer.MAX_VALUE;
	public static final double 	DOUBLE_ERR 	= 	Double.MAX_VALUE;
	public static final float  	FLOAT_ERR 	= 	Float.MAX_VALUE;
	public static final char  	CHAR_ERR 	= 	Character.MAX_VALUE;
	public static final String	STRING_ERR 	= 	null;
	
	
	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>byte</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>byte</b></code> introducido por el usuario o <code><b>Teclado.BYTE_ERR</b></code> si no se introdujo un byte.
	 */
	public static byte readByte () {
		byte val=BYTE_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = Byte.parseByte (in.readLine());
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnByte): Imposible leer linea");
		} catch (NumberFormatException nfe) {
			System.out.println (">> Excepcion (readLnByte): Valor introducido no byte");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnByte): Ocurrio una excepcion");
		}
		return val;
	}

	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>short</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>short</b></code> introducido por el usuario o <code><b>Teclado.SHORT_ERR</b></code> si no se introdujo un byte.
	 */
	public static short readShort () {
		short val=SHORT_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = Short.parseShort (in.readLine());
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnShort): Imposible leer linea");
		} catch (NumberFormatException nfe) {
			System.out.println (">> Excepcion (readLnShort): Valor introducido no short");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnShort): Ocurrio una excepcion");
		}
		return val;
	}

	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>int</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>int</b></code> introducido por el usuario o <code><b>Teclado.INT_ERR</b></code> si no se introdujo un byte.
	 */
	public static int readInt () {
		int val=INT_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = Integer.parseInt (in.readLine());
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnInt): Imposible leer linea");
		} catch (NumberFormatException nfe) {
			System.out.println (">> Excepcion (readLnInt): Valor introducido no entero");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnInt): Ocurrio una excepcion");
		}
		return val;
	}


	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>double</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>double</b></code> introducido por el usuario o <code><b>Teclado.DOUBLE_ERR</b></code> si no se introdujo un byte.
	 */
	public static double readDouble () {
		double val=DOUBLE_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = Double.parseDouble (in.readLine());
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnDouble): Imposible leer linea");
		} catch (NumberFormatException nfe) {
			System.out.println (">> Excepcion (readLnDouble): Valor introducido no double");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnDouble): Ocurrio una excepcion");
		}
		return val;
	}

	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>float</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>float</b></code> introducido por el usuario o <code><b>Teclado.FLOAT_ERR</b></code> si no se introdujo un byte.
	 */
	public static double readFloat () {
		float val=FLOAT_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = Float.parseFloat (in.readLine());
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnFloat): Imposible leer linea");
		} catch (NumberFormatException nfe) {
			System.out.println (">> Excepcion (readLnFloat): Valor introducido no float");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnFloat): Ocurrio una excepcion");
		}
		return val;
	}

	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>char</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>char</b></code> introducido por el usuario o <code><b>Teclado.CHAR_ERR</b></code> si no se introdujo un byte.
	 */
	
	public static char readChar () {
		char val = CHAR_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = (char) in.read(); 
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnChar): Imposible leer caracter");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnChar): Ocurrio una excepcion");
		}
		return val;
	}

	/** 
	 *  Metodo que lee una linea de teclado y devuelve el <code><b>String</b></code> escrito por el usuario. 
	 *  @return Devuelve el <code><b>String</b></code> introducido por el usuario o <code><b>Teclado.STRING_ERR</b></code> si no se introdujo un byte.
	 */
	public static String readString () {
		String val=STRING_ERR;
		try	{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			val = in.readLine();
		} catch (IOException ioe) {
			System.out.println (">> Excepcion (readLnString): Imposible leer linea");
		} catch (Exception e) {
			System.out.println (">> Excepcion (readLnString): Ocurrio una excepcion");
		}
		return val;
	}



}
