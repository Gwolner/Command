package modelos.concretecommand;
import interfaces.command.Command;
import modelos.receiver.JogoDeCorrida;

public class BotaoACorrida implements Command {

    JogoDeCorrida corrida;

    public BotaoACorrida(JogoDeCorrida corrida) {
        this.corrida = corrida;
    }

	@Override
	public void executar() {
		corrida.acelera();
	}
}
