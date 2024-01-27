class Person 
{ 
   private String name, address;
   
   public Person(String name, String address)
   {
      this.name = name;
      this.address = address;
   }
   
     public String getName() 
	 {
      return name;
   }
   
   public String getAddress()
   {
      return address;
   }
 
   public void setAddress(String address) 
   {
      this.address = address;
   }
   
    public String toString() 
   {
      return name + "(" + address + ")";
   }
}

class Student extends Person 
{
  
   private int numCourses;   
   private String[] courses; 
   private int[] grades;   
   private static final int MAX_COURSES = 30; 
   
   public Student(String name, String address) 
   {
      super(name, address);
      numCourses = 0;
      courses = new String[MAX_COURSES];
      grades = new int[MAX_COURSES];
   }
   
     public String toString()
	 {
      return "Student: " + super.toString();
   }
   
 
   public void addCourseGrade(String course, int grade)
   {
      courses[numCourses] = course;
      grades[numCourses] = grade;
      ++numCourses;
   }
   
    public void printGrades() 
	{
      System.out.print(this);
      for (int i = 0; i < numCourses; ++i)
		 {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
      System.out.println();
   }
   
   public double getAverageGrade() 
   {
      int sum = 0;
      for (int i = 0; i < numCourses; i++ )
		{
         sum += grades[i];
      }
      return (double)sum/numCourses;
   }
}

class Teacher extends Person 
{
  
   private int numCourses;   
   private String[] courses;
   private static final int MAX_COURSES = 5;
   
  
   public Teacher(String name, String address) 
   {
      super(name, address);
      numCourses = 0;
      courses = new String[MAX_COURSES];
   }
   
     public String toString() 
	 {
      return "Teacher: " + super.toString();
   }
   
   public boolean addCourse(String course) 
   {
      for (int i = 0; i < numCourses; i++) 
	  {
         if (courses[i].equals(course)) return false;
      }
      courses[numCourses] = course;
      numCourses++;
      return true;
   }
   
    public boolean removeCourse(String course) 
	{
      boolean found = false;
     int courseIndex = -1;  
      for (int i = 0; i < numCourses; i++) 
	  {
         if (courses[i].equals(course))
			 {
            courseIndex = i;
            found = true;
            break;
         }
      }
      if (found) 
	  {
         
         for (int i = courseIndex; i < numCourses-1; i++) 
		 {
            courses[i] = courses[i+1];
         }
         numCourses--;
         return true;
      } 
	  else 
	  {
         return false;
      }
   }
}

public class TestPerson
 {
   public static void main(String[] args) 
   {
      Student s1 = new Student("JIS univercity ->", "Avijit Das");
      s1.addCourseGrade("DBMS", 97);
      s1.addCourseGrade("JAVA", 68);
	  s1.addCourseGrade("PYTHON", 85);
      s1.printGrades();
      
      System.out.println("Graduate is => " + s1.getAverageGrade());
    
      Teacher t1 = new Teacher("Amitava Roy", "P.hd");
      System.out.println(t1);
	  
      String[] courses = {"C", "C++", "C#", "php", "UNIX shell programmming"};
      for (String course: courses) 
	  {
         if (t1.addCourse(course)) 
		 {
            System.out.println(course + " added");
         } 
		 else 
		 {
            System.out.println(course + " cannot be added");
         }
      }
    
      for (String course: courses) 
	  {
         if (t1.removeCourse(course))
			 {
            System.out.println(course + " removed");
         } 
		 else 
		 {
            System.out.println(course + " cannot be removed");
         }
      }
	  
	  
	  Student s2 = new Student("Kalyani univercity ->", "priyanka Roy");
      s2.addCourseGrade("DBMS", 95);
      s2.addCourseGrade("JAVA", 78);
	  s2.addCourseGrade("PYTHON", 89);
	  s2.addCourseGrade("Network programming", 92);
      s2.printGrades();
      
      System.out.println("post Graduate is => " + s2.getAverageGrade());
    
      Teacher t2 = new Teacher("Sourav Roy", "P.hd");
      System.out.println(t2);
     
      String[] Courses = {"C", "C++", "C#", "php", "UNIX shell programmming"};
      for (String course: courses) 
	  {
         if (t2.addCourse(course)) 
		 {
            System.out.println(course + " added");
         } 
		 else 
		 {
            System.out.println(course + " cannot be added");
         }
      }
    
      for (String course: courses) 
	  {
         if (t1.removeCourse(course))
			 {
            System.out.println(course + " removed");
         } 
		 else 
		 {
            System.out.println(course + " cannot be removed");
         }
      }
     
   }
}