import java.util.ArrayList;
/**
 * Clase Post generico
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;    
    


    /**
     * Post Constructor
     *
     * @param author El nombre del usuario que crea el post
     */
    public Post(String author)
    {
        username = author;
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
     * Convierte un tiempo pasado expresado en milisegundos en un tiempo
     * expresado en "hace..."
     *
     * @param time el tiempo pasado en milisegundos a expresar como "hace..."
     * @return The return value
     */
    public String timeString(long time)
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
    
    /**
     * Devuelve el nombre de usuario del autor del post
     *
     * @return el nombre de usuario del autor del post
     */
    public String getUsername()
    {
        return username;
    }
    
    
    /**
     * Imprime por pantalla el numero de me gusta y los comentarios del post
     *
     */
    public void printLikesAndComments()
    {
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
}
