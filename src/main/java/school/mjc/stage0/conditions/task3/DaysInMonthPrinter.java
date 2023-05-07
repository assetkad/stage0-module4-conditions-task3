package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
  public void amountOfDays(int month) {
    switch (month) {
      case 6:
        System.out.println(30);
        break;
      case 2:
        System.out.println(28);
        break;
      default:
        System.out.println("wrong number!");
        break;
    }
  }
}
