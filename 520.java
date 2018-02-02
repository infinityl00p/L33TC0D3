/*

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

*/

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean hasUppercase = !word.equals(word.toLowerCase());
        boolean hasLowercase = !word.equals(word.toUpperCase());
        char[] charArray = word.toCharArray();
        
        if(!hasUppercase) {
            return true;
        } else if(!hasLowercase) {
            return true;
        } else if(hasUppercase && hasLowercase) {
            if(Character.isLowerCase(charArray[0])) { return false; } else {
                for (int i = 1; i < charArray.length; i++) {
                    if(Character.isUpperCase(charArray[i])) {
                        return false;
                    }
                }
                return true;
            }
        } else {return true;}
    }
}


// NOTE: I PROBABLY COULD HAVE USED REGEX TO MAKE THIS MUCH EASIER AND CLEANER
