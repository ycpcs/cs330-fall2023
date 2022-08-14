/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs330;

public class Soccer {

    public int wins;
    public int ties;
    public int losses;

    public String toString() {
        return String.format("%d", (wins * 3 + ties));
    }
}
