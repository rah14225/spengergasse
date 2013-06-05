
/**
 * Write a description of class Buch here.
 * 
 * @author Mahmudur Rahman 
 * @version 1.1
 */
public class Buch
{
    private boolean taschenbuch;
    private int seiten;
    private String titel;
    private String autor;
    public Buch()
    {
        taschenbuch=true;
        seiten=200;
        titel="Java für Anfänger";
        autor="Max Schreiber";
    }
    public Buch(boolean taschenbuch, int seiten, String titel, String autor)
    {
        this.taschenbuch=taschenbuch;
        this.seiten=seiten;
        this.titel=titel;
        this.autor=autor;
    }
    public void setTaschenbuch(boolean taschenbuch)
    {
        this.taschenbuch=taschenbuch;
    }
    public void setSeiten(int seiten)
    {
        this.seiten=seiten;
    }
    public void setTitel(String titel)
    {
        this.titel=titel;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public boolean getTaschenbuch()
    {
        return taschenbuch;
    }
    public int getSeiten()
    {
        return seiten;
    }
    public String getTitel()
    {
        return titel;
    }
    public String getAutor()
    {
        return autor;
    }
}    
    
    
    
    
    
    
    
    
    
    
        
        