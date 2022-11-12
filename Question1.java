/*
  To print "This is Display()" n times Recursively
 */
class Question1 
{
  void display ()
  {
      System.out.println("This is Display()");
  }

  void calling(int n)
  { if( n == 0)
    System.out.println("Calling Finished");
    
    else
    {
      display();
      calling(--n);
    }
  }
    // Main Function to execute entire code
    public static void main(String[] args) {
        
     Question1 obj = new Question1();
      obj.calling(6); //  Passing n as 6 for instance
    }
}
