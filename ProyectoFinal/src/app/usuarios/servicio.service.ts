import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http" ;
import { Persona } from './models/usuario';
import { Movil } from './models/movil';
import { Plan } from './models/linea';



const httpOption={
  headers:new HttpHeaders({'Content-type': 'application/jason'})
}

@Injectable({
  providedIn: 'root'
})
export class ServicioService {
  createlinea(arg0: this) {
    throw new Error("Method not implemented.");
  }

  private httpHeaders=new HttpHeaders({'Content-Type':'application/json'})
  constructor( private http:HttpClient ) {
    console.log("service on ");

   }

   url="http://localhost:8080/final-proyecto/servicio/PruebaFinal/registrarPersona";
   url2="http://localhost:8080/final-proyecto/servicio/PruebaFinal/id"
   url3="http://localhost:8080/final-proyecto/servicio/lineaMovil/registrarEquipo";
   url4="http://localhost:8080/final-proyecto/servicio/lineaMovil/numerolinea";
   url5="http://localhost:8080/final-proyecto/servicio/linea/registrar";
   url6="http://localhost:8080/final-proyecto/servicio/linea/id";


   createPersona(Persona:Persona){
     return this.http.post<Persona[]>(this.url,Persona)
   }
   getPersona(){
     return this.http.get<Persona[]>(this.url2)
   }

   createMovil(Movil:Movil){
     return this.http.post<Movil[]>(this.url3,Movil)
   }
   getMovil(){
     return this.http.get<Movil[]>(this.url4)
   }

   createPlan(Plan:Plan){
     return this.http.post<Plan[]>(this.url5,Plan)
   }
   getPlan(){
     return this.http.get<Plan[]>(this.url6)
   }

}
