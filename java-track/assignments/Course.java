
public class Course {
	
         //instance variables - private: can only be accessed within a method (a form of encapsulation)
 	    // declared outside of method and values PERSIST after method returns.  Local values go away, but not instance variables.
 		//fields
 			
 		private String Name;
 		private int credits;
 		private int RemainingSeats;
 		//private int studentID;
 		private Student[] roster;
 		
 				 
 		//behaviors - will become methods
 		//Constructor - a special method
 		
 		//below:  not needed:
 		//private String babyFirstName;
 		//private String babyLastName;
 		//private int babyStudentID;
 		//private int babyCredits;
 		//private double babyGPA;
 		
 		
 		public Course (String Name, int credits, int RemainingSeats)

 		{
 			this.Name = Name;
 			this.credits = 0; //*** 0 credits ???
 			this.RemainingSeats = RemainingSeats;
 			//this.studentID = studentID;
 			//for (int i=0; i<Roster.length; i++){
 			//	Roster[i]=Student;
 			//Student[]roster = new Student[RemainingSeats];
 			this.roster = new Student[RemainingSeats];
 			}
 		//}
 		    
 		public String getName()
 	    {
 			return this.Name;
 		}
 		
 		public int getCredits()
 		{
 			return this.credits;
 		}
 		
 		public int getRemainingSeats()
 		{
 			return this.RemainingSeats;
 		}
 		
 		//public int getStudentID()
 		//{
 		//	return this.studentID;
 		//}
 		
 		public int setCredits()
 		{
 			this.credits = credits;
 			return this.credits;
 		}
 		
 		public Student[] getRoster()
 		{
 			//this.Roster = Roster;
 			return this.roster;
 		}
 		
 		
 		public boolean addStudent(Student a)
 		
 		{
 			boolean result = false;
 			
 			//First if statement:  Checks first index of roster array.  Should be empty; add student.  Subtract 1 seat from the roster.
 	 		//return true	
 			if(roster[0] == null)
 			{
 				result = true;
 				
 				//this.roster[0] = Student[RemainingSeats]; 
 				
 				this.RemainingSeats = this.RemainingSeats - 1;
 				roster[0]= a;  //this may be added, but not necessary
 				return result;
 			}
 		
 			//For loop:  If student's name is already on roster boolean result is false.
 		
 			for(int i = 0; i<roster.length; i++)
 			{
 				if(roster[i]!= null && roster[i] == a)
 				{
 					result = false;
 					//return result;
 				}
 			}
 			
 		  
 		  //For loop:  
 		  //for (int i=0; ihi
 				  //Roster.length; i++)
 			
 			
 			for(int j = 0; j<roster.length; j++)
			{
				if(roster[j] == null)
				{
					
					this.RemainingSeats = this.RemainingSeats - 1;
				//}
					roster[j]= a; //this may be added, but not necessary
					result = true;
					return result;
				}
			}
 			
 		  
 	 			//	Roster[i]=Student;
 			  //if(this.name == Roster.getName()) {
 				  
 			  //}
 			    //Student baby = new Student(babyFirstName, babyLastName, babyStudentID, babyGPA, 
 			    //Student nextstudent = new Student(String firstName, String lastName, int studentId);
 	 			//Roster = new Student[i];
 			
 			return result;
 		}
 		
 		
 		public String generateRoster()
 		{
 			String RosterList = "";
 			int rolllength = 0;
 			
 			for (int i =0; i<roster.length; i++)
 			{
 			if (roster[i]!= null) {
 				rolllength = rolllength + 1;
 			}
 			
 			for (int j =0; j<rolllength; j++)
 			{
 				RosterList = RosterList + roster[j].getName();
 			}
 			
 		}
 			return RosterList;		
}
 		public double averageGPA()
 		{
 			
 			double StudentGPA = 0.0;
 			int rolllength = 0;
 			
 			for (int i =0; i<roster.length; i++)
 			{
 			if (roster[i]!= null) {
 				rolllength = rolllength + 1;
 			}
 			}
 			for (int j =0; j<rolllength; j++)
 			{
 				StudentGPA = StudentGPA + roster[j].getGPA();
 			}
 			return (StudentGPA/rolllength);	
 		
 				
}
 		public String toString()
 		{
 			return "Course Name =" + this.Name + "Credits = " + this.credits;
 		}
}

     /*Test this code
    
 		/*public boolean addStudent (Student a)
 		{
 			for(int i = 0; i <this.roster.length; i ++)
 			{
 				if(this.roster[i]!= null)
 				{
 					if(this.roster[i].getName()==a.getName())
 					{
 						return false;
 					}
 				}
 		
     

 			}
 			if(remainingSeats >0){
 			*/




