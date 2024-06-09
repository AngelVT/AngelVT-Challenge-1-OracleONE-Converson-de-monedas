import models.Conversor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        boolean isRunning = true;
        boolean isInPresetMenu = false;
        Scanner userInput = new Scanner(System.in);
        Conversor conversor = new Conversor();
        float value;
        String target;
        String origin;

        String menu = """
                ***********************************************
                Enter the number od the desired option:
                1.- Make a preset conversion.
                2.- Make a custom conversion.
                3.- See history of conversions
                0.- exit
                ***********************************************
                """;
        String presetMenu = """
                ***********************************************
                Enter the number of the desired option:
                1.- Dollar (USD) ---> Argentine Peso (ARS).
                2.- Argentine Peso (ARS) --->  Dollar (USD).
                3.- Dollar (USD) --->  Brazilian Real (BRL).
                4.- Brazilian Real (BRL) --->  Dollar (USD).
                5.- Dollar (USD) --->  Colombian Peso (COP).
                6.- Colombian Peso (COP) --->  Dollar (USD).
                7.- Dollar (USD) --->  Mexican Peso (MXN).
                8.- Mexican Peso (MXN) --->  Dollar (USD).
                9.- Dollar (USD) --->  Bolivian Bolivar (BOB).
                10.- Bolivian Bolivar (BOB). (BOB) --->  Dollar (USD).
                11.- Dollar (USD) --->  Chilean Peso (CLP).
                12.- Chilean Peso (CLP) --->  Dollar (USD).
                0.- Back
                ***********************************************
                """;
        while (isRunning) {
            System.out.println(menu);

            try {
                option = userInput.nextInt();
            } catch (Exception e) {
                option = -1;
                userInput.nextLine();
            }


            switch (option) {
                case 1:
                    isInPresetMenu = true;
                    while(isInPresetMenu) {
                        System.out.println(presetMenu);


                        try {
                            option = userInput.nextInt();
                        } catch (Exception e) {
                            option = -1;
                            userInput.nextLine();
                        }

                        switch (option) {
                            case 1:
                                System.out.println("Enter value in USD");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> ARS
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "ARS"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 2:
                                System.out.println("Enter value in ARS");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f ARS ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "ARS", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 3:
                                System.out.println("Enter value in USD");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> BRL
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "BRL"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 4:
                                System.out.println("Enter value in BRL");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f BRL ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "BRL", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 5:
                                System.out.println("Enter value in USD");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> COP
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "COP"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 6:
                                System.out.println("Enter value in COP");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f COP ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "COP", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 7:
                                System.out.println("Enter value in USD");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> MXN
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "MXN"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 8:
                                System.out.println("Enter value in MXN");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f MXN ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "MXN", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 9:
                                System.out.println("Enter value in USD");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> BOB
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "BOB"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 10:
                                System.out.println("Enter value in BOB");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f BOB ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "BOB", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 11:
                                System.out.println("Enter value in USD");

                                value = userInput.nextFloat();

                                System.out.printf("Converting %f USD ---> CLP\n", value);
                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f USD ---> CLP
                                            """, value);

                                    System.out.println(conversor.convert(value, "USD", "CLP"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 12:
                                System.out.println("Enter value in CLP");

                                try {
                                    value = userInput.nextFloat();

                                    System.out.printf("""
                                            ***********************************************
                                            Converting %.2f CLP ---> USD
                                            """, value);

                                    System.out.println(conversor.convert(value, "CLP", "USD"));
                                    System.out.println("***********************************************");
                                    userInput.nextLine();
                                    System.out.println("Press ENTER to continue ...");
                                    userInput.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Error completing the conversion");
                                    userInput.nextLine();
                                }
                                break;

                            case 0:
                                isInPresetMenu = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                    break;

                case 2:
                    userInput.nextLine();
                    try {
                        System.out.println("Enter the code of the base currency: ");

                        origin = userInput.nextLine();

                        System.out.printf("Enter the value in %s:\n", origin);

                        value = userInput.nextFloat();

                        userInput.nextLine();
                        System.out.println("Enter the code of the target currency: ");

                        target = userInput.nextLine();

                        System.out.printf("""
                                            ***********************************************
                                            Converting %.2f %s ---> %s
                                            """, value, origin, target);

                        System.out.println(conversor.convert(value, origin, target));
                        System.out.println("***********************************************");
                        System.out.println("Press ENTER to continue ...");
                        userInput.nextLine();
                    } catch (Exception e) {
                        System.out.println("Error completing the conversion");
                    }
                    break;

                case 3:
                    try {
                        BufferedReader reader = null;
                        FileReader file = new FileReader("history.txt");
                        reader = new BufferedReader(file);
                        String linea;

                        System.out.println("**********************************************************************************************");
                        while ((linea = reader.readLine()) != null) {
                            System.out.println(linea);
                        }
                        System.out.println("**********************************************************************************************");

                        if (reader != null) {
                            reader.close();
                        }
                    } catch (Exception e) {
                        System.out.println("Error getting you conversion history");
                    }
                    break;

                case 0:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}