package com.JavaPrograms;


//import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class demo{
//    /**
//     * Starts the main GUI window
//     */
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                // Setup the application's window
//                JFrame frame = new JFrame("Swing Text Editor");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//                // Setup the content pane
//                JPanel contentPane = new JPanel();
//                contentPane.setLayout(new BorderLayout());
//                frame.setContentPane(contentPane);
//
//                // Add a button to the content pane
//                final JButton button = new JButton("Click here");
//                contentPane.add(button, BorderLayout.CENTER);
//
//                button.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        button.setText("Clicked");
//                    }
//                });
//
//                // Display the window
//                frame.pack();
//                frame.setSize(640, 480);
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
//            }
//        });
//    }
//}


//
//import javax.swing.*;
//
//public class demo {
//    /**
//     * Create the GUI and show it.  For thread safety,
//     * this method should be invoked from the
//     * event-dispatching thread.
//     */
//    private static void createAndShowGUI() {
//        //Make sure we have nice window decorations.
//        JFrame.setDefaultLookAndFeelDecorated(true);
//
//        //Create and set up the window.
//        JFrame frame = new JFrame("HelloWorldSwing");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add the ubiquitous "Hello World" label.
//        JLabel label = new JLabel("Hello World");
//        frame.getContentPane().add(label);
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        //Schedule a job for the event-dispatching thread:
//        //creating and showing this application's GUI.
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
//    }
//}

//import javax.swing.*;

//public class SwingDemo {
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Simple Swing Application");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            JLabel label = new JLabel("Hello, Swing!");
//            frame.getContentPane().add(label);
//
//            frame.pack();
//            frame.setVisible(true);
//        });
//    }
//}


//import java.awt.*;
//import javax.swing.*;
//public class SwingDemo extends JFrame {
//
//    public SwingDemo() {
//        setTitle("Graphics Example");
//        setSize(400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        // Set the drawing color
//        g.setColor(Color.BLUE);
//
//        // Draw a line
//        g.drawLine(50, 50, 200, 100);
//
//        // Draw a rectangle
//        g.drawRect(100, 150, 100, 50);
//
//        // Draw an oval
//        g.drawOval(250, 200, 80, 120);
//
//        // Draw an arc
//        g.drawArc(150, 250, 100, 100, 45, 270);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new SwingDemo());
//    }
//}

//import javax.swing.*;
//import java.awt.*;

//public class SwingDemo extends JFrame {
//    public SwingDemo() {
//        setTitle("BorderLayout Example");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout((LayoutManager) new SwingDemo());
//
//        add(new JButton("North"), BorderLayout.NORTH);
//        add(new JButton("South"), BorderLayout.SOUTH);
//        add(new JButton("East"), BorderLayout.EAST);
//        add(new JButton("West"), BorderLayout.WEST);
//        add(new JButton("Center"), BorderLayout.CENTER);
//
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new SwingDemo());
//    }
//}
