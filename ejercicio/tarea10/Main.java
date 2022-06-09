package ejercicio.tarea10;

public class Main 
{
    public static void main(String args[])
    {
       ProductoControlador productoControlador = new ProductoControlador(3);
      
        productoControlador.crear("televicion sansung",345672, 1500);
        productoControlador.crear("celular Lg", 127865, 500);
        productoControlador.crear("juguete", 456721, 60);
  
        productoControlador.listar();
         int producto = 345672;
         Producto encontrado;
         encontrado=productoControlador.buscar(producto);
         if(encontrado != null)
         {
           
        
            System.out.println("Producto encontrado: "+encontrado.getCodigo());

         } else 
         {

            System.out.println("No se encontro: "+producto);
         }
    }

        
      


    
}
 
    
