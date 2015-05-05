import java.util.ArrayList;

/**
 * Clase MessagePost: un post de texto
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class MessagePost extends Post
{
    private String message;  

    /**
     * Constructor de MessagePost.
     *
     * @param author El usuario autor de este post
     * @param text El texto de este post
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }
    
    /**
     * Devuelve el mensaje del post
     * 
     * @return El texto del mensaje
     */    
    public String getText()
    {
        return message;
    }
    
    /**
     * Muestra por pantalla los detalles del post
     * 
     */
    public void display()
    {
        System.out.println("Autor: " + getUsername());
        System.out.println("\"" + message + "\"");
        System.out.println(timeString(getTimeStamp()));
        printLikesAndComments();
    }
    
    /**
     * Muestra por pantalla el nombre del usuario que creo el post
     *
     */
    public void printShortSummary()
    {
        System.out.println("Esto es un post de texto creado por " + getUsername());
    }    
}








































