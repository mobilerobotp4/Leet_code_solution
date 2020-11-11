/*
Validate if a given string can be interpreted as a decimal number.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one. However, here is a list of characters that can be in a valid decimal number:

Numbers 0-9
Exponent - "e"
Positive/negative sign - "+"/"-"
Decimal point - "."
Of course, the context of these characters also matters in the input.
*/

class Solution {
    public boolean isNumber(String s) {
         s = s.trim();
        
        boolean n1 = false, n2 = false, e = false, dot = false;
        char last = '\0';
        
        for (char c : s.toCharArray()) {
            if (c == 'e') {
                if (e || !n1) {
                    return false;
                }
                
                e = true;
            } else if (c == '-' || c == '+') {
                if (last != 'e' && last != '\0') {
                    return false;
                }
            } else if(c == '.') {
                if (e || dot) {
                    return false;
                }
                
                dot = true;
            } else if (!(c >= '0' && c <= '9')) {
                return false;
            } else {
                n1 = true;
                
                if (e) {
                    n2 = true;
                }
            }
            
            last = c;
        }
        
        if (e && !n2) {
            return false;
        }
        
        if (!n1) {
            return false;
        }
        
        return true;
        
    }
}
