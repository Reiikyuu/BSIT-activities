/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import javax.swing.JOptionPane;
/**
 *
 * @author blspacanza
 */

public class JavaApplication3 {

    public static void info(String name, int age, String course) {
        
        JOptionPane.showMessageDialog(null, "Your name is " + name + ", " + age + " years old. Studying " + course + ".");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name = JOptionPane.showInputDialog("Enter name: ");  
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
        String course = JOptionPane.showInputDialog("Enter course: ");
        
        info(name, age, course);
    }
    
}
