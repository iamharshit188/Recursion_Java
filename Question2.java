//   Perform dry run for following code Snippet
class Question2 
{
  public void wit(String n , int p)
{
    if(p<0)
  {
      System.out.println(" ");

    }
    else {
      System.out.println(n.charAt(p) + " . ");
      wit(n , p-1);
      System.out.println(n.charAt(p) + " _ ");
        
    }
  }
  public static void main(String[] args) {
    Question2 obj = new Question2();
    obj.wit("SOLAR" , 4);
  }
}
