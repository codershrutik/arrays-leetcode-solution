//Link of the question - https://leetcode.com/problems/count-items-matching-a-rule/description/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = -1;

        if(ruleKey.equals("type")){
            index = 0;
        } else if(ruleKey.equals("color")){
            index = 1;
        } else if(ruleKey.equals("name")){
            index = 2;
        } else{
            index = -1;
        }

        for(List<String> item: items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}
