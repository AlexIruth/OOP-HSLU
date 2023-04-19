/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw11;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 *
 * @author alexi
 */
public class Programm {

    public static void main(String[] args) {
        String file = "C:\\Users\\alexi\\Documents\\alex.txt";
        try ( DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeInt(6);
            out.writeBoolean(true);
            out.writeByte(10);
            out.writeUTF("hallo");
            out.flush();
        } catch (IOException e) {
            System.out.println(e);
        }

        try ( DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
