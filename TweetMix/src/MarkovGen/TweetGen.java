import java.util.*;

//generates tweets from given datum of tweets
public class TweetGen{
  
  ArrayList<String> userHandles;//each of the handles referenced in the datum, with repeats
  ArrayList<String> hashtags;//all hashtags used by this user, with repeats
  
  MarkovGen generator;
  
  public TweetGen(String rawStringInput){
    
    final String[] rawTokens = rawStringInput.split(" ");
    String[] processedTokens = rawStringInput.split(" "); //tokens after filtering and replacing hashtags and handles
    
    for(int n=0; n<rawTokens.length; n++){
      String tok = rawTokens[n];
      if(tok.charAt(0)=='@'){//token is a handle
        userHandles.add(tok);
        processedTokens[n] = "_HANDLE_";
      }
      if(tok.charAt(0)=='#'){
        hashtags.add(tok);
        processedTokens[n] = "_HASHTAG_";
      }
    }
    
    generator = new MarkovGen();
    generator.addDatum(processedTokens);
  }
  
  public void print(){
    generator.printDict();
  }
  
}