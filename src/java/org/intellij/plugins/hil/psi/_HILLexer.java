/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.intellij.plugins.hil.psi;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.intellij.plugins.hil.HILElementTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;

@SuppressWarnings({"ALL"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>HILLexer.flex</tt>
 */
public class _HILLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int INTERPOLATION = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\20\2\1\1\20\22\0\1\1\1\31\1\21\1\0\1\13\1\30\1\35\1\16\1\22\1"+
    "\23\1\11\1\7\1\26\1\12\1\5\1\27\1\2\11\4\1\37\1\0\1\33\1\32\1\34\1\40\1\0"+
    "\4\10\1\6\25\10\1\24\1\17\1\25\1\0\1\10\1\0\1\46\3\10\1\44\1\45\5\10\1\47"+
    "\1\10\1\51\3\10\1\42\1\50\1\41\1\43\2\10\1\3\2\10\1\14\1\36\1\15\7\0\1\1\32"+
    "\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\24"+
    "\2\1\1\25\1\26\3\4\3\27\2\30\2\27\1\31"+
    "\1\27\3\0\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\3\4\1\0\1\41\1\42\2\3\1\0\3\4"+
    "\1\43\1\4\1\44\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[68];
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
    "\0\0\0\52\0\124\0\176\0\176\0\250\0\322\0\374"+
    "\0\176\0\176\0\176\0\176\0\u0126\0\176\0\176\0\176"+
    "\0\176\0\176\0\176\0\176\0\176\0\176\0\u0150\0\u017a"+
    "\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\176\0\176\0\u024c\0\u0276"+
    "\0\u02a0\0\u02ca\0\u02f4\0\176\0\u031e\0\176\0\u0348\0\u0372"+
    "\0\176\0\u039c\0\u03c6\0\u03f0\0\u041a\0\176\0\176\0\176"+
    "\0\176\0\176\0\176\0\176\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\176\0\176\0\u04ec\0\u0516\0\u0516\0\u0540\0\u056a\0\u0594"+
    "\0\322\0\u05be\0\322\0\322";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[68];
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
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\7\1\12"+
    "\1\7\1\13\1\14\1\15\1\4\1\16\2\4\1\5"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\3\7\1\40\3\7\1\41\13\42\1\43\3\44"+
    "\1\45\2\46\30\42\13\47\1\50\1\44\1\51\1\44"+
    "\1\52\1\47\1\44\30\47\54\0\1\10\1\53\1\10"+
    "\1\54\1\55\35\0\1\55\7\0\3\7\1\0\1\7"+
    "\1\0\3\7\26\0\11\7\2\0\1\10\1\0\1\10"+
    "\1\54\1\55\35\0\1\55\21\0\1\56\67\0\1\57"+
    "\51\0\1\60\51\0\1\61\51\0\1\62\54\0\1\63"+
    "\52\0\1\64\15\0\3\7\1\0\1\7\1\0\3\7"+
    "\26\0\1\7\1\65\7\7\2\0\3\7\1\0\1\7"+
    "\1\0\3\7\26\0\5\7\1\66\3\7\2\0\3\7"+
    "\1\0\1\7\1\0\3\7\26\0\2\7\1\67\6\7"+
    "\13\42\4\0\1\70\2\0\30\42\14\0\1\71\35\0"+
    "\17\42\1\44\1\0\31\42\13\47\4\0\1\52\1\47"+
    "\1\0\30\47\14\0\1\72\35\0\17\47\1\52\32\47"+
    "\2\0\1\10\1\0\1\10\47\0\1\73\1\0\1\73"+
    "\47\0\1\74\1\0\1\74\2\0\1\75\2\0\1\75"+
    "\41\0\3\7\1\0\1\7\1\0\3\7\26\0\2\7"+
    "\1\76\6\7\2\0\3\7\1\0\1\7\1\0\3\7"+
    "\26\0\6\7\1\77\2\7\2\0\3\7\1\0\1\7"+
    "\1\0\3\7\26\0\6\7\1\100\2\7\17\42\2\0"+
    "\31\42\2\0\1\73\1\0\1\73\1\0\1\55\35\0"+
    "\1\55\7\0\1\74\1\0\1\74\47\0\3\7\1\0"+
    "\1\7\1\0\3\7\26\0\3\7\1\101\5\7\2\0"+
    "\3\7\1\0\1\7\1\0\3\7\26\0\7\7\1\102"+
    "\1\7\2\0\3\7\1\0\1\7\1\0\3\7\26\0"+
    "\6\7\1\103\2\7\2\0\3\7\1\0\1\7\1\0"+
    "\3\7\26\0\3\7\1\104\5\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1512];
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
    "\3\0\2\11\3\1\4\11\1\1\11\11\6\1\2\11"+
    "\5\1\1\11\1\1\1\11\2\1\1\11\1\1\3\0"+
    "\7\11\3\1\1\0\2\11\2\1\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[68];
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
  public _HILLexer() {
    this((java.io.Reader)null);
  }
  int stringStart = -1;
  int hil = 0;
  private void hil_inc() {
    hil++;
  }
  private int hil_dec() {
    assert hil > 0;
    hil--;
    return hil;
  }
  private IElementType eods() {
    yybegin(YYINITIAL); zzStartRead = stringStart; return DOUBLE_QUOTED_STRING;
  }
  private IElementType eoil() {
    hil=0; return eods();
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HILLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
            case STRING: {
              return eods();
            }
            case 69: break;
            case INTERPOLATION: {
              return eoil();
            }
            case 70: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 38: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 39: break;
          case 3: 
            { return NUMBER;
            }
          case 40: break;
          case 4: 
            { return ID;
            }
          case 41: break;
          case 5: 
            { return OP_DOT;
            }
          case 42: break;
          case 6: 
            { return OP_PLUS;
            }
          case 43: break;
          case 7: 
            { return OP_MUL;
            }
          case 44: break;
          case 8: 
            { return OP_MINUS;
            }
          case 45: break;
          case 9: 
            { return INTERPOLATION_END;
            }
          case 46: break;
          case 10: 
            { stringStart = zzStartRead; yybegin(STRING);
            }
          case 47: break;
          case 11: 
            { return L_PAREN;
            }
          case 48: break;
          case 12: 
            { return R_PAREN;
            }
          case 49: break;
          case 13: 
            { return L_BRACKET;
            }
          case 50: break;
          case 14: 
            { return R_BRACKET;
            }
          case 51: break;
          case 15: 
            { return COMMA;
            }
          case 52: break;
          case 16: 
            { return OP_DIV;
            }
          case 53: break;
          case 17: 
            { return OP_MOD;
            }
          case 54: break;
          case 18: 
            { return OP_NOT;
            }
          case 55: break;
          case 19: 
            { return OP_LESS;
            }
          case 56: break;
          case 20: 
            { return OP_GREATER;
            }
          case 57: break;
          case 21: 
            { return OP_COLON;
            }
          case 58: break;
          case 22: 
            { return OP_QUEST;
            }
          case 59: break;
          case 23: 
            { 
            }
          case 60: break;
          case 24: 
            { return eods();
            }
          case 61: break;
          case 25: 
            { if (hil_dec() <= 0) yybegin(STRING);
            }
          case 62: break;
          case 26: 
            { return INTERPOLATION_START;
            }
          case 63: break;
          case 27: 
            { return OP_NOT_EQUAL;
            }
          case 64: break;
          case 28: 
            { return OP_EQUAL;
            }
          case 65: break;
          case 29: 
            { return OP_LESS_OR_EQUAL;
            }
          case 66: break;
          case 30: 
            { return OP_GREATER_OR_EQUAL;
            }
          case 67: break;
          case 31: 
            { return OP_AND_AND;
            }
          case 68: break;
          case 32: 
            { return OP_OR_OR;
            }
          case 69: break;
          case 33: 
            { hil_inc(); yybegin(INTERPOLATION);
            }
          case 70: break;
          case 34: 
            { hil_inc();
            }
          case 71: break;
          case 35: 
            { return TRUE;
            }
          case 72: break;
          case 36: 
            { return NULL;
            }
          case 73: break;
          case 37: 
            { return FALSE;
            }
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
