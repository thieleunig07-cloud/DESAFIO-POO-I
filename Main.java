public class Main {

    public static void main(String[] args) {

        Participante participante1 = new Participante("Ana", "ana@email.com", "Campeonato");
        Participante participante2 = new Participante("Bruno", "bruno@email.com", "Cosplay");
        Participante participante3 = new Participante("Carlos", "carlos@email.com", "Palestra");
        System.out.println(participante1.getNome() + " - " + participante1.getEmail() + " - " + participante1.getTipoParticipacao());
        System.out.println(participante2.getNome() + " - " + participante2.getEmail() + " - " + participante2.getTipoParticipacao());
System.out.println(participante3.getNome() + " - " + participante3.getEmail() + " - " + participante3.getTipoParticipacao());

}

}