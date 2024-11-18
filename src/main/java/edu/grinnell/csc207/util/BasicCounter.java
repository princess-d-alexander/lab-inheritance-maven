package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
      // Fields
      protected int count;
      protected int start;
  
      // Constructor
      public BasicCounter(int start) {
          this.start = start;
          this.count = start;
      } //BasicCounter
  
      // Method to increment count by 1
      public void increment() {
          count++;
      } // Increment
  
      // Method to reset count to the start value
      public void reset() {
          count = start;
      } // Reset
  
      // Method to return the current count as a string
      public String toString() {
          return "[" + this.count + "]";
      } // toString
  
      // Method to get the current value of count
      public int get() {
          return count;
      } // Get
  } // Basic Counter
