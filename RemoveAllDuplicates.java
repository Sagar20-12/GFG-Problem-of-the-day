class RemoveAllDuplicates {
    String removeDuplicates(String str) {
        HashMap<Character, Boolean> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!map.containsKey(ch)){
                sb.append(ch);
                map.put(ch, true);
            }
        }
        return sb.toString();
    }
}
