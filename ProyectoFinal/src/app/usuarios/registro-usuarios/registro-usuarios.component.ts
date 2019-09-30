import { Component, OnInit } from '@angular/core';
import { Movil } from '../models/movil';
import { RouterModule}     from "@angular/router";
import { ServicioService}    from "../servicio.service";
import { Persona } from '../models/usuario';


@Component({
  selector: 'app-registro-usuarios',
  templateUrl: './registro-usuarios.component.html',
  
  
})
export class RegistroUsuariosComponent implements OnInit {

  lineatelefonica:Movil=new Movil();

  constructor(private service:ServicioService,private router:RouterModule){}

  personas: Persona[];

  ngOnInit() {
    this.service.getPersona()
      .subscribe(data => {
        this.personas = data;
      });
  }
  
  persona:Persona=new Persona();
  Guardar(){
    this.service.createPersona(this.persona)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
    })
    console.log("paso por aca");
    
  
  }

 

}
