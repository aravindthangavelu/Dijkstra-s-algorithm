import java.util.ArrayList;
import java.util.List;

public class Head implements Comparable<Head> {

	
	public String headName;
	public List<Edges> neighbourList;
	public boolean visited;
	public Head previousHead;
	public double distance = Double.MAX_VALUE;
 
	public Head(String headName) {
		this.headName = headName;
		this.neighbourList = new ArrayList<>();
	}
 
	public void addNeighbour(Edges Edges) {
		
		this.neighbourList.add(Edges);
		
	}
 
	public String getheadName() {
		return headName;
	}
 
	public void setheadName(String headName) {
		this.headName = headName;
	}
 
	public List<Edges> getneighbourList() {
		return neighbourList;
	}
 
	public void setneighbourList(List<Edges> neighbourList) {
		this.neighbourList = neighbourList;
	}
 
	public boolean isVisited() {
		return visited;
	}
 
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
 
	public Head getpreviousHead() {
		return previousHead;
	}
 
	public void setpreviousHead(Head previousHead) {
		this.previousHead = previousHead;
	}
 
	public double getDistance() {
		return distance;
	}
 
	public void setDistance(double distance) {
		this.distance = distance;
	}
 
	@Override
	public String toString() {
		return this.headName;
	}

	@Override
	public int compareTo(Head newHead) {
		return Double.compare(this.distance, newHead.getDistance());
	}
	
	
}
