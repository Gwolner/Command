package modelos.invoker;
import interfaces.command.Command;

public class Joystick {
	
	Command[] aCommand;
	Command[] bCommand;
	
	public Joystick() {
		
		aCommand = new Command[3];
		bCommand = new Command[3];
	}
	
	public void setCommand(int slot, Command aCommand, Command bCommand) {
		this.aCommand[slot] = aCommand;
		this.bCommand[slot] = bCommand;
	}
	
	public void apertaA(int slot) {
		this.aCommand[slot].executar();
	}
	
	public void apertaB(int slot) {
		this.bCommand[slot].executar();
	}
	
	public String toString(){		
		return "----- Novo cartucho inserido-----";
    }

}
