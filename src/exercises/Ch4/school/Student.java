package exercises.Ch4.school;

public class Student {

	public static void main(String[] args) {

		Student myself= new Student("Brigid", 1, 30, 4.0);
		Student twin = new Student("Brigid", 2, 20, 3.0);
		Teacher theTeacher = new Teacher();

//		System.out.println(myself.studentInfo());

//		System.out.println(myself.getGradeLevel());

//		myself.addGrade(3, 3.0);
//		System.out.println(myself.gpa);
//		myself.addGrade(3, 3.0);
//		System.out.println(myself.gpa);

//		System.out.println(myself.toString());

//		System.out.println(myself.equals(twin));
		Course myFirstCourse = new Course("My First Course");
		Course mySecondCourse = new Course("My Second Course");

//		System.out.println(myFirstCourse.equals(mySecondCourse));
		System.out.println(myFirstCourse.toString());

	}
		private static int nextStudentId = 1;
		private String name;
		private int studentId;
		private int numberOfCredits;
		private double gpa;

		public Student(String name, int studentId, int numberOfCredits, double gpa) {
			this.name = name;
			this.studentId = studentId;
			this.numberOfCredits = numberOfCredits;
			this.gpa = gpa;
		}

		public Student(String name, int studentId) {
			this(name, studentId, 0, 0);
		}

		public Student(String name) {
			this(name, nextStudentId);
			nextStudentId++;
		}

		public String studentInfo() {

			return (this.name + " has a GPA of: " + this.gpa);
		}
//	Calculate their current total quality score by using the formula gpa * numberOfCredits.
// Update the appropriate fields: numberOfCredits, gpa

	public void addGrade(int courseCredits, double grade) {

			double currentTotalQualityScore= this.gpa * this.numberOfCredits;

			double newQualityScore= courseCredits * grade;

			double newTotalQualityScore= currentTotalQualityScore + newQualityScore;

			int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
			this.numberOfCredits = newTotalNumberOfCredits;

			double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
			this.gpa = newGpa;

	}


	// Determine the grade level of the student based on numberOfCredits

	public String getGradeLevel() {
			if(numberOfCredits >=0 && numberOfCredits <=29) {
				return "Freshman";

			}else if (numberOfCredits >=30 && numberOfCredits <=59) {
				return "Sophomore";

			}else if (numberOfCredits >=60 && numberOfCredits <=89) {
				return "Junior";

			}else if (numberOfCredits >=90) {
				return "Senior";

			}else{
				return null;
			}
		}

	@Override
	public String toString() {
		return this.name + ": " + gpa;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Student) == false) return false;

		Student myStudentObj = (Student) obj;

			if (myStudentObj.name.equals(this.name)) {
				return true;
			} else {
				return false;
			}
		}



	/*getters and setters*/

	public double getGpa() { return gpa; }

	public void setGpa(double gpa) { this.gpa = gpa; }

	public static int getNextStudentId() { return nextStudentId; }

	public static void setNextStudentId(int nextStudentId) { Student.nextStudentId = nextStudentId; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getStudentId() { return studentId; }

	private void setStudentId(int studentId) { this.studentId = studentId; }

	public int getNumberOfCredits() { return numberOfCredits; }

	public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }
}

