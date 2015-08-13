package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({App.class, AppTest.class})
public class AppTest {

  @Test
  public void test() {
    PowerMockito.mockStatic(App.class, Mockito.CALLS_REAL_METHODS);
    PowerMockito.when(App.load()).thenCallRealMethod();
    Assert.assertTrue(App.load());
  }

}
