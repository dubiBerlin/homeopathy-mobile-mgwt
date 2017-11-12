package de.mgwt.dubravko.client.seite2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Utility {
	
	public static HashMap<Integer, String [] > amore;
	static List<String> options;
	static List<String>ids; // beinhaltet die ids die zur Weiterleitung auf Seite4 führen

	public Utility(){
		init();
		initIdArrayForwarding();
	}
	
	public static void initIdArrayForwarding(){
		ids = new ArrayList<String>();
		ids.add("251");
		ids.add("252");
		ids.add("281");
		ids.add("310");
		ids.add("311");
		ids.add("350");
		ids.add("351");
		ids.add("352");
		ids.add("353");
		ids.add("354");	
		ids.add("355");
		ids.add("356");
		ids.add("361");
		ids.add("362");
//		ids.add("");
//		ids.add("");
	}
	
	public boolean isIdForForwarding5(String id){
		System.out.println("isIdForForwarding : "+id);
		if(ids.contains(id)){
			return true;
		}
		return false;
	}
	
	public static void init(){
		if(amore == null){
			amore = new HashMap<Integer, String[]>();
			
			String[] verbrennung = new String[]{"mit Blasen", "ohne Blasen", "rohes fleisch"};
			amore.put(1, verbrennung);
			
			String[] zahnungsbeschwerden = new String[]{"Roetung des Gesichts", "Durchfall"};
			amore.put(2, zahnungsbeschwerden);
			
			String[] bindehautentzuendung = new String[]{"ohne Traenen", "mit Traenenfluss", "mit Traenenfluss als Folge von Allergien","mit Traenen als Folge von Verletzungen", "mit Traenen, Folge von Kaelte/Durchnaessung"};
			amore.put(3, bindehautentzuendung);			
			
			String[] blasenentzuendung = new String[]{"ohne Bettnaessen", "mit Bettnaessen"};
			amore.put(4, blasenentzuendung);
			
			String[] magendarmentzuendung = new String[]{"Durchfall begleitet von Erbrechen", "Erbrechen begleitet von Durchfall"};
			amore.put(5, magendarmentzuendung);
			
			String[] fieber = new String[]{"ploetzlich", "und Schuettelfrost", "und Phantasieren wie"};
			amore.put(6, fieber);
			
			String[] halsschmerzen = new String[]{"ploetzlich", "links", "rechts"};
			amore.put(7, halsschmerzen);
			
			String[] Mandelentzuendung = new String[]{"Durst", "kein Durst", "Eiterstippchen auf den Mandeln"};
			amore.put(8, Mandelentzuendung);
			
			String[] husten = new String[]{"Trockenes Fieber", "Schweissiges Fieber", "Trocken ohne Schleim", "Schleim in Nase und Rachen", "schleimig"};
			amore.put(9, husten);
			
			String[] infektanfaelligkeit = new String[]{"Eigenblut"};
			amore.put(10, infektanfaelligkeit);
			
			String[] pseudokrupp = new String[]{"akuter Anfall mit Luftot,  grosser Angst und Bellhusten", "Beginn", "feuchtes Wetter als Ausloeser", "Kalt trockenes Wetter als Ausloeser"};
			amore.put(11, pseudokrupp);
			
//			String[] nägelkauen = new String[]{"Nervoesitaet begleitet von ständigem Grimassieren", 
//					"Pedanterie (Uebertrieben genau)", "feuchtes Wetter als Ausloeser", "Kalt trockenes Wetter als Ausloeser"};
//			amore.put(12, nägelkauen);
			String[] naegelkauen = new String[]{"Gemuetssymptome wie"}; 
			amore.put(12, naegelkauen);
			
			String[] nasenbluten = new String[]{"hellrotes Blut", "normalrotes Blut", "dunkelrotes Blut"}; 
			amore.put(13, nasenbluten);
			
			String[] Ohrenschmalz = new String[]{"Farbe"}; 
			amore.put(14, Ohrenschmalz);
			
			String[] Schnupfen = new String[]{"Ursache", "Saeuglinge", "Frische Luft bessert den Schnupfen",
					"Waerme bessert den Schnupfen", "schneuzt staendig aber erfolglos die Nase"}; 
			amore.put(15, Schnupfen);
			
			String[] Verstopfung = new String[]{"Kind trinkt eher wenig", "Stuhldrang vergeblich", "Stuhl schluepft zurueck", "Fuehlt sich wohl"}; 
			amore.put(16, Verstopfung);
			
			String[] warzen = new String[]{"Gesicht", "Haende", "Fuesse schmerzlos", "Fuesse schmerzhaft"}; 
			amore.put(17, warzen);
			
			String[] unfaelle = new String[]{"Elektrounfall", "Hundebiss", 
					"Schaedel-Hirn-Trauma begleitet von Kopfschmerzen und Schwindel"}; 
			amore.put(18, unfaelle);
			
			String[] zaehneknirschen = new String[]{"nervoese Kinder", "motorisch unruhige Kinder"}; 
			amore.put(19, zaehneknirschen);
			
			String[] neugeborene = new String[]{"Augenentzuendung", "Hodenlage", "Wasserbruch", "Kopfekzem",
					"Koerperekzem", "Schnupfen", "Geburtsschock", "Schluesselbeinbruch", "Nervenquetschung", 
					"Bluterguss der Kopfhaut"}; 
			amore.put(20, neugeborene);
			
			String[] Schulprobleme = new String[]{"Pruefungsangst"}; 
			amore.put(21, Schulprobleme);
			
			String[] Computerkonsum = new String[]{"Ueberanstrengung", "Gemuetsveraenderungen"}; 
			amore.put(22, Computerkonsum);
			
			String[] TVKonsum = new String[]{"schlaflos"}; 
			amore.put(23, TVKonsum);
			
			String[] insektenstiche = new String[]{"Mit Juckreiz", "ohne Juckreiz", "immer wieder uebermaessige Reaktion"}; 
			amore.put(24, insektenstiche);
			
			String[] MittelohrentzuendungOhrenschmerzen = new String[]{"ohne Ausfluss aus dem Ohr 1. Tag", 
					"ohne Ausfluss aus dem Ohr 2. Tag", "ohne Ausfluss aus dem Ohr 3. Tag", 
					"mit Ausfluss aus dem Ohr"}; 
			amore.put(25, MittelohrentzuendungOhrenschmerzen);
			
			String[] impfung = new String[]{"vor der Impfung", "nach der Impfung "}; 
			amore.put(26, impfung);
			
			String[] sonnnenbrand = new String[]{
					"vor der Sonne", "nach der Sonne"
			}; 
			amore.put(27, sonnnenbrand);
			
			String[] gerstenkorn = new String[]{
					"schon laenger", "hartnaeckig, wiederkehrend"
			}; 
			amore.put(28, gerstenkorn);
			
			String[] blaehungen = new String[]{
					"beim Saeugling", "beim aelteren Kind"
			};
			amore.put(29, blaehungen);
			
			String[] wachstumsschmerz = new String[]{
					"mit vorangegangener Ueberanstrengung", "ohne vorangegangene Ueberanstrengung"
			};
			amore.put(30, wachstumsschmerz);
			
			String[] daumenlutschen = new String[]{
					"zuhause forsch, in der Fremde schuechtern", 
					"mutlos, aengstlich"
			};
			amore.put(31, daumenlutschen);
			
			String[] heuschnupfen = new String[]{
					"fliessende Nase", 
					"verstopfte Nase",
					"ohne Nasen- und Traenenfluss",
					"Niesen"
			};
			amore.put(32, heuschnupfen);
			
			String[] erbrechen = new String[]{
					"ohne Durchfall", 
					"mit Durchfall"
			};
			amore.put(33, erbrechen);
			
			String[] folgeVonSchreckSchrock = new String[]{
					"weint vor Schreck, moechte allein sein", 
					"zittrige Schwaeche, erstarrt",
					"aukuter Kummer, Verlust, \"ein Kloss im Hals\"",
					"weiss nicht, was es tun oder sagen soll",
					"laenger anhaltender Kummer",
					"nach beddrohlich erscheinendem Ereignis",
					"alle Energie ist weg, koennen nicht lachen"
			};
			amore.put(35, folgeVonSchreckSchrock);
			
			String[] angstUndUnruhe = new String[]{
					"vor Tieren", 
					"vor Misserfolg, schuechtern",
					"als Folge eines bedrohlich erscheinenden Ereignisses",
					"kann nicht allein sein"
			};
			amore.put(36, angstUndUnruhe);
		}	
	}
	
	@SuppressWarnings("rawtypes")
	public static HashMap getList(){
		return amore;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public List getListById(int id){
		options = new ArrayList<String>();
		if(id <40){
			String[]list = amore.get(id);
			
			for(int i = 0; i < list.length; i++){
				options.add(list[i]);
			}
		}else{
			options.add("Aktuell nur bis zum Sonnenbrand implementiert!");
		}
		
		return options;
	}
	
	
}
