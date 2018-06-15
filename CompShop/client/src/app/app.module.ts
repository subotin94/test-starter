import { BrowserModule } from '@angular/platform-browser'
import { NgModule } from '@angular/core'
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'
import { RouterModule, Routes, } from '@angular/router'

import { AppComponent } from './app.component'
import { PageNotFoundComponent } from './page/page-not-found/page-not-found.component'
import { ItemsComponent } from './page/items/items.component'
import { ComponentItemService } from './service/component-item.service'
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component'

const appRoutes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'components', component: ItemsComponent},
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    ItemsComponent,
    HomeComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      {
        enableTracing: false
      }
    )
  ],
  providers: [
    ComponentItemService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }