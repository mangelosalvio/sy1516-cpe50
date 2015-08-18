import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;

public class StandardCalculator extends JFrame {
    GridBagLayout gridBagLayout;
    GridBagConstraints constraints;

    public StandardCalculator(){
        init();
        finish();
    }

    private void init(){
        gridBagLayout = new GridBagLayout();
        constraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);


        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(new JTextField(10), constraints);

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        this.add(new JButton("AC"), constraints);

        constraints.gridx = 1;
        this.add(new JButton("+/-"), constraints);

        constraints.gridx = 2;
        this.add(new JButton("%"), constraints);

        constraints.gridx = 3;
        this.add(new JButton("/"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(new JButton("7"), constraints);

        constraints.gridx = 1;
        this.add(new JButton("8"), constraints);

        constraints.gridx = 2;
        this.add(new JButton("9"), constraints);

        constraints.gridx = 3;
        this.add(new JButton("x"), constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(new JButton("4"), constraints);

        constraints.gridx = 1;
        this.add(new JButton("5"), constraints);

        constraints.gridx = 2;
        this.add(new JButton("6"), constraints);

        constraints.gridx = 3;
        this.add(new JButton("-"), constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        this.add(new JButton("1"), constraints);

        constraints.gridx = 1;
        this.add(new JButton("2"), constraints);

        constraints.gridx = 2;
        this.add(new JButton("3"), constraints);

        constraints.gridx = 3;
        this.add(new JButton("+"), constraints);

        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(new JButton("0"), constraints);

        constraints.gridwidth = 1;
        constraints.gridx = 2;
        constraints.fill = GridBagConstraints.NONE;
        this.add(new JButton("."), constraints);

        constraints.gridx = 3;
        this.add(new JButton("="), constraints);






    }
    private void finish(){
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StandardCalculator();
    }
}
