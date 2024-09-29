import java.util.Scanner;

public class DILAXPLOIT {
    
    // Fungsi untuk menampilkan menu utama
    public static void showMenu() {
        System.out.println("======================================");
        System.out.println("               DILAXPLOIT             ");
        System.out.println("======================================");
        System.out.println("1. Single Dork SQL Injection");
        System.out.println("2. Mass Dork SQL Injection");
        System.out.println("3. Custom Dork SQL Injection");
        System.out.println("======================================");
        System.out.print("Pilih opsi (1, 2, atau 3): ");
    }
    
    // Fungsi untuk melakukan scanning berdasarkan Dork
    public static void scanDork(String dork) {
        System.out.println("\nMemindai web yang rentan menggunakan: " + dork);
        System.out.println("--------------------------------------");
        
        // Simulasi hasil pencarian (biasanya, pemrograman ini akan menggunakan modul pencarian)
        System.out.println("| No | URL                           | Status  |");
        System.out.println("|----|-------------------------------|---------|");
        System.out.println("| 1  | http://example.com/vuln1       | VULNERABLE |");
        System.out.println("| 2  | http://example.com/vuln2       | VULNERABLE |");
        System.out.println("| 3  | http://example.com/vuln3       | SAFE     |");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        // Menampilkan menu utama
        showMenu();
        
        choice = scanner.nextLine();
        
        // Pilihan Dork berdasarkan nomor
        switch (choice) {
            case "1":
                scanDork("Single Dork SQL Injection");
                break;
            case "2":
                scanDork("Mass Dork SQL Injection");
                break;
            case "3":
                scanDork("Custom Dork SQL Injection");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }
}