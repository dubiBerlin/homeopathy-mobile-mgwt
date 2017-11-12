package de.mgwt.dubravko.client.phoneGapTest;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.googlecode.mgwt.ui.client.widget.celllist.Cell;


public class FileDisplayViewCell  implements Cell<String>{

	
	
	private static Template TEMPLATE = GWT.create(Template.class);
	
	public interface Template extends SafeHtmlTemplates{
		@SafeHtmlTemplates.Template("<h2 background-color='red'>{1}</h2>")
		SafeHtml content(String cellContents);
	}
	
	@Override
	public void render(SafeHtmlBuilder safeHtmlBuilder, String model) {
		SafeHtml content = TEMPLATE.content(model);
		safeHtmlBuilder.append(content);
	}

	@Override
	public boolean canBeSelected(String model) {
		return true;
	}

}
