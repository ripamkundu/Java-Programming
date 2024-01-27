import java.awt.*;
public class CheckboxExample extends Frame {
Label label = new Label (“Default Text”);
Checkbox checkbox[] = new Checkbox[6];
public static void main (String args [] ) {
CheckboxExample win = new CheckboxExample();
}
public CheckboxExample()
{
super (“CheckboxExample”);
addMenus();
addComponents();
pack();
resize(400,400);
show();
}
void addMenus() {

MenuBar menubar = new MenuBar();
Menu file = new Menu(“File”);
file.add(“Quit”);
menubar.add(file);
setMenuBar (menubar);
}
void addComponents ( ) {
add (“North”, label );
label.setAlignment(Label.CENTER);
Panel panel = new Panel();
Panel panel1 = new Panel();
panel1.setLayout (new GridLayout (3,1) );
Panel panel2 = new Panel();
panel2. setLayout (new GridLayout (3,1) );
checkbox [0] = new Checkbox (“one”);
checkbox [1] = new Checkbox (“two”);
checkbox [2] = new Checkbox (“three”);
CheckboxGroup group = new CheckboxGroup ( ) ;
checkbox [3] = new Checkbox (“four”, group, false );
checkbox [4] = new Checkbox (“five”, group, false );
checkbox [5] = new Checkbox (“six”, group, false );
for (int i=0;i<3;++i )
panel1.add (checkbox [i]);
panel.add (panel1) ;
panel.add(panel2);
add(“Center”, panel);
}
public boolean handleEvent (Event event)
{
if (event.id == Event.WINDOW_DESTROY) {
System.exit (0);
return true;
}else if (event.id == Event.ACTION_EVENT && event.target instanceof
MenuItem) {
if (“Quit”.equals(event.arg ) ) {
System.exit(0);
return true;
}
else
{
return false;
}
}
else if (event.id == Event.ACTION_EVENT && event.target instanceof
Checkbox ) {
String text =””;
for (int i=0;i<6; ++i) {
if (checkbox [i].getState ( ) )
text += checkbox[i].getLabel ( ) + ” “;
}
label.setText(text);

return true;
}
else return false;
}
}