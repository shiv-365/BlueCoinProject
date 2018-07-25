import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
<<<<<<< HEAD
import { HomePage } from '../pages/block/home';
=======
>>>>>>> 9579f2fb69cc4c14932e53a8eab0ee8b02e128e4
import { HttpClientModule } from '@angular/common/http';
import { BlockService } from '../providers/block-service';
import { HomePage } from '../pages/home/home';
import { WalletPage } from '../pages/wallet/wallet';
import { TransactionPage } from '../pages/transaction/transaction';
import { TabsPage } from '../pages/tabs/tabs';
import { Tab4Page } from '../pages/tab4/tab4';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    WalletPage,
    TransactionPage,
    Tab4Page,
    TabsPage
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    WalletPage,
    TransactionPage,
    Tab4Page,
    TabsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    BlockService,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
