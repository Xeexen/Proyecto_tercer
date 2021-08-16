package Listas_c;

import Listas_c.ListaS_C.Nodo;

import java.util.Scanner;

class Class_Acciones {

    public int IngresoN() {
        int valor;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese N elementos #: ");
            valor = leer.nextInt();
            if (valor <= 0) {
                System.out.println("Tiene que se > 0");
            }
        } while (valor <= 0);

        return valor;
    }

    public int IngresoM() {
        int valor;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese M multiplo #: ");
            valor = leer.nextInt();
            if (valor <= 0) {
                System.out.println("Tiene que se > 0");
            }
        } while (valor <= 0);

        return valor;
    }

    public Nodo InsercionFinal_LC(Nodo top, int n, int m) {

        Nodo ultimo = top;
        for (int i = 1; i <= n; i++) {
            Nodo temp = new Nodo();
            temp.num = i * m;
            if (top == null) // 1er nodo
            {
                temp.sig = temp;
                top = temp;
            } else // n-1 casos
            {
                temp.sig = top;
                ultimo.sig = temp;
            }
            ultimo = temp;
        }
        return top;
    }

    public Nodo InsercionInicio_LC(Nodo top, int n, int m) {
        Nodo fin = top;
        for (int i = 1; i <= n; i++) {
            Nodo temp = new Nodo();
            temp.num = i * m;
            if (top == null) // 1er nodo
            {
                temp.sig = temp;
                fin = temp;
            } else // n-1 casos
            {
                temp.sig = top;
                fin.sig = temp;
            }
            top = temp;
        }
        return top;
    }

    public Nodo InsercionFinal_LS(Nodo top, int n, int m) {

        Nodo ultimo = top;
        for (int i = 1; i <= n; i++) {
            Nodo temp = new Nodo();
            // temp.num = new Random().nextInt(100);
            temp.num = i * m;
            temp.sig = null;
            if (top == null) // 1er nodo
            {
                top = temp;
            } else // n-1 casos
            {
                ultimo.sig = temp;
            }
            ultimo = temp;
        }
        return top;
    }

    public Nodo InsercionInicio_LS(Nodo top, int n, int m) {

        for (int i = 1; i <= n; i++) {
            Nodo temp = new Nodo();
            // temp.num = new Random().nextInt(100);
            temp.num = i * m;
            if (top == null) // 1er nodo
            {
                temp.sig = null;
            } else // n-1 casos
            {
                temp.sig = top;
            }
            top = temp;
        }
        return top;
    }

    public void SalidaPantallaLC(Nodo top) {
        Nodo temp1 = top;
        do {
            System.out.print(temp1.num + ", ");
            temp1 = temp1.sig;
        } while (temp1 != top);
    }

    public void SalidaPantallaLS(Nodo temp1) {
        while (temp1 != null) {
            System.out.print(temp1.num + ", ");
            temp1 = temp1.sig;
        }
    }

    Nodo ultimo;

    public Nodo ObtenerUltimo() {
        return ultimo;
    }

    public Nodo EliminarPrimero_LS(Nodo top) {
        top = top.sig;
        return top;
    }

    public Nodo EliminarUltimo_LS(Nodo temp1, Nodo top) {

        temp1 = top;
        ultimo = top;
        while (temp1.sig != null) {
            ultimo = temp1;
            temp1 = temp1.sig;
        }
        ultimo.sig = null;
        return top;
    }

    public Nodo EliminarPrimero_LC(Nodo temp1, Nodo top) {
        Nodo fin = new Nodo();
        temp1 = top;
        fin = temp1;
        do {
            fin = fin.sig;
        } while (fin.sig != temp1);
        top = top.sig;
        fin.sig = top;

        return top;
    }

    public Nodo EliminarUltimo_LC(Nodo temp1, Nodo top) {

        temp1 = top;
        ultimo = top;
        do {
            ultimo = temp1;
            temp1 = temp1.sig;
        } while (temp1.sig != top);
        ultimo.sig = top;
        return top;

    }

    public Nodo ModificarPenultimo_LS(Nodo temp1, Nodo top) {

        temp1 = top;
        while (temp1.sig.sig != null) {
            temp1 = temp1.sig;
        }
        temp1.num = 999;

        return top;

    }

    public Nodo ModifcarMitad_LS(Nodo temp1, Nodo top) {
        temp1 = top;
        int cont = 0;
        while (temp1 != null) {
            cont++;
            temp1 = temp1.sig;
        }
        int mitad = Math.round(cont / 2);
        temp1 = top;
        for (int i = 1; i <= mitad; i++) {
            temp1 = temp1.sig;
        }
        temp1.num = 999;

        return top;

    }

    public Nodo ModifcarMitad_LC(Nodo temp1, Nodo top) {

        temp1 = top;
        int cont = 0;
        do {
            cont++;
            temp1 = temp1.sig;
        } while (temp1 != top);
        int mitad = Math.round(cont / 2);
        temp1 = top;
        for (int i = 1; i <= mitad; i++) {
            temp1 = temp1.sig;
        }
        temp1.num = 999;
        return top;

    }
}
