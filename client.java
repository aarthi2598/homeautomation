import java.io.*;import java.net.*;public class fileserver1
{
public static void main(string args[])throws IOExceotion
{
socket s=null;BufferedReader b=null;try
{
b=s1.accept();system.out.println("connection frame"+c);
s=new BufferedReader(c.getoutputstream(),true);
}
catch(Exception u)
{
System.out.println("the file is received");
System.out.println("dont know host");system.exit(1);
}
while(
{
System.out.println("the content of file is");
System.out.println(inp);
System.out.println("the file is received successfully");
}
b.close();
s.close();
}
}

