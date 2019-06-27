import java.util.HashMap;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Aditi Nalnikar";
String str2=str1.replaceAll(" ", "");
String str= str2.toUpperCase();

HashMap<Character, Integer> map=new HashMap<Character, Integer>();
char[] ch= str.toCharArray();
for(char c: ch)
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
 System.out.println(map);
	}
	}   
