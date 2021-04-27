public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    int length = lastName.length();
    for(int i = 0; i < nameArray.length; i++){
      for(int j = 0; j < nameArray[i].length; j++){
        if(nameArray[i][j].substring(0,length).equals(lastName)){
          count++;
        }
      }
    }
    return count;
  }
}