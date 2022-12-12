package IOPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	// ATRIBUTS

	// CONSTRUCTORA
	public WriteFile(String nomUsuari, byte puntuacio) {
		// DEFINICIO VARIABLES
		File myFile;
		FileWriter myFileWrite;

		// ACCIONS
		try {
			// 1) Es crea l'objecte File
			myFile = new File("src/classificacio,txt");

			// 2) S'ha de crear el fitxer?
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			
			// 3) Es crea l'objecte x escriure en el fitxer
			myFileWrite = new FileWriter(myFile, true);
			
			// 4) S'afegeix la nova línia
			myFileWrite.write( nomUsuari + " " + puntuacio + "\r\n");
			
			// 5) Es tanca el fitxer
			myFileWrite.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
