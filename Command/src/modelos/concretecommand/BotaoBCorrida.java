package modelos.concretecommand;
import interfaces.command.Command;
import modelos.receiver.JogoDeCorrida;

public class BotaoBCorrida implements Command {

	JogoDeCorrida corrida;

    public BotaoBCorrida(JogoDeCorrida corrida) {
        this.corrida = corrida;
    }
    
    @Override
    public void executar() {
        corrida.freia();
    }

}
