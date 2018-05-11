import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Character, Integer> map = new HashMap<Character, Integer>();
String s = "humongous";
char ch[] = s.toCharArray();

for(Character l : ch)
{
	if(map.containsKey(l))
				map.put(l, map.get(l)+1 );
	else
		map.put(l, 1);
}

Set<Character> keys = map.keySet();
for(Character ch2 : keys)
{
	if(map.get(ch2) > 1)
		System.out.println(ch2+ "------------>" + map.get(ch2));
}

}
}
