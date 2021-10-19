/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhaval Mandaliya
 */
public class SuperClass_Parent {
    
    
    
    
    // Juices
    public double Sprite;
    public double Thumbs_Up;
    public double Coca_Cola;
    public double Seven_Up;
    public double Dukes_Soda;
    public double Mirinda;
    
    //Chips
    public double Lays;
    public double Doritos;
    public double Pringles;
    public double Peppy;
    public double Kurkure;
    public double Wheels;
    
    //Chocolate
    public double Silk_Oreo;
    public double Toblerone;
    public double Kit_Kat;
    public double Snickers;
    public double Five_Star;
    public double Fuse;
    
    public double Juices;
    public double Chips;
    public double Chocolate;
    
    public double TotalOfJCC;
    public double AllTotalOfJCC;
    public double GetAmount()
    {
        Juices = Sprite + Thumbs_Up + Coca_Cola + Seven_Up + Dukes_Soda + Mirinda;
        Chips = Lays + Doritos + Pringles + Peppy + Kurkure + Wheels;
        Chocolate = Silk_Oreo + Toblerone + Kit_Kat + Snickers + Five_Star + Fuse;
        TotalOfJCC = Juices + Chips + Chocolate;
        AllTotalOfJCC = TotalOfJCC;
        return AllTotalOfJCC;
    }
    
    private  JFrame frame;
    
    /**
     *
     */
    public void iExitSystem()
    {
    frame = new JFrame("Exit");
            
    int input = JOptionPane.showConfirmDialog(null, 
                "Do you want to Exit!!!", "WALMART",JOptionPane.YES_NO_OPTION);
    if (input == JOptionPane.YES_NO_OPTION) 
        
    // if(JOptionPane.ShowConfirmDialog(frame, "Do you Want to exit","WALMART",JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_CANCEL_OPTION)
        {
            System.exit(0);
        }
   
    }
    //==============================Price====================
    
    public double pSprite = 40;
    public double pThumbs_Up = 35;
    public double pCoca_Cola = 42;
    public double pSeven_Up = 48;
    public double pDukes_Soda = 60;
    public double pMirinda = 20;
    
    //Chips
    public double pLays = 07;
    public double pDoritos = 100;
    public double pPringles = 65;
    public double pPeppy = 10;
    public double pKurkure = 5;
    public double pWheels = 5;
    
    //Chocolate
    public double pSilk_Oreo = 180;
    public double pToblerone = 85;
    public double pKit_Kat = 25;
    public double pSnickers = 10;
    public double pFive_Star = 30;
    public double pFuse = 60;
    
    //==========================================================
    
    public double Tax=0.70;
    public Double cFindTax(double cAmount)
    {
        double FindTax= cAmount - (cAmount *Tax);
        return FindTax;
    }
    //==========================================================
}
