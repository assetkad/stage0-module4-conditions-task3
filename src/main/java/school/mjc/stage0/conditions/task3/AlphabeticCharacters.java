package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
  public void vowelDeterminer(char character) {
    char upperChar = Character.toUpperCase(character);
    if ((upperChar < 'A') || (upperChar > 'Z')) {
      System.out.println("wrong alphabet!");
    } else if ("AEIOU".indexOf(upperChar) != -1) {
      System.out.println("Vowel");
    } else {
      System.out.println("Consonant");
    }
  }
}
