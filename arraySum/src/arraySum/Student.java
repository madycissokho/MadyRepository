package arraySum;

public class Student {
	private String name;
	private int[] marks;
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getNumberOfMarks() {
	
		return marks.length;
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			  sum += mark;
		}
		return sum;
	}
	public int getMaximumOfMarks() {
		int maximum = Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark>maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}
	public int getMinimumOfMarks() {
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark>minimum) {
				  minimum = mark;
			}
		}
		return minimum;
	}
	
	

}
