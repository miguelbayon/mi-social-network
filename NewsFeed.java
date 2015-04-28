import java.util.ArrayList;

/**
 * Clase NewsFeed
 * 
 * @author Migul Bayon
 * @version 1.0
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añade un post de texto al feed
     *
     * @param message El post de texto a añadir
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    
    /**
     * Añade un post con foto al feed
     *
     * @param message El post con foto a añadir
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }    
    
    /**
     * Muestra por la terminal el muro de noticias
     * 
     */
    public void show()
    {
        for(MessagePost message : messages) {
            message.display();
            System.out.println();
        }

        for(PhotoPost photo : photos) {
            photo.display();
            System.out.println();
        }
    }
}
