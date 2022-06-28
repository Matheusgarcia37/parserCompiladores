
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jun 28 08:54:48 BRT 2022
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jun 28 08:54:48 BRT 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\073\000\002\002\004\000\002\002\020\000\002\005" +
    "\007\000\002\005\002\000\002\003\004\000\002\004\006" +
    "\000\002\024\003\000\002\024\002\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\007\004\000\002\025\004\000\002\025\002\000\002\010" +
    "\004\000\002\010\004\000\002\010\004\000\002\010\002" +
    "\000\002\020\003\000\002\020\003\000\002\020\003\000" +
    "\002\020\003\000\002\020\003\000\002\016\006\000\002" +
    "\016\004\000\002\016\004\000\002\027\004\000\002\027" +
    "\002\000\002\022\003\000\002\022\003\000\002\021\003" +
    "\000\002\021\003\000\002\021\003\000\002\021\003\000" +
    "\002\021\003\000\002\021\003\000\002\021\003\000\002" +
    "\021\003\000\002\021\003\000\002\015\004\000\002\015" +
    "\004\000\002\015\006\000\002\015\005\000\002\015\005" +
    "\000\002\015\007\000\002\030\004\000\002\030\004\000" +
    "\002\030\002\000\002\031\004\000\002\031\002\000\002" +
    "\023\003\000\002\023\003\000\002\014\012\000\002\026" +
    "\006\000\002\026\002\000\002\012\007\000\002\011\003" +
    "\000\002\017\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\004\004\004\001\002\000\004\005\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\006\010\001\002\000\006\004\012\010\ufffe\001" +
    "\002\000\004\010\017\001\002\000\004\007\013\001\002" +
    "\000\004\064\014\001\002\000\004\065\015\001\002\000" +
    "\006\004\012\010\ufffe\001\002\000\004\010\uffff\001\002" +
    "\000\004\021\020\001\002\000\004\031\021\001\002\000" +
    "\004\032\022\001\002\000\004\035\023\001\002\000\012" +
    "\010\032\011\026\013\024\014\027\001\002\000\004\064" +
    "\ufff6\001\002\000\004\022\154\001\002\000\004\064\ufff7" +
    "\001\002\000\004\064\ufff8\001\002\000\012\015\052\017" +
    "\047\022\uffef\023\044\001\002\000\004\064\033\001\002" +
    "\000\004\064\ufff9\001\002\000\006\061\040\062\ufff3\001" +
    "\002\000\004\062\035\001\002\000\022\010\032\011\026" +
    "\013\024\014\027\015\ufffa\017\ufffa\022\ufffa\023\ufffa\001" +
    "\002\000\012\015\ufffb\017\ufffb\022\ufffb\023\ufffb\001\002" +
    "\000\012\015\ufffc\017\ufffc\022\ufffc\023\ufffc\001\002\000" +
    "\004\064\033\001\002\000\004\062\ufff5\001\002\000\004" +
    "\062\ufff4\001\002\000\014\015\052\017\047\022\uffef\023" +
    "\044\036\uffef\001\002\000\004\031\145\001\002\000\004" +
    "\022\ufffd\001\002\000\014\015\052\017\047\022\uffef\023" +
    "\044\036\uffef\001\002\000\004\031\140\001\002\000\014" +
    "\015\052\017\047\022\uffef\023\044\036\uffef\001\002\000" +
    "\014\015\uffc8\017\uffc8\022\uffc8\023\uffc8\036\uffc8\001\002" +
    "\000\004\031\053\001\002\000\014\031\057\064\055\065" +
    "\054\071\056\072\060\001\002\000\044\025\072\026\077" +
    "\027\107\032\uffd1\037\106\040\100\041\070\045\101\046" +
    "\074\047\103\050\105\051\075\055\111\056\071\057\104" +
    "\071\056\072\060\001\002\000\044\025\072\026\077\027" +
    "\107\032\uffd1\037\106\040\100\041\070\045\101\046\074" +
    "\047\103\050\105\051\075\055\111\056\071\057\104\071" +
    "\056\072\060\001\002\000\046\025\uffe4\026\uffe4\027\uffe4" +
    "\031\uffe4\032\uffe4\037\uffe4\040\uffe4\041\uffe4\045\uffe4\046" +
    "\uffe4\047\uffe4\050\uffe4\051\uffe4\055\uffe4\056\uffe4\057\uffe4" +
    "\064\uffe4\065\uffe4\001\002\000\014\031\057\064\055\065" +
    "\054\071\056\072\060\001\002\000\046\025\uffe3\026\uffe3" +
    "\027\uffe3\031\uffe3\032\uffe3\037\uffe3\040\uffe3\041\uffe3\045" +
    "\uffe3\046\uffe3\047\uffe3\050\uffe3\051\uffe3\055\uffe3\056\uffe3" +
    "\057\uffe3\064\uffe3\065\uffe3\001\002\000\004\032\115\001" +
    "\002\000\010\031\065\064\064\065\063\001\002\000\040" +
    "\025\072\026\077\027\107\032\uffcf\037\106\040\100\041" +
    "\070\045\101\046\074\047\103\050\105\051\075\055\111" +
    "\056\071\057\104\001\002\000\040\025\072\026\077\027" +
    "\107\032\uffcf\037\106\040\100\041\070\045\101\046\074" +
    "\047\103\050\105\051\075\055\111\056\071\057\104\001" +
    "\002\000\014\031\057\064\055\065\054\071\056\072\060" +
    "\001\002\000\004\032\067\001\002\000\040\025\072\026" +
    "\077\027\107\032\uffcf\037\106\040\100\041\070\045\101" +
    "\046\074\047\103\050\105\051\075\055\111\056\071\057" +
    "\104\001\002\000\014\031\uffed\064\uffed\065\uffed\071\uffed" +
    "\072\uffed\001\002\000\014\031\uffdd\064\uffdd\065\uffdd\071" +
    "\uffdd\072\uffdd\001\002\000\014\031\uffdb\064\uffdb\065\uffdb" +
    "\071\uffdb\072\uffdb\001\002\000\014\031\uffce\064\uffce\065" +
    "\uffce\071\uffce\072\uffce\001\002\000\014\031\uffea\064\uffea" +
    "\065\uffea\071\uffea\072\uffea\001\002\000\014\031\uffde\064" +
    "\uffde\065\uffde\071\uffde\072\uffde\001\002\000\014\031\uffcd" +
    "\064\uffcd\065\uffcd\071\uffcd\072\uffcd\001\002\000\014\031" +
    "\uffdc\064\uffdc\065\uffdc\071\uffdc\072\uffdc\001\002\000\014" +
    "\031\uffeb\064\uffeb\065\uffeb\071\uffeb\072\uffeb\001\002\000" +
    "\014\031\uffda\064\uffda\065\uffda\071\uffda\072\uffda\001\002" +
    "\000\004\032\uffd4\001\002\000\014\031\uffee\064\uffee\065" +
    "\uffee\071\uffee\072\uffee\001\002\000\014\031\uffdf\064\uffdf" +
    "\065\uffdf\071\uffdf\072\uffdf\001\002\000\014\031\uffe0\064" +
    "\uffe0\065\uffe0\071\uffe0\072\uffe0\001\002\000\014\031\uffec" +
    "\064\uffec\065\uffec\071\uffec\072\uffec\001\002\000\014\031" +
    "\uffe2\064\uffe2\065\uffe2\071\uffe2\072\uffe2\001\002\000\014" +
    "\031\057\064\055\065\054\071\056\072\060\001\002\000" +
    "\014\031\uffe1\064\uffe1\065\uffe1\071\uffe1\072\uffe1\001\002" +
    "\000\004\032\uffd0\001\002\000\004\032\uffd5\001\002\000" +
    "\004\032\uffd6\001\002\000\004\035\116\001\002\000\012" +
    "\015\052\017\047\023\044\036\uffef\001\002\000\004\036" +
    "\120\001\002\000\016\015\uffca\016\121\017\uffca\022\uffca" +
    "\023\uffca\036\uffca\001\002\000\004\035\123\001\002\000" +
    "\014\015\uffcc\017\uffcc\022\uffcc\023\uffcc\036\uffcc\001\002" +
    "\000\012\015\052\017\047\023\044\036\uffef\001\002\000" +
    "\004\036\125\001\002\000\014\015\uffcb\017\uffcb\022\uffcb" +
    "\023\uffcb\036\uffcb\001\002\000\004\032\127\001\002\000" +
    "\044\025\072\026\077\027\107\032\uffd1\037\106\040\100" +
    "\041\070\045\101\046\074\047\103\050\105\051\075\055" +
    "\111\056\071\057\104\071\056\072\060\001\002\000\004" +
    "\032\uffd7\001\002\000\040\025\072\026\077\027\107\032" +
    "\uffcf\037\106\040\100\041\070\045\101\046\074\047\103" +
    "\050\105\051\075\055\111\056\071\057\104\001\002\000" +
    "\014\031\057\064\055\065\054\071\056\072\060\001\002" +
    "\000\004\032\uffd3\001\002\000\004\032\uffd2\001\002\000" +
    "\004\032\uffd8\001\002\000\004\032\uffd9\001\002\000\006" +
    "\022\ufff0\036\ufff0\001\002\000\004\064\141\001\002\000" +
    "\004\032\142\001\002\000\004\062\143\001\002\000\014" +
    "\015\uffc9\017\uffc9\022\uffc9\023\uffc9\036\uffc9\001\002\000" +
    "\006\022\ufff1\036\ufff1\001\002\000\014\031\057\064\055" +
    "\065\054\071\056\072\060\001\002\000\004\032\147\001" +
    "\002\000\004\035\150\001\002\000\012\015\052\017\047" +
    "\023\044\036\uffef\001\002\000\004\036\152\001\002\000" +
    "\014\015\uffc7\017\uffc7\022\uffc7\023\uffc7\036\uffc7\001\002" +
    "\000\006\022\ufff2\036\ufff2\001\002\000\004\065\155\001" +
    "\002\000\004\062\156\001\002\000\004\036\157\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\010\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\015\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\024\004\027" +
    "\006\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\010\044\011\042" +
    "\012\045\014\047\017\050\001\001\000\004\007\033\001" +
    "\001\000\002\001\001\000\004\025\040\001\001\000\002" +
    "\001\001\000\010\004\035\006\030\024\036\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\010\152\011" +
    "\042\012\045\014\047\017\050\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\010\143\011\042\012\045\014" +
    "\047\017\050\001\001\000\002\001\001\000\014\010\136" +
    "\011\042\012\045\014\047\017\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\015\060\022\061\001\001" +
    "\000\014\020\072\021\075\022\130\023\131\030\135\001" +
    "\001\000\014\020\072\021\075\022\130\023\131\030\134" +
    "\001\001\000\002\001\001\000\006\015\125\022\061\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\020\072\021\075\023\107\031\113\001\001\000" +
    "\012\020\072\021\075\023\107\031\112\001\001\000\006" +
    "\015\065\022\061\001\001\000\002\001\001\000\012\020" +
    "\072\021\075\023\107\031\101\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\015\111\022" +
    "\061\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\010" +
    "\116\011\042\012\045\014\047\017\050\001\001\000\002" +
    "\001\001\000\004\026\121\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\010\123\011\042\012\045\014\047" +
    "\017\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\020\072\021\075\022\130\023\131" +
    "\030\127\001\001\000\002\001\001\000\012\020\072\021" +
    "\075\023\107\031\133\001\001\000\006\015\132\022\061" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\015\145\022\061\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\010\150\011\042\012" +
    "\045\014\047\017\050\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // LACO_WHILE ::= Enquanto AbreP EL FechaP AbreCH COMANDOS FechaCH 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LACO_WHILE",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // REPETICAO ::= LACO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REPETICAO",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // LER ::= Scanf AbreP Id FechaP Pv 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LER",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // AUX3 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX3",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // AUX3 ::= Else AbreCH COMANDOS FechaCH 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX3",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // SE ::= If AbreP EL FechaP AbreCH COMANDOS FechaCH AUX3 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SE",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // OP_ARI_OU_LO ::= OP_LO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI_OU_LO",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // OP_ARI_OU_LO ::= OP_ARI 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI_OU_LO",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // AUX6 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX6",23, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // AUX6 ::= OP_ARI_OU_LO EL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX6",23, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // AUX5 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX5",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // AUX5 ::= INCREMENTO AUX6 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX5",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // AUX5 ::= OP_ARI_OU_LO EL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX5",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // EL ::= INCREMENTO AbreP EL FechaP AUX6 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // EL ::= INCREMENTO Id AUX6 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // EL ::= INCREMENTO Numero AUX6 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // EL ::= AbreP EL FechaP AUX5 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // EL ::= Id AUX5 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // EL ::= Numero AUX5 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EL",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // OP_LO ::= Not 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // OP_LO ::= AndAnd 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // OP_LO ::= Or 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // OP_LO ::= MaiorIgual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OP_LO ::= Maior 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OP_LO ::= MenorIgual 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OP_LO ::= Menor 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OP_LO ::= Diferente 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OP_LO ::= Equal 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_LO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // INCREMENTO ::= Decremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INCREMENTO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // INCREMENTO ::= Incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INCREMENTO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // AUX4 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX4",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // AUX4 ::= OP_ARI EA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX4",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EA ::= Id AUX4 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EA",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EA ::= Numero AUX4 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EA",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EA ::= AbreP EA FechaP AUX4 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EA",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // OP_ARI ::= Resto 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // OP_ARI ::= Subtracao 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // OP_ARI ::= Soma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OP_ARI ::= Divisao 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OP_ARI ::= Multiplicacao 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OP_ARI",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // COMANDOS ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMANDOS",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // COMANDOS ::= SE COMANDOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMANDOS",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // COMANDOS ::= LER COMANDOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMANDOS",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // COMANDOS ::= REPETICAO COMANDOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMANDOS",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // AUX2 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // AUX2 ::= Vir LISTAIDS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LISTAIDS ::= Id AUX2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTAIDS",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPO ::= Char 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPO ::= Double 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TIPO ::= Float 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TIPO ::= Int 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // AUX1 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX1",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // AUX1 ::= DECLARACAO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("AUX1",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DECLARACAO ::= TIPO LISTAIDS Pv AUX1 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACAO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // COMANDO ::= DECLARACAO COMANDOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("COMANDO",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // MAISCONST ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAISCONST",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // MAISCONST ::= Hash Constante Id Numero MAISCONST 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAISCONST",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Hash Include Lib MAISCONST Int Main AbreP FechaP AbreCH COMANDO Return Numero Pv FechaCH 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-13)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

