package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void f() {
	  System.out.println("First");
	  Assert.assertTrue(false);
  }
}
