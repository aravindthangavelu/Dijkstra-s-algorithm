import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Operation {

	
	public void calculateShortestPathFromHead(Head sourceHead){
		 
		sourceHead.setDistance(0);
		PriorityQueue<Head> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceHead);
		sourceHead.setVisited(true);
 
		while( !priorityQueue.isEmpty() ){

			Head actualHead = priorityQueue.poll();
			for(Edges Edges : actualHead.getneighbourList()){
				Head v = Edges.getTargetHead();
				if(!v.isVisited())
				{
					double newDistance = actualHead.getDistance() + Edges.getDistance();
 
					if( newDistance < v.getDistance() ){
						priorityQueue.remove(v);
						v.setDistance(newDistance);
						v.setpreviousHead(actualHead);
						priorityQueue.add(v);
					}
				}
			}
			actualHead.setVisited(true);
		}
	}
	public List<Head> getShortestPathTo(Head targetHead){
		List<Head> paths = new ArrayList<>();
 
		for(Head H1=targetHead;H1!=null;H1=H1.getpreviousHead()){
			paths.add(H1);
		}
 
		Collections.reverse(paths);
		return paths;
	}
	
}
