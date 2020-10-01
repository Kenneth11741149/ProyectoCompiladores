/* The following code was generated by JFlex 1.4.3 on 10/1/20, 5:02 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/1/20, 5:02 PM from the specification file
 * <tt>./src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\6\2\0\1\3\22\0\1\3\1\36\3\0\1\42"+
    "\1\35\1\4\1\44\1\45\1\7\1\34\1\3\1\25\1\0\1\5"+
    "\12\2\1\32\1\53\1\41\1\33\1\40\2\0\13\1\1\1\16\1"+
    "\1\50\1\0\1\51\1\0\1\1\1\0\1\20\1\21\1\16\1\27"+
    "\1\13\1\30\1\14\1\17\1\10\2\1\1\23\1\52\1\11\1\22"+
    "\1\24\1\1\1\15\1\26\1\12\1\43\1\1\1\31\3\1\1\46"+
    "\1\37\1\47\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\10\2\1\11\2\2\2\1\1\12\1\13\1\14"+
    "\1\15\2\16\1\1\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\2\26\1\0\1\27\1\4\1\30\1\31"+
    "\7\2\1\32\1\2\1\33\1\2\1\34\1\2\1\35"+
    "\1\2\1\36\1\16\1\0\1\37\1\27\4\2\1\40"+
    "\7\2\1\0\1\2\1\41\1\42\7\2\1\3\1\2"+
    "\1\43\4\2\1\0\3\2\1\44\1\2\1\0\1\2"+
    "\3\0\1\45\1\46\1\47\1\2\3\0\1\50\4\0"+
    "\1\2\5\0\1\51\2\0\1\52\1\0\1\53\2\0"+
    "\1\54\1\0\1\55\1\56\1\0\1\57\2\0\1\60"+
    "\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[141];
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
    "\0\130\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\130\0\u039c\0\130\0\u03f4\0\u0420\0\u0160\0\u044c\0\130"+
    "\0\130\0\130\0\130\0\130\0\130\0\130\0\u0478\0\u04a4"+
    "\0\u04a4\0\u04d0\0\130\0\130\0\u04fc\0\u0528\0\u0554\0\u0580"+
    "\0\u05ac\0\u05d8\0\u0604\0\204\0\u0630\0\204\0\u065c\0\130"+
    "\0\u0688\0\204\0\u06b4\0\130\0\130\0\u06e0\0\130\0\130"+
    "\0\u070c\0\u0738\0\u0764\0\u0790\0\204\0\u07bc\0\u07e8\0\u0814"+
    "\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\204\0\204"+
    "\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\130"+
    "\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0"+
    "\0\u0bdc\0\u0c08\0\204\0\u0c34\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4"+
    "\0\u0d10\0\204\0\204\0\204\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0"+
    "\0\204\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4"+
    "\0\u0f20\0\u0f4c\0\u0f78\0\130\0\u0fa4\0\u0fd0\0\204\0\u0ffc"+
    "\0\130\0\u1028\0\u1054\0\130\0\u1080\0\130\0\130\0\u10ac"+
    "\0\130\0\u10d8\0\u1104\0\130\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[141];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\4\1\14\1\15\1\4\1\16\1\17\1\4"+
    "\1\20\1\21\1\22\2\4\1\23\1\4\1\24\1\25"+
    "\1\4\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\4\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\4\1\45\6\46\1\11\1\47\44\46\55\0"+
    "\2\4\5\0\15\4\1\0\4\4\11\0\1\4\6\0"+
    "\1\4\3\0\1\5\54\0\1\6\50\0\4\50\1\51"+
    "\47\50\5\0\1\52\1\0\1\53\23\0\1\54\53\0"+
    "\1\54\21\0\2\4\5\0\1\4\1\55\13\4\1\0"+
    "\4\4\11\0\1\4\6\0\1\4\2\0\2\4\5\0"+
    "\5\4\1\56\1\4\1\57\5\4\1\0\4\4\11\0"+
    "\1\4\6\0\1\4\2\0\2\4\5\0\10\4\1\60"+
    "\4\4\1\0\4\4\11\0\1\4\6\0\1\4\2\0"+
    "\2\4\5\0\3\4\1\61\11\4\1\0\4\4\11\0"+
    "\1\4\6\0\1\4\2\0\2\4\5\0\7\4\1\62"+
    "\3\4\1\63\1\4\1\0\4\4\11\0\1\4\6\0"+
    "\1\4\2\0\2\4\5\0\15\4\1\0\1\64\3\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\12\4"+
    "\1\65\2\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\5\4\1\66\6\4\1\67\1\0"+
    "\4\4\11\0\1\4\6\0\1\4\26\0\1\70\5\0"+
    "\1\54\21\0\2\4\5\0\3\4\1\71\6\4\1\72"+
    "\2\4\1\0\4\4\11\0\1\4\6\0\1\4\2\0"+
    "\2\4\5\0\10\4\1\73\4\4\1\0\4\4\11\0"+
    "\1\4\6\0\1\4\34\0\1\74\53\0\1\75\53\0"+
    "\1\54\1\70\52\0\1\75\4\0\1\75\46\0\1\75"+
    "\5\0\1\75\37\0\1\76\33\0\1\77\52\0\1\100"+
    "\47\0\6\52\1\0\45\52\1\0\2\4\5\0\2\4"+
    "\1\101\12\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\15\4\1\0\4\4\11\0\1\102"+
    "\6\0\1\4\2\0\2\4\5\0\3\4\1\103\1\4"+
    "\1\104\7\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\2\4\1\105\12\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\2\4"+
    "\1\106\12\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\10\4\1\107\4\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\12\4"+
    "\1\110\2\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\12\4\1\111\2\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\3\4"+
    "\1\112\11\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\15\4\1\0\2\4\1\113\1\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\13\4"+
    "\1\114\1\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\3\0\1\115\52\0\2\4\5\0\3\4\1\116\11\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\3\4\1\117\11\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\1\4\1\120\13\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\12\4\1\121\2\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\15\4\1\0\4\4"+
    "\11\0\1\122\6\0\1\4\2\0\2\4\5\0\5\4"+
    "\1\123\7\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\15\4\1\0\1\124\3\4\11\0"+
    "\1\4\6\0\1\4\2\0\2\4\5\0\13\4\1\125"+
    "\1\4\1\0\4\4\11\0\1\4\6\0\1\4\2\0"+
    "\2\4\5\0\1\4\1\126\13\4\1\0\4\4\11\0"+
    "\1\4\6\0\1\4\2\0\2\4\5\0\1\127\14\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\15\4\1\0\1\102\3\4\11\0\1\4\6\0"+
    "\1\4\3\0\1\115\42\0\1\130\7\0\2\4\5\0"+
    "\4\4\1\131\10\4\1\0\4\4\11\0\1\4\6\0"+
    "\1\4\2\0\2\4\5\0\15\4\1\0\3\4\1\132"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\5\4"+
    "\1\133\7\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\10\4\1\134\4\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\3\4"+
    "\1\135\11\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\2\0\2\4\5\0\3\4\1\136\11\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\15\4"+
    "\1\137\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\1\4\1\140\13\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\3\4\1\141\11\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\13\4\1\142\1\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\1\4\1\143\13\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\6\4\1\144\6\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\15\4\1\145\4\4"+
    "\11\0\1\4\6\0\1\4\2\0\2\4\5\0\10\4"+
    "\1\146\4\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\13\0\1\147\15\0\1\150\21\0\1\151\2\0\2\4"+
    "\5\0\3\4\1\152\11\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\5\4\1\153\7\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\2\0\2\4"+
    "\5\0\1\4\1\154\13\4\1\0\4\4\11\0\1\4"+
    "\6\0\1\4\2\0\2\4\5\0\2\4\1\155\12\4"+
    "\1\0\4\4\11\0\1\4\6\0\1\4\13\0\1\156"+
    "\15\0\1\157\21\0\1\160\2\0\2\4\5\0\1\4"+
    "\1\161\13\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\14\0\1\162\62\0\1\163\44\0\1\164\4\0\1\165"+
    "\34\0\2\4\5\0\3\4\1\166\11\4\1\0\4\4"+
    "\11\0\1\4\6\0\1\4\14\0\1\167\62\0\1\170"+
    "\44\0\1\171\4\0\1\172\61\0\1\173\42\0\1\174"+
    "\50\0\1\175\51\0\1\176\44\0\2\4\5\0\5\4"+
    "\1\177\7\4\1\0\4\4\11\0\1\4\6\0\1\4"+
    "\27\0\1\200\42\0\1\201\50\0\1\202\51\0\1\203"+
    "\55\0\1\204\60\0\1\205\45\0\1\206\54\0\1\207"+
    "\60\0\1\210\45\0\1\211\64\0\1\212\53\0\1\213"+
    "\60\0\1\214\53\0\1\215\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4400];
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
    "\2\0\1\11\5\1\1\11\17\1\1\11\1\1\1\11"+
    "\4\1\7\11\1\1\1\0\2\1\2\11\13\1\1\11"+
    "\3\1\2\11\1\0\2\11\14\1\1\0\12\1\1\11"+
    "\6\1\1\0\5\1\1\0\1\1\3\0\4\1\3\0"+
    "\1\1\4\0\1\1\5\0\1\11\2\0\1\1\1\0"+
    "\1\11\2\0\1\11\1\0\2\11\1\0\1\11\2\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[141];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 50: break;
        case 21: 
          { lexeme=yytext(); return P_coma;
          }
        case 51: break;
        case 34: 
          { lexeme=yytext(); return Then;
          }
        case 52: break;
        case 17: 
          { lexeme=yytext(); return Llave_a;
          }
        case 53: break;
        case 36: 
          { lexeme=yytext(); return Return;
          }
        case 54: break;
        case 7: 
          { return Linea;
          }
        case 55: break;
        case 27: 
          { lexeme=yytext(); return Or;
          }
        case 56: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 57: break;
        case 14: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 58: break;
        case 46: 
          { lexeme=yytext(); return CloseTest;
          }
        case 59: break;
        case 25: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 60: break;
        case 28: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 61: break;
        case 31: 
          { yybegin(YYINITIAL);
          }
        case 62: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 63: break;
        case 37: 
          { lexeme=yytext(); return Define;
          }
        case 64: break;
        case 18: 
          { lexeme=yytext(); return Llave_c;
          }
        case 65: break;
        case 43: 
          { lexeme=yytext(); return CloseFor;
          }
        case 66: break;
        case 41: 
          { lexeme=yytext(); return OpenFor;
          }
        case 67: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 68: break;
        case 5: 
          { lexeme=yytext(); return Comillas;
          }
        case 69: break;
        case 19: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 70: break;
        case 44: 
          { lexeme=yytext(); return OpenTest;
          }
        case 71: break;
        case 49: 
          { lexeme=yytext(); return CloseMethod;
          }
        case 72: break;
        case 29: 
          { lexeme=yytext(); return Do;
          }
        case 73: break;
        case 35: 
          { lexeme=yytext(); return THrow;
          }
        case 74: break;
        case 26: 
          { lexeme=yytext(); return As;
          }
        case 75: break;
        case 45: 
          { lexeme=yytext(); return Main;
          }
        case 76: break;
        case 12: 
          { lexeme=yytext(); return  NOT;
          }
        case 77: break;
        case 9: 
          { lexeme=yytext(); return Resta;
          }
        case 78: break;
        case 47: 
          { lexeme=yytext(); return CloseMain;
          }
        case 79: break;
        case 40: 
          { lexeme=yytext(); return Boolean;
          }
        case 80: break;
        case 13: 
          { lexeme=yytext(); return OR;
          }
        case 81: break;
        case 32: 
          { lexeme=yytext(); return Eat;
          }
        case 82: break;
        case 42: 
          { lexeme=yytext(); return Character;
          }
        case 83: break;
        case 16: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 84: break;
        case 8: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 85: break;
        case 20: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 86: break;
        case 1: 
          { return ERROR;
          }
        case 87: break;
        case 23: 
          { lexeme=yytext(); return Caracter;
          }
        case 88: break;
        case 24: 
          { yybegin(multilinecomment);
          }
        case 89: break;
        case 48: 
          { lexeme=yytext(); return OpenMethod;
          }
        case 90: break;
        case 30: 
          { lexeme=yytext(); return Igual;
          }
        case 91: break;
        case 38: 
          { lexeme=yytext(); return Int;
          }
        case 92: break;
        case 4: 
          { /*Ignore*/
          }
        case 93: break;
        case 33: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 94: break;
        case 10: 
          { lexeme=yytext(); return Suma;
          }
        case 95: break;
        case 39: 
          { lexeme=yytext(); return Throwln;
          }
        case 96: break;
        case 22: 
          { 
          }
        case 97: break;
        case 11: 
          { lexeme=yytext(); return AND;
          }
        case 98: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
