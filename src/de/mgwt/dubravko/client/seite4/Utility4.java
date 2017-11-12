package de.mgwt.dubravko.client.seite4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.mgwt.dubravko.client.model.Heilmittel;

public class Utility4 {
	
	// Eine Map in der sich Maps befinden
	public static HashMap<String, Heilmittel > aussen;
	// 
	static List<Heilmittel> options;
	public static HashMap<String, String > medikamentenBeschreibung;
	
	// Ids die zur Weiterleitung auf Seite5 führen
	static List<String>ids;
	static List<Heilmittel> optionsForForwarding;
	
	public Utility4(){
		initIdArrayForwarding();
		init();		
	}
	
	public static void initIdArrayForwarding(){
		ids = new ArrayList<String>();
		ids.add("2500");
		ids.add("2610");
		ids.add("2611");
		ids.add("2710");
		ids.add("2711");
		ids.add("2910");
		ids.add("3200");
		ids.add("3201");
		ids.add("3211");
		ids.add("3230");
		ids.add("3231");
		ids.add("3232");
		ids.add("3233");
		ids.add("3301");
		ids.add("3302");
		ids.add("3303");
		ids.add("3304");
		ids.add("3305");
		ids.add("3310");
	}
	
	public static List<Heilmittel> getListByIdForwardOptions(String index){
		optionsForForwarding = new ArrayList<Heilmittel>();
		
		if(index.equals("2500")){
			optionsForForwarding.add(0, new Heilmittel("stechender, schneidender Schmerz", ""));
			optionsForForwarding.add(1, new Heilmittel("Kind hoechst empfindlich, unleidlich", ""));
		}
		if(index.equals("2610")){
			optionsForForwarding.add(0, new Heilmittel("Fieber ", ""));
			optionsForForwarding.add(1, new Heilmittel("kein Fieber", ""));
		}
		if(index.equals("2611")){
			optionsForForwarding.add(0, new Heilmittel("juckend. naessend", ""));
			optionsForForwarding.add(1, new Heilmittel("eitrig, schlechte Heilung", ""));
		}
		if(index.equals("2710")){
			optionsForForwarding.add(0, new Heilmittel("sofort geroetet und brennend", ""));
			optionsForForwarding.add(1, new Heilmittel("winzige, brennende Blaeschen", ""));
		}
		if(index.equals("2711")){
			optionsForForwarding.add(0, new Heilmittel("mit Blasen", ""));
			optionsForForwarding.add(1, new Heilmittel("ohne Blasen - Durst", ""));
			optionsForForwarding.add(2, new Heilmittel("ohne Blasen - kein Durst", ""));
		}
		/* blähungen */
		if(index.equals("2910")){
			optionsForForwarding.add(0, new Heilmittel("gelblich-gruenlich", ""));
			optionsForForwarding.add(1, new Heilmittel("waessrig", ""));
		}
		if(index.equals("3200")){
			optionsForForwarding.add(0, new Heilmittel("drinnen schlimmer", ""));
			optionsForForwarding.add(1, new Heilmittel("draussen schlimmer", ""));
			optionsForForwarding.add(2, new Heilmittel("Erkaeltungsblaeschen an Nase und Lippen", ""));
		}
		if(index.equals("3201")){
			optionsForForwarding.add(0, new Heilmittel("Augen trocken, Nase waessrig", ""));
		}
		if(index.equals("3211")){
			optionsForForwarding.add(0, new Heilmittel("Traenen, Nasenfluss draussen", ""));
			optionsForForwarding.add(1, new Heilmittel("akut trocken verstopft", ""));
		}
		if(index.equals("3230")){
			optionsForForwarding.add(0, new Heilmittel("ununterbrochen nach dem Aufstehen", ""));
			optionsForForwarding.add(1, new Heilmittel("beim ersten Luftzug", ""));
			optionsForForwarding.add(2, new Heilmittel("nach jedem Schlaf", ""));
		}
		if(index.equals("3231")){
			optionsForForwarding.add(0, new Heilmittel("nach dem Aufstehen", ""));
			optionsForForwarding.add(1, new Heilmittel("schorfige Nase", ""));
			optionsForForwarding.add(2, new Heilmittel("wunde Nase, milde Traenen", ""));
			optionsForForwarding.add(3, new Heilmittel("scharfer Fliessschnupfen", ""));
		}
		if(index.equals("3232")){
			optionsForForwarding.add(0, new Heilmittel("traenenreich", ""));
			optionsForForwarding.add(1, new Heilmittel("traenenarm", ""));
		}
		if(index.equals("3233")){
			optionsForForwarding.add(0, new Heilmittel("Nasenfluss", ""));
		}
		if(index.equals("3301")){
			optionsForForwarding.add(0, new Heilmittel("grosse Menge, ploetzlich", ""));
			optionsForForwarding.add(1, new Heilmittel("kleine Menge, vorangehendes Erbrechen", ""));
		}
		if(index.equals("3302")){
			optionsForForwarding.add(0, new Heilmittel("nach Milch", ""));
			optionsForForwarding.add(1, new Heilmittel("alles durcheinander und zuviel", ""));
		}
		if(index.equals("3303")){
			optionsForForwarding.add(0, new Heilmittel("mit Durst", ""));
			optionsForForwarding.add(1, new Heilmittel("ohne Durst", ""));
		}
		if(index.equals("3304")){
			optionsForForwarding.add(0, new Heilmittel("will danach gleich wieder essen", ""));
			optionsForForwarding.add(1, new Heilmittel("Bauchweh", ""));
			optionsForForwarding.add(2, new Heilmittel("Kind und Erbrochenes saeuerlich", ""));
		}
		if(index.equals("3305")){
			optionsForForwarding.add(0, new Heilmittel("Wut, Zorn, Trotz", ""));
			optionsForForwarding.add(1, new Heilmittel("muerrisch, gereizt, \"sauer\"", ""));
		}
		if(index.equals("3310")){
			optionsForForwarding.add(0, new Heilmittel("Durchfall wie", ""));
		}
		return optionsForForwarding; 
	}
	
	public boolean isIdForForwarding(String id){
		if(ids.contains(id)){
			return true;
		}
		return false;
	}
	
	public static HashMap<String, Heilmittel> getList(){
		return aussen;
	}
	
	public static List<Heilmittel> getListById(String index){
		options = new ArrayList<Heilmittel>();
		options.add(aussen.get(index));
		return options; 
	}
	
	public String gehtMotherfucker(String key){
		return medikamentenBeschreibung.get(key);
	}
	
	// Daten initiert
		public static void init(){
			if(aussen == null){
				aussen = new HashMap<String, Heilmittel>();
				aussen.put("100", new Heilmittel("Apis mellifica", "Dosis: C30 stuendlich"));
				aussen.put("101", new Heilmittel("Belladonna", "Dosis: C30 stuendlich"));
				aussen.put("102", new Heilmittel("Hamamelis", "Dosis: C30 stuendlich"));
				aussen.put("110", new Heilmittel("Rhus Toxicodendron", "Dosis: C30 stuendlich"));
				aussen.put("111", new Heilmittel("Cantharis vesicatoria", "Dosis: C30 stuendlich"));
				aussen.put("112", new Heilmittel("Arsenicum album", "Dosis: C30 stuendlich"));
				aussen.put("200", new Heilmittel("Belladonna", "Dosis: D12 stuendliche Besserung"));
				aussen.put("201", new Heilmittel("Chamomilla", "Dosis: unbekannt"));
				aussen.put("210", new Heilmittel("Ferrum phosphoricum", "Dosis: unbekannt"));
				aussen.put("211", new Heilmittel("Podophyllum", "Dosis: unbekannt"));
				aussen.put("212", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("213", new Heilmittel("Calcium phosphoricum", "Dosis: unbekannt"));
				aussen.put("300", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("301", new Heilmittel("Ferrum phosphoricum", "Dosis: unbekannt"));
				aussen.put("310", new Heilmittel("Apis mellifica", "Dosis: unbekannt"));
				aussen.put("311", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				aussen.put("312", new Heilmittel("Sulfur", "Dosis: unbekannt"));
				aussen.put("320", new Heilmittel("Euphrasia", "Dosis: unbekannt"));
				aussen.put("321", new Heilmittel("Euphorbium", "Dosis: unbekannt"));
				aussen.put("322", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("330", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("331", new Heilmittel("Euphrasia", "Dosis: unbekannt"));
				aussen.put("332", new Heilmittel("Sulfur", "Dosis: unbekannt"));
				aussen.put("340", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("341", new Heilmittel("Pulsatilla", "Dosis: unbekannt"));
				aussen.put("342", new Heilmittel("calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("343", new Heilmittel("Mercurius solubilis", "Dosis: unbekannt"));
				aussen.put("400", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("401", new Heilmittel("Apis mellifica", "Dosis: unbekannt"));
				aussen.put("402", new Heilmittel("Cantharis vesicatoria", "Dosis: unbekannt"));
				aussen.put("403", new Heilmittel("Nux vomica", "Dosis: unbekannt"));
				aussen.put("404", new Heilmittel("Sarsaparila", "Dosis: unbekannt"));
				aussen.put("410", new Heilmittel("Dulcamara", "Dosis: unbekannt"));
				aussen.put("411", new Heilmittel("Petroleum", "Dosis: unbekannt"));
				aussen.put("500", new Heilmittel("Veratrum album", "Dosis: unbekannt"));
				aussen.put("501", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("502", new Heilmittel("Cuprum", "Dosis: unbekannt"));
				aussen.put("503", new Heilmittel("Secale", "Dosis: unbekannt"));
				aussen.put("504", new Heilmittel("Podophyllum", "Dosis: unbekannt"));
				aussen.put("505", new Heilmittel("Iris", "Dosis: unbekannt"));
				aussen.put("506", new Heilmittel("Jatropha curcas", "Dosis: unbekannt"));
				aussen.put("510", new Heilmittel("Phosphorus", "Dosis: unbekannt"));
				aussen.put("511", new Heilmittel("Kreosotum", "Dosis: unbekannt"));
				aussen.put("600", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("601", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("602", new Heilmittel("Veratrum viride", "Dosis: unbekannt"));
				aussen.put("603", new Heilmittel("Apis mellifica", "Dosis: unbekannt"));
				aussen.put("604", new Heilmittel("Ferrum ph.", "Dosis: unbekannt"));
				aussen.put("605", new Heilmittel("Cham.", "Dosis: unbekannt"));
				aussen.put("606", new Heilmittel("Eup. Perf.", "Dosis: unbekannt"));
				aussen.put("607", new Heilmittel("Stramonium", "Dosis: unbekannt"));
				aussen.put("608", new Heilmittel("Mercurius sol.", "Dosis: unbekannt"));
				aussen.put("610", new Heilmittel("Pyrogenium", "Dosis: unbekannt"));
				aussen.put("611", new Heilmittel("China", "Dosis: unbekannt"));
				aussen.put("612", new Heilmittel("Baptisia", "Dosis: unbekannt"));
				aussen.put("613", new Heilmittel("Cantharis", "Dosis: unbekannt"));
				
				aussen.put("620", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("621", new Heilmittel("Lach", "Dosis: unbekannt"));
				aussen.put("622", new Heilmittel("Baptisia", "Dosis: unbekannt"));
				aussen.put("623", new Heilmittel("Stram", "Dosis: unbekannt"));
				aussen.put("624", new Heilmittel("Petroleum", "Dosis: unbekannt"));
				aussen.put("625", new Heilmittel("Agaricus", "Dosis: unbekannt"));
				aussen.put("626", new Heilmittel("Cuprum", "Dosis: unbekannt"));
				/*Halsschmerzen*/
				aussen.put("700", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("701", new Heilmittel("Apis mellifica", "Dosis: unbekannt"));
				aussen.put("702", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("703", new Heilmittel("Cantharis", "Dosis: unbekannt"));
				aussen.put("704", new Heilmittel("Nux vomica", "Dosis: unbekannt"));
				aussen.put("705", new Heilmittel("Merc. Solubilis", "Dosis: unbekannt"));
				
				aussen.put("710", new Heilmittel("Lachesis", "Dosis: unbekannt"));
				aussen.put("711", new Heilmittel("Mercurius bijodtus", "Dosis: unbekannt"));
				
				aussen.put("720", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("721", new Heilmittel("Phytolacca", "Dosis: unbekannt"));
				/* Mandelschmerzen */
				aussen.put("800", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("801", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				
				aussen.put("810", new Heilmittel("Apis mellifica", "Dosis: unbekannt"));
				
				aussen.put("820", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				aussen.put("821", new Heilmittel("Mercurius sol.", "Dosis: unbekannt"));
				/* HUSTEN */
				aussen.put("900", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("901", new Heilmittel("Ferrum phophsoricum", "Dosis: unbekannt"));
				aussen.put("902", new Heilmittel("Gelsemium", "Dosis: unbekannt"));
				aussen.put("903", new Heilmittel("Vertrum viride", "Dosis: unbekannt"));
				aussen.put("910", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("911", new Heilmittel("Mrcuruius sol.", "Dosis: unbekannt"));
				aussen.put("920", new Heilmittel("Bryonia", "Dosis: unbekannt"));
				aussen.put("921", new Heilmittel("Phosphorus", "Dosis: unbekannt"));
				aussen.put("922", new Heilmittel("Kalium carbonicum", "Dosis: unbekannt"));
				aussen.put("930", new Heilmittel("Kalium bichromicum", "Dosis: unbekannt"));
				aussen.put("931", new Heilmittel("Corallium rubrum", "Dosis: unbekannt"));
				aussen.put("932", new Heilmittel("Rumex", "Dosis: unbekannt"));
				aussen.put("933", new Heilmittel("Pulsatilla", "Dosis: unbekannt"));
				aussen.put("934", new Heilmittel("Kalium sulfuricum", "Dosis: unbekannt"));
				aussen.put("935", new Heilmittel("Ipecacuanha", "Dosis: unbekannt"));
				aussen.put("936", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				aussen.put("937", new Heilmittel("Dulcamara", "Dosis: unbekannt"));
				aussen.put("940", new Heilmittel("Tartarus stibiatus", "Dosis: unbekannt"));
				aussen.put("941", new Heilmittel("Coccus cacti", "Dosis: unbekannt"));
				aussen.put("942", new Heilmittel("Kalium bichromicum", "Dosis: unbekannt"));
				aussen.put("943", new Heilmittel("Stannum jodatum", "Dosis: unbekannt"));
				aussen.put("944", new Heilmittel("Pulsatilla", "Dosis: unbekannt"));
				aussen.put("945", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				/* PSEUDOKRUP */
				aussen.put("1100", new Heilmittel("Aconitum/Spongia/Hepar sulfuris/Jodum/Bromum", "Dosis: unbekannt"));
				aussen.put("1110", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("1111", new Heilmittel("Ferrum phosph.", "Dosis: unbekannt"));
				aussen.put("1112", new Heilmittel("Veratrum viride", "Dosis: unbekannt"));
				aussen.put("1113", new Heilmittel("Drosera", "Dosis: unbekannt"));
				aussen.put("1114", new Heilmittel("Spongia", "Dosis: unbekannt"));
				aussen.put("1115", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				aussen.put("1116", new Heilmittel("Lachesis", "Dosis: unbekannt"));
				aussen.put("1120", new Heilmittel("Jodum", "Dosis: unbekannt"));
				aussen.put("1130", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("1131", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				/* NÄGELKAUEN */
				aussen.put("1200", new Heilmittel("Cina", "Dosis: unbekannt"));
				aussen.put("1201", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("1202", new Heilmittel("Silicea", "Dosis: unbekannt"));
				aussen.put("1203", new Heilmittel("Lycopodium", "Dosis: unbekannt"));
				aussen.put("1204", new Heilmittel("Natrium muriaticum", "Dosis: unbekannt"));
				aussen.put("1205", new Heilmittel("Sulfur", "Dosis: unbekannt"));
				aussen.put("1206", new Heilmittel("Carcinosinum", "Dosis: unbekannt"));
				aussen.put("1207", new Heilmittel("Medorrhinum", "Dosis: unbekannt"));
				/* NASENBLUTEN */
				aussen.put("1300", new Heilmittel("Ferrum phosphoricum", "Dosis: unbekannt"));
				aussen.put("1301", new Heilmittel("Phosphor", "Dosis: unbekannt"));
				aussen.put("1310", new Heilmittel("Belladonna", "Dosis: unbekannt"));
				aussen.put("1311", new Heilmittel("Arnica", "Dosis: unbekannt"));
				aussen.put("1320", new Heilmittel("Hamamelis", "Dosis: unbekannt"));
				aussen.put("1321", new Heilmittel("Lachesis", "Dosis: unbekannt"));
				/* OHRENSCHMALZ */
				aussen.put("1400", new Heilmittel("Conium", "Dosis: unbekannt"));
				aussen.put("1401", new Heilmittel("Causticum", "Dosis: unbekannt"));
				aussen.put("1402", new Heilmittel("Lachesis", "Dosis: unbekannt"));
				aussen.put("1403", new Heilmittel("Pulsatilla", "Dosis: unbekannt"));
				/* SCHNUPFEN */
				aussen.put("1500", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("1501", new Heilmittel("Nux vomica", "Dosis: unbekannt"));
				aussen.put("1502", new Heilmittel("Merc. Sol.", "Dosis: unbekannt"));
				aussen.put("1503", new Heilmittel("Gelsemium", "Dosis: unbekannt"));
				aussen.put("1510", new Heilmittel("Sambucus nigra", "Dosis: unbekannt"));
				aussen.put("1511", new Heilmittel("Sabadilla", "Dosis: unbekannt"));
				aussen.put("1512", new Heilmittel("Hydrastis", "Dosis: unbekannt"));
				aussen.put("1513", new Heilmittel("Kalium bichromicum", "Dosis: unbekannt"));
				aussen.put("1514", new Heilmittel("Ammonium carbonicum", "Dosis: unbekannt"));
				aussen.put("1520", new Heilmittel("Allium cepa", "Dosis: unbekannt"));
				aussen.put("1521", new Heilmittel("Nux vomica", "Dosis: unbekannt"));
				aussen.put("1522", new Heilmittel("Pulsatilla", "Dosis: unbekannt"));
				aussen.put("1523", new Heilmittel("Merc. Sol.", "Dosis: unbekannt"));
				aussen.put("1530", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("1531", new Heilmittel("Dulcamara", "Dosis: unbekannt"));
				aussen.put("1532", new Heilmittel("Hepar sulfuris", "Dosis: unbekannt"));
				aussen.put("1540", new Heilmittel("Sticta", "Dosis: unbekannt"));
				/* VERSTOPFUNG */
				aussen.put("1600", new Heilmittel("Silicea", "Dosis: unbekannt"));
				aussen.put("1601", new Heilmittel("Alumina", "Dosis: unbekannt"));
				aussen.put("1602", new Heilmittel("Bryonia", "Dosis: unbekannt"));
				aussen.put("1603", new Heilmittel("Platinum", "Dosis: unbekannt"));
				aussen.put("1610", new Heilmittel("Nux vomica", "Dosis: unbekannt"));
				aussen.put("1620", new Heilmittel("Silicea", "Dosis: unbekannt"));
				aussen.put("1621", new Heilmittel("Staphisagria", "Dosis: unbekannt"));
				aussen.put("1630", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				/* WARZEN */
				aussen.put("1700", new Heilmittel("Causticum", "Dosis: unbekannt"));
				aussen.put("1701", new Heilmittel("Acidum nitricum", "Dosis: unbekannt"));
				aussen.put("1702", new Heilmittel("Thuja", "Dosis: unbekannt"));
				aussen.put("1710", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("1711", new Heilmittel("Causticum", "Dosis: unbekannt"));
				aussen.put("1712", new Heilmittel("Anacurdium", "Dosis: unbekannt"));
				aussen.put("1713", new Heilmittel("Thuja", "Dosis: unbekannt"));
				aussen.put("1714", new Heilmittel("Antimonium crudum", "Dosis: unbekannt"));
				aussen.put("1715", new Heilmittel("Natrium sulfuricum", "Dosis: unbekannt"));
				aussen.put("1720", new Heilmittel("Natrium chloratum", "Dosis: unbekannt"));
				aussen.put("1721", new Heilmittel("Sepia", "Dosis: unbekannt"));
				aussen.put("1730", new Heilmittel("Antimonium crudum", "Dosis: unbekannt"));
				/* UNFAELLE */
				aussen.put("1800", new Heilmittel("Phosphorus", "Dosis: unbekannt"));
				aussen.put("1810", new Heilmittel("Calendula", "Dosis: unbekannt"));
				aussen.put("1811", new Heilmittel("Hamamelis", "Dosis: unbekannt"));
				aussen.put("1820", new Heilmittel("Arnica", "Dosis: unbekannt"));
				aussen.put("1821", new Heilmittel("Hyoscyamus", "Dosis: unbekannt"));
				/* ZAEHNEKNIRSCHEN */
				aussen.put("190", new Heilmittel("Cina", "Dosis: unbekannt"));
				aussen.put("191", new Heilmittel("Zincum met.", "Dosis: unbekannt"));
				/* THEMEN UM DAS NEUGEBORENE */
				aussen.put("2000", new Heilmittel("Kalium sulfuricum", "Dosis: unbekannt"));
				aussen.put("2001", new Heilmittel("Medorrhinum", "Dosis: unbekannt"));
				aussen.put("2010", new Heilmittel("Sepia", "Dosis: unbekannt"));
				aussen.put("2020", new Heilmittel("Thuja", "Dosis: unbekannt"));
				aussen.put("2030", new Heilmittel("Lycopodium", "Dosis: unbekannt"));
				aussen.put("2031", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("2040", new Heilmittel("Graphites", "Dosis: unbekannt"));
				aussen.put("2050", new Heilmittel("Medorrhinum", "Dosis: unbekannt"));
				aussen.put("2060", new Heilmittel("Aconitum", "Dosis: unbekannt"));
				aussen.put("2070", new Heilmittel("Symphytum", "Dosis: unbekannt"));
				aussen.put("2080", new Heilmittel("Hypericum", "Dosis: unbekannt"));
				aussen.put("2090", new Heilmittel("Arnica", "Dosis: unbekannt"));
				aussen.put("2091", new Heilmittel("Acidum sulfuricum", "Dosis: unbekannt"));
				/* SCHULPROBLEME */
				aussen.put("2100", new Heilmittel("Argentum nitricum", "Dosis: unbekannt"));
				aussen.put("2101", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("2102", new Heilmittel("Ignatia", "Dosis: unbekannt"));
				aussen.put("2103", new Heilmittel("Strophantus", "Dosis: unbekannt"));
				/* COMPUTERKONSUM */
				aussen.put("2200", new Heilmittel("Ruta", "Dosis: unbekannt"));
				aussen.put("2201", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("2210", new Heilmittel("Phosphorus", "Dosis: unbekannt"));
				aussen.put("2211", new Heilmittel("Cocculus", "Dosis: unbekannt"));
				/* TVKONSUM */
				aussen.put("2300", new Heilmittel("Ambra", "Dosis: unbekannt"));
				aussen.put("2301", new Heilmittel("Calcium carbonicum", "Dosis: unbekannt"));
				aussen.put("2302", new Heilmittel("Causticum", "Dosis: unbekannt"));
				/* INSEKTENSTICHE */
				aussen.put("2400", new Heilmittel("Apis melifica", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2401", new Heilmittel("Ledum palustre", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2410", new Heilmittel("Urtica urens", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2411", new Heilmittel("Silicea", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2412", new Heilmittel("Hepar sulfuris", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("2420", new Heilmittel("Staphisagria", "Dosis: C30 , 3 Globuli alle 4 Wochen"));
				aussen.put("2501", new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* MITTELOHRENTZUENDUNG */
				aussen.put("2500", new Heilmittel("Aconitum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("2501", new Heilmittel("Chamomilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("2502", new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("251", new Heilmittel("Ferrum Phosphoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("252", new Heilmittel("suchen Sie bitte heute einen Arzt auf, begleitende Behandlung Ferrum ph.", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("2530", new Heilmittel("suchen Sie bitte heute einen Arzt auf, begleitende Behandlung Pulsatilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				aussen.put("2531", new Heilmittel("suchen Sie bitte heute einen Arzt auf, begleitende Behandlung Mercurius solubilis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli"));
				/* IMPFUNG */
				aussen.put("2600", new Heilmittel("Silicea", "Dosis: D12 oder C12 einmalig vor Impfung"));
				aussen.put("2601", new Heilmittel("Thuja occidentalis", "Dosis: D12 oder C12 einmalig vor du nach Impfung"));
				/* SONNENBRAND */
				aussen.put("2700", new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* Gerstenkorn */
				aussen.put("281", new Heilmittel("Staphisagria", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2800", new Heilmittel("Staphisagria", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2801", new Heilmittel("Pulsatilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* BLAEHUNGEN */
				aussen.put("2900", new Heilmittel("Lycopodium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2901", new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2902", new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2903", new Heilmittel("Nux vomica", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2904", new Heilmittel("Carbo vegetabilis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2905", new Heilmittel("Lycopodium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("2911", new Heilmittel("Okoubaka", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* WACHSTUMSSCHMERZ */
				aussen.put("3000", new Heilmittel("Calcium phosphoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3001", new Heilmittel("Guaiacum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3002", new Heilmittel("Acidum phosphoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3010", new Heilmittel("Guaiacum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3011", new Heilmittel("Acidum phosphoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* DAUMENLUTSCHEN */
				aussen.put("310100", new Heilmittel("Lycopodium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("311100", new Heilmittel("Silicea", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* HEUSCHNUPFEN */
				aussen.put("3210", new Heilmittel("Arsenicum album", "Dosis: unbekannt"));
				aussen.put("3220", new Heilmittel("Euphorbium", "Dosis: unbekannt"));
				aussen.put("3221", new Heilmittel("Aconitum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* Erbrechen */
				aussen.put("3300", new Heilmittel("siehe Kapitel Reisekrankheit", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3311", new Heilmittel("Cuprum", "Dosis: nicht bekannt"));
				/* FOLGEVONSCHRECKSCHOCK */
				aussen.put("350", new Heilmittel("Arnica montana", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("351", new Heilmittel("Gelsemium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("352", new Heilmittel("Ignatia", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("353", new Heilmittel("Opium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("354", new Heilmittel("Natrium chloratium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("355", new Heilmittel("Aconitum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("356", new Heilmittel("Acidum phosphoricum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				/* ANGST UND UNRUHE */
				aussen.put("3600", new Heilmittel("Strammonium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3601", new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3602", new Heilmittel("Calcium carbonicum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3603", new Heilmittel("Calcium carbonicum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3604", new Heilmittel("Lachesis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("361", new Heilmittel("Silicea", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("362", new Heilmittel("Aconitum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3630", new Heilmittel("Phosphorus", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3631", new Heilmittel("Pulsatilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
				aussen.put("3632", new Heilmittel("Strammonium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
			}
			if(medikamentenBeschreibung == null){
				medikamentenBeschreibung = new HashMap<String, String>();
				String apisBeschreibung = "Honigbiene\nCharakteristische Eigenschaften des Mittels:\n"+
											"1. Schmerzen brennen, sind steckend.\n"+
											"2. Die Kinder vertragen keine Waerme noch Beruehrung.\n"+
											"3. Haeufig leichtsinnige junge Maedchen mit Sucht nach Idolen in der Pubertaet\n"+
											"4. Haeufig sind die Kinder unruhig, unbeherscht und zappelig.\n"+
											"5. Sie neigen zu Unfaellen, sind unachtsam, Folgen sind zahllose Fehlleistungen.";
				medikamentenBeschreibung.put("Apis mellifica", apisBeschreibung);
				
				String ArsenicumAlbum = "Charakteristische Eigenschaften des Mittels:" +
						"1. Sehr aengstlich, nach dem Motto jeder Fehler koennte toedlich sein." +
						"2. Diese wird durch Perfektionismus, Ehrgeiz und Disziplin versucht zu bewaeltigen." +
						"3. Alle Empfindungen brennen." +
						"4. Sie sind schlaflos , schlimmste Zeit zwischen 0-2 Uhr. Sie sind ruhelos." +
						"5. Die kinder sind wenn sie krank sind sehr schnell erschoepft. Die Absonderungen bei den " +
						"Krankheiten sind scharf wundmachend, duenn uebelriechend und aetzend.";
				medikamentenBeschreibung.put("Arsenicum album", ArsenicumAlbum);
				
				String aconitum ="Charakteristische Eigenschaften des Mittels: " +
						"1. Alle Krankheitszeichen beginnen ploetzlich und mit grosser Staerke." +
						"2. Die Krankheitszeichen folgen immer nach kaltem trockenen Wind." +
						"3. Die Symptome sind nachts , um Mitternacht schlimmer." +
						"4. Gemuet: Panik und Unruhe charakterisieren den Krankheitszustand.";
				medikamentenBeschreibung.put("Aconitum", aconitum);
				
				String belladonna ="Die Tollkirsche, das giftige Nachtschattengewaechs, ist von Westeuropa bis zum " +
						"Himalaja verbreitet. Sie kommt vor allem in Laubwaeldern vor. Die glockenfoermigen Blueten sind purpurfarben, im Herbst traegt die Pflanze schwarze Beeren." +
						"Belladonna, die Tollkirsche, ist eine starke Giftpflanze, die man auf keinem Fall unverduennt einnehmen sollte!" +
						"In der Homoeopathie jedoch findet Belladonna Anwendung als bewaehrtes Grippemittel, das zum Beispiel bei Fieber und Kopfschmerzen helfen kann." +
						"Belladonna hilft bei Erkaeltungen, Entzuendungen, Sonnenbrand und Kraempfen. Belladonna besitzt eine mit Aconitum komplementaere " +
						"Wirkung und wird oft nach Aconitum eingesetzt." +
						"Belladonna hilft bei Infekten, wenn der Betroffene ein hoch rotes Gesicht hat und stark schwitzt. Zudem hilft es bei Schmerzzustaenden, z.B. im Mittelohr, im Hals oder auch bei Kopfschmerzen bei grippalen Infekten," +
						"wenn die Schmerzen wellenfoermig, pochend oder pulsierend sind. Diese Beschwerden entwickeln sich sehr schnell und sind sehr stark";
				medikamentenBeschreibung.put("Belladonna", belladonna);
				
				String euphrasia = "Euphrasia, der Augentrost, wird in der Pflanzenheilkunde für Probleme mit den Augen " +
						"verwendet. Daher auch der Name Augentrost. Auch in der Homoeopathie verwendet man den Augentrost " +
						"bei Augenentzuendungen oder auch bei Schnupfen. " +
						"Bei Bindehautentzuendungen ist es eines der wichtigsten Mittel.";
				medikamentenBeschreibung.put("Euphrasia", euphrasia);
				
				String hamamelis = "Hamamelis virginica ist ein oft eingesetztes homoeopathisches Mittel." +
						"Hamamelis virginica wird haeufig zur Behandlung von Krampfadern, Haemorrhoiden und Depression angewendet." +
						"Auf den ersten Blick wirken Menschen, die Hamamelis virginica brauchen, oft reizbar, ideenreich und unruhig." +
						"In der Laienhomoeopathie wird Hamamelis virginica haeufig in den Potenzen Urtinktur bis D4 verwendet." +
						"In anderem Zusammenhang wird Hamamelis virginica auch Virginische Zaubernuss und Zauberhasel genannt.";
				medikamentenBeschreibung.put("Hamamelis", hamamelis);
				
				String Cantharisvesicatoria = "Viele kennen Cantharis, die spanische Fliege, als (umstrittenes) Aphrodisiakum. " +
						"In der Homoeopathie wird von diesem vermeintlichen Effekt jedoch kein Gebrauch gemacht." +
						"Vielmehr hilft Cantharis bei brennenden Entzuendungen aller Art. Merken kann man sich also Cantharis " +
						"vesicatoria bei brennenden Schmerzen aller Art. Cantharis ist bei Sonnenbrand und allen anderen " +
						"Verbrennungen oder Veraetzungen als geeignetes Arzneimittel angezeigt. Aber auch bei Entzuendungen von " +
						"Blase, Niere und Harnleiter gilt Cantharis als bewaehrtes Heilmittel.";
				medikamentenBeschreibung.put("Cantharis vesicatoria", Cantharisvesicatoria);
				
				String RhusToxicodendron = "Rhus toxicodendron, der Giftsumach, ist ein wichtiges Mittel bei allen moeglichen Beschwerden des " +
						"Bewegungsapparates, also zum Beispiel Verrenkungen, Zerrungen oder auch nach Ueberanstrengung. Es " +
						"gehoert in die Hausapotheke jedes Sportlers. Ein charakteristisches Merkmal ist: Bewegung und Waerme " +
						"verbessern die Beschwerden, Ruhe und Kaelte verschlechtern die Beschwerden." +
						"Rhus toxicodendron ist ein Mittel, das ueber ein besonders vielfaeltiges Arzneimittelbild verfuegt. So hilft Rhus " +
						"toxicodendron auch bei vielen schmerzhaften Beschwerden, z.B. Hexenschuss, Ischiasbeschwerden, " +
						"rheumatische Schmerzen in Knochen, Gelenken, Sehnen und Muskeln, Nervenschmerzen sowie Folgen von " +
						"Verletzungen und Ueberanstrengungen, besonders wenn sich die Beschwerden durch fortgesetzte Bewegung " +
						"verbessern. Ausserdem hilft das Mittel bei Herpes, wenn der Ausschlag verbunden ist mit starkem Brennen und " +
						"Jucken und sich die Beschwerden durch Hitze und heisses Wasser verbessern. Zudem hilft Rhus auch Unruhe " +
						"und Verstimmungszustaende, fieberhafte Infektionskrankheiten und sogar juckende Hauterkrankungen koennen auf " +
						"diese Arzneimittel ansprechen. Betroffene, denen Rhus toxicodendron hilft, sind im Allgemeinen sehr unruhig.";
				medikamentenBeschreibung.put("Rhus Toxicodendron", RhusToxicodendron);
				
				String petroleum = "Petroleum ist eine natuerliche braune Fluessigkeit, ein komplexes " +
						"Stoffgemisch aus Kohlenwasserstoffen und das Resultat der chemischen Veraenderung von Erdoel. " +
						"Dieses ist in Sedimentgestein in der Erdkruste eingelagert und wird mit Pumpen aus den " +
						"hauptsaechlich tief im Meer liegenden Lagerstaetten zutage gefoerdert. Es handelt sich um " +
						"einen natuerlichen mineralischen Stoff von grossem Nutzen in der Homoeopathie. " +
						"Dies um so mehr, als er in die Herstellung eines homoeopathischen Heilmittels, " +
						"naemlich destilliertem Petroleum, einfliesst. Zu seiner Herstellung wird das Rohoel destilliert" +
						" und gereinigt, die erhaltene oelige Fluessigkeit ist Hauptbestandteil des Homoeopathikums " +
						"Petroleum bzw. Steinoel. Verduennt und verschuettelt erhaelt die dynamisierte Basis " +
						"schliesslich therapeutische Eigenschaften, mit denen sich eine Vielzahl von Krankheitsbildern " +
						"behandeln lassen.";
				medikamentenBeschreibung.put("Petroleum", petroleum);
				
				String Phosphorus = "Phosphorus, der gelbe Phosphor, ist fuer Menschen, die offen und symphatisch sind, " +
						"sie schliessen schnell Kontakte, sind hilfsbereit. Sie zeigen oft ihre Gefuehle, " +
						"sind meist hoch gewachsen und schlank, zudem besitzen sie meist eine helle feine Haut, " +
						"blondes bis roetliches, feines Haar und ein graziles Aeusseres. Sie wirken enthusiastisch, " +
						"lebendig, sind mitfuehlend und haben eine ausgepraegte Phantasie. Sie fuehlen sich meist ungeliebt. " +
						"Sie haben Hitzewallungen bei Aufregung, zudem fuerchten sie sich vor Gewittern, Leiden " +
						"durch Kummer und durch unglueckliche Liebe. Sie haben ein Ohr fuer das Leid anderer und wollen Liebe " +
						"schenken. Sie haben eine wunderbar warme Stimme, die man nicht ueberhoeren kann. Jedoch steckt hinter all " +
						"dem ein Gefuehl von zu wenig Aufmerksamkeit und Liebe. Sie sind dadurch verunsichert. Meist haben sie " +
						"nur oberflaechliche Beziehungen. Sie lieben Eiscreme und wachsen als Kind sehr schnell.";
				medikamentenBeschreibung.put("Phosphorus", Phosphorus);
				
			}
		}
}
