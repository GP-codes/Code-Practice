class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> frequency = new HashMap<>();

        HashMap<Character, Integer> frequency_second = new HashMap<>();


        for(char c : s.toCharArray()){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c) + 1);
            }
            else{
                frequency.put(c,1);
            }
        }


        for (char c2 : t.toCharArray()){
            if(frequency_second.containsKey(c2)){
                frequency_second.put(c2, frequency_second.get(c2) + 1);
            }
            else{
                frequency_second.put(c2, 1);
            }
        }

        if(frequency.equals(frequency_second)){
            System.out.println("The two strings, " + s + " and " + t + " are anagrams.");
            return true;
        }
        else{
            System.out.println("The two strings, " + s + " and " + t + " are NOT anagrams.");
            return false;
        }




    }
}
