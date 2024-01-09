class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        if(pat.length()>txt.length()) return list;
        for(int i=0; i<txt.length()-pat.length()+1; i++){
            if(txt.charAt(i)==pat.charAt(0) && txt.charAt(i+pat.length()-1)==pat.charAt(pat.length()-1) && txt.substring(i,i+pat.length()).equals(pat)){
                list.add(i+1);
            }
        }
        return list;
    }
}
