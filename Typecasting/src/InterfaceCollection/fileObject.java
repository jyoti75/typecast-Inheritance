package InterfaceCollection;

public class fileObject
{
  //instance variable
private String filename;
private int filesize;
private String filetype;
private String directoryname;
private byte[] filecontent;//have to save it in directory--> dir/server1/Filecontentencrypted
//dir/100000/server100000
//a.txt-->has essay...content is placed in byte array-->filecontent
//a:char:16its
//byte takes 8 bits--> is compressed-->saves memory
//byte a1=(byte)a; (primitive typecasting)


fileObject(String filename, int filesize, String filetype,String directoryname, byte[] filecontent){
  
  this.filename=filename;
  this.filesize=filesize;
  this.directoryname=directoryname;
  this.filecontent=filecontent;
  
  
}


public String getFilename()
{
  return filename;
}


public void setFilename(String filename)
{
  this.filename = filename;
}


public int getFilesize()
{
  return filesize;
}


public void setFilesize(int filesize)
{
  this.filesize = filesize;
}


public String getFiletype()
{
  return filetype;
}


public void setFiletype(String filetype)
{
  this.filetype = filetype;
}


public String getDirectoryname()
{
  return directoryname;
}


public void setDirectoryname(String directoryname)
{
  this.directoryname = directoryname;
}


public byte[] getFilecontent()
{
  return filecontent;
}


public void setFilecontent(byte[] filecontent)
{
  this.filecontent = filecontent;
}




}



