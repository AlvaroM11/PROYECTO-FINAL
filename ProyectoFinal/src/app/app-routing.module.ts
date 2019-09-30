import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListaFacturaComponent } from './usuarios/lista-factura/lista-factura.component';
import { ListaMovilComponent } from './usuarios/lista-movil/lista-movil.component';
import { ListaUsuariosComponent } from './usuarios/lista-usuarios/lista-usuarios.component';
import { RegistroUsuariosComponent } from './usuarios/registro-usuarios/registro-usuarios.component';
import { registroMovil } from './usuarios/registro-movil/registro-movil.component';







const routes: Routes = [
  { path: 'listafactura ', component: ListaFacturaComponent },
  { path: 'listamovil', component: ListaMovilComponent  },
  { path: 'Listausuarios', component: ListaUsuariosComponent},
  { path: 'regitrousuario', component: RegistroUsuariosComponent },
  { path: 'registromovil', component: registroMovil },

 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
