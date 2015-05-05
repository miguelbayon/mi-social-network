/**
 * Clase PhotoPost: un post con una foto
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class PhotoPost extends Post
{
    private String filename;
    private String caption;
    
    /**
     * Constructor de PhotoPost.
     *
     * @param author El usuario autor de este post
     * @param filename El nombre del archivo de la foto
     * @param caption Un título para la foto
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
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
     * Muestra por pantalla los detalles del post
     * 
     */
    public void display()
    {
        System.out.println("Autor: " + getUsername());
        System.out.println("Foto: " + filename);
        System.out.println("Título de la foto: " + caption);
        System.out.println(timeString(getTimeStamp()));
        printLikesAndComments();
    }
   

}








































