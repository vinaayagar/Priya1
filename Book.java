class Book
{
String title;
String author;

public static void main(String[] args)
{
Book [] mybook = new Book[3];
int x=0;

mybook[0]=new Book();
mybook[1]=new Book();
mybook[2]=new Book();

mybook[0].title="The grapes of Java";
mybook[1].title="The Java Gatsby";
mybook[2].title="The Java Cookbook";

mybook[0].author="bob";
mybook[1].author="sue";
mybook[2].author="ian";

while(x<3)
{
System.out.println(mybook[x].title);
System.out.println( " by " );
System.out.println(mybook[x].author);
x=x+1;
}
}
}
