class Solution {
    public boolean isPalindrome(String s) {
        char front;
        char end;

        List<Character> chars = new ArrayList<>();

        char[] charArray = s.toCharArray();

        for(char c : charArray){
            if (Character.isLetterOrDigit(c)){
                chars.add(Character.toLowerCase(c));
            }

        }

        for(int i = 0; i < chars.size(); i++ ){

            front = chars.get(i);
            end = chars.get(chars.size() - 1 - i);

            if(front != end){
                return false;
            }
            else{
                continue;
            }

        }
        return true;

        


    }
}
