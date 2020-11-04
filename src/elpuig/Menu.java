package elpuig;

import java.util.Scanner;

public class Menu {
    public Scanner scanner = new Scanner(System.in);

    public void Menu() {

    }

    public void menuPrincipal() {
        System.out.println("##########################");
     //   System.out.println("#                        #");
        System.out.println("# CANTINA PUIG CASTELLAR #");
     //   System.out.println("#                        #");
        System.out.println("##########################");
        System.out.println("1. Dias de la semana");
        System.out.println("2. Telefono");
        System.out.println("3. Salir");
    }

    public static void main(String[] args) {
       Menu menu = new Menu();
       Dias dia = new Dias();
       Productos productos = new Productos();
       int in;

        menu.menuPrincipal();

        do {
       in = menu.scanner.nextInt();
            switch (in) {
                case 1:
                    dia.menuDias();
                    break;
                case 2:
                    System.out.println("Puedes llamar a: 936783212");
                    break;
                case 3:
                    //salir
                    break;
                case 4:
                    menu.menuPrincipal();
                    break;
            }
        }while (in != 3) ;

        do {
            in = menu.scanner.nextInt();
            switch (in) {
                case 1:
                    dia.lunes();
                    break;
                case 2:
                    dia.martes();
                    break;
                case 3:
                    dia.miercoles();
                    break;
                case 4:
                    dia.jueves();
                    break;
                case 5:
                    dia.viernes();
                    break;
                case 6:
                    menu.menuPrincipal();
                    break;
            }
        }while (in != 6) ;
    }
}

