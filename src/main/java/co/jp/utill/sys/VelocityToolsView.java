package co.jp.utill.sys;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.ToolContext;
import org.apache.velocity.tools.ToolManager;
import org.springframework.web.servlet.view.velocity.VelocityView;

public class VelocityToolsView extends VelocityView {
	private static ToolContext toolContext = initVelocityToolContext();

	@Override
	protected Context createVelocityContext(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response) {
		VelocityContext context = new VelocityContext(toolContext);
		if (model != null) {
			for (Map.Entry<String, Object> entry : (Set<Map.Entry<String, Object>>) model
					.entrySet()) {
				context.put(entry.getKey(), entry.getValue());
			}
		}
		return context;
	}

	private static ToolContext initVelocityToolContext() {
		if (toolContext == null) {
			ToolManager velocityToolManager = new ToolManager();
			velocityToolManager.configure("velocity-tools.xml");
			toolContext = velocityToolManager.createContext();
		}
		return toolContext;
	}
}
