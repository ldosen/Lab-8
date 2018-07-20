package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  private WordCounter fixture;
  private Map<String, Integer> testMap = new HashMap<>();

  @Before
  public void setUp() {
    fixture = new WordCounter(testMap);
  }

  @After
  public void tearDown() {
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertEquals(0, fixture.getCount("fire"));
  }

  @Test
  public void testGetCountNonEmpty() {
    final Iterator<String> i = Arrays.asList("fire", "run", "smoke", "fire", "fire", "run").iterator();
    fixture.countWords(i);
    assertEquals(3, fixture.getCount("fire"));
    assertEquals(1, fixture.getCount("smoke"));
    assertEquals(0, fixture.getCount("water"));
    assertEquals(0, fixture.getCount("ice"));
  }
}
