public class Participante {

    private String nome;
    private String email;
    private String tipoParticipacao;

    public Participante(String nome, String email, String tipoParticipacao) {
        this.nome = nome;
        this.email = email;
        this.tipoParticipacao = tipoParticipacao;
    }
      public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoParticipacao() {
    return tipoParticipacao;
}
}