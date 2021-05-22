package arraySum;

public class MainCalculSum {
	
	public static void main(String[] args) {
		int[] marks = {23, 45, 67, 100};
		Student student = new Student("Mari", marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks :" + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks : " + sum);
		
		int maximum = student.getMaximumOfMarks();
		System.out.println("Maximum of Marks :" + maximum);
		
		int minimum = student.getMinimumOfMarks();
		System.out.println("Minimum of mark : " + minimum);
	}

}
