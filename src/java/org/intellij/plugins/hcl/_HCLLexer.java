/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.intellij.plugins.hcl;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import java.util.EnumSet;
import static org.intellij.plugins.hcl.HCLElementTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;

@SuppressWarnings({"ALL"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>HCLLexer.flex</tt>
 */
public class _HCLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int D_STRING = 2;
  public static final int S_STRING = 4;
  public static final int HIL_EXPRESSION = 6;
  public static final int IN_NUMBER = 8;
  public static final int S_HEREDOC_MARKER = 10;
  public static final int S_HEREDOC_LINE = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\25"+
    "\1\5\1\17\2\0\1\23\2\0\1\6\1\15\1\30\1\7\1\13"+
    "\1\4\1\10\11\12\2\0\1\22\1\31\3\0\1\16\1\44\2\16"+
    "\1\14\1\16\1\43\3\16\1\43\1\16\1\43\12\16\1\11\2\16"+
    "\1\26\1\24\1\27\1\0\1\16\1\0\1\37\1\44\2\16\1\35"+
    "\1\36\1\43\3\16\1\43\1\40\1\43\1\42\3\16\1\33\1\41"+
    "\1\32\1\34\2\16\1\11\2\16\1\20\1\0\1\21\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final int ZZ_SX = 0x0700;
  private static final int ZZ_MX = 0x10000;
  private static final int ZZ_LX = 0x110000;
  private static char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED, ZZ_SX);
  private static class M { static final char [] MAP = zzUnpackCMap(ZZ_CMAP_PACKED, ZZ_MX); }
  private static class L { static final char [] MAP = zzUnpackCMap(ZZ_CMAP_PACKED, ZZ_LX); }

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\2\1\1\1\3\1\4\1\5\1\4"+
    "\1\5\1\6\1\7\1\1\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\3\4\1\16\2\17\3\16\1\20\2\21"+
    "\1\22\2\23\1\16\1\24\1\0\2\25\1\26\2\27"+
    "\1\30\2\31\1\32\2\5\3\0\1\33\3\4\1\34"+
    "\1\35\3\0\1\25\2\26\2\30\1\0\3\4\1\5"+
    "\1\0\1\5\3\4\1\25\1\0\2\25\1\32\1\5"+
    "\1\4\1\5\1\36\1\4\1\37\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
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
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u0103"+
    "\0\u0103\0\u022b\0\u0103\0\u0103\0\u0103\0\u0103\0\u0103\0\u0103"+
    "\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4\0\u0103\0\u0309\0\u0103"+
    "\0\u032e\0\u0103\0\u0353\0\u0103\0\u0103\0\u0378\0\u0103\0\u039d"+
    "\0\u0103\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u0103\0\u047b"+
    "\0\u04a0\0\u0103\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559\0\u057e"+
    "\0\u0103\0\u05a3\0\u05c8\0\u05ed\0\u0103\0\u0103\0\u0612\0\u0637"+
    "\0\u065c\0\u0681\0\u06a6\0\u0103\0\u06cb\0\u0103\0\u06f0\0\u0715"+
    "\0\u073a\0\u075f\0\u0784\0\u07a9\0\u07a9\0\u07ce\0\u07f3\0\u0818"+
    "\0\u083d\0\u0862\0\u0887\0\u0103\0\u0103\0\u08ac\0\u08d1\0\u08d1"+
    "\0\u01e1\0\u08f6\0\u01e1\0\u01e1";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
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
    "\1\10\3\11\1\12\1\13\1\10\1\14\1\15\1\16"+
    "\1\17\2\16\1\10\1\16\1\10\1\20\1\21\1\22"+
    "\1\23\1\10\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\3\16\1\32\3\16\1\33\2\16\1\34\1\35\1\36"+
    "\14\34\1\37\2\40\1\34\1\40\1\41\1\42\20\34"+
    "\1\43\1\44\14\34\1\37\2\40\1\34\1\45\1\41"+
    "\1\40\20\34\1\46\1\47\14\34\1\50\1\40\1\51"+
    "\1\34\1\40\1\41\1\40\17\34\7\0\1\52\1\53"+
    "\1\0\1\54\32\0\1\55\1\56\1\57\42\55\1\60"+
    "\1\61\1\62\42\60\46\0\3\11\45\0\1\13\1\0"+
    "\1\63\36\0\1\13\2\0\42\13\7\0\1\16\1\64"+
    "\1\16\1\65\2\16\1\0\1\16\13\0\13\16\10\0"+
    "\1\17\1\66\1\17\1\67\1\70\20\0\1\70\16\0"+
    "\6\16\1\0\1\16\13\0\13\16\10\0\1\17\1\0"+
    "\1\17\1\67\1\70\20\0\1\70\31\0\1\71\31\0"+
    "\6\16\1\0\1\16\13\0\1\16\1\72\11\16\7\0"+
    "\6\16\1\0\1\16\13\0\5\16\1\73\5\16\7\0"+
    "\6\16\1\0\1\16\13\0\2\16\1\74\10\16\1\34"+
    "\2\0\14\34\3\0\1\34\1\0\1\41\1\0\17\34"+
    "\2\0\1\36\62\0\1\75\24\0\1\34\2\0\21\34"+
    "\1\41\20\34\2\0\1\44\44\0\1\47\62\0\1\76"+
    "\34\0\1\53\1\0\1\54\42\0\1\54\1\77\1\54"+
    "\1\100\1\101\20\0\1\101\5\0\1\102\11\0\1\54"+
    "\1\0\1\54\1\100\1\101\20\0\1\101\5\0\1\102"+
    "\1\0\1\55\1\103\1\104\42\55\2\0\1\57\42\0"+
    "\1\60\1\105\1\106\42\60\2\0\1\62\42\0\6\63"+
    "\1\107\36\63\7\0\1\16\1\65\1\110\1\65\1\111"+
    "\1\112\1\0\1\16\13\0\3\16\1\112\7\16\7\0"+
    "\1\16\1\65\1\16\1\65\1\111\1\112\1\0\1\16"+
    "\13\0\3\16\1\112\7\16\10\0\1\17\1\0\1\17"+
    "\42\0\1\113\1\0\1\113\41\0\1\114\1\115\1\0"+
    "\1\115\2\0\1\114\36\0\6\16\1\0\1\16\13\0"+
    "\2\16\1\116\10\16\7\0\6\16\1\0\1\16\13\0"+
    "\6\16\1\117\4\16\7\0\6\16\1\0\1\16\13\0"+
    "\6\16\1\120\4\16\10\0\1\54\1\0\1\54\42\0"+
    "\1\121\1\0\1\121\41\0\1\122\1\123\1\0\1\123"+
    "\2\0\1\122\73\0\1\124\2\0\1\104\44\0\1\106"+
    "\42\0\4\63\1\125\40\63\7\0\1\16\1\65\1\16"+
    "\1\65\2\16\1\0\1\16\13\0\13\16\7\0\1\16"+
    "\1\126\1\16\1\126\2\16\1\0\1\16\13\0\13\16"+
    "\7\0\1\127\1\130\1\16\1\130\2\16\1\114\1\16"+
    "\13\0\13\16\10\0\1\113\1\0\1\113\1\0\1\70"+
    "\20\0\1\70\17\0\1\115\1\0\1\115\41\0\6\16"+
    "\1\0\1\16\13\0\3\16\1\131\7\16\7\0\6\16"+
    "\1\0\1\16\13\0\7\16\1\132\3\16\7\0\6\16"+
    "\1\0\1\16\13\0\6\16\1\133\4\16\10\0\1\121"+
    "\1\0\1\121\1\0\1\101\20\0\1\101\5\0\1\102"+
    "\11\0\1\123\1\0\1\123\42\0\1\123\1\0\1\123"+
    "\30\0\1\102\10\0\1\16\1\126\1\16\1\126\1\16"+
    "\1\112\1\0\1\16\13\0\3\16\1\112\7\16\7\0"+
    "\1\16\1\130\1\16\1\130\2\16\1\0\1\16\13\0"+
    "\13\16\7\0\6\16\1\0\1\16\13\0\3\16\1\134"+
    "\7\16";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2331];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\1\11\7\1\2\11\1\1\6\11\5\1\1\11"+
    "\1\1\1\11\1\1\1\11\1\1\2\11\1\1\1\11"+
    "\1\1\1\11\1\0\4\1\1\11\2\1\1\11\3\1"+
    "\3\0\1\11\3\1\2\11\3\0\2\1\1\11\1\1"+
    "\1\11\1\0\4\1\1\0\5\1\1\0\1\1\2\11"+
    "\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  // This parameters can be getted from capabilities
    private boolean withNumbersWithBytesPostfix;
    private boolean withInterpolationLanguage;

    public _HCLLexer(EnumSet<HCLCapability> capabilities) {
      this((java.io.Reader)null);
      this.withNumbersWithBytesPostfix = capabilities.contains(HCLCapability.NUMBERS_WITH_BYTES_POSTFIX);
      this.withInterpolationLanguage = capabilities.contains(HCLCapability.INTERPOLATION_LANGUAGE);
    }
    enum StringType {
      None, SingleQ, DoubleQ
    }
  // State data
    StringType stringType = StringType.None;
    int stringStart = -1;
    int hil = 0;
    int myHereDocMarkerLength = 0;
    int myHereDocMarkerWeakHash = 0;
    boolean myHereDocIndented = false;

    private void hil_inc() {
      hil++;
    }
    private int hil_dec() {
      assert hil > 0;
      hil--;
      return hil;
    }
    private void push_eol() {
      yypushback(getEOLLength());
    }
    private int getEOLLength() {
      if (yylength() == 0) return 0;
      char last = yycharat(yylength() - 1);
      if (last != '\r' && last != '\n') return 0;
      if ((yylength() > 1) && yycharat(yylength() - 2) == '\r') return 2;
      return 1;
    }
    private IElementType eods() {
      yybegin(YYINITIAL); stringType = StringType.None; zzStartRead = stringStart; return DOUBLE_QUOTED_STRING;
    }
    private IElementType eoss() {
      yybegin(YYINITIAL); stringType = StringType.None; zzStartRead = stringStart; return SINGLE_QUOTED_STRING;
    }
    private IElementType eoil() {
      hil=0; return stringType == StringType.SingleQ ? eoss(): eods();
    }
    private void setHereDocMarker(CharSequence marker) {
      myHereDocIndented = true; // Temprorarly set to true. See #30
      int length = marker.length();
      String value = marker.toString();
      assert(length > 0);
      if (marker.charAt(0) == '-') {
        assert(length > 1);
        // Indented heredoc
        myHereDocIndented = true;
        length--;
        value = value.substring(1);
      }
      myHereDocMarkerLength = length & 0xFF;
      int hash = value.hashCode();
      myHereDocMarkerWeakHash = hash & 0xFFFF;
    }
    private void resetHereDocMarker() {
      myHereDocMarkerLength = 0;
      myHereDocMarkerWeakHash = 0;
    }
    private boolean isHereDocMarkerDefined() {
      return myHereDocMarkerLength != 0 && myHereDocMarkerWeakHash != 0;
    }
    private boolean isHereDocMarker(CharSequence input) {
      if (myHereDocIndented) input = LexerUtil.trimLeading(input);
      if ((input.length() & 0xFF) != myHereDocMarkerLength) return false;
      int hash = input.toString().hashCode();
      return myHereDocMarkerWeakHash == (hash & 0xFFFF);
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HCLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed, int limit) {
    char [] map = new char[limit];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170 && j < limit) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0 && j < limit);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          if (zzInput >= zzCMapL.length) ZZ_CMAP = zzCMapL = zzInput >= ZZ_MX ? L.MAP : M.MAP;
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case D_STRING: {
              return eods();
            }
            case 93: break;
            case S_STRING: {
              return eoss();
            }
            case 94: break;
            case HIL_EXPRESSION: {
              return eoil();
            }
            case 95: break;
            case S_HEREDOC_MARKER: {
              yybegin(YYINITIAL); return BAD_CHARACTER;
            }
            case 96: break;
            case S_HEREDOC_LINE: {
              yybegin(YYINITIAL); return BAD_CHARACTER;
            }
            case 97: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 33: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 34: break;
          case 3: 
            { return LINE_COMMENT;
            }
          case 35: break;
          case 4: 
            { return ID;
            }
          case 36: break;
          case 5: 
            { if (!withNumbersWithBytesPostfix) return NUMBER;
                                yybegin(IN_NUMBER); yypushback(yylength());
            }
          case 37: break;
          case 6: 
            { return L_CURLY;
            }
          case 38: break;
          case 7: 
            { return R_CURLY;
            }
          case 39: break;
          case 8: 
            { stringType = StringType.SingleQ; stringStart = zzStartRead; yybegin(S_STRING);
            }
          case 40: break;
          case 9: 
            { stringType = StringType.DoubleQ; stringStart = zzStartRead; yybegin(D_STRING);
            }
          case 41: break;
          case 10: 
            { return L_BRACKET;
            }
          case 42: break;
          case 11: 
            { return R_BRACKET;
            }
          case 43: break;
          case 12: 
            { return COMMA;
            }
          case 44: break;
          case 13: 
            { return EQUALS;
            }
          case 45: break;
          case 14: 
            { 
            }
          case 46: break;
          case 15: 
            { push_eol(); return eods();
            }
          case 47: break;
          case 16: 
            { return eods();
            }
          case 48: break;
          case 17: 
            { push_eol(); return eoss();
            }
          case 49: break;
          case 18: 
            { return eoss();
            }
          case 50: break;
          case 19: 
            { push_eol(); return eoil();
            }
          case 51: break;
          case 20: 
            { if (hil_dec() <= 0) yybegin(stringType == StringType.SingleQ ? S_STRING: D_STRING);
            }
          case 52: break;
          case 21: 
            { yybegin(YYINITIAL); return NUMBER;
            }
          case 53: break;
          case 22: 
            { yypushback(getEOLLength());
    setHereDocMarker(yytext());
    return HD_MARKER;
            }
          case 54: break;
          case 23: 
            { if (!isHereDocMarkerDefined()) {
      yybegin(YYINITIAL);
      return BAD_CHARACTER;
    }
    yybegin(S_HEREDOC_LINE);
//    zzStartRead+=getEOLLength();
    return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 55: break;
          case 24: 
            { int eol = getEOLLength();
    int len = yylength();
    int len_eff = len - eol;
    assert len_eff >= 0;
    if((len_eff & 0xFF) >= myHereDocMarkerLength
       && isHereDocMarker(yytext().subSequence(0, len_eff))) {
      // End of HereDoc
      yypushback(eol);
      yybegin(YYINITIAL);
      resetHereDocMarker();
      return HD_MARKER;
    } else {
      return HD_LINE;
    }
            }
          case 56: break;
          case 25: 
            { return HD_LINE;
            }
          case 57: break;
          case 26: 
            { return BLOCK_COMMENT;
            }
          case 58: break;
          case 27: 
            { yybegin(S_HEREDOC_MARKER); return HD_START;
            }
          case 59: break;
          case 28: 
            { if (withInterpolationLanguage) {hil_inc(); yybegin(HIL_EXPRESSION);}
            }
          case 60: break;
          case 29: 
            { hil_inc();
            }
          case 61: break;
          case 30: 
            { return TRUE;
            }
          case 62: break;
          case 31: 
            { return NULL;
            }
          case 63: break;
          case 32: 
            { return FALSE;
            }
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
