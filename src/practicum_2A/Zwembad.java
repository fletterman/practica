package practicum_2A;

public class Zwembad {
    private double breedte, lengte, diepte;
    public Zwembad(double br, double ln, double di){
        breedte = br;
        lengte = ln;
        diepte = di;
    }

    public Zwembad(){
    }

    public double getBreedte(){
        return breedte;
    }

    public double getLengte(){
        return lengte;
    }

    public double getDiepte(){
        return diepte;
    }

    public void setBreedte(double br){
        breedte = br;
    }

    public void setLengte(double ln){
        lengte = ln;
    }

    public void setDiepte(double di){
        diepte = di;
    }

    public double inhoud(){
        double inhoud = breedte * lengte * diepte;
        return inhoud;
    }

    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte +  "meter diep";
    }
}
