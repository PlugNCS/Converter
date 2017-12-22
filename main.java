/*

Copyright (C) 2017 Michaël NASS

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA. 

Licence : https://www.craftsearch.net/LICENSE.txt
*/

import javax.swing.JOptionPane;

void FahrenheitEnCelcius(){
	double f = readDouble("Indiquez la température en F.");
	double c = (5*(f-32))/9;
	String titleBar = "Conversion terminée !";
	String infoMessage = f + " Fahrenheit = " + c + " Celcius";
	JOptionPane.showMessageDialog(null, infoMessage, "Information: " + titleBar, JOptionPane.INFORMATION_MESSAGE); 
}
void CelciusEnFahrenheit(){
	double c = readDouble("Indiquez la température en C.");
	double f = c*1.8+32;
	String titleBar = "Conversion terminée !";
	String infoMessage = c + " Celcius = " + f + " Fahrenheit";
	JOptionPane.showMessageDialog(null, infoMessage, "Information: " + titleBar, JOptionPane.INFORMATION_MESSAGE); 
}
void main(){
	int result = JOptionPane.showOptionDialog(null, 
        "Que souhaitez-vous convertir ?", 
        "Initialisation...", 
        JOptionPane.OK_CANCEL_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        new String[]{"Fahrenheit en Celcius", "Celcius en Fahrenheit"}, // this is the array
        "default");

        if (result == JOptionPane.OK_OPTION){
        	FahrenheitEnCelcius();
        }
        else{
        	CelciusEnFahrenheit();
        }
}
