
public class Student {
        //instance variables - private: can only be accessed within a method (a form of encapsulation)
	    // declared outside of method and values PERSIST after method returns.  Local values go away, but not instance variables.
		//fields
			
		private String firstName;
		private String lastName;
		private int studentID;
		private int credits;
		private double GPA;
				
		//behaviors - will become methods
		//Constructor - a special method
		
		//below:  not needed:
		//private String babyFirstName;
		//private String babyLastName;
		//private int babyStudentID;
		//private int babyCredits;
		//private double babyGPA;
		
		
		public Student(String firstName, String lastName, int studentId)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.studentID = studentId;
			this.credits = 0;
		    this.GPA = 0.0;
		}
		public Student(String firstName, String lastName, int studentId, double GPA, int credits)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.studentID = studentId;
			this.credits = credits;
		    this.GPA = GPA;
		}
		/*public Student(String babyFirstName, String babyLastName, int babyStudentId,int babyCredits,int babyGPA)
		
		{
			this.babyFirstName = babyFirstName;
			this.babyLastName = babyLastName;
			this.babyStudentID = babyStudentId;
			this.babyCredits = 0;
		    this.babyGPA = 0.0;
		}			
	*/
		public String getName()
	    {
			return this.firstName + " " + this.lastName;
		}
		
		public int getStudentID()
		{
			return this.studentID;
		}
		
		public double getGPA()
		{
			return this.GPA;
		}
		
		public int getCredits()
		{
			return this.credits;
		}
		
		public double setGPA(int GPA)
		{
			this.GPA = GPA;
			return this.GPA;
		}
		
		public int setCredits(int credits)
		{
			this.credits = credits;
			return this.credits;
		}
				
		public String toString()
		{
			return this.firstName + this.lastName + this.studentID;
		}

		public String getClassStanding()
		{
			String classStanding ="";
			if (this.credits < 30) {
				classStanding = "Freshman";
			}
			
			else if (this.credits < 60) {
				classStanding = "Sophomore";
			}	
			
			else if (this.credits < 90) {
				classStanding = "Junior";
			}
			
			else {
				classStanding = "Senior";
			}
					
		return classStanding;
		}
		
	
		public double submitGrade(double grade, int credits)
		{		
				
			double QS = grade * credits; //calc QS using parameters passed in **
		
			double QSTot = this.GPA * this.credits;
			//int creditsTot = this.credits + credits;
			double QSnew = QS + QSTot;
			this.credits = credits + this.credits;	
			this.GPA = QSnew/this.credits;	
			this.GPA = (double)Math.round((GPA)*1000.0)/1000.0;
				
		    return this.GPA;
		}

		public double computeTuition()
		{
			double cost = (this.credits/15) * 20000 ;
			double costLeftoverCredits = (this.credits % 15) *1333.33;
			double costTot = cost + costLeftoverCredits;
			return costTot;
		}
		
	
        public Student createLegacy(Student mom, Student dad)
        {
        	int babyCredits = 0;
    		
        	//int grade;
			//babyFirstName = mom.firstName + mom.lastName;
			String babyFirstName = mom.getName();
			String babyLastName = dad.getName();
			int babyStudentID = mom.studentID + dad.studentID;
			if(dad.credits > mom.credits){
				babyCredits = dad.credits;
			}
			else{
				babyCredits = mom.credits;
			}
			//this.kidCredits = 0;
		    //this.babyGPA = (mom.submitGrade(grade, credits) + dad.submitGrade(double grade, credits))/2;
			//this.classStanding = "";
			//this.qualityScore = 0.0;
			//this.grade = 0;
			//this.creditsTot = 0;
		    //return this.kidFirstName + this.kidLastName;\
			
			//comment TEST,
			double babyGPA = (mom.getGPA() + dad.getGPA())/2;
		    Student baby = new Student(babyFirstName, babyLastName, babyStudentID, babyGPA, babyCredits);
		    System.out.println(baby);
		    return baby;
		    
		}
      
       
}



