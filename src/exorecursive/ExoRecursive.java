/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exorecursive;

/**
 *
 * @author qais-amini
 */
public class ExoRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Repertoire racine = new Repertoire("D");
        Repertoire document = new Repertoire("document");
        Repertoire multimedia = new Repertoire("multimedia");
        Repertoire videos = new Repertoire("videos");
        Repertoire images = new Repertoire("images");
        Repertoire pictures = new Repertoire("pictures");
        Repertoire web = new Repertoire("web");
        Repertoire animaux = new Repertoire("animaux");
        Repertoire chien = new Repertoire("chien");
        Repertoire photos = new Repertoire("photos");
        Repertoire deuxMilleDouze = new Repertoire("2012");
        Repertoire deuxMilleVinght = new Repertoire("2020");
        
//         racine.addChildren(multimedia);
//            racine.addChildren(document);
//            multimedia.addChildren(videos);
//            multimedia.addChildren(images);
//            racine.afficheNom();


        //Creation des Noeuds                
        //insertion du repertoire multimedia dans D
        racine.repository.add(document);
        racine.repository.add(multimedia);
        multimedia.repository.add(videos);
        multimedia.repository.add(images);
        images.repository.add(pictures);
        pictures.repository.add(web);
        web.repository.add(animaux);
        animaux.repository.add(chien);
        images.repository.add(photos);
        photos.repository.add(deuxMilleDouze);
        photos.repository.add(deuxMilleVinght);
   
        //Creation des Leaf
        document.repository.add(new Repertoire("word"));
        document.repository.add(new Repertoire("excel"));
        document.repository.add(new Repertoire("factures"));

        videos.repository.add(new Repertoire("da"));
        videos.repository.add(new Repertoire("film"));

        deuxMilleDouze.repository.add(new Repertoire("01"));
        deuxMilleDouze.repository.add(new Repertoire("02"));

        deuxMilleVinght.repository.add(new Repertoire("01"));
        deuxMilleVinght.repository.add(new Repertoire("12"));

        web.repository.add(new Repertoire("hentai"));

        animaux.repository.add(new Repertoire("chat"));

        chien.repository.add(new Repertoire("poilsCourt"));
        chien.repository.add(new Repertoire("poilsLong"));

        System.out.println(racine.nop);

        for (Repertoire lv00 : racine.repository) {
            System.out.println("\t" + lv00.nop);

            for (Repertoire lv01 : lv00.repository) {
                System.out.println("\t\t" + lv01.nop);

                for (Repertoire lv02 : lv01.repository) {
                    System.out.println("\t\t\t" + lv02.nop);

                    for (Repertoire lv03 : lv02.repository) {
                        System.out.println("\t\t\t\t" + lv03.nop);

                        for (Repertoire lv04 : lv03.repository) {
                            System.out.println("\t\t\t\t\t" + lv04.nop);

                            for (Repertoire lv05 : lv04.repository) {
                                System.out.println("\t\t\t\t\t\t" + lv05.nop);

                                for (Repertoire lv06 : lv05.repository) {
                                    System.out.println("\t\t\t\t\t\t\t" + lv06.nop);
                                }
                            }
                        }
                    }
                }
            }
        }



    }

}
