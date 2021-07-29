package uebungen.threads.parallelegui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
class GUIThread extends JFrame implements ActionListener {
	private JButton b1 = new JButton("Start");
	private JButton b2 = new JButton("Stop");
	private JTextArea t = new JTextArea(50, 50);
	private Berechnung b=null;
	
	public GUIThread(String titel) {
		this.setTitle(titel);
		this.setLayout(new GridLayout(1,3));
		this.add(b1);
		this.add(b2);
		this.add(t);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	
	public void addText(String text) {
		t.setText(text);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GUIThread gui = new GUIThread("GUIThread v1.0");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			b=new Berechnung();
			b.start(this);
		}
		if(ae.getSource()==b2) {
			if(b!=null) b.abbrechen();
		}
	}

}
