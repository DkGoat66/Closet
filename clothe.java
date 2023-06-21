
public class clothe {
    String color;
    String material;
    String ClotheType;
    String SleeveLength;
    //* constructor that takes in the 4 attributes and sets the object variables//
    public clothe(String c, String m, String CT, String SL){
        color =c;
        material =m;
        ClotheType =CT;
        SleeveLength=SL;
    }
    @Override
    //*Override toString that prints out the following//
    public String toString(){
        return " "+color+" "+SleeveLength+" "+ClotheType+" made up of "+material;
    }
}
