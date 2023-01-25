import java.util.ArrayList;
public class Sublist {

	public Sublist() {
		// TODO Auto-generated constructor stub
	}
	//method
	public ArrayList<String> sublist(ArrayList<String> arr, int a, int b) {
		
		ArrayList<String> shorter =new ArrayList<String>();
		for(int i =a; i<=b; i++ ) {
			shorter.add(arr.get(i));
			
		}
			return shorter;
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
