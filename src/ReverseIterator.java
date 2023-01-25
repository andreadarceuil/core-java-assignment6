import java.util.*;

public class ReverseIterator {

	/**
	 * 
	 */
	public ReverseIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeMap<String,String> treemap = new TreeMap<String, String>();
         treemap.put("Key1", "Jack");
         treemap.put("Key2", "Rick");
         treemap.put("Key3", "Kate");
         treemap.put("Key4", "Tom");
         treemap.put("Key5", "Steve");
         
         System.out.println(treemap);
         
         Set<String> keyset = treemap.descendingKeySet();
         for(String key: keyset) {
             System.out.println(key+": "+ treemap.get(key));

         }
	}

}
