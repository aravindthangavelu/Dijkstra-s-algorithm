
public class Edges {

	private double distance;
	private Head startHead;
	private Head targetHead;
	
	public Edges(double distance, Head startHead, Head targetHead) {
		this.distance = distance;
		this.startHead = startHead;
		this.targetHead = targetHead;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Head getStartHead() {
		return startHead;
	}

	public void setStartHead(Head startHead) {
		this.startHead = startHead;
	}

	public Head getTargetHead() {
		return targetHead;
	}

	public void setTargetHead(Head targetHead) {
		this.targetHead = targetHead;
	}
 
	


	}

	

