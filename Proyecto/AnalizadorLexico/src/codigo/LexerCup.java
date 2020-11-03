/* The following code was generated by JFlex 1.4.3 on 11/1/20 5:23 PM */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/1/20 5:23 PM from the specification file
 * <tt>./src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int multilinecomment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  6,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 32,  0,  0,  0, 36, 31,  4, 37, 38,  7, 30,  3, 22,  0,  5, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 28, 43, 35, 29, 34,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 41,  0, 42,  0,  1, 
     0, 16, 17, 14, 24, 11, 25, 12, 15,  8,  1,  1, 19, 26,  9, 18, 
    21,  1, 13, 23, 10, 27,  1, 20,  1,  1,  1, 39, 33, 40,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\11\2\1\10\3\2\1\1\1\11\1\12\1\13\1\14"+
    "\1\15\2\16\1\1\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\2\26\1\0\1\27\1\4\1\30\1\11"+
    "\7\2\1\31\1\2\1\32\2\2\1\33\2\2\1\34"+
    "\1\2\1\35\1\16\1\0\1\36\1\27\4\2\1\37"+
    "\11\2\1\0\1\2\1\40\1\41\6\2\1\42\1\43"+
    "\1\2\1\3\1\2\1\44\4\2\1\0\3\2\1\45"+
    "\1\2\1\0\1\2\4\0\1\46\1\47\1\50\1\2"+
    "\4\0\1\51\5\0\1\2\6\0\1\52\4\0\1\53"+
    "\1\0\1\54\4\0\1\55\1\0\1\56\2\0\1\57"+
    "\1\0\1\60\3\0\1\61\1\62\1\0\1\63\1\64"+
    "\1\65\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294"+
    "\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8\0\u03f4"+
    "\0\u0420\0\130\0\u03f4\0\130\0\u044c\0\u0478\0\u0160\0\u04a4"+
    "\0\130\0\130\0\130\0\130\0\130\0\130\0\130\0\u04d0"+
    "\0\u04fc\0\u04fc\0\u0528\0\130\0\130\0\u0554\0\u0580\0\u05ac"+
    "\0\u05d8\0\u0604\0\u0630\0\u065c\0\204\0\u0688\0\204\0\u06b4"+
    "\0\u06e0\0\130\0\u070c\0\u0738\0\204\0\u0764\0\130\0\130"+
    "\0\u0790\0\130\0\130\0\u07bc\0\u07e8\0\u0814\0\u0840\0\204"+
    "\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0"+
    "\0\u09cc\0\u09f8\0\u0a24\0\204\0\204\0\u0a50\0\u0a7c\0\u0aa8"+
    "\0\u0ad4\0\u0b00\0\u0b2c\0\204\0\204\0\u0b58\0\130\0\u0b84"+
    "\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4"+
    "\0\u0d10\0\204\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18"+
    "\0\u0e44\0\204\0\204\0\204\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4"+
    "\0\u0f20\0\204\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028"+
    "\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\130\0\u115c"+
    "\0\u1188\0\u11b4\0\u11e0\0\204\0\u120c\0\130\0\u1238\0\u1264"+
    "\0\u1290\0\u12bc\0\130\0\u12e8\0\130\0\u1314\0\u1340\0\130"+
    "\0\u136c\0\130\0\u1398\0\u13c4\0\u13f0\0\130\0\130\0\u141c"+
    "\0\130\0\130\0\130\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\6\1\11"+
    "\1\12\1\4\1\13\1\14\1\4\1\15\1\16\1\4"+
    "\1\17\1\20\1\21\1\4\1\22\1\4\1\23\1\24"+
    "\1\25\1\26\2\4\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\7\47\1\50\44\47\55\0\2\4"+
    "\5\0\16\4\1\0\5\4\22\0\1\5\54\0\1\6"+
    "\2\0\1\6\45\0\4\51\1\52\47\51\5\0\1\53"+
    "\1\0\1\54\25\0\1\55\53\0\1\55\17\0\2\4"+
    "\5\0\1\4\1\56\14\4\1\0\5\4\21\0\2\4"+
    "\5\0\5\4\1\57\1\4\1\60\6\4\1\0\5\4"+
    "\21\0\2\4\5\0\10\4\1\61\5\4\1\0\5\4"+
    "\21\0\2\4\5\0\3\4\1\62\12\4\1\0\5\4"+
    "\21\0\2\4\5\0\7\4\1\63\3\4\1\64\2\4"+
    "\1\0\5\4\21\0\2\4\5\0\16\4\1\0\1\65"+
    "\4\4\21\0\2\4\5\0\12\4\1\66\3\4\1\0"+
    "\5\4\21\0\2\4\5\0\5\4\1\67\7\4\1\70"+
    "\1\0\5\4\21\0\2\4\5\0\7\4\1\71\6\4"+
    "\1\0\5\4\46\0\1\72\6\0\1\55\17\0\2\4"+
    "\5\0\2\4\1\73\13\4\1\0\5\4\21\0\2\4"+
    "\5\0\3\4\1\74\6\4\1\75\3\4\1\0\5\4"+
    "\21\0\2\4\5\0\10\4\1\76\5\4\1\0\5\4"+
    "\55\0\1\77\53\0\1\100\53\0\1\55\1\72\52\0"+
    "\1\100\4\0\1\100\46\0\1\100\5\0\1\100\36\0"+
    "\1\101\32\0\1\102\52\0\1\103\47\0\6\53\1\0"+
    "\45\53\1\0\2\4\5\0\2\4\1\104\13\4\1\0"+
    "\5\4\21\0\2\4\5\0\16\4\1\0\4\4\1\105"+
    "\21\0\2\4\5\0\3\4\1\106\1\4\1\107\10\4"+
    "\1\0\5\4\21\0\2\4\5\0\2\4\1\110\13\4"+
    "\1\0\5\4\21\0\2\4\5\0\2\4\1\111\13\4"+
    "\1\0\5\4\21\0\2\4\5\0\10\4\1\112\5\4"+
    "\1\0\5\4\21\0\2\4\5\0\12\4\1\113\3\4"+
    "\1\0\5\4\21\0\2\4\5\0\12\4\1\114\3\4"+
    "\1\0\5\4\21\0\2\4\5\0\3\4\1\115\12\4"+
    "\1\0\5\4\21\0\2\4\5\0\3\4\1\116\12\4"+
    "\1\0\5\4\21\0\2\4\5\0\12\4\1\117\3\4"+
    "\1\0\5\4\21\0\2\4\5\0\16\4\1\0\2\4"+
    "\1\120\2\4\21\0\2\4\5\0\13\4\1\121\2\4"+
    "\1\0\5\4\22\0\1\122\52\0\2\4\5\0\3\4"+
    "\1\123\12\4\1\0\5\4\21\0\2\4\5\0\3\4"+
    "\1\124\12\4\1\0\5\4\21\0\2\4\5\0\1\4"+
    "\1\125\14\4\1\0\5\4\21\0\2\4\5\0\12\4"+
    "\1\126\3\4\1\0\5\4\21\0\2\4\5\0\16\4"+
    "\1\0\4\4\1\127\21\0\2\4\5\0\5\4\1\130"+
    "\10\4\1\0\5\4\21\0\2\4\5\0\16\4\1\0"+
    "\1\131\4\4\21\0\2\4\5\0\13\4\1\132\2\4"+
    "\1\0\5\4\21\0\2\4\5\0\1\4\1\133\14\4"+
    "\1\0\5\4\21\0\2\4\5\0\1\4\1\134\14\4"+
    "\1\0\5\4\21\0\2\4\5\0\15\4\1\135\1\0"+
    "\5\4\21\0\2\4\5\0\1\136\15\4\1\0\5\4"+
    "\21\0\2\4\5\0\16\4\1\0\1\105\4\4\22\0"+
    "\1\122\43\0\1\137\6\0\2\4\5\0\4\4\1\140"+
    "\11\4\1\0\5\4\21\0\2\4\5\0\14\4\1\141"+
    "\1\4\1\0\5\4\21\0\2\4\5\0\5\4\1\142"+
    "\10\4\1\0\5\4\21\0\2\4\5\0\10\4\1\143"+
    "\5\4\1\0\5\4\21\0\2\4\5\0\3\4\1\144"+
    "\12\4\1\0\5\4\21\0\2\4\5\0\3\4\1\145"+
    "\12\4\1\0\5\4\21\0\2\4\5\0\16\4\1\146"+
    "\5\4\21\0\2\4\5\0\1\4\1\147\14\4\1\0"+
    "\5\4\21\0\2\4\5\0\3\4\1\150\12\4\1\0"+
    "\5\4\21\0\2\4\5\0\13\4\1\151\2\4\1\0"+
    "\5\4\21\0\2\4\5\0\1\4\1\152\14\4\1\0"+
    "\5\4\21\0\2\4\5\0\6\4\1\153\7\4\1\0"+
    "\5\4\21\0\2\4\5\0\16\4\1\154\5\4\21\0"+
    "\2\4\5\0\10\4\1\155\5\4\1\0\5\4\32\0"+
    "\1\156\16\0\1\157\1\160\1\161\21\0\2\4\5\0"+
    "\3\4\1\162\12\4\1\0\5\4\21\0\2\4\5\0"+
    "\5\4\1\163\10\4\1\0\5\4\21\0\2\4\5\0"+
    "\1\4\1\164\14\4\1\0\5\4\21\0\2\4\5\0"+
    "\2\4\1\165\13\4\1\0\5\4\32\0\1\166\16\0"+
    "\1\167\1\170\1\171\21\0\2\4\5\0\1\4\1\172"+
    "\14\4\1\0\5\4\33\0\1\173\62\0\1\174\44\0"+
    "\1\175\4\0\1\176\44\0\1\177\43\0\2\4\5\0"+
    "\3\4\1\200\12\4\1\0\5\4\33\0\1\201\62\0"+
    "\1\202\44\0\1\203\4\0\1\204\44\0\1\205\71\0"+
    "\1\206\41\0\1\207\50\0\1\210\51\0\1\211\1\0"+
    "\1\212\53\0\1\213\42\0\2\4\5\0\5\4\1\214"+
    "\10\4\1\0\5\4\47\0\1\215\41\0\1\216\50\0"+
    "\1\217\51\0\1\220\1\0\1\221\53\0\1\222\53\0"+
    "\1\223\60\0\1\224\45\0\1\225\60\0\1\226\45\0"+
    "\1\227\55\0\1\230\60\0\1\231\45\0\1\232\60\0"+
    "\1\233\45\0\1\234\65\0\1\235\50\0\1\236\57\0"+
    "\1\237\52\0\1\240\50\0\1\241\57\0\1\242\60\0"+
    "\1\243\53\0\1\244\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5192];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\26\1\1\11\1\1\1\11\4\1\7\11"+
    "\1\1\1\0\2\1\2\11\14\1\1\11\4\1\2\11"+
    "\1\0\2\11\16\1\1\0\14\1\1\11\6\1\1\0"+
    "\5\1\1\0\1\1\4\0\4\1\4\0\1\1\5\0"+
    "\1\1\6\0\1\11\4\0\1\1\1\0\1\11\4\0"+
    "\1\11\1\0\1\11\2\0\1\11\1\0\1\11\3\0"+
    "\2\11\1\0\4\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yyline, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yyline);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 36: 
          { return new Symbol(sym.THrow, yycolumn, yyline, yytext());
          }
        case 55: break;
        case 17: 
          { return new Symbol(sym.Llave_a, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 16: 
          { return new Symbol(sym.Parentesis_c, yycolumn, yyline, yytext());
          }
        case 57: break;
        case 41: 
          { return new Symbol(sym.Boolean, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 40: 
          { return new Symbol(sym.Throwln, yycolumn, yyline, yytext());
          }
        case 59: break;
        case 20: 
          { return new Symbol(sym.Corchete_c, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 44: 
          { return new Symbol(sym.CloseFor, yycolumn, yyline, yytext());
          }
        case 61: break;
        case 18: 
          { return new Symbol(sym.Llave_c, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 11: 
          { return new Symbol(sym.AND, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 48: 
          { return new Symbol(sym.CloseMain, yycolumn, yyline, yytext());
          }
        case 64: break;
        case 42: 
          { return new Symbol(sym.OpenFor, yycolumn, yyline, yytext());
          }
        case 65: break;
        case 39: 
          { return new Symbol(sym.Int, yycolumn, yyline, yytext());
          }
        case 66: break;
        case 23: 
          { return new Symbol(sym.Caracter, yycolumn, yyline, yytext());
          }
        case 67: break;
        case 38: 
          { return new Symbol(sym.Define, yycolumn, yyline, yytext());
          }
        case 68: break;
        case 54: 
          { return new Symbol(sym.CloseMethod, yycolumn, yyline, yytext());
          }
        case 69: break;
        case 26: 
          { return new Symbol(sym.Or, yycolumn, yyline, yytext());
          }
        case 70: break;
        case 30: 
          { yybegin(YYINITIAL);
          }
        case 71: break;
        case 45: 
          { return new Symbol(sym.OpenTest, yycolumn, yyline, yytext());
          }
        case 72: break;
        case 53: 
          { return new Symbol(sym.OpenMethod, yycolumn, yyline, yytext());
          }
        case 73: break;
        case 1: 
          { return new Symbol(sym.ERROR, yycolumn, yyline, yytext());
          }
        case 74: break;
        case 13: 
          { return new Symbol(sym.OR, yycolumn, yyline, yytext());
          }
        case 75: break;
        case 50: 
          { return new Symbol(sym.OpenUntil, yycolumn, yyline, yytext());
          }
        case 76: break;
        case 3: 
          { return new Symbol(sym.Numero, yycolumn, yyline, yytext());
          }
        case 77: break;
        case 37: 
          { return new Symbol(sym.Return, yycolumn, yyline, yytext());
          }
        case 78: break;
        case 33: 
          { return new Symbol(sym.Then, yycolumn, yyline, yytext());
          }
        case 79: break;
        case 28: 
          { return new Symbol(sym.Do, yycolumn, yyline, yytext());
          }
        case 80: break;
        case 27: 
          { return new Symbol(sym.Op_incremento, yycolumn, yyline, yytext());
          }
        case 81: break;
        case 2: 
          { return new Symbol(sym.Identificador, yycolumn, yyline, yytext());
          }
        case 82: break;
        case 25: 
          { return new Symbol(sym.As, yycolumn, yyline, yytext());
          }
        case 83: break;
        case 10: 
          { return new Symbol(sym.Suma, yycolumn, yyline, yytext());
          }
        case 84: break;
        case 31: 
          { return new Symbol(sym.Eat, yycolumn, yyline, yytext());
          }
        case 85: break;
        case 35: 
          { return new Symbol(sym.Stop, yycolumn, yyline, yytext());
          }
        case 86: break;
        case 49: 
          { return new Symbol(sym.OpenMatch, yycolumn, yyline, yytext());
          }
        case 87: break;
        case 5: 
          { return new Symbol(sym.Comillas, yycolumn, yyline, yytext());
          }
        case 88: break;
        case 46: 
          { return new Symbol(sym.Main, yycolumn, yyline, yytext());
          }
        case 89: break;
        case 29: 
          { return new Symbol(sym.Igual, yycolumn, yyline, yytext());
          }
        case 90: break;
        case 47: 
          { return new Symbol(sym.CloseTest, yycolumn, yyline, yytext());
          }
        case 91: break;
        case 34: 
          { return new Symbol(sym.When, yycolumn, yyline, yytext());
          }
        case 92: break;
        case 8: 
          { return new Symbol(sym.Resta, yycolumn, yyline, yytext());
          }
        case 93: break;
        case 52: 
          { return new Symbol(sym.CloseUntil, yycolumn, yyline, yytext());
          }
        case 94: break;
        case 6: 
          { return new Symbol(sym.Division, yycolumn, yyline, yytext());
          }
        case 95: break;
        case 43: 
          { return new Symbol(sym.Character, yycolumn, yyline, yytext());
          }
        case 96: break;
        case 21: 
          { return new Symbol(sym.P_coma, yycolumn, yyline, yytext());
          }
        case 97: break;
        case 24: 
          { yybegin(multilinecomment);
          }
        case 98: break;
        case 15: 
          { return new Symbol(sym.Parentesis_a, yycolumn, yyline, yytext());
          }
        case 99: break;
        case 12: 
          { return new Symbol(sym.NOT, yycolumn, yyline, yytext());
          }
        case 100: break;
        case 32: 
          { return new Symbol(sym.Op_booleano, yycolumn, yyline, yytext());
          }
        case 101: break;
        case 14: 
          { return new Symbol(sym.Op_relacional, yycolumn, yyline, yytext());
          }
        case 102: break;
        case 4: 
          { /*Ignore*/
          }
        case 103: break;
        case 19: 
          { return new Symbol(sym.Corchete_a, yycolumn, yyline, yytext());
          }
        case 104: break;
        case 9: 
          { return new Symbol(sym.Op_atribucion, yycolumn, yyline, yytext());
          }
        case 105: break;
        case 7: 
          { return new Symbol(sym.Multiplicacion, yycolumn, yyline, yytext());
          }
        case 106: break;
        case 51: 
          { return new Symbol(sym.CloseMatch, yycolumn, yyline, yytext());
          }
        case 107: break;
        case 22: 
          { 
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
