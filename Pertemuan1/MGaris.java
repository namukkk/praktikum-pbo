class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(-2);
        t1.setOrdinat(0);
        
        Titik t2 = new Titik();
        t2.setAbsis(0);
        t2.setOrdinat(4);
        
        Garis g1 = new Garis();
        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);
        

        g1.printGaris();
        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
        System.out.println("Titik tengah: (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + g1.getPersamaanGaris());
        
    
        Titik t3 = new Titik();
        t3.setAbsis(-1);
        t3.setOrdinat(0);
        
        Titik t4 = new Titik();
        t4.setAbsis(0);
        t4.setOrdinat(-2);
        
        Garis g2 = new Garis();
        g2.setTitikAwal(t3);
        g2.setTitikAkhir(t4);
        
        System.out.println("Garis sejajar dengan g2: " + g1.isSejajar(g2));
        System.out.println("Garis tegak lurus dengan g2: " + g1.isTegakLurus(g2));
        System.out.println("Total garis yang dibuat: " + Garis.getCounterGaris());
    }
}
