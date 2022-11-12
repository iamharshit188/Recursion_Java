// Perform dry run for the following Code Snippet
class Question4
{
    int number(int n)
    {
        if(n>0)
        {
            System.out.println( n + " ");
            number(n-2);
            System.out.println(n + " ");
        }
        System.out.println(" ");
        return 0;
    }

    public static void main(String[] args) {
        Question4 obj = new Question4();
        obj.number(5);

    }
}