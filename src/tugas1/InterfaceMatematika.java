/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public interface InterfaceMatematika {
    interface OperasiMatematika {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

class Matematika implements OperasiMatematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }
}

class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        System.out.println("Pertambahan : 20 + 10 = " + matematika.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian : 10 * 3 = " + matematika.perkalian(10, 3));
        System.out.println("Pembagian : 21 / 2 = " + matematika.pembagian(21, 2));
    }
}
}
