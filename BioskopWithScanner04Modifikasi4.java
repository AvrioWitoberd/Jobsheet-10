import java.util.Scanner;

public class BioskopWithScanner04Modifikasi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi ini sudah terisi oleh penonton lain. Silakan pilih kursi yang lain.");
                            } else {
                                break; 
                            }
                        } else {
                            System.out.println("Posisi tidak valid. Silakan masukkan baris 1-4 dan kolom 1-2.");
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil ditambahkan.");

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        String namaPenonton = penonton[i][j];
                        System.out.println("Baris " + (i + 1) + ", Kolom " +  (j + 1) + ": " +(namaPenonton != null ? namaPenonton : "***"));
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("Program berakhir.");
                break;
                
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu 1-3.");
            }
        }
        
        sc.close();
    }
}
