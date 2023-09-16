package Fifth.Football;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Football implements ActionListener {
    JButton MILAN = new JButton("AC Milan");
    JButton MADRID = new JButton("Real Madrid");
    JLabel result_label = new JLabel("Result: 0 vs 0 ", JLabel.CENTER);

    JLabel last_scorer_label = new JLabel("Last Scorer: N/A", JLabel.CENTER);
    JLabel winner_label = new JLabel("Winner: DRAW", JLabel.CENTER);

    int count_Milan = 0;
    int count_Madrid = 0;
    String last_winner = "N/A";
    Football(){
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JPanel button_panel= new JPanel();
//        button_panel.setBackground(Color.GRAY);
//        button_panel.setPreferredSize( new Dimension(200,300));
//        JButton MILAN = new JButton("AC Milan");
//        JButton MADRID = new JButton("Real Madrid");
//        button_panel.add(MILAN);
//        button_panel.add(MADRID);
        MILAN.addActionListener(this);
        MADRID.addActionListener(this);

//        JPanel score_check_panel = new JPanel();
//        JLabel result_label = new JLabel("Result: 0 vs 0 ", JLabel.CENTER);
//        JLabel last_scorer_label = new JLabel("Last Scorer: N/A", JLabel.CENTER);
//        JLabel winner_label = new JLabel("Winner: DRAW", JLabel.CENTER);

//        score_check_panel.add(result_label);
//        score_check_panel.add(last_scorer_label);
//        score_check_panel.add(winner_label);

//        JPanel to_unite_them = new JPanel();
//        to_unite_them.add(button_panel);
//        to_unite_them.add(score_check_panel);

        MILAN.setBounds(20, 50, 120, 20);
        MADRID.setBounds(150, 50, 120, 20);


        result_label.setBounds(150, 100, 120, 20);

        last_scorer_label.setBounds(150, 120, 120, 20);
        winner_label.setBounds(150, 140, 120, 20);


        frame.add(MILAN);frame.add(MADRID);
        frame.add(result_label);frame.add(winner_label);frame.add(last_scorer_label);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource() == MILAN){
                count_Milan ++;
                last_scorer_label.setText("Last Scorer: MILAN");
            }

            if (e.getSource() == MADRID){
                count_Madrid ++;
                last_scorer_label.setText("Last Scorer: MADRID");
            }
            result_label.setText("Result: " + count_Milan + " vs " + count_Madrid);

            if (count_Milan > count_Madrid){
                winner_label.setText("Winner: MILAN");
            }
            else if (count_Milan < count_Madrid){
                winner_label.setText("Winner: MADRID");
            }
            else{
                winner_label.setText("Winner: DRAW");
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String args[]) {
        new Football();
    }
}