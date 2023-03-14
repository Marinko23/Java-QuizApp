package si;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test extends Pitanje  implements ActionListener {
	
	char pokusaj;
	char odgovor;
	int index;
	int tacno = 0;
	int broj_pitanja = pitanja.length;
	int rezultat;
	
	JFrame frame = new JFrame();
	JTextField polje = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel odgovor_labelA = new JLabel();
	JLabel odgovor_labelB = new JLabel();
	JLabel odgovor_labelC = new JLabel();
	JLabel odgovor_labelD = new JLabel();
	JTextField broj_tacnih = new JTextField();
	JTextField procenat = new JTextField();
	
	
	public Test() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(1500,590); 
		frame.getContentPane().setBackground(new Color(239,234,234));
		frame.setLayout(null); 
		polje.setBounds(0,0,1500,70);
		polje.setBackground(new Color(205,197,197));
		polje.setForeground(new Color(3,3,3));
		polje.setFont(new Font("Times New Roman",Font.BOLD,30));
		polje.setBorder(BorderFactory.createBevelBorder(1));
		polje.setHorizontalAlignment(JTextField.CENTER);
		polje.setEditable(false);
		
		textarea.setBounds(0,70,1500,80);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(205,197,197));
		textarea.setForeground(new Color(3,3,3));
		textarea.setFont(new Font("Times New Roman",Font.BOLD,30));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,150,100,100);
		buttonA.setFont(new Font("Times New Roman",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		buttonA.setBackground(new Color(255,255,255));
		
		buttonB.setBounds(0,250,100,100);
		buttonB.setFont(new Font("Times New Roman",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		buttonB.setBackground(new Color(255,255,255));
		
		buttonC.setBounds(0,350,100,100);
		buttonC.setFont(new Font("Times New Roman",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		buttonC.setBackground(new Color(255,255,255));
		
		buttonD.setBounds(0,450,100,100);
		buttonD.setFont(new Font("Times New Roman",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		buttonD.setBackground(new Color(255,255,255));
		
		odgovor_labelA.setBounds(125,150,1500,100);
		odgovor_labelA.setBackground(new Color(239,234,234));
		odgovor_labelA.setForeground(new Color(3,3,3));
		odgovor_labelA.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
		odgovor_labelB.setBounds(125,250,1500,100);
		odgovor_labelB.setBackground(new Color(239,234,234));
		odgovor_labelB.setForeground(new Color(3,3,3));
		odgovor_labelB.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
		odgovor_labelC.setBounds(125,350,1500,100);
		odgovor_labelC.setBackground(new Color(239,234,234));
		odgovor_labelC.setForeground(new Color(3,3,3));
		odgovor_labelC.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
		odgovor_labelD.setBounds(125,450,1500,100);
		odgovor_labelD.setBackground(new Color(239,234,234));
		odgovor_labelD.setForeground(new Color(3,3,3));
		odgovor_labelD.setFont(new Font("Times New Roman",Font.PLAIN,30));
		
	    broj_tacnih.setBounds(650,250,200,100);
	    broj_tacnih.setBackground(new Color(205,197,197));
	    broj_tacnih.setForeground(new Color(3,3,3));
	    broj_tacnih.setFont(new Font("Times New Roman",Font.BOLD,50));
	    broj_tacnih.setBorder(BorderFactory.createBevelBorder(1));
	    broj_tacnih.setHorizontalAlignment(JTextField.CENTER);
	    broj_tacnih.setEditable(false);
	    
	    procenat.setBounds(650,350,200,100);
	    procenat.setBackground(new Color(205,197,197));
	    procenat.setForeground(new Color(3,3,3));
	    procenat.setFont(new Font("Times New Roman",Font.BOLD,50));
	    procenat.setBorder(BorderFactory.createBevelBorder(1));
	    procenat.setHorizontalAlignment(JTextField.CENTER);
	    procenat.setEditable(false);
		
		frame.add(odgovor_labelA);
		frame.add(odgovor_labelB);
		frame.add(odgovor_labelC);
		frame.add(odgovor_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(polje);
		frame.setVisible(true);
		
		novoPitanje();
		
		
	}
	
	public void novoPitanje() {
		if(index >= broj_pitanja) {
			rezultat();
		}
		else {
			polje.setText("Pitanje "+(index+1));
			textarea.setText(pitanja[index]);
			odgovor_labelA.setText(odgovori[index][0]);
			odgovor_labelB.setText(odgovori[index][1]);
			odgovor_labelC.setText(odgovori[index][2]);
			odgovor_labelD.setText(odgovori[index][3]);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==buttonA) {
			odgovor = 'A';
			if(odgovor == tacniOdgovori[index]) {
				tacno++;
			}
		}
		if(e.getSource()==buttonB) {
			odgovor = 'B';
			if(odgovor == tacniOdgovori[index]) {
				tacno++;
			}
		}
		if(e.getSource()==buttonC) {
			odgovor = 'C';
			if(odgovor == tacniOdgovori[index]) {
				tacno++;
			}
		}
		if(e.getSource()==buttonD) {
			odgovor = 'D';
			if(odgovor == tacniOdgovori[index]) {
				tacno++;
			}
		}
		
		prikaziOdgovor();

		
		
	}
	public void prikaziOdgovor() {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(tacniOdgovori[index] != 'A')
			odgovor_labelA.setForeground(new Color(255,0,0));
		if(tacniOdgovori[index] != 'B')
			odgovor_labelB.setForeground(new Color(255,0,0));
		if(tacniOdgovori[index] != 'C')
			odgovor_labelC.setForeground(new Color(255,0,0));
		if(tacniOdgovori[index] != 'D')
			odgovor_labelD.setForeground(new Color(255,0,0));
		Timer pause = new Timer(1500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				odgovor_labelA.setForeground(new Color(3,3,3));
				odgovor_labelB.setForeground(new Color(3,3,3));
				odgovor_labelC.setForeground(new Color(3,3,3));
				odgovor_labelD.setForeground(new Color(3,3,3));
				
				odgovor = ' ';
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				novoPitanje();
				
				
			}
		});
		pause.setRepeats(false);
		pause.start();
		
	}
	public void rezultat() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		rezultat = (int)((tacno/(double)broj_pitanja)*100);
		
		polje.setText("Rezultat");
		textarea.setText("");
		odgovor_labelA.setText("");
		odgovor_labelB.setText("");
		odgovor_labelC.setText("");
		odgovor_labelD.setText("");
		
		broj_tacnih.setText(tacno + "/" + broj_pitanja);
		procenat.setText(rezultat + "%");
		
		
		frame.add(broj_tacnih);
		frame.add(procenat);
		
		
	}

}