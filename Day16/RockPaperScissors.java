package Day16;

public class RockPaperScissors {
        public static String rps(String p1, String p2) {
      
      String player1 = "Player 1 won!";
      String player2 = "Player 2 won!";
      String both = "Draw!";
    
      if(p1.equals("rock") && p2.equals("scissors"))  {
          return player1;
      }else if(p1.equals("rock") && p2.equals("paper")) {
          return player2;
      }else if(p1.equals("paper") && p2.equals("rock")) {
          return player1;
      }else if(p1.equals("paper") && p2.equals("scissors")) {
          return player2;
      }else if(p1.equals("scissors") && p2.equals("paper")) {
          return player1;
      }else if(p1.equals("scissors") && p2.equals("rock"))  {
          return player2;
      }else {
          return both;
      }
    
  }
}

// import static org.junit.Assert.*;
// import org.junit.Test;

class Kata {
    
    public static String rps(String p1, String p2) {
        return RockPaperScissors.rps(p1, p2);
    }
}

class KataTest {
    
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
    }
    private void assertEquals(String string, String rps) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata.rps("paper", "paper"));
        assertEquals("Draw!", Kata.rps("rock", "rock"));
    }
    
}