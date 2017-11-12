package de.mgwt.dubravko.client.startseite;

import java.util.ArrayList;
import java.util.List;


public class StartSeiteUtility {

	private static List<String> list;
	
//	private DirectoryEntry currentDir;
//	private FileEntry currentFile;
//	private static PhoneGap phoneGap;
	
	public static List<String> getList(){
		init();
		return list;
	}
	
	public static void init(){
		if(list == null){
			
			list = new ArrayList<String>();
			list.add("Disclaimer beim naechsten Aufruf der Seite aufrufen");
			list.add("Verbruehung Verbrennung"); //1
			list.add("Zahnungsbeschwerden");     //2
			list.add("Bindehautentzuendung");    //3
			list.add("Blasenentzuendung");       //4
			list.add("Magendarmentzuendung");	 //5
			list.add("Fieber");					 //6
			list.add("Halsschmerzen");		     //7
			list.add("Mandelentzuendung");        //8
			list.add("Husten");					 //9
			list.add("Infektanfaelligkeit");	//10
			list.add("Pseudokrupp");			//11
			list.add("Naegelkauen");			//12
			list.add("Nasenbluten");			//13	
			list.add("Ohrenschmalz");			//14
			list.add("Schnupfen");				//15
			list.add("Verstopfung");			//16
			list.add("Warzen");					//17
			list.add("Unfaelle");				//18
			list.add("Zaehneknirschen");
			list.add("Themen um das Neugeborene Kind");
			list.add("Schulprobleme");
			list.add("Computerkonsum");
			list.add("TV-Konsum");
			list.add("Insektenstiche");
			list.add("Mittelohrentzuendung/Ohrenschmerzen");
			list.add("Impfung");
			list.add("Sonnenbrand");
			list.add("Gerstenkorn");
			list.add("Blaehungen / Koliken");
			list.add("Wachstumsschmerz");
			list.add("Daumenlutschen");
			list.add("Heuschnupfen");
			list.add("Schlafstoerungen");
			list.add("Erbrechen");
			list.add("Folge von Schreck-Schock");
			list.add("Angst und Unruhe");
			list.add("Windeldermatitis");
			list.add("Liste der Medikamente");
		}
	}
	
	
}
