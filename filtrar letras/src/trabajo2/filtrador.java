/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo2;

/**
 *
 * @author eduardo
 */
public class filtrador {
    
    
public static void  buscar_repetidos(String libro){
    
    
  
 String palabra[]=new String[99999];
  String FINAL[]=new String[99999];
String sobra[]={" DESDE"," DESPUES"," ENTONCES"," ENTRE"," ESTO"," ESTABA",//se pueden eliminar estas palabras solo tiene que tener un espacio
" STOS"," POR"," CON"," LOS"," LAS"," LES"," FUE"," RON"," TRAS"," ADEMAS"," CUAL",
" CUANDO"," SUS"," QUE"," DEL"," PERO"," AÑOS"," AÑO"," MAS"," ACTUAL"," ACTUALES"," EDITADO",
" PERTENECER"," ERA"," SABERLO"," FECHA"," SIENDO"," SABIA"," SABER"," PROBLEMATICO"," PROVOCO",
" PROVOCA"," DEVIDO"," DEVIENDO"," QUIEN"," QUIENES"," DEBIDO"," UNA"," DOS"," TRES"," ESTOS"," ESTAS"," ESTA",
" SUSTITUIR"," SUSTITUIDO"," TRASLADA"," PARTE"," PARTES"," DESPEDIR"," DESPIDIO"," PASAR"," PASA"};
 

int numer=0,z=0;
char aux;
int contador=0,conta_arr=1,aux2,aux3=0;

palabra[0]=" ";
String auxS=" ",pal ="",copia,auccopiar,copiax,copiax2="";
copia=libro;
 for(int i=0;i<libro.length();i++){
    aux=libro.charAt(i);
    
    if(aux!='*'){
    auxS=auxS+aux;
     
    }
     if(aux=='*'){
     pal=auxS;
       
     auxS=" ";
     };
     if(pal!=" "){
        for (int f=0;f<sobra.length;f++) {
           
            if (pal.equals(sobra[f])) {
                pal=" ";
                
            }
        }
        
 
             for(int j=0;j<copia.length();j++){

   if(pal.length()>=5 ){
       
   if((libro.charAt(j)==pal.charAt(1) && libro.charAt(j+1)==pal.charAt(2) && libro.charAt(j+2)==pal.charAt(3)&& libro.charAt(j+3)==pal.charAt(4)) ){
   
       contador=contador+1;    
  
   }}
   if(" MAR".equals(pal) || " SOL".equals(pal)||" GAY".equals(pal)){
       
       if(libro.charAt(j)==pal.charAt(1) && libro.charAt(j+1)==pal.charAt(2) && libro.charAt(j+2)==pal.charAt(3)){
       contador=contador+1;
       }
   }}
   if(contador>1  ){
      
      palabra[conta_arr]=contador+pal+"";
      //System.out.println( "1");
     copiax= palabra[conta_arr];
     //System.out.println( copiax);
           //System.out.println(" ");
   conta_arr=conta_arr+1;
   

    for(int f=0;f<conta_arr-1;f++){ 
       // System.out.println(  palabra[conta_arr-1] ");
            //System.out.println( palabra[conta_arr-1]+"1");
          //  System.out.println( palabra[f]);
           
          
   if(palabra[conta_arr-1].equals(palabra[f] )){
      // palabra[conta_arr-1]=contador+pal+"";
         
     palabra[conta_arr-1]=palabra[conta_arr];
     conta_arr=conta_arr-1;
   
   }}
      
   }
    pal=" ";
      contador=0;
      
      }
    
     }
for (int i = 1; i < conta_arr ; i++) {
        for (int x =0; x < conta_arr-1; x++) {
            aux2=Character.getNumericValue(palabra[x].charAt(0));
            aux3=Character.getNumericValue(palabra[i].charAt(0));
            if(aux3>=1 && palabra[i].charAt(1)!=' ' ){aux3=10+Character.getNumericValue(palabra[i].charAt(1));}
            if(aux2>=1 && palabra[x].charAt(1)!=' ' ){aux2=10+Character.getNumericValue(palabra[x].charAt(1));}
            if (aux2 < aux3) {
                
                auccopiar = palabra[i];
                palabra[i] = palabra[x];
                palabra[x] = auccopiar;
            }
        }
    }

 for ( int i = 0; i < conta_arr ; i++) {//quitas sufijos 
    
         
         if(palabra[i].charAt(palabra[i].length()-1)=='R' && palabra[i].charAt(palabra[i].length()-2)=='A'){//quita ar
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 && j!=palabra[i].length()-2 ){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       } 
       palabra[i]=copiax2;
       copiax2="";
     }
            if(palabra[i].charAt(palabra[i].length()-1)=='R' && palabra[i].charAt(palabra[i].length()-2)=='E'){//quita er
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 && j!=palabra[i].length()-2 ){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       } 
       palabra[i]=copiax2;
       copiax2="";
     }
               if(palabra[i].charAt(palabra[i].length()-1)=='R' && palabra[i].charAt(palabra[i].length()-2)=='I'){//quita ir
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 && j!=palabra[i].length()-2 ){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       } 
       palabra[i]=copiax2;
       copiax2="";
     }
         if(palabra[i].charAt(palabra[i].length()-1)=='S' && palabra[i].charAt(palabra[i].length()-2)=='E'&& palabra[i].charAt(palabra[i].length()-3)=='L'){//quita les
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 && j!=palabra[i].length()-2 && j!=palabra[i].length()-3){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       }
       palabra[i]=copiax2;
       copiax2="";
     }
          if(palabra[i].charAt(palabra[i].length()-1)=='N' && palabra[i].charAt(palabra[i].length()-2)=='O'&& palabra[i].charAt(palabra[i].length()-3)=='I'&& palabra[i].charAt(palabra[i].length()-4)=='C'){//quita cion
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 && j!=palabra[i].length()-2 && j!=palabra[i].length()-3&& j!=palabra[i].length()-4){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       }
       palabra[i]=copiax2;
       copiax2="";
     }
          if(palabra[i].charAt(palabra[i].length()-1)=='S' && (palabra[i].charAt(palabra[i].length()-2)=='A'||palabra[i].charAt(palabra[i].length()-2)=='E'||palabra[i].charAt(palabra[i].length()-2)=='I'||palabra[i].charAt(palabra[i].length()-2)=='O'||palabra[i].charAt(palabra[i].length()-2)=='U') ){
            
       for(int j = 0; j <palabra[i].length(); j++){
       
           if(j!=palabra[i].length()-1 ){
           copiax2=copiax2+palabra[i].charAt(j);
           }
       }
       palabra[i]=copiax2;
       copiax2="";
     }
         
         for(int j=i+1;j<conta_arr;j++){
            if(palabra[i].equals(palabra[j])){
            palabra[i]=palabra[i+1];
            }
        }
         //System.out.println(palabra[i+1]);
        
        
      if(palabra[i]!=palabra[i+1] && palabra!=null){
         ;
         FINAL[z]=palabra[i];
        // System.out.println(FINAL[z]);
         z=z+1;
        
         
       }}
/*
for( int i=0;i<z;i++){  //imprime mejor ya que compara mejor pero da un error 
    
    if(FINAL[i].length()>5&& i+1!=z ){
      
 if(palabra[i].charAt(3)!=palabra[i+1].charAt(3) && palabra[i].charAt(4)!=palabra[i+1].charAt(4)){// como esta ordenado solo hay que imprimir una que no este repetido
  System.out.println(FINAL[i]);
 }}

 }
}}*/

for( int i=0;i<z;i++){//laz es lo que se quiere imprimir pero lo dejate que imprima todo
    
    if(FINAL[i].length()>5&& i+1!=z ){
      
 if(palabra[i]!=palabra[i+1]){
  System.out.println(FINAL[i]);
 }}

 }
}}