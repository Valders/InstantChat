package fr.activconsulting.paris;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInstantChatSocket extends Thread {
	// On va initialiser le serveur, et on va lui donner le port sur lequel
	// il va devoir �couter (Socket de Serveur).
	
	// Faire en sorte que le socket de connexion accepte les connexion (accept())

	// On pr�pare les informations � envoyer au client
	// [...] = new PrintWriter(this.connectionSocket.getOutputStream());

	// On pr�pare les buffer de lecture qui va lire un flux de lecture entrant
	// � partir de ce que le cleint aura envoy�, et donc, que le serveur aura recu.
	// [...] = new BufferedReader(new InputStreamReader(this.connectionSocket.getInputStream()));
	
	/*
	 * Le contenu du message que l'on souhaite envoyer.
	 */
	
	/*
	 * L'objet qui est � envoyer et qui contient le message. (PrintWriter )
	 */
	private PrintWriter out = null;

	public ServerInstantChatSocket(ServerSocket serverSocket, Socket connectionSocket, BufferedReader in,
			PrintWriter sortie) {
		// On d�fini au Thread instanci� un nom pour lui meme.
		super("ServerInstantChatSocket");
		
		// On d�finit le contenue qui est � envoy� qui provient du serveur.
		//this.sortie = sortie;
		
		// On d�finir le contenu recu du client.
		//this.entree = entree;

		
		//this.connectionSocket = connectionSocket;
		// this.serverSocket = serverSocket;
	}
	
	@Override
	public void run() {
		
		try {
			// On r�cup�re le message recu du client.
			// Tant que le emssage contient du contenu...
				// On affiche le message du client.
				// On passe � la ligne suivante.
			// On ferme l'objet qui envoie les messages au client.
			// On ferme les sockets.
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
