/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exorecursive;  

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author qais-amini
 */
public class Repertoire {
    public String nop = "";
    public Repertoire pere = null;
    List <Repertoire> repository = new ArrayList();
    
        public Repertoire(String n){
        this.nop = n;
    }
////       public void addChildren(Repository r){
//        r.parent = this;
//        this.repository.add(r);
//    }
}
