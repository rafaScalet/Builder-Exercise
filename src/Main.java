public class Main {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("You need to specify a option:");
      System.err.println("Ballem");
      System.err.println("Geeks");
      System.err.println("Medium");
      System.err.println("Refactor");
      return;
    }

    switch (args[0]) {
      case "Ballem":
        ballem.Main.main(args);
        break;
      case "Geeks":
        geeks.Main.main(args);
        break;
      case "Medium":
        medium.Main.main(args);
        break;
      case "Refactor":
        refactor.Main.main(args);
        break;
      default:
        System.err.println("Invalid Option");
        break;
    }
  }
}
