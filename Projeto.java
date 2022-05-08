public class Projeto {
    private String nome;
    private String descrição;
    private String tecnologia;
    private DevCliente criador;
//CONSTRUTOR    
    public Projeto(String nome, String descrição, String tecnologia, DevCliente criador) {
        this.nome = nome;
        this.descrição = descrição;
        this.tecnologia = tecnologia;
        this.criador = criador;
    }
//GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public String getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public DevCliente getCriador() {
        return criador;
    }
    public void setCriador(DevCliente criador) {
        this.criador = criador;
    }

}
