package de.mgwt.dubravko.client.seite4;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.googlecode.mgwt.ui.client.widget.celllist.Cell;

import de.mgwt.dubravko.client.model.Heilmittel;

public class ViewCell4 implements Cell<Heilmittel>{

	private static Template TEMPLATE = GWT.create(Template.class);
	
	public interface Template extends SafeHtmlTemplates{
		@SafeHtmlTemplates.Template("<table width='100%'>" +
										"<tr>" +
											"<td align='left' ><h2>{0}</h2></td>" +
											"<td align='right'><h2>{1}</h2></td>"+
										"</tr>"+
									"</table>")
		SafeHtml content(String heilmittelName, String heilmittelDosis);
	}
	
	
	@Override
	public void render(SafeHtmlBuilder safeHtmlBuilder, Heilmittel heilmittel) {
		SafeHtml content = TEMPLATE.content(heilmittel.getName(), "		"+heilmittel.getDosis());
		safeHtmlBuilder.append(content);
		
	}

	@Override
	public boolean canBeSelected(Heilmittel model) {
		return true;
	}

}
