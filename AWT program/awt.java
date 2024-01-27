import java.awt.*;
public class awt extends java.applet.Applet
{
	public void init()
	{

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		add (new Label("Please press the button below:"));
		Button show = new Button("Show Window");
		add(show);
	}
}