package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    final Map<String, Integer> aMap = new HashMap<>();

    WordCounter count = new WordCounter(aMap);
    while (input.hasNext()){
      count.countWords(input);
    }

    final List list =new ArrayList(count.getCounts().size());
    list.addAll(aMap.entrySet());

    Collections.sort(list, new DescendingByCount());

    for(int i = 0; i < 10; i++){
      System.out.println(list.get(i));
    }
  }
}
