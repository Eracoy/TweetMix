import java.util.Dictionary;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.*;

//class WordTriple{
//  String[] keys;
//  ArrayList<String> matches;
//  
//  Random rand=new Random();
//  
//  public void WordTriple(String[] keys){
//    this.keys=keys;
//    matches=new ArrayList<String>();
//  }
//  
//  public void addMatch(String match){
//    matches.add(match);
//  }
//  
//  public String randomMatch(){
//    return matches.get(rand.nextInt(matches.size()));
//  }
//  
//  public String[] getKeys(){
//    return keys;
//  }
//  
//  public boolean equals(WordTriple t2){
//    return Arrays.equals(t2.getKeys(),keys);
//  }
//  
//}

public class Markov{
  public static void main(String[] args){
    MarkovGen testGen = new MarkovGen();
    testGen.addDatum("ask not what your country can do for you ask what you can do for your country");
    testGen.printDict();
    for(String s:testGen.nextNWords(100)){
      System.out.print(s+" ");
    }
  }
}





