package com.mycompany.app;

import java.util.ArrayList;

public class App{
    public static void main(String[] args){
        int[] arr = new int[3];
        MyFunc(null, arr, 5, "aylin");

    }

    public static String MyFunc(ArrayList<Integer[]> list ,int[] int_arr, int shift_value, String sender){
        /*This function takes an Arraylist named list. This arraylist contains Integer arrays. 
        *Each integer array contains values ​​from 1 to 26, and they are all part of a password.
        *The second parameter, the int array, indicates which Integer array should be decoded first in the arraylist.
        *shift value + length of int arry shows how many shifts were made to decrypt the password.
        *Finally last parameter shows who the sender is but It is also encrypted.
        */
        String decrypted="";
        
        int shift = (shift_value + int_arr.length) % 26; //final shift value
        String decryp_sender="";
        sender = sender.toLowerCase();
        for(int i = 0 ; i < sender.length();i++){
            int mod = ((sender.charAt(i) - 'a' + 1) + shift) % 26;
            decryp_sender = decryp_sender + (char)(('a' - 1) + mod);
        }
        System.out.println(decryp_sender);
    
        for(int i = 0 ; i < int_arr.length; i++){
            int local = int_arr[i];
            for(int j=0; j < list.get(local).length; j++){
                int current = list.get(local)[j];
                int mod = (current + shift) % 26;
                decrypted = decrypted + (char)(('a' - 1) + mod);
            }
            decrypted = decrypted + " ";//space ekle
        }
        decrypted = decrypted + "-" + decryp_sender;
        return decrypted;
    }
}
