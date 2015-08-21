package InterfaceCollection;

public class CommonCollection extends AbstractCollection implements GenericAlgorithm,abstractArray, encrypted
{
  //real logic for add

  
  @Override
  public Object Add(Object x) throws Exception
  {
    
  Put(x);
  return x;
  }
  
  @Override
  public void Put(Object x) throws Exception
  {
    
    //typecasting is done here
    fileObject file=(fileObject) x;
    //casting exception
    
    Integer c= (Integer) x;
    
  Object putarray[]= new Object[5];
  putarray[0]= x;
  
    
    
  }

  @Override
  public Object get(Object x) throws Exception
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public byte[] encode(fileObject x)
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public byte[] decode()
  {
    // TODO Auto-generated method stub
    return null;
  }

  
  
  
  
}
