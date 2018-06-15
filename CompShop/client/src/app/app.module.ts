import { BrowserModule } from '@angular/platform-browser'
import { NgModule } from '@angular/core'
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http'
import { RouterModule, Routes, } from '@angular/router'

import { AppComponent } from './app.component'
import { PageNotFoundComponent } from './page/page-not-found/page-not-found.component'
import { ItemsComponent } from './page/items/items.component'
import { ComponentItemService } from './service/component-item.service'
import { FormsModule } from '@angular/forms'

const appRoutes: Routes = [
  {path: 'components', component: ItemsComponent},
  {path: '**', component: PageNotFoundComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    ItemsComponent
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