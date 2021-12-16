/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.CharacterFactory;
import Modelo.HumanoFactory;
import Modelo.*;
import Vista.Bienvenida;
import Vista.frmCantidadPer;
import Vista.frmFinal;
import Vista.frmPersonajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Johan Fontecha, Diana Ferraro, Andres Quintero
 */

public class Controlador implements ActionListener{
    Bienvenida frmBien;
    frmPersonajes frmPer;
    frmCantidadPer frmCant;
    frmFinal frmFinal;
    private Personaje[] lista;
    private CharacterFactory persona;
    private String tipo;
    public Controlador(Bienvenida frmBien, frmPersonajes frmPer, frmCantidadPer frmCant, frmFinal frmFinal) throws IOException{//Constructor
        this.frmBien = frmBien;
        this.frmPer = frmPer;
        this.frmCant = frmCant;
        this.frmFinal = frmFinal;
    } 
    
    public Controlador() throws IOException{
        this.frmBien = new Bienvenida();
        this.frmBien.getBtnElegir().addActionListener(this);
        
        this.frmPer = new frmPersonajes();
        this.frmPer.getBtnHumano().addActionListener(this);
        this.frmPer.getBtnElfo().addActionListener(this);
        this.frmPer.getBtnEnano().addActionListener(this);
        this.frmPer.getBtnMago().addActionListener(this);
        this.frmPer.getBtnOrco().addActionListener(this);
        
        this.frmCant = new frmCantidadPer();
        this.frmCant.getBtnVolver().addActionListener(this);
        this.frmCant.getBtnContinuar().addActionListener(this);
        
        this.frmFinal = new frmFinal();
        this.frmFinal.getBtnAdelante().addActionListener(this);
        this.frmFinal.getBtnAtras().addActionListener(this);
        this.frmFinal.getBtnVolver().addActionListener(this);
    }
    
    public void iniciar(){//función para abrir la ventana de bienvenida
        frmBien.setTitle("Juego");
        frmBien.setLocationRelativeTo(null);
        frmBien.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cantidad = 0;
        if(frmBien.getBtnElegir()==e.getSource()){
            frmPer.setLocationRelativeTo(null);
            frmPer.setVisible(true);
            frmBien.setVisible(false);
        }
        if(frmPer.getBtnHumano()==e.getSource()){//selección Personaje Humano
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmPer.setVisible(false);
            frmCant.getJblPersonaje().setIcon(new ImageIcon(getClass().getResource("/Imagenes/Humano.jpg")));
            frmCant.getJblPersonaje().setText("Humano");
            tipo="humano";
            frmCant.getJblEscoja().setText("Escoja la cantidad de humanos");
            frmCant.getTxtDescripcion().setText("\nLos señores del comercio habitan la\nzona noreste de Älvor, se puede\n"
                    + "decir que son la raza más joven del\ncontinente, su capacidad comercial\nles ha permitido "
                    + "viajar por el mundo\nhaciendo tratos y absorbiendo\nconocimientos de las otras razas.\n"
                    + "\nSe conocen por sus habilidades\nartesanales, el dominio del combate\ncon espadas y la "
                    + "riqueza acumulada\nque les ha permitido levantar un enorme\nreino.");
            
        }
        
        if(frmPer.getBtnElfo()==e.getSource()){//selección Personaje Elfo
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmPer.setVisible(false);
            frmCant.getJblPersonaje().setIcon(new ImageIcon(getClass().getResource("/Imagenes/Elfo.jpg")));
            frmCant.getJblPersonaje().setText("Elfo");
            tipo="elfo";
            frmCant.getJblEscoja().setText("Escoja la cantidad de elfos");
            frmCant.getTxtDescripcion().setText("Los protectores del bosque que habitan\nla zona sureste de Älvor son seres de\n"
                    + "enorme belleza sabiduría y una larga vida,\ntambién conocidos como espíritus\nde la naturaleza.\n\n"
                    + "Estos seres semi divinos son conocidos\npor ser excelentes artesanos y \ndestacan aún más en el uso del arco,\n"
                    + "además se les atribuye la habilidad\nherbolaria y la hipnosis. Si tienes\n un poco de suerte podrían "
                    + "enseñarte\n sobre las plantas y sus efectos.");
        }
        
        if(frmPer.getBtnEnano()==e.getSource()){//selección Personaje Enano
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmPer.setVisible(false);
            frmCant.getJblPersonaje().setIcon(new ImageIcon(getClass().getResource("/Imagenes/Enano.jpg")));
            frmCant.getJblPersonaje().setText("Enano");
            tipo="enano";
            frmCant.getJblEscoja().setText("Escoja la cantidad de enanos");
            frmCant.getTxtDescripcion().setText("Los errantes de las montañas nororientales\n de Älvor han habitado allí desde hace\n"
                    + "unos 2000 años, por ello su habilidad\n minera se ha desarrollado y  con ello su\n altura debido a que "
                    + "viven en las cuevas y\npoco salen al mundo.\nSon conocidos por sus habilidades en la\n herrería y"
                    + " el dominio de sus enormes mazas\npara defenderse de cualquier ataque.Si\ntienes suerte podrían "
                    + "invitarte una enorme\n jarra de cerveza y enseñarte a forjar una\n arma como las suyas, pero"
                    + " ¡cuidado!, no\n debes herir su orgullo o ganarás un\n poderoso enemigo. ");
        }
        
        if(frmPer.getBtnMago()==e.getSource()){//selección Personaje Mago
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmPer.setVisible(false);
            frmCant.getJblPersonaje().setIcon(new ImageIcon(getClass().getResource("/Imagenes/Mago.png")));
            frmCant.getJblPersonaje().setText("Mago");
            tipo="mago";
            frmCant.getJblEscoja().setText("Escoja la cantidad de magos");
            frmCant.getTxtDescripcion().setText("\nLos dueños de la torre mágica habitan el\n centro Älvor, son seres de enorme\n"
                    + " inteligencia que se distinguen por su\n insaciable búsqueda de la sabiduría.\n\n"
                    + "Estos seres eruditos son conocidos por\n sus conocimientos astrológicos, el uso de\nla magia blanca"
                    + " y las habilidades en la\n alquimia, suelen ser muy pacíficos y\n cerrados, pero si te atreves a "
                    + "atacarlos,\n ellos no dudarán en liberar su bastón para\n defenderse.");
        }
        
        if(frmPer.getBtnOrco()==e.getSource()){//selección Personaje Orco
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmPer.setVisible(false);
            frmCant.getJblPersonaje().setIcon(new ImageIcon(getClass().getResource("/Imagenes/Orco.jpg")));
            frmCant.getJblPersonaje().setText("Orco");
            tipo="orco";
            frmCant.getJblEscoja().setText("Escoja la cantidad de orcos");
            frmCant.getTxtDescripcion().setText("La horda de guerreros, dueña de los\n territorios surorientales de Älvor, son\n"
                    + " seres de gran tamaño e imponente fuerza,\n caminan encorvados y arrastran sus\n majestuosas hachas.\n\n"
                    + "Son conocidos por sus habilidades de\n desuello y peletería, con esto fabrican\n sus armaduras."
                    + "También se les conoce\n por su fuerza bruta y poca sociabilidad,\n pero ¡alto!, si te encuentras con "
                    + "uno\n definitivamente no estará feliz de verte \n así que… ¡Corre!.");
        }
        
        if(this.frmCant.getBtnContinuar()==e.getSource()){//boton Continuar en ventana de Cantidad
            cantidad = Integer.parseInt(frmCant.getTxtCantidad().getText());
            frmFinal.setLocationRelativeTo(null);
            frmFinal.setVisible(true);
            frmCant.setVisible(false);
            this.setPersonajes(cantidad);
            frmFinal.setLista(this.lista);
            System.out.println(cantidad);
        }
        
        if(this.frmCant.getBtnVolver()==e.getSource()){//boton Volver en ventana de Cantidad
            frmPer.setLocationRelativeTo(null);
            frmPer.setVisible(true);
            frmCant.setVisible(false);
        }
        
        if(this.frmFinal.getBtnVolver()==e.getSource()){//boton Volver en ventana final
            frmCant.setLocationRelativeTo(null);
            frmCant.setVisible(true);
            frmFinal.setVisible(false);
        }
        
    }
    
    public void setPersonajes(int cant){
        
        this.lista=new Personaje[cant];
        
        if(this.tipo.equals("humano")){
            this.persona=new HumanoFactory();
            
        }else if(this.tipo.equals("elfo")){
            this.persona=new ElfoFactory();
           
        }else if(this.tipo.equals("enano")){
            this.persona=new EnanoFactory();
            
        }else if(this.tipo.equals("mago")){
            this.persona=new MagoFactory();
            
        }else {
            this.persona=new OrcoFactory();
            
        }
        
        for(int i=0;i<cant;i++){
            this.lista[i]=this.persona.createCharacter();

        }
        
    }
    
    
}
