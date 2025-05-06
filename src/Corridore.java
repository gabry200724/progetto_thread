public class Corridore extends Thread {
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        
        return "corridore [nome=" + nome + "]";
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(nome + i + "metri");
            
        
    }
    System.out.println(" il corridore " + nome + " è arrivato");
    
    
        
    }
}
