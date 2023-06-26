class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        first = 0
        last = len(letters) - 1

        while first <= last:
            mid = (first + last) // 2
            
            if letters[mid] <= target:
                first = mid + 1
            else:
                last = mid - 1
        
        if len(letters) != first:
            return letters[first]

        return letters[0]


