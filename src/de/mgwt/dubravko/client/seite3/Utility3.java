package de.mgwt.dubravko.client.seite3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Utility3 {
	
	// Eine Map in der sich Maps befinden
	public static HashMap<String, HashMap<String, String []> > aussen;
	static List<String> options;
	
	public Utility3(){
		init();
		
	}
	
	public static void init(){
		if(aussen == null){
			aussen = new HashMap<String, HashMap<String, String[]>>();
			
			HashMap<String, String[]> verbrennungen = new HashMap<String, String[]>();
			String [] mitBlasen = {"stechendes Brennen, Kaelte bessert", "tomatenrot, Waerme bessert", "Mund, Lippen"};
			String [] ohneBlasen = {"juckend", "brennend, verlangt Kuehle", "brennend, verlangt Waerme"};
			String [] rohesFleisch = {"DRINGEND Arzt aufsuchen !!!"};
			verbrennungen.put("0", mitBlasen);
			verbrennungen.put("1", ohneBlasen);
			verbrennungen.put("2", rohesFleisch);
			aussen.put("1", verbrennungen);
			
			
			HashMap<String, String[]> zahnungsbeschwerden = new HashMap<String, String[]>();
			String [] roetungDesGesichts = {"beide Wangen, Beginn vor Mitternacht", "eine Wange rot, Besserung druch Herumtragen"};
			String [] durchfall = {"Roetung der Wangen oder  Blaesse, naechtliche Beschwerden", 
					"gelbich schleimig, Roetung beider Wangen", "sauer riechend, dicke Kinder",
					"stinkend spritzend, duenne Kinder, starke Blaehungen"};
			zahnungsbeschwerden.put("0", roetungDesGesichts);
			zahnungsbeschwerden.put("1", durchfall);
			aussen.put("2", zahnungsbeschwerden);
		
			HashMap<String, String[]> Bindehautentzuendung = new HashMap<String, String[]>();
			String [] ohneTraenen = {"heftig rote Entzuendung", "brennende Entzuendung"};
			String [] mitTraenenfluss = {"waesserige rote Schwellung", "eitriges Sekret", "brennende Entzuendung"};
			String [] mitTraenenflussalsFolgevonAllergien = 
				{"milde Traenen", "Augen jucken", "Augen brennen"};
			String [] mitTraenenalsFolgevonVerletzung = 
				{"Zugluft, Fremdkoerper,Veraetzung", "Kuenstliches Licht", "Fremdkoerper"};
			String [] mitTraenenFolgevonKaelteDurchnaessung = 
				{"Zugluft", "Lider morgens verklebt", "Traenen fliessen staendig", "brennende Traenen"};
			Bindehautentzuendung.put("0", ohneTraenen);
			Bindehautentzuendung.put("1", mitTraenenfluss);
			Bindehautentzuendung.put("2", mitTraenenflussalsFolgevonAllergien);
			Bindehautentzuendung.put("3", mitTraenenalsFolgevonVerletzung);
			Bindehautentzuendung.put("4", mitTraenenFolgevonKaelteDurchnaessung);
			aussen.put("3", Bindehautentzuendung);
			/* BLASENENTZÜNDUNG */
			HashMap<String, String[]> blasenentzuendung = new HashMap<String, String[]>();
			String [] ohneBettnaessen = {"ploetzliche Harnverhaltung, aengstlich, unruhig", 
					"Urin blutig,eiweisshaltig,Harndrang troepfchenweise",
					"heftige krampfartige Blasenentleerung, Brennen bei der Blasenentleerung",
					"troepfchenweise brennende sehr haeufige Blasenentleerungen",
					"schreien bei der Blasenentleerung"};
			String [] mitBettnaessen = {"Folge nasskalter Fuesse, Sitzen auf kaltem Boden", "Ploetzliche heftige Beschwerden"};
			blasenentzuendung.put("0", ohneBettnaessen);
			blasenentzuendung.put("1", mitBettnaessen);
			aussen.put("4", blasenentzuendung);
			/* MAGENDARMENTZÜNDUNG */
			HashMap<String, String[]> magendarmentzuendung = new HashMap<String, String[]>();
			String [] DurchfallbegleitetvonErbrechen = {
					"Stuhl wie Reiswasser oder Spinat", 
					"Stuhl gruenlich eher kleine Mengen",
					"Stuhl begleitet von starken Kraempfen",
					"Stuhl waesserig  viel unverdautes Essen",
					"Stuhl schussartig  viel unverdautes morgens",
					"Stuhl waessrig sauer gelblich gruen",
					"Stuhl wie Reiswasser"
				};
			String [] ErbrechenbegleitetvonDurchfall = {
					"erbricht etwa eine halbe Stunde nach dem Trinken", 
					"erbricht unverdautes lange nach dem Essen"
				};
			magendarmentzuendung.put("0", DurchfallbegleitetvonErbrechen);
			magendarmentzuendung.put("1", ErbrechenbegleitetvonDurchfall);
			aussen.put("5", magendarmentzuendung);
			/* FIEBER */
			HashMap<String, String[]> fieber = new HashMap<String, String[]>();
			String [] ploetzlich = {
					"aengstlich unruhig straker Durst", 
					"dampft schweissig ruhig / benommen maessiger Drust",
					"Kopf heiss Glieder kalt schwitzt kein Durst",
					"unruhiges kind stechender Schmerz kein durst",
					"Kind spielt bemerkt das Fieber nicht, Herzklopfen",
					"heisser Kopf, schrillschreiendes Kind",
					"Gelenke und Muskeln schmerzen, Fieber morgens",
					"Fieber Mittags am hoechsten wenig Schweiss",
					"alles verschlimmert das Befinden"
			};
			String [] undSchuettelfrost = {
					"kaltes Kind", 
					"blasses Kind schweissig",
					"heisses uebelriechendes Kind",
					"heisses Kind mit Uringeruch"
			};
			String [] undPhantasierenwie = {
					"Angst vergiftet zu werden, versteckt sich deshalb", 
					"Angst vergiftet zu werden, verweigert deshalb ",
					"Medikamente/Nahrung",
					"seine Extremitaeten gehoeren nicht zu ihm",
					"sei doppelt oder geteilt gestaltet",
					"springt aus dem Bett",
					"beisst in Bettwaesche, die eigenen Haende und die anderer"
			};
			fieber.put("0", ploetzlich);
			fieber.put("1", undSchuettelfrost);
			fieber.put("2", undPhantasierenwie);
			aussen.put("6", fieber);
			
			/* HALSSCHMERZEN */
			HashMap<String, String[]> halsschmerzen = new HashMap<String, String[]>();
			String [] ploetzlichFieber = {
					"sehr intensiver Schmerz", 
					"stechender Schmerz",
					"brennder Schmerz",
					"Dauerschmerz wie verbrannt",
					"Folge von Ueberanstrengung",
					"rauer Halsschmerz bei jedem Wetterwechsel"
			};
			String [] linksHalsschmerzen = {
					"sehr empfindlich wie zugeschnuert", 
					"Zungengrund gelb"
			};
			String [] rechtsHalsschmerzen = {
					"hochroter glaenzender Hals, schmerzhafter Schluckzwang", 
					"Zungenrand und Grund schmerzen"
			};
			halsschmerzen.put("0", ploetzlichFieber);
			halsschmerzen.put("1", linksHalsschmerzen);
			halsschmerzen.put("2", rechtsHalsschmerzen);
			aussen.put("7", halsschmerzen);
			
			/* MANDELSCHMERZEN */
			HashMap<String, String[]> mandelschmerzen = new HashMap<String, String[]>();
			String [] durst = {
					"Auf kalte Getraenke + heftiger Beginn der Beschwerden", 
					"Maessig, verlangt nach einem Schal um den Hals"
			};
			String [] keinDurst = {
					"stechende Schmerzen, verlangt nach Eiskrawatte um den Hals"
			};
			String [] eierstippchenAufDenMandeln = {
					"Verlangt nach Waerme", 
					"Verlangt nach Kaelte"
			};
			mandelschmerzen.put("0", durst);
			mandelschmerzen.put("1", keinDurst);
			mandelschmerzen.put("2", eierstippchenAufDenMandeln);
			aussen.put("8", mandelschmerzen);
			
			/* HUSTEN */
			HashMap<String, String[]> HUSTEN = new HashMap<String, String[]>();
			String [] trockenesFieber = {
					"Aengstliche Unruhe", 
					"Kind geht seine rueblichen beschaeftigung nach",
					"schlapp kraftlos",
					"Kind ohne Angst, grosse Hitze",
			};
			String [] schweissigesFieber = {
					"Kind weint vor Hustenanfaellen", 
					"Wechselt mit Frost"
			};
			String [] trockenOhneSchleim = {
					"schlimmer in warmen Raeumen", 
					"schlimmer in frischer Luft", 
					"zwischen 2-4 Uhr"
			};
			String [] schleimInNaseundRachen = {
					"fadenziehend", 
					"festsitzend der geraeuschvoll hervorgebracht werden kann", 
					"festsitzend, der nicht hervorgebracht werden kann",
					"gruenlich locker und reichlich",
					"weiss und locker",
					"Kind wuergt den Schleim, Zunge nicht belegt",
					"eitrig gruener Schleim, mehr morgens und abends",
					"sehr viel Schleim"
			};
			String [] schleimig = {
					"Husten fuehrt zu Atemnot", 
					"Kind wuergt, erstickt fast am eigenem Schleim", 
					"sehr zaeher Schleim, in den fruehen Morgenstunden", 
					"gruenlich und zaeh",
					"gruenlich und locker",
					"reifer kaesiger Schleim"
			};
			HUSTEN.put("0", trockenesFieber);
			HUSTEN.put("1", schweissigesFieber);
			HUSTEN.put("2", trockenOhneSchleim);
			HUSTEN.put("3", schleimInNaseundRachen);
			HUSTEN.put("4", schleimig);
			aussen.put("9", HUSTEN);
			
			/* PSEUDOKRUP */
			HashMap<String, String[]> PSEUDOKRUP = new HashMap<String, String[]>();
			String [] akuterAnfallmitLuftotgrosserAngstundBellhusten = {
					"Immer Folgende Mittel nach fester Reihefolge bis Besserung sich einstellt"
			};
			String [] beginn = {
					"um Mitternacht, sehr starke Angst", 
					"um Mitternacht, Kind weniger beeintraechtigt noch aengstlich",
					"nach  Mitternacht bis 1 Uhr",
					"vom Zubettgehen bis Mitternacht",
					"Morgens mit Heiserkeit",
					"Morgens mit heftigem Erstickungsgefühl"
			};
			String [] feuchtesWetteralsAusloeser = {
					"Kinder fiebern und sind sehr unruhig"
			};
			String [] KalttrockenesWetteralsAusloeser = {
					"Hohes Fieber nach einem Spaziergang, Pseudokrupp um Mitternacht", 
					"Heiserkeit nach einem Spaziergang, Pseudokrupp am Morgen"
			};
			PSEUDOKRUP.put("0", akuterAnfallmitLuftotgrosserAngstundBellhusten);
			PSEUDOKRUP.put("1", beginn);
			PSEUDOKRUP.put("2", feuchtesWetteralsAusloeser);
			PSEUDOKRUP.put("3", KalttrockenesWetteralsAusloeser);
			aussen.put("11", PSEUDOKRUP);
			
			/* NÄGELKAUEN */
			HashMap<String, String[]> NAEGELKAUEN = new HashMap<String, String[]>();
			String [] gemuetssymptomewie = {
					"Nervoesitaet begleitet von staendigem Grimassieren", 
					"Pedanterie (Uebertrieben genau)",
					"Unsicherheit",
					"Unterdrueckte Unsicherheit",
					"Gruebeln, macht sich Sorgen",
					"Nervoesitaet und staendiger Juckreiz",
					"Gehemmtes Verhalten",
					"Hyperaktivitaet"
			};
			NAEGELKAUEN.put("0", gemuetssymptomewie);
			aussen.put("12", NAEGELKAUEN);
			
			/* NASENBLUTEN 13 */
			HashMap<String, String[]> NASENBLUTEN = new HashMap<String, String[]>();
			String [] hellrotesBlut = {
					"blasse Kinder, die leicht erroeten", 
					"blasse zarte , huebsche Kinder"
			};
			String [] normalesBlut = {
					"rundliche rote Kinder",
					"nach Anstrengung / Popeln"
			};
			String [] dunklesBlut = {
					"Spannung und Druck in der Stirn", 
					"linker Nasenausgang"
			};
			NASENBLUTEN.put("0", hellrotesBlut);
			NASENBLUTEN.put("1", normalesBlut);
			NASENBLUTEN.put("2", dunklesBlut);
			aussen.put("13", NASENBLUTEN);
			
			/* OHRENSCHMALZ 14 */
			HashMap<String, String[]> OHRENSCHMALZ = new HashMap<String, String[]>();
			String [] farbe = {
					"rot", 
					"gelb",
					"weiss",
					"schwarz"
			};
			OHRENSCHMALZ.put("0", farbe);
			aussen.put("14", NAEGELKAUEN);
			
			/* SCHNUPFEN 15 */
			HashMap<String, String[]> SCHNUPFEN = new HashMap<String, String[]>();
			String [] Ursache = {
					"kalter trockener Ostwind", 
					"trockene Kaelte",
					"feuchte Kaelte",
					"Feuchtwarme Tage nach Kaelteperiode",
			};
			String [] Saeuglinge = {
					"auch Husten dabei", 
					"Kinder froesteln",
					"Sekret ist wundmachend",
					"gelblich-gruenliches Sekret zaeh",
					"staendig verstopfte Nase"
			};
			String [] FrischeLuftbessertdenSchnupfen = {
					"drinnen fliesst der Schnupfen", 
					"drinnen und nachts ist die Nase verstopft", 
					"obwohl die Kinder froestelig sind",
					"der Schnupfen ist stinkend"
			};
			String [] WaermebessertdenSchnupfen = {
					"jeder Art HITZE, ob trocken oder feucht", 
					"Schnupfen stockt draussen", 
					"Schnupfen mehr morgens und abends"
			};
			String [] schneuztstaendigabererfolglosdieNase = {
					"hat das Gefuehl die Nase ist staendig voll"
			};
			SCHNUPFEN.put("0", Ursache);
			SCHNUPFEN.put("1", Saeuglinge);
			SCHNUPFEN.put("2", FrischeLuftbessertdenSchnupfen);
			SCHNUPFEN.put("3", WaermebessertdenSchnupfen);
			SCHNUPFEN.put("4", schneuztstaendigabererfolglosdieNase);
			aussen.put("15", SCHNUPFEN);
			
			/* VERSTOPFUNG 16 */
			HashMap<String, String[]> VERSTOPFUNG = new HashMap<String, String[]>();
			String [] Kindtrinkteherwenig = {
					"Schliessmuskelkrampf", 
					"Kein Stuhldrang", 
					"Grosskalibrige Stuehle",
					"Verstopfung besonders wenn unterwegs"
			};
			String [] Stuhldrangvergeblich = {
					"Kind liest auf der Toilette"
			};
			String [] Stuhlschlupftzurck = {
					"ploetzlicher Afterverschluß",
					"krampfiger ploetzlicher Afterschmerz, haelt den Stuhl an sich"
			};
			
			String [] Fuehltsichwohl = {
					"sehr unwohl nach Entleerung des Stuhls"
			};
			VERSTOPFUNG.put("0", Kindtrinkteherwenig);
			VERSTOPFUNG.put("1", Stuhldrangvergeblich);
			VERSTOPFUNG.put("2", Stuhlschlupftzurck);
			VERSTOPFUNG.put("3", Fuehltsichwohl);
			aussen.put("16", VERSTOPFUNG);
			
			/* WARZEN 17 */
			HashMap<String, String[]> WARZEN = new HashMap<String, String[]>();
			String [] gesicht = {
					"Nase", 
					"Augenlied", 
					"ueberall"
			};
			String [] haende = {
					"um die Fingernaegel",
					"Fingerspitzen",
					"Handruecken",
					"ueberall wo Blumenkohl gefaechert",
					"klein hart und auch am Koerper",
					"weich glatt oder gestielt auch in der Achselhoehle und am Hals"
			};
			String [] fuesseschmerzlos = {
					"Jungs",
					"Maedchen"
			};
			
			String [] fuesseschmerzhaft = {
					"gehetzte, ungeduldige Kinder"
			};
			WARZEN.put("0", gesicht);
			WARZEN.put("1", haende);
			WARZEN.put("2", fuesseschmerzlos);
			WARZEN.put("3", fuesseschmerzhaft);
			aussen.put("17", WARZEN);
			
			/* UNFAELLE 18 */
			HashMap<String, String[]> UNFAELLE = new HashMap<String, String[]>();
			String [] elektrounfall = {
					"blasses Gesicht, Kribbeln, Aufregung, Angst"
			};
			String [] hundebiss = {
					"Risswunde, Scutz vor Vereiterungen",
					"Laengeranhaltende dunkle Blutung"
			};
			String [] schaedelHirnTrauma = {
					"Aussehen eher rosig", 
					"Aussehen blass"
			};
			UNFAELLE.put("0", elektrounfall);
			UNFAELLE.put("1", hundebiss);
			UNFAELLE.put("2", schaedelHirnTrauma);
			aussen.put("18", UNFAELLE);
			
			/* THEMENUMDASNEUGEBORENEKIND 20 */
			HashMap<String, String[]> THEMENUMDASNEUGEBORENEKIND = new HashMap<String, String[]>();
			String [] augenentzuendung = {
					"weisslich schleimig",
					"gelblich verklebt"
			};
			String [] hodenlage = {
					"nicht tastbar"
			};
			String [] wasserbruch = {
					"meist beidseitig"
			};
			String [] kopfekzem = {
					"schmächtiges Neugeborenes ",
					"dickes rundliches Neugeborenes"
			};
			String [] koerperekzem = {
					"gelbkrustig"
			};
			String [] schnupfen = {
					"gruen-gebliches Sekret"
			};
			String [] geburtsschock = {
					"Kind zittert, ist unruhig"
			};
			String [] schluesselbeinbruch = {
					"um schnelle Heilung zu foerdern"
			};
			String [] nervenquetschung = {
					"begleitet von Bewegungsausfaellen"
			};
			String [] blutergussderKopfhaut = {
					"sofort",
					"Sollte nach Arnica der Bluterguss verbleiben"
			};
			THEMENUMDASNEUGEBORENEKIND.put("0", augenentzuendung);
			THEMENUMDASNEUGEBORENEKIND.put("1", hodenlage);
			THEMENUMDASNEUGEBORENEKIND.put("2", wasserbruch);
			THEMENUMDASNEUGEBORENEKIND.put("3", kopfekzem);
			THEMENUMDASNEUGEBORENEKIND.put("4", koerperekzem);
			THEMENUMDASNEUGEBORENEKIND.put("5", schnupfen);
			THEMENUMDASNEUGEBORENEKIND.put("6", geburtsschock);
			THEMENUMDASNEUGEBORENEKIND.put("7", schluesselbeinbruch);
			THEMENUMDASNEUGEBORENEKIND.put("8", nervenquetschung);
			THEMENUMDASNEUGEBORENEKIND.put("9", blutergussderKopfhaut);
			aussen.put("20", THEMENUMDASNEUGEBORENEKIND);
			
			/* SCHULPROBLEME 21 */
			HashMap<String, String[]> SCHULPROBLEME = new HashMap<String, String[]>();
			String [] pruefungsangst = {
					"rasen zur Toilette", 
					"sehr blass verlassen die Toilette nicht mehr",
					"sehr sensible Knder verlieren ploetzlich die Nerven",
					"Brett vor dem Kopf obwohl gut vorbereitet"
			};
			SCHULPROBLEME.put("0", pruefungsangst);
			aussen.put("21", SCHULPROBLEME);
			
			/* COMPUTERKONSUM 22 */
			HashMap<String, String[]> COMPUTERKONSUM = new HashMap<String, String[]>();
			String [] ueberanstrengung = {
					"Augen brennen, druecken ",
					"Kopfschmerzen"
			};
			String [] gemuetsveraenderungen = {
					"Kind zeigt Aengste, Alptraeume",
					"Kind ist ueberdreht, schlaflos"
			};
			COMPUTERKONSUM.put("0", ueberanstrengung);
			COMPUTERKONSUM.put("1", gemuetsveraenderungen);
			aussen.put("22", COMPUTERKONSUM);
			
			/* TVKONSUM 23 */
			HashMap<String, String[]> TVKONSUM = new HashMap<String, String[]>();
			String [] schlaflos = {
					"durch Sorgen ueber die Sendung", 
					"durch Grausamkeiten in der Sendung",
					"durch Mitgefuehl ueber Schicksale und Ereignise"
			};
			TVKONSUM.put("0", schlaflos);
			aussen.put("23", TVKONSUM);
			
			/* INSEKTENSTICHE 24 */
			HashMap<String, String[]> INSEKTENSTICHE = new HashMap<String, String[]>();
			String [] mitJuckreiz = {
					"rote Schwellung, starker Schmerz",
					"wenig Schwellung"
			};
			String [] ohneJuckreiz = {
					"ohne Eiter, Aussehen wie Brennnessel",
					"mit Eiter, langsam Abheilend",
					"mit Eiter, frischer Stich"
			};
			String [] immerwiederuebermaessigeReaktion = {
					"zur Vorbeugung"
			};
			INSEKTENSTICHE.put("0", mitJuckreiz);
			INSEKTENSTICHE.put("1", ohneJuckreiz);
			INSEKTENSTICHE.put("2", immerwiederuebermaessigeReaktion);
			aussen.put("24", INSEKTENSTICHE);
			
			/* MITTELOHRENTZUENDUNG 25 */
			HashMap<String, String[]> MITTELOHRENTZUENDUNG = new HashMap<String, String[]>();
			String [] ohneAusflussausdemOhr1Tag = {
					"Kind mag Kaelte",
					"Kind mag Waerme"
			};
			String [] mitAusflussausdemOhr = {
					"Ausfluss gelbgruen",
					"Ausfluss  duenn, stinkend"
			};
			MITTELOHRENTZUENDUNG.put("0", ohneAusflussausdemOhr1Tag);
			MITTELOHRENTZUENDUNG.put("3", mitAusflussausdemOhr);
			aussen.put("25", MITTELOHRENTZUENDUNG);
			
			/* IMPFUNG 26 */
			HashMap<String, String[]> IMPFUNG = new HashMap<String, String[]>();
			String [] vorderImpfung = {
					"Angst vor Pieks/spitzem Gegenstand",
					"Probleme bei frueheren Impfungen"
			};
			String [] nachderImpfung = {
					"Allgemeinsymptome",
					"an der Einstichstelle"
			};
			IMPFUNG.put("0", vorderImpfung);
			IMPFUNG.put("1", nachderImpfung);
			aussen.put("26", IMPFUNG);
			
			/* SONNENBRAND */
			HashMap<String, String[]> SONNENBRAND = new HashMap<String, String[]>();
			String [] vorDerSonne = {
					"Ihr Kind reagiert auf den ersten Sonnenstrahl mit Roetung, Brennen, kleinen Blaeschen, Jucken"
			};
			String [] nachDerSonne = {
					"beim ersten Sonnenstrahl",
					"nach einiger Zeit in der Sonne "
			};
			SONNENBRAND.put("0", vorDerSonne);
			SONNENBRAND.put("1", nachDerSonne);
			aussen.put("27", SONNENBRAND);
			
			/* GERSTENKORN */
			HashMap<String, String[]> GERSTENKORN = new HashMap<String, String[]>();
			String [] schonLaenger = {
					"Unterlid", "Oberlid"
			};
			GERSTENKORN.put("0", schonLaenger);
			aussen.put("28", GERSTENKORN);
			
			/* BLAEHUNGEN */
			HashMap<String, String[]> BLAEHUNGEN = new HashMap<String, String[]>();
			String [] beimSaugling = {
					"Spaetnachmittags u. nachts", "kraeftiges, rotes Kind", "blasses Kind", "mit Verstopfung",
					"mit duennem Stuhl", "mit gurgelnden Blaehungen"
			};
			String [] beimaelterenkind = {
					"mit Durchfall", "mit Wechsel von Durchfall und Verstopfung "
			};
			BLAEHUNGEN.put("0", beimSaugling);
			BLAEHUNGEN.put("1", beimaelterenkind);
			aussen.put("29", BLAEHUNGEN);
			
			/* WACHSTUMSCHMERZ */
			HashMap<String, String[]> WACHSTUMSCHMERZ = new HashMap<String, String[]>();
			String [] mvue = {
					"Gelenke ueberstreckbar, leichtes Umknicken", 
					"stechender Schmerz, v.a. Unterschenkel", 
					"geistig und koerperlich ueberanstrengt"					
			};
			String [] ovue = {
					"stechender Schmerz, v.a. Unterschenkel", "Knochen- und Muskelschmerz"
			};
			WACHSTUMSCHMERZ.put("0", mvue);
			WACHSTUMSCHMERZ.put("1", ovue);
			aussen.put("30", WACHSTUMSCHMERZ);
			
			/* HEUSCHNUPFEN */
			HashMap<String, String[]> HEUSCHNUPFEN = new HashMap<String, String[]>();
			String [] fliessendeNase = {
					"mit Traenenfluss", 
					"ohne Traenenfluss"
			};
			String [] verstopfteNase = {
					"draussen schlimmer",
					"drinnen schlimmer"
			};
			String [] ohneNasenundTraenenfluss = {
					"Augen und Nase trocken, jucken",
					"Augen und Nase dick, heiss, geschwollen"
			};
			
			String [] Niesen = {
					"morgendlich",
					"anhaltend",
					"draussen",
					"drinnen"
			};
			HEUSCHNUPFEN.put("0", fliessendeNase);
			HEUSCHNUPFEN.put("1", verstopfteNase);
			HEUSCHNUPFEN.put("2", ohneNasenundTraenenfluss);
			HEUSCHNUPFEN.put("3", Niesen);
			aussen.put("32", HEUSCHNUPFEN);
			
			/* ERBRECHEN */
			HashMap<String, String[]> ERBRECHEN = new HashMap<String, String[]>();
			String [] ohneDurchfall = {
					"auf Reisen", 
					"erbricht Blut", 
					"nach dem Essen",
					"anhaltend", 
					"nach Schreck", 
					"aus Aerger"
			};
			String [] mitDurchfall = {
					"ohne Kraempfe",
					"mit Kraempfen, vergeblichem Wuergen"
			};
			ERBRECHEN.put("0", ohneDurchfall);
			ERBRECHEN.put("1", mitDurchfall);
			aussen.put("33", ERBRECHEN);
			
			/* SchreckSchock */
			HashMap<String, String[]> SchreckSchock = new HashMap<String, String[]>();
			String [] vorTieren = {
					"vor wilden Tieren", 
					"vor schwarzen Hunden", 
					"vor Insekten",
					"vor Spinnen", 
					"vor Schlangen"
			};
			String [] kannNichtAlleinsein = {
					"das kleinste Geraeusch erschrickt",
					"braucht viel Trost",
					"sieht Gespenster"
			};
			SchreckSchock.put("0", vorTieren);
			SchreckSchock.put("3", kannNichtAlleinsein);
			aussen.put("36", SchreckSchock);		}
	}
	
	public static HashMap<String, HashMap<String, String[]>> getList(){
		return aussen;
	}
	
	public static List<String> getListById(String id, String previd){
		options = new ArrayList<String>();
		
		System.out.println("Utility3 prevID = "+previd + " ; aktuelle ID = "+id);
		
		if(Integer.valueOf(id) <=7 ){
			
			System.out.println("Id von seite 2 : "+previd+"    "+id);
			
			String[]list = aussen.get((previd)).get(id);
			
			for(int i = 0; i < list.length; i++){
				
				options.add(list[i]);
			}
		}else{
			options.add("Aktuell nur bis zum Sonnenbrand implementiert!");
		}
		
		return options;
	}
	
	
}
