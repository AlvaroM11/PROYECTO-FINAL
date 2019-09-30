import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistroUsuariosComponent } from './usuarios/registro-usuarios/registro-usuarios.component';
import { ListaUsuariosComponent } from './usuarios/lista-usuarios/lista-usuarios.component';
import { ListaMovilComponent } from './usuarios/lista-movil/lista-movil.component';
import { ListaFacturaComponent } from './usuarios/lista-factura/lista-factura.component';
import { RegistroMovilComponent } from './usuarios/registro-movil/registro-movil.component';




@NgModule({
  declarations: [
    AppComponent,
    RegistroUsuariosComponent,
    ListaUsuariosComponent,
    ListaMovilComponent,
    ListaFacturaComponent,
    RegistroMovilComponent,

   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
