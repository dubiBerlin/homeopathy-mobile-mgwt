package de.mgwt.dubravko.client.seite5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.mgwt.dubravko.client.model.Heilmittel;

public class Utility5 {

	// Eine Map in der sich Maps befinden
	public static HashMap<String, Heilmittel > aussen;
	
	// 
	static List<Heilmittel> options;
	public static HashMap<String, String > medikamentenBeschreibung;
	
	// Ids die zur Weiterleitung auf Seite5 führen
	static List<String>ids;
	static List<Heilmittel> optionsForForwarding;
	
	
	public Utility5(){
		initIdArrayForwarding();
		init();		
	}
	
	// die ids die auf seite6 weiterleiten
	public static void initIdArrayForwarding(){
		ids = new ArrayList<String>();
		ids.add("26100");
		ids.add("26101");
		ids.add("27110");
		ids.add("27111");
		ids.add("27112");
		ids.add("29101");
		ids.add("32000");
		ids.add("29101");
		ids.add("32321");
		ids.add("32330");	
		ids.add("33011");
		ids.add("33020");
		ids.add("33021");
		ids.add("33030");
		ids.add("33031");
		ids.add("33100");
//		ids.add("");
//		ids.add("");
//		ids.add("");
//		ids.add("");
//		ids.add("");
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
	
	public static List<Heilmittel> getListByIdForwardOptions(String index){
		optionsForForwarding = new ArrayList<Heilmittel>();
		
		if(index.equals("26100")){
			optionsForForwarding.add(0, new Heilmittel("wie Erkaeltung, schlechte Laune", ""));
			optionsForForwarding.add(1, new Heilmittel("langsamer Anstieg, kein Durst", ""));
		}
		if(index.equals("26101")){
			optionsForForwarding.add(0, new Heilmittel("naechtliches Aufschrecken o. unmotiviertes Schreien", ""));
			optionsForForwarding.add(1, new Heilmittel("anhaltendes Weinen, Verlangen Trost", ""));
		}
		if(index.equals("27110")){
			optionsForForwarding.add(0, new Heilmittel("kleine und grosse Blasen, verschmelzend", ""));
			optionsForForwarding.add(1, new Heilmittel("kleine scharf begrenzte Blaeschen", ""));
		}
		if(index.equals("27111")){
			optionsForForwarding.add(0, new Heilmittel("die Haut schmerzt", ""));
		}
		if(index.equals("27112")){
			optionsForForwarding.add(0, new Heilmittel("trinkt grosse Zuege", ""));
			optionsForForwarding.add(1, new Heilmittel("trinkt kleine Schlucke", ""));
		}
		if(index.equals("29101")){
			optionsForForwarding.add(0, new Heilmittel("mit Wuergen, Uebelkeit", ""));
			optionsForForwarding.add(1, new Heilmittel("mit Erbrechen", ""));
		}
		if(index.equals("32000")){
			optionsForForwarding.add(0, new Heilmittel("milde Traenen", ""));
			optionsForForwarding.add(1, new Heilmittel("alles brennt", ""));
		}
		if(index.equals("32301")){
			optionsForForwarding.add(0, new Heilmittel("Fenster wird geoeffnet", ""));
			optionsForForwarding.add(1, new Heilmittel("Fenster wird geschlossen", ""));
		}
		if(index.equals("32321")){
			optionsForForwarding.add(0, new Heilmittel("Nasenfluss scharf", ""));
			optionsForForwarding.add(1, new Heilmittel("Nasenfluss brennend", ""));
		}
		if(index.equals("32330")){
			optionsForForwarding.add(0, new Heilmittel("juckend", ""));
			optionsForForwarding.add(1, new Heilmittel("duenn, scharf", ""));
			optionsForForwarding.add(2, new Heilmittel("brennend", ""));
		}
		if(index.equals("33011")){
			optionsForForwarding.add(0, new Heilmittel("grosse Uebelkeit", ""));
			optionsForForwarding.add(1, new Heilmittel("keine Schmerzen", ""));
			optionsForForwarding.add(2, new Heilmittel("Bauchschmerzen", ""));
		}
		if(index.equals("33020")){
			optionsForForwarding.add(0, new Heilmittel("weisse Gerinsel", ""));
			optionsForForwarding.add(1, new Heilmittel("gruene Gerinsel", ""));
		}
		if(index.equals("33021")){
			optionsForForwarding.add(0, new Heilmittel("weiss belegte Zunge", ""));
			optionsForForwarding.add(1, new Heilmittel("saubere Zunge", ""));
			optionsForForwarding.add(2, new Heilmittel("laengere Zeit nach dem Essen", ""));
		}
		if(index.equals("33030")){
			optionsForForwarding.add(0, new Heilmittel("auf Kaltes, aber sofort wieder Erbrechen", ""));
			optionsForForwarding.add(1, new Heilmittel("reichlich gruenes Erbrechen", ""));
			optionsForForwarding.add(2, new Heilmittel("Galle, Blut, rascher Verfall", ""));
		}
		if(index.equals("33031")){
			optionsForForwarding.add(0, new Heilmittel("Erbrechen ohne Erleichterung", ""));
			optionsForForwarding.add(1, new Heilmittel("vergebliches Wuergen", ""));
			optionsForForwarding.add(2, new Heilmittel("unverdaute Nahrung, lange nach Mahlzeit", ""));
		}
		if(index.equals("33100")){
			optionsForForwarding.add(0, new Heilmittel("\"Spinat\"", ""));
			optionsForForwarding.add(1, new Heilmittel("wenig, gruen", ""));
			optionsForForwarding.add(2, new Heilmittel("\"Reiswasser\"", ""));
			optionsForForwarding.add(3, new Heilmittel("unverdaut", ""));
		}
		return optionsForForwarding; 
	}
	
	public static List<Heilmittel> getListById(String index){
		options = new ArrayList<Heilmittel>();
		options.add(aussen.get(index));
		return options; 
	}
	
	public static void init(){
		if(aussen == null){
			aussen = new HashMap<String, Heilmittel>();
			aussen.put("25000", new Heilmittel("Aconitum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("25001", new Heilmittel("Chamomilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("26110", new Heilmittel("Sarsaparilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("26111", new Heilmittel("Silicea", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("27100", new Heilmittel("Acidum hydrofluoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("27101", new Heilmittel("Cantharis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("29100", new Heilmittel("Chamomilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32110", new Heilmittel("Nux vomica", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32111", new Heilmittel("Luffa operculata", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32002", new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32001", new Heilmittel("Arsenicum album", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32002", new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32010", new Heilmittel("Cyclamen", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32300", new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32302", new Heilmittel("Lachesis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32310", new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32311", new Heilmittel("Kalium jodatum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32312", new Heilmittel("Allium cepa", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32313", new Heilmittel("Arsenicum jodatum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("32320", new Heilmittel("Sabadilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
			aussen.put("33010", new Heilmittel("bitte suchen Sie jetzt einen Arzt auf", ""));
			aussen.put("33040", new Heilmittel("Aethusa", "Dosis: nicht bekannt"));
			aussen.put("33041", new Heilmittel("Ignatia", "Dosis: nicht bekannt"));
			aussen.put("33042", new Heilmittel("Magnesium carbonicum", "Dosis: nicht bekannt"));
			aussen.put("33050", new Heilmittel("Chamomilla", "Dosis: nicht bekannt"));
			aussen.put("33051", new Heilmittel("Nux vomica", "Dosis: nicht bekannt"));
			
			
			
			
			
			
			
			
			
			
		}
	}
}
