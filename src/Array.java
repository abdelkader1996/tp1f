public class Array {
    int[] liste;
    Array(int[] list){
        this.liste=list;
    }
    public void expande(int n){
        int[] newliste=new int[liste.length+n];
        for(int i=0;i< liste.length;i++){
            newliste[i]=liste[i];
        }
        liste=newliste;
    }
    public void push(int x){
        int[] newliste=new int[liste.length+1];
        for(int i=0;i< liste.length;i++){
            newliste[i]=liste[i];
        }
        newliste[liste.length]=x;

        liste=newliste;

    }


    public int getLength(){
        return liste.length;
    }


    }

