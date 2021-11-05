

package trabajo2;

public class transformar_mayusculas {
    public static String todo_mayuscula(String libro){
      String lib="";
       char aux;
    for(int i=0;i<libro.length();i++){
     
    aux=libro.charAt(i);
    
    if(aux=='a' || aux=='á' || aux=='A'|| aux=='À' ){lib+="A";}
    if(aux=='b' || aux=='B' ){lib+="B";}
    if(aux=='c' || aux=='C' ){lib+="C";}
    if(aux=='d' || aux=='D' ){lib+="D";}
    if(aux=='e' || aux=='é' || aux=='E'|| aux=='È' ){lib+="E";}
    if(aux=='f' || aux=='F' ){lib+="F";}
    if(aux=='g' || aux=='G' ){lib+="G";}
    if(aux=='h' || aux=='H' ){lib+="H";}
    if(aux=='i' || aux=='í' || aux=='I'|| aux=='Í' ){lib+="I";}
    if(aux=='j' || aux=='J' ){lib+="J";}
    if(aux=='k' || aux=='K' ){lib+="K";}
    if(aux=='l' || aux=='L' ){lib+="L";}
    if(aux=='m' || aux=='M' ){lib+="M";}
    if(aux=='n' || aux=='N' ){lib+="N";}
    if(aux=='ñ' || aux=='Ñ' ){lib+="Ñ";}
    if(aux=='o' || aux=='ó' || aux=='O'|| aux=='Ò' ){lib+="O";}
    if(aux=='p' || aux=='P' ){lib+="P";}
    if(aux=='Q' || aux=='q' ){lib+="Q";}
    if(aux=='R' || aux=='r' ){lib+="R";}
    if(aux=='S' || aux=='s' ){lib+="S";}
    if(aux=='T' || aux=='t' ){lib+="T";}
    if(aux=='U' || aux=='Ù' || aux=='u'|| aux=='ú' ){lib+="U";}
    if(aux=='V' || aux=='v' ){lib+="V";}
    if(aux=='W' || aux=='w' ){lib+="W";}
    if(aux=='X' || aux=='x' ){lib+="X";}
    if(aux=='Y' || aux=='y' ){lib+="Y";}
    if(aux=='Z' || aux=='z' ){lib+="Z";}
    if(aux==' '){lib+="*";}
    }
 return "*"+lib+"*";//guarda todas las palabras separadas por un *

}
}
