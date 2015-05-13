/**
 * sPAIce_invaders.modelo.Menu.java
 * Proyecto Final: sPAIce invaders.
 *
 * Asignatura: Programación de Aplicaciones Interactivas.
 * Universidad de La Laguna.
 * Curso: 2014-2015
 *
 * Autores: 
 *    Daniel E. Quijada Díaz
 *    Francisco J. Palacios Rodríguez.
 *    Héctor Rodríguez Pérez
 */

package modelo;

import java.util.ArrayList;


/**
 * TODO Descripción de la clase.
 */
public class Menu implements Estado {

   private static final String NEW = "Nuevo Juego";
   private static final String LOA = "Cargar Partida";
   private static final String OPC = "Opciones";
   private static final String EXT = "Salir";
   private ArrayList<String>   opciones;
   private int                 seleccionada;

   private static Menu menu;
   
   /**
    * 
    */
   private Menu () {
      setSeleccionada (0);
      setOpciones (new ArrayList<String> ());
      getOpciones ().add (NEW);
      getOpciones ().add (LOA);
      getOpciones ().add (OPC);
      getOpciones ().add (EXT);
   }
   
   public static Menu getInstance () {
      if (getMenu () == null)
         setMenu (new Menu ());
      return getMenu ();
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#izquierda()
    */
   @Override
   public void izquierda () {
      // No hace nada
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#derecha()
    */
   @Override
   public void derecha () {
      seleccionar ();
   }

   /**
    * 
    */
   private void seleccionar () {
      // TODO Auto-generated method stub
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#arriba()
    */
   @Override
   public void arriba () {
      setSeleccionada ((getSeleccionada () - 1) % getOpciones ().size ());
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#abajo()
    */
   @Override
   public void abajo () {
      setSeleccionada ((getSeleccionada () + 1) % getOpciones ().size ());
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#accion()
    */
   @Override
   public void accion () {
      seleccionar ();
   }

   /*
    * (non-Javadoc)
    * 
    * @see modelo.Estado#salir()
    */
   @Override
   public void salir () {
      setSeleccionada (getOpciones ().size () - 1);
   }


   /**
    * @return the opciones
    */
   public ArrayList<String> getOpciones () {
      return opciones;
   }


   /**
    * @param opciones
    *           the opciones to set
    */
   public void setOpciones (ArrayList<String> opciones) {
      this.opciones = opciones;
   }


   /**
    * @return the seleccionada
    */
   public int getSeleccionada () {
      return seleccionada;
   }


   /**
    * @param seleccionada
    *           the seleccionada to set
    */
   public void setSeleccionada (int seleccionada) {
      this.seleccionada = seleccionada;
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraIzquierda()
    */
   @Override
   public void paraIzquierda () {
      // Nada
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraDerecha()
    */
   @Override
   public void paraDerecha () {
      // Nada
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraArriba()
    */
   @Override
   public void paraArriba () {
      // Nada
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraAbajo()
    */
   @Override
   public void paraAbajo () {
      // Nada
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraAccion()
    */
   @Override
   public void paraAccion () {
      // Nada
   }

   /* (non-Javadoc)
    * @see modelo.Estado#paraSalir()
    */
   @Override
   public void paraSalir () {
      // Nada
   }

   
   /**
    * @return the menu
    */
   public static Menu getMenu () {
      return menu;
   }

   
   /**
    * @param menu the menu to set
    */
   public static void setMenu (Menu menu) {
      Menu.menu = menu;
   }
}