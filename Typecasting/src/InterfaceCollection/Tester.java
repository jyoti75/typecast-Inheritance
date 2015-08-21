package InterfaceCollection;

public class Tester
{
public static void main(String[] args)
{
  String filename="a.txt";
  String filetype="text type";
  int filesize=1000;
  byte[]filecontent= new byte[100];
  String Directoryname="C://Client1";
  
  fileObject file= new fileObject(filename, filesize,filetype,Directoryname,filecontent );
  CommonCollection collection= new CommonCollection();
  int one=1;
  Integer x= new Integer(one);
 
  
  try
  {
    // please this method cannot called with parameter Integer 
    
    collection.Put(x);
  }
  catch (Exception e)
  {
    System.out.println("i am catched");
  }

  
  
  
  
  
}
}
