import java.util.*;

public class Menu {
    private Scanner scanner;
    private Conversion conversion;
    private My1DArray my1DArray;

    Menu() {
        this.scanner = new Scanner(System.in);
        this.conversion = new Conversion();
        this.my1DArray = new My1DArray();
    }

    public void displayMainMenu() {
        System.out.println("1: Show Conversion Menu");
        System.out.println("2: Show My1DArray Menu");
        System.out.println("0: Exit");

        processMainMenu();
    }

    public void displayConversionSubMenu() {
        System.out.println("1: Grams to Ounces");
        System.out.println("2: Ounces to Grams");
        System.out.println("3: Kilograms to Stone");
        System.out.println("4: Stone to Kilograms");
        System.out.println("5: Pounds to Grams");
        System.out.println("6: Grams to Pounds");
        System.out.println("9: Back");
        System.out.println("0: Exit");

        processConversions();
    }

    private void displayMy1DArraySubMenu() {
        System.out.println("1: Get Total");
        System.out.println("2: Get Average");
        System.out.println("3: Get Highest in Row");
        System.out.println("9: Back");
        System.out.println("0: Exit");

        processMy1DArray();
    }

    private void processMainMenu() {
        int val = getNavigationInput();
        while (true) {
            switch (val) {
                case 1:
                    System.out.println("Conversion Sub Menu");
                    displayConversionSubMenu();
                    break;
                case 2:
                    System.out.println("My1DArray Menu");
                    displayMy1DArraySubMenu();
                    break;
                case 0:
                    System.out.println("Exiting..");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! retry.");
            }
            val = getNavigationInput();
        }
    }

    private void processConversions() {
        int val = getNavigationInput();
        while (true) {
            switch (val) {
                case 1:
                    System.out.print("Grams to Ounces: ");
                    System.out.println("Ounces: " + this.conversion.GramToOuncnces(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 2:
                    System.out.print("Ounces to Grams: ");
                    System.out.println("Grams: " + this.conversion.OunceToGrams(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 3:
                    System.out.print("Kilograms to Stone: ");
                    System.out.println("Stones: " + this.conversion.KgToStone(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 4:
                    System.out.print("Stone to Kilograms: ");
                    System.out.println("Kilograms: " + this.conversion.StoneToKg(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 5:
                    System.out.print("Pounds to Grams: ");
                    System.out.println("Grams: " + this.conversion.PoundsToGram(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 6:
                    System.out.print("Grams to Pounds: ");
                    System.out.println("Pounds: " + this.conversion.GramToPound(getUserConversionValue()) + "\n");
                    displayConversionSubMenu();
                    break;
                case 9:
                    System.out.println("Main Menu");
                    displayMainMenu();
                case 0:
                    System.out.println("Exiting..");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! retry.");
            }
            val = getNavigationInput();
        }
    }

    private void processMy1DArray() {
        int val = getNavigationInput();
        while (true) {
            switch (val) {
                case 1:
                    System.out.print("Get Total: ");
                    ArrayList<Double> tmp = getInputs();
                    double[] arr = new double[tmp.size()];
                    int i = 0;
                    for (double value : tmp) {
                        arr[i] = value;
                        i++;
                    }
                    System.out.println("Total: " + my1DArray.getTotal(arr) + "\n");
                    displayMy1DArraySubMenu();
                    break;
                case 2:
                    System.out.print("Get Averages: ");
                    tmp = getInputs();
                    arr = new double[tmp.size()];
                    i = 0;
                    for (double value : tmp) {
                        arr[i] = value;
                        i++;
                    }
                    System.out.println("Average: " + my1DArray.getAverage(arr) + "\n");
                    displayMy1DArraySubMenu();
                    break;
                case 3:
                    System.out.print("Get Highest in row: ");
                    tmp = getInputs();
                    arr = new double[tmp.size()];
                    i = 0;
                    for (double value : tmp) {
                        arr[i] = value;
                        i++;
                    }
                    System.out.println("Highest Element: " + my1DArray.getHighestInRow(arr) + "\n");
                    displayMy1DArraySubMenu();
                    break;
                case 9:
                    System.out.println("Main Menu");
                    displayMainMenu();
                case 0:
                    System.out.println("Exiting..");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! retry.");
            }
            val = getNavigationInput();
        }
    }

    private double getUserConversionValue() {
        double val = 0;
        try {
            val =  Double.parseDouble(this.scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
        return val;
    }

    private int getNavigationInput(){
        int nav;
        try {
            nav = Integer.parseInt(this.scanner.next());
            return nav;
        }catch (NumberFormatException e) {
            return 99;
        }
    }

    private ArrayList<Double> getInputs() {
        System.out.println("Enter any number or E/e to end.");
        ArrayList<Double> values = new ArrayList<>();
        String temp;
        while (true) {
            System.out.print("> ");
            temp = this.scanner.next();
            try {
                values.add(Double.parseDouble(temp));
            } catch (NumberFormatException e) {
                if (temp.equals("E") || temp.equals("e")) {
                    break;
                } else {
                    System.out.println("Invalid Response.");
                }
            }
        }
        return values;
    }

}
