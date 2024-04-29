import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LaptopShop {
        public static void main(String[] args) {
                Laptop l1 = new Laptop("Acer", "Aspire", "A515-57-53QH", 16,
                                512, "SSD", "Intel Core i5", "Intel UHD Graphics",
                                "Windows 11 Home", 15.6, 48, "Gray",
                                1.76, 20, 63_000);
                Laptop l2 = new Laptop("Acer", "Nitro", "AN515-57-57SB", 16,
                                512, "SSD", "Intel Core i5", "NVIDIA GeForce RTX 3060",
                                "Windows 11 Home", 15.6, 57, "Black",
                                2.2, 15, 79_000);
                Laptop l3 = new Laptop("Acer", "Predator Triton", "AS525-57-54QV", 32,
                                1024, "SSD", "Intel Core Ultra 7", "NVIDIA GeForce RTX 4060",
                                "Linux", 17.3, 50, "Silver",
                                2.05, 10, 200_000);
                Laptop l4 = new Laptop("HP", "N4120", "HA818-XWO-617-PP", 8,
                                512, "SSD", "Intel Celeron", "Intel UHD 600",
                                "Windows 11 Pro", 15.6, 40, "Black",
                                2.2, 15, 40_000);
                Laptop l5 = new Laptop("HP", "ENVY 17-CW", "HP718-XQR-620-HD", 64,
                                1024, "SSD", "Intel Core i7", "NVIDIA GeForce RTX 3060",
                                "Windows 11 Pro", 17.3, 60, "Silver",
                                2.4, 30, 190_000);
                Laptop l6 = new Laptop("Asus", "VivoBook X170", "AS724-PRH-180-HD", 16,
                                512, "SSD", "Intel Core i7", "Intel Iris Xe",
                                "Windows 11 Pro", 17.3, 50, "Blue",
                                2.1, 23, 80_000);
                Laptop l7 = new Laptop("Asus", "ROG Zephyrus G16", "ASB34-PDH-187-QD", 32,
                                1024, "SSD", "Intel Core Ultra 9", "NVIDIA GeForce RTX 4070",
                                "Windows 11 Home", 16, 90, "Gray",
                                1.85, 26, 250_000);
                Laptop l8 = new Laptop("Apple", "MacBook Air", "AP232-89R-TH15", 8,
                                256, "SSD", "Apple M1", "Apple M1",
                                "macOS", 13.3, 50, "Gold",
                                1.29, 11, 90_000);
                Laptop l9 = new Laptop("Apple", "MacBook Pro", "APHQ2-2023-HES28", 18,
                                512, "SSD", "Apple M3 Pro", "Apple M3 Pro",
                                "macOS", 16, 100, "Black",
                                2.16, 10, 300_000);
                Laptop l10 = new Laptop("Lenovo", "U300", "LE814-H24-PM22", 24,
                                1024, "SSD", "Intel U300", "Intel UHD Graphics",
                                "Windows 11 Pro", 17.3, 60, "White",
                                2.04, 18, 54_000);
                Laptop l11 = new Laptop("Lenovo", "U300", "LE814-H24-PM22", 24,
                                1024, "SSD", "Intel U300", "Intel UHD Graphics",
                                "Windows 11 Pro", 17.3, 60, "White",
                                2.04, 18, 54_000);

                Set<Laptop> laptops = new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11));

                for (Laptop laptop : laptops) {
                        System.out.println(laptop);
                }
        }
}
