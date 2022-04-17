import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Turma implements Serializable {


    private String disciplina;
    private String turno;
    private transient String codDisciplina;

    public Turma(String disciplina, String turno, String codDisciplina) {
        super();
        this.disciplina = disciplina;
        this.turno = turno;
        this.codDisciplina = codDisciplina;
    }


    public String toString() {
        return "Turma [Disciplina=" + disciplina + ", Turno=" + turno + " Cod da Disciplina=" + "]";
    }
}