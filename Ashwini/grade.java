import javax.swing.*;
import java.awt.event.*;


public class grade extends JFrame implements
ActionListener {

 JTextField prelim    = new JTextField(10);
 JTextField midterm   = new JTextField(10);
 JTextField prefinal  = new JTextField(10);
 JTextField finals     = new JTextField(10);


 JButton Compute = new JButton("Compute");
 JButton Clear   = new JButton("Clear");


    JLabel remarks = new JLabel();
    JLabel grade = new JLabel();
    JLabel report = new JLabel();

    double solve = 0.00;

    double prelim2=0.00,midterm2=0.00;
    double prefinal2=0.00,final2=0.00;

    String remarks2;

public grade() {

  super("Grade Solver Version 1.0");
  setSize(240,240);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel pane = new JPanel();

  JLabel prelim_label   = new JLabel(" Prelim       ");
  JLabel midterm_label  = new JLabel(" Midterm    ");
  JLabel prefinal_label = new JLabel("Prefinal     ");
  JLabel final_label    = new JLabel("Finals         ");

  pane.add(prelim_label);
  pane.add(prelim);

  pane.add(midterm_label);
  pane.add(midterm);


  pane.add(prefinal_label);
  pane.add(prefinal);

  pane.add(final_label);
  pane.add(finals);

  pane.add(Compute);
  pane.add(Clear);

  Compute.addActionListener(this);
  Clear.addActionListener(this);
  Compute.setToolTipText("Click here to solve the grade.");
  Clear.setToolTipText("Click here to clear text fields.");

  pane.add(report);
  pane.add(grade);
  pane.add(remarks);

  add(pane);

  setVisible(true);
}

public void actionPerformed(ActionEvent e)
 {

   if(Compute==e.getSource())
   {


             prelim2=Double.parseDouble(prelim.getText()) * 0.2;
             midterm2=Double.parseDouble(midterm.getText()) * 0.2;
             prefinal2=Double.parseDouble(prefinal.getText()) * 0.2;
             final2=Double.parseDouble(finals.getText()) * 0.4;

             solve = (prelim2 + midterm2 + prefinal2 + final2);



               if (solve >= 40) {

                  remarks2 = "Student passed the subject.";
     }
     else if (solve < 40) {
      remarks2 = "Student failed the subject.";
     }
   }

                report.setText(" === Grade Report === ");
                grade.setText("Student Grade is "
                        +String.format("%.0f",solve)+".");
                remarks.setText(remarks2);

    if(Clear==e.getSource())
   {
    prelim.setText("");
                midterm.setText("");
                prefinal.setText("");
                finals.setText("");

                report.setText("");
                grade.setText("");
                remarks.setText("");
  }
 }


public static void main(String[] args)
{
grade employee = new grade();
}
}

