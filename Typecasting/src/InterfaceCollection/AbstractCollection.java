package InterfaceCollection;
//have to override
public abstract  class AbstractCollection implements Collection
{

  @Override
  public Object Add(Object x) throws Exception
  {
    
    throw new Exception();
  }
  
  
  //or it can be made abstract--

  @Override
  public Object Search(Object x) throws Exception
  {
   throw new Exception();
  }

  @Override
  public Object Remove(Object x) throws Exception
  {
   throw new Exception();
   
  }

}
