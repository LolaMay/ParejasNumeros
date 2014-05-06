package parejasnumeros;

public class Matriz {

    int filas;
    int columnas;
    int matriz[][];
    
    Matriz(int filas, int columnas)
    {
        this.filas=filas;
        this.columnas=columnas;
        matriz = new int[filas][columnas];
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    public int getMatriz(int fila, int columna)
    {
       return this.matriz[fila][columna]; 
    }
    
    public void setMatriz(int fila, int columna, int valor)
    {
        matriz[fila][columna]=valor;
    }
    
    public void  rellenar()
    {
        for (int i=0; i<6; i++)
          for (int j=0; j<6; j++)
              matriz[i][j]=0;
        
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<6; j++)
            {
                boolean relleno=false;
                while (!relleno)
                {
                    int n= (int)(Math.random()*18)+1;
                    System.out.println(n);
                    int esta=0;
                    for (int x=0; x<6; x++)
                        for (int y=0; y<6; y++)
                            if (matriz[x][y]==n)
                                esta++;
                    if (esta<2)
                    {
                        matriz[i][j]=n;
                        relleno=true;
                    }
                }
            }
        }
    }
}
