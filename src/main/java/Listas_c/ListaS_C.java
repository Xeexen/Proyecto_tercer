package Listas_c;

import java.util.Scanner;

public class ListaS_C {

    public static class Nodo {

        int num;
        Nodo sig;
    }

    public static void main(String[] args) {

        int a;
        int n, m;
        String opcion;

        Scanner leer = new Scanner(System.in);

        Class_Acciones ac = new Class_Acciones();
        Nodo lista1 = null;
        Nodo lista2 = null;

        do {

            try {

                System.out.println("\n\nCon que tipo de lista desea trabajar? ");
                System.out.println("1. Lista Simple ");
                System.out.println("2. Lista Circular ");
                a = leer.nextInt();

                switch (a) {

                    case 1:

                        n = ac.IngresoN();
                        m = ac.IngresoM();

                        System.out.println("\nInsercion al Final");
                        lista1 = ac.InsercionFinal_LS(lista1, n, m);
                        ac.SalidaPantallaLS(lista1);

                        System.out.println("\nInsercion al Inicio");
                        lista2 = ac.InsercionInicio_LS(lista2, n, m);
                        ac.SalidaPantallaLS(lista2);

                        System.out.println("\n------------------------------------------------------");

                        System.out.println("Eliminar el 1er elemento de la Lista:  ");
                        Nodo top = lista1;
                        lista1 = ac.EliminarPrimero_LS(top);
                        ac.SalidaPantallaLS(lista1);

                        System.out.println("\nEliminar el último elemento de la Lista: ");
                        Nodo temp1 = lista1;
                        top = lista1;
                        lista1 = ac.EliminarUltimo_LS(temp1, top);
                        ac.SalidaPantallaLS(lista1);

                        System.out.println("\nModificar el penúltimo elemento de la Lista: ");
                        top = lista1;
                        lista1 = ac.ModificarPenultimo_LS(temp1, top);
                        ac.SalidaPantallaLS(lista1);

                        System.out.println("\nModificar el elemento de la mitad de la Lista: ");
                        top = lista1;
                        lista1 = ac.ModifcarMitad_LS(temp1, top);
                        ac.SalidaPantallaLS(lista1);
                        break;

                    case 2:

                        n = ac.IngresoN();
                        m = ac.IngresoM();

                        System.out.println("\nInsercion al Final");
                        lista1 = ac.InsercionFinal_LC(lista1, n, m);
                        ac.SalidaPantallaLC(lista1);

                        System.out.println("\nInsercion al Inicio");
                        lista2 = ac.InsercionInicio_LC(lista2, n, m);
                        ac.SalidaPantallaLC(lista2);

                        System.out.println("\n------------------------------------------------------");

                        System.out.println("Eliminar el 1er elemento de la Lista:  ");
                        top = lista1;
                        temp1 = lista1;
                        lista1 = ac.EliminarPrimero_LC(temp1, top);
                        ac.SalidaPantallaLC(lista1);

                        System.out.println("\nEliminar el último elemento de la Lista: ");
                        temp1 = lista1;
                        top = lista1;
                        lista1 = ac.EliminarUltimo_LC(temp1, top);
                        ac.SalidaPantallaLC(lista1);

                        System.out.println("\nModificar el elemento de la mitad de la Lista: ");
                        top = lista1;
                        lista1 = ac.ModifcarMitad_LC(temp1, top);
                        ac.SalidaPantallaLC(lista1);

                        break;

                    default:

                        System.out.println("Opcion incorrecta!!");
                        break;
                }

            } catch (Exception e) {

                System.out.print("Error");

            }

            System.out.println("\n--------------------------------------");

            System.out.print("Desea realizar otra accion? Si/No: ");

            opcion = leer.next();

        } while (opcion.equals("Si") || opcion.equals("si"));

    }

}
