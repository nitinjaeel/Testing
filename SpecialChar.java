import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpecialChar {
	public void findDuplicateChars(String str){
        
       Map<Character,Integer> map = new HashMap<Character,Integer>();
       char[] ch= str.toCharArray();
       for(Character c : ch)
       {
    	   
    	   if(map.containsKey(c))
    	   {
    		   map.put(c, map.get(c)+1);
    	   }
    	   
    	   else
    	   {
    	        map.put(c, 1);
    	   }
       }
       
       for(Map.Entry<Character, Integer> map2 : map.entrySet())
       {
    	   System.out.println(map2.getKey()+"------------->"  + map2.getValue());
    	     	   
       }       
    }
     
    public static void main(String a[]){
       SpecialChar dcs = new SpecialChar();
        dcs.findDuplicateChars("hummmmmmmmmmmongous");
    }
		
}

/*Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
char[] chrs = str.toCharArray();
for(Character ch:chrs){
    if(dupMap.containsKey(ch)){
        dupMap.put(ch, dupMap.get(ch)+1);
    } else {
        dupMap.put(ch, 1);
    }
}
Set<Character> keys = dupMap.keySet();
for(Character ch:keys){
    
        System.out.println(ch+"--->"+dupMap.get(ch));
    
}*/