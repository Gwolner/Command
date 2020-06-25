package main;
import modelos.concretecommand.BotaoACorrida;
import modelos.concretecommand.BotaoBCorrida;
import modelos.invoker.Joystick;
import modelos.receiver.JogoDeCorrida;

public class JoystickSuperGame {

	public static void main(String[] args) {
		
		//Criando o Joystick
		Joystick joystick = new Joystick();
		
		//Criando o jogo
		JogoDeCorrida needForSpeed  = new JogoDeCorrida();
		
		//Criando os comandos
		BotaoACorrida corridaA = new BotaoACorrida(needForSpeed);
		BotaoBCorrida corridaB = new BotaoBCorrida(needForSpeed);
		
		//Adicionando os comandos ao joystick
		joystick.setCommand(0, corridaA, corridaB);
		
		//Jogando Need For Speed
		System.out.println(joystick);		
		joystick.apertaA(0);
		joystick.apertaB(0);
		
	}

}
