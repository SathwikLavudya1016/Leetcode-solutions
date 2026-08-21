class Solution {
    public boolean rotateString(String s, String goal) {
        // If the lengths are different, they can never be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }
        
        // A rotated string will always be a substring of the original string concatenated with itself
        String doubled = s + s;
        return doubled.contains(goal);
    }
}