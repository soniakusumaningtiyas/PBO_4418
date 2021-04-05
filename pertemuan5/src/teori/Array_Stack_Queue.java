/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Array_Stack_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Ini Array List");
        ArrayList new_array = new ArrayList();
        new_array.append(11);
        new_array.append(12);
        new_array.append(13);
        new_array.append(14);
        new_array.ShowData();
        System.out.println("========== *** ==========");
        new_array.append(15);
        new_array.ShowData();
        System.out.println("========== *** ==========");
        new_array.pop();
        new_array.ShowData();
        System.out.println("========== *** ==========");
        new_array.UbahData(2,10);
        new_array.ShowData();
        System.out.println("\n");
        
        System.out.println("Ini Stack");
        Stack new_stack = new Stack();
        new_stack.append(1);
        new_stack.append(2);
        new_stack.append(3);
        new_stack.append(4);
        new_stack.append(5);
        new_stack.ShowData();
        System.out.println("========== *** ==========");
        new_stack.append(7);
        new_stack.ShowData();
        System.out.println("========== *** ==========");
        new_stack.pop();
        new_stack.ShowData();
        System.out.println("========== *** ==========");
        new_stack.UbahData(1,8);
        new_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("Ini Queue");
        Queue new_queue = new  Queue();
        new_queue.append(11);
        new_queue.append(12);
        new_queue.append(13);
        new_queue.append(14);
        new_queue.append(15);
        new_queue.append(17);
        new_queue.ShowData();
        System.out.println("========== *** ==========");
        new_queue.ShowData();
        System.out.println("========== *** ==========");
        new_queue.pop();
        new_queue.ShowData();
        System.out.println("========== *** ==========");
        new_queue.UbahData(2,16);
        new_queue.ShowData();
        System.out.println("========== BERHASIL ==========");
    }
    
}
