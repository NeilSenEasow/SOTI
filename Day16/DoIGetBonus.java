package Day16;

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;

public class DoIGetBonus {
    public static String bonusTime(final int salary, final boolean bonus) {
      int flag = 0;
      if(bonus) flag=1;
      String snew = "";
      if(flag == 1) {
          snew = String.valueOf(salary*10);
      }else{
          snew = String.valueOf(salary);
      }
      return "\u00A3"+snew;
  }
}

class BonusTimeTest {
    @Test
    public void basicTests() {
      boolean wellConfigured=unicodeTest();
      assertEquals((wellConfigured?"£":"\u00A3")+"100000",DoIGetBonus.bonusTime(10000, true));
      assertEquals((wellConfigured?"£":"\u00A3")+"250000",DoIGetBonus.bonusTime(25000, true));
      assertEquals((wellConfigured?"£":"\u00A3")+"10000",DoIGetBonus.bonusTime(10000, false));
      assertEquals((wellConfigured?"£":"\u00A3")+"60000",DoIGetBonus.bonusTime(60000, false));
      assertEquals((wellConfigured?"£":"\u00A3")+"20",DoIGetBonus.bonusTime(2, true));
      assertEquals((wellConfigured?"£":"\u00A3")+"78",DoIGetBonus.bonusTime(78, false));
      assertEquals((wellConfigured?"£":"\u00A3")+"678900",DoIGetBonus.bonusTime(67890, true));
    }
    
    private void assertEquals(String string, String bonusTime) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    public boolean unicodeTest(){
      System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
      System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
      return "\u00A3".equalsIgnoreCase("£");
    }
}