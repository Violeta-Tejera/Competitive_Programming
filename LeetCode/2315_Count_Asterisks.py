class Solution:
    def countAsterisks(self, s: str) -> int:
        count = 0
        inPair = False
        
        for i in range(0, len(s)):
            if s[i] == '|':
                inPair = not inPair
            
            if s[i] == '*':
                if inPair == False:
                    count += 1

        return count 
