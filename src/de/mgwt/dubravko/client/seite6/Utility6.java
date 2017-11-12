package de.mgwt.dubravko.client.seite6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.mgwt.dubravko.client.model.Heilmittel;

public class Utility6 {

	static List<Heilmittel> medis;
	
	public Utility6(){
//		initIdArrayForwarding();
//		init();		
	}

	public static List<Heilmittel> getListById(String index){
		medis = new ArrayList<Heilmittel>();
		
		if(index.equals("261000")){
			medis.add(0, new Heilmittel("Thuja occidentalis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("261001")){
			medis.add(0, new Heilmittel("Gelsemium", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("261010")){
			medis.add(0, new Heilmittel("Zincum metallicum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("261011")){
			medis.add(0, new Heilmittel("Pulsatilla", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("271110")){
			medis.add(0, new Heilmittel("Belladonna", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("271120")){
			medis.add(0, new Heilmittel("Rhus tox.", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("271121")){
			medis.add(0, new Heilmittel("Arsenicum album", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("271100")){
			medis.add(0, new Heilmittel("Natrium chloratum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("271101")){
			medis.add(0, new Heilmittel("Cantharis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("291010")){
			medis.add(0, new Heilmittel("Colocynthis", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("291011")){
			medis.add(0, new Heilmittel("Veratrum album", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("320000")){
			medis.add(0, new Heilmittel("Allium cepa", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("320001")){
			medis.add(0, new Heilmittel("Jodum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323010")){
			medis.add(0, new Heilmittel("Nux vomica", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323011")){
			medis.add(0, new Heilmittel("Silicea", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323210")){
			medis.add(0, new Heilmittel("Arsenicum album", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323211")){
			medis.add(0, new Heilmittel("Sanguinaria", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323300")){
			medis.add(0, new Heilmittel("Allium cepa", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323301")){
			medis.add(0, new Heilmittel("Kalium jodatum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("323302")){
			medis.add(0, new Heilmittel("Arsenicum jodatum", "Dosis: D12 oder C12, 3mal taeglich 3 Globuli "));
		}
		if(index.equals("330110")){
			medis.add(0, new Heilmittel("Ipecacuanha", "Dosis: nicht bekannt"));
		}
		if(index.equals("330111")){
			medis.add(0, new Heilmittel("Phosphorus", "bitte suchen Sie  einen Arzt auf"));
		}
		if(index.equals("330112")){
			medis.add(0, new Heilmittel("Hamamelis", "bitte suchen Sie  einen Arzt auf"));
		}
		if(index.equals("330200")){
			medis.add(0, new Heilmittel("Calcium carbonicum", "Dosis: nicht bekannt"));
		}
		if(index.equals("330201")){
			medis.add(0, new Heilmittel("Aethusa", "Dosis: nicht bekannt"));
		}
		if(index.equals("330210")){
			medis.add(0, new Heilmittel("Antimonium crudum", "Dosis: nicht bekannt"));
		}
		if(index.equals("330211")){
			medis.add(0, new Heilmittel("Ipecacuanha", "Dosis: nicht bekannt"));
		}
		if(index.equals("330212")){
			medis.add(0, new Heilmittel("Pulsatilla", "Dosis: nicht bekannt"));
		}
		if(index.equals("330300")){
			medis.add(0, new Heilmittel("Pulsatilla", "Dosis: nicht bekannt"));
		}
		if(index.equals("330301")){
			medis.add(0, new Heilmittel("Phosphorus", "Dosis: nicht bekannt"));
		}
		if(index.equals("330302")){
			medis.add(0, new Heilmittel("Secale", "bitte suchen Sie  einen Arzt auf"));
		}
		if(index.equals("330310")){
			medis.add(0, new Heilmittel("Arsenicum album", "Dosis: nicht bekannt"));
		}
		if(index.equals("330311")){
			medis.add(0, new Heilmittel("Cuprum", "Dosis: nicht bekannt"));
		}
		if(index.equals("330312")){
			medis.add(0, new Heilmittel("Kreosotum", "Dosis: nicht bekannt"));
		}
		if(index.equals("331000")){
			medis.add(0, new Heilmittel("Veratrum album", ""));
		}
		if(index.equals("331001")){
			medis.add(0, new Heilmittel("Arsenicum album", "Dosis: nicht bekannt"));
		}
		if(index.equals("331002")){
			medis.add(0, new Heilmittel("Veratrum album", "Dosis: nicht bekannt"));
		}
		if(index.equals("331003")){
			medis.add(0, new Heilmittel("Secale", "Dosis: nicht bekannt"));
		}
		return medis; 
	}	
	
}
