package main.com.converter.services;

import main.com.converter.categoriesOfConversation.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameClassService {
    public boolean IsDouble(String str) {
        boolean bool = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
                    || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'
                    || str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='.' && str.length()>1)) {
                bool = true;
            }
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }
    public FrameClassService() {
        JFrame frame = new JFrame("Converter");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel label1 = new JLabel("Choose, what you want to convert: ");


        JButton button1 = new JButton("Length");
        JButton button2 = new JButton("Temperature");
        JButton button3 = new JButton("Time");
        JButton button4 = new JButton("Volume");
        JButton button5 = new JButton("Weight");


        frame.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(18, 0, 0, 0), 0, 0));
        frame.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(50, 0, 25, 0), 0, 0));
        frame.add(button2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));
        frame.add(button3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(150, 0, 25, 0), 0, 0));
        frame.add(button4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(200, 0, 25, 0), 0, 0));
        frame.add(button5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame_1 = new JFrame("Length");
                frame_1.setSize(500, 450);
                frame_1.setLocationRelativeTo(null);
                frame_1.setLayout(new GridBagLayout());

                JButton button1_1 = new JButton("m <--> km");
                JButton button1_2 = new JButton("m <--> mile");
                JButton button1_3 = new JButton("m <--> nautical mile");
                JButton button1_4 = new JButton("m <--> cable");
                JButton button1_5 = new JButton("m <--> league");
                JButton button1_6 = new JButton("m <--> foot");
                JButton button1_7 = new JButton("m <--> yard");


                frame_1.add(button1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                frame_1.add(button1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                frame_1.add(button1_3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                frame_1.add(button1_4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(175, 0, 25, 0), 0, 0));
                frame_1.add(button1_5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                frame_1.add(button1_6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                frame_1.add(button1_7, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(325, 0, 25, 0), 0, 0));

                frame_1.setVisible(true);

                    button1_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JFrame frame_1_1 = new JFrame("Length");
                            frame_1_1.setSize(500, 450);
                            frame_1_1.setLocationRelativeTo(null);
                            frame_1_1.setLayout(new GridBagLayout());

                            JLabel label1_1 = new JLabel("m --> km");
                            JTextField textField1_1 = new JTextField();
                            JButton buttonConvert1 = new JButton("Convert");
                            JLabel labelAnswer1 = new JLabel("Answer: ");

                            JLabel label1_2 = new JLabel("km --> m");
                            JTextField textField1_2 = new JTextField();
                            JButton buttonConvert2 = new JButton("Convert");
                            JLabel labelAnswer2 = new JLabel("Answer: ");


                            frame_1_1.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                            frame_1_1.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                            frame_1_1.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                            frame_1_1.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                            frame_1_1.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                            frame_1_1.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                            frame_1_1.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                            frame_1_1.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                    GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                            frame_1_1.setVisible(true);

                            buttonConvert1.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    ButtonService buttonService = new ButtonService();
                                    String text = textField1_1.getText();
                                    labelAnswer1.setText(buttonService.launchButton(text, "convertMToKm"));
                                }
                            });

                            buttonConvert2.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    ButtonService buttonService = new ButtonService();
                                    String text = textField1_2.getText();
                                    labelAnswer2.setText(buttonService.launchButton(text, "convertKmToM"));

                                }
                            });
                        }
                    });

                button1_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_2 = new JFrame("Length");
                        frame_1_2.setSize(500, 450);
                        frame_1_2.setLocationRelativeTo(null);
                        frame_1_2.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> mile");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("mile --> m");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_2.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_2.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_2.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_2.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_2.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_2.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_2.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_2.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_2.setVisible(true);


                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToMile"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertMileToM"));

                            }
                        });

                    }
                });

                button1_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_3 = new JFrame("Length");
                        frame_1_3.setSize(500, 450);
                        frame_1_3.setLocationRelativeTo(null);
                        frame_1_3.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> nautical mile");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("nautical mile --> m ");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_3.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_3.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_3.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_3.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_3.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_3.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_3.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_3.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_3.setVisible(true);


                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToNauticalMile"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertNauticalMileToM"));

                            }
                        });
                    }
                });
                button1_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_4 = new JFrame("Length");
                        frame_1_4.setSize(500, 450);
                        frame_1_4.setLocationRelativeTo(null);
                        frame_1_4.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> cable");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("cable  <--> m");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_4.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_4.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_4.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_4.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_4.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_4.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_4.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_4.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_4.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToCable"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertCableToM"));

                            }
                        });

                    }
                });

                button1_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_5 = new JFrame("Length");
                        frame_1_5.setSize(500, 450);
                        frame_1_5.setLocationRelativeTo(null);
                        frame_1_5.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> league");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("league --> m");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_5.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_5.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_5.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_5.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_5.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_5.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_5.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_5.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_5.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToLeague"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertLeagueToM"));

                            }
                        });
                    }
                });

                button1_6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_6 = new JFrame("Length");
                        frame_1_6.setSize(500, 450);
                        frame_1_6.setLocationRelativeTo(null);
                        frame_1_6.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> foot");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("foot --> m");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_6.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_6.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_6.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_6.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_6.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_6.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_6.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_6.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_6.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToFoot"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertFootToM"));

                            }
                        });
                    }
                });

                button1_7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_1_7 = new JFrame("Length");
                        frame_1_7.setSize(500, 450);
                        frame_1_7.setLocationRelativeTo(null);
                        frame_1_7.setLayout(new GridBagLayout());

                        JLabel label1_1 = new JLabel("m --> yard");
                        JTextField textField1_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label1_2 = new JLabel("yard <--> m");
                        JTextField textField1_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_1_7.add(label1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_1_7.add(textField1_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_1_7.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_1_7.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_1_7.add(label1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_1_7.add(textField1_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_1_7.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_1_7.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_1_7.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertMToYard"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField1_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertYardToM"));

                            }
                        });

                    }
                });
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame_2 = new JFrame("Temperature");
                frame_2.setSize(500, 450);
                frame_2.setLocationRelativeTo(null);
                frame_2.setLayout(new GridBagLayout());

                JButton button2_1 = new JButton("C <--> K (Шкала Кельвина)");
                JButton button2_2 = new JButton("C <--> F (Шкала Фаренгейта)");
                JButton button2_3 = new JButton("C <--> Re (Шкала Реомюра)");
                JButton button2_4 = new JButton("C <--> Ro (Шкала Рёмера)");
                JButton button2_5 = new JButton("C <--> Ra (Шкала Ранкина)");
                JButton button2_6 = new JButton("C <--> N (Шкала Ньютона)");
                JButton button2_7 = new JButton("C <--> D (Шкала Делиля)");


                frame_2.add(button2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                frame_2.add(button2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                frame_2.add(button2_3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                frame_2.add(button2_4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(175, 0, 25, 0), 0, 0));
                frame_2.add(button2_5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                frame_2.add(button2_6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                frame_2.add(button2_7, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(325, 0, 25, 0), 0, 0));

                frame_2.setVisible(true);

                button2_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_1 = new JFrame("Temperature");
                        frame_2_1.setSize(500, 450);
                        frame_2_1.setLocationRelativeTo(null);
                        frame_2_1.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> K (Шкала Кельвина)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("K (Шкала Кельвина) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_1.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_1.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_1.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_1.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_1.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_1.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_1.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_1.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_1.setVisible(true);


                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToKelvin"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertKelvinToC"));

                            }
                        });
                    }
                });

                button2_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_2 = new JFrame("Temperature");
                        frame_2_2.setSize(500, 450);
                        frame_2_2.setLocationRelativeTo(null);
                        frame_2_2.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> F (Шкала Фаренгейта)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("F (Шкала Фаренгейта) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_2.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_2.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_2.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_2.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_2.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_2.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_2.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_2.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_2.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToFarenheit"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertFarenheitToC"));

                            }
                        });
                    }
                });

                button2_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_3 = new JFrame("Temperature");
                        frame_2_3.setSize(500, 450);
                        frame_2_3.setLocationRelativeTo(null);
                        frame_2_3.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> Re (Шкала Реомюра)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("Re (Шкала Реомюра) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_3.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_3.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_3.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_3.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_3.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_3.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_3.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_3.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_3.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToReomur"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertReomurToC"));

                            }
                        });
                    }
                });

                button2_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_4 = new JFrame("Temperature");
                        frame_2_4.setSize(500, 450);
                        frame_2_4.setLocationRelativeTo(null);
                        frame_2_4.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> Ro (Шкала Рёмер)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("Ro (Шкала Рёмер) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_4.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_4.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_4.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_4.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_4.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_4.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_4.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_4.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_4.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToRemer"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertRemerToC"));

                            }
                        });
                    }
                });

                button2_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_5 = new JFrame("Temperature");
                        frame_2_5.setSize(500, 450);
                        frame_2_5.setLocationRelativeTo(null);
                        frame_2_5.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> Ra (Шкала Ранкина)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("Ra (Шкала Ранкина) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_5.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_5.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_5.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_5.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_5.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_5.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_5.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_5.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_5.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToRankin"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertRankinToC"));

                            }
                        });
                    }
                });

                button2_6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_6 = new JFrame("Temperature");
                        frame_2_6.setSize(500, 450);
                        frame_2_6.setLocationRelativeTo(null);
                        frame_2_6.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> N (Шкала Ньютона)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("N (Шкала Ньютона) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_6.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_6.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_6.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_6.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_6.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_6.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_6.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_6.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_6.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToNewton"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertNewtonToC"));

                            }
                        });
                    }
                });

                button2_7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_2_7 = new JFrame("Temperature");
                        frame_2_7.setSize(500, 450);
                        frame_2_7.setLocationRelativeTo(null);
                        frame_2_7.setLayout(new GridBagLayout());

                        JLabel label2_1 = new JLabel("C --> D (Шкала Дели́ля)");
                        JTextField textField2_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label2_2 = new JLabel("D (Шкала Дели́ля) --> C");
                        JTextField textField2_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_2_7.add(label2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_2_7.add(textField2_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_2_7.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_2_7.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_2_7.add(label2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_2_7.add(textField2_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_2_7.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_2_7.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_2_7.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertCToDelil"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField2_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertDelilToC"));

                            }
                        });
                    }
                });
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame_3 = new JFrame("Time");
                frame_3.setSize(500, 400);
                frame_3.setLocationRelativeTo(null);
                frame_3.setLayout(new GridBagLayout());

                JButton button3_1 = new JButton("sec <--> Min");
                JButton button3_2 = new JButton("sec <--> Hour");
                JButton button3_3 = new JButton("sec <--> Day");
                JButton button3_4 = new JButton("sec <--> Week");
                JButton button3_5 = new JButton("sec <--> Month");
                JButton button3_6 = new JButton("sec <--> Astronomical Year");


                frame_3.add(button3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                frame_3.add(button3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                frame_3.add(button3_3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                frame_3.add(button3_4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(175, 0, 25, 0), 0, 0));
                frame_3.add(button3_5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                frame_3.add(button3_6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));


                frame_3.setVisible(true);

                button3_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_1 = new JFrame("Time");
                        frame_3_1.setSize(500, 450);
                        frame_3_1.setLocationRelativeTo(null);
                        frame_3_1.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Min");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel(" Min --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_1.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_1.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_1.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_1.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_1.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_1.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_1.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_1.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_1.setVisible(true);


                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToMin"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertMinToSec"));

                            }
                        });

                    }
                });

                button3_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_2 = new JFrame("Time");
                        frame_3_2.setSize(500, 450);
                        frame_3_2.setLocationRelativeTo(null);
                        frame_3_2.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Hour");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel("Hour --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_2.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_2.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_2.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_2.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_2.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_2.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_2.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_2.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_2.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToHour"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertHourToSec"));

                            }
                        });

                    }
                });

                button3_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_3 = new JFrame("Time");
                        frame_3_3.setSize(500, 450);
                        frame_3_3.setLocationRelativeTo(null);
                        frame_3_3.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Day");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel("Day --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_3.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_3.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_3.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_3.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_3.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_3.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_3.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_3.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_3.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToDay"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertDayToSec"));

                            }
                        });

                    }
                });

                button3_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_4 = new JFrame("Time");
                        frame_3_4.setSize(500, 450);
                        frame_3_4.setLocationRelativeTo(null);
                        frame_3_4.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Week");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel("Week --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_4.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_4.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_4.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_4.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_4.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_4.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_4.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_4.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_4.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToWeek"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertWeekToSec"));
                            }
                        });

                    }
                });

                button3_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_5 = new JFrame("Time");
                        frame_3_5.setSize(500, 450);
                        frame_3_5.setLocationRelativeTo(null);
                        frame_3_5.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Month");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel("Month --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_5.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_5.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_5.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_5.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_5.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_5.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_5.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_5.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_5.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToMonth"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertMonthToSec"));

                            }
                        });

                    }
                });

                button3_6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_3_6 = new JFrame("Time");
                        frame_3_6.setSize(500, 450);
                        frame_3_6.setLocationRelativeTo(null);
                        frame_3_6.setLayout(new GridBagLayout());

                        JLabel label3_1 = new JLabel("sec --> Astronomical Year");
                        JTextField textField3_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label3_2 = new JLabel("Astronomical Year --> sec");
                        JTextField textField3_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_3_6.add(label3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_3_6.add(textField3_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_3_6.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_3_6.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_3_6.add(label3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_3_6.add(textField3_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_3_6.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_3_6.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_3_6.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertSecToYear"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField3_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertYearToSec"));

                            }
                        });

                    }
                });
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame_4 = new JFrame("Volume");
                frame_4.setSize(500, 450);
                frame_4.setLocationRelativeTo(null);
                frame_4.setLayout(new GridBagLayout());

                JButton button4_1 = new JButton("l <--> m^3");
                JButton button4_2 = new JButton("l <--> gallon");
                JButton button4_3 = new JButton("l <--> pint");
                JButton button4_4 = new JButton("l <--> quart");
                JButton button4_5 = new JButton("l <--> barrel");
                JButton button4_6 = new JButton("l <--> cubic foot");
                JButton button4_7 = new JButton("l <--> cubic inch");


                frame_4.add(button4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                frame_4.add(button4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                frame_4.add(button4_3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                frame_4.add(button4_4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(175, 0, 25, 0), 0, 0));
                frame_4.add(button4_5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                frame_4.add(button4_6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                frame_4.add(button4_7, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(325, 0, 25, 0), 0, 0));


                frame_4.setVisible(true);

                button4_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_1 = new JFrame("Volume");
                        frame_4_1.setSize(500, 450);
                        frame_4_1.setLocationRelativeTo(null);
                        frame_4_1.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel(" l --> m^3");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel(" m^3 --> l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_1.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_1.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_1.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_1.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_1.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_1.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_1.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_1.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_1.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToCubicMetre"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertCubicMetreToL"));

                            }
                        });
                    }
                });

                button4_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_2 = new JFrame("Volume");
                        frame_4_2.setSize(500, 450);
                        frame_4_2.setLocationRelativeTo(null);
                        frame_4_2.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel("  l --> gallon ");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("gallon  --> l ");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_2.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_2.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_2.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_2.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_2.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_2.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_2.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_2.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_2.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToGallon"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertGallonToL"));

                            }
                        });
                    }
                });

                button4_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_3 = new JFrame("Volume");
                        frame_4_3.setSize(500, 450);
                        frame_4_3.setLocationRelativeTo(null);
                        frame_4_3.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel("  l --> pint ");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("pint --> l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_3.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_3.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_3.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_3.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_3.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_3.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_3.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_3.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_3.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToPint"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertPintToL"));

                            }
                        });
                    }
                });

                button4_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_4 = new JFrame("Volume");
                        frame_4_4.setSize(500, 450);
                        frame_4_4.setLocationRelativeTo(null);
                        frame_4_4.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel("l --> quart");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("quart --> l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_4.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_4.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_4.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_4.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_4.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_4.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_4.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_4.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_4.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToQuart"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertQuartToL"));

                            }
                        });

                    }
                });

                button4_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_5 = new JFrame("Volume");
                        frame_4_5.setSize(500, 450);
                        frame_4_5.setLocationRelativeTo(null);
                        frame_4_5.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel(" l --> barrel");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("barrel -->  l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_5.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_5.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_5.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_5.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_5.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_5.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_5.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_5.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_5.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToBarrel"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertBarrelToL"));

                            }
                        });

                    }
                });

                button4_6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_6 = new JFrame("Volume");
                        frame_4_6.setSize(500, 450);
                        frame_4_6.setLocationRelativeTo(null);
                        frame_4_6.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel(" l --> cubic foot ");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("cubic foot  -->  l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_6.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_6.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_6.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_6.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_6.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_6.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_6.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_6.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_6.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToCubicFoot"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertCubicFootToL"));

                            }
                        });

                    }
                });

                button4_7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_4_7 = new JFrame("Volume");
                        frame_4_7.setSize(500, 450);
                        frame_4_7.setLocationRelativeTo(null);
                        frame_4_7.setLayout(new GridBagLayout());

                        JLabel label4_1 = new JLabel("  l --> cubic inch ");
                        JTextField textField4_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label4_2 = new JLabel("cubic inch --> l");
                        JTextField textField4_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_4_7.add(label4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_4_7.add(textField4_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_4_7.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_4_7.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_4_7.add(label4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_4_7.add(textField4_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_4_7.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_4_7.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_4_7.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertLToCubicInch"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField4_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertCubicInchToL"));

                            }
                        });
                    }
                });
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame_5 = new JFrame("Weight");
                frame_5.setSize(500, 450);
                frame_5.setLocationRelativeTo(null);
                frame_5.setLayout(new GridBagLayout());

                JButton button5_1 = new JButton("kg <--> g");
                JButton button5_2 = new JButton("kg <--> carat");
                JButton button5_3 = new JButton("kg <--> eng pound");
                JButton button5_4 = new JButton("kg <--> pound");
                JButton button5_5 = new JButton("kg <--> stone");
                JButton button5_6 = new JButton("kg <--> rus pound");


                frame_5.add(button5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                frame_5.add(button5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                frame_5.add(button5_3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                frame_5.add(button5_4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(175, 0, 25, 0), 0, 0));
                frame_5.add(button5_5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                frame_5.add(button5_6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                        GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));


                frame_5.setVisible(true);

                button5_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_1 = new JFrame("Weight");
                        frame_5_1.setSize(500, 450);
                        frame_5_1.setLocationRelativeTo(null);
                        frame_5_1.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel("  kg --> g");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel(" g --> kg ");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_1.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_1.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_1.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_1.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_1.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_1.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_1.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_1.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_1.setVisible(true);


                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToGram"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertGramToKg"));

                            }
                        });
                    }
                });

                button5_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_2 = new JFrame("Weight");
                        frame_5_2.setSize(500, 450);
                        frame_5_2.setLocationRelativeTo(null);
                        frame_5_2.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel(" kg --> carat");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel("carat --> kg");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_2.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_2.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_2.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_2.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_2.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_2.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_2.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_2.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_2.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToCarat"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertCaratToKg"));

                            }
                        });
                    }
                });

                button5_3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_3 = new JFrame("Weight");
                        frame_5_3.setSize(500, 450);
                        frame_5_3.setLocationRelativeTo(null);
                        frame_5_3.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel(" kg --> eng pound");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel("eng pound --> kg ");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_3.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_3.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_3.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_3.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_3.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_3.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_3.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_3.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_3.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToEngPound"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertEngPoundToKg"));

                            }
                        });
                    }
                });

                button5_4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_4 = new JFrame("Weight");
                        frame_5_4.setSize(500, 450);
                        frame_5_4.setLocationRelativeTo(null);
                        frame_5_4.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel("kg --> pound");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel("pound --> kg");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_4.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_4.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_4.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_4.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_4.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_4.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_4.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_4.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_4.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToPound"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertPoundToKg"));

                            }
                        });
                    }
                });

                button5_5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_5 = new JFrame("Weight");
                        frame_5_5.setSize(500, 450);
                        frame_5_5.setLocationRelativeTo(null);
                        frame_5_5.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel("kg --> stone ");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel("stone --> kg");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_5.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_5.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_5.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_5.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_5.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_5.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_5.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_5.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_5.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToStone"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertStoneToKg"));

                            }
                        });
                    }
                });

                button5_6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame_5_6 = new JFrame("Weight");
                        frame_5_6.setSize(500, 450);
                        frame_5_6.setLocationRelativeTo(null);
                        frame_5_6.setLayout(new GridBagLayout());

                        JLabel label5_1 = new JLabel("kg --> rus pound ");
                        JTextField textField5_1 = new JTextField();
                        JButton buttonConvert1 = new JButton("Convert");
                        JLabel labelAnswer1 = new JLabel("Answer: ");

                        JLabel label5_2 = new JLabel("rus pound --> kg");
                        JTextField textField5_2 = new JTextField();
                        JButton buttonConvert2 = new JButton("Convert");
                        JLabel labelAnswer2 = new JLabel("Answer: ");


                        frame_5_6.add(label5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(25, 0, 0, 0), 0, 0));
                        frame_5_6.add(textField5_1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(75, 0, 25, 0), 0, 0));
                        frame_5_6.add(buttonConvert1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(125, 0, 25, 0), 0, 0));
                        frame_5_6.add(labelAnswer1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(100, 0, 25, 0), 0, 0));

                        frame_5_6.add(label5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(175, 0, 0, 0), 0, 0));
                        frame_5_6.add(textField5_2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(225, 0, 25, 0), 0, 0));
                        frame_5_6.add(buttonConvert2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(275, 0, 25, 0), 0, 0));
                        frame_5_6.add(labelAnswer2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL, new Insets(250, 0, 25, 0), 0, 0));

                        frame_5_6.setVisible(true);

                        buttonConvert1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_1.getText();
                                labelAnswer1.setText(buttonService.launchButton(text, "convertKgToRusFunt"));
                            }
                        });

                        buttonConvert2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                ButtonService buttonService = new ButtonService();
                                String text = textField5_2.getText();
                                labelAnswer2.setText(buttonService.launchButton(text, "convertRusFuntToKg"));

                            }
                        });
                    }
                });
            }
        });
    }
}
