package fr.activconsulting.paris;

import java.io.PrintWriter;

public class ClientInstantChatSocket extends Thread {

	/*
	 * Le contenu du message que l'on souhaite envoyer.
	 */
	
	/*
	 * L'objet qui est � envoyer et qui contient le message. (PrintWriter )
	 */
	private PrintWriter out = null;
	
	/*
	 * Un clavier...
	 */
	
	public ClientInstantChatSocket(PrintWriter out) {
		super("ClientInstantChatSocket");
		// Le thread prend le message de sortie d�finit par le serveur.
		this.out = out;
	}
	
	@Override
	public void run() {
		// Le thread s'ex�cute sans s'arr�ter.
		//TODO : A red�finir car tres moche....
		while (true) {
			System.out.print("CLNT > ");		// On affiche du texte.
			//this.message = keyboard.nextLine();	// On r�cup�re le message
			//this.out.println(this.message);	// On envoie le message au serveur.
			//this.out.flush();				// On lib�re.
		}
	}
}
