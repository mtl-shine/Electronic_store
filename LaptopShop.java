import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopShop {
        static Laptop l1 = new Laptop("Acer", "Aspire", "A515-57-53QH", 16,
                        512, "SSD", "Intel Core i5", "Intel UHD Graphics",
                        "Windows 11 Home", 15.6, 48, "Gray",
                        1.76, 20, 63_000);
        static Laptop l2 = new Laptop("Acer", "Nitro", "AN515-57-57SB", 16,
                        512, "SSD", "Intel Core i5", "NVIDIA GeForce RTX 3060",
                        "Windows 11 Home", 15.6, 57, "Black",
                        2.2, 15, 79_000);
        static Laptop l3 = new Laptop("Acer", "Predator Triton", "AS525-57-54QV", 32,
                        1024, "SSD", "Intel Core Ultra 7", "NVIDIA GeForce RTX 4060",
                        "Linux", 17.3, 50, "Silver",
                        2.05, 10, 200_000);
        static Laptop l4 = new Laptop("HP", "N4120", "HA818-XWO-617-PP", 8,
                        512, "SSD", "Intel Celeron", "Intel UHD 600",
                        "Windows 11 Pro", 15.6, 40, "Black",
                        2.2, 15, 40_000);
        static Laptop l5 = new Laptop("HP", "ENVY 17-CW", "HP718-XQR-620-HD", 64,
                        1024, "SSD", "Intel Core i7", "NVIDIA GeForce RTX 3060",
                        "Windows 11 Pro", 17.3, 60, "Silver",
                        2.4, 30, 190_000);
        static Laptop l6 = new Laptop("Asus", "VivoBook X170", "AS724-PRH-180-HD", 16,
                        512, "SSD", "Intel Core i7", "Intel Iris Xe",
                        "Windows 11 Pro", 17.3, 50, "Blue",
                        2.1, 23, 80_000);
        static Laptop l7 = new Laptop("Asus", "ROG Zephyrus G16", "ASB34-PDH-187-QD", 32,
                        1024, "SSD", "Intel Core Ultra 9", "NVIDIA GeForce RTX 4070",
                        "Windows 11 Home", 16, 90, "Gray",
                        1.85, 26, 250_000);
        static Laptop l8 = new Laptop("Apple", "MacBook Air", "AP232-89R-TH15", 8,
                        256, "SSD", "Apple M1", "Apple M1",
                        "macOS", 13.3, 50, "Gold",
                        1.29, 11, 90_000);
        static Laptop l9 = new Laptop("Apple", "MacBook Pro", "APHQ2-2023-HES28", 18,
                        512, "SSD", "Apple M3 Pro", "Apple M3 Pro",
                        "macOS", 16, 100, "Black",
                        2.16, 10, 300_000);
        static Laptop l10 = new Laptop("Lenovo", "U300", "LE814-H24-PM22", 24,
                        1024, "SSD", "Intel U300", "Intel UHD Graphics",
                        "Windows 11 Pro", 17.3, 60, "White",
                        2.04, 18, 54_000);
        static Laptop l11 = new Laptop("Lenovo", "U300", "LE814-H24-PM22", 24,
                        1024, "SSD", "Intel U300", "Intel UHD Graphics",
                        "Windows 11 Pro", 17.3, 60, "White",
                        2.04, 18, 54_000); // повторяющийся экземпляр для проверки equals

        static Set<Laptop> laptops = new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11));

        public static void main(String[] args) {
                LaptopShop.showFilteredLaptops();
        }

        public static void showFilteredLaptops() {
                Map<String, String[]> filters = new HashMap<>();
                filters.put("brand", new String[] { "Acer", "HP", "Asus", "Apple", "Lenovo" });
                filters.put("ram", new String[] { "8" });
                filters.put("storage", new String[] { "256" });
                filters.put("display diagonal", new String[] { "13.3" });
                filters.put("color", new String[] { "Gray", "Black", "Silver", "Blue", "Gold", "White" });
                filters.put("price", new String[] { "40 000" });
                Set<Laptop> filteredLaptops = new HashSet<>(laptops);
                System.out.println("Welcome to our Laptop Shop!");
                boolean flag = true;
                Scanner scanner = new Scanner(System.in, "ibm866");
                while (flag) {
                        System.out.println("Would you like to add filter?\n1 - Yes\n2 - No");
                        String choice = scanner.nextLine();
                        try {
                                if (Integer.parseInt(choice) == 2) {
                                        if (filteredLaptops.isEmpty()) {
                                                System.out.println(
                                                                "\nUnfortunately, we did not find laptops that match chosen characteristics.\n");
                                        } else {
                                                System.out.println(
                                                                "\nGreat, let's have a look at what we have here:\n");
                                                for (Laptop laptop : filteredLaptops) {
                                                        System.out.println(laptop);
                                                }
                                        }
                                        flag = false;
                                } else {
                                        System.out.println(
                                                        "Please, enter the number of feature by which you would like to filter products:");
                                        System.out.println(
                                                        "1 - Brand\n2 - RAM\n3 - Storage\n4 - Display diagonal\n5 - Color\n6 - Price");
                                        choice = scanner.nextLine();
                                        try {
                                                if (Integer.parseInt(choice) == 1) {
                                                        System.out.println(
                                                                        "Please, enter the brand or the brands separated by commas:");
                                                        System.out.println(
                                                                        "Available brands are:\nAcer\nHP\nAsus\nApple\nLenovo");
                                                        choice = scanner.nextLine();
                                                        choice = choice.replaceAll(" ", "");
                                                        String[] brands = choice.split(",");
                                                        filters.put("brand", brands);
                                                        for (Laptop l : laptops) {
                                                                boolean check = false;
                                                                for (String brand : filters.get("brand")) {
                                                                        if (l.getBrand().equalsIgnoreCase(brand)) {
                                                                                check = true;
                                                                        }
                                                                }
                                                                if (check == false) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                } else if (Integer.parseInt(choice) == 2) {
                                                        System.out.println("Please, enter lower limit of RAM:");
                                                        System.out.println("Available values are between 8-64 GB");
                                                        choice = scanner.nextLine();
                                                        filters.put("ram", new String[] { choice });
                                                        for (Laptop l : laptops) {
                                                                if (l.getRam() < Integer.parseInt(choice)) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                } else if (Integer.parseInt(choice) == 3) {
                                                        System.out.println(
                                                                        "Please, enter lower limit of storage space:");
                                                        System.out.println("Available values are between 256-1024 GB");
                                                        choice = scanner.nextLine();
                                                        filters.put("storage", new String[] { choice });
                                                        for (Laptop l : laptops) {
                                                                if (l.getStorage() < Integer.parseInt(choice)) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                } else if (Integer.parseInt(choice) == 4) {
                                                        System.out.println(
                                                                        "Please, enter lower limit of display diagonal:");
                                                        System.out.println(
                                                                        "Available values are between 13,3\"-17,3\"");
                                                        choice = scanner.nextLine();
                                                        choice = choice.replaceAll(",", ".");
                                                        filters.put("display diagonal", new String[] { choice });
                                                        for (Laptop l : laptops) {
                                                                if (l.getDispDiagonal() < Double.parseDouble(choice)) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                } else if (Integer.parseInt(choice) == 5) {
                                                        System.out.println(
                                                                        "Please, enter the color or the colors separated by commas:");
                                                        System.out.println(
                                                                        "Available colors are:\nGray\nBlack\nSilver\nBlue\nGold\nWhite");
                                                        choice = scanner.nextLine();
                                                        String[] colors = choice.split(",");
                                                        filters.put("color", colors);
                                                        for (Laptop l : laptops) {
                                                                boolean check = false;
                                                                for (String color : filters.get("color")) {
                                                                        if (l.getColor().equalsIgnoreCase(color)) {
                                                                                check = true;
                                                                        }
                                                                }
                                                                if (check == false) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                } else if (Integer.parseInt(choice) == 6) {
                                                        System.out.println("Please, enter lower price limit:");
                                                        System.out.println(
                                                                        "Available values are between 40 000-300 000 RUB");
                                                        choice = scanner.nextLine();
                                                        choice = choice.replaceAll("[^Z0-9]", "");
                                                        filters.put("price", new String[] { choice });
                                                        for (Laptop l : laptops) {
                                                                if (l.getPrice() < Integer.parseInt(choice)) {
                                                                        filteredLaptops.remove(l);
                                                                }
                                                        }
                                                }
                                        } catch (Exception e) {
                                                System.out.println(
                                                                "It seems like you entered an invalid request.\nPlease, try once again\n");
                                        }
                                }
                        } catch (Exception e) {
                                System.out.println(
                                                "It seems like you entered an invalid request.\nPlease, try once again\n");
                        }

                }
                scanner.close();
        }
}
