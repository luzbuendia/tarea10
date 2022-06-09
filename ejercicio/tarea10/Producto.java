package ejercicio.tarea10;

public class Producto
{
    private String nombre;
    private int codigo;
    private double precio;
 
    public Producto(String nombre,int codigo,double precio )
    {
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
    }
    public void setNombre (String nombre)
    {
      this.nombre=nombre;
    } 
    public String getNombre()
    {
      return this.nombre;
    }
    public void setCodigo (int codigo)
    {
      this.codigo=codigo;
    } 
    public int getCodigo()
    {
      return this.codigo;
    } 
    public void setPrecio (double precio)
    {
      this.precio=precio;
 
    } 
    public double getPrecio()
    {
      return this.precio;  
    }
    public void listarProducto()
    {
        System.out.println("nombre:" +this.getNombre());
        System.out.println("codigo:" +this.getCodigo());  
        System.out.println("precio:" +this.getPrecio());
            
     
        
    } 
}
