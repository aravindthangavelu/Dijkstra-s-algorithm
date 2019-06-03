import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Head HeadA = new Head("A");
	static Head HeadB = new Head("B");
	static Head HeadC = new Head("C");
	static Head HeadD = new Head("D");
	static Head HeadE = new Head("E");
	static ArrayList<String> start=new ArrayList<String>();
	static ArrayList<String> end=new ArrayList<String>();
	static ArrayList<Integer> distance=new ArrayList<Integer>();
	static int choice=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Djikstra's Algorithm Application Started...");
		
		
		System.out.println("Enter the number of inputs you like to the input graph");
		int numberOfInput=sc.nextInt();
		for(int i=0;i<numberOfInput;i++) {
		  String a=sc.next();
		   char c=a.charAt(0);
		   Head startHead=getHead(c);
		   start.add(Character.toString(c));
		   Head endHead=getHead(a.charAt(1));
		   end.add(Character.toString(a.charAt(1)));
		   distance.add(Integer.parseInt(Character.toString(a.charAt(2))));
		   startHead.addNeighbour(new Edges(Integer.parseInt(Character.toString(a.charAt(2))),startHead,endHead));
		}
		System.out.println("Please select an option"+"\r\n"+"1.Find Distance From Point"+"\r\n"+"2.Shortest Path"+"\r\n"+"3.Find Shortest Path"+"\r\n"+"4.Exit");
		choice=sc.nextInt();
		while(choice>0 && choice<4) {
		switch(choice) {
		case 1:
			String result1=getDistance();
			System.out.println(result1);
			System.out.println("Please select an option"+"\r\n"+"1.Find Distance From Point"+"\r\n"+"2.Shortest Path"+"\r\n"+"3.Find Shortest Path"+"\r\n"+"4.Exit");
			choice=sc.nextInt();
			break;
		case 2:
			String result=getShortesDistance();
			System.out.println("Shortest Distance :"+result);
			System.out.println("Please select an option"+"\r\n"+"1.Find Distance From Point"+"\r\n"+"2.Shortest Path"+"\r\n"+"3.Find Shortest Path"+"\r\n"+"4.Exit");
			choice=sc.nextInt();
			break;
		case 3:
			 getShortestRoute();
			 System.out.println("Please select an option"+"\r\n"+"1.Find Distance From Point"+"\r\n"+"2.Shortest Path"+"\r\n"+"3.Find Shortest Path"+"\r\n"+"4.Exit");
			 choice=sc.nextInt();
			 break;
		case 4:
			System.out.println("Exiting the application");
			sc.close();
			choice=4;
			
		
		}
		
		}
sc.close();
	}
	public static void getShortestRoute() {
 		    System.out.println("Enter the Route you wish to find the shortest path"+"\r\n"+"For Example : If you wish to travel from 'A' to 'B' the give input as 'AB'");
	        Scanner sc=new Scanner(System.in);
	 		String shortestPath=sc.nextLine();
	        Head calculateHead=getHead(shortestPath.charAt(0));
	        Operation getShortestRoute=new Operation();
	        getShortestRoute.calculateShortestPathFromHead(calculateHead);
	        Head finalHead=getHead(shortestPath.charAt(1));
	        System.out.println(getShortestRoute.getShortestPathTo(finalHead));
	}
	public static String getShortesDistance() {
		
		System.out.println("Enter the point you wish to find the shortest distance"+"\r\n"+"For Example : If you wish to travel from 'A' to 'B' the give input as 'AB'");
		Scanner sc=new Scanner(System.in);
        String shortestPath=sc.nextLine();
        Head calculateHead=getHead(shortestPath.charAt(0));
        Operation calculateShortestDistance=new Operation();
        calculateShortestDistance.calculateShortestPathFromHead(calculateHead);
        Head finalHead=getHead(shortestPath.charAt(1));
        double finalValue=Math.round(finalHead.getDistance());
        return String.valueOf(finalValue);
        
	}
	public static String getDistance() {
		System.out.println("Enter the Route To Find If It Exists In Input Graph For Example: 'A' to 'B' to 'C' as 'ABC'");
		Scanner sc=new Scanner(System.in);
		String input2=sc.next();
		
		int sum=0;
		int count=0;
		for(int k=0;k<input2.length()-1;k++) {
			for(int i=0;i<start.size();i++) {
				if((start.get(i).equals(Character.toString(input2.charAt(k))) && (end.get(i).equals(Character.toString(input2.charAt(k+1)))))) {
				sum=sum+distance.get(i);
				count++;
			}
			
		}
			
	}
		if(sum>0 && count==input2.length()-1) {
			return String.valueOf(sum);
		}
		else {
			return "NO SUCH ROUTE";
		}
		
	}
	public static Head getHead(char a) {
		if(a=='A') {
			return HeadA;

		}
		else if(a=='B') {
			
			return HeadB;
		}
		else if(a=='C') {
		
			return HeadC;
		}
		else if(a=='D') {
			
			return HeadD;
		}
		else {
			return HeadE;

		}
	}

}
