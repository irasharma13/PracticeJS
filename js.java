import java.util.Scanner;
class vote
{
    public staic void main()
{
System.out.println("Enter Your Age");
int age=nextInt(System.in);
if(age<18)
{
    System.out.println("You cannot not Vote");
    System.out.println("Years remaining for you to vote"+(18-age) );
}
else
{
    System.out.println("You can Vote");
}
}
}