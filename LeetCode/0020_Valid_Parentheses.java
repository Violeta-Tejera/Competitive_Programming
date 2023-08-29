

class Solution {
    public boolean isValid(String s) {
        Stack<Character> openingParentheses = new Stack<>();
	    int singLength = s.length();
	    
	    for(int i = 0; i < singLength; i++){
	        
	        // Control for closing parenthesis
	        if(isOpeningParentheses(s.charAt(i)) == false){
	            if(openingParentheses.empty() == true) return false; // Where's the opening parenthesis for this ?!?!
	            else if(returnKindOfClosingParenthesis(openingParentheses.peek()) == s.charAt(i)) openingParentheses.pop(); // We've got a valid pair
	            else return false; // No valid closing
	        }
	        // Control for opening parenthesis
	        else{
                openingParentheses.push(s.charAt(i));	            
	        }
        }

        return openingParentheses.empty(); // Is there a stray parenthesis that might invalidate the string?
    }

    public boolean isOpeningParentheses(Character p){
	    if(p == '{' || (p == '[' || p == '(')) return true;
	    
	    return false;
	}
	
	public Character returnKindOfClosingParenthesis(Character p){
	    if(p == '{') return '}';
	    else if(p == '[') return ']';
	    else if(p == '(') return ')';
	    
	    return null;
	}
}
