/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                result.append(temp.reverse());
                result.append(" ");
                temp = new StringBuilder();
            } else if(i == s.length() - 1) {
                temp.append(s.charAt(i));
                result.append(temp.reverse());
            }
            else {
                temp.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
