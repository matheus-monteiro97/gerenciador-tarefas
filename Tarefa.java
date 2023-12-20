public class Tarefa {
    private String titulo;
    private int status; //1 para ATIVO e 2 para INATIVO

    public Tarefa(){}

    public Tarefa(String titulo, int status){
        this.titulo = titulo;
        this.status = status;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
