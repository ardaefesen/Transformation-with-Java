import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Transformations extends Frame implements ActionListener,MouseListener {
	

	 // Initialize coordinates of the triangle
	 int[] x = {500,700,600};
	 int[] y = {300,300,100};
	 static final int windowWidth = 800;
	 static final int windowHeight = 800;
	 public static void main(String[] args) {
		 
		 Transformations f = new Transformations();
		 f.setTitle("Transformations");
		 f.setSize(windowWidth, windowHeight);        
		 f.setVisible(true);
		// f.setBackground(Color.PINK);
	 // Set Frame s ize to 800x800)
	 // Set background color
	 // Set visibility
	
	 }
	 
	 public Transformations() {
	 // Set title
	 // Create menu
	 // Add WindowListener to exit the program when window is closed
	 // Set layout
	 // Add control panel
	 // Add buttons
		 	MenuBar menu_bar = new MenuBar();             // Creating Menu Bar
			Menu def = new Menu("File");
			def.add(new MenuItem("Set Default"));
			def.addActionListener(this);
			menu_bar.add(def);
			setMenuBar(menu_bar);
			
			
			 Panel panel=new Panel();  						// creating panel
		     panel.setBounds(0,40,windowWidth,40); 
		     
		     
		     	Button button_tu = new Button();
				button_tu.setLabel("Translate Up");        // Set up Translate Up button
				button_tu.addActionListener(this);
				
				Button button_td = new Button();
				button_td.addActionListener(this);			// Set up Translate Down button
				button_td.setLabel("Translate Down");
				
				
				Button button_tr = new Button();
				button_tr.addActionListener(this);			//  Set up Translate Right button
				button_tr.setLabel("Translate Right");
				
				Button button_tl = new Button();
				button_tl.addActionListener(this);          //  Set up Translate Left button
				button_tl.setLabel("Translate Left");
				
				Button button_rx = new Button();
				button_rx.addActionListener(this);          // Set up Reflect X button
				button_rx.setLabel("Reftlect X");
				
				Button button_ry = new Button();			// Set up Reflect Y button
				button_ry.addActionListener(this);
				button_ry.setLabel("Reftlect Y");
				
				panel.add(button_tu);
				panel.add(button_td);						//add the buttons to panel we create
				panel.add(button_tr);
				panel.add(button_tl);
				panel.add(button_rx);
				panel.add(button_ry);
				
				panel.setBackground(Color.black); 
				add(panel);
				setLayout(null);								// setting background colors
				addWindowListener(new MyFinishWindow());
				addMouseListener(this);
				setBackground(Color.pink);
		 
		
		}
	 
		public class MyFinishWindow extends WindowAdapter
		{
			     public void windowClosing(WindowEvent e)
			     {
			       System.exit(0);
			     }
		}
	 // Draw 2 lines and paint 1 filled triangle
	 public void paint(Graphics g) {
		 
		 
		 Graphics2D g2d = (Graphics2D) g;
		 
		 g2d.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight()); // Drawing Vertical line
		 g2d.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2); // Drawing Horizontal Line
		 g2d.fillPolygon(x, y, 3);  // Drawing Triangle
		 
	 }

	 // Action listener
	 public void actionPerformed(ActionEvent evt) {
		 
		 String str = evt.getActionCommand();
		 if(str.equals("Translate Up")) {							// Translate up for 20 unit
			 for(int i = 0; i<y.length;i++) {
				 y[i] = y[i] - 20;
			 }
			 repaint();
		 }
		 else if(str.equals("Translate Down")) {
			 for(int i =0; i<y.length;i++) {						// Translate down for 20 unit
				 y[i]= y[i] + 20;
			 }
			 repaint();
		 }
		 else if(str.equals("Translate Left")) {
			 for(int i =0; i<x.length;i++) {						// Translate left for 20 unit
				 x[i]= x[i] - 20 ;
			 }
			 repaint();
		 }
		 else if(str.equals("Translate Right")) {
			 for(int i =0; i<x.length;i++) {						// Translate right for 20 unit
				 x[i]= x[i] + 20 ;
			 }
			 repaint();
		 }
		 else if(str.equals("Reftlect X")) {
			 for(int i =0; i<y.length;i++) {					// repaint triangle for this formula
				int temp = y[i];								// process of reflect x, only y coordinates changes
				temp=((this.getHeight()-temp*2) + temp);		// vertical distance calculated for every y coordinates and rearranged it 
				y[i] = temp;
			 }
			 repaint();
		 }
		 
		 else if(str.equals("Reftlect Y")) {					// repaint triangle for this formula
			 for(int i =0; i<x.length;i++) {					// process of reflect y, only x coordinates changes
				int temp = x[i];
				temp=((this.getWidth()-temp*2) + temp);			// horizontal distance calculated for every x coordinates and rearranged it
				x[i] = temp;
			 }
			 repaint();
		 }
		 
		 else if(str.equals("Set Default")) {
			 x[0] = 500;
			 x[1] = 700;		// x default values 
			 x[2] = 600;
			 x[3] =
			 
			 y[0] = 300;
			 y[1] = 300;		// y default values
			 y[2] = 100;
			 
		
			 
			 repaint();
			
		 }
		
		
	 
	 }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

} 
