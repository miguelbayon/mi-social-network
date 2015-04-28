import java.util.ArrayList;

/**
 * Clase MessagePost: un post de texto
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    

    /**
     * Constructor de PhotoPost.
     *
     * @param author El usuario autor de este post
     * @param filename El nombre del archivo de la foto
     * @param caption Un título para la foto
     */
    public PhotoPost(String author, String filename, String caption)
    {
        username = author;
        this.filename = filename;
        this.caption = caption;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Registra un 'me gusta' sobre este post
     *
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * Registra la eliminación de un 'me gusta' sobre este post
     *
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Añade un comentario a este post
     * 
     * @param text  El texto del comentario
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Devuelve el nombre del archivo de la foto
     *
     * @return El nombre de archivo de la foto
     */
    public String getImageFile()
    {
        return filename;
    }
    
    /**
     * Devuelve el tñitulo asociado a la foto
     *
     * @return El titulo asociado a la foto
     */
    public String getCaption()
    {
        return caption;
    }    
    
    /**
     * Devuelve el momento de la creación del post
     * 
     * @return el numero de milisegundos que han pasado desde el 1 de enero de 1970 
     * hasta la creación del post
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    
    /**
     * Muestra por pantalla los detalles del post
     * 
     */
    public void display()
    {
        System.out.println("Autor: " + username);
        System.out.println("Foto: " + filename);
        System.out.println("Título de la foto: " + caption);
        System.out.println(timeString(timestamp));
        System.out.println("A " + likes + " personas le gusta esto");
        
        if (comments.isEmpty()) {
            System.out.println("Aun no hay comentarios");
        }
        else {
            System.out.println("Comentarios:");
            for (String comment : comments) {
                System.out.println(comment);
            }
        }
    }
    
    private String timeString(long time)
    {
        long currentTime = System.currentTimeMillis();
        long millisecondsAgo = currentTime - time;
        long minutes = millisecondsAgo / 60000;
        long seconds = (millisecondsAgo - (minutes * 60000)) / 1000;
        String timeAgo = seconds + " segundos";
        if (minutes > 0) {
            timeAgo = minutes + " minutos y " + timeAgo;
        }
        return "Hace " + timeAgo;
    }

}








































