import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { RouterModule ,Routes } from '@angular/router'
import { HttpClientModule } from  '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DownloadComponent } from './download/download.component';
import { PictureComponent } from './picture/picture.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { TutorialComponent } from './tutorial/tutorial.component';
import { AboutComponent } from './about/about.component';
import { DisclaimerComponent } from './disclaimer/disclaimer.component';


const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'tutorial',
    component: TutorialComponent
  },
  {
    path: 'about',
    component: AboutComponent
  },
  {
    path: 'disclaimer',
    component: DisclaimerComponent
  },
  {
    path: 'pictures',
    component: PictureComponent
  },
  {
    path: 'contacts',
    component: ContactComponent
  },
  {
    path: 'downloads',
    component: DownloadComponent
  },
  { path: '**', component: HomeComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    PictureComponent,
    HeaderComponent,
    FooterComponent,
    DownloadComponent,
    ContactComponent,
    HomeComponent,
    TutorialComponent,
    AboutComponent,
    DisclaimerComponent
  ],
  imports: [
    BrowserModule , HttpClientModule, FormsModule , RouterModule.forRoot(appRoutes , { enableTracing: true } // <-- debugging purposes only)
    )],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
