import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<Integer>();
			int input = 9;
			int N = 0;
			while (input != 0){
			
			System.out.println("Type 1 if you wish to enter a number to add/remove");
			System.out.println("Type 2 to add the number");
			System.out.println("type 3 to remove the number");
			System.out.println("Type 4 to print the size of the Array List");
			System.out.println("Type 5 to print array list contents");
			System.out.println("Type 0 to exit");
			
			input = in.nextInt();
			in.nextLine();
			
			switch (input) {
			case 1: System.out.println("Enter your number");
					N = in.nextInt();
					in.nextLine();
				break;
			case 2: list.add(N);
				break;
			case 3: removeFromList(N, list);
				break;
			case 4: System.out.println(list.size());
				break;
			case 5: printList(list);
				break;
			}
		}
	}
	
	public static void removeFromList(int N, ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++){
			if (list.get(i).equals(N))
			{
				list.remove(i--);
			}
			else{}
		}
	}
	
	public static void printList(ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i));
		}
	}
}
