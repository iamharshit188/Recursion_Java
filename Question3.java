// Perform dry run for the following Code Snippet
class Question3
{
  int cal(int a ,  int b)
{
    if( b == 1 )
    return a ;
    else 
    return a + cal(a , b-1) ;
  }
  public static void main(String[] args) {
    Question3 obj = new Question3();
    obj.cal(4 , 5);
  }
}

