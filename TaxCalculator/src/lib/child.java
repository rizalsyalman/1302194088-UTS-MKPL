package lib;

public class child{
  private List <String> childNames;
  private List <String> childIdNumbers;
  
  public child(){
    
  }
  
  public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
} 
