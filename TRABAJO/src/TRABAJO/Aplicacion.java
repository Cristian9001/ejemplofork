package TRABAJO;

import java.util.Date;
import java.util.Scanner;

import TRABAJO.Pedidos.Pedido;

/**
 * 
 *@author Alexandro 
 *
 */
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ANTES DE COMENZAR ME GUSTARIA DECIR QUE NO BORRE NADA DEL TRABAJO EN LAS OTRAS CLASES PARA QUE SE PUEDA VER QUE HE HECHO, HAYA TENIDO RESULTADO POSITIVO O NO
		//Zona cliente
Date FechaDeAlta=new Date();
Cliente cliente1=new Cliente(null, null, null, 0, FechaDeAlta, 0, null);
System.out.println("Dime tu nombre");
cliente1.nombre=sc.next();


System.out.println("Dime tu primer apellido");
cliente1.apellido=sc.next();


System.out.println("Dime el nombre de su calle porfavor");
cliente1.Direccion=sc.next();



System.out.println("ingrese su numero de telefono");
int numeromaximo=9;
cliente1.Telefono=sc.nextInt();

cliente1.Historial=cliente1.CodigoPedido;




//Zona pasarela de pago
System.out.println("PASARELA DE PAGO" );

Date FechaCodigoPago=new Date();

PasarelaDePago compra=new PasarelaDePago(null, FechaCodigoPago, 0, 9, null, null, null, FechaCodigoPago, null);

System.out.println(compra.getFechaCodigoPago());

System.out.println("Por tarjeta (pulse 1), por efectivo (pulse 2) o por cuenta bancaria (pulse 3)");
compra.metodos=sc.nextInt();
switch(compra.metodos) 
{
case 1:
System.out.println("Escribe el tipo de tarjeta");
compra.tarjeta=sc.nextInt();

  boolean dinero = false;
    do 
    {
        System.out.println("Escribe el tipo de tarjeta");
        compra.tarjeta = sc.nextInt();
        switch (compra.tarjeta) 
        {
            case 4:
                System.out.println("Tu tarjeta sera VISA");
                dinero = false;
                break;
            case 5:
                System.out.println("Tu tarjeta sera Mastercard");
                dinero = false;
                break;
            case 3:
                System.out.println("Tu tarjeta sera American espress");
                dinero = false;
                break;
            default:
                System.out.println("ERROR");
                dinero = true;
        }
    } 
    while (dinero == true);

System.out.print("Escribe el codigo de la tarjeta");
compra.codigo=sc.next();
break;
case 2:
	System.out.println("Perfecto");
	
	break;

case 3:
	System.out.println("Bien, introduzca el numero de su cuenta porfavor");
	compra.cuenta=sc.next();
	System.out.println("Gracias");
break;
}

//Zona producto
Producto producto1=new Producto("", 0, 0);
System.out.print("Que producto desea elegir? ");
Producto.Nombre=sc.next();
System.out.print("Perdona podría decirme que precio de "+Producto.Nombre);
Producto.Precio=sc.nextFloat();
System.out.printf("Valor: %.2f", Producto.Precio );
System.out.printf("Cuanto desea comprar?" );
Producto.Cantidad=sc.nextInt();
Producto.preciofinal=(Producto.Cantidad*Producto.Precio);
System.out.printf("Será "+Producto.preciofinal+" Porfavor" );


System.out.println("Tu nombre es: " +cliente1.nombre.toLowerCase());
System.out.println("Tus apellidos son: " +cliente1.apellido.toUpperCase());
System.out.println("Tu direccion es: " +cliente1.Direccion);
System.out.println("Tu codigo de pedido es: " +cliente1.Historial);
System.out.println("Tu numero de telefono es: " +cliente1.Telefono);



//Zona Pedido en la cual al poner unas cosas de este apartado en otros apartados no lo puse para no repetirlo

System.out.println("Desea pedir algo mas? (1 si y 2 no)");
Pedido.mas=sc.nextInt();
switch(Pedido.mas) 
{
case 1:
	System.out.print("Que producto desea elegir? ");
	Pedido.setProducto2("");	
	System.out.print("Perdona podría decirme que precio de "+Pedido.Producto2);
	Producto.Precio=sc.nextFloat();
	System.out.printf("Valor: %.2f", Producto.Precio );
	System.out.printf("Cuanto desea comprar?" );
	Producto.Cantidad=sc.nextInt();
	Producto.preciofinal=(Producto.Cantidad*Producto.Precio);
	System.out.printf("Será "+Producto.preciofinal+" Porfavor" );
break;

case 2:
	System.out.printf("De acuerdo, " );
	
}


System.out.println("Desea agregar a alguien más? (1 si y 2 no)");
Pedido.mas=sc.nextInt();
switch(Pedido.mas) 
{
case 1:
Cliente cliente2= new Cliente("", null, null, numeromaximo, FechaCodigoPago, numeromaximo, null);

Pedido.agregarCliente(cliente2);

System.out.println("Dime su nombre");
cliente2.nombre=sc.next();


System.out.println("Dime su primer apellido");
cliente2.apellido=sc.next();


System.out.println("Dime el nombre de su calle porfavor");
cliente2.Direccion=sc.next();

System.out.println("ingrese su numero de telefono ");
int numeromaximo2=9;
cliente2.Telefono=sc.nextInt();


System.out.println("Tu nombre es: " +cliente2.nombre.toLowerCase());
System.out.println("Tus apellidos son: " +cliente2.apellido.toUpperCase());
System.out.println("Tu direccion es: " +cliente2.Direccion);
System.out.println("Tu codigo de pedido es: " +cliente2.Historial);
System.out.println("Tu numero de telefono es: " +cliente2.Telefono);

break;

case 2:
	System.out.println("vale, muchas gracias\n");
	
}
System.out.println("Ahora observe, como en esta parte de la página puede seleccionar los productos que usted quiera, con su cantidad y su precio (los productos, el precio y la cantidad que salen ahi son las predeterminadas) y se simula una compra para saber cuanto seria su gasto total\n");


//en este momento me di cuenta q no me funcionaba lo de cuando se agregue el producto1 se pueda añadir el 2 y sin el 1 no se puede, lo que hice es hacerlo de otra forma ya que llevaba dias intentandolo literalmente estaba casi hechando humo, de hecho en la clase pedidos estan las muestras de guerra no borre nada por eso mismo, lo que hice fue como juntarlo con lo de eliminar producto(q me cogia solamente el ultimo) asi que lo hice para que ponga los dos pedidos con en uno solo y que sea mas facil para eliminar
Producto productos=new Producto( "lechuga, tomate", 30, 5);



System.out.println(productos.toString());

System.out.println("Desea eliminar los productos? (1 si) (2 no)");

Pedido.mas=sc.nextInt();
switch(Pedido.mas) 
{

case 1:
	Pedido.setProducto(productos);
	Producto productoEliminado=Pedido.eliminarProducto();
	
case 2:
	System.out.println("Adios, muchas gracias");

}
}
}






