import java.awt.*;
import java.applet.*;
public class AWTEventDemo extends Applet
{
private String message = “Waiting for events . . .”;
// Default constructor
public AWTEventDemo ( )
{
// Call superclass
super ( );
}
// Init method, called when applet first initializes public void
init ( )
{
setBackground(Color.white );
}
// Overridden paint method
public void paint ( Graphics g)
{
g.setColor( Color.blue );
g.drawString (message, 0, size ( ).height – 10);
}
// Overridden methods for event handling
public boolean mouseEnter (Event evt, int x, int y)
{

// Set message ………
message = “mouseEnter – x:” + x +” Y:” + y;
/ / … and repaint applet
repaint();
/ / Signal we have handled the event

return true;
}
public boolean mouseExit (Event evt, int x, int y)
{
// Set message …….
message = “ mouseOut – x : “ + x + ”y :” + y;

// …. and repaint applet
repaint();
// Signal we have handled the event
return true;
}
public boolean mouseMove (Event evt, int x, int y)
{
// Set message ……
message = “mouseMove – x: “ + x +”y:” + y;
// ….. and repaint applet
repaint();
// Signal we have handled the event
return true;
}
/ / Mouse click event
public boolean mouseDown (Event evt, int x, int y )
{
// Set message …..
message = “mouseDown – x: “ + x + ” y: “+ y;
/ / … and repaint applet
repaint();
/ / Signal we have handled the event
return true ;
}
}